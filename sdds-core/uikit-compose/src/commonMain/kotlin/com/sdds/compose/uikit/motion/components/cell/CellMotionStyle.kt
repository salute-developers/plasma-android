package com.sdds.compose.uikit.motion.components.cell

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
 * CompositionLocal, предоставляющий текущий [CellMotionStyle].
 * Используется для доступа к анимационным свойствам Cell внутри Compose-иерархии.
 */
val LocalCellMotionStyle = compositionLocalOf { CellMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента Cell.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface CellMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета заголовка (title) Cell.
     */
    val titleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля заголовка (title) Cell.
     */
    val titleStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета основного текста (label) Cell.
     */
    val labelColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля основного текста (label) Cell.
     */
    val labelStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета подзаголовка (subtitle) Cell.
     */
    val subtitleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля подзаголовка (subtitle) Cell.
     */
    val subtitleStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета текста disclosure Cell.
     */
    val disclosureTextColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля текста disclosure Cell.
     */
    val disclosureTextStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство иконки disclosure Cell.
     */
    val disclosureIconColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета контента в начале Cell.
     */
    val contentStartColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета контента в конце Cell.
     */
    val contentEndColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [CellMotionStyle].
         */
        fun builder(): CellMotionStyleBuilder = CellMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [CellMotionStyle].
 */
@Stable
interface CellMotionStyleBuilder : MotionStyleBuilder<CellMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета title.
     */
    fun titleColor(color: MotionProperty<Brush>): CellMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля title.
     */
    fun titleStyle(style: MotionProperty<TextStyle>): CellMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    fun labelColor(color: MotionProperty<Brush>): CellMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    fun labelStyle(style: MotionProperty<TextStyle>): CellMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета subTitle.
     */
    fun subtitleColor(color: MotionProperty<Brush>): CellMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля subTitle.
     */
    fun subtitleStyle(style: MotionProperty<TextStyle>): CellMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета текста disclosure.
     */
    fun disclosureTextColor(color: MotionProperty<Brush>): CellMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста disclosure.
     */
    fun disclosureTextStyle(style: MotionProperty<TextStyle>): CellMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета иконки disclosure.
     */
    fun disclosureIconColor(color: MotionProperty<Brush>): CellMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета контента в начале.
     */
    fun contentStartColor(color: MotionProperty<Brush>): CellMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета контента в конце.
     */
    fun contentEndColor(color: MotionProperty<Brush>): CellMotionStyleBuilder
}

@Immutable
private class CellMotionStyleImpl(
    override val titleColor: MotionProperty<Brush>,
    override val titleStyle: MotionProperty<TextStyle>,
    override val labelColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val subtitleColor: MotionProperty<Brush>,
    override val subtitleStyle: MotionProperty<TextStyle>,
    override val disclosureTextColor: MotionProperty<Brush>,
    override val disclosureTextStyle: MotionProperty<TextStyle>,
    override val disclosureIconColor: MotionProperty<Brush>,
    override val contentStartColor: MotionProperty<Brush>,
    override val contentEndColor: MotionProperty<Brush>,
) : CellMotionStyle {

    class Builder : CellMotionStyleBuilder {
        private var labelColor: MotionProperty<Brush>? = null
        private var titleColor: MotionProperty<Brush>? = null
        private var subtitleColor: MotionProperty<Brush>? = null
        private var disclosureTextColor: MotionProperty<Brush>? = null
        private var disclosureIconColor: MotionProperty<Brush>? = null
        private var contentStartColor: MotionProperty<Brush>? = null
        private var contentEndColor: MotionProperty<Brush>? = null
        private var labelStyle: MotionProperty<TextStyle>? = null
        private var titleStyle: MotionProperty<TextStyle>? = null
        private var subtitleStyle: MotionProperty<TextStyle>? = null
        private var disclosureTextStyle: MotionProperty<TextStyle>? = null

        override fun titleColor(color: MotionProperty<Brush>): CellMotionStyleBuilder = apply {
            this.titleColor = color
        }

        override fun titleStyle(style: MotionProperty<TextStyle>): CellMotionStyleBuilder = apply {
            this.titleStyle = style
        }

        override fun labelColor(color: MotionProperty<Brush>) = apply {
            this.labelColor = color
        }

        override fun labelStyle(style: MotionProperty<TextStyle>) = apply {
            this.labelStyle = style
        }

        override fun subtitleColor(color: MotionProperty<Brush>): CellMotionStyleBuilder = apply {
            this.subtitleColor = color
        }

        override fun subtitleStyle(style: MotionProperty<TextStyle>): CellMotionStyleBuilder = apply {
            this.subtitleStyle = style
        }

        override fun disclosureTextColor(color: MotionProperty<Brush>): CellMotionStyleBuilder = apply {
            this.disclosureTextColor = color
        }

        override fun disclosureTextStyle(style: MotionProperty<TextStyle>): CellMotionStyleBuilder = apply {
            this.disclosureTextStyle = style
        }

        override fun disclosureIconColor(color: MotionProperty<Brush>): CellMotionStyleBuilder = apply {
            this.disclosureIconColor = color
        }

        override fun contentStartColor(color: MotionProperty<Brush>): CellMotionStyleBuilder = apply {
            this.contentStartColor = color
        }

        override fun contentEndColor(color: MotionProperty<Brush>): CellMotionStyleBuilder = apply {
            this.contentEndColor = color
        }

        override fun style(): CellMotionStyle {
            return CellMotionStyleImpl(
                labelColor = labelColor ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
                titleColor = titleColor ?: noMotion(),
                titleStyle = titleStyle ?: noMotion(),
                subtitleColor = subtitleColor ?: noMotion(),
                subtitleStyle = subtitleStyle ?: noMotion(),
                disclosureTextColor = disclosureTextColor ?: noMotion(),
                disclosureTextStyle = disclosureTextStyle ?: noMotion(),
                disclosureIconColor = disclosureIconColor ?: noMotion(),
                contentStartColor = contentStartColor ?: noMotion(),
                contentEndColor = contentEndColor ?: noMotion(),
            )
        }
    }
}
