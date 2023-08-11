package com.example.rehber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rehber.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text1 = binding.name
        val text2 = binding.number

        binding.button.setOnClickListener {
            if (text1.text.isEmpty() || text2.text.isEmpty()){
                Snackbar.make(it,"Lütfen tüm alanları doldurun!", Snackbar.LENGTH_SHORT).show()
            }else{
                val LoginIntent = Intent(this,giris::class.java)
                startActivity(LoginIntent)
            }
        }


    }
}