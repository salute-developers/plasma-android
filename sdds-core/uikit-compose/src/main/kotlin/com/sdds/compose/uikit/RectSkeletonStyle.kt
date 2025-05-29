package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [RectSkeletonStyle] для компонента [RectSkeleton]
 */
val LocalRectSkeletonStyle = compositionLocalOf { RectSkeletonStyle.builder().style() }

/**
 * Стиль компонента RectSkeleton
 */
@Immutable
interface RectSkeletonStyle : Style {

    /**
     * Форма компонента
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
         * Возвращает экземпляр [RectSkeletonStyleBuilder]
         */
        fun builder(receiver: Any? = null): RectSkeletonStyleBuilder =
            DefaultRectSkeletonStyle.Builder()
    }
}

/**
 * Билдер стиля [RectSkeletonStyle]
 */
interface RectSkeletonStyleBuilder : StyleBuilder<RectSkeletonStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): RectSkeletonStyleBuilder

    /**
     * Устанавливает градиент [gradient] шиммера
     */
    fun gradient(gradient: StatefulValue<Brush>): RectSkeletonStyleBuilder

    /**
     * Устанавливает время в мс [duration], за которое градиент перемещается через всю ширину компонента
     */
    fun duration(duration: Int): RectSkeletonStyleBuilder
}

private class DefaultRectSkeletonStyle(
    override val shape: CornerBasedShape,
    override val gradient: StatefulValue<Brush>,
    override val duration: Int,
) : RectSkeletonStyle {

    class Builder : RectSkeletonStyleBuilder {
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

        override fun style(): RectSkeletonStyle {
            return DefaultRectSkeletonStyle(
                shape = shape ?: RoundedCornerShape(15),
                gradient = gradient ?: Brush.linearGradient(
                    0f to Color.Transparent,
                    0.5f to Color.LightGray,
                    1f to Color.Transparent,
                    start = Offset.Zero,
                    end = Offset(Float.POSITIVE_INFINITY, 0f),
                ).asStatefulValue(),
                duration = duration ?: 1000,
            )
        }
    }
}
