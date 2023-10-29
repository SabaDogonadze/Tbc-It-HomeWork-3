package com.example.homework3

import android.widget.Toast
import com.example.homework3.databinding.ActivityMainBinding

class GeneralValidations : Clear() {
    fun validations(binding: ActivityMainBinding): Boolean {
        var error = false
        val inputUserName = binding.etUserName.text.toString()
        val inputAgeAsString = binding.etAge.text.toString()
        if (inputUserName.length in 1..10) {
            Toast.makeText(binding.root.context, "UserName ნაკლებია 10 სიმბოლოზე, გთხოვთ შეიყვანოთ 10 სიმბოლოზე მეტი", Toast.LENGTH_SHORT).show()
            binding.etUserName.error = "UserName ნაკლებია 10 სიმბოლოზე,შეიყვანოთ 10 სიმბოლოზე მეტი"
            error = true
        }
        try {
            val inputAgeAsInt = inputAgeAsString.toInt()
            if (inputAgeAsInt < 0) {
                binding.etAge.error = "შეიყვანეთ თქვენი ასაკი სწორად"
                error = true
            } else if (inputAgeAsInt > 130) {
                binding.etAge.error = "გილოცავთ თქვენ რეკორდსმენი ხართ და თუ არ ხართ ... მაშინ შეიყვანეთ ასაკი სწორად"
                error = true
            }
        } catch (e: NumberFormatException) {
            Toast.makeText(binding.root.context, "შეიყვანეთ მთელი რიცხვი ", Toast.LENGTH_SHORT).show()
            binding.etAge.error = "შეიყვანეთ მთელი რიცხვი"
            error = true
        }
        return error

    }
}