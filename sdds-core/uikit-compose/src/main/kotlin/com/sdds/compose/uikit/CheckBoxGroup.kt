package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

/**
 * Компонент [CheckBoxGroup]
 * Вертикальный контейнер для checkBox. Позволяет использовать любые сomposable в качестве элементов.
 * Может содержать рутовый элемент (см. [CheckboxGroupScope.rootCheckbox]) и вложенные элементы
 * (см. [CheckboxGroupScope.checkboxes] и [CheckboxGroupScope.checkbox]).
 *
 * Никак не управляет checked состоянием элементов внутри себя.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param content содержимое контейнера
 */
@Composable
fun CheckBoxGroup(
    modifier: Modifier = Modifier,
    style: CheckBoxGroupStyle = LocalCheckBoxGroupStyle.current,
    content: CheckboxGroupScope.() -> Unit,
) {
    val scope = remember { CheckboxGroupScopeImpl() }
    Column(modifier, style.verticalArrangement) {
        CompositionLocalProvider(LocalCheckBoxStyle provides style.checkBoxStyle) {
            scope.content()
            val rootCheckBoxContent = scope.rootCheckbox
            val childModifier: Modifier
            if (rootCheckBoxContent != null) {
                CheckBoxGroupItemScopeImpl.rootCheckBoxContent()
                childModifier = Modifier.padding(start = style.startIndent)
            } else {
                childModifier = Modifier
            }
            scope.checkboxes.forEach {
                val itemContent = it
                Box(modifier = childModifier) {
                    CheckBoxGroupItemScopeImpl.itemContent()
                }
            }
            scope.reset()
        }
    }
}

/**
 * Cкоуп [CheckBoxGroup]
 */
interface CheckboxGroupScope {

    /**
     * Добавляет рутовый checkbox c контентом [content] в [CheckBoxGroup]
     */
    fun rootCheckbox(content: @Composable CheckboxGroupItemScope.() -> Unit)

    /**
     * Добавляет дочерний (вложенный) checkbox c контентом [content] в [CheckBoxGroup]
     */
    fun checkbox(content: @Composable CheckboxGroupItemScope.() -> Unit)

    /**
     * Добавляет несколько дочерних (вложенных) checkbox c контентом [content] в [CheckBoxGroup]
     */
    fun checkboxes(content: @Composable CheckboxGroupItemScope.() -> Unit)
}

/**
 * Скоуп дочерних элементов [CheckBoxGroup]
 */
interface CheckboxGroupItemScope

private object CheckBoxGroupItemScopeImpl : CheckboxGroupItemScope

private class CheckboxGroupScopeImpl : CheckboxGroupScope {

    var rootCheckbox: (@Composable CheckboxGroupItemScope.() -> Unit)? = null
    val checkboxes = mutableListOf<@Composable CheckboxGroupItemScope.() -> Unit>()
    override fun rootCheckbox(content: @Composable (CheckboxGroupItemScope.() -> Unit)) {
        rootCheckbox = content
    }

    override fun checkbox(content: @Composable (CheckboxGroupItemScope.() -> Unit)) {
        checkboxes.add { content() }
    }

    override fun checkboxes(content: @Composable (CheckboxGroupItemScope.() -> Unit)) {
        checkboxes.add { content() }
    }

    fun reset() {
        checkboxes.clear()
        rootCheckbox = null
    }
}
