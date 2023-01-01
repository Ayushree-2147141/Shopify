package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserSignupPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup_page);
    }

    public void displayDashboardPage(View view) {
        Intent iDashboardPage = new Intent(this, UserDashboard.class);
        startActivity(iDashboardPage);
    }
}