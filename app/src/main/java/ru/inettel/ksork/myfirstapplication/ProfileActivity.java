package ru.inettel.ksork.myfirstapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.widget.TextView;

/**
 * Created by k on 07.02.18.
 */

public class ProfileActivity extends AppCompatActivity {
    public static String USER_KEY = "USER_KEY";

    private AppCompatImageView mPhoto;
    private TextView mLogin;
    private TextView mPassword;

    private void onClickPhoto(){
        //
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_profile);

        mPhoto = findViewById(R.id.ivPhoto);
        mLogin = findViewById(R.id.tvEmail);
        mPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();
        User user = (User) bundle.get(USER_KEY);

        mLogin.setText(user.getLogin());
        mPassword.setText(user.getPassword());

    }
}
