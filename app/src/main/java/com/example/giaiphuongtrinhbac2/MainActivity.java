package com.example.giaiphuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView Ketqua;
    EditText nhapa ,nhapb ,nhapc ;
    Button tinh,thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nhapa=findViewById(R.id.editText_nhapa);
        nhapb=findViewById(R.id.editText_nhapb);
        nhapc=findViewById(R.id.editText_nhapc);
        Ketqua=findViewById(R.id.textView_ketqua);
        tinh=findViewById(R.id.button_tinh);
        thoat=findViewById(R.id.button_thoat);
        tinh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(nhapa.getText().toString().trim());
                float b=Float.parseFloat(nhapb.getText().toString().trim());
                float c=Float.parseFloat(nhapc.getText().toString().trim());

                GiaiPhuongTrinhBac2 tinh=new GiaiPhuongTrinhBac2(a,b,c);
                Ketqua.setText(tinh.tinhtoan());

            }
        });
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Good bye:Nguyễn Ngô Nhựt Nam ",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}
