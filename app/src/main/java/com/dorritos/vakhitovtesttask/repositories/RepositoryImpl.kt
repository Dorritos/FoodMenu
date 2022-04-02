package com.dorritos.vakhitovtesttask.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dorritos.vakhitovtesttask.BuildConfig
import com.dorritos.vakhitovtesttask.api.RetrofitService
import com.dorritos.vakhitovtesttask.api.models.Food
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RepositoryImpl : Repository {

    private val api = RetrofitService.getInstance().getApi()

    override fun getPizza(): LiveData<Food> {
        val data = MutableLiveData<Food>()
        CoroutineScope(Dispatchers.IO).launch {
            val pizza = api.getFood("pizza", 10, BuildConfig.API_KEY)
            if (pizza == null) {
                //pizza.getFoodFromDb
            }
            data.postValue(pizza)
        }
        return data
    }

    override fun getCombo(): LiveData<Food> {
        val data = MutableLiveData<Food>()
        CoroutineScope(Dispatchers.IO).launch {
            val combo = api.getFood("combo", 10, BuildConfig.API_KEY)
            data.postValue(combo)
        }
        return data
    }

    override fun getDesert(): LiveData<Food> {
        val data = MutableLiveData<Food>()
        CoroutineScope(Dispatchers.IO).launch {
            val desert = api.getFood("desert", 10, BuildConfig.API_KEY)
            data.postValue(desert)
        }
        return data
    }

    override fun getDrink(): LiveData<Food> {
        val data = MutableLiveData<Food>()
        CoroutineScope(Dispatchers.IO).launch {
            val drink = api.getFood("drink", 10, BuildConfig.API_KEY)
            data.postValue(drink)
        }
        return data
    }
}