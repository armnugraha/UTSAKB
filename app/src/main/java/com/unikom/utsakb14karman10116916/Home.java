package com.unikom.utsakb14karman10116916;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;
import android.widget.TextView;

/*
 * Created_at : 30-04-2019
 * NIM : 10116916
 * Nama : Arman Nugraha
 * Kelas : AKB14K
 */
public class Home extends AppCompatActivity {

    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvName = findViewById(R.id.tvWelcome);

        String name = getIntent().getStringExtra(Register.ID_EXTRA_MSG);
        String umur = getIntent().getStringExtra(Register.ID_EXTRA_MSG2);

        String text = name + umur +" tahun Berhasil Ditambahkan.";
        tvName.setText(text);
    }
}
