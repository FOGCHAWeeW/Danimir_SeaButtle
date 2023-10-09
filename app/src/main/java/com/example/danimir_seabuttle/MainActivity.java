package com.example.danimir_seabuttle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText enemy;
    EditText size;
    EditText ships;
    EditText choice;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enemy =findViewById(R.id.enemy);
        size =findViewById(R.id.size);
        ships =findViewById(R.id.ships);
        choice =findViewById(R.id.choice);
        error =findViewById(R.id.error);
    }
    public void check(View view) {
        boolean сorect = true;
        Intent intent = new Intent(MainActivity.this, SizeActivity.class);
        if (Integer.parseInt(String.valueOf(enemy.getText())) <= 10 && Integer.parseInt(String.valueOf(enemy.getText())) != 0) {
            intent.putExtra("Enemy", Integer.parseInt(String.valueOf(enemy.getText())));
            сorect = true;
        } else {
            сorect = false;
        }
        if (Integer.parseInt(String.valueOf(size.getText())) >= 10 && Integer.parseInt(String.valueOf(size.getText())) <= 28) {
            intent.putExtra("Size", Integer.parseInt(String.valueOf(size.getText())));
            сorect = true;
        } else {
            сorect = false;
        }
        if (Integer.parseInt(String.valueOf(choice.getText())) == 0 && Integer.parseInt(String.valueOf(choice.getText())) == 1) {
            intent.putExtra("Size", Integer.parseInt(String.valueOf(choice.getText())));
            сorect = true;
        } else {
            сorect = false;
        }
        if (Integer.parseInt(String.valueOf(ships.getText())) == 1 || Integer.parseInt(String.valueOf(ships.getText())) == 0) {
            intent.putExtra("Ships", Integer.parseInt(String.valueOf(ships.getText())));
            сorect = true;
        } else {
            сorect = false;
        }
        if (сorect) {
            startActivity(intent);
        } else {
            error.setText("Что-то не так");
        }
    }
}