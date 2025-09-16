package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.addOutline
import androidx.compose.ui.graphics.isUnspecified
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.shadow.shadow

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
    val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
    val shape = remember(style.topShape, style.bottomShape) {
        if (style.topShape == style.bottomShape) {
            style.topShape
        } else {
            RoundedCornerShape(
                topStart = style.topShape.topStart,
                topEnd = style.topShape.topEnd,
                bottomStart = style.bottomShape.bottomStart,
                bottomEnd = style.bottomShape.bottomEnd,
            )
        }
    }
    Row(
        modifier = modifier
            .shadow(style.shadow)
            .fillMaxWidth()
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
                top = maxOf(style.dimensions.paddingTop, style.dimensions.dividerThickness),
                bottom = style.dimensions.paddingBottom,
            )
            .background(backgroundColor, shape)
            .drawDivider(
                shape = shape,
                dividerColor = style.colors.dividerColor.colorForInteraction(interactionSource),
                dividerThickness = style.dimensions.dividerThickness,
            )
            .padding(
                start = style.dimensions.contentPaddingStart,
                end = style.dimensions.contentPaddingEnd,
                top = style.dimensions.contentPaddingTop,
                bottom = style.dimensions.contentPaddingBottom,
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(style.dimensions.itemSpacing),
    ) {
        val scope = remember { TabBarScopeImpl() }
        scope.content()
        scope.tabs.forEach { item ->
            Box(
                modifier = Modifier
                    .run {
                        item.weight?.let {
                            Modifier.weight(item.weight)
                        } ?: Modifier
                    },
            ) {
                CompositionLocalProvider(LocalTabBarItemStyle provides style.tabBarItemStyle) {
                    item.content.invoke()
                }
            }
        }
        scope.reset()
    }
}

private fun Modifier.drawDivider(
    shape: CornerBasedShape,
    dividerThickness: Dp,
    dividerColor: Color,
): Modifier {
    val isDividerPresented = !(dividerColor.isUnspecified || dividerThickness == 0.dp)
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
                drawPath(pathWithOffset, dividerColor)
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

@Composable
@Preview(showBackground = true)
private fun TabBarPreview() {
    TabBar(
        modifier = Modifier.padding(top = 20.dp),
        style = TabBarStyle.builder()
            .colors {
                backgroundColor(Color.LightGray)
                dividerColor(Color.Blue)
            }
            .dimensions {
                dividerThickness(2.dp)
            }
            .topShape(RoundedCornerShape(15))
            .bottomShape(RoundedCornerShape(15))
            .style(),
    ) {
        repeat(5) {
            tabItem {
                TabBarItem(
                    isSelected = true,
                    modifier = Modifier,
                    style = TabBarItemStyle.builder()
                        .labelPlacement(TabBarLabelPlacement.Bottom)
                        .colors {
                            backgroundColor(Color.Gray)
                            labelColor(Color.DarkGray)
                        }
                        .shape(CircleShape)
                        .style(),
                    defaultIcon = { Text("D") },
                    selectedIcon = { Text("S") },
                    label = "label",
                ) {
                    Indicator(
                        modifier = Modifier.size(4.dp),
                        style = IndicatorStyle.builder()
                            .color {
                                backgroundColor(Color.Red.asInteractive())
                            }
                            .style(),
                    )
                }
            }
        }
    }
}
