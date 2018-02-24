package soexample.umeng.com.tentcentbugly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tencent.bugly.beta.Beta;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CrashReport";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Crash(View view) {
//        CrashReport.testJavaCrash();
        int a = 10/0;
    }

    public void Update(View view) {
        /**
         参数1：isManual 用户手动点击检查，非用户点击操作请传false

         参数2：isSilence 是否显示弹窗等交互，[true:没有弹窗和toast] [false:有弹窗或toast]
         */
        Beta.checkUpgrade(false,false);
    }

    public void Jump(View view) {
        startActivity(new Intent(MainActivity.this, TinkerActivity.class));
    }
}
