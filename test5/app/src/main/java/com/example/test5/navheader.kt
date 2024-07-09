package com.example.test5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test5.databinding.AccBinding
import com.example.test5.databinding.ActivityBinding
import com.example.test5.databinding.NavHeaderBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class navheader: AppCompatActivity() {

    lateinit var binding : NavHeaderBinding
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NavHeaderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userId = auth.currentUser?.uid
        userId?.let { uid ->
            db.collection("user").document(uid).get()
                .addOnSuccessListener { document ->
                    if (document.exists()) {
                        val username = document.getString("username")
                        binding.hello.text = "Username: $username"

                        // Add more TextViews as needed

                    } else {
                    }
                }
                .addOnFailureListener { exception ->
                }
        }
    }
}