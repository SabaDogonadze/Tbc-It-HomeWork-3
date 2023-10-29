package com.example.homework3
import android.util.Patterns
import android.widget.Toast
import com.example.homework3.databinding.ActivityMainBinding

open class EmailValidation {
    fun emailValidation(email: String, binding: ActivityMainBinding):Boolean{
                var error = false
             if (!(Patterns.EMAIL_ADDRESS.matcher(email).matches())){
                 Toast.makeText(binding.root.context, "Email - ის ველი არასწორაა შეყვანილი", Toast.LENGTH_SHORT).show()
                 binding.etEmail.error = "შეიყვანეთ Email სწორად"
                 error = true

             }

        return error

    }
}