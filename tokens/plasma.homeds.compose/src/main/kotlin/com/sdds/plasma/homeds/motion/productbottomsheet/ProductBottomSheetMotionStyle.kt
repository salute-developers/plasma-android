package com.sdds.plasma.homeds.motion.productbottomsheet

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
 * CompositionLocal, предоставляющий текущий [ProductBottomSheetMotionStyle].
 * Используется для доступа к анимационным свойствам ProductBottomSheet внутри Compose-иерархии.
 */
val LocalProductBottomSheetMotionStyle = compositionLocalOf { ProductBottomSheetMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента ProductBottomSheet.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface ProductBottomSheetMotionStyle : MotionStyle {

    /**
     * Анимационное свойство стиля текста заголовка в ProductBottomSheet.
     */
    val titleStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство кисти текста заголовка в ProductBottomSheet.
     */
    val titleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля текста подзаголовка в ProductBottomSheet.
     */
    val subTitleStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство кисти текста подзаголовка в ProductBottomSheet.
     */
    val subtitleColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [ProductBottomSheetMotionStyle].
         */
        fun builder(): ProductBottomSheetMotionStyleBuilder = ProductBottomSheetMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [ProductBottomSheetMotionStyle].
 */
@Stable
interface ProductBottomSheetMotionStyleBuilder : MotionStyleBuilder<ProductBottomSheetMotionStyle> {

    /**
     * Устанавливает анимационное свойство стиля текста заголовка в ProductBottomSheet.
     */
    fun titleStyle(style: MotionProperty<TextStyle>): ProductBottomSheetMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство кисти текста заголовка в ProductBottomSheet.
     */
    fun titleColor(color: MotionProperty<Brush>): ProductBottomSheetMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста подзаголовка в ProductBottomSheet.
     */
    fun subTitleStyle(style: MotionProperty<TextStyle>): ProductBottomSheetMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство кисти текста подзаголовка в ProductBottomSheet.
     */
    fun subTitleColor(color: MotionProperty<Brush>): ProductBottomSheetMotionStyleBuilder
}

@Immutable
private class ProductBottomSheetMotionStyleImpl(
    override val titleStyle: MotionProperty<TextStyle>,
    override val subTitleStyle: MotionProperty<TextStyle>,
    override val titleColor: MotionProperty<Brush>,
    override val subtitleColor: MotionProperty<Brush>,
) : ProductBottomSheetMotionStyle {

    class Builder : ProductBottomSheetMotionStyleBuilder {

        private var titleStyle: MotionProperty<TextStyle>? = null
        private var subTitleStyle: MotionProperty<TextStyle>? = null
        private var titleColor: MotionProperty<Brush>? = null
        private var subtitleColor: MotionProperty<Brush>? = null

        override fun titleStyle(style: MotionProperty<TextStyle>): ProductBottomSheetMotionStyleBuilder = apply {
            this.titleStyle = style
        }

        override fun titleColor(color: MotionProperty<Brush>): ProductBottomSheetMotionStyleBuilder = apply {
            this.titleColor = color
        }

        override fun subTitleStyle(style: MotionProperty<TextStyle>): ProductBottomSheetMotionStyleBuilder = apply {
            this.subTitleStyle = style
        }

        override fun subTitleColor(color: MotionProperty<Brush>): ProductBottomSheetMotionStyleBuilder = apply {
            this.subtitleColor = color
        }

        override fun style(): ProductBottomSheetMotionStyle {
            return ProductBottomSheetMotionStyleImpl(
                titleStyle = titleStyle ?: noMotion(),
                subTitleStyle = subTitleStyle ?: noMotion(),
                titleColor = titleColor ?: noMotion(),
                subtitleColor = subtitleColor ?: noMotion(),
            )
        }
    }
}
