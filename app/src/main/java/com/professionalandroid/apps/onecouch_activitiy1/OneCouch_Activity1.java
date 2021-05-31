package com.professionalandroid.apps.onecouch_activitiy1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class OneCouch_Activity1 extends AppCompatActivity {
    Button next_id;
    EditText et1_name;
    EditText et2_tall;
    EditText et3_act;
    ImageButton btn1_id;
    ImageButton btn2_id;
    ImageButton btn3_id;
    String name;
    int tall;
    int act;
    double cal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1_id = findViewById(R.id.btn1_id);
        btn1_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OneCouch_Activity1.this, "이름 저장 완료!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn2_id = findViewById(R.id.btn2_id);
        btn2_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OneCouch_Activity1.this, "숫자만 입력했다면 저장 완료!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn3_id = findViewById(R.id.btn3_id);
        btn3_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OneCouch_Activity1.this, "모두 완료했으면 다음 버튼으로!",
                        Toast.LENGTH_SHORT).show();
            }
        });


        et1_name = findViewById(R.id.et1_name);
        et2_tall = findViewById(R.id.et2_tall);
        et3_act = findViewById(R.id.et3_act);


        next_id = findViewById(R.id.next_id);
        next_id.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OneCouch_Activity1.this, OneCouch_Activity2.class);
                tall = Integer.parseInt(et2_tall.getText().toString());
                act = Integer.parseInt(et3_act.getText().toString());
                name = et1_name.getText().toString();
                cal = ((tall-100) * 0.9)*act;
                String recal = String.format("%.2f", cal);
                intent.putExtra("cal", recal);
                intent.putExtra("name", name);

                startActivity(intent);//다음 화면 이동
            }
        });
    }
}