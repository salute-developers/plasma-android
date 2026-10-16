package com.sdds.preview.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidedValue
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalSpinnerStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.Style
import com.sdds.preview.contract.PreviewDefaults
import com.sdds.preview.contract.PreviewPayload

/**
 * Задаёт вокруг [content] стили и текст по умолчанию из `defaults` payload так же, как тему приложения задаёт песочница:
 * `LocalButtonStyle`, `LocalSwitchStyle`, `LocalSpinnerStyle` и стиль с цветом текста. Отсутствующий раздел, токен или
 * стиль пропускаются: значение остаётся библиотечным и render не отклоняется.
 */
@Suppress("SpreadOperator") // Провайдеры собираются списком: их число зависит от payload.
@Composable
public fun ProvideHostDefaults(
    payload: PreviewPayload,
    theme: PreparedComposeTheme,
    factories: Map<String, GeneratedStyleFactory<*>>,
    content: @Composable () -> Unit,
) {
    val defaults = payload.defaults
    if (defaults == null) {
        content()
        return
    }
    val context = payload.styleContext(factories)
    val providers = mutableListOf<ProvidedValue<*>>()
    defaults.styles?.button?.let { id ->
        defaultStyle<ButtonStyle>(id, theme, context)?.let {
            providers += LocalButtonStyle provides it
        }
    }
    defaults.styles?.switch?.let { id ->
        defaultStyle<SwitchStyle>(id, theme, context)?.let {
            providers += LocalSwitchStyle provides it
        }
    }
    defaults.styles?.spinner?.let { id ->
        defaultStyle<SpinnerStyle>(id, theme, context)?.let {
            providers += LocalSpinnerStyle provides it
        }
    }

    CompositionLocalProvider(*providers.toTypedArray()) {
        ProvideDefaultText(defaults, theme, content)
    }
}

@Composable
private fun ProvideDefaultText(
    defaults: PreviewDefaults,
    theme: PreparedComposeTheme,
    content: @Composable () -> Unit,
) {
    val style = defaults.text?.style?.let(theme::typography)
    val color = defaults.text?.color?.let(theme::color)
    if (style == null && color == null) {
        content()
        return
    }
    ProvideTextStyle(value = style ?: LocalTextStyle.current, color = color, content = content)
}

@Composable
private inline fun <reified S : Style> defaultStyle(
    id: String,
    theme: PreparedComposeTheme,
    context: PreviewStyleContext,
): S? {
    val style = context.styles[id] ?: return null
    val factory = context.factories[style.component] ?: return null
    return factory.build(style.properties, theme, context) as? S
}
