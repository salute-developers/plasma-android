package com.sdds.compose.sandbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.Component
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.Theme
import com.sdds.sandbox.ThemeManager
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.mapNotNull

class ComposeTheme(
    override val components: ComponentProvider,
    val themeWrapper: @Composable (@Composable () -> Unit) -> Unit,
    val subthemes: Map<SubTheme, @Composable (@Composable () -> Unit) -> Unit> = emptyMap(),
) : Theme {

    companion object {
        val Default = ComposeTheme(
            components = object : ComponentProvider() {
                override val generated: Map<ComponentKey, Component<*>>
                    get() = emptyMap()

            },
            themeWrapper = {},
        )

    }
}

// Пока временно здесь
enum class SubTheme(val key: String) : ValueState {
    DEFAULT("Default"),
    ON_DARK("OnDark"),
    ON_LIGHT("OnLight"),
    INVERSE("Inverse"),
}

val ThemeManager.currentComposeTheme: Flow<ComposeTheme>
    get() = currentTheme
        .mapNotNull { it as? ComposeTheme }

fun <S : Style> ComposeTheme.getStyleProvider(
    componentKey: ComponentKey,
    appearance: String,
): ComposeStyleProvider<S>? {
    return components.get<ComposeStyleProvider<S>>(componentKey).styleProviders[appearance]
}

fun <S : Style> ComposeTheme.defaultStyleProvider(
    componentKey: ComponentKey,
): ComposeStyleProvider<S> {
    return components.get<ComposeStyleProvider<S>>(componentKey).styleProviders.values.first()
}