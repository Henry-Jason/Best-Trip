package com.example.anhtuan.myapplication.view;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.anhtuan.myapplication.R;
import com.example.anhtuan.myapplication.adapter.Fragment_Login;
import com.example.anhtuan.myapplication.adapter.Fragment_SignUp;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DangNhap extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_login)
    TextView tvLogin;
    @BindView(R.id.tv_singup)
    TextView tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        ButterKnife.bind(this);

        tvLogin.setOnClickListener(this);
        tvSignUp.setOnClickListener(this);

        replaceFragmentContent(new Fragment_Login());
    }

    private void replaceFragmentContent(Fragment fragment) {
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.rl_input_dangnhap, fragment);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void onClick(View v) {
        if (v == tvLogin) {
            tvLogin.setTextColor(Color.WHITE);
            tvSignUp.setTextColor(Color.parseColor("#b5b5b7"));
            replaceFragmentContent(new Fragment_Login());
        } else if (v == tvSignUp) {
            tvSignUp.setTextColor(Color.WHITE);
            tvLogin.setTextColor(Color.parseColor("#b5b5b7"));
            replaceFragmentContent(new Fragment_SignUp());
        }
    }
}
