package com.example.homework3

import android.widget.Toast
import com.example.homework3.databinding.ActivityMainBinding

  class ViewsValidation():Clear() {
    fun view(binding: ActivityMainBinding): Boolean{
        var error = false
        val inputEmail = binding.etEmail.text.toString()
        val inputUserName = binding.etUserName.text.toString()
        val inputFirstName = binding.etFirstName.text.toString()
        val inputLastName = binding.etLastName.text.toString()
        val inputAge = binding.etAge.text.toString()

        if (inputEmail.isEmpty()){
            Toast.makeText(binding.root.context, "Email - ის ველი ცარიელია, გთხოვთ შეიყვანოთ Email", Toast.LENGTH_SHORT).show()
            binding.etEmail.error = "შეიყვანეთ Email"
            error = true

        }
        if (inputUserName.isEmpty()){
            Toast.makeText(binding.root.context, "UserName - ის ველი ცარიელია, გთხოვთ შეიყვანოთ Username", Toast.LENGTH_SHORT).show()
            binding.etUserName.error = "შეიყვანეთ UserName"
            error = true

        }
        if (inputFirstName.isEmpty()){
            Toast.makeText(binding.root.context, "FirstName - ის ველი ცარიელია, გთხოვთ შეიყვანოთ First Name", Toast.LENGTH_SHORT).show()
            binding.etFirstName.error = "შეიყვანეთ FirstName"
            error = true

        }
        if (inputLastName.isEmpty()){
            Toast.makeText(binding.root.context, "LastName - ის ველი ცარიელია, გთხოვთ შეიყვანოთ Last Name", Toast.LENGTH_SHORT).show()
            binding.etLastName.error = "შეიყვანეთ LastName"
            error = true

        }
        if (inputAge.isEmpty()){
            Toast.makeText(binding.root.context, "Age - ის ველი ცარიელია, გთხოვთ შეიყვანოთ Age", Toast.LENGTH_SHORT).show()
            binding.etAge.error = "შეიყვანეთ Age"
            error = true

        }
        return error
    }
}