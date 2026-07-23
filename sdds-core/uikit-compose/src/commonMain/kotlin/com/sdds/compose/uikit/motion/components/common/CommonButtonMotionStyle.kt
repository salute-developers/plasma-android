package com.sdds.compose.uikit.motion.components.common

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [CommonButtonMotionStyle].
 * Используется для доступа к анимационным свойствам компонентов со свойствами как у Button внутри Compose-иерархии.
 */
internal val LocalCommonButtonMotionStyle = compositionLocalOf { CommonButtonMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента компонента.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface CommonButtonMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета фона.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета основного текста (label).
     */
    val labelColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля основного текста (label).
     */
    val labelStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета дополнительного значения (value).
     */
    val valueColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля дополнительного значения (value).
     */
    val valueStyle: MotionProperty<TextStyle>

    companion object {
        /**
         * Создает билдер для построения [CommonButtonMotionStyle].
         */
        fun builder(): CommonButtonMotionStyleBuilder = CommonButtonMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [CommonButtonMotionStyle].
 */
@Stable
interface CommonButtonMotionStyleBuilder : MotionStyleBuilder<CommonButtonMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(background: MotionProperty<Brush>): CommonButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    fun labelColor(label: MotionProperty<Brush>): CommonButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    fun labelStyle(label: MotionProperty<TextStyle>): CommonButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета value.
     */
    fun valueColor(value: MotionProperty<Brush>): CommonButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля value.
     */
    fun valueStyle(value: MotionProperty<TextStyle>): CommonButtonMotionStyleBuilder
}

@Immutable
private class CommonButtonMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val labelColor: MotionProperty<Brush>,
    override val valueColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val valueStyle: MotionProperty<TextStyle>,
) : CommonButtonMotionStyle {

    class Builder : CommonButtonMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null
        private var label: MotionProperty<Brush>? = null
        private var value: MotionProperty<Brush>? = null
        private var labelStyle: MotionProperty<TextStyle>? = null
        private var valueStyle: MotionProperty<TextStyle>? = null

        override fun backgroundColor(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun labelColor(label: MotionProperty<Brush>) = apply {
            this.label = label
        }

        override fun labelStyle(label: MotionProperty<TextStyle>) = apply {
            this.labelStyle = label
        }

        override fun valueColor(value: MotionProperty<Brush>) = apply {
            this.value = value
        }

        override fun valueStyle(value: MotionProperty<TextStyle>) = apply {
            this.valueStyle = value
        }

        override fun style(): CommonButtonMotionStyle {
            return CommonButtonMotionStyleImpl(
                backgroundColor = background ?: noMotion(),
                labelColor = label ?: noMotion(),
                valueColor = value ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
                valueStyle = valueStyle ?: noMotion(),
            )
        }
    }
}
