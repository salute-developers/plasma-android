package com.sdds.compose.uikit

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.internal.common.background

/**
 * Элемент компонента выбора [Select].
 * Поддерживает представления одиночного (radio) и множественного (checkbox) выбора.
 *
 * Представляет собой строку с элементом управления слева и пользовательским контентом справа.
 * Внешний вид компонента настраивается через [SelectItemStyle].
 *
 * @param checked Флаг состояния выбора элемента. Определяет отображение элемента управления.
 * @param onClick Обработчик, вызываемый при клике на элемент. Должен изменять состояние [checked].
 * @param modifier Модификатор для настройки внешнего вида и расположения компонента.
 * @param style Стиль компонента, определяющий цвета, размеры и форму. По умолчанию используется [LocalSelectItemStyle.current].
 * @param enabled Флаг доступности компонента. Если `false`, компонент отображается с пониженной прозрачностью и не реагирует на клики.
 * @param interactionSource Источник взаимодействий для отслеживания состояний (наведение, нажатие и т.д.).
 * @param content Основной контент элемента справа от элемента управления.
 *
 * @see SelectItemStyle Стиль компонента выбора
 * @see SelectItemType Тип выбора (одиночный/множественный)
 */
@Composable
fun SelectItem(
    checked: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SelectItemStyle = LocalSelectItemStyle.current,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    Row(
        modifier = modifier
            .alpha(if (enabled) 1f else style.disableAlpha)
            .background(
                color = style.colors.backgroundColor.colorForInteraction(interactionSource),
                shape = style.shape,
            )
            .heightIn(min = style.dimensions.height)
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
                top = style.dimensions.paddingTop,
                bottom = style.dimensions.paddingBottom,
            )
            .clickable(
                enabled = enabled,
                indication = null,
                interactionSource = interactionSource,
            ) {
                onClick.invoke()
            },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(end = style.dimensions.controlMargin)
                .size(style.dimensions.controlSize),
        ) {
            CompositionLocalProvider(
                LocalTint provides style.colors.iconColor.colorForInteraction(interactionSource),
                LocalCheckBoxStyle provides style.checkBoxStyle,
            ) {
                val controlContent: @Composable () -> Unit = {
                    when (style.itemType) {
                        SelectItemType.Single -> {
                            val icon = style.icon
                            if (checked && icon != null) {
                                Icon(
                                    painter = painterResource(icon),
                                    contentDescription = "",
                                )
                            }
                        }

                        SelectItemType.Multiple -> {
                            CheckBox(enabled = enabled, checked = checked)
                        }
                    }
                }
                controlContent()
            }
        }
        Box { content() }
    }
}

/**
 * Тип элемента выбора [SelectItem]
 */
enum class SelectItemType {
    /**
     * Тип элемента для одиночного выбора
     */
    Single,

    /**
     * Тип элемента для множественного выбора
     */
    Multiple,
}

@Composable
@Preview(showBackground = true)
private fun SelectItemPreview() {
    LazyColumn {
        items(3) {
            var checked by remember { mutableStateOf(false) }
            SelectItem(
                checked = checked,
                onClick = {
                    checked = !checked
                    Log.e("testtag", "click")
                },
            ) {
                Cell(
                    label = AnnotatedString("Label"),
                    title = AnnotatedString("Title"),
                    subtitle = AnnotatedString("Subtitle"),
                    disclosureIconRes = null,
                )
            }
        }
    }
}
