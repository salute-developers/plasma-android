package com.sdds.compose.uikit.fs

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp

/**
 * CompositionLocal c [FocusSelectorSettings]
 */
val LocalFocusSelectorSettings = compositionLocalOf { FocusSelectorSettings.builder().build() }

/**
 * Настройки фокус-селектора
 */
interface FocusSelectorSettings {

    /**
     * Вспомогательный объект
     * для выключения FocusSelectorSettings
     */
    object None : FocusSelectorSettings {
        override val border: FocusSelectorBorder = FocusSelectorBorders.none()
        override val scale: FocusSelectorScale = FocusSelectorScales.none()
    }

    /**
     * Параметры Border
     * @see FocusSelectorBorder
     */
    val border: FocusSelectorBorder

    /**
     * Параметры Scale
     * @see FocusSelectorScale
     */
    val scale: FocusSelectorScale

    companion object {

        /**
         * Возвращает экземпляр [FocusSelectorSettingsBuilder]
         */
        fun builder(): FocusSelectorSettingsBuilder = FocusSelectorSettingsBuilderImpl()
    }
}

/**
 * Настройки Border
 */
interface FocusSelectorBorder {

    /**
     * Форма бордера
     * @see Shape
     */
    val shape: Shape

    /**
     * Корректирующее значение формы
     */
    val shapeAdjustment: Dp

    /**
     * Толщина бордера
     */
    val strokeWidth: Dp

    /**
     * Отступ бордера
     */
    val strokeInsets: Dp

    /**
     * Функция-расширение к Modifier, позволяющая
     * применять настройки бордера в классе, реализующем
     * FocusSelectorBorder
     * @param scale корректирующее значение, необходимое для того
     * чтоб бордер и отступ бордера небыли увеличены, если к
     * компоненту применен scale
     * @param componentShape можно передать форму компонента,
     * к которому применяется фокус-селектор, для вычисления
     * формы бордера
     * @param isFocused включение фокусного состояния
     */
    fun Modifier.applyBorderToModifier(
        scale: Float,
        componentShape: Shape? = null,
        isFocused: () -> Boolean,
    ): Modifier
}

/**
 * Настройки Scale
 */
interface FocusSelectorScale {

    /**
     * Величина НА которую будет
     * скорректирован scale
     */
    val scaleFactor: Float

    /**
     * Функция-расширение к Modifier, позволяющая
     * применять настройки скейла в классе, реализующем
     * FocusSelectorScale
     */
    fun Modifier.applyScaleToModifier(
        isFocused: () -> Boolean,
    ): Modifier
}

/**
 * Функция-расширение к Modifier, позволяющая
 * применять FocusSelectorSettings к компоненту
 * @param settings FocusSelectorSettings
 * @see FocusSelectorSettings
 * @param shape можно передать форму компонента,
 * к которому применяется фокус-селектор, для вычисления
 * формы бордера
 * @param isFocused включение фокусного состояния
 */
fun Modifier.focusSelector(
    settings: FocusSelectorSettings,
    shape: Shape? = null,
    isFocused: () -> Boolean,
): Modifier {
    val scale = 1f + settings.scale.scaleFactor
    return this
        .then(settings.scale.run { applyScaleToModifier(isFocused) })
        .then(settings.border.run { applyBorderToModifier(scale, shape, isFocused) })
}

@Immutable
private class DefaultFocusSelectorSettings(
    override val border: FocusSelectorBorder,
    override val scale: FocusSelectorScale,
) : FocusSelectorSettings

/**
 * Builder настроек фокус-селектора
 */
interface FocusSelectorSettingsBuilder {

    /**
     * Устанавливает бордер фокус-селектора
     */
    fun border(border: FocusSelectorBorder): FocusSelectorSettingsBuilder

    /**
     * Устанавливает скейл фокус-селектора
     */
    fun scale(scale: FocusSelectorScale): FocusSelectorSettingsBuilder

    /**
     * Возвращает готовый экземпляр [FocusSelectorSettings]
     */
    fun build(): FocusSelectorSettings
}

@Immutable
private class FocusSelectorSettingsBuilderImpl : FocusSelectorSettingsBuilder {
    private var border: FocusSelectorBorder = FocusSelectorBorders.none()
    private var scale: FocusSelectorScale = FocusSelectorScales.none()

    override fun border(border: FocusSelectorBorder): FocusSelectorSettingsBuilder = apply {
        this.border = border
    }

    override fun scale(scale: FocusSelectorScale): FocusSelectorSettingsBuilder = apply {
        this.scale = scale
    }

    override fun build(): FocusSelectorSettings {
        return DefaultFocusSelectorSettings(
            border = border,
            scale = scale,
        )
    }
}

/**
 * Функция-расширение к FocusSelectorSettings, позволяющая
 * изменять текущие FocusSelectorSettings через копирование
 * новых параметров
 * @param border настройки бордера
 * @see FocusSelectorBorder
 * @param scale настройки скейла
 * @see FocusSelectorScale
 */
fun FocusSelectorSettings.copy(
    border: FocusSelectorBorder = this.border,
    scale: FocusSelectorScale = this.scale,
): FocusSelectorSettings {
    return FocusSelectorSettings
        .builder()
        .border(border)
        .scale(scale)
        .build()
}

/**
 * FocusSelectorSettings включен ли фокус-селектор
 */
fun FocusSelectorSettings.isEnabled(): Boolean = this !is FocusSelectorSettings.None

/**
 * FocusSelectorSettings выключен ли фокус-селектор
 */
fun FocusSelectorSettings.isDisabled(): Boolean = this is FocusSelectorSettings.None
