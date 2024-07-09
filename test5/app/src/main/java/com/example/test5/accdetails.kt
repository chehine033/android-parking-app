package com.example.test5

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.test5.databinding.AccBinding
import com.example.test5.databinding.AccdetailsBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class accdetails : AppCompatActivity() {
    private lateinit var binding: AccBinding
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AccBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userId = auth.currentUser?.uid
        userId?.let { uid ->
            db.collection("user").document(uid).get()
                .addOnSuccessListener { document ->
                    if (document.exists()) {
                        val username = document.getString("username")
                        val email = document.getString("Email")

                        binding.T1.text = "Username: $username"
                        binding.T2.text = "Email: $email"
                        // Add more TextViews as needed

                    } else {
                    }
                }
                .addOnFailureListener { exception ->
                }
        }
    }
}
