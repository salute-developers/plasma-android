package com.sdds.plasma.sd.service.compose.sandbox

import android.os.Bundle
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.compose.uikit.fixtures.stories.registerCoreStories
import com.sdds.plasma.sd.service.compose.integration.registerTheme

/**
 * Главная активность приложения, интегрированная с Sandbox-окружением для демонстрации компонентов.
 *
 * Наследуется от [SandboxActivity], которая предоставляет базовую инфраструктуру
 * для отображения сторибука с компонентами. В этой активности происходит
 * инициализация и регистрация всех доступных историй компонентов перед
 * запуском основного интерфейса.
 *
 * @see SandboxActivity
 * @see registerCoreStories
 */
class AppActivity : SandboxActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerCoreStories()
        registerTheme()
    }
}
