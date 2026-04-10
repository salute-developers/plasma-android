package com.sdds.compose.uikit.motion.components.tabs

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.components.counter.CounterMotionStyle
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [TabItemMotionStyle].
 * Используется для доступа к анимационным свойствам TabItem внутри Compose-иерархии.
 */
val LocalTabItemMotionStyle = compositionLocalOf { TabItemMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента TabItem.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface TabItemMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета фона TabItem.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета основного текста (label) TabItem.
     */
    val labelColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета дополнительного значения (value), отображаемого в TabItem.
     */
    val valueColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета контента, расположенного в начале TabItem.
     */
    val startContentColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета контента, расположенного в конце TabItem.
     */
    val endContentColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета заливки action-элемента (например, кнопки или иконки действия).
     */
    val actionColor: MotionProperty<Brush>

    /**
     * Анимационный стиль счетчика, отображаемого внутри TabItem.
     * Может быть `null`, если счетчик не используется.
     */
    val counterMotionStyle: CounterMotionStyle?

    companion object {
        /**
         * Создает билдер для построения [TabItemMotionStyle].
         */
        fun builder(): TabItemMotionStyleBuilder = TabItemMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [TabItemMotionStyle].
 */
@Stable
interface TabItemMotionStyleBuilder : MotionStyleBuilder<TabItemMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(background: MotionProperty<Brush>): TabItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    fun labelColor(label: MotionProperty<Brush>): TabItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета value.
     */
    fun valueColor(value: MotionProperty<Brush>): TabItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета начального контента.
     */
    fun startContentColor(startContent: MotionProperty<Brush>): TabItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета конечного контента.
     */
    fun endContentColor(endContent: MotionProperty<Brush>): TabItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета action-элемента.
     */
    fun actionColor(action: MotionProperty<Brush>): TabItemMotionStyleBuilder

    /**
     * Устанавливает анимационный стиль счетчика.
     */
    fun counterMotionStyle(style: CounterMotionStyle): TabItemMotionStyleBuilder
}

@Immutable
private class TabItemMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val labelColor: MotionProperty<Brush>,
    override val valueColor: MotionProperty<Brush>,
    override val startContentColor: MotionProperty<Brush>,
    override val endContentColor: MotionProperty<Brush>,
    override val actionColor: MotionProperty<Brush>,
    override val counterMotionStyle: CounterMotionStyle?,
) : TabItemMotionStyle {

    class Builder : TabItemMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null
        private var label: MotionProperty<Brush>? = null
        private var value: MotionProperty<Brush>? = null
        private var startContent: MotionProperty<Brush>? = null
        private var endContent: MotionProperty<Brush>? = null
        private var action: MotionProperty<Brush>? = null
        private var counterMotionStyle: CounterMotionStyle? = null

        override fun backgroundColor(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun labelColor(label: MotionProperty<Brush>) = apply {
            this.label = label
        }

        override fun valueColor(value: MotionProperty<Brush>) = apply {
            this.value = value
        }

        override fun startContentColor(startContent: MotionProperty<Brush>) = apply {
            this.startContent = startContent
        }

        override fun endContentColor(endContent: MotionProperty<Brush>) = apply {
            this.endContent = endContent
        }

        override fun actionColor(action: MotionProperty<Brush>) = apply {
            this.action = action
        }

        override fun counterMotionStyle(style: CounterMotionStyle) = apply {
            this.counterMotionStyle = style
        }

        override fun style(): TabItemMotionStyle {
            return TabItemMotionStyleImpl(
                backgroundColor = background ?: noMotion(),
                labelColor = label ?: noMotion(),
                counterMotionStyle = counterMotionStyle,
                valueColor = value ?: noMotion(),
                startContentColor = startContent ?: noMotion(),
                endContentColor = endContent ?: noMotion(),
                actionColor = action ?: noMotion(),
            )
        }
    }
}
