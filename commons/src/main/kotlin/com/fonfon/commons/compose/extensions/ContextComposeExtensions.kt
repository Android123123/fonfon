package com.fonfon.commons.compose.extensions

import android.app.Activity
import android.content.Context
import com.fonfon.commons.R
import com.fonfon.commons.extensions.baseConfig
import com.fonfon.commons.extensions.redirectToRateUs
import com.fonfon.commons.extensions.toast
import com.fonfon.commons.helpers.BaseConfig

val Context.config: BaseConfig get() = BaseConfig.newInstance(applicationContext)

fun Activity.rateStarsRedirectAndThankYou(stars: Int) {
    if (stars == 5) {
        redirectToRateUs()
    }
    toast(R.string.thank_you)
    baseConfig.wasAppRated = true
}
