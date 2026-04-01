package com.sdds.compose.sandbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.StyleProvider
import com.sdds.sandbox.StyleReference

/**
 * Ссылка на стиль в Compose-окружении, обеспечивающая ленивое создание стиля.
 *
 * Используется для передачи фабрики стиля между компонентами без немедленного
 * вызова композируемой функции. Это позволяет отложить создание стиля до момента
 * его фактического использования в композиции.
 *
 * @param S тип стиля, должен наследоваться от [Style]
 *
 * @param style композируемая функция-фабрика, создающая экземпляр стиля при вызове
 *
 * @see StyleReference
 * @see ComposeStyleProvider
 */
class ComposeStyleReference<S : Style>(
    private val style: @Composable () -> S,
) : StyleReference<@Composable () -> S> {
    /**
     * Возвращает сохраненную композируемую функцию для создания стиля.
     *
     * @return композируемая функция, создающая экземпляр стиля
     */
    override fun get(): @Composable () -> S {
        return style
    }
}

/**
 * Абстрактный провайдер стилей для Compose-компонентов.
 *
 * Обеспечивает регистрацию и доступ к различным вариантам стилей компонента
 * в сторибуке. Позволяет динамически переключаться между стилями через
 * панель управления и получать актуальный экземпляр стиля в композиции.
 *
 * @param S тип стиля, должен наследоваться от [Style]
 *
 * @see StyleProvider
 * @see ComposeStyleReference
 */
abstract class ComposeStyleProvider<S : Style> : StyleProvider<ComposeStyleReference<S>>() {

    /**
     * Получает экземпляр стиля по его ключу и немедленно создает его.
     *
     * Композируемая функция, которая:
     * 1. Находит зарегистрированный стиль по указанному ключу
     * 2. Вызывает его фабричную функцию для создания конкретного экземпляра
     * 3. Возвращает созданный стиль для использования в UI компонента
     *
     * Должна вызываться только внутри композиции, так как содержит
     * вызов композируемой функции стиля.
     *
     * @param key уникальный идентификатор стиля в провайдере
     * @return экземпляр стиля указанного типа
     */
    @Composable
    fun style(key: String): S {
        return styleReference(key).get().invoke()
    }
}
