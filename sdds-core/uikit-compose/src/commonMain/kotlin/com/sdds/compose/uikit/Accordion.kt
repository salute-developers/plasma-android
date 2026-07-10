package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier

/**
 * Accordion.
 * Вертикальный список с возможностью показать или скрыть связанный компонент.
 * Ожидает в качестве контента AccordionItem или Divivder.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param content контент
 */
@Composable
fun Accordion(
    modifier: Modifier = Modifier,
    style: AccordionStyle = LocalAccordionStyle.current,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(style.dimensions.itemSpacing),
    ) {
        CompositionLocalProvider(
            LocalAccordionItemStyle provides style.accordionItemStyle,
            LocalDividerStyle provides style.dividerStyle,
        ) {
            content.invoke(this)
        }
    }
}
