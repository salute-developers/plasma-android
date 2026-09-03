package com.sdds.compose.uikit.motion.components.segment

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.components.common.CommonButtonMotionStyle
import com.sdds.compose.uikit.motion.components.common.CommonButtonMotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * Стиль переходов [SegmentItem] по умолчанию. Все свойства используют noMotion().
 */
val LocalSegmentItemMotionStyle = compositionLocalOf { SegmentItemMotionStyle.builder().style() }

/**
 * Переходы визуальных значений [com.sdds.compose.uikit.SegmentItem].
 * Форма переключается по состоянию без интерполяции.
 */
@Stable
interface SegmentItemMotionStyle : CommonButtonMotionStyle {

    /**
     * Анимационное свойство заливки начального контента.
     */
    val startContentColor: MotionProperty<Brush>

    /**
     * Анимационное свойство заливки конечного контента.
     */
    val endContentColor: MotionProperty<Brush>

    /**
     * Анимационное свойство минимальной высоты.
     */
    val minHeight: MotionProperty<Dp>

    /**
     * Анимационное свойство минимальной ширины.
     */
    val minWidth: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа в начале.
     */
    val paddingStart: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа в конце.
     */
    val paddingEnd: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа начального контента.
     */
    val startContentPadding: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа конечного контента.
     */
    val endContentPadding: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа дополнительного текста.
     */
    val valueMargin: MotionProperty<Dp>

    /**
     * Анимационное свойство размера начальной иконки.
     */
    val startContentSize: MotionProperty<Dp>

    /**
     * Анимационное свойство размера конечной иконки.
     */
    val endContentSize: MotionProperty<Dp>

    companion object {
        /**
         * Создаёт билдер стиля переходов.
         */
        fun builder(): SegmentItemMotionStyleBuilder = DefaultSegmentItemMotionStyle.Builder()
    }
}

/**
 * Билдер [SegmentItemMotionStyle]. Незаданные переходы используют noMotion().
 */
@Stable
interface SegmentItemMotionStyleBuilder : CommonButtonMotionStyleBuilder {

    /**
     * Устанавливает переход заливки фона.
     */
    override fun backgroundColor(background: MotionProperty<Brush>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход заливки основного текста.
     */
    override fun labelColor(label: MotionProperty<Brush>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход стиля основного текста.
     */
    override fun labelStyle(label: MotionProperty<TextStyle>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход заливки дополнительного текста.
     */
    override fun valueColor(value: MotionProperty<Brush>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход стиля дополнительного текста.
     */
    override fun valueStyle(value: MotionProperty<TextStyle>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход заливки начального контента.
     */
    fun startContentColor(startContentColor: MotionProperty<Brush>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход заливки конечного контента.
     */
    fun endContentColor(endContentColor: MotionProperty<Brush>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход минимальной высоты.
     */
    fun minHeight(minHeight: MotionProperty<Dp>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход минимальной ширины.
     */
    fun minWidth(minWidth: MotionProperty<Dp>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход отступа в начале.
     */
    fun paddingStart(paddingStart: MotionProperty<Dp>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход отступа в конце.
     */
    fun paddingEnd(paddingEnd: MotionProperty<Dp>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход отступа начального контента.
     */
    fun startContentPadding(startContentPadding: MotionProperty<Dp>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход отступа конечного контента.
     */
    fun endContentPadding(endContentPadding: MotionProperty<Dp>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход отступа дополнительного текста.
     */
    fun valueMargin(valueMargin: MotionProperty<Dp>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход размера начальной иконки.
     */
    fun startContentSize(startContentSize: MotionProperty<Dp>): SegmentItemMotionStyleBuilder

    /**
     * Устанавливает переход размера конечной иконки.
     */
    fun endContentSize(endContentSize: MotionProperty<Dp>): SegmentItemMotionStyleBuilder

    override fun style(): SegmentItemMotionStyle
}

@Immutable
private class DefaultSegmentItemMotionStyle(
    override val backgroundColor: MotionProperty<Brush>,
    override val labelColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val valueColor: MotionProperty<Brush>,
    override val valueStyle: MotionProperty<TextStyle>,
    override val startContentColor: MotionProperty<Brush>,
    override val endContentColor: MotionProperty<Brush>,
    override val minHeight: MotionProperty<Dp>,
    override val minWidth: MotionProperty<Dp>,
    override val paddingStart: MotionProperty<Dp>,
    override val paddingEnd: MotionProperty<Dp>,
    override val startContentPadding: MotionProperty<Dp>,
    override val endContentPadding: MotionProperty<Dp>,
    override val valueMargin: MotionProperty<Dp>,
    override val startContentSize: MotionProperty<Dp>,
    override val endContentSize: MotionProperty<Dp>,
) : SegmentItemMotionStyle {

    class Builder : SegmentItemMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush> = noMotion()
        private var labelColor: MotionProperty<Brush> = noMotion()
        private var labelStyle: MotionProperty<TextStyle> = noMotion()
        private var valueColor: MotionProperty<Brush> = noMotion()
        private var valueStyle: MotionProperty<TextStyle> = noMotion()
        private var startContentColor: MotionProperty<Brush> = noMotion()
        private var endContentColor: MotionProperty<Brush> = noMotion()
        private var minHeight: MotionProperty<Dp> = noMotion()
        private var minWidth: MotionProperty<Dp> = noMotion()
        private var paddingStart: MotionProperty<Dp> = noMotion()
        private var paddingEnd: MotionProperty<Dp> = noMotion()
        private var startContentPadding: MotionProperty<Dp> = noMotion()
        private var endContentPadding: MotionProperty<Dp> = noMotion()
        private var valueMargin: MotionProperty<Dp> = noMotion()
        private var startContentSize: MotionProperty<Dp> = noMotion()
        private var endContentSize: MotionProperty<Dp> = noMotion()

        override fun backgroundColor(background: MotionProperty<Brush>): SegmentItemMotionStyleBuilder = apply {
            this.backgroundColor = background
        }

        override fun labelColor(label: MotionProperty<Brush>): SegmentItemMotionStyleBuilder = apply {
            this.labelColor = label
        }

        override fun labelStyle(label: MotionProperty<TextStyle>): SegmentItemMotionStyleBuilder = apply {
            this.labelStyle = label
        }

        override fun valueColor(value: MotionProperty<Brush>): SegmentItemMotionStyleBuilder = apply {
            this.valueColor = value
        }

        override fun valueStyle(value: MotionProperty<TextStyle>): SegmentItemMotionStyleBuilder = apply {
            this.valueStyle = value
        }

        override fun startContentColor(
            startContentColor: MotionProperty<Brush>,
        ): SegmentItemMotionStyleBuilder = apply {
            this.startContentColor = startContentColor
        }

        override fun endContentColor(endContentColor: MotionProperty<Brush>): SegmentItemMotionStyleBuilder = apply {
            this.endContentColor = endContentColor
        }

        override fun minHeight(minHeight: MotionProperty<Dp>): SegmentItemMotionStyleBuilder = apply {
            this.minHeight = minHeight
        }

        override fun minWidth(minWidth: MotionProperty<Dp>): SegmentItemMotionStyleBuilder = apply {
            this.minWidth = minWidth
        }

        override fun paddingStart(paddingStart: MotionProperty<Dp>): SegmentItemMotionStyleBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: MotionProperty<Dp>): SegmentItemMotionStyleBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun startContentPadding(
            startContentPadding: MotionProperty<Dp>,
        ): SegmentItemMotionStyleBuilder = apply {
            this.startContentPadding = startContentPadding
        }

        override fun endContentPadding(endContentPadding: MotionProperty<Dp>): SegmentItemMotionStyleBuilder = apply {
            this.endContentPadding = endContentPadding
        }

        override fun valueMargin(valueMargin: MotionProperty<Dp>): SegmentItemMotionStyleBuilder = apply {
            this.valueMargin = valueMargin
        }

        override fun startContentSize(startContentSize: MotionProperty<Dp>): SegmentItemMotionStyleBuilder = apply {
            this.startContentSize = startContentSize
        }

        override fun endContentSize(endContentSize: MotionProperty<Dp>): SegmentItemMotionStyleBuilder = apply {
            this.endContentSize = endContentSize
        }

        override fun style(): SegmentItemMotionStyle = DefaultSegmentItemMotionStyle(
            backgroundColor = backgroundColor,
            labelColor = labelColor,
            labelStyle = labelStyle,
            valueColor = valueColor,
            valueStyle = valueStyle,
            startContentColor = startContentColor,
            endContentColor = endContentColor,
            minHeight = minHeight,
            minWidth = minWidth,
            paddingStart = paddingStart,
            paddingEnd = paddingEnd,
            startContentPadding = startContentPadding,
            endContentPadding = endContentPadding,
            valueMargin = valueMargin,
            startContentSize = startContentSize,
            endContentSize = endContentSize,
        )
    }
}
