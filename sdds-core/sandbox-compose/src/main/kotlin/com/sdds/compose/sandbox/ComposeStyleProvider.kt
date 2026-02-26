package com.sdds.compose.sandbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.StyleProvider
import com.sdds.sandbox.StyleReference

class ComposeStyleReference<S: Style>(
    private val style: @Composable () -> S
): StyleReference<@Composable () -> S> {
    override fun get(): @Composable () -> S {
        return style
    }
}

abstract class ComposeStyleProvider<S: Style> : StyleProvider<ComposeStyleReference<S>>() {

    @Composable
    fun style(key: String): S {
        return styleReference(key).get().invoke()
    }
}