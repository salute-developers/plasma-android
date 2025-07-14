package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Группа кнопок
 *
 * @param modifier модификатор
 * @param orientation ориентация группы
 * @param style тсиль компонента
 * @param content контент группы
 */
@Composable
fun ButtonGroup(
    modifier: Modifier = Modifier,
    orientation: ButtonGroupOrientation = ButtonGroupOrientation.Horizontal,
    style: ButtonGroupStyle = LocalButtonGroupStyle.current,
    content: ButtonGroupScope.() -> Unit,
) {
    when (orientation) {
        ButtonGroupOrientation.Vertical -> Column(
            modifier = modifier,
            verticalArrangement = Arrangement.spacedBy(style.dimensions.spacing),
        ) {
            ButtonGroupContent(orientation, style, content)
        }

        ButtonGroupOrientation.Horizontal -> Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(style.dimensions.spacing),
        ) {
            ButtonGroupContent(orientation, style, content)
        }
    }
}

@Composable
private fun ButtonGroupContent(
    orientation: ButtonGroupOrientation = ButtonGroupOrientation.Horizontal,
    style: ButtonGroupStyle = LocalButtonGroupStyle.current,
    content: ButtonGroupScope.() -> Unit,
) {
    val scope = remember { ButtonGroupScopeImpl() }
    scope.content()
    if (scope.buttons.isEmpty()) return
    val startShape = remember(orientation, style.externalShape, style.internalShape) {
        calculateStartShape(
            internalShape = style.internalShape,
            externalShape = style.externalShape,
            orientation = orientation,
        )
    }
    val endShape = remember(orientation, style.externalShape, style.internalShape) {
        calculateEndShape(
            internalShape = style.internalShape,
            externalShape = style.externalShape,
            orientation = orientation,
        )
    }
    val middleShape = remember(style.internalShape) { style.internalShape }
    scope.buttons.forEachIndexed { index, itemContent ->
        val shape = when (index) {
            0 -> startShape
            scope.buttons.lastIndex -> endShape
            else -> middleShape
        }
        CompositionLocalProvider(
            LocalButtonForceShape provides shape,
            LocalButtonStyle provides style.buttonStyle,
            LocalIconButtonStyle provides style.buttonStyle,
        ) {
            ButtonGroupItemScopeImpl.itemContent()
        }
    }
    scope.reset()
}

private fun calculateStartShape(
    internalShape: CornerBasedShape,
    externalShape: CornerBasedShape,
    orientation: ButtonGroupOrientation,
): CornerBasedShape {
    return when (orientation) {
        ButtonGroupOrientation.Vertical -> RoundedCornerShape(
            topStart = externalShape.topStart,
            topEnd = externalShape.topEnd,
            bottomStart = internalShape.bottomStart,
            bottomEnd = internalShape.bottomEnd,
        )

        ButtonGroupOrientation.Horizontal -> RoundedCornerShape(
            topStart = externalShape.topStart,
            bottomStart = externalShape.topEnd,
            topEnd = internalShape.bottomStart,
            bottomEnd = internalShape.bottomEnd,
        )
    }
}

private fun calculateEndShape(
    internalShape: CornerBasedShape,
    externalShape: CornerBasedShape,
    orientation: ButtonGroupOrientation,
): CornerBasedShape {
    return when (orientation) {
        ButtonGroupOrientation.Vertical -> RoundedCornerShape(
            topStart = internalShape.topStart,
            topEnd = internalShape.topEnd,
            bottomStart = externalShape.bottomStart,
            bottomEnd = externalShape.bottomEnd,
        )

        ButtonGroupOrientation.Horizontal -> RoundedCornerShape(
            topStart = internalShape.topStart,
            bottomStart = internalShape.topEnd,
            topEnd = externalShape.bottomStart,
            bottomEnd = externalShape.bottomEnd,
        )
    }
}

/**
 * Cкоуп [ButtonGroup]
 */
interface ButtonGroupScope {

    /**
     * Добавляет кнопку [content] в [ButtonGroup]
     */
    fun button(content: @Composable ButtonGroupItemScope.() -> Unit)
}

/**
 * Скоуп дочерних элементов [ButtonGroup]
 */
interface ButtonGroupItemScope

/**
 * Ориентация группы кнопок [ButtonGroup]
 */
enum class ButtonGroupOrientation {
    Vertical,
    Horizontal,
}

private class ButtonGroupScopeImpl : ButtonGroupScope {
    val buttons = mutableListOf<@Composable ButtonGroupItemScope.() -> Unit>()
    override fun button(content: @Composable (ButtonGroupItemScope.() -> Unit)) {
        buttons.add { content() }
    }

    fun reset() {
        buttons.clear()
    }
}

private object ButtonGroupItemScopeImpl : ButtonGroupItemScope

@Preview
@Composable
private fun ButtonGroupPreview() {
    ButtonGroup(
        orientation = ButtonGroupOrientation.Vertical,
        style = ButtonGroupStyle.builder()
            .externalShape(CircleShape)
            .internalShape(RoundedCornerShape(5))
            .style(),
    ) {
        button { Button("start", {}) }
        button { Button("middle", {}) }
        button { Button("middle", {}) }
        button { Button("end", {}) }
    }
}
