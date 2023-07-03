package com.example.madcampweek1.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is yoyo whats up bro Fragment"
    }
    val text: LiveData<String> = _text
}