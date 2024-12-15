package com.example.application2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    var error:Int = 0;
    val requestCode = 3;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{

            val intent = Intent()
            intent.action = "com.example.application1"
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            try{
                startActivityForResult(intent,requestCode)
            }
            catch(e:Exception){
                binding.textView3.text = "Something is wrong ${e.message}"
            }
        }
        }
    }