package com.assignment.daggerkotlin.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

/*
class ViewModelProviderFactory @Inject constructor(private val creators: Map<Class<out ViewModel>, Provider<ViewModel>>) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        var creator = creators[modelClass]
        if (creator == null) { // if the viewmodel has not been created

            // loop through the allowable keys (aka allowed classes with the @ViewModelKey)
            for (entry in creators.entries) {

                // if it's allowed, set the Provider<ViewModel>
                if (modelClass.isAssignableFrom(entry.key)) {
                    creator = entry.value
                    break
                }
            }
        }

        // if this is not one of the allowed keys, throw exception
        requireNotNull(creator) { "unknown model class $modelClass" }

        // return the Provider
        try {
            return creator.get() as T
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }

}


*/
class ViewModelProviderFactory @Inject constructor(private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        /*val creator = creators[modelClass as Class<ViewModel>]
            ?: creators.entries.firstOrNull { (c, _) -> modelClass.isAssignableFrom(c) }?.value
            ?: throw IllegalArgumentException("Unknown model class $modelClass")

        return creator.get() as T*/

        var mCreator = creators[modelClass]
        if (mCreator == null) {
            for ((key, value) in creators) {
                if (modelClass.isAssignableFrom(key)) {
                    mCreator = value
                    break
                }
            }
        }
        try {
            return (mCreator?.get() as T)
        } catch (e: Exception) {
            throw RuntimeException()

        }
    }
}