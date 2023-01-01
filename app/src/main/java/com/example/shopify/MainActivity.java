package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openUserPanel(View view) {
        Intent iUser = new Intent(this, UserPage.class);
        startActivity(iUser);
    }

    public void openAdminPanel(View view) {
        Intent iAdmin = new Intent(this, AdminPage.class);
        startActivity(iAdmin);
    }

    public void openSuperAdminPanel(View view) {
        Intent iSuperAdmin = new Intent(this, SuperAdminPage.class);
        startActivity(iSuperAdmin);
    }
}