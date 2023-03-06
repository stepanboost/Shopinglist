package com.example.shopinglist.domain

class EditShopItemUseCase(private val shopListRepository: shopListRepository) {
    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.EditShopItem(shopItem)
    }

}