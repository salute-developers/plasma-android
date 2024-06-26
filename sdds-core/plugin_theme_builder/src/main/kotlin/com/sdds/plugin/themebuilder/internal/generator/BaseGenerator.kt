package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.token.Token

/**
 * Базовый интерфейс генератора.
 *
 * @param Result тип результата генерации.
 * Если возврат результата генерации не предпологается, можно использовать алиас интерфейса [SimpleBaseGenerator]
 *
 * @author Малышев Александр on 07.03.2024
 */
internal interface BaseGenerator<Result> {

    /**
     * Генерирует выходные данные типа [Result]
     */
    fun generate(): Result
}

/**
 * Алиас для генераторов, которые не возвращают результат
 */
internal typealias SimpleBaseGenerator = BaseGenerator<Unit>

/**
 * Интерфейс генератора токенов
 *
 * @param T тип токена
 * @param Result тип результата генерации
 *
 * @author Малышев Александр on 07.03.2024
 */
internal abstract class TokenGenerator<T : Token, Result>(
    private val target: ThemeBuilderTarget,
) : BaseGenerator<Result> {

    private var needGenerateCompose: Boolean = false
    private var needGenerateViewSystem: Boolean = false

    /**
     * Возвращает реультат [Result]
     */
    protected abstract fun collectResult(): Result

    /**
     * Добавляет [token] для генерации данных
     */
    fun addToken(token: T) {
        val result = when (target) {
            ThemeBuilderTarget.VIEW_SYSTEM -> addViewSystemToken(token)
            ThemeBuilderTarget.COMPOSE -> addComposeToken(token)
            ThemeBuilderTarget.ALL -> addViewSystemToken(token) && addComposeToken(token)
        }

        if (!needGenerateViewSystem && target.isViewSystemOrAll && result) {
            needGenerateViewSystem = true
        }

        if (!needGenerateCompose && target.isComposeOrAll && result) {
            needGenerateCompose = true
        }
    }

    /**
     * @see BaseGenerator.generate
     */
    final override fun generate(): Result {
        if (needGenerateViewSystem) {
            generateViewSystem()
        }

        if (needGenerateCompose) {
            generateCompose()
        }
        return collectResult()
    }

    /**
     * Добавляет токен [token] для ViewSystem.
     * @return статус добавления токена
     */
    protected open fun addViewSystemToken(token: T): Boolean = false

    /**
     * Добавляет токен [token] для Compose.
     * @return статус добавления токена
     */
    protected open fun addComposeToken(token: T): Boolean = false

    /**
     * Генерирует файл с токенами для ViewSystem, если хотя бы один токен
     * был успешно добавлен
     */
    protected open fun generateViewSystem() = Unit

    /**
     * Генерирует файл с токенами для Compose, если хотя бы один токен
     * был успешно добавлен
     */
    protected open fun generateCompose() = Unit
}
