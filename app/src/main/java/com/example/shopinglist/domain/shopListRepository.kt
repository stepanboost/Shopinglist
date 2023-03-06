package com.example.shopinglist.domain

import androidx.lifecycle.LiveData

interface shopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun DeliteShopItem(shopItem: ShopItem)
    fun EditShopItem(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopList(): LiveData<List<ShopItem>>

}