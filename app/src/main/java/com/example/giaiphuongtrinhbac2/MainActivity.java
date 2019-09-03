package com.example.giaiphuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Ketqua;
    EditText a ,b ,c ;
    Button tinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.editText_nhapa);
        b=findViewById(R.id.editText_nhapb);
        c=findViewById(R.id.editText_nhapc);
        Ketqua=findViewById(R.id.textView_ketqua);
        tinh=findViewById(R.id.button_tinh);
        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
