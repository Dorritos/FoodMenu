package com.dorritos.vakhitovtesttask.api.models

data class MenuItem(
    val id: Int,
    val image: String,
    val imageType: String,
    val readableServingSize: Any,
    val restaurantChain: String,
    val servingSize: Any,
    val servings: Servings,
    val title: String
)