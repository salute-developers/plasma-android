package com.sdds.uikit.fixtures

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import com.sdds.uikit.colorFromAttr

internal fun Context.getTextColorPrimary(): Int {
    return colorFromAttr(R.attr.testingTextColorPrimary)
}

internal inline fun <reified T : Activity> Context.findActivity(): T? {
    if (this is T) return this

    var ctx = this
    while (ctx is ContextWrapper) {
        if (ctx is T) return ctx
        ctx = ctx.baseContext
    }
    return null
}
