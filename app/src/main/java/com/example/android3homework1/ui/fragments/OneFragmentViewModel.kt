package com.example.android3homework1.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.android3homework1.data.OneModel
import com.example.android3homework1.repositories.OneRepository

class OneFragmentViewModel : ViewModel() {

    private val oneRepository = OneRepository()
    val data: LiveData<ArrayList<OneModel>> = oneRepository.getListOfData()

}