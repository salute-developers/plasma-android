package com.sdds.compose.uikit.internal.common

import androidx.compose.foundation.Indication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerEvent
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerInputFilter
import androidx.compose.ui.input.pointer.PointerInputModifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.IndicatorMode

/**
 * Модификатор, позволяющий дизэйблить Composable (менять альфу и игнорировать ввод).
 *
 * @param enabled включена ли сomposable
 * @param enabledAlpha альфа во включенном состоянии
 * @param disabledAlpha альфа в выключенном состоянии
 */
internal fun Modifier.enable(
    enabled: Boolean,
    enabledAlpha: Float = 1f,
    disabledAlpha: Float = 0.4f,
): Modifier {
    val modifier = if (enabled) {
        Modifier
    } else {
        object : PointerInputModifier {
            override val pointerInputFilter: PointerInputFilter = object : PointerInputFilter() {
                override fun onCancel() = Unit

                override fun onPointerEvent(
                    pointerEvent: PointerEvent,
                    pass: PointerEventPass,
                    bounds: IntSize,
                ) {
                    pointerEvent.changes.forEach {
                        it.consume()
                    }
                }
            }
        }
    }
    return this
        .then(modifier)
        .alpha(if (enabled) enabledAlpha else disabledAlpha)
}

/**
 * Модификатор, позволяющий применять форму, бэкграунд и кликабельность
 * Полезен при создании таких компонентов, как chip, badge и т.д.
 *
 * @param shape форма компонента
 * @param backgroundColor цвет бэкграунда
 * @param indication индикация нажатия
 * @param onClick обработчик нажатий
 * @param role тип элемента для Accesabillity
 * @param enabled включен ли компонент
 * @param enabledAlpha альфа в состоянии [enabled] == true
 * @param disabledAlpha альфа в состоянии [enabled] == true
 * @param interactionSource источник взаимодействий
 */
@Stable
internal fun Modifier.surface(
    shape: CornerBasedShape = RoundedCornerShape(25),
    backgroundColor: () -> Brush = { SolidColor(Color.Transparent) },
    alpha: (Boolean) -> Float = { enable: Boolean -> if (enable) 1f else 0f },
    indication: Indication? = null,
    onClick: (() -> Unit)? = null,
    role: Role? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource,
): Modifier {
    val clickableOrFocusableModifier = onClick?.let {
        Modifier.clickable(
            interactionSource = interactionSource,
            indication = indication,
            enabled = enabled,
            role = role,
            onClick = onClick,
        )
    } ?: Modifier.focusable(enabled, interactionSource)

    return clip(shape)
        .then(clickableOrFocusableModifier)
        .graphicsLayer { this.alpha = alpha(enabled) }
        .drawBehind {
            drawRect(backgroundColor())
        }
}

/**
 * Модификатор, позволяющий применять форму, бэкграунд и быть выбираемым
 * Полезен при создании таких компонентов, как chip
 *
 * @param value состояние отмечен/не отмечен
 * @param onValueChange обработчик смены состояния
 * @param shape форма компонента
 * @param backgroundColor цвет бэкграунда
 * @param indication индикация нажатия
 * @param role тип элемента для Accesabillity
 * @param enabled включен ли компонент
 * @param interactionSource источник взаимодействий
 */
internal fun Modifier.surface(
    value: Boolean,
    onValueChange: ((Boolean) -> Unit)? = null,
    shape: CornerBasedShape = RoundedCornerShape(25),
    backgroundColor: () -> Brush = { SolidColor(Color.Transparent) },
    alpha: (Boolean) -> Float = { enable: Boolean -> if (enable) 1f else 0f },
    indication: Indication? = null,
    role: Role? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource,
): Modifier {
    val toggleableOrFocusableModifier = onValueChange?.let {
        Modifier.toggleable(
            value = value,
            interactionSource = interactionSource,
            indication = indication,
            enabled = enabled,
            role = role,
            onValueChange = onValueChange,
        )
    } ?: Modifier.focusable(enabled, interactionSource)

    return clip(shape)
        .then(toggleableOrFocusableModifier)
        .graphicsLayer { this.alpha = alpha(enabled) }
        .drawBehind {
            drawRect(backgroundColor())
        }
}

/**
 * Позволяет нарисовать indicator внутри либо снаружи любого Composable
 *
 * @param alignment выравнивание
 * @param color цвет индикатора
 * @param horizontalPadding горизонтальный отступ от границы composable, может быть отрицательным
 * @param verticalPadding вертикальный отступ от границы composable, может быть отрицательным
 * @param indicatorSize размер индикатора
 * @param horizontalMode режим размещения относительно границ composable по горизонтали
 * @param verticalMode режим размещения относительно границ composable по вертикали
 */
internal fun Modifier.drawIndicator(
    alignment: Alignment,
    color: Color = Color.Red,
    horizontalPadding: Dp = 0.dp,
    verticalPadding: Dp = 0.dp,
    indicatorSize: Dp = 6.dp,
    horizontalMode: IndicatorMode = IndicatorMode.Inner,
    verticalMode: IndicatorMode = IndicatorMode.Inner,
): Modifier {
    return drawWithContent {
        drawContent()

        val horizontalOffset = horizontalPadding.roundToPx()
        val verticalOffset = verticalPadding.roundToPx()
        val indicatorSizePx = indicatorSize.roundToPx()

        val deltaSpace = IntOffset(
            x = when (horizontalMode) {
                IndicatorMode.Inner -> -horizontalOffset * 2
                IndicatorMode.Outer -> horizontalOffset * 2 + indicatorSizePx * 2
            },
            y = when (verticalMode) {
                IndicatorMode.Inner -> -verticalOffset * 2
                IndicatorMode.Outer -> verticalOffset * 2 + indicatorSizePx * 2
            },
        )

        val offset = alignment.align(
            IntSize(
                indicatorSizePx,
                indicatorSizePx,
            ),
            IntSize(
                (size.width + deltaSpace.x).toInt(),
                (size.height + deltaSpace.y).toInt(),
            ),
            layoutDirection = layoutDirection,
        )
        val resultOffset = offset - deltaSpace / 2f
        translate(resultOffset.x.toFloat(), resultOffset.y.toFloat()) {
            drawCircle(
                color = color,
                radius = indicatorSizePx / 2f,
                center = Offset(indicatorSizePx / 2f, indicatorSizePx / 2f),
            )
        }
    }
}
