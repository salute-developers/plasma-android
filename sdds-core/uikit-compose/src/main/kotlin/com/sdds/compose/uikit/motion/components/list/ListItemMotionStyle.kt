package com.sdds.compose.uikit.motion.components.list

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.components.cell.CellMotionStyle
import com.sdds.compose.uikit.motion.components.cell.CellMotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [ListItemMotionStyle].
 * Используется для доступа к анимационным свойствам ListItem внутри Compose-иерархии.
 */
val LocalListItemMotionStyle = compositionLocalOf { ListItemMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента ListItem.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface ListItemMotionStyle : CellMotionStyle {

    /**
     * Анимационное свойство цвета фона (background) ListItem.
     */
    val backgroundColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [ListItemMotionStyle].
         */
        fun builder(): ListItemMotionStyleBuilder = ListItemMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [ListItemMotionStyle].
 */
@Stable
interface ListItemMotionStyleBuilder : CellMotionStyleBuilder {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета title.
     */
    override fun titleColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля title.
     */
    override fun titleStyle(style: MotionProperty<TextStyle>): ListItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    override fun labelColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    override fun labelStyle(style: MotionProperty<TextStyle>): ListItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета subTitle.
     */
    override fun subtitleColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля subTitle.
     */
    override fun subtitleStyle(style: MotionProperty<TextStyle>): ListItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета текста disclosure.
     */
    override fun disclosureTextColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста disclosure.
     */
    override fun disclosureTextStyle(style: MotionProperty<TextStyle>): ListItemMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета иконки disclosure.
     */
    override fun disclosureIconColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder

    override fun style(): ListItemMotionStyle
}

@Immutable
private class ListItemMotionStyleImpl(
    override val titleColor: MotionProperty<Brush>,
    override val titleStyle: MotionProperty<TextStyle>,
    override val labelColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val subtitleColor: MotionProperty<Brush>,
    override val subtitleStyle: MotionProperty<TextStyle>,
    override val disclosureTextColor: MotionProperty<Brush>,
    override val disclosureTextStyle: MotionProperty<TextStyle>,
    override val disclosureIconColor: MotionProperty<Brush>,
    override val backgroundColor: MotionProperty<Brush>,
) : ListItemMotionStyle {

    class Builder : ListItemMotionStyleBuilder {
        private var labelColor: MotionProperty<Brush>? = null
        private var titleColor: MotionProperty<Brush>? = null
        private var subtitleColor: MotionProperty<Brush>? = null
        private var disclosureTextColor: MotionProperty<Brush>? = null
        private var disclosureIconColor: MotionProperty<Brush>? = null
        private var labelStyle: MotionProperty<TextStyle>? = null
        private var titleStyle: MotionProperty<TextStyle>? = null
        private var subtitleStyle: MotionProperty<TextStyle>? = null
        private var disclosureTextStyle: MotionProperty<TextStyle>? = null
        private var backgroundColor: MotionProperty<Brush>? = null

        override fun backgroundColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder = apply {
            this.backgroundColor = color
        }

        override fun titleColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder = apply {
            this.titleColor = color
        }

        override fun titleStyle(style: MotionProperty<TextStyle>): ListItemMotionStyleBuilder = apply {
            this.titleStyle = style
        }

        override fun labelColor(color: MotionProperty<Brush>) = apply {
            this.labelColor = color
        }

        override fun labelStyle(style: MotionProperty<TextStyle>) = apply {
            this.labelStyle = style
        }

        override fun subtitleColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder = apply {
            this.subtitleColor = color
        }

        override fun subtitleStyle(style: MotionProperty<TextStyle>): ListItemMotionStyleBuilder = apply {
            this.subtitleStyle = style
        }

        override fun disclosureTextColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder = apply {
            this.disclosureTextColor = color
        }

        override fun disclosureTextStyle(style: MotionProperty<TextStyle>): ListItemMotionStyleBuilder = apply {
            this.disclosureTextStyle = style
        }

        override fun disclosureIconColor(color: MotionProperty<Brush>): ListItemMotionStyleBuilder = apply {
            this.disclosureIconColor = color
        }

        override fun style(): ListItemMotionStyle {
            return ListItemMotionStyleImpl(
                labelColor = labelColor ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
                titleColor = titleColor ?: noMotion(),
                titleStyle = titleStyle ?: noMotion(),
                subtitleColor = subtitleColor ?: noMotion(),
                subtitleStyle = subtitleStyle ?: noMotion(),
                disclosureTextColor = disclosureTextColor ?: noMotion(),
                disclosureTextStyle = disclosureTextStyle ?: noMotion(),
                disclosureIconColor = disclosureIconColor ?: noMotion(),
                backgroundColor = backgroundColor ?: noMotion(),
            )
        }
    }
}
