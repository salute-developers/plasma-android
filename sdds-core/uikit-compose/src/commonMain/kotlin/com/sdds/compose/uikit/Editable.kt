package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.offset
import com.sdds.api.info.compose.ApiName
import com.sdds.api.info.compose.ApiStateSet
import com.sdds.compose.uikit.EditableMeasurePolicy.Companion.FIELD_ID
import com.sdds.compose.uikit.EditableMeasurePolicy.Companion.ICON_ID
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.common.enable
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.editable.EditableMotionStyle
import com.sdds.compose.uikit.motion.components.editable.rememberEditableMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Редактируемое текстовое поле
 *
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param style стиль компонента
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
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    style: EditableStyle = LocalEditableStyle.current,
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
    motion: Motion<EditableMotionStyle> = rememberEditableMotion(
        motionContext = rememberMotionContext(interactionSource = interactionSource),
    ),
) {
    SideEffect {
        motion.context.semanticStateSource.set(
            EditableStates.ReadOnly,
            readOnly,
        )
    }
    val textMeasurer = rememberTextMeasurer()
    val textStyle by style.textStyles.getTextStyleAsState(motion.context, motion.style.textStyle)
    Layout(
        modifier = modifier.enable(enabled = enabled, disabledAlpha = style.disableAlpha),
        measurePolicy = remember(iconPlacement, value, textStyle, singleLine, maxLines) {
            EditableMeasurePolicy(
                iconModePlacement = iconPlacement,
                textMeasurer = textMeasurer,
                value = value,
                textStyle = textStyle,
                singleLine = singleLine,
                maxLines = maxLines,
            )
        },
        content = {
            val textColor by style.colors.textBrush.getBrushAsState(motion.context, motion.style.textColor)
            val cursorColor by style.colors.cursorBrush.getBrushAsState(motion.context, motion.style.cursorColor)
            val newTextStyle = textStyle.copy(brush = textColor, textAlign = textAlign)
            BasicTextField(
                modifier = Modifier
                    .testTag("EditableField")
                    .layoutId(FIELD_ID),
                value = value,
                onValueChange = onValueChange,
                textStyle = newTextStyle,
                singleLine = singleLine,
                readOnly = readOnly,
                enabled = enabled,
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                maxLines = maxLines,
                minLines = minLines,
                visualTransformation = visualTransformation,
                onTextLayout = onTextLayout,
                interactionSource = motion.context.interactionSource,
                cursorBrush = cursorColor,
            )

            icon?.let {
                val padding = style.dimensions.iconMarginValues
                    .getValue(motion.context.interactionSource, motion.context.semanticStateSource)
                Box(
                    modifier = Modifier
                        .padding(start = padding)
                        .layoutId(ICON_ID),
                ) {
                    val iconSize by style.dimensions.iconSizeValues.getValueAsState(motion.context)
                    val iconColor = style.colors.iconBrush.getBrushAsState(motion.context, motion.style.iconColor)
                    CompositionLocalProvider(
                        LocalIconDefaultSize provides DpSize(iconSize, iconSize),
                        LocalTintBrushProducer provides { iconColor.value },
                    ) {
                        icon()
                    }
                }
            }
        },
    )
}

/**
 * Редактируемое текстовое поле
 *
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param style стиль компонента
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
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    style: EditableStyle = LocalEditableStyle.current,
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
    motion: Motion<EditableMotionStyle> = rememberEditableMotion(
        motionContext = rememberMotionContext(interactionSource = interactionSource),
    ),
) {
    var textFieldValueSate by remember {
        mutableStateOf(TextFieldValue(text = value, selection = TextRange(value.length)))
    }
    val textFieldValue = textFieldValueSate.copy(text = value)
    SideEffect {
        if (textFieldValue.selection != textFieldValueSate.selection ||
            textFieldValue.composition != textFieldValueSate.composition
        ) {
            textFieldValueSate = textFieldValue
        }
    }
    var lastTextValue by remember(value) {
        mutableStateOf(value)
    }

    Editable(
        value = textFieldValue,
        onValueChange = { newTextFieldValueState ->
            textFieldValueSate = newTextFieldValueState
            val stringChanged = lastTextValue != newTextFieldValueState.text
            lastTextValue = newTextFieldValueState.text
            if (stringChanged) {
                onValueChange(newTextFieldValueState.text)
            }
        },
        modifier = modifier,
        style = style,
        icon = icon,
        singleLine = singleLine,
        readOnly = readOnly,
        enabled = enabled,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        maxLines = maxLines,
        minLines = minLines,
        textAlign = textAlign,
        iconPlacement = iconPlacement,
        visualTransformation = visualTransformation,
        onTextLayout = onTextLayout,
        interactionSource = interactionSource,
        motion = motion,
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

/**
 * Состояния комопнента [Editable]
 */
@ApiStateSet(components = ["Editable"])
enum class EditableStates : ValueState {
    @ApiName(name = "readonly")
    ReadOnly,
}

private class EditableMeasurePolicy(
    private val iconModePlacement: EditableIconPlacement,
    private val textMeasurer: TextMeasurer,
    private val value: TextFieldValue,
    private val textStyle: TextStyle,
    private val singleLine: Boolean,
    private val maxLines: Int,
) : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

        val iconPlaceable = measurables.firstOrNull { it.layoutId == ICON_ID }
            ?.measure(looseConstraints)

        val originalFieldConstraints = when (iconModePlacement) {
            EditableIconPlacement.Absolute -> constraints
            EditableIconPlacement.Relative -> constraints.offset(-iconPlaceable.widthOrZero())
        }
        val finalConstraints = if (originalFieldConstraints.hasFixedWidth) {
            originalFieldConstraints
        } else {
            val fieldExactWidth = if (singleLine) {
                originalFieldConstraints.constrainWidth(getSingleLineTextWidth())
            } else {
                originalFieldConstraints.constrainWidth(getMultiLineTextWidth(maxLines))
            }
            originalFieldConstraints.copy(
                minWidth = DEFAULT_MIN_WIDTH,
                maxWidth = fieldExactWidth.coerceAtLeast(DEFAULT_MIN_WIDTH),
            )
        }

        val fieldPlaceable = measurables.firstOrNull { it.layoutId == FIELD_ID }
            ?.measure(finalConstraints)

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

    private fun getSingleLineTextWidth(): Int {
        val textLayoutResult = textMeasurer.measure(
            text = value.text,
            style = textStyle,
            maxLines = 1,
        )
        val textWidth = textLayoutResult.size.width
        return textWidth + DEFAULT_CURSOR_WIDTH
    }

    private fun getMultiLineTextWidth(maxLines: Int): Int {
        val textLayoutResult = textMeasurer.measure(
            text = value.text,
            style = textStyle,
            maxLines = maxLines,
        )
        val textWidth = textLayoutResult.size.width
        return textWidth + DEFAULT_CURSOR_WIDTH
    }

    companion object {
        const val FIELD_ID = "field_id"
        const val ICON_ID = "icon_id"

        const val DEFAULT_MIN_WIDTH = 10
        const val DEFAULT_CURSOR_WIDTH = 4
    }
}
