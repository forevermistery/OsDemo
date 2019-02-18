package com.example.administrator.osdemo.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.osdemo.R;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import okhttp3.Headers;
import retrofit2.Call;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener  {

    ImageView imageView;
    TextView textView;
    Button btn_sign_in;
    EditText et_username;
    EditText et_password;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        btn_sign_in=findViewById(R.id.btn_sign_in);
        btn_sign_in.setOnClickListener(this);
        et_username=findViewById(R.id.et_username);
        et_password=findViewById(R.id.et_password);
        imageView.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            public void onSwipeTop() {
            }

            public void onSwipeRight() {
                if (count == 0) {
                    imageView.setImageResource(R.drawable.good_night_img);
                    textView.setText("Night");
                    count = 1;
                } else {
                    imageView.setImageResource(R.drawable.good_morning_img);
                    textView.setText("Morning");
                    count = 0;
                }
            }

            public void onSwipeLeft() {
                if (count == 0) {
                    imageView.setImageResource(R.drawable.good_night_img);
                    textView.setText("Night");
                    count = 1;
                } else {
                    imageView.setImageResource(R.drawable.good_morning_img);
                    textView.setText("Morning");
                    count = 0;
                }
            }

            public void onSwipeBottom() {
            }

        });



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sign_in:
            Request request = ItheimaHttp.newGetRequest("action/apiv2/login_validate");//apiUrl格式："xxx/xxxxx"
            request.putParams("keep_login", 1)
                    .putParams("username", et_username.getText())
                    .putParams("pwd", et_password.getText());
            Call call = ItheimaHttp.send(request, new HttpResponseListener<String>() {
                @Override
                public void onResponse(String s, Headers headers) {
                    System.out.println(s);
                    Toast.makeText(getApplicationContext(),s, Toast.LENGTH_LONG).show();
                    }
                    });
                break;
        }
    }
}
