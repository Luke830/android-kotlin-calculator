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
    }

    val operationList: MutableList<String> = arrayListOf()
    val numberCache: MutableList<String> = arrayListOf()


    //I couldn't find mkString.. so I improvised
    fun makeString(list: List<String>,joiner: String = "") : String {
        return list.reduce { r, s -> r + joiner + s }
    }

    fun updateDisplay(){

        val t = findViewById(R.id.fullCalculationText) as TextView
        t.text = makeString(operationList, "")
    }

    fun buttonClick(view: View) {

        val button = view as Button

    }

    fun numberClick(view: View) {
        val button = view as Button
        val numberString = button.text;

        numberCache.add(numberString.toString())

        val textView = findViewById(R.id.textView) as TextView
        textView.text = numberString
        updateDisplay()
    }

}
