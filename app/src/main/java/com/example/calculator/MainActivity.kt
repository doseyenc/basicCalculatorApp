package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var islem_text:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        islem_text=binding.textViewIslem.text.toString()
        binding.button1.setOnClickListener {
            islem_text+="1"
            binding.textViewIslem.text=islem_text
        }
        binding.button2.setOnClickListener {
            islem_text+="2"
            binding.textViewIslem.text=islem_text
        }
        binding.button3.setOnClickListener {
            islem_text+="3"
            binding.textViewIslem.text=islem_text
        }
        binding.button4.setOnClickListener {
            islem_text+="4"
            binding.textViewIslem.text=islem_text
        }
        binding.button5.setOnClickListener {
            islem_text+="5"
            binding.textViewIslem.text=islem_text
        }
        binding.button6.setOnClickListener {
            islem_text+="6"
            binding.textViewIslem.text=islem_text
        }
        binding.button7.setOnClickListener {
            islem_text+="7"
            binding.textViewIslem.text=islem_text
        }
        binding.button8.setOnClickListener {
            islem_text+="8"
            binding.textViewIslem.text=islem_text
        }
        binding.button9.setOnClickListener {
            islem_text+="9"
            binding.textViewIslem.text=islem_text
        }
        binding.button0.setOnClickListener {
            islem_text+="0"
            binding.textViewIslem.text=islem_text
        }
        binding.buttonTopla.setOnClickListener {
            islem_text+="+"
            binding.textViewIslem.text=islem_text
        }
        binding.buttonCikar.setOnClickListener {
            islem_text+="-"
            binding.textViewIslem.text=islem_text
        }
        binding.buttonCarp.setOnClickListener {
            islem_text+="*"
            binding.textViewIslem.text=islem_text
        }
        binding.buttonBol.setOnClickListener {
            islem_text+="/"
            binding.textViewIslem.text=islem_text
        }
        binding.buttonHesapla.setOnClickListener {
            binding.textViewGecmis.text=calculate(islem_text)
            islem_text=""
        }
        binding.buttonAc.setOnClickListener {
            islem_text=""
            binding.textViewIslem.text=islem_text
        }
        binding.buttonDelete.setOnClickListener {
            islem_text=islem_text.substring(0,islem_text.length-1)
            binding.textViewIslem.text=islem_text
        }
    }

    private fun calculate(islemText: String):String {
        var cevap=""
        if (islemText.indexOf("+")!=-1){
            cevap= (Integer.parseInt(islemText.subSequence(0,islemText.indexOf("+")).toString())+Integer.parseInt(islemText.subSequence(islemText.indexOf("+")+1,islemText.length).toString())).toString()
        }
        else if (islemText.indexOf("-")!=-1){
            cevap= (Integer.parseInt(islemText.subSequence(0,islemText.indexOf("-")).toString())-Integer.parseInt(islemText.subSequence(islemText.indexOf("-")+1,islemText.length).toString())).toString()
        }
        else if (islemText.indexOf("*")!=-1){
            cevap= (Integer.parseInt(islemText.subSequence(0,islemText.indexOf("*")).toString())*Integer.parseInt(islemText.subSequence(islemText.indexOf("*")+1,islemText.length).toString())).toString()
        }
        else if (islemText.indexOf("/")!=-1){
            if (Integer.parseInt(islemText.substring(islemText.indexOf("/")+1))!=0){
                cevap= (Integer.parseInt(islemText.subSequence(0,islemText.indexOf("/")).toString())/Integer.parseInt(islemText.subSequence(islemText.indexOf("/")+1,islemText.length).toString())).toString()
            }
            else{
                cevap="Payda 0 olamaz."
            }
        }
        return cevap
    }

}