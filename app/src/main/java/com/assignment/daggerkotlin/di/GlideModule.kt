package com.assignment.daggerkotlin.di

import android.app.Application
import android.graphics.DrawFilter
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.assignment.daggerkotlin.R
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import dagger.Module
import dagger.Provides


@Module
class GlideModule{

    @Provides
    fun providesRequestOptions(): RequestOptions{
        return RequestOptions().placeholder(R.drawable.white_background)
            .error(R.drawable.white_background)
    }

    @Provides
    fun providesRequestManager(application :Application,requestOptions: RequestOptions): RequestManager{
        return Glide.with(application).setDefaultRequestOptions(requestOptions)
    }

    @Provides
    fun getDrawable(application : Application) : Drawable? {
        return ContextCompat.getDrawable(application,R.drawable.logo)
    }
}