package com.dorritos.vakhitovtesttask.api.models

data class Food(
    val expires: Long,
    val isStale: Boolean,
    val menuItems: List<MenuItem>,
    val number: Int,
    val offset: Int,
    val processingTimeMs: Int,
    val totalMenuItems: Int,
    val type: String
)