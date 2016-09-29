package com.example.tanti.tugas1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by tanti on 29/09/16.
 */
public class Register extends AppCompatActivity implements View.OnClickListener {
Button btnCancel , btnSave;
    EditText user,pass,email,hp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_register);

        btnCancel= (Button)findViewById(R.id.BtnCancel);
        btnSave= (Button)findViewById(R.id.BtnSave);

        user = (EditText)findViewById(R.id.edtUsername);
        pass = (EditText)findViewById(R.id.edtPassword);
        email = (EditText)findViewById(R.id.edtEmail);
        hp = (EditText)findViewById(R.id.edtHandphone);



        btnCancel.setOnClickListener(this);
        btnSave.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.BtnCancel:
                Intent back = new Intent(this,MainActivity.class);
                startActivity(back);
                break;


            case R.id.BtnSave:
                user.setText("");
                pass.setText("");
                email.setText("");
                hp.setText("");
                Toast.makeText(getApplicationContext(),"Selamat anda berhasil mendaftar",Toast.LENGTH_LONG).show();

                break;
            default:
        }
    }
}
