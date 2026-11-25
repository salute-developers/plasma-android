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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    val shape by style.shapes.getValueAsState(motion.context)
    val scope = remember { ToolBarScopeImpl() }
    scope.content()
    scope.finish()
    if (scope.sections.isEmpty()) return
    val start by style.dimensions.paddingStartValues.getValueAsState(motion.context)
    val top by style.dimensions.paddingTopValues.getValueAsState(motion.context)
    val end by style.dimensions.paddingEndValues.getValueAsState(motion.context)
    val bottom by style.dimensions.paddingBottomValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .shadow(style.shadow, shape)
            .backgroundBrush(
                brushProducer = { background.value },
                shape = shape,
            )
            .padding(start, top, end, bottom),
    ) {
        val sectionGap = style.dimensions.sectionPaddingValues.getValueAsState(motion.context)
        val dividerPadding = style.dimensions.dividerMarginValues.getValueAsState(motion.context)
        // Снимок секций: дочерние scope могут рекомпоноваться независимо от ToolBar
        // (например, при изменении sectionGap/dividerPadding), когда список уже пересобран
        val sections = scope.sections.toList()
        when (orientation) {
            ToolBarOrientation.Vertical -> VerticalContent(hasDivider, style, sections, sectionGap, dividerPadding)
            else -> HorizontalContent(hasDivider, style, sections, sectionGap, dividerPadding)
        }
    }
}

@Composable
private fun VerticalContent(
    hasDivider: Boolean,
    style: ToolBarStyle,
    sections: List<ToolBarScopeImpl.ToolBarItem>,
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
            sections.forEachIndexed { index, item ->
                val paddingValues = if (sections.size > 1) {
                    when (item) {
                        sections.first() -> PaddingValues(bottom = space)
                        sections.last() -> PaddingValues(top = space)
                        else -> PaddingValues(vertical = space)
                    }
                } else {
                    PaddingValues(0.dp)
                }
                Box(
                    modifier = Modifier.padding(paddingValues = paddingValues),
                ) { item.movableContent.invoke() }
                if (hasDivider && index < sections.lastIndex) {
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
    sections: List<ToolBarScopeImpl.ToolBarItem>,
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
        sections.forEachIndexed { index, item ->
            val paddingValues = if (sections.size > 1) {
                when (item) {
                    sections.first() -> PaddingValues(end = space)
                    sections.last() -> PaddingValues(start = space)
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
                if (hasDivider && index < sections.lastIndex) {
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
    private var index = 0

    override fun section(content: @Composable () -> Unit) {
        // Переиспользуем элемент по индексу: идентичность movableContent должна быть
        // стабильной между рекомпозициями, иначе состояние (remember) внутри секции
        // будет сбрасываться при каждой рекомпозиции ToolBar
        if (index < sections.size) {
            sections[index].content = content
        } else {
            sections.add(ToolBarItem(content))
        }
        index++
    }

    /**
     * Завершает сбор секций текущей рекомпозиции: отбрасывает лишние элементы
     * (если секций стало меньше) и сбрасывает счётчик.
     */
    fun finish() {
        if (sections.size > index) {
            sections.subList(index, sections.size).clear()
        }
        index = 0
    }

    class ToolBarItem(
        content: @Composable () -> Unit,
    ) {
        // Наблюдаемый content: присваивание в section() инвалидирует поддерево секции,
        // поэтому свежая лямбда гарантированно вызовется, даже если группа иначе была бы скипнута
        var content: @Composable () -> Unit by mutableStateOf(content)
        val movableContent = movableContentOf { this.content() }
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
