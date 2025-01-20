package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.materialShape
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import org.gradle.api.Project
import java.io.Serializable

/**
 * Расширение для плагина ThemeBuilder
 * @author Малышев Александр on 04.03.2024
 */
open class ThemeBuilderExtension {
    internal var target: ThemeBuilderTarget? = null
    internal var ktPackage: String? = null
    internal var resourcesPrefix: String? = null
    internal var viewThemeParents: Set<ViewThemeParent> = emptySet()
    internal var viewShapeAppearanceConfig: Set<ShapeAppearanceConfig> = emptySet()
    internal var themeSource: ThemeBuilderSource? = null
    internal var componentsSource: String? = null
    internal var paletteUrl: String = DEFAULT_PALETTE_URL
    internal var mode: ThemeBuilderMode = ThemeBuilderMode.TOKENS_ONLY
    internal var outputLocation = OutputLocation.BUILD
    internal var dimensionsConfig = DimensionsConfig()
    internal var autoGenerate: Boolean = true

    /**
     * Временный способ установки любого url для конфигов компонентов
     */
    @Deprecated(
        "Для внутреннего использования. Функия будет удалена",
        ReplaceWith("mode(COMPONENTS)"),
    )
    fun componentsSource(url: String) {
        this.componentsSource = url
    }

    /**
     * Устанавливает источник темы по имени [name] и версии [version]
     */
    fun themeSource(
        name: String,
        version: String = ThemeSourceBuilder.VERSION_LATEST,
        alias: String = name,
    ) {
        themeSource = ThemeBuilderSource.withNameAndVersion(name, version, alias)
    }

    /**
     * Устанавливает источник темы по [url]
     */
    fun themeSource(url: String) {
        themeSource = ThemeBuilderSource.withUrl(url)
    }

    /**
     * Конфигурирует источник темы
     */
    fun themeSource(sourceBuilder: ThemeSourceBuilder.() -> Unit) {
        val builder = ThemeSourceBuilder().apply(sourceBuilder)
        val name = builder.name
        val url = builder.url
        val version = builder.version
        val alias = builder.alias
        themeSource = if (url != null) {
            ThemeBuilderSource.withUrl(url, name)
        } else {
            ThemeBuilderSource.withNameAndVersion(name, version, alias)
        }
    }

    /**
     * Устанавливает View фреймворк для генерации темы и токенов
     *
     * @param viewConfigBuilder билдер [ViewConfigBuilder]
     */
    fun view(viewConfigBuilder: ViewConfigBuilder.() -> Unit = {}) {
        val builder = ViewConfigBuilder().apply(viewConfigBuilder)
        viewThemeParents = builder.themeParents
        viewShapeAppearanceConfig = builder.shapeAppearanceConfig
        updateTarget(ThemeBuilderTarget.VIEW_SYSTEM)
    }

    /**
     * Устанавливает compose фреймворк для генерации темы и токенов
     */
    fun compose() {
        updateTarget(ThemeBuilderTarget.COMPOSE)
    }

    /**
     * Устанавливает пакет для генерируемых kotlin-файлов
     */
    fun ktPackage(ktPackage: String) {
        this.ktPackage = ktPackage
    }

    /**
     * Устанавливает префикс для названий ресурсов токенов
     */
    fun resourcesPrefix(prefix: String) {
        this.resourcesPrefix = prefix
    }

    /**
     * Устанавливает url для скачивания палитры
     */
    fun paletteUrl(url: String) {
        this.paletteUrl = url
    }

    /**
     * Устанавливает режим генерации: токены или тема.
     * @see ThemeBuilderMode
     */
    fun mode(mode: ThemeBuilderMode) {
        this.mode = mode
    }

    /**
     * Устанавливает расположение генерируемых файлов.
     * @see OutputLocation
     */
    fun outputLocation(location: OutputLocation) {
        this.outputLocation = location
    }

    /**
     * Если [auto] == true, то генерация темы будет запущена автоматически на этапе preBuild
     */
    fun autoGenerate(auto: Boolean) {
        this.autoGenerate = auto
    }

    /**
     * Устанавливает конфигурацию размеров
     * @see DimensionsConfig
     */
    fun dimensions(dimensionsConfigBuilder: DimensionsConfigBuilder.() -> Unit) {
        val builder = DimensionsConfigBuilder().apply(dimensionsConfigBuilder)
        this.dimensionsConfig = DimensionsConfig(builder.multiplier, builder.breakPoints, builder.fromResources)
    }

    private fun updateTarget(newTarget: ThemeBuilderTarget) {
        if (target == ThemeBuilderTarget.ALL || target == newTarget) return
        target = if (target != null) {
            ThemeBuilderTarget.ALL
        } else {
            newTarget
        }
    }

    companion object {
        private const val DEFAULT_PALETTE_URL =
            "https://raw.githubusercontent.com/salute-developers/plasma/dev/packages/plasma-colors/palette/general.json"

        /**
         * Создает extension [ThemeBuilderExtension]
         */
        fun Project.themeBuilderExt(): ThemeBuilderExtension {
            return extensions.create("themeBuilder", ThemeBuilderExtension::class.java)
        }
    }
}

/**
 * Конфигуратор источника темы
 */
class ThemeSourceBuilder {
    internal var name: String = ThemeBuilderSource.DEFAULT_THEME_NAME
    internal var url: String? = null
    internal var version: String = VERSION_LATEST
    internal var alias: String = name

    /**
     * Устанавливает альтернативное название темы
     */
    fun alias(alias: String) {
        this.alias = alias
    }

    /**
     * Устанавливает кастомный путь к теме
     */
    fun url(url: String) {
        this.url = url
    }

    /**
     * Устанавливает название темы
     */
    fun name(name: String) {
        this.name = name
    }

    /**
     * Устанавливает версию темы
     */
    fun version(version: String) {
        this.version = version
    }

    companion object {

        /**
         * Самая поздняя версия
         */
        const val VERSION_LATEST = "latest"
    }
}

/**
 * Билдер конфига для view
 */
class ViewConfigBuilder {
    private val _themeParents = mutableSetOf<ViewThemeParent>()
    internal val themeParents: Set<ViewThemeParent>
        get() = _themeParents

    internal val shapeAppearanceConfig = mutableSetOf<ShapeAppearanceConfig>()

    /**
     * Указывает родительские темы
     *
     * @param themeParentsBuilder билдер списка родительских тем
     */
    fun themeParents(themeParentsBuilder: ViewParentListBuilder.() -> Unit) {
        val builder = ViewParentListBuilder().apply(themeParentsBuilder)
        if (builder.hasMaterial) shapeAppearanceConfig.add(materialShape())
        _themeParents.clear()
        _themeParents.addAll(builder.themeParents)
    }

    /**
     * Добавляет конфиг [ShapeAppearanceConfig].
     * Добавлять конфиг нужно, когда планируется использование атрибутов cornerSize и cornerFamily не из material.
     * Для material добавлять конфиг нет необходимости, т.к. он добавится автоматически при указании material в качестве родительской темы.
     * @see themeParents
     */
    fun setupShapeAppearance(shapeAppearanceConfig: ShapeAppearanceConfig) {
        this.shapeAppearanceConfig.add(shapeAppearanceConfig)
    }
}

/**
 * Билдер конфигурации размеров
 */
class DimensionsConfigBuilder {
    internal var multiplier: Float = 1f
    internal var breakPoints: BreakPoints = BreakPoints()
    internal var fromResources: Boolean = false

    /**
     * Задает множитель [value] для всех генерируемых размеров
     */
    fun multiplier(value: Float) {
        this.multiplier = value.coerceAtLeast(0f)
    }

    /**
     * Задает брейкпоинты типографики
     */
    fun breakPoints(breakPointsBuilder: BreakPointsBuilder.() -> Unit) {
        val builder = BreakPointsBuilder().apply(breakPointsBuilder)
        this.breakPoints = BreakPoints(builder.medium, builder.large)
    }

    /**
     * Включает/выключает флаг использования размеров из ресурсов.
     * Справедливо для Compose, т.к. в Xml размеры всегда берутся из ресурсов
     */
    fun fromResources(fromResources: Boolean) {
        this.fromResources = fromResources
    }
}

/**
 * Конфигурация размеров
 * @property multiplier множитель для всех размеров
 * @property breakPoints брейкпоинты типографики
 * @property fromResources флаг использования размеров из ресурсов (только для Compose)
 */
data class DimensionsConfig(
    val multiplier: Float = 1f,
    val breakPoints: BreakPoints = BreakPoints(),
    val fromResources: Boolean = false,
) : Serializable

/**
 * Билдер брейкпоинтов типографики
 */
class BreakPointsBuilder {
    internal var medium: Int = BreakPoints.DEFAULT_MEDIUM
    internal var large: Int = BreakPoints.DEFAULT_LARGE

    /**
     * Брейкпоинт типографики класса Medium
     */
    fun medium(point: Int) {
        this.medium = point
    }

    /**
     * Брейкпоинт типографики класса Large
     */
    fun large(point: Int) {
        this.large = point
    }
}

/**
 * Брейкпоинты типографики
 * @property medium нижняя граница ScreenClass.MEDIUM
 * @property large нижняя граница ScreenClass.LARGE
 */
data class BreakPoints(
    val medium: Int = DEFAULT_MEDIUM,
    val large: Int = DEFAULT_LARGE,
) : Serializable {

    companion object {
        /**
         * Значение по умолчанию для брейкпоинта типографики класса Medium
         */
        const val DEFAULT_MEDIUM = 560

        /**
         * Значение по умолчанию для брейкпоинта типографики класса Large
         */
        const val DEFAULT_LARGE = 960
    }
}

/**
 * Билдер списка родительских тем.
 * Позволяет указывать material, appCompat и любые custom темы в качестве родительских.
 */
class ViewParentListBuilder {
    private val _themeParents = mutableSetOf<ViewThemeParent>()
    internal val themeParents: Set<ViewThemeParent>
        get() = _themeParents

    internal var hasMaterial: Boolean = false

    /**
     * Добавляет Material тему в качестве родитльской темы.
     *
     * @param themeSuffix суффикс темы. Например для темы Theme.MaterialComponents.NoActionBar
     * нужно указать суффикс "NoActionBar".
     * Если суффикс не указан, родительская тема будет соответствовать Theme.MaterialComponents
     * и Theme.MaterialComponents.Light
     */
    fun materialComponentsTheme(themeSuffix: String = "") {
        addThemeParent(
            themePrefix = "Theme.MaterialComponents",
            themeSuffix = themeSuffix.validatedSuffix(),
            defaultChildSuffix = "MaterialComponents",
        )
        hasMaterial = true
    }

    /**
     * Добавляет AppCompat тему в качестве родитльской темы.
     *
     * @param themeSuffix суффикс темы. Например для темы Theme.AppCompat.NoActionBar
     * нужно указать суффикс "NoActionBar".
     * Если суффикс не указан, родительская тема будет соответствовать Theme.AppCompat и Theme.AppCompat.Light.
     */
    fun appCompatTheme(themeSuffix: String = "") {
        addThemeParent(
            themePrefix = "Theme.AppCompat",
            themeSuffix = themeSuffix.validatedSuffix(),
            defaultChildSuffix = "AppCompat",
        )
    }

    /**
     * Добавляет любую тему в качестве родитльской темы.
     *
     * @param themeName полное название наследуемой темы. Не должно быть пустым.
     * и в каких файлах ресурсов будут сгенерированы.
     *
     */
    fun customTheme(themeName: String) =
        addThemeParent(themeName = themeName)

    private fun addThemeParent(
        themePrefix: String,
        themeSuffix: String,
        defaultChildSuffix: String,
    ) {
        if (themeSuffix.isEmpty() && themePrefix.isEmpty()) {
            throw ThemeBuilderException("themePrefix or themeSuffix must be defined for parent theme")
        }
        val childSuffix =
            if (themeSuffix.isEmpty()) defaultChildSuffix else "$defaultChildSuffix.$themeSuffix"
        _themeParents.add(
            ViewThemeParent(
                themePrefix = themePrefix,
                themeSuffix = themeSuffix,
                childSuffix = childSuffix,
            ),
        )
    }

    private fun addThemeParent(themeName: String) {
        if (themeName.isEmpty()) throw ThemeBuilderException("themeName must be defined for parent theme")
        _themeParents.add(
            ViewThemeParent(
                themePrefix = themeName,
                childSuffix = themeName,
            ),
        )
    }

    private companion object {

        fun String.validatedSuffix(): String {
            if (this.contains("Light") || this.contains("DayNight")) {
                throw ThemeBuilderException("Suffix $this is not valid for theme builder")
            }
            return this
        }
    }
}

/**
 * Расположение генерируемых файлов
 */
enum class OutputLocation {
    /**
     * Директорию build/ проекта
     */
    BUILD,

    /**
     * Директория src/ проекта
     */
    SRC,
}
