package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class bmiCalculatorActivity : AppCompatActivity() {
    lateinit var btnCalculate:Button
    lateinit var etWeight:EditText
    lateinit var etHeight:EditText
    lateinit var tvBmi:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
        btnCalculate=findViewById(R.id.btnCalculate)
        etWeight=findViewById(R.id.etWeight)
        etHeight=findViewById(R.id.etHeight)
        tvBmi=findViewById(R.id.tvBmi)
        btnCalculate.setOnClickListener {
            var weight=etWeight.text.toString().toDouble()
            var height=etHeight.text.toString().toInt()
            calculateBmi(weight, height)
        }
    }

    fun calculateBmi(weight:Double,height:Int){
        var heightmetres= height/100
        var bmi=weight/(heightmetres*heightmetres)
        tvBmi.text=bmi.toString()
    }
}
