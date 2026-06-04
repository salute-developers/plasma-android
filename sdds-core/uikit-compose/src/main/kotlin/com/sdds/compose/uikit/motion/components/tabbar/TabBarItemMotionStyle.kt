package com.sdds.compose.uikit.motion.components.tabbar

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для [TabBarItemMotionStyle].
 */
val LocalTabBarItemMotionStyle = compositionLocalOf {
    TabBarItemMotionStyle.builder().style()
}

/**
 * Стиль анимаций [com.sdds.compose.uikit.TabBarItem].
 */
@Stable
interface TabBarItemMotionStyle : MotionStyle {
    /**
     * Анимация цвета фона.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимация цвета label.
     */
    val labelColor: MotionProperty<Brush>

    /**
     * Анимация цвета icon.
     */
    val iconColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля label.
     */
    val labelStyle: MotionProperty<TextStyle>

    /**
     * Анимация внутреннего отступа слева.
     */
    val paddingStart: MotionProperty<Dp>

    /**
     * Анимация внутреннего отступа справа.
     */
    val paddingEnd: MotionProperty<Dp>

    /**
     * Анимация внутреннего отступа сверху.
     */
    val paddingTop: MotionProperty<Dp>

    /**
     * Анимация внутреннего отступа снизу.
     */
    val paddingBottom: MotionProperty<Dp>

    /**
     * Анимация отступа label.
     */
    val labelPadding: MotionProperty<Dp>

    /**
     * Анимация размера icon.
     */
    val iconSize: MotionProperty<Dp>

    /**
     * Анимация минимальной высоты.
     */
    val minHeight: MotionProperty<Dp>

    /**
     * Анимация горизонтального смещения extra.
     */
    val extraOffsetX: MotionProperty<Dp>

    /**
     * Анимация вертикального смещения extra.
     */
    val extraOffsetY: MotionProperty<Dp>

    /**
     * Анимация формы.
     */
    val shape: MotionProperty<Shape>

    companion object {
        /**
         * Возвращает builder для [TabBarItemMotionStyle].
         */
        fun builder(): TabBarItemMotionStyleBuilder = DefaultTabBarItemMotionStyle.Builder()
    }
}

/**
 * Builder [TabBarItemMotionStyle].
 */
interface TabBarItemMotionStyleBuilder : MotionStyleBuilder<TabBarItemMotionStyle> {
    /**
     * Устанавливает анимацию цвета фона.
     */
    fun backgroundColor(backgroundColor: MotionProperty<Brush>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию цвета label.
     */
    fun labelColor(labelColor: MotionProperty<Brush>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию цвета icon.
     */
    fun iconColor(iconColor: MotionProperty<Brush>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    fun labelStyle(labelStyle: MotionProperty<TextStyle>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа слева.
     */
    fun paddingStart(paddingStart: MotionProperty<Dp>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа справа.
     */
    fun paddingEnd(paddingEnd: MotionProperty<Dp>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа сверху.
     */
    fun paddingTop(paddingTop: MotionProperty<Dp>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа снизу.
     */
    fun paddingBottom(paddingBottom: MotionProperty<Dp>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию отступа label.
     */
    fun labelPadding(labelPadding: MotionProperty<Dp>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию размера icon.
     */
    fun iconSize(iconSize: MotionProperty<Dp>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию минимальной высоты.
     */
    fun minHeight(minHeight: MotionProperty<Dp>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию горизонтального смещения extra.
     */
    fun extraOffsetX(extraOffsetX: MotionProperty<Dp>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию вертикального смещения extra.
     */
    fun extraOffsetY(extraOffsetY: MotionProperty<Dp>): TabBarItemMotionStyleBuilder

    /**
     * Устанавливает анимацию формы.
     */
    fun shape(shape: MotionProperty<Shape>): TabBarItemMotionStyleBuilder
}

@Immutable
private data class DefaultTabBarItemMotionStyle(
    override val backgroundColor: MotionProperty<Brush>,
    override val labelColor: MotionProperty<Brush>,
    override val iconColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val paddingStart: MotionProperty<Dp>,
    override val paddingEnd: MotionProperty<Dp>,
    override val paddingTop: MotionProperty<Dp>,
    override val paddingBottom: MotionProperty<Dp>,
    override val labelPadding: MotionProperty<Dp>,
    override val iconSize: MotionProperty<Dp>,
    override val minHeight: MotionProperty<Dp>,
    override val extraOffsetX: MotionProperty<Dp>,
    override val extraOffsetY: MotionProperty<Dp>,
    override val shape: MotionProperty<Shape>,
) : TabBarItemMotionStyle {
    class Builder : TabBarItemMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null
        private var labelColor: MotionProperty<Brush>? = null
        private var iconColor: MotionProperty<Brush>? = null
        private var labelStyle: MotionProperty<TextStyle>? = null
        private var paddingStart: MotionProperty<Dp>? = null
        private var paddingEnd: MotionProperty<Dp>? = null
        private var paddingTop: MotionProperty<Dp>? = null
        private var paddingBottom: MotionProperty<Dp>? = null
        private var labelPadding: MotionProperty<Dp>? = null
        private var iconSize: MotionProperty<Dp>? = null
        private var minHeight: MotionProperty<Dp>? = null
        private var extraOffsetX: MotionProperty<Dp>? = null
        private var extraOffsetY: MotionProperty<Dp>? = null
        private var shape: MotionProperty<Shape>? = null

        override fun backgroundColor(backgroundColor: MotionProperty<Brush>) =
            apply { this.backgroundColor = backgroundColor }

        override fun labelColor(labelColor: MotionProperty<Brush>) = apply { this.labelColor = labelColor }
        override fun iconColor(iconColor: MotionProperty<Brush>) = apply { this.iconColor = iconColor }
        override fun labelStyle(labelStyle: MotionProperty<TextStyle>) = apply { this.labelStyle = labelStyle }
        override fun paddingStart(paddingStart: MotionProperty<Dp>) = apply { this.paddingStart = paddingStart }
        override fun paddingEnd(paddingEnd: MotionProperty<Dp>) = apply { this.paddingEnd = paddingEnd }
        override fun paddingTop(paddingTop: MotionProperty<Dp>) = apply { this.paddingTop = paddingTop }
        override fun paddingBottom(paddingBottom: MotionProperty<Dp>) = apply { this.paddingBottom = paddingBottom }
        override fun labelPadding(labelPadding: MotionProperty<Dp>) = apply { this.labelPadding = labelPadding }
        override fun iconSize(iconSize: MotionProperty<Dp>) = apply { this.iconSize = iconSize }
        override fun minHeight(minHeight: MotionProperty<Dp>) = apply { this.minHeight = minHeight }
        override fun extraOffsetX(extraOffsetX: MotionProperty<Dp>) = apply { this.extraOffsetX = extraOffsetX }
        override fun extraOffsetY(extraOffsetY: MotionProperty<Dp>) = apply { this.extraOffsetY = extraOffsetY }
        override fun shape(shape: MotionProperty<Shape>) = apply { this.shape = shape }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): TabBarItemMotionStyle = DefaultTabBarItemMotionStyle(
            backgroundColor = backgroundColor ?: noMotion(),
            labelColor = labelColor ?: noMotion(),
            iconColor = iconColor ?: noMotion(),
            labelStyle = labelStyle ?: noMotion(),
            paddingStart = paddingStart ?: noMotion(),
            paddingEnd = paddingEnd ?: noMotion(),
            paddingTop = paddingTop ?: noMotion(),
            paddingBottom = paddingBottom ?: noMotion(),
            labelPadding = labelPadding ?: noMotion(),
            iconSize = iconSize ?: noMotion(),
            minHeight = minHeight ?: noMotion(),
            extraOffsetX = extraOffsetX ?: noMotion(),
            extraOffsetY = extraOffsetY ?: noMotion(),
            shape = shape ?: noMotion(),
        )
    }
}
