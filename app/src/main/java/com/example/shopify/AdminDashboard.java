package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        Button addproduct = findViewById(R.id.addProductBtn);
        addproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new AddProduct());
            }
        });

        Button customerDetailsBtn = findViewById(R.id.customerDetailsBtn);
        customerDetailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new CustomerDetails());
            }
        });

        Button paymentBtn = findViewById(R.id.paymentBtn);
        paymentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Payment());
            }
        });

        Button adminMsgBtn = findViewById(R.id.msgBtn);
        adminMsgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new AdminMessages());
            }
        });

        Button settingsBtn = findViewById(R.id.settingsBtn);
        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iAdminSettingsPage = new Intent(getApplicationContext(), AdminSettings.class);
                startActivity(iAdminSettingsPage);
            }
        });

        Button superAdminMsg = findViewById(R.id.msgSuperAdminBtn);
        superAdminMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSuperAdminMsg = new Intent(getApplicationContext(), SuperAdminMsg.class);
                startActivity(iSuperAdminMsg);

            }
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.adminDashboardFragment, fragment);
        ft.setReorderingAllowed(true);
        ft.commit();
    }
}