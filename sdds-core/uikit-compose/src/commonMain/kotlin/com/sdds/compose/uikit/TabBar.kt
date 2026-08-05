package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.addOutline
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.rememberBlurStyle
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.common.background
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.tabbar.TabBarMotionStyle
import com.sdds.compose.uikit.motion.components.tabbar.rememberTabBarMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.shadow.shadow

/**
 * Компонент для навигации между разделами интерфейса
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param interactionSource источник взаимодействий
 * @param motion объект анимаций
 * @param content контент.
 * Для добавления элементов в контент используется функция TabBarScope.tabItem()
 */
@Composable
fun TabBar(
    motion: Motion<TabBarMotionStyle>,
    modifier: Modifier = Modifier,
    style: TabBarStyle = LocalTabBarStyle.current,
    content: TabBarScope.() -> Unit,
) {
    val backgroundColor = style.colors.background.getBrushAsState(motion.context, motion.style.background)
    val backgroundBlurTint = style.colors.blurTint.getBrushAsState(motion.context, motion.style.background)
    val topShape = style.topShapeValue.getValueAsState(motion.context)
    val bottomShape = style.bottomShapeValue.getValueAsState(motion.context)
    val shadow = style.shadowValue.getValueAsState(motion.context)
    val paddingStart = style.dimensions.paddingStartValue.getDpAsState(motion.context, motion.style.paddingStart)
    val paddingEnd = style.dimensions.paddingEndValue.getDpAsState(motion.context, motion.style.paddingEnd)
    val paddingTop = style.dimensions.paddingTopValue.getDpAsState(motion.context, motion.style.paddingTop)
    val paddingBottom = style.dimensions.paddingBottomValue.getDpAsState(motion.context, motion.style.paddingBottom)
    val contentPaddingStart = style.dimensions.contentPaddingStartValue.getDpAsState(
        motion.context,
        motion.style.contentPaddingStart,
    )
    val contentPaddingEnd = style.dimensions.contentPaddingEndValue.getDpAsState(
        motion.context,
        motion.style.contentPaddingEnd,
    )
    val contentPaddingTop = style.dimensions.contentPaddingTopValue.getDpAsState(
        motion.context,
        motion.style.contentPaddingTop,
    )
    val contentPaddingBottom = style.dimensions.contentPaddingBottomValue.getDpAsState(
        motion.context,
        motion.style.contentPaddingBottom,
    )
    val itemSpacing = style.dimensions.itemSpacingValue.getDpAsState(motion.context, motion.style.itemSpacing)
    val dividerThickness = style.dimensions.dividerThicknessValue.getDpAsState(
        motion.context,
        motion.style.dividerThickness,
    )
    val backgroundBlurRadius = style.dimensions.backgroundBlurRadiusValue.getDpAsState(
        motion.context,
        motion.style.backgroundBlurRadius,
    )
    val dividerColor = style.colors.divider.getBrushAsState(motion.context, motion.style.divider)
    val shape = remember(topShape.value, bottomShape.value) {
        if (topShape.value == bottomShape.value) {
            topShape.value
        } else {
            RoundedCornerShape(
                topStart = topShape.value.topStart,
                topEnd = topShape.value.topEnd,
                bottomStart = bottomShape.value.bottomStart,
                bottomEnd = bottomShape.value.bottomEnd,
            )
        }
    }
    val blurStyle = rememberBlurStyle(
        shape = shape,
        blurRadius = backgroundBlurRadius.value,
        fallbackBackground = backgroundColor.value,
        tintBrush = backgroundBlurTint.value,
    )
    Row(
        modifier = Modifier
            .padding(
                start = paddingStart.value,
                end = paddingEnd.value,
                top = maxOf(paddingTop.value, dividerThickness.value),
                bottom = paddingBottom.value,
            )
            .shadow(shadow.value)
            .then(modifier)
            .background(blurStyle)
            .drawDivider(
                shape = shape,
                dividerBrush = dividerColor.value,
                dividerThickness = dividerThickness.value,
            )
            .padding(
                start = contentPaddingStart.value,
                end = contentPaddingEnd.value,
                top = contentPaddingTop.value,
                bottom = contentPaddingBottom.value,
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(itemSpacing.value),
    ) {
        val scope = remember { TabBarScopeImpl() }
        scope.content()
        scope.tabs.forEach { item ->
            TabBarItemContainer(
                item = item,
                style = style.tabBarItemStyle,
            )
        }
        scope.reset()
    }
}

/**
 * Компонент для навигации между разделами интерфейса
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param interactionSource источник взаимодействий
 * @param content контент.
 * Для добавления элементов в контент используется функция TabBarScope.tabItem()
 */
@Composable
fun TabBar(
    modifier: Modifier = Modifier,
    style: TabBarStyle = LocalTabBarStyle.current,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    content: TabBarScope.() -> Unit,
) {
    val motionInteractionSource = remember(interactionSource) {
        interactionSource as? MutableInteractionSource ?: MutableInteractionSource()
    }
    TabBar(
        motion = rememberTabBarMotion(
            motionContext = rememberMotionContext(motionInteractionSource),
        ),
        modifier = modifier,
        style = style,
        content = content,
    )
}

@Composable
private fun RowScope.TabBarItemContainer(
    item: TabBarScopeImpl.TabItem,
    style: TabBarItemStyle,
) {
    Box(
        modifier = Modifier
            .run {
                item.weight?.let {
                    Modifier.weight(item.weight)
                } ?: Modifier
            },
    ) {
        CompositionLocalProvider(LocalTabBarItemStyle provides style) {
            item.content.invoke()
        }
    }
}

private fun Modifier.drawDivider(
    shape: CornerBasedShape,
    dividerThickness: Dp,
    dividerBrush: androidx.compose.ui.graphics.Brush,
): Modifier {
    val isDividerPresented = dividerThickness != 0.dp
    return if (isDividerPresented) {
        this.drawWithCache {
            val shapeOutline = shape.createOutline(size, layoutDirection, this)
            val path = Path().apply { addOutline(shapeOutline) }
            val pathWithOffset = Path().apply {
                addOutline(shapeOutline)
                translate(Offset(0f, -dividerThickness.toPx()))
            }
            pathWithOffset.op(pathWithOffset, path, PathOperation.Difference)
            onDrawBehind {
                drawPath(pathWithOffset, dividerBrush)
            }
        }
    } else {
        this
    }
}

private class TabBarScopeImpl : TabBarScope {
    val tabs = mutableListOf<TabItem>()

    override fun tabItem(weight: Float?, content: @Composable (() -> Unit)) {
        tabs.add(TabItem(content, weight))
    }

    fun reset() {
        tabs.clear()
    }

    class TabItem(
        val content: @Composable () -> Unit,
        val weight: Float? = null,
    )
}

/**
 * Cкоуп [TabBar]
 */
interface TabBarScope {

    /**
     * Добавляет элемент [content] с весом [weight] в [TabBar].
     * По умолчанию все элементы добавляются с весом 1f, чтобы равномерно занять доступную ширину в TabBar.
     * Если необходимо, чтобы элемент занимал минимально необходимую ширину, нужно указать weight = null.
     */
    fun tabItem(weight: Float? = 1f, content: @Composable () -> Unit)
}
