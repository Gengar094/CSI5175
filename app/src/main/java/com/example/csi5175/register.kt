package com.example.csi5175

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.csi5175.backend.model.Address
import com.example.csi5175.backend.persistence.AppDatabase

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)
        var submitButton = findViewById<Button>(R.id.button_submit)
        var email = findViewById<EditText>(R.id.email_submit_inputs)
        var password = findViewById<EditText>(R.id.password_submit_inputs)
        val firstName = findViewById<EditText>(R.id.firstName_submit_inputs)
        val lastName = findViewById<EditText>(R.id.lastName_submit_inputs)
        val phone = findViewById<EditText>(R.id.phone_submit_inputs)
        val country = findViewById<EditText>(R.id.country_submit_input)
        val state = findViewById<EditText>(R.id.state_submit_input)
        val zipcode = findViewById<EditText>(R.id.zipcode_submit_input)
        val city = findViewById<EditText>(R.id.city_submit_input)
        val street = findViewById<EditText>(R.id.street_submit_input)

        var db = AppDatabase.getAppDatabase(applicationContext)
        submitButton.setOnClickListener{
            val addres = Address(country.text.toString(),state.text.toString(),zipcode.text.toString(),city.text.toString(),street.text.toString())
            //todo: insert user
            // db?.userDao()?.insert(email.text.toString(),password.text.toString(),firstName.text.toString(),lastName.text.toString(),phone.text.toString().toInt())
            // if return user:
            // var sharedPref : SharedPreferences = getPreferences(Context.MODE_PRIVATE);
            // sharedPref.edit().putInt("uid", uid).apply()
            Toast.makeText(applicationContext, "register success", Toast.LENGTH_LONG).show()
            val resultIntent = Intent()
            resultIntent.putExtra("result", "registration_successful")
            setResult(Activity.RESULT_OK, resultIntent)
            finish()

        }
    }
}