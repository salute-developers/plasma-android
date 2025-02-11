package com.sdds.playground.sandbox.stylessalute.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.stylessalute.theme.StylesSaluteTheme
import com.sdds.stylessalute.theme.darkStylesSaluteColors
import com.sdds.stylessalute.theme.darkStylesSaluteGradients
import com.sdds.stylessalute.theme.lightStylesSaluteColors
import com.sdds.stylessalute.theme.lightStylesSaluteGradients

/**
 * Позволяет обернуть Composable в тему
 */
@Composable
fun StylesSaluteThemeWrapper(content: @Composable () -> Unit) {
    val isDark = isSystemInDarkTheme()
    StylesSaluteTheme(
        colors = if (isDark) darkStylesSaluteColors() else lightStylesSaluteColors(),
        gradients = if (isDark) darkStylesSaluteGradients() else lightStylesSaluteGradients(),
    ) {
        content()
    }
}