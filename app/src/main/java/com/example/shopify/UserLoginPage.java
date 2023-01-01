package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserLoginPage extends AppCompatActivity {
    EditText username;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login_page);

        username = findViewById(R.id.username);




    }

    public void backToUserPage(View view) {
        Intent iUserPage = new Intent(this, UserPage.class);
        startActivity(iUserPage);
    }

    public void userDashboardPage(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Logged in successfully!",Toast.LENGTH_SHORT);
        toast.show();

        Intent iUserDashboard = new Intent(this, UserDashboard.class);
        startActivity(iUserDashboard);



    }
}