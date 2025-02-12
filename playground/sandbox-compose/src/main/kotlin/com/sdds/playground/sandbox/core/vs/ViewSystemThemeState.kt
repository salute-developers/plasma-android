package com.sdds.playground.sandbox.core.vs

import com.sdds.playground.sandbox.Theme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Содержит состояние текущей темы.
 * Позволяет изменять тему.
 */
internal object ViewSystemThemeState {
    private val _theme = MutableStateFlow(Theme.viewDefault)

    val theme: StateFlow<Theme>
        get() = _theme.asStateFlow()

    fun setTheme(theme: Theme) {
        _theme.value = theme
    }
}
