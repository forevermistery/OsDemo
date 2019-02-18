package com.example.administrator.osdemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.osdemo.blog.BlogActivity;
import com.example.administrator.osdemo.details.detailsActivity;
import com.example.administrator.osdemo.login.LoginActivity;
import com.example.administrator.osdemo.oschina.StringUtils;
import com.itheima.loopviewpager.LoopViewPager;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.L;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import org.itheima.recycler.adapter.BaseLoadMoreRecyclerAdapter;
import org.itheima.recycler.header.RecyclerViewHeader;
import org.itheima.recycler.listener.ItemClickSupport;
import org.itheima.recycler.viewholder.BaseRecyclerViewHolder;
import org.itheima.recycler.widget.ItheimaRecyclerView;
import org.itheima.recycler.widget.PullToLoadMoreRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import okhttp3.Headers;
import retrofit2.Call;

/**
 * api:"https://www.oschina.net/action/apiv2/news?pageToken="
 * 网络请求:https://github.com/open-android/RetrofitUtils
 * Recycler适配器:https://github.com/open-android/BaseRecyclerAndAdapter
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    PullToLoadMoreRecyclerView pullToLoadMoreRecyclerView;
    private ItheimaRecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private LoopViewPager mloopViewPager;//轮播 url:"https://www.oschina.net/action/apiv2/banner?catalog=1"
    private int state = 0;
    private static final int STATE_REFRESH = 1;
    private static final int STATE_MORE = 2;
    private String nextPageToken = "";
    private NewsBean mNewsBean;
    ArrayList<NewsBean.ResultBean.ItemsBean> itemEntities = new ArrayList<>();//接收下一页的数据集合

    private Button btn_home;
    private Button btn_blog;
    private Button btn_c;
    private LinearLayout main_body;
    private TextView bottom_bar_text_1;
    private ImageView bottom_bar_image_1;
    private RelativeLayout bottom_bar_1_btn;
    private TextView bottom_bar_text_2;
    private ImageView bottom_bar_image_2;
    private RelativeLayout bottom_bar_2_btn;
    private TextView bottom_bar_text_3;
    private ImageView bottom_bar_image_3;
    private RelativeLayout bottom_bar_3_btn;
    private LinearLayout main_bottom_bar;
    private ItheimaRecyclerView recycler_view;
    private LoopViewPager lvp_pager;
    private RecyclerViewHeader recycler_header;
    private SwipeRefreshLayout swipe_refresh_layout;
    private RelativeLayout rl_change_one_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();//初始化布局
        initTitleBarView();//初始titlebar组件
        looperPager();//轮播
        initBanner();//加载轮播图
        //设定默认首页
        setSelectStatus(0);
//        getSupportFragmentManager().beginTransaction().replace(R.id.main_body,new MainFragment()).commit();


        RecyclerViewHeader header = (RecyclerViewHeader) findViewById(R.id.recycler_header);
        ItheimaRecyclerView recyclerView = (ItheimaRecyclerView) findViewById(R.id.recycler_view);
        header.attachTo(recyclerView);

        ItemClickSupport itemClickSupport = new ItemClickSupport(mRecyclerView);
/**
 * 点击事件
 */
        itemClickSupport.setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                int id = itemEntities.get(position).getId();
                Intent intent = new Intent(MainActivity.this, detailsActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
//                Toast.makeText(recyclerView.getContext(), "我被点击了", Toast.LENGTH_SHORT).show();
            }
        });

/**
 * 下拉加载和数据解析
 */
        pullToLoadMoreRecyclerView = new PullToLoadMoreRecyclerView<NewsBean>(mSwipeRefreshLayout, mRecyclerView, MyRecyclerViewHolder.class) {
            @Override
            public int getItemResId() {
                //recylerview item资源id
                return R.layout.item_list_news;
            }

            @Override
            public String getApi() {
                String url = "action/apiv2/news?pageToken=";
                switch (state) {
                    case STATE_REFRESH:
                        break;
                    case STATE_MORE:
                        nextPageToken = mNewsBean.getResult().getNextPageToken();
                        url += MainActivity.this.nextPageToken;
                        break;
                }
                //接口
                return url;
            }

            //            是否加载更多的数据，根据业务逻辑自行判断，true表示有更多的数据，false表示没有更多的数据，如果不需要监听可以不重写该方法
            @Override
            public boolean isMoreData(BaseLoadMoreRecyclerAdapter.LoadMoreViewHolder holder) {
                System.out.println("isMoreData" + holder);
                state = STATE_MORE;
                return true;
            }
        };
        pullToLoadMoreRecyclerView.setLoadingDataListener(new PullToLoadMoreRecyclerView.LoadingDataListener<NewsBean>() {

            @Override
            public void onRefresh() {
                state = STATE_REFRESH;
                //监听下啦刷新，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onRefresh");
            }

            @Override
            public void onStart() {
                //监听http请求开始，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onStart");
            }

            @Override
            public void onSuccess(NewsBean newsBean, Headers headers) {
                //监听http请求成功，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onSuccess: " + newsBean);


                mNewsBean = newsBean;
                //加载成功后 处理第二页的数据  20+20
                List<NewsBean.ResultBean.ItemsBean> itemDatas = newsBean.getResult().getItems();

                for (NewsBean.ResultBean.ItemsBean itemData : itemDatas) {
                    itemEntities.add(itemData);
                }

            }

            @Override
            public void onFailure() {
                //监听http请求失败，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onFailure");
            }
        });
        //开始请求
        pullToLoadMoreRecyclerView.requestData();
    }

    /**
     * 初始化底部导航栏
     */

    private void initTitleBarView() {
        main_body = (LinearLayout) findViewById(R.id.main_body);
        bottom_bar_text_1 = (TextView) findViewById(R.id.bottom_bar_text_1);
        bottom_bar_image_1 = (ImageView) findViewById(R.id.bottom_bar_image_1);
        bottom_bar_1_btn = (RelativeLayout) findViewById(R.id.bottom_bar_1_btn);

        bottom_bar_text_2 = (TextView) findViewById(R.id.bottom_bar_text_2);
        bottom_bar_image_2 = (ImageView) findViewById(R.id.bottom_bar_image_2);
        bottom_bar_2_btn = (RelativeLayout) findViewById(R.id.bottom_bar_2_btn);

        bottom_bar_text_3 = (TextView) findViewById(R.id.bottom_bar_text_3);
        bottom_bar_image_3 = (ImageView) findViewById(R.id.bottom_bar_image_3);
        bottom_bar_3_btn = (RelativeLayout) findViewById(R.id.bottom_bar_3_btn);

        main_bottom_bar = (LinearLayout) findViewById(R.id.main_bottom_bar);
        rl_change_one_fragment = (RelativeLayout) findViewById(R.id.rl_change_one_fragment);
        //监听
        bottom_bar_1_btn.setOnClickListener(this);
        bottom_bar_2_btn.setOnClickListener(this);
        bottom_bar_3_btn.setOnClickListener(this);
        rl_change_one_fragment.setOnClickListener(this);
    }

    /**
     * 控制点击底部导航栏状态
     * @param index
     */
    private void setSelectStatus(int index) {
        switch (index){
            case 0:
                //图片点击选择变换图片，颜色的改变，其他变为原来的颜色，并保持原有的图片
                bottom_bar_image_1.setImageResource(R.drawable.tag_selected);
                bottom_bar_text_1.setTextColor(Color.parseColor("#0097F7"));
                //其他的文本颜色不变
                bottom_bar_text_2.setTextColor(Color.parseColor("#666666"));
                bottom_bar_text_3.setTextColor(Color.parseColor("#666666"));
                //图片也不变
                bottom_bar_image_2.setImageResource(R.drawable.user);
                bottom_bar_image_3.setImageResource(R.drawable.tag);
                break;
            case 1://同理如上
                //图片点击选择变换图片，颜色的改变，其他变为原来的颜色，并保持原有的图片
                bottom_bar_image_1.setImageResource(R.drawable.tag);
                bottom_bar_text_1.setTextColor(Color.parseColor("#666666"));
                //其他的文本颜色不变
                bottom_bar_text_2.setTextColor(Color.parseColor("#0097F7"));
                bottom_bar_text_3.setTextColor(Color.parseColor("#666666"));
                //图片也不变
                bottom_bar_image_2.setImageResource(R.drawable.user_selected);
                bottom_bar_image_3.setImageResource(R.drawable.tag);
                break;
            case 2://同理如上
                //图片点击选择变换图片，颜色的改变，其他变为原来的颜色，并保持原有的图片
                bottom_bar_image_1.setImageResource(R.drawable.tag);
                bottom_bar_text_1.setTextColor(Color.parseColor("#666666"));
                //其他的文本颜色不变
                bottom_bar_text_2.setTextColor(Color.parseColor("#666666"));
                bottom_bar_text_3.setTextColor(Color.parseColor("#0097F7"));
                //图片也不变
                bottom_bar_image_2.setImageResource(R.drawable.user);
                bottom_bar_image_3.setImageResource(R.drawable.tag_selected);
                break;

        }
    }

    /**
     * fragment切换
     */



    /**
     * 加载轮播
     */

    private void initBanner() {
        Request request = ItheimaHttp.newGetRequest("action/apiv2/banner?catalog=1");//apiUrl格式："xxx/xxxxx"
        Call call = ItheimaHttp.send(request, new HttpResponseListener<BannerBean>() {
            @Override
            public void onResponse(BannerBean bannerBean, Headers headers) {

                List<String> imageList = new ArrayList<>();//新建image集合
                List<String> titleList = new ArrayList<>();//新建title集合
                List<BannerBean.ResultBean.ItemsBean> itemdata = bannerBean.getItemDatas();
                for (int i = 0; i < itemdata.size(); i++) {
                    imageList.add(itemdata.get(i).getImg());//往里面添加
                    titleList.add(itemdata.get(i).getName());

                    mloopViewPager.setImgData(imageList);
                    mloopViewPager.setTitleData(titleList);
                    mloopViewPager.start();
                }

            }
        });
    }

    /**
     * 轮播模块
     */

    private void looperPager() {
        mloopViewPager = (LoopViewPager) findViewById(R.id.lvp_pager);
//        mloopViewPager.setImgData(DataFactory.imgListString());
//        mloopViewPager.setTitleData(DataFactory.titleListString());
        //mloopViewPager.start();
    }

    private void initView() {
        mRecyclerView = (ItheimaRecyclerView) findViewById(R.id.recycler_view);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);


        btn_home = (Button) findViewById(R.id.btn_home);
        btn_home.setOnClickListener(this);
        btn_blog = (Button) findViewById(R.id.btn_blog);
        btn_blog.setOnClickListener(this);
        btn_c = (Button) findViewById(R.id.btn_c);
        btn_c.setOnClickListener(this);

    }

    /**
     * 顶部点击事件
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_home:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btn_blog:
                Intent intent2 = new Intent(this, BlogActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.btn_c:

                break;
            case R.id.bottom_bar_1_btn:
                setSelectStatus(0);
                break;
            case R.id.bottom_bar_2_btn:
                setSelectStatus(1);
                Intent it2=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(it2);
                break;
            case R.id.bottom_bar_3_btn:
                setSelectStatus(2);
                break;
        }
    }

    /**
     * 数据绑定
     */
    public static class MyRecyclerViewHolder extends BaseRecyclerViewHolder<NewsBean.ResultBean.ItemsBean> {

        //换成你布局文件中的id
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.xiangqing)
        TextView xiangqing;
        @BindView(R.id.date)
        TextView date;
        //        @BindView(R.id.img_tag)
//        TextView img_tag;
        @BindView(R.id.date_before)
        TextView date_before;

        @BindView(R.id.numberOf)
        TextView numberOf;
        @BindView(R.id.date_and_number)
        LinearLayout dateAndNumber;


        public MyRecyclerViewHolder(ViewGroup parentView, int itemResId) {
            super(parentView, itemResId);

        }

        /**
         * 绑定数据的方法，在mData获取数据（mData声明在基类中）
         */
        @SuppressLint("ResourceType")
        @Override
        public void onBindRealData() {
            title.setText(mData.getTitle());
            xiangqing.setText(mData.getBody());
            date.setText(mData.getAuthor());
            date_before.setText(StringUtils.friendly_time3(mData.getPubDate()));
            numberOf.setText(mData.getCommentCount() + "");
//            img_tag.setBackgroundResource(R.id.img_tag);

        }


        /**
         * 给按钮添加点击事件（button改成你要添加点击事件的id）
         *
         * @param v
         */
//        @OnClick(R.id.swipe_refresh_layout)
//        public void click(View v) {
//        }
    }
}
