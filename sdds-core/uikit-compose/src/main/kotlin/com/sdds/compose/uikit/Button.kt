package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.BaseSpinner

/**
 * Кнопка с иконкой.
 * Если [loading] == true, кнопка отобразит круглый индикатор загрузки.
 * На время анимации загрузки контент будет скрыт или станет полупрозрачным
 * в зависимости от режима [spinnerMode].
 *
 * @param icon иконка
 * @param onClick обработчик нажатий
 * @param modifier модификатор
 * @param shape форма кнопки
 * @param dimensions размеры кнопки
 * @param contentColor цвет контента кнопки
 * @param spinnerColor цвет индикатора загрузки
 * @param spinnerMode режим, определяющий, как выглядит контент во время анимации загрузки
 * @param backgroundColor цвет фона кнопки
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */
@Composable
fun IconButton(
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: CornerBasedShape = RoundedCornerShape(25),
    dimensions: Button.Dimensions = Button.Dimensions(),
    contentColor: Color = Color.White,
    spinnerColor: Color = contentColor,
    spinnerMode: Button.SpinnerMode = Button.SpinnerMode.HideContent,
    backgroundColor: Color = Color.Black,
    enabled: Boolean = true,
    loading: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseButton(
        modifier = modifier.requiredSize(dimensions.height),
        onClick = onClick,
        shape = shape,
        dimensions = dimensions,
        contentColor = contentColor,
        backgroundColor = backgroundColor,
        enabledAlpha = ENABLED_BUTTON_ALPHA,
        disabledAlpha = DISABLED_BUTTON_ALPHA,
        spinnerColor = spinnerColor,
        spinnerMode = spinnerMode,
        enabled = enabled,
        loading = loading,
        interactionSource = interactionSource,
    ) {
        ButtonIcon(
            icon = icon,
            size = dimensions.iconSize,
        )
    }
}

/**
 * Кнопка с текстом и иконкой.
 * Если [loading] == true, кнопка отобразит круглый индикатор загрузки.
 * Кнопка умеет отобрать иконки в начале и в конце.
 *
 * @param label текст кнопки
 * @param onClick обработчик нажатий
 * @param modifier модификатор
 * @param shape форма кнопки
 * @param dimensions размеры кнопки
 * @param contentColor цвет контента (иконка, label)
 * @param spinnerColor цвет индикатора загрузки
 * @param spinnerMode режим, определяющий, как выглядит контент во время анимации загрузки
 * @param backgroundColor цвет фона кнопки
 * @param value доп. текст кнопки
 * @param valueColor цвет доп. текста
 * @param labelTextStyle стиль основного текста
 * @param valueTextStyle стиль доп. текста
 * @param valueColor цвет доп. текста
 * @param icons иконки
 * @param spacing вид отступа между [label] и [value]
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param enabledAlpha альфа кнопки в активном состоянии
 * @param disabledAlpha альфа кнопки в неактивном состоянии
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */
@Composable
fun Button(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: CornerBasedShape = RoundedCornerShape(25),
    dimensions: Button.Dimensions = Button.Dimensions(),
    contentColor: Color = Color.White,
    spinnerColor: Color = contentColor,
    spinnerMode: Button.SpinnerMode = Button.SpinnerMode.HideContent,
    backgroundColor: Color = Color.Black,
    value: String? = null,
    valueColor: Color = contentColor.copy(alpha = VALUE_ALPHA),
    labelTextStyle: TextStyle = TextStyle(),
    valueTextStyle: TextStyle = labelTextStyle,
    icons: Button.Icons? = null,
    spacing: Button.Spacing = Button.Spacing.Packed,
    enabled: Boolean = true,
    loading: Boolean = false,
    enabledAlpha: Float = ENABLED_BUTTON_ALPHA,
    disabledAlpha: Float = DISABLED_BUTTON_ALPHA,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dimensions = dimensions.let {
        var paddings = it.paddings
        paddings = when {
            icons?.start != null -> paddings.copy(start = paddings.start - IconPaddingOffset)
            icons?.end != null -> paddings.copy(end = paddings.end - IconPaddingOffset)
            else -> paddings
        }
        it.copy(paddings = paddings)
    }
    BaseButton(
        modifier = modifier,
        onClick = onClick,
        contentColor = contentColor,
        backgroundColor = backgroundColor,
        spinnerColor = spinnerColor,
        spinnerMode = spinnerMode,
        enabledAlpha = enabledAlpha,
        disabledAlpha = disabledAlpha,
        enabled = enabled,
        shape = shape,
        loading = loading,
        interactionSource = interactionSource,
        dimensions = dimensions,
    ) {
        if (icons?.start != null) {
            ButtonIcon(
                icon = icons.start,
                size = dimensions.iconSize,
                marginEnd = dimensions.iconMargin,
            )
        }

        ButtonText(
            label = label,
            labelTextStyle = labelTextStyle,
            valueTextStyle = valueTextStyle,
            labelColor = contentColor,
            valueColor = valueColor,
            spacing = spacing,
            value = value,
            valueMargin = dimensions.valueMargin,
        )

        if (icons?.end != null) {
            ButtonIcon(
                icon = icons.end,
                size = dimensions.iconSize,
                marginStart = dimensions.iconMargin,
            )
        }
    }
}

/**
 * Базовая кнопка
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BaseButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    shape: CornerBasedShape,
    contentColor: Color,
    backgroundColor: Color,
    spinnerColor: Color,
    spinnerMode: Button.SpinnerMode,
    dimensions: Button.Dimensions,
    enabledAlpha: Float,
    disabledAlpha: Float,
    enabled: Boolean = true,
    loading: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    val colors = ButtonDefaults.buttonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledBackgroundColor = backgroundColor,
        disabledContentColor = contentColor,
    )
    Surface(
        onClick = onClick,
        modifier = modifier
            .height(dimensions.height)
            .alpha(if (enabled) enabledAlpha else disabledAlpha),
        enabled = enabled,
        shape = shape,
        color = colors.backgroundColor(enabled).value,
        contentColor = contentColor,
        border = null,
        elevation = 0.dp,
        interactionSource = interactionSource,
    ) {
        CompositionLocalProvider(LocalContentAlpha provides contentColor.alpha) {
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .defaultMinSize(dimensions.minWidth, dimensions.height)
                    .padding(dimensions.paddings.start, 0.dp, dimensions.paddings.end, 0.dp),
                contentAlignment = Alignment.Center,
            ) {
                Row(
                    modifier = Modifier.alpha(if (loading) spinnerMode.contentAlpha else enabledAlpha),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    content = content,
                )
                if (loading && enabled) {
                    BaseSpinner(
                        tint = spinnerColor,
                        modifier = Modifier.size(dimensions.spinnerSize),
                        strokeWidth = dimensions.spinnerStrokeWidth,
                    )
                }
            }
        }
    }
}

/**
 * Содержит сущности для конфигурирования кнопки
 */
object Button {

    /**
     * Размеры и отступы, которые используются внутри кнопки.
     *
     * @property height высота кнопки
     * @property paddings горизонтальные отступы кнопки
     * @property minWidth минимальная ширина кнопки
     * @property iconSize размер иконки
     * @property spinnerSize размер спиннера
     * @property spinnerStrokeWidth толщина спиннера
     * @property iconMargin отступ иконки
     * @property valueMargin отступ доп. текста
     */
    data class Dimensions(
        val height: Dp = 48.dp,
        val paddings: PaddingValues = PaddingValues(),
        val minWidth: Dp = 84.dp,
        val iconSize: Dp = 24.dp,
        val spinnerSize: Dp = 22.dp,
        val spinnerStrokeWidth: Dp = 2.dp,
        val iconMargin: Dp = 6.dp,
        val valueMargin: Dp = 4.dp,
    ) {

        /**
         * Горизонтальные отступы кнопки
         *
         * @property start начальный отступ
         * @property end конечный отступ
         */
        data class PaddingValues(
            val start: Dp = 20.dp,
            val end: Dp = 20.dp,
        ) {
            constructor(horizontal: Dp) : this(horizontal, horizontal)
        }
    }

    /**
     * Режим, определяющий, как выглядит контент во время индикации загрузки.
     *
     * @property contentAlpha альфа контента
     */
    sealed class SpinnerMode(val contentAlpha: Float) {

        /**
         * Контент будет скрыт во время загрузки, имеет alpha = 0
         */
        object HideContent : SpinnerMode(0f)

        /**
         * Контент станет полупрозрачным, с альфой [alpha]
         */
        data class SemitransparentContent(val alpha: Float) : SpinnerMode(alpha)
    }

    /**
     * Способы группировки контента в кнопке при помощи отступов.
     * В основном контролирует отображение текста Label-Value.
     */
    enum class Spacing {

        /**
         * Контент "упакован", отступы будут добавлены снаружи
         */
        Packed,

        /**
         * Контент отобразится по всей ширине, отступы будут добавлены
         * между элементами контента
         */
        SpaceBetween,
    }

    /**
     * Иконки кнопки
     * @property start иконка, которая будет добавлена в начале
     * @property end иконка, которая будет добавлена в конце
     */
    data class Icons(
        val start: Painter? = null,
        val end: Painter? = null,
    )
}

/**
 * Иконка кнопки. Умеет подставлять отступы в начале и в конце.
 *
 */
@Composable
internal fun ButtonIcon(
    icon: Painter,
    size: Dp,
    marginStart: Dp = 0.dp,
    marginEnd: Dp = 0.dp,
) {
    if (marginStart.value > 0) {
        Spacer(modifier = Modifier.width(marginStart))
    }
    Icon(
        painter = icon,
        contentDescription = null,
        modifier = Modifier.requiredSize(size),
    )
    if (marginEnd.value > 0) {
        Spacer(modifier = Modifier.width(marginEnd))
    }
}

/**
 * Composable для отображение текстов в кнопке
 */
@Composable
internal fun RowScope.ButtonText(
    label: String,
    labelTextStyle: TextStyle,
    valueTextStyle: TextStyle,
    labelColor: Color,
    valueColor: Color,
    modifier: Modifier = Modifier,
    valueMargin: Dp,
    spacing: Button.Spacing,
    value: String?,
) {
    if (value != null) {
        Row(
            horizontalArrangement = when (spacing) {
                Button.Spacing.Packed -> Arrangement.Center
                Button.Spacing.SpaceBetween -> Arrangement.SpaceBetween
            },
            modifier = when (spacing) {
                Button.Spacing.Packed -> modifier
                Button.Spacing.SpaceBetween -> modifier.weight(1f)
            },
        ) {
            Text(
                text = label,
                style = labelTextStyle,
                color = labelColor,
                softWrap = false,
                overflow = TextOverflow.Ellipsis,
            )

            Spacer(modifier = Modifier.width(valueMargin))

            Text(
                text = value,
                style = valueTextStyle,
                color = valueColor,
                softWrap = false,
                overflow = TextOverflow.Ellipsis,
            )
        }
    } else {
        Text(
            text = label,
            modifier = modifier,
            style = labelTextStyle,
            color = labelColor,
            softWrap = false,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

private const val VALUE_ALPHA = 0.56f
private const val ENABLED_BUTTON_ALPHA = 1f
private const val DISABLED_BUTTON_ALPHA = 0.4f
private val IconPaddingOffset = 2.dp
