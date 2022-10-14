package com.moyshagg.labuniversity

import android.widget.AdapterView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SAVED_STATE_REGISTRY_OWNER_KEY
import androidx.lifecycle.ViewModel
import com.moyshagg.labuniversity.databinding.ActivityMainBinding

class MainActivityViewModel: ViewModel() {


    private val _txt = MutableLiveData<String>()
    val txt : LiveData<String> = _txt

    fun changeFun()
    {
        if(_txt.value == "Бавовна!")
        {
            _txt.value = "Хлопок"
        }
        else{
            _txt.value = "Бавовна!"
        }
    }
}