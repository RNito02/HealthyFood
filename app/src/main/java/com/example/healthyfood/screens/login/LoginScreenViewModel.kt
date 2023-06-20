package com.example.healthyfood.screens.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch

class LoginScreenViewModel: ViewModel() {
    private val auth: FirebaseAuth = Firebase.auth
    private val _loading = MutableLiveData(false)

    fun singInWithEmailAndPassword(email:String, password:String, home: ()-> Unit)
            =viewModelScope.launch {
        try {
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task->
                    if (task.isSuccessful){
                        Log.d("HealthyFood", "singInWithEmailAndPassword logueado")
                        home()
                    }
                    else{
                        Log.d("HealthyFood", "singInWithEmailAndPassword: ${task.result.toString()}")
                    }
                }
        }
        catch (ex:Exception){
            Log.d("HealthyFood", "singInWithEmailAndPassword: ${ex.message}")
        }
    }


    fun createUserWithEmailAndPassword(
        email:String,
        password:String,
        home: () -> Unit
    ){
        if (_loading.value == false){
            _loading.value = true
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task->
                    if (task.isSuccessful){
                        home()
                    }
                    else{
                        Log.d("HealthyFood", "createUserWithEmailAndPassword: ${task.result.toString()}")
                    }
                    _loading.value = false
                }
        }
    }
}