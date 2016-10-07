package com.android.mymvpexample.presenter;

import android.text.TextUtils;

import com.android.mymvpexample.activity.LoginActivity;
import com.android.mymvpexample.view.LoginView;

/**
 * Created by comp-1 on 29/9/16.
 */

public class LoginPresenter {

    LoginView mLoginView;

    public LoginPresenter(LoginActivity loginActivity) {
        this.mLoginView = loginActivity;
    }

    public void onCreate() {
        // initialization
    }

    public void login(String email, String password) {
        if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)) {
            if (email.equals("suraj") && password.equals("suraj")) {
                mLoginView.isLoginSuccessful(true);
            } else {
                mLoginView.setErrorMessage("Invalid email and/or password");
            }
        } else {
            mLoginView.setErrorMessage("Please enter email and/or password");
        }
    }
}
