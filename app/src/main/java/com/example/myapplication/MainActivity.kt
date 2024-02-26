package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes()
        sentenciaIf()
    }
    private fun variablesYConstantes(){
        var name = "Antua :D"
        println(name)
        name = "Now is Paolo"
        println(name)

    }
    private fun sentenciaIf(){
        val edad = 9
        if (edad<10){
            println("No puedes pasar")
        }else{
            println("Bienvenido")
        }
    }
}