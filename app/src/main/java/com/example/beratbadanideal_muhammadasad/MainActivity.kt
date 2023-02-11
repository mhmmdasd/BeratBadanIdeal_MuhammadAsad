package com.example.beratbadanideal_muhammadasad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var Tinggi : EditText
    private lateinit var Hasil : TextView
    private lateinit var LakiLaki : RadioButton
    private lateinit var Perempuan : RadioButton
    private lateinit var proses : Button

    private var tb : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Tinggi = findViewById(R.id.etTinggi)
        Hasil = findViewById(R.id.hasil)
        LakiLaki = findViewById(R.id.rbLakilaki)
        Perempuan = findViewById(R.id.rbPerempuan)
        proses = findViewById(R.id.btnProses)

        proses.setOnClickListener {
            var tinggi = Tinggi.text.toString().toInt()

            if (LakiLaki.isChecked){
                tb = (tinggi - 100)-((tinggi - 100) * 10/100)
                Hasil.setText(tb.toString()+ "kg")

            }else{
                tb = (tinggi - 100)- ((tinggi - 100) * 15/100)
                Hasil.setText(tb.toString()+ "kg")
            }
        }

    }
}