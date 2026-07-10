package com.sdds.compose.uikit.motion.components.bottomsheet

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [ModalBottomSheetMotionStyle]
 */
val LocalModalBottomSheetMotionStyle = compositionLocalOf { ModalBottomSheetMotionStyle.builder().style() }

/**
 * Стиль анимаций [ModalBottomSheet]
 */
@Stable
interface ModalBottomSheetMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти ручки
     */
    val handleColor: MotionProperty<Brush>

    companion object {

        /**
         * Возвращает [ModalBottomSheetMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): ModalBottomSheetMotionStyleBuilder = ModalBottomSheetMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [ModalBottomSheet]
 */
@Stable
interface ModalBottomSheetMotionStyleBuilder : MotionStyleBuilder<ModalBottomSheetMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun backgroundColor(backgroundColor: MotionProperty<Brush>): ModalBottomSheetMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun handleColor(handleColor: MotionProperty<Brush>): ModalBottomSheetMotionStyleBuilder
}

@Immutable
private class ModalBottomSheetMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val handleColor: MotionProperty<Brush>,
) : ModalBottomSheetMotionStyle {

    class Builder : ModalBottomSheetMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null
        private var handleColor: MotionProperty<Brush>? = null

        override fun backgroundColor(backgroundColor: MotionProperty<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun handleColor(handleColor: MotionProperty<Brush>) = apply {
            this.handleColor = handleColor
        }

        override fun style(): ModalBottomSheetMotionStyle {
            return ModalBottomSheetMotionStyleImpl(
                backgroundColor = backgroundColor ?: noMotion(),
                handleColor = handleColor ?: noMotion(),
            )
        }
    }
}
