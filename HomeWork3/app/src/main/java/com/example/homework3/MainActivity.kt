package com.example.homework3

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.homework3.databinding.ActivityMainBinding

open class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animationDrawable = binding.YY.background as AnimationDrawable

        animationDrawable.apply {
            setEnterFadeDuration(3000)
            setExitFadeDuration(4500)
            start()
        }

        binding.btnSave.setOnClickListener {
            val viewsChecker = ViewsValidation()
            viewsChecker.view(binding)
            val validation = GeneralValidations()
            validation.validations(binding)
            validation.emailValidation(binding.etEmail.text.toString(), binding)

            if (viewsChecker.view(binding)) {


            } else if (validation.validations(binding)) {

            } else if (validation.emailValidation(binding.etEmail.text.toString(), binding)) {

            } else {
                binding.etAge.visibility = View.GONE                 // also i can put it in xml file by default but ...
                binding.etEmail.visibility = View.GONE
                binding.etFirstName.visibility = View.GONE
                binding.etUserName.visibility = View.GONE
                binding.etLastName.visibility = View.GONE
                binding.btnClear.visibility = View.GONE
                binding.btnSave.visibility = View.GONE
                binding.tvEmail.visibility = View.VISIBLE
                binding.tvName.visibility = View.VISIBLE
                binding.tvUserName.visibility = View.VISIBLE
                binding.tvAge.visibility = View.VISIBLE


                val email = binding.etEmail.text.toString()
                binding.tvEmail.text = "თქვენი Email არის: $email"
                val userName = binding.etUserName.text.toString()
                binding.tvUserName.text = "თქვენი Username-ია: $userName"
                val name = binding.etFirstName.text.toString() + " " + binding.etLastName.text.toString()
                binding.tvName.text = "თქვენი სახელი და გვარია: $name"
                val age = binding.etAge.text.toString()
                binding.tvAge.text = "თქვენი ასაკია: $age"
                binding.btnAgain.visibility = View.VISIBLE


            }

        }

        binding.btnAgain.setOnClickListener {
            binding.etAge.visibility = View.VISIBLE
            binding.etAge.setText("")
            binding.etEmail.visibility = View.VISIBLE
            binding.etEmail.setText("")
            binding.etFirstName.visibility = View.VISIBLE
            binding.etFirstName.setText("")
            binding.etLastName.visibility = View.VISIBLE
            binding.etLastName.setText("")
            binding.etUserName.visibility = View.VISIBLE
            binding.etUserName.setText("")
            binding.btnSave.visibility = View.VISIBLE
            binding.btnClear.visibility = View.VISIBLE



            binding.tvEmail.visibility = View.GONE
            binding.tvName.visibility = View.GONE
            binding.tvUserName.visibility = View.GONE
            binding.tvAge.visibility = View.GONE
            binding.btnAgain.visibility = View.GONE


        }

        binding.btnClear.setOnLongClickListener {
            val clear = Clear()
            clear.clear(binding)
            true
        }


    }


}