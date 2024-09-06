package com.example.meowapps.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.meowapps.model.Pet

class PetViewModel : ViewModel() {
    private val _pet = MutableLiveData<Pet>()
    val pet: LiveData<Pet> = _pet

    fun updatePetData(name: String, age: Int){
        _pet.value = Pet(name,age)
    }
}