package com.hanso.youtubeexampletutorial;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hanso.youtubeexampletutorial.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    private void initViews() {
        binding.btnComprobar.setOnClickListener(v -> {
            String texto = binding.edtNombre.getText().toString();
            if (!TextUtils.isEmpty(texto)) {
                if (binding.switchVacaciones.isChecked()) {
                    if (texto.equals("Fernando"))
                        Toast.makeText(this, "Eres apto para vacaciones", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(this, "No eres apto para vacaciones", Toast.LENGTH_SHORT).show();
                } else {
                    if (texto.equals("Ernesto")) {
                        Toast.makeText(this, texto + "Eres un empleado de la compañía", Toast.LENGTH_SHORT).show();
                    } else if (texto.equals("Rocko")) {
                        Toast.makeText(this, texto + "Eres un empleado de la compañía", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "No eres un empleado de la compañía", Toast.LENGTH_SHORT).show();
                    }
                }
            } else {
                Toast.makeText(this, "Completa tu nombre", Toast.LENGTH_SHORT).show();
            }
        });

        binding.switchVacaciones.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                Toast.makeText(this, "Activado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Desactivado", Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnSumar.setOnClickListener(v -> {
            if (!TextUtils.isEmpty(binding.edtPrimerNum.getText()) && !TextUtils.isEmpty(binding.edtSegundoNum.getText())) {
                int primerNum = Integer.parseInt(binding.edtPrimerNum.getText().toString());
                int segundoNum = Integer.parseInt(binding.edtSegundoNum.getText().toString());
                int resultado = primerNum + segundoNum;

                binding.txtResult.setText(new StringBuilder("El resultado es: ")
                        .append(resultado));
            } else {
                Toast.makeText(this, "Coloca los números", Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnRestar.setOnClickListener(v -> {
            if (!TextUtils.isEmpty(binding.edtPrimerNum.getText()) && !TextUtils.isEmpty(binding.edtSegundoNum.getText())) {
                int primerNum = Integer.parseInt(binding.edtPrimerNum.getText().toString());
                int segundoNum = Integer.parseInt(binding.edtSegundoNum.getText().toString());
                int resultado = primerNum - segundoNum;

                binding.txtResult.setText(new StringBuilder("El resultado es: ")
                        .append(resultado));
            } else {
                Toast.makeText(this, "Coloca los números", Toast.LENGTH_SHORT).show();
            }
        });
    }
}