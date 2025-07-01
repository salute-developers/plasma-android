package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.AnnotatedString
import com.sdds.compose.uikit.internal.cell.BaseCell
import com.sdds.compose.uikit.internal.cell.CellCenterContent
import com.sdds.compose.uikit.internal.common.StyledText

/**
 * Компонент Cell.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param gravity режим выравнивания контента по вертикали
 * @param title тайтл
 * @param label лэйбл
 * @param subtitle сабтайтл
 * @param disclosureEnabled Включает/выключает отображение disclosure (Текст + иконка)
 * @param disclosureText текст disclosure
 * @param disclosureIcon иконка disclosure
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Cell(
    modifier: Modifier = Modifier,
    style: CellStyle = LocalCellStyle.current,
    gravity: CellGravity = CellGravity.Center,
    title: AnnotatedString = AnnotatedString(""),
    subtitle: AnnotatedString = AnnotatedString(""),
    label: AnnotatedString = AnnotatedString(""),
    disclosureEnabled: Boolean = false,
    disclosureIcon: Painter? = null,
    disclosureText: AnnotatedString = AnnotatedString(""),
    startContent: (@Composable RowScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseCell(
        modifier = modifier,
        style = style,
        gravity = gravity,
        centerContent = {
            CellCenterContent(
                title = title,
                label = label,
                subtitle = subtitle,
                style = style,
                interactionSource = interactionSource,
            )
        },
        startContent = startContent,
        endContent = endContent,
        disclosureEnabled = disclosureEnabled,
        disclosureContent = {
            StyledText(
                text = disclosureText,
                textStyle = style.disclosureTextStyle,
                textColor = style.colors.disclosureTextColor.colorForInteraction(
                    interactionSource,
                ),
            )
            (disclosureIcon ?: style.disclosureIcon)?.let {
                Icon(
                    painter = it,
                    contentDescription = "",
                    tint = style.colors.disclosureIconColor.colorForInteraction(
                        interactionSource,
                    ),
                )
            }
        },
        interactionSource = interactionSource,
    )
}

/**
 * Компонент Cell.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param gravity режим выравнивания контента по вертикали
 * @param disclosureEnabled Включает/выключает отображение disclosure (Текст + иконка)
 * @param disclosureContent контент disclosure
 * @param centerContent контент в центре
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param interactionSource источник взаимодействий
 */
@Composable
@NonRestartableComposable
fun Cell(
    modifier: Modifier = Modifier,
    style: CellStyle = LocalCellStyle.current,
    gravity: CellGravity = CellGravity.Center,
    disclosureEnabled: Boolean = false,
    disclosureContent: (@Composable RowScope.() -> Unit)? = null,
    startContent: (@Composable RowScope.() -> Unit)? = null,
    centerContent: (@Composable ColumnScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseCell(
        modifier = modifier,
        style = style,
        gravity = gravity,
        disclosureEnabled = disclosureEnabled,
        disclosureContent = disclosureContent,
        startContent = startContent,
        centerContent = centerContent,
        endContent = endContent,
        interactionSource = interactionSource,
    )
}

/**
 * Выравнивание контента внутри [Cell]
 */
enum class CellGravity {
    /**
     * Контент выравнивается по верху
     */
    Top,

    /**
     * Контент выравнивается по середине
     */
    Center,

    /**
     * Контент выравнивается по низу
     */
    Bottom,
}
