package com.sdds.sandbox

import android.view.ContextThemeWrapper
import androidx.annotation.StyleRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.SubTheme

/**
 * Функция, создающая специальную [ComposeTheme], которая умеет устанавливать тему для Android View компонентов
 * @param displayName отображаемое название темы
 * @param themeRes идентификатор ресурса темы
 * @param components провайдер компонентов
 * @param subThemeResources идентификаторы ресурсов подтем
 */
@Suppress("FunctionName")
fun ViewTheme(
    displayName: String,
    themeRes: Int = 0,
    components: ComponentProvider = ComponentProvider.Empty,
    subThemeResources: Map<SubTheme, Int> = emptyMap(),
): ComposeTheme {
    return ComposeTheme(
        displayName,
        components,
        { ProvideViewTheme(themeRes, it) },
        subThemeResources.mapValues { entry ->
            {
                ProvideViewTheme(entry.value, it)
            }
        },
    )
}

/**
 * Устанавливае тему для View компонентов
 * @param themeRes идентификатор ресурса темы
 */
@Composable
fun ProvideViewTheme(
    @StyleRes themeRes: Int,
    content: @Composable () -> Unit,
) {
    val context = LocalContext.current
    CompositionLocalProvider(
        LocalContext provides ContextThemeWrapper(context, themeRes),
    ) {
        content()
    }
}
