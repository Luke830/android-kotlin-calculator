package com.dvisagie.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      // fullCalculationTextView = findViewById(R.id.fullCalculationText) as TextView
    }

    val operationList: MutableList<String> = arrayListOf()
    val numberCache: MutableList<String> = arrayListOf()


    //I couldn't find mkString.. so I improvised
    fun makeString(list: List<String>,joiner: String = "") : String {

        if (list.isEmpty()) return ""
        return list.reduce { r, s -> r + joiner + s }
    }

    fun updateDisplay(){

        val fullCalculationString = makeString(operationList, " ")
        var fullCalculationTextView = findViewById(R.id.fullCalculationText) as TextView

        fullCalculationTextView.text = fullCalculationString

//        val currentCalculation = makeString(numberCache)
//        val textView = findViewById(R.id.textView) as TextView
//        textView.text = currentCalculation
    }

    fun clearClick(view: View) {
        numberCache.clear()
        operationList.clear()
        updateDisplay();
    }

    fun equalsClick(view: View) {
        operationList.add(makeString(numberCache))
        numberCache.clear()

        val calculator = StringCalculator()
        val answer = calculator.calculate(operationList)


        val textView = findViewById(R.id.textView) as TextView
        textView.text = "=" + answer.toString()
        updateDisplay()
    }

    fun buttonClick(view: View) {

        val button = view as Button

        operationList.add(makeString(numberCache))
        numberCache.clear()
        operationList.add(button.text.toString())

        val textView = findViewById(R.id.textView) as TextView
        textView.text = ""
        updateDisplay()
    }

    fun numberClick(view: View) {
        val button = view as Button
        val numberString = button.text;

        numberCache.add(numberString.toString())
        val text = makeString(numberCache);
        val textView = findViewById(R.id.textView) as TextView
        textView.text = text;
        updateDisplay()
    }

}
