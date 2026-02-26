package com.sdds.sandbox

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object ThemeManager {

    private var _currentTheme = MutableStateFlow(Theme.Default)

    val currentTheme: StateFlow<Theme>
        get() = _currentTheme.asStateFlow()

    fun updateTheme(theme: Theme) {
        _currentTheme.value = theme
    }
}
