package com.sdds.serv.sandbox

import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ui.SandboxActivity

/**
 * Главная активность приложения, интегрированная с Sandbox-окружением для демонстрации компонентов.
 *
 * Наследуется от [SandboxActivity], которая предоставляет базовую инфраструктуру
 * для отображения сторибука с компонентами. В этой активности происходит
 * инициализация и регистрация всех доступных историй компонентов перед
 * запуском основного интерфейса.
 *
 * @see SandboxActivity
 */
class AppActivity : SandboxActivity() {

    override fun onBeforeSandboxContent() {
        initializeSddsServSandbox()
    }

    @Composable
    override fun SandboxContent() {
        SddsServSandboxApp()
    }
}
