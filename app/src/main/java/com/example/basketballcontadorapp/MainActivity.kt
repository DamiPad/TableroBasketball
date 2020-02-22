package com.example.basketballcontadorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity(), OnClickListener{

    var TableroA:Int = 0
    var TableroB:Int = 0

    private fun limpiar() {
        marcadorA.text = "0"
        marcadorB.text = "0"
        TableroA = 0
        TableroB = 0
    }

    private fun sumarA(i: Int) {
        TableroA += i
        marcadorA.text = TableroA.toString()
    }

    private fun sumarB(i: Int) {
        TableroB += i
        marcadorB.text = TableroB.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTresA.setOnClickListener(this)
        buttonDosA.setOnClickListener(this)
        buttonLibreA.setOnClickListener(this)

        buttonTresB.setOnClickListener(this)
        buttonDosB.setOnClickListener(this)
        buttonLibreB.setOnClickListener(this)

        limpiar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonTresA->sumarA(3)
            R.id.buttonDosA->sumarA(2)
            R.id.buttonLibreA->sumarA(1)
            R.id.buttonTresB->sumarB(3)
            R.id.buttonDosB->sumarB(2)
            R.id.buttonLibreB->sumarB(1)
            R.id.limpiar->limpiar()
        }
    }


}

