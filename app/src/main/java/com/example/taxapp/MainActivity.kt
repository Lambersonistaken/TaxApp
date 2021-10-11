package com.example.taxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taxapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.hesaplaButton.setOnClickListener{

            kdvHesapla()
        }
    }

fun kdvHesapla(){

    val urunFiyatiString = binding.Fiyat.text.toString()

    val tutar = urunFiyatiString.toDouble()

    val kdvHesaplanan = tutar * 0.18
    //Nice
    val kdvHesaplananString = kdvHesaplanan.toString()

    val kdvDahil = kdvHesaplanan + tutar

    val kdvDahilString = kdvDahil.toString()


    binding.kdvOncesi.text = "$urunFiyatiString ₺"
    binding.kdvMiktari.text = "$kdvHesaplananString ₺"
    binding.kdvDahilFiyat.text = "$kdvDahilString ₺"










}


}