package com.example.shopinglist.domain

class GetshopItemUseCase(private val shopListRepository: shopListRepository) {
    fun getShopItem(shopItem: Int): ShopItem {
        return shopListRepository.getShopItem(shopItem)
    }
}