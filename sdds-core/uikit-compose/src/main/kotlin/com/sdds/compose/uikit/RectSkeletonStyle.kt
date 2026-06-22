package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.transform
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
    @Deprecated("Use shapes", ReplaceWith("shapes"))
    val shape: Shape

    /**
     * Форма компонента
     */
    val shapes: StatefulValue<Shape>

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
@ApiInfo
interface RectSkeletonStyleBuilder : StyleBuilder<RectSkeletonStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): RectSkeletonStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): RectSkeletonStyleBuilder

    /**
     * Устанавливает градиент [gradient] шиммера
     */
    fun gradient(gradient: StatefulValue<Brush>): RectSkeletonStyleBuilder

    /**
     * Устанавливает градиент [gradient] шиммера
     */
    fun gradient(gradient: Brush): RectSkeletonStyleBuilder =
        gradient(gradient.asStatefulValue())

    /**
     * Устанавливает градиент [gradient] шиммера
     */
    fun gradient(gradient: Color): RectSkeletonStyleBuilder =
        gradient(gradient.asStatefulBrush())

    /**
     * Устанавливает градиент [gradient] шиммера
     */
    fun gradient(gradient: InteractiveColor): RectSkeletonStyleBuilder =
        gradient(gradient.asStatefulBrush())

    /**
     * Устанавливает время в мс [duration], за которое градиент перемещается через всю ширину компонента
     */
    fun duration(duration: Int): RectSkeletonStyleBuilder
}

private class DefaultRectSkeletonStyle(
    override val gradient: StatefulValue<Brush>,
    override val duration: Int,
    override val shapes: StatefulValue<Shape>,
) : RectSkeletonStyle {

    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: CornerBasedShape = (shapes.getDefaultValue() as? CornerBasedShape) ?: RoundedCornerShape(15)

    class Builder : RectSkeletonStyleBuilder {
        private var shapes: StatefulValue<CornerBasedShape>? = null
        private var gradient: StatefulValue<Brush>? = null
        private var duration: Int? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shapes = shape
        }

        override fun gradient(gradient: StatefulValue<Brush>) = apply {
            this.gradient = gradient
        }

        override fun duration(duration: Int) = apply {
            this.duration = duration
        }

        override fun style(): RectSkeletonStyle {
            return DefaultRectSkeletonStyle(
                shapes = shapes?.transform { it } ?: RoundedCornerShape(15).asStatefulValue(),
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
