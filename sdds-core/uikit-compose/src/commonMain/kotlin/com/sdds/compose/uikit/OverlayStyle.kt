package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [OverlayStyle] для компонента [Overlay]
 */
val LocalOverlayStyle = compositionLocalOf { OverlayStyle.builder().style() }

/**
 * Стиль компонента [Overlay]
 */
@Stable
interface OverlayStyle : Style {

    /**
     * Цвета компонента
     * @see OverlayColors
     */
    val colors: OverlayColors

    companion object {
        /**
         * Возвращает экземпляр [OverlayStyleBuilder]
         */
        fun builder(receiver: Any? = null): OverlayStyleBuilder =
            OverlayStyleBuilderImpl(receiver)
    }
}

/**
 * Builder стиля [Overlay].
 */
interface OverlayStyleBuilder : StyleBuilder<OverlayStyle> {

    /**
     * Устанавливает цвет компонента при помощи [builder].
     * @see OverlayColorBuilder
     */
    @Composable
    fun color(builder: @Composable OverlayColorBuilder.() -> Unit): OverlayStyleBuilder
}

/**
 * Цвета компонента [Overlay]
 */
@Stable
interface OverlayColors {

    /**
     * Цвет фона [Overlay]
     */
    val backgroundColor: StatefulValue<Brush>
}

/**
 * Builder цвета для [Overlay]
 */
interface OverlayColorBuilder {

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see OverlayColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): OverlayColorBuilder =
        backgroundColor(SolidColor(backgroundColor).asStatefulValue())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see OverlayColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Brush): OverlayColorBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see OverlayColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): OverlayColorBuilder

    /**
     * Создает экземпляр [OverlayColors]
     */
    fun build(): OverlayColors

    companion object {

        /**
         * Возвращает экземпляр [OverlayColorBuilder]
         */
        fun builder(): OverlayColorBuilder = DefaultOverlayColors.Builder()
    }
}

@Immutable
internal class DefaultOverlayStyle(
    override val colors: OverlayColors,
) : OverlayStyle

private class OverlayStyleBuilderImpl(override val receiver: Any?) : OverlayStyleBuilder {
    private var colorBuilder: OverlayColorBuilder = OverlayColorBuilder.builder()

    @Composable
    override fun color(builder: @Composable (OverlayColorBuilder.() -> Unit)) =
        apply {
            this.colorBuilder.builder()
        }

    override fun style(): OverlayStyle {
        return DefaultOverlayStyle(
            colors = colorBuilder.build(),
        )
    }
}

@Immutable
private class DefaultOverlayColors(
    override val backgroundColor: StatefulValue<Brush>,
) : OverlayColors {
    class Builder : OverlayColorBuilder {

        private var backgroundColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun build(): OverlayColors = DefaultOverlayColors(
            backgroundColor = backgroundColor ?: SolidColor(Color.LightGray.copy(alpha = 0.4f)).asStatefulValue(),
        )
    }
}
