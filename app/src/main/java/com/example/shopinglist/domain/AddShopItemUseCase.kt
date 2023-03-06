package com.example.shopinglist.domain

class AddShopItemUseCase(private val shopListRepository: shopListRepository) {
    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}