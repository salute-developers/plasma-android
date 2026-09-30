package com.sdds.compose.uikit

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.api.info.compose.ApiStateSet
import com.sdds.compose.uikit.annotations.IntRange
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.isEnabled
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.internal.animation.rememberShakeAnimationSpec
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInput
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputCaptionAlignment
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputColors
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputDimensions
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInputTextStyles
import com.sdds.compose.uikit.internal.codeinput.defaultCodeGroups
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.codeinput.CodeInputMotionStyle
import com.sdds.compose.uikit.motion.components.codeinput.rememberCodeInputMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент CodeInput представляет собой горизонтальный ряд графических элементов (точек).
 * Каждая точка вмещает в себя один символ, введеный с клавиатуры.
 *
 * После каждого ввода символа происходит автоматических переход к следующему.
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
fun CodeInput(
    modifier: Modifier = Modifier,
    style: CodeInputStyle = LocalCodeInputStyle.current,
    @IntRange(from = 2)
    codeLength: Int = 4,
    hidden: Boolean = false,
    isItemValid: (String) -> Boolean = { true },
    onCodeComplete: (String) -> Boolean = { true },
    caption: String? = null,
    captionAlignment: CodeInputCaptionAlignment = CodeInputCaptionAlignment.Center,
    enabled: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    animationSpec: AnimationSpec<Float>? = rememberShakeAnimationSpec(),
    hasItemFocusSelector: Boolean = LocalFocusSelectorSettings.current.isEnabled(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<CodeInputMotionStyle> = rememberCodeInputMotion(
        motionContext = rememberMotionContext(interactionSource = interactionSource),
    ),
) {
    val colors = remember(style.colors) {
        BaseCodeInputColors(
            valueColor = style.colors.codeBrush,
            captionColor = style.colors.captionBrush,
            dotStrokeColor = style.colors.strokeBrush,
            dotColor = style.colors.fillBrush,
        )
    }
    val dimensions = remember(style.dimensions) {
        BaseCodeInputDimensions(
            dotSize = style.dimensions.circleSize,
            dotStrokeWidth = style.dimensions.strokeWidthValues,
            height = style.dimensions.itemHeight,
            width = style.dimensions.itemWidth,
            itemSpacing = style.dimensions.itemSpacingValues,
            groupSpacing = style.dimensions.groupSpacingValues,
            captionPadding = style.dimensions.captionPaddingValues,
        )
    }
    val textStyles = remember(style.captionStyles, style.codeStyles) {
        BaseCodeInputTextStyles(
            valueStyle = style.codeStyles,
            captionStyle = style.captionStyles,
        )
    }
    BaseCodeInput(
        modifier = modifier,
        colors = colors,
        dimensions = dimensions,
        textStyles = textStyles,
        itemShape = null,
        groupShape = null,
        cursor = null,
        onCodeComplete = onCodeComplete,
        isItemValid = isItemValid,
        caption = caption,
        captionAlignment = captionAlignment.toBaseCaptionAlignment(),
        hidden = hidden,
        enabled = enabled,
        motion = motion,
        hasItemFocusSelector = hasItemFocusSelector,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        animationSpec = animationSpec,
        codeGroupInfo = remember(codeLength) { defaultCodeGroups(codeLength) },
    )
}

/**
 * Состояния [CodeInput]
 */
@ApiStateSet(components = ["CodeInput", "CodeField"])
enum class CodeInputStates : ValueState {

    /**
     * Введен некорректный символ или код некорректный
     */
    Error,

    /**
     * Компонент находится в фокусе, ввод не активен.
     */
    Focused,
}

/**
 * Выравнивание текста надписи
 */
enum class CodeInputCaptionAlignment {
    Start, Center
}

internal fun CodeInputCaptionAlignment.toBaseCaptionAlignment(): BaseCodeInputCaptionAlignment =
    when (this) {
        CodeInputCaptionAlignment.Start -> BaseCodeInputCaptionAlignment.Start
        CodeInputCaptionAlignment.Center -> BaseCodeInputCaptionAlignment.Center
    }
