package com.example.telefonuyg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.telefonuyg.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // bu ne işe yarıyor anlamadım
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        handleClickes()
    }


    private fun handleClickes() {
        binding.kaydetbtn.setOnClickListener{
               if(binding.editTextText.text.isEmpty() || binding.editTextText2.text.isEmpty()) {
                   Toast.makeText(this, "ikisinden biri boş", Toast.LENGTH_SHORT).show()
               }else{
                   val sara = Intent(this, SecondActivity::class.java)
                   Toast.makeText(this, "kayıt başarılı", Toast.LENGTH_SHORT).show()
                   startActivity(sara)

               }
        }





    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

}