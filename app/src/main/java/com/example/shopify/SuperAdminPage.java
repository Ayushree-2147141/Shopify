package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuperAdminPage extends AppCompatActivity {

    Button userDetailsBtn, userStatusBtn, msgAdminBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_admin_page);

        userDetailsBtn = findViewById(R.id.userDetailsBtn);
        userDetailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new CustomerDetails());
            }
        });

        msgAdminBtn = findViewById(R.id.messageAdminBtn);
        msgAdminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new ChatFragment());
            }
        });

        userStatusBtn = findViewById(R.id.blockReleaseBtn);
        userStatusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iblockRelease = new Intent(getApplicationContext(), AdminSettings.class);
                startActivity(iblockRelease);
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.superAdminFragment, fragment);
        ft.setReorderingAllowed(true);
        ft.commit();
    }

}