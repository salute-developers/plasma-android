package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Компонент ListItem
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param text текст элемента
 * @param disclosureEnabled включена ли иконка
 * @param disclosureIconRes иконка disclosure
 * @param interactionSource источник взаимодействий
 */
@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    style: ListItemStyle = LocalListItemStyle.current,
    text: String,
    disclosureEnabled: Boolean = false,
    @DrawableRes disclosureIconRes: Int? = style.disclosureIconRes,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Cell(
        style = style.toCellStyle(),
        modifier = modifier
            .background(
                color = style.colors.backgroundColor.colorForInteraction(interactionSource),
                shape = style.shape,
            )
            .height(style.dimensions.height)
            .padding(
                start = style.dimensions.paddingStart,
                top = style.dimensions.paddingTop,
                end = style.dimensions.paddingEnd,
                bottom = style.dimensions.paddingBottom,
            ),
        title = AnnotatedString(text),
        gravity = CellGravity.Center,
        disclosureContentEnabled = disclosureEnabled,
        disclosureIconRes = disclosureIconRes,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент ListItem
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param title текст элемента
 * @param disclosureEnabled включена ли иконка
 * @param disclosureIcon иконка
 * @param interactionSource источник взаимодействий
 */
@Composable
@Deprecated("Use ListItem with disclosureIconRes")
fun ListItem(
    modifier: Modifier = Modifier,
    style: ListItemStyle = LocalListItemStyle.current,
    title: String,
    disclosureEnabled: Boolean = false,
    disclosureIcon: Painter? = style.disclosureIcon,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Cell(
        style = style.toCellStyle(),
        modifier = modifier
            .background(
                color = style.colors.backgroundColor.colorForInteraction(interactionSource),
                shape = style.shape,
            )
            .height(style.dimensions.height)
            .padding(
                start = style.dimensions.paddingStart,
                top = style.dimensions.paddingTop,
                end = style.dimensions.paddingEnd,
                bottom = style.dimensions.paddingBottom,
            ),
        title = AnnotatedString(title),
        gravity = CellGravity.Center,
        disclosureEnabled = disclosureEnabled,
        disclosureIcon = disclosureIcon,
        interactionSource = interactionSource,
    )
}

@Composable
private fun ListItemStyle.toCellStyle(): CellStyle {
    return CellStyle.builder().apply {
        titleStyle(titleStyle)
        disclosureIconRes?.let { disclosureIcon(it) }
        colors {
            titleColor(colors.titleColor)
            disclosureIconColor(colors.disclosureIconColor)
        }
        dimensions {
            contentPaddingEnd(dimensions.contentPaddingEnd)
        }
    }.style()
}

@Composable
@Preview(showBackground = true)
private fun ListItemPreview() {
    ListItem(
        style = ListItemStyle.builder()
            .shape(CircleShape)
            .colors {
                backgroundColor(Color.Transparent)
            }
            .dimensions {
                height(48.dp)
            }
            .style(),
        text = "Title",
    )
}
