package application;

import android.app.Application;

import com.itheima.retrofitutils.ItheimaHttp;

public class osChinaApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ItheimaHttp.init(this, "https://www.oschina.net/");
    }
}
