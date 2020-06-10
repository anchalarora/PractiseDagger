package com.assignment.daggerkotlin.di

import android.app.Application
import com.assignment.daggerkotlin.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


//we aaded ViewModelProviderFactoryModule in appcomponent as it is going to be
// used by all the view models in the project(going to be a application level dependency and singleton scoped dependency)
//but we wont add AuthViewModelModule here it will added in subcomponent,it is scoped to only auth subcomponent

@Singleton
@Component(modules = [ AndroidSupportInjectionModule::class,AppModule::class,
    ActivityBuildersModule::class,
    GlideModule::class,
    ViewModelFactoryModule::class
])
public interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(app: Application): Builder

        fun build() : AppComponent
    }

}