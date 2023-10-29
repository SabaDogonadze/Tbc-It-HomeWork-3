package com.example.homework3

import com.example.homework3.databinding.ActivityMainBinding

open class Clear():EmailValidation() {
    fun clear(binding: ActivityMainBinding){
        binding.etUserName.text?.clear()
        binding.etAge.text?.clear()
        binding.etEmail.text?.clear()
        binding.etLastName.text?.clear()
        binding.etFirstName.text?.clear()

    }
}