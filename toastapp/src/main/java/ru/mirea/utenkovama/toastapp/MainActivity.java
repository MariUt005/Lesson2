package ru.mirea.utenkovama.toastapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextStudent;

    public void onClickNewActivity(View view) {
        editTextStudent = (EditText) findViewById(R.id.editText);
        String Text123 = editTextStudent.getText().toString();
        String a = String.valueOf(Text123.length());


        Toast toast = Toast.makeText(getApplicationContext(),
                "Студент №24 группа БИСО-01-21 Количество символов - " + a,
                Toast.LENGTH_SHORT);
        toast.show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}