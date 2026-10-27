package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.isSpecified
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.DefaultVerticalArrangement
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.list.ListMotionStyle
import com.sdds.compose.uikit.motion.components.list.rememberListMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент StaticList
 *
 * Статическая (нескроллируемая) вариация компонента [List]: тот же стиль [ListStyle],
 * но содержимое раскладывается обычной `Column` и имеет высоту по содержимому.
 *
 * В отличие от [List], не содержит прокрутки и безопасно вкладывается
 * в прокручиваемые контейнеры (в том числе в `item` компонента [List]) —
 * например для сгруппированных секций списка с общим фоном и разделителями.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param reverseLayout меняет порядок расположения
 * @param verticalArrangement расположение дочерних элементов по вертикали
 * @param horizontalAlignment выравнивание элементов по горизонтали
 * @param contentPadding отступы вокруг контента
 * @param interactionSource источник взаимодействий
 * @param content контент из [ListItem] либо произвольных элементов
 */
@Composable
fun StaticList(
    modifier: Modifier = Modifier,
    style: ListStyle = LocalListStyle.current,
    reverseLayout: Boolean = false,
    verticalArrangement: Arrangement.Vertical = DefaultVerticalArrangement,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    contentPadding: PaddingValues = UnspecifiedPaddingValues,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: StaticListScope.() -> Unit,
) {
    StaticList(
        motion = rememberListMotion(
            motionContext = rememberMotionContext(interactionSource),
        ),
        modifier = modifier,
        style = style,
        reverseLayout = reverseLayout,
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
        contentPadding = contentPadding,
        content = content,
    )
}

/**
 * Компонент StaticList
 *
 * Статическая (нескроллируемая) вариация компонента [List] — см. документацию
 * перегрузки с `interactionSource`.
 *
 * @param motion объект анимаций
 * @param modifier модификатор
 * @param style стиль компонента
 * @param reverseLayout меняет порядок расположения
 * @param verticalArrangement расположение дочерних элементов по вертикали
 * @param horizontalAlignment выравнивание элементов по горизонтали
 * @param contentPadding отступы вокруг контента
 * @param content контент из [ListItem] либо произвольных элементов
 */
@Composable
fun StaticList(
    motion: Motion<ListMotionStyle>,
    modifier: Modifier = Modifier,
    style: ListStyle = LocalListStyle.current,
    reverseLayout: Boolean = false,
    verticalArrangement: Arrangement.Vertical = DefaultVerticalArrangement,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    contentPadding: PaddingValues = UnspecifiedPaddingValues,
    content: StaticListScope.() -> Unit,
) {
    val interactionSource = motion.context.interactionSource
    val resolvedArrangement = if (verticalArrangement == DefaultVerticalArrangement) {
        val gap by style.dimensions.gapValues.getValueAsState(interactionSource)
        if (gap.isSpecified) {
            Arrangement.spacedBy(gap, if (reverseLayout) Alignment.Bottom else Alignment.Top)
        } else if (reverseLayout) {
            Arrangement.Bottom
        } else {
            Arrangement.Top
        }
    } else {
        verticalArrangement
    }
    val resolvedPaddings = if (contentPadding == UnspecifiedPaddingValues) {
        style.dimensions.getContentPaddings(interactionSource)
    } else {
        contentPadding
    }
    val shape = style.shapes.getValue(interactionSource)
    CompositionLocalProvider(
        LocalListItemStyle provides style.listItemStyle,
        LocalDividerStyle provides style.dividerStyle,
    ) {
        val background = style.colors.backgroundBrush.getBrushAsState(
            motion.context,
            motion.style.backgroundColor,
        )
        val staticListScope = StaticListScopeImpl()
        Column(
            modifier = modifier
                .backgroundBrush(
                    brushProducer = { background.value },
                    shape = shape,
                )
                .padding(resolvedPaddings),
            verticalArrangement = resolvedArrangement,
            horizontalAlignment = horizontalAlignment,
        ) {
            staticListScope.content()
            val items = if (reverseLayout) {
                staticListScope.items.asReversed()
            } else {
                staticListScope.items
            }
            items.forEach { item ->
                val key = item.key
                if (key != null) {
                    key(key) { item.content() }
                } else {
                    item.content()
                }
            }
        }
    }
}

/**
 * Контент-контракт компонента [StaticList].
 *
 * Похож на `LazyListScope`, но без lazy-семантики:
 * здесь нет `contentType` (переиспользование элементов отсутствует)
 * и нет `stickyHeader` (в нераскручиваемом контейнере прилипание невозможно).
 */
interface StaticListScope {

    /**
     * Добавляет один элемент.
     *
     * @param key ключ идентичности элемента, должен быть уникальным в пределах списка
     * @param content контент элемента
     */
    fun item(
        key: Any? = null,
        content: @Composable () -> Unit,
    )

    /**
     * Добавляет [count] элементов.
     *
     * @param count количество элементов
     * @param key генератор ключа идентичности по индексу
     * @param itemContent контент элемента по индексу
     */
    fun items(
        count: Int,
        key: ((index: Int) -> Any)? = null,
        itemContent: @Composable (index: Int) -> Unit,
    )
}

/**
 * Собирает контент [StaticListScope] для последующего рендера в `Column`.
 */
private class StaticListScopeImpl : StaticListScope {

    private val _items = mutableListOf<StaticListItem>()

    val items: List<StaticListItem>
        get() = _items

    override fun item(key: Any?, content: @Composable () -> Unit) {
        _items.add(StaticListItem(key, content))
    }

    override fun items(
        count: Int,
        key: ((index: Int) -> Any)?,
        itemContent: @Composable (index: Int) -> Unit,
    ) {
        repeat(count) { index ->
            _items.add(StaticListItem(key?.invoke(index)) { itemContent(index) })
        }
    }
}

private class StaticListItem(
    val key: Any?,
    val content: @Composable () -> Unit,
)
