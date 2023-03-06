package com.example.shopinglist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shopinglist.domain.ShopItem
import com.example.shopinglist.domain.shopListRepository

object ShopListRepositoryImpl: shopListRepository {
    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementId = 0
    private val shopListLD = MutableLiveData<List<ShopItem>>()
    init {
        for (i in 0 until 10) {
            val item = ShopItem("Name $i", i, true)
            addShopItem(item)
        }
    }


    override fun addShopItem(shopItem: ShopItem) {
        if(shopItem.id == ShopItem.UNDEFIND_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
        updateList()

    }

    override fun DeliteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
        updateList()
    }

    override fun EditShopItem(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopList.find{ it.id == shopItemId
        } ?: throw  java.lang.RuntimeException("Not Find")
    }

    override fun getShopList(): LiveData<List<ShopItem>> {
        return shopListLD
    }
    private fun updateList() {
        shopListLD.value = shopList.toList()
    }
}