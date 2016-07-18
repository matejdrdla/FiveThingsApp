package cz.drdla.matej.fivethingsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        mainMenu();
    }

    public void mainMenu() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "nevim", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getApplicationContext(), PageOne.class);
                startActivity(intent1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "nevim", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(getApplicationContext(), PageTwo.class);
                startActivity(intent2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "nevim", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(getApplicationContext(), PageThree.class);
                startActivity(intent3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "nevim", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(getApplicationContext(), PageFour.class);
                startActivity(intent4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "nevim", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(getApplicationContext(), PageFive.class);
                startActivity(intent5);
            }
        });
    }
}
