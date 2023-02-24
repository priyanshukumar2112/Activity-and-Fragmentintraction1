package com.rare.activity_and_fragment_intraction_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.rare.activity_and_fragment_intraction_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var colorInterface: ColorInterface
    lateinit var colorInterface2: ColorInterface
    lateinit var colorInterface3: ColorInterface
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bntSubmit.setOnClickListener {

            if(binding.rbRed.isChecked){
                if(binding.v1.isChecked){
                    colorInterface.colorChange(1)
                }
                if(binding.v2.isChecked){
                    colorInterface2.colorChange(1)
                }
                if(binding.v3.isChecked){
                    colorInterface3.colorChange(1)
                }
            } else if(binding.rbGreen.isChecked){
                if(binding.v1.isChecked){
                    colorInterface.colorChange(2)
                }
                if(binding.v2.isChecked){
                    colorInterface2.colorChange(2)
                }
                if(binding.v3.isChecked){
                    colorInterface3.colorChange(2)
                }
            }else if(binding.rbYellow.isChecked){
                if(binding.v1.isChecked){
                    colorInterface.colorChange(3)
                }
                if(binding.v2.isChecked){
                    colorInterface2.colorChange(3)
                }
                if(binding.v3.isChecked){
                    colorInterface3.colorChange(3)
                }
            }
            else{
                Snackbar.make(it, "select any color", Snackbar.LENGTH_SHORT).show()
            }



        }
    }
}