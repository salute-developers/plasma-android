package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.core.token.Token
import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isViewSystemOrAll

/**
 * Интерфейс генератора токенов
 * @author Малышев Александр on 07.03.2024
 */
internal abstract class TokenGenerator<T : Token>(
    private val target: ThemeBuilderTarget,
) : BaseGenerator {

    private var needGenerateCompose: Boolean = false
    private var needGenerateViewSystem: Boolean = false

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
    final override fun generate() {
        if (needGenerateViewSystem) {
            generateViewSystem()
        }

        if (needGenerateCompose) {
            generateCompose()
        }
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