package com.example.patmosand.ui.transp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TranportadoraViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is transportadora Fragment"
    }
    val text: LiveData<String> = _text
}