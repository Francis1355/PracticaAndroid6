package com.example.francisco.practicaandroid6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText PA1, PA2,PA3,PA4,PB1,PB2,PB3,PB4;
    private TextView Inp, Desc,inppy;
    private Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PA1 = (EditText)findViewById(R.id.editText);
        PA2 = (EditText)findViewById(R.id.editText2);
        PA3 = (EditText)findViewById(R.id.editText3);
        PA4 = (EditText)findViewById(R.id.editText4);
        PB1 = (EditText)findViewById(R.id.PLAb1);
        PB2 = (EditText)findViewById(R.id.PLAb2);
        PB3 = (EditText)findViewById(R.id.PLAb3);
        PB4 = (EditText)findViewById(R.id.ePLAb4);
        inppy = (TextView)findViewById(R.id.inpy);
        btnCal = (Button)findViewById(R.id.btn1);



        btnCal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String a1 = PA1.getText().toString();
                String a2 = PA2.getText().toString();
                String a3 = PA3.getText().toString();
                String a4 = PA4.getText().toString();
                String b1 = PB1.getText().toString();
                String b2 = PB2.getText().toString();
                String b3 = PB3.getText().toString();
                String b4 = PB4.getText().toString();


                double pa1 = Double.parseDouble(a1);
                double pa2 = Double.parseDouble(a2);
                double pa3 = Double.parseDouble(a3);
                double pa4 = Double.parseDouble(a4);
                double pb1 = Double.parseDouble(b1);
                double pb2 = Double.parseDouble(b2);
                double pb3 = Double.parseDouble(b3);
                double pb4 = Double.parseDouble(b4);

                double ppa = (0.20*pa1) + (0.20*pa2) + (0.25*pa3) + (0.35*pa4);
                double ppb = (0.20*pb1) + (0.20*pb2) + (0.25*pb3) + (0.35*pb4);

                double py = (70 - (0.30*ppa) - (0.35*ppb)) / 0.35;


                    String  cpy= "";
                    cpy = "Tu calificacion final es de: "
                            + String.format("%8.2f",py) + "";

                    inppy.setText(cpy);


            }
        });
    }
}
