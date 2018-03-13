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

public class Fragment_SignUp extends Fragment {

    @BindView(R.id.edt_user_name_signup)
    EditText edtUserName_SignUp;
    @BindView(R.id.edt_email_signup)
    EditText edtEmail_SignUp;
    @BindView(R.id.edt_password_signup)
    EditText edtPassword_SignUp;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
