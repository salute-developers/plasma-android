package com.sdds.uikit.internal.codefield

/**
 * Контент для отображения в поле ввода
 * компонентов CodeField, CodeInput
 */
internal sealed class CodeContent {

    /**
     * Тип контента - символ
     */
    data class Character(val value: Char) : CodeContent()

    /**
     * Тип контента - точка (когда включено скрытие вводимого символа)
     */
    object HiddenDot : CodeContent()

    /**
     * Тип контента - пустое поле
     */
    object Empty : CodeContent()
}
