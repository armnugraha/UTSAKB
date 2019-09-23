package com.unikom.utsakb14karman10116916;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/*
 * Created_at : 30-04-2019
 * NIM : 10116916
 * Nama : Arman Nugraha
 * Kelas : AKB14K
 */
public class Register extends AppCompatActivity {

    public static final String ID_EXTRA_MSG = "com.unikom.utsakb14karman10116916";
    public static final String ID_EXTRA_MSG2 = "com.unikom.utsakb14karman10116916";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onClickRegister(View view) {
        EditText setTextName = (EditText)findViewById(R.id.editTextName);
        EditText setTextUmur = (EditText)findViewById(R.id.editTextUmur);

        String getTextName = setTextName.getText().toString();
        String getTextUmur = setTextName.getText().toString();

        Intent intent = new Intent(this, Home.class);
        intent.putExtra(ID_EXTRA_MSG, getTextName);
        intent.putExtra(ID_EXTRA_MSG2, getTextUmur);
        startActivity(intent);
    }
}
