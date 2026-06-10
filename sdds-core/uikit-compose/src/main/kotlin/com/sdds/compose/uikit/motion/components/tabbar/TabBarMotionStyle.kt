package com.sdds.compose.uikit.motion.components.tabbar

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion
import com.sdds.compose.uikit.shadow.ShadowAppearance

/**
 * CompositionLocal для [TabBarMotionStyle].
 */
val LocalTabBarMotionStyle = compositionLocalOf {
    TabBarMotionStyle.builder().style()
}

/**
 * Стиль анимаций [com.sdds.compose.uikit.TabBar].
 */
@Stable
interface TabBarMotionStyle : MotionStyle {
    /**
     * Анимация фона.
     */
    val background: MotionProperty<Brush>

    /**
     * Анимация разделителя.
     */
    val divider: MotionProperty<Brush>

    /**
     * Анимация внешнего отступа слева.
     */
    val paddingStart: MotionProperty<Dp>

    /**
     * Анимация внешнего отступа справа.
     */
    val paddingEnd: MotionProperty<Dp>

    /**
     * Анимация внешнего отступа сверху.
     */
    val paddingTop: MotionProperty<Dp>

    /**
     * Анимация внешнего отступа снизу.
     */
    val paddingBottom: MotionProperty<Dp>

    /**
     * Анимация внутреннего отступа слева.
     */
    val contentPaddingStart: MotionProperty<Dp>

    /**
     * Анимация внутреннего отступа справа.
     */
    val contentPaddingEnd: MotionProperty<Dp>

    /**
     * Анимация внутреннего отступа сверху.
     */
    val contentPaddingTop: MotionProperty<Dp>

    /**
     * Анимация внутреннего отступа снизу.
     */
    val contentPaddingBottom: MotionProperty<Dp>

    /**
     * Анимация расстояния между item-ами.
     */
    val itemSpacing: MotionProperty<Dp>

    /**
     * Анимация толщины разделителя.
     */
    val dividerThickness: MotionProperty<Dp>

    /**
     * Анимация радиуса blur-эффекта.
     */
    val backgroundBlurRadius: MotionProperty<Dp>

    /**
     * Анимация верхней формы.
     */
    val topShape: MotionProperty<CornerBasedShape>

    /**
     * Анимация нижней формы.
     */
    val bottomShape: MotionProperty<CornerBasedShape>

    /**
     * Анимация тени.
     */
    val shadow: MotionProperty<ShadowAppearance>

    companion object {
        /**
         * Возвращает builder для [TabBarMotionStyle].
         */
        fun builder(): TabBarMotionStyleBuilder = DefaultTabBarMotionStyle.Builder()
    }
}

/**
 * Builder [TabBarMotionStyle].
 */
interface TabBarMotionStyleBuilder : MotionStyleBuilder<TabBarMotionStyle> {
    /**
     * Устанавливает анимацию фона.
     */
    fun background(background: MotionProperty<Brush>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию разделителя.
     */
    fun divider(divider: MotionProperty<Brush>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию внешнего отступа слева.
     */
    fun paddingStart(paddingStart: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию внешнего отступа справа.
     */
    fun paddingEnd(paddingEnd: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию внешнего отступа сверху.
     */
    fun paddingTop(paddingTop: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию внешнего отступа снизу.
     */
    fun paddingBottom(paddingBottom: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа слева.
     */
    fun contentPaddingStart(contentPaddingStart: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа справа.
     */
    fun contentPaddingEnd(contentPaddingEnd: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа сверху.
     */
    fun contentPaddingTop(contentPaddingTop: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа снизу.
     */
    fun contentPaddingBottom(contentPaddingBottom: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию расстояния между item-ами.
     */
    fun itemSpacing(itemSpacing: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию толщины разделителя.
     */
    fun dividerThickness(dividerThickness: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию радиуса blur-эффекта.
     */
    fun backgroundBlurRadius(backgroundBlurRadius: MotionProperty<Dp>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию верхней формы.
     */
    fun topShape(topShape: MotionProperty<CornerBasedShape>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию нижней формы.
     */
    fun bottomShape(bottomShape: MotionProperty<CornerBasedShape>): TabBarMotionStyleBuilder

    /**
     * Устанавливает анимацию тени.
     */
    fun shadow(shadow: MotionProperty<ShadowAppearance>): TabBarMotionStyleBuilder
}

@Immutable
private data class DefaultTabBarMotionStyle(
    override val background: MotionProperty<Brush>,
    override val divider: MotionProperty<Brush>,
    override val paddingStart: MotionProperty<Dp>,
    override val paddingEnd: MotionProperty<Dp>,
    override val paddingTop: MotionProperty<Dp>,
    override val paddingBottom: MotionProperty<Dp>,
    override val contentPaddingStart: MotionProperty<Dp>,
    override val contentPaddingEnd: MotionProperty<Dp>,
    override val contentPaddingTop: MotionProperty<Dp>,
    override val contentPaddingBottom: MotionProperty<Dp>,
    override val itemSpacing: MotionProperty<Dp>,
    override val dividerThickness: MotionProperty<Dp>,
    override val backgroundBlurRadius: MotionProperty<Dp>,
    override val topShape: MotionProperty<CornerBasedShape>,
    override val bottomShape: MotionProperty<CornerBasedShape>,
    override val shadow: MotionProperty<ShadowAppearance>,
) : TabBarMotionStyle {
    class Builder : TabBarMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null
        private var divider: MotionProperty<Brush>? = null
        private var paddingStart: MotionProperty<Dp>? = null
        private var paddingEnd: MotionProperty<Dp>? = null
        private var paddingTop: MotionProperty<Dp>? = null
        private var paddingBottom: MotionProperty<Dp>? = null
        private var contentPaddingStart: MotionProperty<Dp>? = null
        private var contentPaddingEnd: MotionProperty<Dp>? = null
        private var contentPaddingTop: MotionProperty<Dp>? = null
        private var contentPaddingBottom: MotionProperty<Dp>? = null
        private var itemSpacing: MotionProperty<Dp>? = null
        private var dividerThickness: MotionProperty<Dp>? = null
        private var backgroundBlurRadius: MotionProperty<Dp>? = null
        private var topShape: MotionProperty<CornerBasedShape>? = null
        private var bottomShape: MotionProperty<CornerBasedShape>? = null
        private var shadow: MotionProperty<ShadowAppearance>? = null

        override fun background(background: MotionProperty<Brush>) = apply { this.background = background }
        override fun divider(divider: MotionProperty<Brush>) = apply { this.divider = divider }
        override fun paddingStart(paddingStart: MotionProperty<Dp>) = apply { this.paddingStart = paddingStart }
        override fun paddingEnd(paddingEnd: MotionProperty<Dp>) = apply { this.paddingEnd = paddingEnd }
        override fun paddingTop(paddingTop: MotionProperty<Dp>) = apply { this.paddingTop = paddingTop }
        override fun paddingBottom(paddingBottom: MotionProperty<Dp>) = apply { this.paddingBottom = paddingBottom }
        override fun contentPaddingStart(contentPaddingStart: MotionProperty<Dp>) =
            apply { this.contentPaddingStart = contentPaddingStart }
        override fun contentPaddingEnd(contentPaddingEnd: MotionProperty<Dp>) =
            apply { this.contentPaddingEnd = contentPaddingEnd }
        override fun contentPaddingTop(contentPaddingTop: MotionProperty<Dp>) =
            apply { this.contentPaddingTop = contentPaddingTop }
        override fun contentPaddingBottom(contentPaddingBottom: MotionProperty<Dp>) =
            apply { this.contentPaddingBottom = contentPaddingBottom }
        override fun itemSpacing(itemSpacing: MotionProperty<Dp>) = apply { this.itemSpacing = itemSpacing }
        override fun dividerThickness(dividerThickness: MotionProperty<Dp>) =
            apply { this.dividerThickness = dividerThickness }
        override fun backgroundBlurRadius(backgroundBlurRadius: MotionProperty<Dp>) =
            apply { this.backgroundBlurRadius = backgroundBlurRadius }
        override fun topShape(topShape: MotionProperty<CornerBasedShape>) = apply { this.topShape = topShape }
        override fun bottomShape(bottomShape: MotionProperty<CornerBasedShape>) =
            apply { this.bottomShape = bottomShape }
        override fun shadow(shadow: MotionProperty<ShadowAppearance>) = apply { this.shadow = shadow }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): TabBarMotionStyle = DefaultTabBarMotionStyle(
            background = background ?: noMotion(),
            divider = divider ?: noMotion(),
            paddingStart = paddingStart ?: noMotion(),
            paddingEnd = paddingEnd ?: noMotion(),
            paddingTop = paddingTop ?: noMotion(),
            paddingBottom = paddingBottom ?: noMotion(),
            contentPaddingStart = contentPaddingStart ?: noMotion(),
            contentPaddingEnd = contentPaddingEnd ?: noMotion(),
            contentPaddingTop = contentPaddingTop ?: noMotion(),
            contentPaddingBottom = contentPaddingBottom ?: noMotion(),
            itemSpacing = itemSpacing ?: noMotion(),
            dividerThickness = dividerThickness ?: noMotion(),
            backgroundBlurRadius = backgroundBlurRadius ?: noMotion(),
            topShape = topShape ?: noMotion(),
            bottomShape = bottomShape ?: noMotion(),
            shadow = shadow ?: noMotion(),
        )
    }
}
