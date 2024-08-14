package com.sdds.playground.sandbox.buttons

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.playground.sandbox.buttons.SandboxButtonSettingsProvider.backgroundColorFor
import com.sdds.playground.sandbox.buttons.SandboxButtonSettingsProvider.basicButtonDimensionsFor
import com.sdds.playground.sandbox.buttons.SandboxButtonSettingsProvider.contentColorFor
import com.sdds.playground.sandbox.buttons.SandboxButtonSettingsProvider.iconButtonDimensionsFor
import com.sdds.playground.sandbox.buttons.SandboxButtonSettingsProvider.pressedBackgroundColorFor
import com.sdds.playground.sandbox.buttons.SandboxButtonSettingsProvider.shapeFor
import com.sdds.playground.sandbox.buttons.SandboxButtonSettingsProvider.textStyleFor

/**
 * Кнопка с иконкой в песочнице на основе [IconButton]
 */
@Composable
internal fun SandboxIconButton(
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: SandboxButton.IconButtonShape = SandboxButton.IconButtonShape.Rounded,
    size: SandboxButton.Size = SandboxButton.Size.M,
    style: SandboxButton.Style = SandboxButton.Style.Default,
    enabled: Boolean = true,
    loading: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val innerShape = when (shape) {
        SandboxButton.IconButtonShape.Rounded -> shapeFor(size)
        SandboxButton.IconButtonShape.Circle -> CircleShape
    }
    IconButton(
        icon = icon,
        onClick = onClick,
        modifier = modifier,
        shape = innerShape,
        backgroundColor = backgroundColorFor(style),
        pressedBackgroundColor = pressedBackgroundColorFor(style),
        contentColor = contentColorFor(style),
        spinnerColor = contentColorFor(style),
        enabled = enabled,
        loading = loading,
        dimensions = iconButtonDimensionsFor(size),
        spinnerMode = Button.SpinnerMode.HideContent,
        interactionSource = interactionSource,
    )
}

/**
 * Кнопка с иконкой и текстом в песочнице на основе [Button]
 */
@Composable
fun SandboxBasicButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    label: String,
    value: String? = null,
    icons: Button.Icons? = null,
    spacing: Button.Spacing = Button.Spacing.Packed,
    size: SandboxButton.Size = SandboxButton.Size.M,
    style: SandboxButton.Style = SandboxButton.Style.Default,
    enabled: Boolean = true,
    loading: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = shapeFor(size),
        label = label,
        value = value,
        labelTextStyle = textStyleFor(size),
        valueTextStyle = textStyleFor(size),
        spacing = spacing,
        icons = icons,
        backgroundColor = backgroundColorFor(style),
        pressedBackgroundColor = pressedBackgroundColorFor(style),
        contentColor = contentColorFor(style),
        spinnerColor = contentColorFor(style),
        spinnerMode = if (style == SandboxButton.Style.Clear) {
            Button.SpinnerMode.SemitransparentContent(0.06f)
        } else {
            Button.SpinnerMode.HideContent
        },
        enabled = enabled,
        loading = loading,
        dimensions = basicButtonDimensionsFor(size),
        interactionSource = interactionSource,
    )
}

/**
 * Содержит сущности для настройки кнопки внутри песочницы
 */
object SandboxButton {
    /**
     * Размеры кнопки
     */
    enum class Size {
        L, M, S, XS
    }

    /**
     * Стиль отображения кнопки
     */
    enum class Style {
        Default,
        Secondary,
        Accent,
        Positive,
        Negative,
        Warning,
        Clear,
        Dark,
        Black,
        White,
    }

    /**
     * Форма кнопки [IconButton]
     */
    enum class IconButtonShape {
        /**
         * Скругленные края
         */
        Rounded,

        /**
         * Круглая форма
         */
        Circle,
    }
}
