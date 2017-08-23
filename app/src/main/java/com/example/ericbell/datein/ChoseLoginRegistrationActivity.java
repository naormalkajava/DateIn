package com.example.ericbell.datein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class ChoseLoginRegistrationActivity extends AppCompatActivity {
    private Button mLogin;
    private Button mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_login_registration);

        mLogin = (Button) findViewById(R.id.login);
        mRegister = (Button) findViewById(R.id.register);
       //click on login button
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ChoseLoginRegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
                return;

            }
        });
        //click on register buttun
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoseLoginRegistrationActivity.this,RegistrationActivity.class);
                startActivity(intent);
                finish();
                return;

            }
        });
    }
}
