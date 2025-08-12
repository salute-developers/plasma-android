package com.sdds.compose.uikit

import androidx.annotation.IntRange
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.internal.codeinput.BaseCodeInput
import com.sdds.compose.uikit.internal.codeinput.CodeInputDefaults.defaultCodeGroups
import com.sdds.compose.uikit.internal.codeinput.rememberShakeAnimationSpec

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
    captionAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    enabled: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    animationSpec: AnimationSpec<Float>? = rememberShakeAnimationSpec(),
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    BaseCodeInput(
        modifier = modifier,
        style = style,
        onCodeComplete = onCodeComplete,
        isItemValid = isItemValid,
        caption = caption,
        captionAlignment = captionAlignment,
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
 * Состояния [CodeInput]
 */
enum class CodeInputStates : ValueState {

    /**
     * Введен некорректный символ или код некорректный
     */
    Error,
}

@Composable
@Preview(showBackground = true)
private fun CodeInputPreview() {
    CodeInput(
        codeLength = 6,
        hidden = false,
        isItemValid = { it != "1" },
        onCodeComplete = { it != "234567" },
        caption = "Caption",
    )
}
