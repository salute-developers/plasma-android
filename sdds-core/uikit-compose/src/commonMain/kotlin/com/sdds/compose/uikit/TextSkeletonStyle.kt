package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
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

    /**
     * Стиль текста
     */
    @Deprecated("Use textStyles", ReplaceWith("textStyles"))
    val textStyle: TextStyle

    /**
     * Стиль текста
     */
    val textStyles: StatefulValue<TextStyle>

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
@ApiInfo
interface TextSkeletonStyleBuilder : StyleBuilder<TextSkeletonStyle> {

    /**
     * Устанавливает форму [shape] элементов компонента
     */
    fun shape(shape: CornerBasedShape): TextSkeletonStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает форму [shape] элементов компонента
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): TextSkeletonStyleBuilder

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
        gradient(gradient.asStatefulBrush())

    /**
     * Устанавливает градиент [gradient] шиммера
     */
    fun gradient(gradient: InteractiveColor): TextSkeletonStyleBuilder =
        gradient(gradient.asStatefulBrush())

    /**
     * Устанавливает время в мс [duration], за которое градиент перемещается через всю ширину компонента
     */
    fun duration(duration: Int): TextSkeletonStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle]
     * @see TextSkeletonStyle.textStyle
     */
    fun textStyle(textStyle: TextStyle): TextSkeletonStyleBuilder =
        textStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стиль текста [textStyle]
     * @see TextSkeletonStyle.textStyle
     */
    fun textStyle(textStyle: StatefulValue<TextStyle>): TextSkeletonStyleBuilder
}

private class DefaultTextSkeletonStyle(
    override val gradient: StatefulValue<Brush>,
    override val duration: Int,
    override val shapes: StatefulValue<Shape>,
    override val textStyles: StatefulValue<TextStyle>,
) : TextSkeletonStyle {

    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: CornerBasedShape = (shapes.getDefaultValue() as? CornerBasedShape) ?: RoundedCornerShape(15)

    @Deprecated("Use textStyles", ReplaceWith("textStyles"))
    override val textStyle: TextStyle = textStyles.getDefaultValue()
    class Builder : TextSkeletonStyleBuilder {
        private var shapes: StatefulValue<CornerBasedShape>? = null
        private var gradient: StatefulValue<Brush>? = null
        private var duration: Int? = null
        private var textStyles: StatefulValue<TextStyle>? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shapes = shape
        }

        override fun gradient(gradient: StatefulValue<Brush>) = apply {
            this.gradient = gradient
        }

        override fun duration(duration: Int) = apply {
            this.duration = duration
        }

        override fun textStyle(textStyle: StatefulValue<TextStyle>) = apply {
            this.textStyles = textStyle
        }

        override fun style(): TextSkeletonStyle {
            return DefaultTextSkeletonStyle(
                shapes = shapes?.transform { it } ?: RoundedCornerShape(15).asStatefulValue(),
                gradient = gradient ?: Brush.linearGradient(
                    0f to Color.Transparent,
                    0.5f to Color.LightGray,
                    1f to Color.Transparent,
                    start = Offset.Zero,
                    end = Offset(Float.POSITIVE_INFINITY, 0f),
                ).asStatefulValue(),
                duration = duration ?: 5000,
                textStyles = textStyles ?: TextStyle.Default.asStatefulValue(),
            )
        }
    }
}
