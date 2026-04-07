package com.sdds.uikit.fixtures

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.view.ContextThemeWrapper
import androidx.annotation.StyleRes
import com.sdds.uikit.colorFromAttr

/**
 * Оборачивает [Context] в [ContextThemeWrapper] с overlay стилем [style]
 */
fun Context.styleWrapper(@StyleRes style: Int? = null): Context =
    style?.let { ContextThemeWrapper(this, it) } ?: this

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
