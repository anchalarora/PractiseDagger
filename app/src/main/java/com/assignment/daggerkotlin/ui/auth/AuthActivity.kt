package com.assignment.daggerkotlin.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.lifecycle.ViewModelProviders
import com.assignment.daggerkotlin.R
import com.assignment.daggerkotlin.viewmodels.ViewModelProviderFactory
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    @JvmField
    var str : String? = null

    @Inject
    @JvmField
    var isAppNull : Boolean = false


    @Inject
    @JvmField
    var logo: Drawable? = null

    @Inject
    @JvmField
    var requestManager: RequestManager? = null

    @Inject
    @JvmField
    var viewModelProviderFactory : ViewModelProviderFactory? = null


    lateinit var authViewModel : AuthViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Auth","on create :"+str);

        Log.d("Auth","on create : isApp Null? "+isAppNull);

        setLogo()

        authViewModel = ViewModelProviders.of(this,viewModelProviderFactory).get(AuthViewModel::class.java)


        authViewModel.hello()
    }

    private fun setLogo() {
        requestManager?.load(logo)?.into(findViewById(R.id.login_logo) as ImageView)
    }

}
