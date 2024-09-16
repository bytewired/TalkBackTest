package com.bytewired.accessibilitytest

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    private val navController by lazy {
        (supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment).navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            if (!navController.navigateUp()) finish()
        }
        return super.onOptionsItemSelected(item)
    }

    fun goToFragmentTwo() {
        navController.navigate(R.id.fragmentTwo)
    }

    fun goToFragmentThree() {
        navController.navigate(R.id.fragmentThree)
    }
}