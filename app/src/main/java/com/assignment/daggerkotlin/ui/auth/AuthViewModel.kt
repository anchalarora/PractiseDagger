package com.assignment.daggerkotlin.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject


/*public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    @Inject
    public AuthViewModel() {
        Log.d(TAG, "AuthViewModel: viewmodel is working...");
    }
}*/



/*class AuthViewModel @Inject constructor() : ViewModel() {

    companion object {

        private val TAG = "AuthViewModel"
    }

    init {
        Log.d(TAG, "AuthViewModel: viewmodel is working...")
    }


    fun hello(){
        Log.d(TAG, "Hello AuthViewModel: viewmodel is working...")

    }




}*/

class AuthViewModel : ViewModel {

    @Inject
    constructor(){
        Log.d(TAG, "AuthViewModel: viewmodel is working...")
    }
    companion object {

        private val TAG = "AuthViewModel"
    }

    /*
    init {
        Log.d(TAG, "AuthViewModel: viewmodel is working...")
    }*/


    fun hello(){
        Log.d(TAG, "Hello AuthViewModel: viewmodel is working...")

    }




}

/*class AuthViewModel : ViewModel() {

    companion object {

        private val TAG = "AuthViewModel"
    }

    init {
        Log.d(TAG, "AuthViewModel: viewmodel is working...")
    }

    fun hello(){
        Log.d(TAG, "Hello AuthViewModel: viewmodel is working...")

    }
}*/
