package com.sdds.compose.uikit.motion.components.navigationdrawer

import androidx.compose.animation.core.tween
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.NavigationDrawerValue
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.changes
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.noMotion
import com.sdds.compose.uikit.motion.transition

/**
 * CompositionLocal для [NavigationDrawerMotionStyle].
 */
val LocalNavigationDrawerMotionStyle = compositionLocalOf {
    NavigationDrawerMotionStyle.builder().style()
}

/**
 * Стиль анимаций [com.sdds.compose.uikit.NavigationDrawer].
 */
@Stable
interface NavigationDrawerMotionStyle : MotionStyle {
    /**
     * Анимация ширины контейнера.
     */
    val width: MotionProperty<Dp>

    /**
     * Анимация фона контейнера.
     */
    val background: MotionProperty<Brush>

    /**
     * Анимация selector-а.
     */
    val selectorColor: MotionProperty<Brush>

    /**
     * Анимация положения и размера selector-а.
     */
    val selectorBounds: MotionProperty<Rect>

    companion object {
        /**
         * Возвращает builder для [NavigationDrawerMotionStyle].
         */
        fun builder(): NavigationDrawerMotionStyleBuilder = DefaultNavigationDrawerMotionStyle.Builder()
    }
}

/**
 * Builder [NavigationDrawerMotionStyle].
 */
interface NavigationDrawerMotionStyleBuilder : MotionStyleBuilder<NavigationDrawerMotionStyle> {
    /**
     * Устанавливает анимацию ширины.
     */
    fun width(width: MotionProperty<Dp>): NavigationDrawerMotionStyleBuilder

    /**
     * Устанавливает анимацию фона.
     */
    fun background(background: MotionProperty<Brush>): NavigationDrawerMotionStyleBuilder

    /**
     * Устанавливает анимацию selector-а.
     */
    fun selectorColor(selector: MotionProperty<Brush>): NavigationDrawerMotionStyleBuilder

    /**
     * Устанавливает анимацию положения и размера selector-а.
     */
    fun selectorBounds(selectorBounds: MotionProperty<Rect>): NavigationDrawerMotionStyleBuilder
}

@Immutable
private data class DefaultNavigationDrawerMotionStyle(
    override val width: MotionProperty<Dp>,
    override val background: MotionProperty<Brush>,
    override val selectorColor: MotionProperty<Brush>,
    override val selectorBounds: MotionProperty<Rect>,
) : NavigationDrawerMotionStyle {
    class Builder : NavigationDrawerMotionStyleBuilder {
        private var width: MotionProperty<Dp>? = null
        private var background: MotionProperty<Brush>? = null
        private var selector: MotionProperty<Brush>? = null
        private var selectorBounds: MotionProperty<Rect>? = null

        override fun width(width: MotionProperty<Dp>) = apply {
            this.width = width
        }

        override fun background(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun selectorColor(selector: MotionProperty<Brush>) = apply {
            this.selector = selector
        }

        override fun selectorBounds(selectorBounds: MotionProperty<Rect>) = apply {
            this.selectorBounds = selectorBounds
        }

        override fun style(): NavigationDrawerMotionStyle {
            return DefaultNavigationDrawerMotionStyle(
                width = width ?: DrawerWidthMotion,
                background = background ?: noMotion(),
                selectorColor = selector ?: noMotion(),
                selectorBounds = selectorBounds ?: DefaultSelectorBoundsMotion,
            )
        }
    }
}

private val DefaultSelectorBoundsMotion = transition<Rect>(label = "NavigationDrawerSelectorBounds") {
    segment { } changesWith { finite(tween(DRAWER_ANIMATION_DURATION)) }
}

private val DrawerWidthMotion = transition<Dp> {
    segment {
        condition { stateSnapshot ->
            stateSnapshot changes NavigationDrawerValue.Expanded
        }
    } changesWith { finite(tween(DRAWER_ANIMATION_DURATION)) }
}

internal const val DRAWER_ANIMATION_DURATION = 200
