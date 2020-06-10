package com.assignment.daggerkotlin.di

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun returnAString() : String {
        return "Hello Test Kotlin Dagger"
    }

    //returns true if application does not exist
    //returns false if application exist
    @Provides
    fun getApplication(app : Application) : Boolean{
        return app == null
    }
    /*@Module
    companion object{
        @Provides
        @JvmStatic
        fun returnAString() : String {
            return "Hello Test Kotlin Dagger"
        }

        //returns true if application does not exist
        //returns false if application exist
        @Provides
        @JvmStatic
        fun getApplication(app : Application) : Boolean{
            return app == null;
        }
    }*/
}