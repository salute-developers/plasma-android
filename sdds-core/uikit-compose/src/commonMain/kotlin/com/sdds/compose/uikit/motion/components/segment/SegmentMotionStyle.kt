package com.sdds.compose.uikit.motion.components.segment

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
 * Стиль переходов Segment по умолчанию. Все свойства используют noMotion().
 */
val LocalSegmentMotionStyle = compositionLocalOf { SegmentMotionStyle.builder().style() }

/**
 * Переходы визуальных значений [com.sdds.compose.uikit.SegmentHorizontal].
 * Форма переключается по состоянию без интерполяции.
 */
@Stable
interface SegmentMotionStyle : MotionStyle {

    /**
     * Анимационное свойство заливки фона.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство отступа в начале.
     */
    val paddingStart: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа в конце.
     */
    val paddingEnd: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа сверху.
     */
    val paddingTop: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа снизу.
     */
    val paddingBottom: MotionProperty<Dp>

    /**
     * Анимационное свойство расстояния между элементами.
     */
    val gap: MotionProperty<Dp>

    /**
     * Анимационное свойство начального отступа разделителя.
     */
    val dividerPaddingStart: MotionProperty<Dp>

    /**
     * Анимационное свойство конечного отступа разделителя.
     */
    val dividerPaddingEnd: MotionProperty<Dp>

    companion object {
        /**
         * Создаёт билдер стиля переходов.
         */
        fun builder(): SegmentMotionStyleBuilder = DefaultSegmentMotionStyle.Builder()
    }
}

/**
 * Билдер [SegmentMotionStyle]. Незаданные переходы используют noMotion().
 */
@Stable
interface SegmentMotionStyleBuilder : MotionStyleBuilder<SegmentMotionStyle> {

    /**
     * Устанавливает переход заливки фона.
     */
    fun backgroundColor(background: MotionProperty<Brush>): SegmentMotionStyleBuilder

    /**
     * Устанавливает переход отступа в начале.
     */
    fun paddingStart(paddingStart: MotionProperty<Dp>): SegmentMotionStyleBuilder

    /**
     * Устанавливает переход отступа в конце.
     */
    fun paddingEnd(paddingEnd: MotionProperty<Dp>): SegmentMotionStyleBuilder

    /**
     * Устанавливает переход отступа сверху.
     */
    fun paddingTop(paddingTop: MotionProperty<Dp>): SegmentMotionStyleBuilder

    /**
     * Устанавливает переход отступа снизу.
     */
    fun paddingBottom(paddingBottom: MotionProperty<Dp>): SegmentMotionStyleBuilder

    /**
     * Устанавливает переход расстояния между элементами.
     */
    fun gap(gap: MotionProperty<Dp>): SegmentMotionStyleBuilder

    /**
     * Устанавливает переход начального отступа разделителя.
     */
    fun dividerPaddingStart(dividerPaddingStart: MotionProperty<Dp>): SegmentMotionStyleBuilder

    /**
     * Устанавливает переход конечного отступа разделителя.
     */
    fun dividerPaddingEnd(dividerPaddingEnd: MotionProperty<Dp>): SegmentMotionStyleBuilder

    override fun style(): SegmentMotionStyle
}

@Immutable
private class DefaultSegmentMotionStyle(
    override val backgroundColor: MotionProperty<Brush>,
    override val paddingStart: MotionProperty<Dp>,
    override val paddingEnd: MotionProperty<Dp>,
    override val paddingTop: MotionProperty<Dp>,
    override val paddingBottom: MotionProperty<Dp>,
    override val gap: MotionProperty<Dp>,
    override val dividerPaddingStart: MotionProperty<Dp>,
    override val dividerPaddingEnd: MotionProperty<Dp>,
) : SegmentMotionStyle {

    class Builder : SegmentMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush> = noMotion()
        private var paddingStart: MotionProperty<Dp> = noMotion()
        private var paddingEnd: MotionProperty<Dp> = noMotion()
        private var paddingTop: MotionProperty<Dp> = noMotion()
        private var paddingBottom: MotionProperty<Dp> = noMotion()
        private var gap: MotionProperty<Dp> = noMotion()
        private var dividerPaddingStart: MotionProperty<Dp> = noMotion()
        private var dividerPaddingEnd: MotionProperty<Dp> = noMotion()

        override fun backgroundColor(background: MotionProperty<Brush>): SegmentMotionStyleBuilder = apply {
            this.backgroundColor = background
        }

        override fun paddingStart(paddingStart: MotionProperty<Dp>): SegmentMotionStyleBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: MotionProperty<Dp>): SegmentMotionStyleBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: MotionProperty<Dp>): SegmentMotionStyleBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: MotionProperty<Dp>): SegmentMotionStyleBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun gap(gap: MotionProperty<Dp>): SegmentMotionStyleBuilder = apply {
            this.gap = gap
        }

        override fun dividerPaddingStart(dividerPaddingStart: MotionProperty<Dp>): SegmentMotionStyleBuilder = apply {
            this.dividerPaddingStart = dividerPaddingStart
        }

        override fun dividerPaddingEnd(dividerPaddingEnd: MotionProperty<Dp>): SegmentMotionStyleBuilder = apply {
            this.dividerPaddingEnd = dividerPaddingEnd
        }

        override fun style(): SegmentMotionStyle = DefaultSegmentMotionStyle(
            backgroundColor = backgroundColor,
            paddingStart = paddingStart,
            paddingEnd = paddingEnd,
            paddingTop = paddingTop,
            paddingBottom = paddingBottom,
            gap = gap,
            dividerPaddingStart = dividerPaddingStart,
            dividerPaddingEnd = dividerPaddingEnd,
        )
    }
}
