package ru.inettel.ksork.myfirstapplication;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AuthActivity extends AppCompatActivity {

    private EditText mLogin;
    private EditText mPassword;
    private Button mEnter;
    private Button mRegister;

    private void onClickBntEnter(){
        if (isLoginValid() && isPasswordValid()) {
            // Вход
        } else {
            showMessage(R.string.login_input_error);
        }
    }

    private void onClickBtnRegister(){
        // Регистрация
    }

    private boolean isLoginValid(){
        return !TextUtils.isEmpty(mLogin.getText())
                && Patterns.EMAIL_ADDRESS.matcher(mLogin.getText()).matches();
    }

    private boolean isPasswordValid(){
        return !TextUtils.isEmpty(mPassword.getText());
    }

    private void showMessage(@StringRes int str){
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_auth);

        mLogin = findViewById(R.id.etLogin);
        mPassword = findViewById(R.id.etPassword);
        mEnter = findViewById(R.id.btnEnter);
        mRegister = findViewById(R.id.btnRegister);

        mEnter.setOnClickListener(view -> onClickBntEnter());
        mRegister.setOnClickListener(view -> onClickBtnRegister());
    }
}
