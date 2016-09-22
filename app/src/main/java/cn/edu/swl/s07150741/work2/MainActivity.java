package cn.edu.swl.s07150741.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() called with: " + "savedInstanceState = [" + savedInstanceState + "]");
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.d(TAG, "onStart() called with: " + "开始");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d(TAG, "onResume() called with: " + "");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "被挡住了");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"停止");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "销毁");
        super.onDestroy();
    }
}
