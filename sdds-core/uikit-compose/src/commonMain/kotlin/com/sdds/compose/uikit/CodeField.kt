package com.sdds.compose.uikit

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.annotations.IntRange
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.animation.rememberShakeAnimationSpec
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInput
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputCaptionAlignment
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputColors
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputCursor
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputDimensions
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputTextStyles
import com.sdds.compose.uikit.internal.codeinput.defaultCodeGroups
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.codeField.CodeFieldMotionStyle
import com.sdds.compose.uikit.motion.components.codeinput.rememberCodeFieldMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент CodeField представляет собой горизонтальный ряд текстовых полей.
 * Каждое поле вмещает в себя один символ, введеный с клавиатуры.
 *
 * После каждого ввода символа происходит автоматический переход к следующему.
 * После заполнения всех символов, если код верный, осуществляется автоматических переход к следующему действию.
 * Если код неверный - значения в полях сбрасываются и ввод осуществляется снова с первого символа.
 *
 * Заполнение полей возможно только по порядку.
 * Если требуется вернуться назад к одному из символов - необходимо удалить все впереди стоящие символы тоже.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param codeLength длина кода (количество символов)
 * @param hidden показывает закрашенные точки, если true. Если false - вводимые символы.
 * @param isItemValid колбэк, определяющий корректность введенного символа
 * @param onCodeComplete колбэк, оповещающий об окончании ввода. Должен вернуть true если код верный, false - в противном случае.
 * @param caption надпись
 * @param captionAlignment выравнивание надписи
 * @param enabled включено ли поле ввода
 * @param keyboardOptions [KeyboardOptions]
 * @param keyboardActions [KeyboardActions]
 * @param animationSpec настройки анимации смещения элементов и всего поля при неправильном вводе
 * @param interactionSource источник взаимодействий
 */
@Composable
fun CodeField(
    modifier: Modifier = Modifier,
    style: CodeFieldStyle = LocalCodeFieldStyle.current,
    @IntRange(from = 2)
    codeLength: Int = 4,
    hidden: Boolean = false,
    isItemValid: (String) -> Boolean = { true },
    onCodeComplete: (String) -> Boolean = { true },
    caption: String? = null,
    captionAlignment: CodeFieldCaptionAlignment = CodeFieldCaptionAlignment.Center,
    enabled: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    animationSpec: AnimationSpec<Float>? = rememberShakeAnimationSpec(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<CodeFieldMotionStyle> = rememberCodeFieldMotion(
        motionContext = rememberMotionContext(interactionSource = interactionSource),
    ),
) {
    val colors = remember(style.colors) {
        BaseCodeInputColors(
            valueColor = style.colors.valueBrush,
            captionColor = style.colors.captionBrush,
            dotColor = style.colors.dotBrush,
            backgroundColor = style.colors.backgroundBrush,
            fieldStrokeColor = style.colors.strokeBrush,
        )
    }
    val dimensions = remember(style.dimensions) {
        BaseCodeInputDimensions(
            dotSize = style.dimensions.dotSizeValues,
            height = style.dimensions.heightValues,
            width = style.dimensions.widthValues,
            itemSpacing = style.dimensions.itemSpacingValues,
            groupSpacing = style.dimensions.groupSpacingValues,
            captionPadding = style.dimensions.captionSpacingValues,
            fieldStrokeWidth = style.dimensions.strokeWidth,
        )
    }
    val textStyles = remember(style.captionStyles, style.valueStyles) {
        BaseCodeInputTextStyles(
            valueStyle = style.valueStyles,
            captionStyle = style.captionStyles,
        )
    }
    val cursorColor = style.colors.cursorBrush.getBrushAsState(motion.context, motion.style.cursorColor)
    val cursor = remember(cursorColor) {
        BaseCodeInputCursor(color = { cursorColor.value })
    }
    val itemShape by style.itemShapes.getValueAsState(motion.context)
    val groupShape by style.groupShapes.getValueAsState(motion.context)
    BaseCodeInput(
        modifier = modifier,
        colors = colors,
        dimensions = dimensions,
        textStyles = textStyles,
        itemShape = itemShape,
        groupShape = groupShape,
        cursor = cursor,
        onCodeComplete = onCodeComplete,
        isItemValid = isItemValid,
        caption = caption,
        captionAlignment = captionAlignment.toBaseCaptionAlignment(),
        hidden = hidden,
        enabled = enabled,
        motion = motion,
        hasItemFocusSelector = false,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        animationSpec = animationSpec,
        codeGroupInfo = remember(codeLength) { defaultCodeGroups(codeLength) },
    )
}

/**
 * Выравнивание текста надписи
 */
enum class CodeFieldCaptionAlignment {
    Start, Center
}

internal fun CodeFieldCaptionAlignment.toBaseCaptionAlignment(): BaseCodeInputCaptionAlignment =
    when (this) {
        CodeFieldCaptionAlignment.Start -> BaseCodeInputCaptionAlignment.Start
        CodeFieldCaptionAlignment.Center -> BaseCodeInputCaptionAlignment.Center
    }
