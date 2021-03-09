package com.fithe.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.nhn.android.naverlogin.OAuthLogin;

import com.fithe.login.loginandroid.R;

public class logoutActivity extends AppCompatActivity {
    Button logoutBtn,logoutBtn1;
    private FirebaseAuth mAuth;
    private static Context mContext;
    private static OAuthLogin mOAuthLoginInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        logoutBtn = (Button)findViewById(R.id.logout_btn);
        logoutBtn1 = (Button)findViewById(R.id.login_btn1);
        mAuth = FirebaseAuth.getInstance();

        mContext = this;
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signOut();
            }
        });

        logoutBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mOAuthLoginInstance = OAuthLogin.getInstance();
                    mOAuthLoginInstance.logout(mContext);
                    signOut1();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });



    }

    //구글 로그아웃
    private void signOut(){
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    //네이버 로그아웃
    private void signOut1(){
        final Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}