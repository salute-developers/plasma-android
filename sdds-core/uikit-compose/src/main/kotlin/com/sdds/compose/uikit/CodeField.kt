package com.sdds.compose.uikit

import androidx.annotation.IntRange
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.internal.animation.rememberShakeAnimationSpec
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInput
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputCaptionAlignment
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputColors
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputCursor
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputDimensions
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputTextStyles
import com.sdds.compose.uikit.internal.codeinput.defaultCodeGroups

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
) {
    val colors = remember(style.colors) {
        BaseCodeInputColors(
            valueColor = style.colors.valueColor,
            captionColor = style.colors.captionColor,
            dotColor = style.colors.dotColor,
            backgroundColor = style.colors.backgroundColor,
        )
    }
    val dimensions = remember(style.dimensions) {
        BaseCodeInputDimensions(
            dotSize = style.dimensions.dotSize,
            height = style.dimensions.height.asStatefulValue(),
            width = style.dimensions.width.asStatefulValue(),
            itemSpacing = style.dimensions.itemSpacing,
            groupSpacing = style.dimensions.groupSpacing,
            captionPadding = style.dimensions.captionSpacing,
        )
    }
    val textStyles = remember(style.captionStyle, style.valueStyle) {
        BaseCodeInputTextStyles(
            valueStyle = style.valueStyle,
            captionStyle = style.captionStyle,
        )
    }
    val cursor = remember(style.colors.cursorColor) {
        BaseCodeInputCursor(color = style.colors.cursorColor.getDefaultValue())
    }
    BaseCodeInput(
        modifier = modifier,
        colors = colors,
        dimensions = dimensions,
        textStyles = textStyles,
        itemShape = style.itemShape,
        groupShape = style.groupShape,
        cursor = cursor,
        onCodeComplete = onCodeComplete,
        isItemValid = isItemValid,
        caption = caption,
        captionAlignment = captionAlignment.toBaseCaptionAlignment(),
        hidden = hidden,
        enabled = enabled,
        interactionSource = interactionSource,
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
