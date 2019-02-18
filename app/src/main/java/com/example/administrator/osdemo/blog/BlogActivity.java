package com.example.administrator.osdemo.blog;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.osdemo.MainActivity;
import com.example.administrator.osdemo.R;
import com.example.administrator.osdemo.oschina.StringUtils;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.L;

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

public class BlogActivity extends AppCompatActivity {
    private ItheimaRecyclerView mItheimaRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerViewHeader header;
    private RecyclerView mRecyclerView;
    private int state = 0;
    private String buttonTypeTitle="";
    int id=0;

    private static final int STATE_REFRESH = 1;
    private static final int STATE_MORE = 2;
    private  BlogBean mBlogBean;
    ArrayList<BlogBean.ResultBean.ItemsBean> itemEntities = new ArrayList<>();//接收下一页的数据集合
    PullToLoadMoreRecyclerView pullToLoadMoreRecyclerView;

    //传参

//    Intent intentType=new Intent(BlogActivity.this,BlogDetails.class);
    String url = "action/apiv2/blog?catalog=3&nextpageToken=";



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);


         header = (RecyclerViewHeader) findViewById(R.id.recycler_header);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        header.attachTo(mRecyclerView);

        //按钮改变时改变内容
        RadioButtonChecked();
        //开始网络请求
        pullToLoadMoreRecyclerView.requestData();
        itemClick();


        pullToLoadMoreRecyclerView.setLoadingDataListener(new PullToLoadMoreRecyclerView.LoadingDataListener<BlogBean>() {

            @Override
            public void onRefresh() {
                //监听下啦刷新，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onRefresh");
            }

            @Override
            public void onStart() {
                //监听http请求开始，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onStart");
            }

            @Override
            public void onSuccess(BlogBean mblogBean , Headers headers) {
                //监听http请求成功，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onSuccess: " + mblogBean);
                mBlogBean=mblogBean;
                List<BlogBean.ResultBean.ItemsBean> itemsData = mblogBean.getResult().getItems();
                for (BlogBean.ResultBean.ItemsBean itemDatas : itemsData) {
                    itemEntities.add(itemDatas);
                }
            }

            @Override
            public void onFailure() {
                //监听http请求失败，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onFailure");
            }
        });

    }

    private void itemClick() {
        ItemClickSupport itemClickSupport = new ItemClickSupport(mRecyclerView);
//点击事件
        itemClickSupport.setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                 id = itemEntities.get(position).getId();
                Intent intent = new Intent(BlogActivity.this, BlogDetails.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });

    }


    private void initDatas() {
        mSwipeRefreshLayout = findViewById(R.id.swipe_refresh_layout);
        mItheimaRecyclerView = findViewById(R.id.recycler_view);
        pullToLoadMoreRecyclerView = new PullToLoadMoreRecyclerView<BlogBean>(mSwipeRefreshLayout, mItheimaRecyclerView, BlogActivity.MyRecyclerViewHolder.class) {
            @Override
            public int getItemResId() {
                //recylerview item资源id
                return R.layout.item_list_blog;
            }

            @Override
            public String getApi() {
                //接口


                return url;

            }

            //是否加载更多的数据，根据业务逻辑自行判断，true表示有更多的数据，false表示没有更多的数据，如果不需要监听可以不重写该方法
            @Override
            public boolean isMoreData(BaseLoadMoreRecyclerAdapter.LoadMoreViewHolder holder) {
                System.out.println("isMoreData" + holder);
                return true;
            }
        };
        pullToLoadMoreRecyclerView.requestData();
    }

    public static class MyRecyclerViewHolder extends BaseRecyclerViewHolder<BlogBean.ResultBean.ItemsBean> {
        //换成你布局文件中的id 绑定
        @BindView(R.id.blog_title)
        TextView blogTitle;
        @BindView(R.id.blog_img_and_text)
        RelativeLayout blogImgAndText;
        @BindView(R.id.blog_xiangqing)
        TextView blogXiangqing;
        @BindView(R.id.blog_Author)
        TextView blogAuthor;
        @BindView(R.id.blog_date_before)
        TextView blogDateBefore;
        @BindView(R.id.blog_numberOf)
        TextView blogNumberOf;
        @BindView(R.id.date_and_number)
        LinearLayout dateAndNumber;



        public MyRecyclerViewHolder(ViewGroup parentView, int itemResId) {
            super(parentView, itemResId);
        }

        /**
         * 绑定数据的方法，在mData获取数据（mData声明在基类中）
         */
        @Override
        public void onBindRealData() {
            blogTitle.setText(mData.getTitle());
            blogXiangqing.setText(mData.getBody());
            blogAuthor.setText(mData.getAuthor());
            blogDateBefore.setText(StringUtils.formatSomeAgo(mData.getPubDate()));
            blogNumberOf.setText(mData.getCommentCount()+"");


        }


        /**
         * 给按钮添加点击事件（button改成你要添加点击事件的id）
         * @param v
         */
//        @OnClick(R.id.button)
//        public void click(View v) {
//        }
    }
    private void RadioButtonChecked() {
        RadioGroup mRadioGroup=findViewById(R.id.rg_radioGroup);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId){
                    case R.id.rb_lastest_recommand:

                        url = "action/apiv2/blog?catalog=3&nextpageToken=";

                        break;
                    case R.id.rb_lastest_blog:

                        url = "action/apiv2/blog?catalog=1&nextpageToken=";

//
                        break;
                    case R.id.rb_week_hot:
                        url = "action/apiv2/blog?catalog=2&nextpageToken=";

                        break;
                }
                ItheimaHttp.init(BlogActivity.this, url);
                initDatas();
            }
        });

        initDatas();


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(BlogActivity.this,MainActivity.class));
        Toast.makeText(BlogActivity.this,"返回上一级",Toast.LENGTH_LONG).show();
    }
}
