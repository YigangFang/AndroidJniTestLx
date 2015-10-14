package lx.com.androidjnitest2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import lx.com.androidjnitest2.ndk.NdkTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NdkTest ndkTest = new NdkTest();

        ((TextView) findViewById(R.id.tv_content)).setText(ndkTest.ndkSayHello());
    }
}
