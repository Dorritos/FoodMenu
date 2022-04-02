package com.dorritos.vakhitovtesttask.ui.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dorritos.vakhitovtesttask.repositories.RepositoryImpl
import com.dorritos.vakhitovtesttask.api.models.Food

class PositionsViewModel : ViewModel() {
    private val repository = RepositoryImpl()

    fun getPizza(): LiveData<Food> = repository.getPizza()
    fun getCombo(): LiveData<Food> = repository.getCombo()
    fun getDesert(): LiveData<Food> = repository.getDesert()
    fun getDrink(): LiveData<Food> = repository.getDrink()
}