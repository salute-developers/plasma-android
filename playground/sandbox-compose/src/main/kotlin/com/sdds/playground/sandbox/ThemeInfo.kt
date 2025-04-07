package com.sdds.playground.sandbox

import android.util.Log
import androidx.annotation.StyleRes
import androidx.compose.runtime.Composable
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView

internal class ThemeInfoCompose(
    val theme: Theme,
    val components: ComponentsProviderCompose,
    val themeWrapper: @Composable (@Composable () -> Unit) -> Unit,
)

internal class ThemeInfoView(
    val theme: Theme,
    val components: ComponentsProviderView,
    @StyleRes val themeRes: Int,
)

internal fun composeTheme(theme: Theme): ThemeInfoCompose =
    composeThemes.firstOrNull { it.theme == theme }
        ?: composeThemes
            .firstOrNull { it.theme == Theme.Default }
            .also {
                Log.e(
                    "Sdds sandbox",
                    "Compose theme $theme not found, default theme ${Theme.Default} will be used",
                )
            }
        ?: throw NoSuchElementException("Compose theme not found")

internal fun viewTheme(theme: Theme): ThemeInfoView =
    viewThemes.firstOrNull { it.theme == theme }
        ?: viewThemes
            .firstOrNull { it.theme == Theme.Default }
            .also {
                Log.e(
                    "Sdds sandbox",
                    "View theme $theme not found, default theme ${Theme.Default} will be used",
                )
            }
        ?: throw NoSuchElementException("View theme not found")

internal val allComposeThemes: List<Theme>
    get() = composeThemes.map { it.theme }

internal val allViewThemes: List<Theme>
    get() = viewThemes.map { it.theme }
