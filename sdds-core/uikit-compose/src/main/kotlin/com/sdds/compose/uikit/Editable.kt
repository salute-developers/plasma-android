package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.EditableMeasurePolicy.Companion.FIELD_ID
import com.sdds.compose.uikit.EditableMeasurePolicy.Companion.ICON_ID
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero

/**
 * Редактируемое текстовое поле
 *
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param style стиль компонента
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param icon иконка справа
 * @param singleLine если false, поле может быть многострочным
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param maxLines максимальное количество строк
 * @param minLines минимальное количество строк
 * @param textAlign выранивание текста
 * @param iconPlacement режим расположения иконки [EditableIconPlacement].
 * @param visualTransformation фильтр визуального отображения [VisualTransformation].
 * @param onTextLayout колбэк, сигнализирующий об окончания лэйаута текста
 * @param interactionSource источник взаимодействий с полем
 */
@Composable
fun Editable(
    modifier: Modifier = Modifier,
    style: EditableStyle = LocalEditableStyle.current,
    value: TextFieldValue = TextFieldValue(""),
    onValueChange: (TextFieldValue) -> Unit = {},
    icon: @Composable (() -> Unit)? = null,
    singleLine: Boolean = false,
    readOnly: Boolean = false,
    enabled: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    textAlign: TextAlign = TextAlign.Start,
    iconPlacement: EditableIconPlacement = EditableIconPlacement.Absolute,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Layout(
        modifier = modifier,
        measurePolicy = remember(iconPlacement) {
            EditableMeasurePolicy(iconPlacement)
        },
        content = {
            val textColor = style.colors.textColor.colorForInteraction(interactionSource)
            val textStyle = style.textStyle.copy(color = textColor, textAlign = textAlign)
            BasicTextField(
                modifier = Modifier
                    .layoutId(FIELD_ID)
                    .width(IntrinsicSize.Min)
                    .defaultMinSize(minWidth = 20.dp),
                value = value,
                onValueChange = onValueChange,
                textStyle = textStyle,
                singleLine = singleLine,
                readOnly = readOnly,
                enabled = enabled,
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                maxLines = maxLines,
                minLines = minLines,
                visualTransformation = visualTransformation,
                onTextLayout = onTextLayout,
                interactionSource = interactionSource,
                cursorBrush = SolidColor(
                    value = style.colors.cursorColor.colorForInteraction(interactionSource),
                ),
            )

            icon?.let {
                Box(
                    modifier = Modifier
                        .padding(start = style.dimensions.iconMargin)
                        .layoutId(ICON_ID),
                ) {
                    val iconSize = DpSize(style.dimensions.iconSize, style.dimensions.iconSize)
                    val iconColor = style.colors.iconColor.colorForInteraction(interactionSource)
                    CompositionLocalProvider(
                        LocalIconDefaultSize provides iconSize,
                        LocalTint provides iconColor,
                    ) {
                        icon()
                    }
                }
            }
        },
    )
}

/**
 * Режим расположения иконки в компоненте
 */
enum class EditableIconPlacement {
    /**
     * Иконка расположена вне компонента
     */
    Absolute,

    /**
     * Иконка расположена внутри компонента
     */
    Relative,
}

private class EditableMeasurePolicy(
    private val iconModePlacement: EditableIconPlacement,
) : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

        val iconPlaceable = measurables.firstOrNull { it.layoutId == ICON_ID }
            ?.measure(looseConstraints)

        val fieldConstraints = when (iconModePlacement) {
            EditableIconPlacement.Absolute -> constraints
            EditableIconPlacement.Relative -> constraints.offset(-iconPlaceable.widthOrZero())
        }

        val fieldPlaceable = measurables.firstOrNull { it.layoutId == FIELD_ID }
            ?.measure(fieldConstraints)

        val desiredWidth = when (iconModePlacement) {
            EditableIconPlacement.Absolute -> fieldPlaceable.widthOrZero()
            EditableIconPlacement.Relative -> fieldPlaceable.widthOrZero() + iconPlaceable.widthOrZero()
        }

        val desiredHeight = maxOf(fieldPlaceable.heightOrZero(), iconPlaceable.heightOrZero())
        val cWidth = constraints.constrainWidth(desiredWidth)
        val cHeight = constraints.constrainHeight(desiredHeight)

        return layout(
            width = cWidth,
            height = cHeight,
        ) {
            fieldPlaceable?.placeRelative(0, (cHeight - fieldPlaceable.heightOrZero()) / 2)
            iconPlaceable?.placeRelative(
                fieldPlaceable.widthOrZero(),
                (cHeight - iconPlaceable.heightOrZero()) / 2,
            )
        }
    }

    companion object {
        const val FIELD_ID = "field_id"
        const val ICON_ID = "icon_id"
    }
}
