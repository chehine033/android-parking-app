package com.example.test5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.test5.databinding.AccBinding
import com.example.test5.databinding.ModifyaccBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage

class modifyacc  : AppCompatActivity() {
    private val PICK_IMAGE_REQUEST = 1
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    private var currentUserEmail: String = ""
    private lateinit var binding: ModifyaccBinding

    private lateinit var buttonModify: Button
    private val storage = FirebaseStorage.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ModifyaccBinding.inflate(layoutInflater)
        setContentView(binding.root)
        currentUserEmail = auth.currentUser?.email ?: ""

        val username=findViewById<EditText>(R.id.T1)
        val Email=findViewById<TextView>(R.id.T2)






        }
}