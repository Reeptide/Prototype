package com.example.prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prototype.databinding.ActivityLoginBinding
import java.io.Serializable

data class Person(val username:String,val password:String): Serializable
class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    private var contacts : MutableList<Person> = mutableListOf()
    private var userEntry : Person = Person(binding.etUsername.text.toString(), binding.etPassword.text.toString())
    val person = createPerson()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
    private fun createPerson():List<Person> {
        for (i in 1..100) {
            val person = Person("User $i", "pw $i")
            contacts.add(person)
        }
        return contacts
    }

    private fun checkCredentials(){
        if (person.contains(userEntry)){
            Intent()
        }
        else binding.tvInvalid.text="Invalid username or password"
    }
}


