package com.karamjit.mytoaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.karamjit.mytoasty.ImageView;
import com.karamjit.mytoasty.ShowToaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView;
        ShowToaster.showToaster();
    }
}