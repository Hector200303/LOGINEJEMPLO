package com.example.loginejemplo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class RecordarPassActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recordar_pass)
       val txtmail : TextView = findViewById(R.id.txtEmailCambio)
        val btncambiar : Button = findViewById(R.id.btnCambiar)
        btncambiar.setOnClickListener()
        {
sendPasswordReset(txtmail.text.toString())
        }




        firebaseAuth= Firebase.auth
    }

    private fun sendPasswordReset (email: String) {
        firebaseAuth.sendPasswordResetEmail(email).addOnCompleteListener() { task ->
            if (task.isSuccessful) {
                Toast.makeText(baseContext, "Contraseña enviada a correo", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(baseContext, "Error, no se pudo completar el proceso", Toast.LENGTH_SHORT).show()

            }
            }
            }
        }
