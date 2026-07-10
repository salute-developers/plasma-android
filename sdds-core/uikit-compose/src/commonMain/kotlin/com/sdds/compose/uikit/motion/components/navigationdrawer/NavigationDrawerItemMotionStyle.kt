package com.sdds.compose.uikit.motion.components.navigationdrawer

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для [NavigationDrawerItemMotionStyle].
 */
val LocalNavigationDrawerItemMotionStyle = compositionLocalOf {
    NavigationDrawerItemMotionStyle.builder().style()
}

/**
 * Стиль анимаций [com.sdds.compose.uikit.NavigationDrawerItem].
 */
@Stable
interface NavigationDrawerItemMotionStyle : MotionStyle {
    /**
     * Анимация фона item-а.
     */
    val background: MotionProperty<Brush>

    /**
     * Анимация icon/start кисти.
     */
    val icon: MotionProperty<Brush>

    /**
     * Анимация высоты item-а.
     */
    val minHeight: MotionProperty<Dp>

    /**
     * Анимация размера icon/start зоны.
     */
    val iconSize: MotionProperty<Dp>

    /**
     * Анимация горизонтального отступа indicator-а.
     */
    val indicatorOffsetX: MotionProperty<Dp>

    /**
     * Анимация вертикального отступа indicator-а.
     */
    val indicatorOffsetY: MotionProperty<Dp>

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
     * Анимационное свойство цвета title.
     */
    val titleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля title.
     */
    val titleStyle: MotionProperty<TextStyle>

    /**
     * Enter transition для center content.
     */
    val centerContentEnter: EnterTransition

    /**
     * Exit transition для center content.
     */
    val centerContentExit: ExitTransition

    /**
     * Enter transition для collapsed indicator в start-зоне.
     */
    val startIndicatorEnter: EnterTransition

    /**
     * Exit transition для collapsed indicator в start-зоне.
     */
    val startIndicatorExit: ExitTransition

    /**
     * Enter transition для end content.
     */
    val endContentEnter: EnterTransition

    /**
     * Exit transition для end content.
     */
    val endContentExit: ExitTransition

    companion object {
        /**
         * Возвращает builder [NavigationDrawerItemMotionStyle].
         */
        fun builder(): NavigationDrawerItemMotionStyleBuilder = DefaultNavigationDrawerItemMotionStyle.Builder()
    }
}

/**
 * Builder [NavigationDrawerItemMotionStyle].
 */
interface NavigationDrawerItemMotionStyleBuilder : MotionStyleBuilder<NavigationDrawerItemMotionStyle> {
    /**
     * Устанавливает анимацию фона.
     */
    fun background(background: MotionProperty<Brush>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимацию icon/start кисти.
     */
    fun icon(icon: MotionProperty<Brush>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимацию высоты item-а.
     */
    fun minHeight(minHeight: MotionProperty<Dp>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимацию размера icon/start зоны.
     */
    fun iconSize(iconSize: MotionProperty<Dp>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимацию горизонтального отступа indicator-а.
     */
    fun indicatorOffsetX(indicatorOffsetX: MotionProperty<Dp>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимацию вертикального отступа indicator-а.
     */
    fun indicatorOffsetY(indicatorOffsetY: MotionProperty<Dp>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа слева.
     */
    fun paddingStart(paddingStart: MotionProperty<Dp>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа справа.
     */
    fun paddingEnd(paddingEnd: MotionProperty<Dp>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа сверху.
     */
    fun paddingTop(paddingTop: MotionProperty<Dp>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимацию внутреннего отступа снизу.
     */
    fun paddingBottom(paddingBottom: MotionProperty<Dp>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает enter transition для center content.
     */
    fun centerContentEnter(centerContentEnter: EnterTransition): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает exit transition для center content.
     */
    fun centerContentExit(centerContentExit: ExitTransition): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает enter transition для collapsed indicator в start-зоне.
     */
    fun startIndicatorEnter(startIndicatorEnter: EnterTransition): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает exit transition для collapsed indicator в start-зоне.
     */
    fun startIndicatorExit(startIndicatorExit: ExitTransition): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает enter transition для end content.
     */
    fun endContentEnter(endContentEnter: EnterTransition): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает exit transition для end content.
     */
    fun endContentExit(endContentExit: ExitTransition): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета title.
     */
    fun titleColor(color: MotionProperty<Brush>): NavigationDrawerItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля title.
     */
    fun titleStyle(style: MotionProperty<TextStyle>): NavigationDrawerItemMotionStyleBuilder
}

@Immutable
private data class DefaultNavigationDrawerItemMotionStyle(
    override val background: MotionProperty<Brush>,
    override val icon: MotionProperty<Brush>,
    override val minHeight: MotionProperty<Dp>,
    override val iconSize: MotionProperty<Dp>,
    override val indicatorOffsetX: MotionProperty<Dp>,
    override val indicatorOffsetY: MotionProperty<Dp>,
    override val paddingStart: MotionProperty<Dp>,
    override val paddingEnd: MotionProperty<Dp>,
    override val paddingTop: MotionProperty<Dp>,
    override val paddingBottom: MotionProperty<Dp>,
    override val centerContentEnter: EnterTransition,
    override val centerContentExit: ExitTransition,
    override val startIndicatorEnter: EnterTransition,
    override val startIndicatorExit: ExitTransition,
    override val endContentEnter: EnterTransition,
    override val endContentExit: ExitTransition,
    override val titleColor: MotionProperty<Brush>,
    override val titleStyle: MotionProperty<TextStyle>,
) : NavigationDrawerItemMotionStyle {
    class Builder : NavigationDrawerItemMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null
        private var icon: MotionProperty<Brush>? = null
        private var minHeight: MotionProperty<Dp>? = null
        private var iconSize: MotionProperty<Dp>? = null
        private var indicatorOffsetX: MotionProperty<Dp>? = null
        private var indicatorOffsetY: MotionProperty<Dp>? = null
        private var paddingStart: MotionProperty<Dp>? = null
        private var paddingEnd: MotionProperty<Dp>? = null
        private var paddingTop: MotionProperty<Dp>? = null
        private var paddingBottom: MotionProperty<Dp>? = null
        private var centerContentEnter: EnterTransition? = null
        private var centerContentExit: ExitTransition? = null
        private var startIndicatorEnter: EnterTransition? = null
        private var startIndicatorExit: ExitTransition? = null
        private var endContentEnter: EnterTransition? = null
        private var endContentExit: ExitTransition? = null
        private var titleColor: MotionProperty<Brush>? = null
        private var titleStyle: MotionProperty<TextStyle>? = null

        override fun background(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun icon(icon: MotionProperty<Brush>) = apply {
            this.icon = icon
        }

        override fun minHeight(minHeight: MotionProperty<Dp>) = apply {
            this.minHeight = minHeight
        }

        override fun iconSize(iconSize: MotionProperty<Dp>) = apply {
            this.iconSize = iconSize
        }

        override fun indicatorOffsetX(indicatorOffsetX: MotionProperty<Dp>) = apply {
            this.indicatorOffsetX = indicatorOffsetX
        }

        override fun indicatorOffsetY(indicatorOffsetY: MotionProperty<Dp>) = apply {
            this.indicatorOffsetY = indicatorOffsetY
        }

        override fun paddingStart(paddingStart: MotionProperty<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: MotionProperty<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: MotionProperty<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: MotionProperty<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun centerContentEnter(centerContentEnter: EnterTransition) = apply {
            this.centerContentEnter = centerContentEnter
        }

        override fun centerContentExit(centerContentExit: ExitTransition) = apply {
            this.centerContentExit = centerContentExit
        }

        override fun startIndicatorEnter(startIndicatorEnter: EnterTransition) = apply {
            this.startIndicatorEnter = startIndicatorEnter
        }

        override fun startIndicatorExit(startIndicatorExit: ExitTransition) = apply {
            this.startIndicatorExit = startIndicatorExit
        }

        override fun endContentEnter(endContentEnter: EnterTransition) = apply {
            this.endContentEnter = endContentEnter
        }

        override fun endContentExit(endContentExit: ExitTransition) = apply {
            this.endContentExit = endContentExit
        }

        override fun titleColor(color: MotionProperty<Brush>) = apply {
            this.titleColor = color
        }

        override fun titleStyle(style: MotionProperty<TextStyle>) = apply {
            this.titleStyle = style
        }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): NavigationDrawerItemMotionStyle {
            return DefaultNavigationDrawerItemMotionStyle(
                background = background ?: noMotion(),
                icon = icon ?: noMotion(),
                minHeight = minHeight ?: noMotion(),
                iconSize = iconSize ?: noMotion(),
                indicatorOffsetX = indicatorOffsetX ?: noMotion(),
                indicatorOffsetY = indicatorOffsetY ?: noMotion(),
                paddingStart = paddingStart ?: noMotion(),
                paddingEnd = paddingEnd ?: noMotion(),
                paddingTop = paddingTop ?: noMotion(),
                paddingBottom = paddingBottom ?: noMotion(),
                centerContentEnter = centerContentEnter ?: DefaultCenterContentEnter,
                centerContentExit = centerContentExit ?: DefaultCenterContentExit,
                startIndicatorEnter = startIndicatorEnter ?: DefaultFadeIn,
                startIndicatorExit = startIndicatorExit ?: DefaultFadeOut,
                endContentEnter = endContentEnter ?: DefaultFadeIn,
                endContentExit = endContentExit ?: DefaultFadeOut,
                titleColor = titleColor ?: noMotion(),
                titleStyle = titleStyle ?: noMotion(),
            )
        }
    }
}

private val DefaultFiniteFloatAnimation = tween<Float>(DRAWER_ANIMATION_DURATION)
private val DefaultFiniteSizeAnimation = tween<IntSize>(DRAWER_ANIMATION_DURATION)
private val DefaultFadeIn = fadeIn(DefaultFiniteFloatAnimation)
private val DefaultFadeOut = fadeOut(DefaultFiniteFloatAnimation)
private val DefaultCenterContentEnter =
    fadeIn(DefaultFiniteFloatAnimation) + expandHorizontally(DefaultFiniteSizeAnimation)
private val DefaultCenterContentExit =
    fadeOut(DefaultFiniteFloatAnimation) + shrinkHorizontally(DefaultFiniteSizeAnimation)
