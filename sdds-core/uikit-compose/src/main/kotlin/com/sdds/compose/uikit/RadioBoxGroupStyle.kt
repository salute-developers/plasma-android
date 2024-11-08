package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [RadioBoxGroupStyle] для компонента [RadioBoxGroup]
 */
val LocalRadioBoxGroupStyle = compositionLocalOf { RadioBoxGroupStyle.builder().style() }

/**
 * Стиль компонента [RadioBoxGroup]
 * @author Малышев Александр on 24.10.2024
 */
@Stable
interface RadioBoxGroupStyle : Style {

    /**
     * Стиль [RadioBox] в группе
     * @see RadioBoxStyle
     */
    val radioBoxStyle: RadioBoxStyle

    /**
     * Расположение элементов по вертикали
     * @see Arrangement.Vertical
     */
    val verticalArrangement: Arrangement.Vertical

    companion object {

        /**
         * Возвращает экземпляр [RadioBoxGroupStyleBuilder]
         */
        fun builder(): RadioBoxGroupStyleBuilder = DefaultRadioBoxGroupStyle.Builder()
    }
}

/**
 * Builder стиля [RadioBoxGroup]
 */
@Stable
interface RadioBoxGroupStyleBuilder : StyleBuilder<RadioBoxGroupStyle> {

    /**
     * Устанавливает стиль компонентов [RadioBox] в группе [RadioBoxGroup]
     * @see RadioBoxGroupStyle.radioBoxStyle
     * @see RadioBoxStyle
     */
    fun radioBoxStyle(radioBoxStyle: RadioBoxStyle): RadioBoxGroupStyleBuilder

    /**
     * Устанавливает расположение элементов по вертикали [verticalArrangement]
     * @see RadioBoxGroupStyle.verticalArrangement
     * @see Arrangement.Vertical
     */
    fun verticalArrangement(verticalArrangement: Arrangement.Vertical): RadioBoxGroupStyleBuilder
}

@Immutable
private class DefaultRadioBoxGroupStyle(
    override val radioBoxStyle: RadioBoxStyle,
    override val verticalArrangement: Arrangement.Vertical,
) : RadioBoxGroupStyle {

    class Builder : RadioBoxGroupStyleBuilder {
        private var radioBoxStyle: RadioBoxStyle? = null
        private var verticalArrangement: Arrangement.Vertical? = null

        override fun radioBoxStyle(radioBoxStyle: RadioBoxStyle) = apply {
            this.radioBoxStyle = radioBoxStyle
        }

        override fun verticalArrangement(verticalArrangement: Arrangement.Vertical) = apply {
            this.verticalArrangement = verticalArrangement
        }

        override fun style(): RadioBoxGroupStyle {
            return DefaultRadioBoxGroupStyle(
                radioBoxStyle = radioBoxStyle ?: RadioBoxStyle.builder().style(),
                verticalArrangement = verticalArrangement ?: Arrangement.spacedBy(DefaultArrangementSize),
            )
        }
    }
}

private val DefaultArrangementSize = 12.dp
