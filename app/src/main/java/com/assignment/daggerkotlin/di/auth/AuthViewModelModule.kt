package com.assignment.daggerkotlin.di.auth

import androidx.lifecycle.ViewModel
import com.assignment.daggerkotlin.di.ViewModelKey
import com.assignment.daggerkotlin.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap



@Module
class AuthViewModelModule {

    //dependency for authviewModel itself

   /* @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(viewmodel : AuthViewModel) : ViewModel*/

    @Provides
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    fun providesAuthViewModel(viewModel: AuthViewModel) :ViewModel{
        return viewModel;
    }


}