package com.example.parcial1prograiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ejercicio1()
        ejercicio2()
        ejercicio3()
    }

    private fun ejercicio1(){
        val color1 = "rojo"
        val color2 = "azul"
        val color3 = "amarillo"
        val color4 = "negro"
        val color5 = "blanco"

        if (color1 == color2){
        println("El color es azul")
        }else if (color1 == color3){
            println("El color es amarillo")
        }else if (color1==color4){
            println("El color es negro")
        }else if (color1 == color5){
            println("El color es negro")
        }else{
            println("El color es rojo")
        }
    }

    private fun ejercicio2(){
        val tipoDeComida ="pupusas"
        when (tipoDeComida){
            "pupusas","quesadillas","Tamales"->{
                println("Son originarias de El Salvador")
            }
            "Hamburguesas", "Hot Dog"->{
                println("Las Hamburguesas son originarias de EEUU")
            }
            "Pizza", "Lasaña"->{
                println("Es originaria de Italia")
            }
            "Tacos","Pozole"->{
                println("Son originarias de Mexico")
            }
            "Baleadas","Catrachitas"->{
                println("Las Baleadas son originarias de Honduras")
            }
        }

    }
    private fun ejercicio3(){
        var x = 30

        for(numero in 0..x) {
            println(numero)
        }
        for(numero in 0..x step 2){  println(numero)
        }
        for(numero in x downTo 0){
            println(numero)
        }
        for(numero in x downTo 0 step 3){
            println(numero)
        }
    }

}