package com.example.shoppinglistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.shoppinglistapp.data.database.ShoppingDatabase
import com.example.shoppinglistapp.data.repositories.ShoppingRepository
import com.example.shoppinglistapp.ui.shoppinglist.ShoppingViewModel
import com.example.shoppinglistapp.ui.shoppinglist.ShoppingViewModelFactory

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val database= ShoppingDatabase(this)
        val repository= ShoppingRepository(database)
        val factory= ShoppingViewModelFactory(repository)
    val viewModel= ViewModelProvider(this,factory).get(ShoppingViewModel::class.java)
    }
}