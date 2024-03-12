package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.token.TokenValue

/**
 * Базовый интерфейс генератора
 * @author Малышев Александр on 07.03.2024
 */
internal interface BaseGenerator {

    /**
     * Генерирует выходные данные
     */
    fun generate()
}

/**
 * Интерфейс генератора токенов
 * @author Малышев Александр on 07.03.2024
 */
internal interface TokenGenerator<T : Token<TokenValue>> : BaseGenerator {

    /**
     * Добавляет [token] для генерации данных
     */
    fun addToken(token: T)
}
