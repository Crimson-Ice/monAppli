package com.example.monappli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView monText;
    private int monResultat;
    private EditText monEntreeUser;


    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monText = findViewById(R.id.myText);
        myButton = findViewById(R.id.myButton);
        monEntreeUser = findViewById(R.id.editText);

        giveCalcul(monText);

        myButton.setOnClickListener((v)->{
            Integer result = giveCalcul(monText);

            System.out.println(result.toString());
            System.out.println(monEntreeUser.getText().toString());

            if(result.toString().equals(monEntreeUser.getText().toString())){
                Toast.makeText(MainActivity.this, "Bien joué", Toast.LENGTH_LONG).show();

            }else{
                Toast.makeText(MainActivity.this, "Dommage", Toast.LENGTH_LONG).show();
            }
        });
    }

    private Integer giveCalcul(TextView monText){

        int min= 0;
        int max= 10;
        Integer a = (int) (Math.random() * ( max - min ));
        Integer b = (int) (Math.random() * ( max - min ));
        Integer res = 0;
        List<Character> mesOperandes = List.of('+','-','*','/'); //La liste des opérandes disponibles
        Character monOperande = mesOperandes.get(new Random().nextInt(mesOperandes.size()-1)); //Get un random parmi cette liste.

        switch (monOperande){
            case '+':
                res = a+b;
                break;
            case '-':
                res = a-b;
                break;
            case '*':
                res = a*b;
                break;
            case '/':
                res = a/b;
                break;
            default:
                System.out.println("Erreur");
                break;
        }
        monText.setText(""+a + monOperande + b);
        return res;
    }

    @Override
    public void onClick(View v) {

    }
}