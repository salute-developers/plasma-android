package com.sdds.plasma.homeds.motion.bubble

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [BubbleMotionStyle].
 */
public val LocalBubbleMotionStyle = compositionLocalOf { BubbleMotionStyle.builder().style() }

/**
 * Анимационные (interaction-state) свойства для [BubbleTrigger]/[BubbleHost].
 *
 * Не имеет отношения к таймлайну controlled-разворота/сворачивания бабла — он реализован
 * отдельным `Animatable`-кодом внутри компонента, а не через токен-driven Motion-систему.
 * Здесь описываются только interaction-driven переходы (например, при нажатии).
 *
 * Все свойства по умолчанию — [noMotion] (мгновенный снап, без анимации): `Bubble.Default` пока не
 * задаёт ни одного interactive-варианта, поэтому анимировать нечего — но сами свойства уже готовы
 * принять реальный transition-спек, когда появится дизайн-спека на interactive-состояния.
 */
@Stable
public interface BubbleMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета тела бабла/свёрнутого триггера.
     */
    public val bodyColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета иконки триггера.
     */
    public val iconColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета декоративной обводки-«мерцания».
     */
    public val borderColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета текста содержимого развёрнутого бабла.
     */
    public val textColor: MotionProperty<Brush>

    /**
     * Анимационное свойство диаметра круга-якоря.
     */
    public val circleSize: MotionProperty<Dp>

    /**
     * Анимационное свойство размера иконки триггера.
     */
    public val iconSize: MotionProperty<Dp>

    /**
     * Анимационное свойство радиуса скругления «дальних» углов тела.
     */
    public val bodyCornerRadius: MotionProperty<Dp>

    /**
     * Анимационное свойство радиуса скругления ближнего к кругу-якорю угла тела.
     */
    public val bodyNearCornerRadius: MotionProperty<Dp>

    /**
     * Анимационное свойство минимальной высоты тела.
     */
    public val bodyMinHeight: MotionProperty<Dp>

    /**
     * Анимационное свойство ширины шейки.
     */
    public val neckWidth: MotionProperty<Dp>

    /**
     * Анимационное свойство длины шейки.
     */
    public val neckLength: MotionProperty<Dp>

    /**
     * Анимационное свойство радиуса галтели шейки.
     */
    public val neckFilletRadius: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа содержимого от начального края.
     */
    public val paddingStart: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа содержимого от конечного края.
     */
    public val paddingEnd: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа содержимого от верхнего края.
     */
    public val paddingTop: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа содержимого от нижнего края.
     */
    public val paddingBottom: MotionProperty<Dp>

    public companion object {

        /**
         * Создаёт билдер для построения [BubbleMotionStyle].
         */
        public fun builder(): BubbleMotionStyleBuilder = BubbleMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [BubbleMotionStyle].
 */
@Stable
public interface BubbleMotionStyleBuilder : MotionStyleBuilder<BubbleMotionStyle> {

    /** @see BubbleMotionStyle.bodyColor */
    public fun bodyColor(color: MotionProperty<Brush>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.iconColor */
    public fun iconColor(color: MotionProperty<Brush>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.borderColor */
    public fun borderColor(color: MotionProperty<Brush>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.textColor */
    public fun textColor(color: MotionProperty<Brush>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.circleSize */
    public fun circleSize(size: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.iconSize */
    public fun iconSize(size: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.bodyCornerRadius */
    public fun bodyCornerRadius(radius: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.bodyNearCornerRadius */
    public fun bodyNearCornerRadius(radius: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.bodyMinHeight */
    public fun bodyMinHeight(height: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.neckWidth */
    public fun neckWidth(width: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.neckLength */
    public fun neckLength(length: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.neckFilletRadius */
    public fun neckFilletRadius(radius: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.paddingStart */
    public fun paddingStart(padding: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.paddingEnd */
    public fun paddingEnd(padding: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.paddingTop */
    public fun paddingTop(padding: MotionProperty<Dp>): BubbleMotionStyleBuilder

    /** @see BubbleMotionStyle.paddingBottom */
    public fun paddingBottom(padding: MotionProperty<Dp>): BubbleMotionStyleBuilder
}

@Immutable
private class BubbleMotionStyleImpl(
    override val bodyColor: MotionProperty<Brush>,
    override val iconColor: MotionProperty<Brush>,
    override val borderColor: MotionProperty<Brush>,
    override val textColor: MotionProperty<Brush>,
    override val circleSize: MotionProperty<Dp>,
    override val iconSize: MotionProperty<Dp>,
    override val bodyCornerRadius: MotionProperty<Dp>,
    override val bodyNearCornerRadius: MotionProperty<Dp>,
    override val bodyMinHeight: MotionProperty<Dp>,
    override val neckWidth: MotionProperty<Dp>,
    override val neckLength: MotionProperty<Dp>,
    override val neckFilletRadius: MotionProperty<Dp>,
    override val paddingStart: MotionProperty<Dp>,
    override val paddingEnd: MotionProperty<Dp>,
    override val paddingTop: MotionProperty<Dp>,
    override val paddingBottom: MotionProperty<Dp>,
) : BubbleMotionStyle {

    class Builder : BubbleMotionStyleBuilder {
        private var bodyColor: MotionProperty<Brush>? = null
        private var iconColor: MotionProperty<Brush>? = null
        private var borderColor: MotionProperty<Brush>? = null
        private var textColor: MotionProperty<Brush>? = null
        private var circleSize: MotionProperty<Dp>? = null
        private var iconSize: MotionProperty<Dp>? = null
        private var bodyCornerRadius: MotionProperty<Dp>? = null
        private var bodyNearCornerRadius: MotionProperty<Dp>? = null
        private var bodyMinHeight: MotionProperty<Dp>? = null
        private var neckWidth: MotionProperty<Dp>? = null
        private var neckLength: MotionProperty<Dp>? = null
        private var neckFilletRadius: MotionProperty<Dp>? = null
        private var paddingStart: MotionProperty<Dp>? = null
        private var paddingEnd: MotionProperty<Dp>? = null
        private var paddingTop: MotionProperty<Dp>? = null
        private var paddingBottom: MotionProperty<Dp>? = null

        override fun bodyColor(color: MotionProperty<Brush>): BubbleMotionStyleBuilder = apply {
            this.bodyColor = color
        }

        override fun iconColor(color: MotionProperty<Brush>): BubbleMotionStyleBuilder = apply {
            this.iconColor = color
        }

        override fun borderColor(color: MotionProperty<Brush>): BubbleMotionStyleBuilder = apply {
            this.borderColor = color
        }

        override fun textColor(color: MotionProperty<Brush>): BubbleMotionStyleBuilder = apply {
            this.textColor = color
        }

        override fun circleSize(size: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.circleSize = size
        }

        override fun iconSize(size: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.iconSize = size
        }

        override fun bodyCornerRadius(radius: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.bodyCornerRadius = radius
        }

        override fun bodyNearCornerRadius(radius: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.bodyNearCornerRadius = radius
        }

        override fun bodyMinHeight(height: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.bodyMinHeight = height
        }

        override fun neckWidth(width: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.neckWidth = width
        }

        override fun neckLength(length: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.neckLength = length
        }

        override fun neckFilletRadius(radius: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.neckFilletRadius = radius
        }

        override fun paddingStart(padding: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.paddingStart = padding
        }

        override fun paddingEnd(padding: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.paddingEnd = padding
        }

        override fun paddingTop(padding: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.paddingTop = padding
        }

        override fun paddingBottom(padding: MotionProperty<Dp>): BubbleMotionStyleBuilder = apply {
            this.paddingBottom = padding
        }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): BubbleMotionStyle = BubbleMotionStyleImpl(
            bodyColor = bodyColor ?: noMotion(),
            iconColor = iconColor ?: noMotion(),
            borderColor = borderColor ?: noMotion(),
            textColor = textColor ?: noMotion(),
            circleSize = circleSize ?: noMotion(),
            iconSize = iconSize ?: noMotion(),
            bodyCornerRadius = bodyCornerRadius ?: noMotion(),
            bodyNearCornerRadius = bodyNearCornerRadius ?: noMotion(),
            bodyMinHeight = bodyMinHeight ?: noMotion(),
            neckWidth = neckWidth ?: noMotion(),
            neckLength = neckLength ?: noMotion(),
            neckFilletRadius = neckFilletRadius ?: noMotion(),
            paddingStart = paddingStart ?: noMotion(),
            paddingEnd = paddingEnd ?: noMotion(),
            paddingTop = paddingTop ?: noMotion(),
            paddingBottom = paddingBottom ?: noMotion(),
        )
    }
}
