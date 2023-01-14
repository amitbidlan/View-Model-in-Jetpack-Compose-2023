package com.example.viewmodels_amitbidlancom

import android.util.Log
import androidx.lifecycle.ViewModel


class DataClassViewModel : ViewModel() {
   val _tasks = taskList().toMutableList()

}

private fun taskList() = List(30){
    i -> DataClass(i,"Task $i")

}



