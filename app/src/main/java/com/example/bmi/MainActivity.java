package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.FloatEvaluator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Hight,Weight;

    Button Calculate;
    TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float We = Float.parseFloat(Weight.getText().toString());
                Float Hi = Float.parseFloat(Hight.getText().toString());

                float total = We / ((Hi/100)*(Hi/100));

                Answer.setText(""+total);
            }
        });

    }
    void binding(){
        Hight=findViewById(R.id.edttxtbm);
        Weight=findViewById(R.id.edttxmb);
        Calculate=findViewById(R.id.btnclcu);
        Answer=findViewById(R.id.txtvew);
    }
}