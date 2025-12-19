package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [TextSkeletonStyle] для компонента [TextSkeleton]
 */
val LocalTextSkeletonStyle = compositionLocalOf { TextSkeletonStyle.builder().style() }

/**
 * Стиль компонента TextSkeleton
 */
@Immutable
interface TextSkeletonStyle : Style {

    /**
     * Форма элементов компонента
     */
    val shape: Shape

    /**
     * Градиент шиммера
     */
    val gradient: StatefulValue<Brush>

    /**
     * Время в мс, за которое градиент перемещается через всю ширину компонента
     */
    val duration: Int

    companion object {
        /**
         * Возвращает экземпляр [TextSkeletonStyleBuilder]
         */
        fun builder(receiver: Any? = null): TextSkeletonStyleBuilder =
            DefaultTextSkeletonStyle.Builder()
    }
}

/**
 * Билдер стиля [TextSkeletonStyle]
 */
interface TextSkeletonStyleBuilder : StyleBuilder<TextSkeletonStyle> {

    /**
     * Устанавливает форму [shape] элементов компонента
     */
    fun shape(shape: CornerBasedShape): TextSkeletonStyleBuilder

    /**
     * Устанавливает градиент [gradient] шиммера
     */
    fun gradient(gradient: StatefulValue<Brush>): TextSkeletonStyleBuilder

    /**
     * Устанавливает градиент [gradient] шиммера
     */
    fun gradient(gradient: Brush): TextSkeletonStyleBuilder =
        gradient(gradient.asStatefulValue())

    /**
     * Устанавливает градиент [gradient] шиммера
     */
    fun gradient(gradient: Color): TextSkeletonStyleBuilder =
        gradient(SolidColor(gradient))

    /**
     * Устанавливает время в мс [duration], за которое градиент перемещается через всю ширину компонента
     */
    fun duration(duration: Int): TextSkeletonStyleBuilder
}

private class DefaultTextSkeletonStyle(
    override val shape: CornerBasedShape,
    override val gradient: StatefulValue<Brush>,
    override val duration: Int,
) : TextSkeletonStyle {

    class Builder : TextSkeletonStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var gradient: StatefulValue<Brush>? = null
        private var duration: Int? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun gradient(gradient: StatefulValue<Brush>) = apply {
            this.gradient = gradient
        }

        override fun duration(duration: Int) = apply {
            this.duration = duration
        }

        override fun style(): TextSkeletonStyle {
            return DefaultTextSkeletonStyle(
                shape = shape ?: RoundedCornerShape(15),
                gradient = gradient ?: Brush.linearGradient(
                    0f to Color.Transparent,
                    0.5f to Color.LightGray,
                    1f to Color.Transparent,
                    start = Offset.Zero,
                    end = Offset(Float.POSITIVE_INFINITY, 0f),
                ).asStatefulValue(),
                duration = duration ?: 5000,
            )
        }
    }
}
