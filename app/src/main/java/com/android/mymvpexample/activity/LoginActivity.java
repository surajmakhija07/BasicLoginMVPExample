package com.android.mymvpexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.widget.Toast;

import com.android.mymvpexample.R;
import com.android.mymvpexample.presenter.LoginPresenter;
import com.android.mymvpexample.view.LoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginView {

    @BindView(R.id.editEmail)
    AppCompatEditText editTextEmail;
    @BindView(R.id.editPassword)
    AppCompatEditText editTextPassword;

    private LoginPresenter mLoginPresenter;

    @OnClick(R.id.buttonLogin)
    void login() {
        mLoginPresenter.login(editTextEmail.getText().toString(), editTextPassword.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        mLoginPresenter = new LoginPresenter(this);
        mLoginPresenter.onCreate();
    }

    @Override
    public void isLoginSuccessful(boolean isLoginSuccessful) {
        if (isLoginSuccessful) {
            Toast.makeText(this, R.string.str_login_successful, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void setErrorMessage(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }
}
