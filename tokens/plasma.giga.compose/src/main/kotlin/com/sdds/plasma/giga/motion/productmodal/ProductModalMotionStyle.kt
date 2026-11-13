package com.sdds.plasma.giga.motion.productmodal

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
 * CompositionLocal, предоставляющий текущий [ProductModalMotionStyle].
 * Используется для доступа к анимационным свойствам ProductModal внутри Compose-иерархии.
 */
val LocalProductModalMotionStyle = compositionLocalOf { ProductModalMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента ProductModal.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface ProductModalMotionStyle : MotionStyle {

    /**
     * Анимационное свойство стиля текста в header ProductModal.
     */
    val headerTextStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета текста в header ProductModal.
     */
    val headerTextColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля текста в footer ProductModal.
     */
    val footerTextStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета текста в footer ProductModal.
     */
    val footerTextColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [ProductModalMotionStyle].
         */
        fun builder(): ProductModalMotionStyleBuilder = ProductModalMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [ProductModalMotionStyle].
 */
@Stable
interface ProductModalMotionStyleBuilder : MotionStyleBuilder<ProductModalMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета текста в header.
     */
    fun headerTextColor(color: MotionProperty<Brush>): ProductModalMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста в header.
     */
    fun headerTextStyle(style: MotionProperty<TextStyle>): ProductModalMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета текста в footer.
     */
    fun footerTextColor(color: MotionProperty<Brush>): ProductModalMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста в footer.
     */
    fun footerTextStyle(style: MotionProperty<TextStyle>): ProductModalMotionStyleBuilder
}

@Immutable
private class ProductModalMotionStyleImpl(
    override val footerTextColor: MotionProperty<Brush>,
    override val headerTextStyle: MotionProperty<TextStyle>,
    override val headerTextColor: MotionProperty<Brush>,
    override val footerTextStyle: MotionProperty<TextStyle>,
) : ProductModalMotionStyle {

    class Builder : ProductModalMotionStyleBuilder {
        private var headerTextColor: MotionProperty<Brush>? = null
        private var footerTextColor: MotionProperty<Brush>? = null
        private var footerTextStyle: MotionProperty<TextStyle>? = null
        private var headerTextStyle: MotionProperty<TextStyle>? = null

        override fun headerTextColor(color: MotionProperty<Brush>): ProductModalMotionStyleBuilder = apply {
            this.headerTextColor = color
        }

        override fun headerTextStyle(style: MotionProperty<TextStyle>): ProductModalMotionStyleBuilder = apply {
            this.headerTextStyle = style
        }

        override fun footerTextColor(color: MotionProperty<Brush>) = apply {
            this.footerTextColor = color
        }

        override fun footerTextStyle(style: MotionProperty<TextStyle>) = apply {
            this.footerTextStyle = style
        }

        override fun style(): ProductModalMotionStyle {
            return ProductModalMotionStyleImpl(
                headerTextColor = headerTextColor ?: noMotion(),
                footerTextStyle = footerTextStyle ?: noMotion(),
                footerTextColor = footerTextColor ?: noMotion(),
                headerTextStyle = headerTextStyle ?: noMotion(),
            )
        }
    }
}
