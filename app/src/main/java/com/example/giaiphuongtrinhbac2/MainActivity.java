package com.example.giaiphuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Ketqua;
    EditText nhapa ,nhapb ,nhapc ;
    Button tinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nhapa=findViewById(R.id.editText_nhapa);
        nhapb=findViewById(R.id.editText_nhapb);
        nhapc=findViewById(R.id.editText_nhapc);
        Ketqua=findViewById(R.id.textView_ketqua);
        tinh=findViewById(R.id.button_tinh);
        tinh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(nhapa.getText().toString());
                float b=Float.parseFloat(nhapb.getText().toString());
                float c=Float.parseFloat(nhapc.getText().toString());

                GiaiPhuongTrinhBac2 tinh=new GiaiPhuongTrinhBac2();

                if (tinh.GiaiPhuongTrinh(a,b,c)==-1)
                    Ketqua.setText("Phuong trinh vo nghiem");
                if (tinh.GiaiPhuongTrinh(a,b,c)==3)
                    Ketqua.setText("Phuong trinh 2 nghiem:"+tinh.getX1()+"va"+tinh.getX2());
                if(tinh.GiaiPhuongTrinh(a,b,c)==4)
                    Ketqua.setText("Phuong co nghiem kep"+tinh.getX1());
                if (tinh.GiaiPhuongTrinh(a,c,b)==2);
                    Ketqua.setText("Phuong Trinh co 1 nghiem:"+tinh.getX());
                if(tinh.GiaiPhuongTrinh(a,c,b)==1)
                    Ketqua.setText("Phuong trinh vo so nghiem");
            }
        });

    }
}
