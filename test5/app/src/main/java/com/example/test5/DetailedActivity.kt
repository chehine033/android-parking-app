package com.example.test5

import android.os.Bundle
import android.util.EventLogTags.Description
import androidx.appcompat.app.AppCompatActivity
import com.example.test5.databinding.DetailedactivityBinding
class DetailedActivity : AppCompatActivity() {
    private lateinit var binding: DetailedactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailedactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val Duration = intent.getStringExtra("time")
            val Price = intent.getIntExtra("ingredients", R.string.maggiIngredient)
            val Location = intent.getIntExtra("desc", R.string.maggieDesc)
            val image = intent.getIntExtra("image", R.drawable.maggi)
            binding.detailName.text = name
            binding.detailTime.text = Duration
            binding.detailLocation.setText(Location)
            binding.detailPrice.setText(Price)
            binding.detailImage.setImageResource(image)
        }
    }
}
