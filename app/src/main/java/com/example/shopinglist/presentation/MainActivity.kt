package com.example.shopinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.shopinglist.R
import com.example.shopinglist.domain.AddShopItemUseCase
import com.example.shopinglist.domain.ShopItem

class MainActivity : AppCompatActivity() {
    private lateinit var  viewModel: MainViewModel
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.shopList.observe(this) {
            Log.d("My Teg", it.toString())
            if(count == 0) {
                count++
                val item = it[0]
                viewModel.ChangeEnableState(item)
            }
        }
    }
}