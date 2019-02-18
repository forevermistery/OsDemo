package com.example.administrator.osdemo.blog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.osdemo.R;
import com.example.administrator.osdemo.details.detailCommentBean;
import com.example.administrator.osdemo.details.detailsBean;
import com.example.administrator.osdemo.oschina.FloorView;
import com.example.administrator.osdemo.oschina.NoScrollWebView;
import com.example.administrator.osdemo.oschina.StringUtils;
import com.example.administrator.osdemo.oschina.TweetTextView;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;
import com.itheima.roundedimageview.RoundedImageView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Headers;
import retrofit2.Call;

public class BlogDetails extends AppCompatActivity {
    @BindView(R.id.tv_detail_title)
    TextView tvDetailTitle;
    @BindView(R.id.tv_detail_time)
    TextView tvDetailTime;
    @BindView(R.id.ll_text)
    LinearLayout llText;
    @BindView(R.id.mll_detail_app)
    LinearLayout mllDetailApp;
    @BindView(R.id.mll_detail_recommand)
    LinearLayout mllDetailRecommand;
    @BindView(R.id.web_view)
    NoScrollWebView webView;
    @BindView(R.id.sw_scrollView)
    ScrollView swScrollView;
    @BindView(R.id.new_detail_comment_layout)
    LinearLayout newDetailCommentLayout;
    @BindView(R.id.can_change_text)
    TextView can_change_tx;
    //- - - -  - - - - - - - -  --  分隔符
    private FloorView ly_refer;
    private TweetTextView tv_content;
    private ImageView iv_best_answer;
    private ImageView btn_comment;
    private TextView tv_pub_date;
    private TextView tv_name;
    private RoundedImageView iv_avatar;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
         int id = intent.getIntExtra("id", 0);

        setContentView(R.layout.item_detail_fragment);
        System.out.println("id========"+id);

        ButterKnife.bind(this);



        Request request = ItheimaHttp.newGetRequest("action/apiv2/blog?id=" + id);//apiUrl格式："xxx/xxxxx"
        Call call = ItheimaHttp.send(request, new HttpResponseListener<detailsBean>() {

            @Override
            public void onResponse(detailsBean bean, Headers headers) {
                //webView.loadData(htmlData, "text/html; charset=UTF-8", null);x

                /**
                 * 使用webview加载数据是使用loadDataWithBaseURL(null, data, "text/html","utf-8", "")方法
                 */
                //wv.loadDataWithBaseURL(null, data, "text/html","utf-8", "");√
                tvDetailTitle.setText(bean.getResult().getTitle());
                tvDetailTime.setText(StringUtils.friendly_time3(bean.getResult().getPubDate()));

                //加载webview
                webView.loadDataWithBaseURL(null, bean.getResult().getBody(), "text/html", "UTF-8", "");

                System.out.println("error???????????");
                //相关软件=<没效果
//                List<detailsBean.ResultBean.AboutsBean> abouts=bean.getResult().getAbouts(1);
////                View view=View.inflate(detailsActivity.this,R.layout.item_about_safe,null);
////                TextView textView=findViewById(R.id.tv_item_about_safe_name);
////                textView.setText(abouts.get(0).getTitle());
////                mllDetailApp.addView(view);
////                System.out.println("error-------------");

            }

        });
//        request = ItheimaHttp.newGetRequest("action/apiv2/news?id=" + id);//apiUrl格式："xxx/xxxxx"
//        call = ItheimaHttp.send(request, new HttpResponseListener<detailsBean>() {
//            @Override
//            public void onResponse(detailsBean bean, Headers headers) {
//                can_change_tx.setText(bean.getResult().getTitle());
//
//
//                List<detailsBean.ResultBean.AboutsBean> abouts = bean.getResult().getAbouts(id);
//
//                if (abouts.size() > 0 || abouts != null) {
//                    for (int i = 0; i < abouts.size(); i++) {
//                        View view = View.inflate(detailsActivity.this, R.layout.item_about_safe, null);
//                        TextView textView = findViewById(R.id.tv_item_about_safe_name);
//                        textView.setText(abouts.get(0).getTitle());
//                        mllDetailApp.addView(view);
//                        System.out.println("error-------------");
//                    }
//                }
//            }
//            /**
//             * 可以不重写失败回调
//             * @param call
//             * @param e
//             */
//
//        });
        request = ItheimaHttp.newGetRequest("action/apiv2/comment?parts=refer,reply&sourceId=" + id + "&type=6");//apiUrl格式："xxx/xxxxx"
        call = ItheimaHttp.send(request, new HttpResponseListener<detailCommentBean>() {
            @Override
            public void onResponse(detailCommentBean bean, Headers headers) {
                List<detailCommentBean.ResultBean.ItemsBean> items = bean.getResult().getItems();
                System.out.println("items.size=--------"+items.size());

//                for (int i = 0; i < items.size(); i++) {
                System.out.println("pass on ~~~~~~~~~~~~~~~~~~~~");

                LayoutInflater inflater = BlogDetails.this.getLayoutInflater();
                v = inflater.inflate(R.layout.lay_comment_item_ex, null);


//                    View view = View.inflate(detailsActivity.this, R.layout.lay_comment_item_ex, null);
                ly_refer = v.findViewById(R.id.ly_refer);
                tv_content = v.findViewById(R.id.tv_content);
                iv_best_answer = v.findViewById(R.id.iv_best_answer);
                btn_comment = v.findViewById(R.id.btn_comment);
                tv_pub_date = v.findViewById(R.id.tv_pub_date);
                tv_name = v.findViewById(R.id.tv_name);
                iv_avatar = v.findViewById(R.id.iv_avatar);

                Glide.with(BlogDetails.this).load(items.get(1).getAuthorPortrait()).into(iv_avatar);
                tv_name.setText(items.get(1).getAuthor());
                tv_pub_date.setText(items.get(1).getPubDate());
                newDetailCommentLayout.addView(v);
                System.out.println("pass off ~~~~~~~~~~~~~~~~~~~~");

            }
//            }


        });

    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        webView.clearCache(true);
//    }
}

