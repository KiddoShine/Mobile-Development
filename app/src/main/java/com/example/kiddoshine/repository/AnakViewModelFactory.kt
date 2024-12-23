package com.example.kiddoshine.repository

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kiddoshine.dataanak.AnakViewModel

class AnakViewModelFactory(
    private val application: Application
) : ViewModelProvider.AndroidViewModelFactory(application) {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AnakViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AnakViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}