package com.kotlinnavigationdemo.ex2_bottommenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kotlinnavigationdemo.R
import com.kotlinnavigationdemo.ex3_navdrawer.MyViewModel

class BottomMenuMainActivity : AppCompatActivity() {
    private lateinit var navController : NavController
    private lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_menu_main)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        navController = findNavController(R.id.nav_host_fragment)
        setupBottomNav()
    }

    private fun setupBottomNav(){
        val bottomNavView: BottomNavigationView = findViewById(R.id.bottom_nav_view)
        bottomNavView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_options,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        item.onNavDestinationSelected(navController)
        return super.onOptionsItemSelected(item)
    }
}