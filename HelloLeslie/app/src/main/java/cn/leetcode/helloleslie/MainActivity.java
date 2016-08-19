package cn.leetcode.helloleslie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cn.leetcode.helloleslie.HelloLeslie;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView objHelloTextView = (TextView) findViewById(R.id.helloTextView);
        HelloLeslie objHelloLeslie = new HelloLeslie();
        String hello = objHelloLeslie.sayHello();
        objHelloTextView.setText("DEBUG: lazy binding libLeslie.so... then try to calling sayHello\n\r" + hello);
    }
}
