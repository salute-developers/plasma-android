package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [SplitterStyle] для компонента [Splitter].
 */
val LocalSplitterStyle = compositionLocalOf { SplitterStyle.builder().style() }

/**
 * Стиль компонента [Splitter].
 */
@Stable
interface SplitterStyle : Style {

    /**
     * Форма разделителя.
     */
    val dividerShape: StatefulValue<CornerBasedShape>

    /**
     * Форма ручки.
     */
    val handleShape: StatefulValue<CornerBasedShape>

    /**
     * Цвета компонента.
     * @see SplitterColor
     */
    val color: SplitterColor

    /**
     * Размеры.
     */
    val dimensions: SplitterDimensions

    companion object {
        /**
         * Возвращает экземпляр [SplitterStyleBuilder].
         */
        fun builder(receiver: Any? = null): SplitterStyleBuilder =
            SplitterStyleBuilderImpl(receiver)
    }
}

/**
 * Builder стиля [Splitter].
 */
@Stable
@ApiInfo
interface SplitterStyleBuilder : StyleBuilder<SplitterStyle> {

    /**
     * Устанавливает форму разделителя [shape].
     * @see SplitterStyleBuilder.dividerShape
     */
    fun dividerShape(shape: CornerBasedShape): SplitterStyleBuilder =
        dividerShape(shape.asStatefulValue())

    /**
     * Устанавливает формы разделителя [shape].
     * @see SplitterStyle.dividerShape
     */
    fun dividerShape(shape: StatefulValue<CornerBasedShape>): SplitterStyleBuilder

    /**
     * Устанавливает форму ручки [shape].
     * @see SplitterStyleBuilder.handleShape
     */
    fun handleShape(shape: CornerBasedShape): SplitterStyleBuilder =
        handleShape(shape.asStatefulValue())

    /**
     * Устанавливает формы ручки [shape].
     * @see SplitterStyle.handleShape
     */
    fun handleShape(shape: StatefulValue<CornerBasedShape>): SplitterStyleBuilder

    /**
     * Устанавливает цвет компонента при помощи [builder].
     * @see SplitterColorBuilder
     */
    @Composable
    fun color(builder: @Composable SplitterColorBuilder.() -> Unit): SplitterStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions].
     */
    @Composable
    fun dimensions(builder: @Composable SplitterDimensionsBuilder.() -> Unit): SplitterStyleBuilder
}

/**
 * Цвета компонента [Splitter].
 */
@Stable
interface SplitterColor {

    /**
     * Кисти разделителя [Splitter].
     */
    val dividerColor: StatefulValue<Brush>

    /**
     * Кисти ручки [Splitter].
     */
    val handleColor: StatefulValue<Brush>
}

/**
 *  Размеры компонента [Splitter].
 */
@Stable
interface SplitterDimensions {

    /**
     * Толщина лини разделителя.
     */
    val dividerThickness: StatefulValue<Dp>

    /**
     * Толщина линий ручки.
     */
    val handleThickness: StatefulValue<Dp>

    /**
     * Отступ линий ручки в начале.
     */
    val handleStartPadding: StatefulValue<Dp>

    /**
     * Отступ линий ручки сверху.
     */
    val handleTopPadding: StatefulValue<Dp>

    /**
     * Отступ линий ручки в конце.
     */
    val handleEndPadding: StatefulValue<Dp>

    /**
     * Отступ линий ручки снизу.
     */
    val handleBottomPadding: StatefulValue<Dp>

    /**
     * Отступ между линиями ручки.
     */
    val handleSpacer: StatefulValue<Dp>

    /**
     * Величина отступа, в котором располагается ручка.
     */
    val gap: StatefulValue<Dp>
}

/**
 * Builder цвета для [Splitter]
 */
@Stable
interface SplitterColorBuilder {
    /**
     * Устанавливает цвет [dividerColor] линии разделителя.
     * @see SplitterColorBuilder.dividerColor
     */
    fun dividerColor(dividerColor: Color): SplitterColorBuilder =
        dividerColor(dividerColor.asStatefulBrush())

    /**
     * Устанавливает цвет [dividerColor] линии разделителя.
     * @see SplitterColorBuilder.dividerColor
     */
    fun dividerColor(dividerColor: InteractiveColor): SplitterColorBuilder =
        dividerColor(dividerColor.asStatefulBrush())

    /**
     * Устанавливает кисть [dividerColor] линии разделителя.
     * @see SplitterColorBuilder.dividerColor
     */
    fun dividerColor(dividerColor: Brush): SplitterColorBuilder =
        dividerColor(dividerColor.asStatefulValue())

    /**
     * Устанавливает кисти [dividerColor] линии разделителя.
     * @see SplitterColor.dividerColor
     */
    fun dividerColor(dividerColor: StatefulValue<Brush>): SplitterColorBuilder

    /**
     * Устанавливает цвет [dividerColor] линий ручки.
     * @see SplitterColorBuilder.dividerColor
     */
    fun handleColor(handleColor: Color): SplitterColorBuilder =
        handleColor(handleColor.asStatefulBrush())

    /**
     * Устанавливает цвет [dividerColor] линий ручки.
     * @see SplitterColorBuilder.dividerColor
     */
    fun handleColor(handleColor: InteractiveColor): SplitterColorBuilder =
        handleColor(handleColor.asStatefulBrush())

    /**
     * Устанавливает кисть [dividerColor] линий ручки.
     * @see SplitterColorBuilder.dividerColor
     */
    fun handleColor(handleColor: Brush): SplitterColorBuilder =
        handleColor(handleColor.asStatefulValue())

    /**
     * Устанавливает кисти [dividerColor] линий ручки.
     * @see SplitterColor.dividerColor
     */
    fun handleColor(handleColor: StatefulValue<Brush>): SplitterColorBuilder

    /**
     * Создает экземпляр [SplitterColor].
     */
    fun build(): SplitterColor

    companion object {

        /**
         * Возвращает экземпляр [SplitterColorBuilder].
         */
        fun builder(): SplitterColorBuilder = DefaultSplitterColor.Builder()
    }
}

/**
 * Билдер размеров для [Splitter]
 */
@Stable
interface SplitterDimensionsBuilder {

    /**
     * Устанавливает толщину [dividerThickness] разделительной линии.
     * @see SplitterDimensionsBuilder.dividerThickness
     */
    fun dividerThickness(dividerThickness: Dp): SplitterDimensionsBuilder =
        dividerThickness(dividerThickness.asStatefulValue())

    /**
     * Устанавливает толщину [dividerThickness] разделительной линии.
     * @see SplitterDimensions.dividerThickness
     */
    fun dividerThickness(dividerThickness: StatefulValue<Dp>): SplitterDimensionsBuilder

    /**
     * Устанавливает толщину [handleThickness] линий ручки.
     * @see SplitterDimensionsBuilder.handleThickness
     */
    fun handleThickness(handleThickness: Dp): SplitterDimensionsBuilder =
        handleThickness(handleThickness.asStatefulValue())

    /**
     * Устанавливает толщину [handleThickness] линий ручки.
     * @see SplitterDimensions.handleThickness
     */
    fun handleThickness(handleThickness: StatefulValue<Dp>): SplitterDimensionsBuilder

    /**
     * Устанавливает величину [gap] отступа, в котором располагается ручка.
     * @see SplitterDimensionsBuilder.gap
     */
    fun gap(gap: Dp): SplitterDimensionsBuilder =
        gap(gap.asStatefulValue())

    /**
     * Устанавливает величину [gap] отступа, в котором располагается ручка.
     * @see SplitterDimensions.gap
     */
    fun gap(gap: StatefulValue<Dp>): SplitterDimensionsBuilder

    /**
     * Устанавливает отступ [padding] линий ручки в начале.
     * @see SplitterDimensionsBuilder.handleStartPadding
     */
    fun handleStartPadding(padding: Dp): SplitterDimensionsBuilder =
        handleStartPadding(padding.asStatefulValue())

    /**
     * Устанавливает отступ [padding] линий ручки в начале.
     * @see SplitterDimensions.handleStartPadding
     */
    fun handleStartPadding(padding: StatefulValue<Dp>): SplitterDimensionsBuilder

    /**
     * Устанавливает отступ [padding] линий ручки сверху.
     * @see SplitterDimensionsBuilder.handleTopPadding
     */
    fun handleTopPadding(padding: Dp): SplitterDimensionsBuilder =
        handleTopPadding(padding.asStatefulValue())

    /**
     * Устанавливает отступ [padding] линий ручки сверху.
     * @see SplitterDimensions.handleTopPadding
     */
    fun handleTopPadding(padding: StatefulValue<Dp>): SplitterDimensionsBuilder

    /**
     * Устанавливает отступ [padding] линий ручки в конце.
     * @see SplitterDimensionsBuilder.handleEndPadding
     */
    fun handleEndPadding(padding: Dp): SplitterDimensionsBuilder =
        handleEndPadding(padding.asStatefulValue())

    /**
     * Устанавливает отступ [padding] линий ручки в конце.
     * @see SplitterDimensions.handleEndPadding
     */
    fun handleEndPadding(padding: StatefulValue<Dp>): SplitterDimensionsBuilder

    /**
     * Устанавливает отступ [padding] линий ручки снизу.
     * @see SplitterDimensionsBuilder.handleBottomPadding
     */
    fun handleBottomPadding(padding: Dp): SplitterDimensionsBuilder =
        handleBottomPadding(padding.asStatefulValue())

    /**
     * Устанавливает отступ [padding] линий ручки снизу.
     * @see SplitterDimensions.handleBottomPadding
     */
    fun handleBottomPadding(padding: StatefulValue<Dp>): SplitterDimensionsBuilder

    /**
     * Устанавливает отступ [handleSpacer] между линиями ручки.
     * @see SplitterDimensionsBuilder.handleSpacer
     */
    fun handleSpacer(handleSpacer: Dp): SplitterDimensionsBuilder =
        handleSpacer(handleSpacer.asStatefulValue())

    /**
     * Устанавливает отступ [handleSpacer] между линиями ручки.
     * @see SplitterDimensions.handleSpacer
     */
    fun handleSpacer(handleSpacer: StatefulValue<Dp>): SplitterDimensionsBuilder

    /**
     * Возвращает [SplitterDimensions]
     */
    fun build(): SplitterDimensions

    companion object {

        /**
         * Возвращает экземпляр [SplitterDimensionsBuilder]
         */
        fun builder(): SplitterDimensionsBuilder = DefaultSplitterDimensions.Builder()
    }
}

@Immutable
internal class DefaultSplitterStyle(
    override val dividerShape: StatefulValue<CornerBasedShape>,
    override val color: SplitterColor,
    override val dimensions: SplitterDimensions,
    override val handleShape: StatefulValue<CornerBasedShape>,
) : SplitterStyle

@Stable
private class SplitterStyleBuilderImpl(override val receiver: Any?) : SplitterStyleBuilder {
    private val defaultShape = RoundedCornerShape(0.dp)
    private var dividerShape: StatefulValue<CornerBasedShape>? = null
    private var handleShape: StatefulValue<CornerBasedShape>? = null
    private var colorBuilder: SplitterColorBuilder = SplitterColorBuilder.builder()
    private var dimensionsBuilder: SplitterDimensionsBuilder =
        SplitterDimensionsBuilder.builder()

    override fun dividerShape(shape: StatefulValue<CornerBasedShape>) = apply {
        this.dividerShape = shape
    }

    override fun handleShape(shape: StatefulValue<CornerBasedShape>) = apply {
        this.handleShape = shape
    }

    @Composable
    override fun color(builder: @Composable (SplitterColorBuilder.() -> Unit)) =
        apply {
            this.colorBuilder.builder()
        }

    @Composable
    override fun dimensions(builder: @Composable (SplitterDimensionsBuilder.() -> Unit)) =
        apply {
            this.dimensionsBuilder.builder()
        }

    override fun style(): SplitterStyle {
        return DefaultSplitterStyle(
            dividerShape = dividerShape ?: defaultShape.asStatefulValue(),
            handleShape = handleShape ?: CircleShape.asStatefulValue(),
            color = colorBuilder.build(),
            dimensions = dimensionsBuilder.build(),
        )
    }
}

@Immutable
private class DefaultSplitterColor(
    override val dividerColor: StatefulValue<Brush>,
    override val handleColor: StatefulValue<Brush>,

) : SplitterColor {
    class Builder : SplitterColorBuilder {
        private var dividerColor: StatefulValue<Brush>? = null
        private var handleColor: StatefulValue<Brush>? = null
        override fun dividerColor(dividerColor: StatefulValue<Brush>): SplitterColorBuilder = apply {
            this.dividerColor = dividerColor
        }

        override fun handleColor(handleColor: StatefulValue<Brush>): SplitterColorBuilder = apply {
            this.handleColor = handleColor
        }

        override fun build(): SplitterColor = DefaultSplitterColor(
            dividerColor = dividerColor ?: Color.LightGray.asStatefulBrush(),
            handleColor = handleColor ?: Color.LightGray.asStatefulBrush(),
        )
    }
}

@Immutable
private class DefaultSplitterDimensions(
    override val dividerThickness: StatefulValue<Dp>,
    override val handleThickness: StatefulValue<Dp>,
    override val handleStartPadding: StatefulValue<Dp>,
    override val handleTopPadding: StatefulValue<Dp>,
    override val handleEndPadding: StatefulValue<Dp>,
    override val handleBottomPadding: StatefulValue<Dp>,
    override val gap: StatefulValue<Dp>,
    override val handleSpacer: StatefulValue<Dp>,
) : SplitterDimensions {
    class Builder : SplitterDimensionsBuilder {
        private var dividerThickness: StatefulValue<Dp>? = null
        private var handleThickness: StatefulValue<Dp>? = null
        private var handleStartPadding: StatefulValue<Dp>? = null
        private var handleTopPadding: StatefulValue<Dp>? = null
        private var handleEndPadding: StatefulValue<Dp>? = null
        private var handleBottomPadding: StatefulValue<Dp>? = null
        private var handleSpacer: StatefulValue<Dp>? = null
        private var gap: StatefulValue<Dp>? = null

        override fun dividerThickness(dividerThickness: StatefulValue<Dp>): SplitterDimensionsBuilder = apply {
            this.dividerThickness = dividerThickness
        }

        override fun handleThickness(handleThickness: StatefulValue<Dp>): SplitterDimensionsBuilder = apply {
            this.handleThickness = handleThickness
        }

        override fun gap(gap: StatefulValue<Dp>): SplitterDimensionsBuilder = apply {
            this.gap = gap
        }

        override fun handleStartPadding(padding: StatefulValue<Dp>): SplitterDimensionsBuilder = apply {
            this.handleStartPadding = padding
        }

        override fun handleTopPadding(padding: StatefulValue<Dp>): SplitterDimensionsBuilder = apply {
            this.handleTopPadding = padding
        }

        override fun handleEndPadding(padding: StatefulValue<Dp>): SplitterDimensionsBuilder = apply {
            this.handleEndPadding = padding
        }

        override fun handleBottomPadding(padding: StatefulValue<Dp>): SplitterDimensionsBuilder = apply {
            this.handleBottomPadding = padding
        }

        override fun handleSpacer(handleSpacer: StatefulValue<Dp>): SplitterDimensionsBuilder = apply {
            this.handleSpacer = handleSpacer
        }

        override fun build(): SplitterDimensions = DefaultSplitterDimensions(
            dividerThickness = dividerThickness ?: 2.dp.asStatefulValue(),
            handleThickness = handleThickness ?: 1.dp.asStatefulValue(),
            handleStartPadding = handleStartPadding ?: 3.dp.asStatefulValue(),
            handleTopPadding = handleTopPadding ?: 3.dp.asStatefulValue(),
            handleEndPadding = handleEndPadding ?: 3.dp.asStatefulValue(),
            handleBottomPadding = handleBottomPadding ?: 3.dp.asStatefulValue(),
            handleSpacer = handleSpacer ?: 5.dp.asStatefulValue(),
            gap = gap ?: 22.dp.asStatefulValue(),
        )
    }
}
