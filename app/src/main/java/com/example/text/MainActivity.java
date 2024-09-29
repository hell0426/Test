package com.example.text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
//    implements View.OnClickListener
//    private Button btn,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
//        btn=findViewById(R.id.btn);
//        btn2=findViewById(R.id.btn2);
//        btn3=findViewById(R.id.btn3);
//        //三，接口
//        btn3.setOnClickListener(this);
//        //二，匿名内部类
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                btn2.setText("2被点击了");
//            }
//        });
    }
    //click方法
//    public void click(View view) {
//    btn.setText("被点击了");
//    }
//    //三
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.btn3:
//                btn3.setText("3点击了");
//                break;
//        }
//    }
}