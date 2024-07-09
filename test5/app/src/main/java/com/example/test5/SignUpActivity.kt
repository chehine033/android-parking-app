package com.example.test5

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.test5.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private var db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.sig.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        binding.signupbtn.setOnClickListener {
            val username = binding.username.text.toString()
            val email = binding.uppemail.text.toString()
            val pass = binding.upppassword.text.toString()
            val confirmPass = binding.repassword.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty() && pass == confirmPass) {
                firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val userId = FirebaseAuth.getInstance().currentUser?.uid
                        userId?.let { uid ->
                            val userMap = hashMapOf(
                                "username" to username,
                                "Email" to email
                            )
                            db.collection("user").document(uid).set(userMap)
                                .addOnCompleteListener { _ ->
                                    val intent = Intent(this, SignInActivity::class.java)
                                    startActivity(intent)
                                }
                                .addOnFailureListener { _ ->
                                    Toast.makeText(this, "Failed to save data to Firestore!", Toast.LENGTH_SHORT).show()
                                }
                        }
                    } else {
                        Toast.makeText(this, "Failed to create user: ${task.exception}", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Invalid input or passwords don't match!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
