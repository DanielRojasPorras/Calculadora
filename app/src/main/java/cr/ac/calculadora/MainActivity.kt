package cr.ac.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    var texto : TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView)//obtiene el textView

        //Boton de borrar "C"
        val buttonC : Button = findViewById(R.id.buttonC)
        buttonC.setOnClickListener{buttonCClick()}

        //        Boton de porcentaje "%"
        val buttonPorcentaje : Button = findViewById(R.id.buttonPorcentaje)
        buttonPorcentaje.setOnClickListener{buttonPorcentajeClick()}

        //        Boton de divide "/"
        val buttonDivide : Button = findViewById(R.id.buttonDivide)
        buttonDivide.setOnClickListener{buttonDivideClick()}

        //        Boton 7
        val button7 : Button = findViewById(R.id.button7)
        button7.setOnClickListener{button7Click()}

        //        Boton 8
        val button8 : Button = findViewById(R.id.button8)
        button8.setOnClickListener{button8Click()}

        //        Boton 9
        val button9 : Button = findViewById(R.id.button9)
        button9.setOnClickListener{button9Click()}

        //        Boton x
        val buttonMultiplicacion : Button = findViewById(R.id.buttonMultiplicacion)
        buttonMultiplicacion.setOnClickListener{buttonMultiplicacionClick()}

        //        Boton 4
        val button4 : Button = findViewById(R.id.button4)
        button4.setOnClickListener{button4Click()}

        //        Boton 5
        val button5 : Button = findViewById(R.id.button5)
        button5.setOnClickListener{button5Click()}

        //        Boton 6
        val button6 : Button = findViewById(R.id.button6)
        button6.setOnClickListener{button6Click()}

        //        Boton -
        val buttonMenos : Button = findViewById(R.id.buttonMenos)
        buttonMenos.setOnClickListener{buttonMenosClick()}

        //        Boton 1
        val button1 : Button = findViewById(R.id.button1)
        button1.setOnClickListener{button1Click()}

        //        Boton 2
        val button2 : Button = findViewById(R.id.button2)
        button2.setOnClickListener{button2Click()}

        //        Boton 3
        val button3 : Button = findViewById(R.id.button3)
        button3.setOnClickListener{button3Click()}

        //        Boton +
        val buttonMas : Button = findViewById(R.id.buttonMas)
        buttonMas.setOnClickListener{buttonMasClick()}

        //        Boton 0
        val button0 : Button = findViewById(R.id.button0)
        button0.setOnClickListener{button0Click()}

        //        Boton .
        val buttonPunto : Button = findViewById(R.id.buttonPunto)
        buttonPunto.setOnClickListener{buttonPuntoClick()}

        //        Boton =
        val buttonIgual : Button = findViewById(R.id.buttonIgual)
        buttonIgual.setOnClickListener{buttonIgualClick()}

    }

    private fun buttonIgualClick() {
        val expression = Expression(texto?.text.toString())
        texto?.text = expression.calculate().toString()
    }

    private fun buttonPuntoClick() {
        texto?.setText(texto?.text.toString() + ".")
    }

    private fun button0Click() {
        if ( texto?.text == "0")  texto?.text = "0"
        else texto?.setText(texto?.text.toString() + "0")
    }

    private fun buttonMasClick() {
        texto?.setText(texto?.text.toString() + "+")
    }

    private fun button3Click() {
        if ( texto?.text == "0")  texto?.text = "3"
        else texto?.setText(texto?.text.toString() + "3")
    }

    private fun button2Click() {
        if ( texto?.text == "0")  texto?.text = "2"
        else texto?.setText(texto?.text.toString() + "2")
    }

    private fun button1Click() {
        if ( texto?.text == "0")  texto?.text = "1"
        else texto?.setText(texto?.text.toString() + "1")
    }

    private fun buttonMenosClick() {
        texto?.setText(texto?.text.toString() + "-")
    }

    private fun button6Click() {
        if ( texto?.text == "0")  texto?.text = "6"
        else texto?.setText(texto?.text.toString() + "6")
    }

    private fun button5Click() {
        if ( texto?.text == "0")  texto?.text = "5"
        else texto?.setText(texto?.text.toString() + "5")
    }

    private fun button4Click() {
        if ( texto?.text == "0")  texto?.text = "4"
        else texto?.setText(texto?.text.toString() + "4")
    }

    private fun buttonMultiplicacionClick() {
        texto?.setText(texto?.text.toString() + "*")
    }

    private fun button9Click() {
        if ( texto?.text == "0")  texto?.text = "9"
        else texto?.setText(texto?.text.toString() + "9")
    }

    private fun button8Click() {
        if ( texto?.text == "0")  texto?.text = "8"
        else texto?.setText(texto?.text.toString() + "8")
    }


    private fun buttonCClick() {
        texto?.text = "0"
    }
    private fun buttonPorcentajeClick() {
        texto?.setText(texto?.text.toString() + "%")
    }
    private fun buttonDivideClick() {
        texto?.setText(texto?.text.toString() + "/")
    }

    private fun button7Click() {
        if ( texto?.text == "0")  texto?.text = "7"
        else texto?.setText(texto?.text.toString() + "7")
    }


}