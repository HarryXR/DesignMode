package com.harry.design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.harry.design.strate.bean.Duck;
import com.harry.design.strate.bean.MallardDuck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }
}
