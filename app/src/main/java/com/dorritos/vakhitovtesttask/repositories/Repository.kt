package com.dorritos.vakhitovtesttask.repositories

import androidx.lifecycle.LiveData
import com.dorritos.vakhitovtesttask.api.models.Food

interface Repository {
    fun getPizza(): LiveData<Food>
    fun getCombo(): LiveData<Food>
    fun getDesert(): LiveData<Food>
    fun getDrink(): LiveData<Food>
}