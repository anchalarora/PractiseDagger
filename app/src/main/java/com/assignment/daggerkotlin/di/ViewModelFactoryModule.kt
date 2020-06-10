package com.assignment.daggerkotlin.di

import com.assignment.daggerkotlin.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module
import androidx.lifecycle.ViewModelProvider
import dagger.Provides

//responisble for generating dependency for ViewModelProviderFactory class
@Module
class ViewModelFactoryModule{

    //we need to inject this ViewModelProvideFactory dependency in AuthActivity
    /*@Binds
    abstract fun viewModelFactory(viewModelFactory : ViewModelProviderFactory) : ViewModelProvider.Factory*/

    //can do this way too using provides in java
    /*@Provides
    static ViewModelProvider.Factory bindFactory(ViewModelProviderFactory factory)
    {
        return factory;
    }*/

    //provides viewmodelproviderFactory dependency
    @Provides
    fun providesViewModelProviderFactory(viewModelProviderFactory :ViewModelProviderFactory) :  ViewModelProvider.Factory{
        return viewModelProviderFactory;
    }



}