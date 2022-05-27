package com.example.numbertowords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rand = java.util.Random().nextInt(999999999)
        var numberToWords = NumberToWords(number = rand)
        println("TEXT: ${numberToWords.numberAsWords} NUMBER: $rand")
    }
}