package com.example.test5


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.MenuItemHoverListener
import androidx.appcompat.widget.SearchView
import com.example.test5.ListData



class histro : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList=ArrayList<ListData?>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        val nameList = arrayOf("Parking 1","Parking 2","Parking 3","Parking 4","Parking 5","Parking 6","Parking 7")//ya tawfik chouf kifech tbadel.ha hethi bch trod.ha te5ou l'esm ml base de données
        val DurationList = arrayOf("Time 1","Time 2","Time 3","Time 4","Time 5","Time 6","Time 7")
        val PriceList = arrayOf("Price 1","Price 2","Price 3","Price 4","Price 5","Price 6","Price 7")
     //   val ImageList = intArrayOf(R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7)

    }
/*
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.search, menu)

        return true*/
    }
