package com.assignment.daggerkotlin.di

import com.assignment.daggerkotlin.di.auth.AuthViewModelModule
import com.assignment.daggerkotlin.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector



@Module
public abstract class ActivityBuildersModule{

    //only authactivity subcomponent will be able to use this ViewModel
    @ContributesAndroidInjector(modules = [AuthViewModelModule::class])
    abstract fun contributeAuthActivity() : AuthActivity
}