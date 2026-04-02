package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Immutable

@Immutable
interface MotionProperty<T> {

    val isEmpty: Boolean

    val label: String?

    companion object {
        fun <T> default() = noMotion<T>()
    }
}

fun <T> noMotion() = object : MotionProperty<T> {
    override val isEmpty: Boolean = true
    override val label: String? = null
}



