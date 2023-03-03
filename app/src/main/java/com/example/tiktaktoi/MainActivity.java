package com.example.tiktaktoi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int count = 0;
    int flag  = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
    }

    public void check(View view){
        Button btn_current = (Button) view;
        if (btn_current.getText().toString().equals(""))
        {
            count++;

            if (flag == 0)
            {
                btn_current.setText("X");
                flag = 1;
            }else {
                btn_current.setText("O");
                flag = 0;
            }
            b1= btn1.getText().toString();
            b2= btn2.getText().toString();
            b3= btn3.getText().toString();
            b4= btn4.getText().toString();
            b5= btn5.getText().toString();
            b6= btn6.getText().toString();
            b7= btn7.getText().toString();
            b8= btn8.getText().toString();
            b9= btn9.getText().toString();

            if (count>4)
            {
                if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                    Toast.makeText(this,"Winner is : "+b1,Toast.LENGTH_LONG).show();
                    newGame();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                    Toast.makeText(this,"Winner is : "+b4,Toast.LENGTH_LONG).show();
                    newGame();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this,"Winner is : "+b7,Toast.LENGTH_LONG).show();
                    newGame();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this,"Winner is : "+b1,Toast.LENGTH_LONG).show();
                    newGame();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this,"Winner is : "+b2,Toast.LENGTH_LONG).show();
                    newGame();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this,"Winner is : "+b3,Toast.LENGTH_LONG).show();
                    newGame();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this,"Winner is : "+b1,Toast.LENGTH_LONG).show();
                    newGame();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this,"Winner is : "+b3,Toast.LENGTH_LONG).show();
                    newGame();
                } else if (count == 9) {
                    Toast.makeText(this, "Match Is Drawn", Toast.LENGTH_SHORT).show();
                    newGame();
                }
            }

        }
    }

    public void newGame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag  = 0;
    }
}