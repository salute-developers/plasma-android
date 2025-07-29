package com.sdds.testing.vs.accordion

import android.content.Context
import android.view.ViewGroup
import androidx.annotation.StyleRes
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Accordion
import com.sdds.uikit.AccordionItem
import com.sdds.uikit.SimpleAccordionAdapter

/**
 * Создаёт и настраивает компонент [Accordion] с заданным стилем и UI-состоянием.
 *
 * @param context Контекст, используемый для создания компонента.
 * @param style Необязательный стиль компонента.
 * @param state Состояние, определяющее количество элементов, наличие разделителя и содержимое.
 * @return Настроенный [Accordion].
 */
fun accordion(
    context: Context,
    @StyleRes style: Int? = null,
    state: AccordionUiState = AccordionUiState(),
): Accordion {
    return Accordion(context.styleWrapper(style))
        .apply {
            adapter = SimpleAccordionAdapter()
            layoutParams = ViewGroup.LayoutParams(
                resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }
        .applyState(state)
}

/**
 * Применяет состояние [AccordionUiState] к компоненту [Accordion].
 *
 * Устанавливает наличие разделителя и наполняет адаптер заданным количеством элементов.
 *
 * @receiver [Accordion], к которому применяется состояние.
 * @param state Состояние, описывающее параметры отображения.
 * @return Обновлённый [Accordion] с применённым состоянием.
 */
fun Accordion.applyState(state: AccordionUiState) = apply {
    val itemAdapter = adapter as SimpleAccordionAdapter
    itemDividerEnabled = state.hasDivider
    itemAdapter.submitList(
        mutableListOf<AccordionItem>().apply {
            repeat(state.amount) {
                add(AccordionItem.simpleItem(it.toLong(), state.title, state.contentText))
            }
        },
    )
}
