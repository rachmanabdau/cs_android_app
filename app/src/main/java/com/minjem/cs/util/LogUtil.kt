package com.minjem.cs.util

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import timber.log.Timber

fun AppCompatActivity.logDebug(log: String, qualifier: String? = null) {
    Timber.d("${qualifier ?: this.localClassName} - $log")
}

fun Fragment.logDebug(log: String, qualifier: String? = null) {
    Timber.d("$qualifier - $log")
}

fun AppCompatActivity.logError(log: String, qualifier: String? = null) {
    Timber.e("${qualifier ?: this.localClassName} - $log")
}

fun Fragment.logError(log: String, qualifier: String? = null) {
    Timber.e("$qualifier - $log")
}