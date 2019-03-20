package com.example.aula01

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnCadastrar)

        val cidades = arrayOf("Blumenau", "Indaial")

        val spinnerCidade = findViewById<Spinner>(R.id.cidade)

        val adpter = ArrayAdapter(this,
            android.R.layout.simple_spinner_dropdown_item, cidades)

        spinnerCidade.adapter = adpter


        btn.setOnClickListener{
            val edNome = findViewById<TextView>(R.id.editNome)



            Toast.makeText(this@MainActivity,
                "Olá ${edNome.text} da cidade ${spinnerCidade.selectedItem}",
                Toast.LENGTH_SHORT).show()

            edNome.requestFocus()
            edNome.text = edNome.text.reversed()

            val progresso = findViewById<ProgressBar>(R.id.progresso)
            progresso.incrementProgressBy(10)


        }
    }
}
