package com.dbcourse.wine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private ImageButton searchBtn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        searchBtn = (ImageButton)findViewById(R.id.arrow);
        searchBtn.setOnClickListener(new MyOnclickListener());


        //jump to wine_list
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this,WineActivity.class);
                startActivity(it);

            }
        });


    }


    private class MyOnclickListener implements View.OnClickListener {

         @Override
         public void onClick(View v) {
             EditText editText = (EditText)findViewById(R.id.search);
             String my_string = new String();
             my_string = editText.getText().toString();
             if(TextUtils.isEmpty(my_string))
             {
                Toast.makeText(MainActivity.this, "請輸入您的條件", Toast.LENGTH_LONG).show();
             }
             else{
                //todo 跳轉至搜索頁面
             }
         }
    }
}


