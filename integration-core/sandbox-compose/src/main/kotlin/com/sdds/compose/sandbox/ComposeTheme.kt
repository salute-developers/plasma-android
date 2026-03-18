package com.sdds.compose.sandbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.Theme
import com.sdds.sandbox.ThemeManager
import kotlinx.coroutines.flow.Flow

/**
 * Реализация темы для Compose-сторибука, объединяющая компоненты и их стилизацию.
 *
 * Определяет визуальное оформление всех компонентов в рамках одной темы,
 * включая возможность оборачивать контент в общий стилевой контекст (например,
 * MaterialTheme) и поддерживать подтемы для различных вариаций оформления.
 *
 * @param displayName отображаемое название темы
 * @param components провайдер всех компонентов, доступных в данной теме
 * @param themeWrapper композируемая функция-обёртка, применяемая к каждому компоненту
 * для обеспечения единого стилевого контекста (темы)
 * @param subthemes коллекция подтем с их собственными функциями-обёртками,
 * позволяющая переопределять стилизацию для отдельных случаев
 *
 * @see Theme
 * @see ComponentProvider
 * @see SubTheme
 */
class ComposeTheme(
    val displayName: String,
    override val components: ComponentProvider,
    val themeWrapper: @Composable (@Composable () -> Unit) -> Unit,
    val subthemes: Map<SubTheme, @Composable (@Composable () -> Unit) -> Unit> = emptyMap(),
) : Theme {

    companion object {
        /**
         * Тема по умолчанию, используемая когда не требуется дополнительная стилизация.
         *
         * Особенности:
         * - Не содержит зарегистрированных компонентов (пустая коллекция)
         * - Не применяет никаких обёрток к контенту (themeWrapper = { content -> content() })
         * - Не имеет подтем
         *
         * Подходит для базового тестирования компонентов или случаев,
         * когда стилизация полностью определяется внутри самих компонентов.
         */
        val Default = ComposeTheme(
            displayName = "Default",
            components = ComponentProvider.Empty,
            themeWrapper = { it() },
        )
    }
}

/**
 * Тип подтемы, определяющий дополнительные вариации оформления в рамках основной темы.
 *
 * Подтемы позволяют создавать альтернативные стилевые контексты для компонентов,
 * такие как инвертированные цвета, варианты для тёмного/светлого фона и другие
 * модификации внешнего вида. Используются совместно с [ComposeTheme.subthemes]
 * для применения специфических обёрток к компонентам.
 *
 * Каждая подтема имеет строковый ключ, который может использоваться для
 * идентификации и выбора соответствующей стилевой обёртки.
 *
 * @property key уникальный строковый идентификатор подтемы
 *
 * @see ValueState
 * @see ComposeTheme.subthemes
 */
enum class SubTheme(val key: String) : ValueState {
    /**
     * Подтема по умолчанию.
     *
     * Используется, когда не требуется специальной стилизации.
     * Компоненты отображаются в базовом оформлении текущей темы.
     */
    DEFAULT("Default"),

    /**
     * Подтема для отображения на тёмном фоне.
     *
     * Применяется, когда компонент располагается на тёмном фоне
     * и требует адаптации цветов для сохранения контрастности
     * и читаемости.
     */
    ON_DARK("OnDark"),

    /**
     * Подтема для отображения на светлом фоне.
     *
     * Используется для адаптации компонентов при размещении
     * на светлом фоне, обеспечивая правильную цветовую схему.
     */
    ON_LIGHT("OnLight"),

    /**
     * Инвертированная подтема.
     *
     * Применяет инвертирование цветовой схемы компонента,
     * полезно для акцентных состояний или специальных
     * визуальных эффектов.
     */
    INVERSE("Inverse"),
}

/**
 * Текущая Compose-тема в виде потока данных.
 *
 * Предоставляет возможность наблюдать за изменениями текущей темы в сторибуке,
 * автоматически фильтруя и приводя её к типу [ComposeTheme]. Удобно использовать
 * в Compose-окружении для реактивного обновления UI при смене темы.
 *
 * @return [Flow] издающий [ComposeTheme] при каждом изменении темы, если она
 * является Compose-темой. Не-Compose темы игнорируются и не эмитятся.
 *
 * @see ThemeManager.currentTheme
 * @see ComposeTheme
 */
val ThemeManager.currentComposeThemeAsState: State<ComposeTheme>
    @Composable
    get() {
        val theme = currentTheme.collectAsState()
        return remember {
            derivedStateOf {
                (theme.value as? ComposeTheme) ?: ComposeTheme.Default
            }
        }
    }

/**
 * Получает провайдер стилей указанного типа для компонента и варианта оформления.
 *
 * Позволяет динамически получить доступ к конкретному стилевому провайдеру
 * компонента в рамках текущей темы. Используется системой сторибука для
 * управления переключением между различными appearance компонента.
 *
 * @param S тип стиля, должен наследоваться от [Style]
 * @param componentKey уникальный ключ компонента, для которого запрашивается провайдер
 * @param appearance идентификатор варианта оформления компонента
 * @return [ComposeStyleProvider] указанного типа, если компонент и appearance существуют,
 * иначе null
 *
 * @see ComposeTheme.components
 * @see ComponentProvider.get
 */
fun <S : Style> ComposeTheme.getStyleProvider(
    componentKey: ComponentKey,
    appearance: String,
): ComposeStyleProvider<S>? {
    return components.get<ComposeStyleProvider<S>>(componentKey).styleProviders[appearance]
}

/**
 * Получает провайдер стиля по умолчанию для указанного компонента.
 *
 * Возвращает первый зарегистрированный провайдер стилей компонента,
 * который обычно считается стилем по умолчанию. Используется когда
 * конкретный appearance не указан или требуется базовый стиль компонента.
 *
 * @param S тип стиля, должен наследоваться от [Style]
 * @param componentKey уникальный ключ компонента, для которого запрашивается провайдер
 * @return [ComposeStyleProvider] указанного типа для стиля по умолчанию
 *
 * @throws NoSuchElementException если компонент не имеет зарегистрированных стилей
 * @throws ClassCastException если компонент с указанным ключом существует,
 * но его провайдер стилей не соответствует типу [S]
 *
 * @see ComposeTheme.components
 * @see ComponentProvider.get
 */
fun <S : Style> ComposeTheme.defaultStyleProvider(
    componentKey: ComponentKey,
): ComposeStyleProvider<S> {
    return components.get<ComposeStyleProvider<S>>(componentKey).styleProviders.values.first()
}
