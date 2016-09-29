package com.example.tanti.tugas1;

import android.content.Intent;
import android.net.Uri;
import android.provider.Contacts;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnFB, btnGmail, btnTwitter, btnLogin,btnRegister;
    EditText user, pass;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFB = (Button)findViewById(R.id.btnFacebook);
        btnGmail= (Button)findViewById(R.id.btnGmail);
        btnTwitter= (Button)findViewById(R.id.btnTwitter);
        btnLogin=(Button)findViewById(R.id.BtnLogin);
        btnRegister=(Button)findViewById(R.id.BtnRegister);
        user = (EditText)findViewById(R.id.EdUsername) ;
        pass = (EditText)findViewById(R.id.EdPassword) ;

        btnFB.setOnClickListener(this);
        btnGmail.setOnClickListener(this);
        btnTwitter.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);


            }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnFacebook:
                Uri uriFB = Uri.parse("http://www.facebook.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,uriFB);
                startActivity(intent);
                break;

            case R.id.btnGmail:
                Uri uriGM = Uri.parse("http://www.gmail.com");
                Intent intent2 = new Intent(Intent.ACTION_VIEW,uriGM);
                startActivity(intent2);


                break;
            case R.id.btnTwitter:
                Uri uriTW = Uri.parse("http://www.twitter.com");
                Intent intent3 = new Intent(Intent.ACTION_VIEW,uriTW);
                startActivity(intent3);


                break;
            case R.id.BtnLogin:
                if (user.getText().toString().equals("admin") && pass.getText().toString().equals("1234"))
                {
                    Toast.makeText(getApplicationContext(),"Selamat Anda Berhasil Login",Toast.LENGTH_LONG).show();
                    Intent log = new Intent(this,LoginBerhasil.class);
                    startActivity(log);

                    user.setText("");
                    pass.setText("");

                }else
                {
                    Toast.makeText(getApplicationContext(),"Mohon Maaf Anda Gagal Login",Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.BtnRegister:

                Intent reg = new Intent(this,Register.class);
                startActivity(reg);
                finish();


                break;
            default:
        }


    }
}

