package com.example.shopinglist.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val shopListRepository: shopListRepository) {
    fun getShopList() : LiveData<List<ShopItem>> {
       return shopListRepository.getShopList()
    }
}