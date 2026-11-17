package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.State
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.toolbar.ToolBarMotionStyle
import com.sdds.compose.uikit.motion.components.toolbar.rememberToolBarMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.shadow.shadow

/**
 * Компонент - вспомогательная панель с набором инструментов для работы
 * на основном экране
 *
 * @param hasDivider отображение разделителя между контентом
 * @param modifier модификатор
 * @param style стиль компонента
 * @param orientation расположение контента
 * @param interactionSource источник взаимодействий
 * @param content контент.
 */
@Composable
fun ToolBar(
    hasDivider: Boolean,
    modifier: Modifier = Modifier,
    style: ToolBarStyle = LocalToolBarStyle.current,
    orientation: ToolBarOrientation = style.orientation,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    content: ToolBarScope.() -> Unit,
) {
    ToolBar(
        hasDivider = hasDivider,
        motion = rememberToolBarMotion(motionContext = rememberMotionContext(interactionSource)),
        modifier = modifier,
        style = style,
        orientation = orientation,
        content = content,
    )
}

/**
 * Компонент - вспомогательная панель с набором инструментов для работы
 * на основном экране
 *
 * @param hasDivider отображение разделителя между контентом
 * @param motion объект анимаций
 * @param modifier модификатор
 * @param style стиль компонента
 * @param orientation расположение контента
 * @param content контент.
 */
@Composable
fun ToolBar(
    hasDivider: Boolean,
    motion: Motion<ToolBarMotionStyle>,
    modifier: Modifier = Modifier,
    style: ToolBarStyle = LocalToolBarStyle.current,
    orientation: ToolBarOrientation = style.orientation,
    content: ToolBarScope.() -> Unit,
) {
    val background = style.colors.backgroundColor.getBrushAsState(motion.context, motion.style.background)
    val shape = style.shapes.getValue(motion.context.interactionSource, motion.context.semanticStateSource)
    val scope = remember { ToolBarScopeImpl() }
    scope.content()
    if (scope.sections.isEmpty()) return
    Box(
        modifier = modifier
            .shadow(style.shadow, shape)
            .backgroundBrush(
                brushProducer = { background.value },
                shape = shape,
            )
            .padding(
                style.dimensions.paddingStartValues.getValue(
                    motion.context.interactionSource,
                    motion.context.semanticStateSource,
                ),
                style.dimensions.paddingTopValues.getValue(
                    motion.context.interactionSource,
                    motion.context.semanticStateSource,
                ),
                style.dimensions.paddingEndValues.getValue(
                    motion.context.interactionSource,
                    motion.context.semanticStateSource,
                ),
                style.dimensions.paddingBottomValues.getValue(
                    motion.context.interactionSource,
                    motion.context.semanticStateSource,
                ),
            ),

    ) {
        val sectionGap = style.dimensions.sectionPaddingValues.getValueAsState(motion.context)
        val dividerPadding = style.dimensions.dividerMarginValues.getValueAsState(motion.context)
        when (orientation) {
            ToolBarOrientation.Vertical -> VerticalContent(hasDivider, style, scope, sectionGap, dividerPadding)
            else -> HorizontalContent(hasDivider, style, scope, sectionGap, dividerPadding)
        }
    }
    scope.reset()
}

@Composable
private fun VerticalContent(
    hasDivider: Boolean,
    style: ToolBarStyle,
    scope: ToolBarScopeImpl,
    sectionGap: State<Dp>,
    dividerPadding: State<Dp>,
) {
    Column(
        modifier = Modifier
            .width(IntrinsicSize.Min),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        CompositionLocalProvider(
            LocalDividerStyle provides style.dividerStyle,
        ) {
            val space = sectionGap.value
            val padding = dividerPadding.value
            scope.sections.forEachIndexed { index, item ->
                val paddingValues = if (scope.sections.size > 1) {
                    when (item) {
                        scope.sections.first() -> PaddingValues(bottom = space)
                        scope.sections.last() -> PaddingValues(top = space)
                        else -> PaddingValues(vertical = space)
                    }
                } else {
                    PaddingValues(0.dp)
                }
                Box(
                    modifier = Modifier.padding(paddingValues = paddingValues),
                ) { item.movableContent.invoke() }
                if (hasDivider && index < scope.sections.lastIndex) {
                    Divider(
                        modifier = Modifier
                            .padding(horizontal = padding),
                        orientation = DividerOrientation.Horizontal,
                    )
                }
            }
        }
    }
}

@Composable
private fun HorizontalContent(
    hasDivider: Boolean,
    style: ToolBarStyle,
    scope: ToolBarScopeImpl,
    sectionGap: State<Dp>,
    dividerPadding: State<Dp>,
) {
    Row(
        modifier = Modifier
            .height(IntrinsicSize.Min),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val space = sectionGap.value
        val padding = dividerPadding.value
        scope.sections.forEachIndexed { index, item ->
            val paddingValues = if (scope.sections.size > 1) {
                when (item) {
                    scope.sections.first() -> PaddingValues(end = space)
                    scope.sections.last() -> PaddingValues(start = space)
                    else -> PaddingValues(horizontal = space)
                }
            } else {
                PaddingValues(0.dp)
            }
            CompositionLocalProvider(
                LocalDividerStyle provides style.dividerStyle,
            ) {
                Box(
                    modifier = Modifier.padding(paddingValues = paddingValues),
                ) { item.movableContent.invoke() }
                if (hasDivider && index < scope.sections.lastIndex) {
                    Divider(
                        modifier = Modifier
                            .padding(vertical = padding),
                        orientation = DividerOrientation.Vertical,
                    )
                }
            }
        }
    }
}

/**
 * Cкоуп [ToolBar]
 */
interface ToolBarScope {

    /**
     * Добавляет кнопку [content] в [ToolBar]
     */
    fun section(content: @Composable () -> Unit)
}

private class ToolBarScopeImpl : ToolBarScope {
    val sections = mutableListOf<ToolBarItem>()
    override fun section(content: @Composable () -> Unit) {
        sections.add(ToolBarItem(content))
    }

    fun reset() {
        sections.clear()
    }

    class ToolBarItem(
        val content: @Composable () -> Unit,
    ) {
        val movableContent = movableContentOf(content)
    }
}

/**
 * Расположение ToolBar
 */
enum class ToolBarOrientation {

    /**
     * Горизонтальное расположение
     */
    Horizontal,

    /**
     * Вертикальное расположение
     */
    Vertical,
}
