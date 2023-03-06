package com.example.shopinglist.domain

class DeliteShopItemUseCase(private val shopListRepository: shopListRepository) {
    fun deliteShopItem(shopItem: ShopItem) {
        shopListRepository.DeliteShopItem(shopItem)
    }
}