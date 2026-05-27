package com.sdds.compose.uikit.motion.components.list

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [ListMotionStyle].
 * Используется для доступа к анимационным свойствам List внутри Compose-иерархии.
 */
val LocalListMotionStyle = compositionLocalOf { ListMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента List.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface ListMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета фона (background) List.
     */
    val backgroundColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [ListMotionStyle].
         */
        fun builder(): ListMotionStyleBuilder = ListMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [ListMotionStyle].
 */
@Stable
interface ListMotionStyleBuilder : MotionStyleBuilder<ListMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(color: MotionProperty<Brush>): ListMotionStyleBuilder
}

@Immutable
private class ListMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
) : ListMotionStyle {

    class Builder : ListMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null

        override fun backgroundColor(color: MotionProperty<Brush>): ListMotionStyleBuilder = apply {
            this.backgroundColor = color
        }

        override fun style(): ListMotionStyle {
            return ListMotionStyleImpl(
                backgroundColor = backgroundColor ?: noMotion(),
            )
        }
    }
}
