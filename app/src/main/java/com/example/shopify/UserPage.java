package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);
    }

    public void LoginPage(View view) {
        Intent iUserLogin = new Intent(this, UserLoginPage.class);
        startActivity(iUserLogin);
    }

    public void SignUpPage(View view) {
        Intent iUserSignup = new Intent(this, UserSignupPage.class);
        startActivity(iUserSignup);
    }

    public void backToMainPage(View view) {
        Intent iMainPage = new Intent(this, MainActivity.class);
        startActivity(iMainPage);
    }
}