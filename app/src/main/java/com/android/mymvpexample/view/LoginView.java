package com.android.mymvpexample.view;

/**
 * Created by comp-1 on 29/9/16.
 */

public interface LoginView {

    void isLoginSuccessful(boolean isLoginSuccessful);

    void setErrorMessage(String errorMessage);
}
