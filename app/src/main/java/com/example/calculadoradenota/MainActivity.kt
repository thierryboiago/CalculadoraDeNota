package com.example.calculadoradenota

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalcular.setOnClickListener{
            val nota1 = Integer.parseInt(edtNota1.text.toString())
            val nota2 = Integer.parseInt(edtNota2.text.toString())
            val media = (nota1+nota2)/2
            val faltas = Integer.parseInt(edtFaltas.text.toString())

            if(media >=6 && faltas<=10){
                txtResultado.setTextColor(Color.GREEN)
                txtResultado.text = "Aluno foi Aprovado \nNotaFinal: $media \nFaltas: $faltas"
            }else{
                txtResultado.setTextColor(Color.RED)
                txtResultado.text = "Aluno foi Reprovado \nNotaFinal: $media \nFaltas: $faltas"
            }

        }
    }
}