package com.sdds.playground.sandbox.core.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.ThemeManager
import com.sdds.playground.sandbox.viewTheme
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

internal class ComponentListViewModel(
    private val themeManager: ThemeManager = ThemeManager,
) : ViewModel() {

    val currentTheme: StateFlow<Theme>
        get() = themeManager.currentTheme

    val componentItems: StateFlow<List<MenuItem>> =
        currentTheme
            .map { viewTheme(it).components.getMenuItems() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    fun updateTheme(theme: Theme) {
        themeManager.updateTheme(theme)
    }
}
