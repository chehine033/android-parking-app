package com.example.test5

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.test5.databinding.ActivityBinding
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore


class Main : AppCompatActivity() {

    lateinit var binding : ActivityBinding
    lateinit var toggle: ActionBarDrawerToggle
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
 //   val Src=findViewById<EditText>(R.id.source)
  //  val Des=findViewById<EditText>(R.id.destination)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            toggle = ActionBarDrawerToggle(this@Main, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()
            //emaom=R.id.logout
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.firstItem -> {
                        Toast.makeText(this@Main, "Account Details", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this@Main, accdetails::class.java)
                        startActivity(intent)
                    }

                    R.id.secondtItem -> {
                        Toast.makeText(this@Main, "Credit Card Details", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this@Main, creditcard::class.java)
                        startActivity(intent)
                    }

                    R.id.thirdItem -> {
                        Toast.makeText(this@Main, "Contact", Toast.LENGTH_SHORT).show()

                    }

                    R.id.logout -> {
                        Toast.makeText(this@Main, "Logout", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this@Main, SignInActivity::class.java)
                        startActivity(intent)
                    }
                }
                true
            }



            binding.mapp.setOnClickListener {
                val intent = Intent(this@Main, map::class.java)
                startActivity(intent)
            }
          //  val source: String = Src.text.toString()
            //val destination: String = Src.text.toString()


            binding.cardChat.setOnClickListener{

               // val uri = Uri.parse("https://www.google.com/maps/dir/")
                val intent= Intent(Intent.ACTION_VIEW)
                intent.setPackage("com.google.android.apps.maps")
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
            }

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}




