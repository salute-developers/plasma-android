package com.sdds.compose.uikit.motion.components.navigationbar

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
 * CompositionLocal, предоставляющий текущий [NavigationBarMotionStyle].
 * Используется для доступа к анимационным свойствам NavigationBar внутри Compose-иерархии.
 */
val LocalNavigationBarMotionStyle = compositionLocalOf { NavigationBarMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента NavigationBar.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface NavigationBarMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета заголовка (title) NavigationBar.
     */
    val titleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля заголовка (title) NavigationBar.
     */
    val titleStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета текста (text) NavigationBar.
     */
    val textColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля текста (text) NavigationBar.
     */
    val textStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета описания (description) NavigationBar.
     */
    val descriptionColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля описания (description) NavigationBar.
     */
    val descriptionStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета фона (background) NavigationBar.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета кнопки закрытия (backIcon) NavigationBar.
     */
    val backIconColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета экшена в начале (actionStart) NavigationBar.
     */
    val actionStartColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета экшена в конце (actionStart) NavigationBar.
     */
    val actionEndColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [NavigationBarMotionStyle].
         */
        fun builder(): NavigationBarMotionStyleBuilder = NavigationBarMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [NavigationBarMotionStyle].
 */
@Stable
interface NavigationBarMotionStyleBuilder : MotionStyleBuilder<NavigationBarMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета заголовка (title).
     */
    fun titleColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля заголовка (title).
     */
    fun titleStyle(style: MotionProperty<TextStyle>): NavigationBarMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета текста (text).
     */
    fun textColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста (text).
     */
    fun textStyle(style: MotionProperty<TextStyle>): NavigationBarMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета описания (description).
     */
    fun descriptionColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля описания (description).
     */
    fun descriptionStyle(style: MotionProperty<TextStyle>): NavigationBarMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета фона (background).
     */
    fun backgroundColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета кнопки закрытия (backIcon) NavigationBar.
     */
    fun backIconColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета экшена в начале (actionStart) NavigationBar.
     */
    fun actionStartColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета экшена в конце (actionStart) NavigationBar.
     */
    fun actionEndColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder
}

@Immutable
private class NavigationBarMotionStyleImpl(
    override val titleColor: MotionProperty<Brush>,
    override val titleStyle: MotionProperty<TextStyle>,
    override val textColor: MotionProperty<Brush>,
    override val textStyle: MotionProperty<TextStyle>,
    override val descriptionColor: MotionProperty<Brush>,
    override val descriptionStyle: MotionProperty<TextStyle>,
    override val backgroundColor: MotionProperty<Brush>,
    override val backIconColor: MotionProperty<Brush>,
    override val actionStartColor: MotionProperty<Brush>,
    override val actionEndColor: MotionProperty<Brush>,
) : NavigationBarMotionStyle {

    class Builder : NavigationBarMotionStyleBuilder {
        private var titleColor: MotionProperty<Brush>? = null
        private var titleStyle: MotionProperty<TextStyle>? = null
        private var textColor: MotionProperty<Brush>? = null
        private var textStyle: MotionProperty<TextStyle>? = null
        private var descriptionColor: MotionProperty<Brush>? = null
        private var descriptionStyle: MotionProperty<TextStyle>? = null
        private var backgroundColor: MotionProperty<Brush>? = null
        private var backIconColor: MotionProperty<Brush>? = null
        private var actionStartColor: MotionProperty<Brush>? = null
        private var actionEndColor: MotionProperty<Brush>? = null

        override fun titleColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder = apply {
            this.titleColor = color
        }

        override fun titleStyle(style: MotionProperty<TextStyle>): NavigationBarMotionStyleBuilder = apply {
            this.titleStyle = style
        }

        override fun textColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder = apply {
            this.textColor = color
        }

        override fun textStyle(style: MotionProperty<TextStyle>): NavigationBarMotionStyleBuilder = apply {
            this.textStyle = style
        }

        override fun descriptionColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder = apply {
            this.descriptionColor = color
        }

        override fun descriptionStyle(style: MotionProperty<TextStyle>): NavigationBarMotionStyleBuilder = apply {
            this.descriptionStyle = style
        }

        override fun backgroundColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder = apply {
            this.backgroundColor = color
        }

        override fun backIconColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder = apply {
            this.backIconColor = color
        }

        override fun actionStartColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder = apply {
            this.actionStartColor = color
        }

        override fun actionEndColor(color: MotionProperty<Brush>): NavigationBarMotionStyleBuilder = apply {
            this.actionEndColor = color
        }

        override fun style(): NavigationBarMotionStyle {
            return NavigationBarMotionStyleImpl(
                titleColor = titleColor ?: noMotion(),
                titleStyle = titleStyle ?: noMotion(),
                textColor = textColor ?: noMotion(),
                textStyle = textStyle ?: noMotion(),
                descriptionColor = descriptionColor ?: noMotion(),
                descriptionStyle = descriptionStyle ?: noMotion(),
                backgroundColor = backgroundColor ?: noMotion(),
                backIconColor = backIconColor ?: noMotion(),
                actionStartColor = actionStartColor ?: noMotion(),
                actionEndColor = actionEndColor ?: noMotion(),
            )
        }
    }
}
