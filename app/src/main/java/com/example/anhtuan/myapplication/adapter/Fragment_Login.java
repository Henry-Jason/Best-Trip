package com.example.anhtuan.myapplication.adapter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.anhtuan.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Fragment_Login extends Fragment {

    @BindView(R.id.edt_email_login)
    EditText edtEmail_Login;
    @BindView(R.id.edt_password_login)
    EditText edtPassword_Login;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
