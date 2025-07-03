package com.example.bmicalculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pesoEditText = findViewById<EditText>(R.id.pesoEditText)
        val altezzaEditText = findViewById<EditText>(R.id.altezzaEditText)
        val calcolaButton = findViewById<Button>(R.id.calcolaButton)
        val risultatoTextView = findViewById<TextView>(R.id.risultatoTextView)

        calcolaButton.setOnClickListener{
            val peso = pesoEditText.text.toString().toDoubleOrNull()
            val altezzaCm = altezzaEditText.text.toString().toDoubleOrNull()

            if(peso != null && altezzaCm != null && altezzaCm > 0) {
                val altezzaM = altezzaCm / 100
                val bmi = peso / (altezzaM * altezzaM)
                val categoria = when {
                    bmi < 18.5 -> "Sottopeso"
                    bmi < 25 -> "Normopeso"
                    bmi < 30 -> "Sovrappeso"
                    else -> "Obesità"
                }
                risultatoTextView.text = "IMC: %.2f - %s".format(bmi, categoria)
            }else{
                risultatoTextView.text = "Inserisci valori validi."
            }
        }
    }
}