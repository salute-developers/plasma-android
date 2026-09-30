package com.sdds.compose.uikit.fixtures

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalInspectionMode
import org.jetbrains.compose.resources.PreviewContextConfigurationEffect

/**
 * Инициализирует Android-контекст Compose resources для Robolectric тестов
 */
@Composable
fun configureComposeResourcesForRobolectric() {
    CompositionLocalProvider(LocalInspectionMode provides true) {
        PreviewContextConfigurationEffect()
    }
}