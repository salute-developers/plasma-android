package com.sdds.plugin.themebuilder.internal.validator

/**
 * Интерфейс валидаторов значений токенов.
 *
 * @param T тип значения токена
 */
internal interface TokenValidator<T> {

    /**
     * Запускает проверку значения токена [tokenValue].
     *
     * @param tokenValue значение токена
     * @param tokenName имя токена - используется для сообщений об ошибках.
     */
    fun validate(tokenValue: T, tokenName: String)
}
