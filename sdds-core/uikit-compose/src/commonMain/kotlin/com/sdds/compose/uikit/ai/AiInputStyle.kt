package com.sdds.compose.uikit.ai

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal с [AiInputStyle] для компонента [AiInput]
 */
val LocalAiInputStyle = compositionLocalOf { AiInputStyle.builder().style() }

/**
 * Режим отображения компонента [AiInput].
 */
enum class AiInputMode {

    /**
     * Поле ввода располагается в одну строку с контролами при однострочном тексте
     * и переносится над контролами при многострочном.
     */
    Condensed,

    /**
     * Поле ввода всегда располагается над контролами.
     */
    Extended,
}

/**
 * Стиль компонента [AiInput]
 */
@Stable
interface AiInputStyle : Style {

    /**
     * Форма компонента
     */
    val shape: StatefulValue<Shape>

    /**
     * Режим отображения компонента
     */
    val mode: AiInputMode

    /**
     * Типографика вводимого текста
     */
    val inputStyle: StatefulValue<TextStyle>

    /**
     * Типографика placeholder
     */
    val placeholderStyle: StatefulValue<TextStyle>

    /**
     * Цвета компонента
     */
    val colors: AiInputColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: AiInputDimensions

    /**
     * Стиль компонента File для слота контента
     */
    val fileStyle: FileStyle

    /**
     * Стиль группы кнопок слева
     */
    val startButtonGroupStyle: ButtonGroupStyle

    /**
     * Стиль группы кнопок справа
     */
    val endButtonGroupStyle: ButtonGroupStyle

    /**
     * Стиль кнопки отправки
     */
    val sendButtonStyle: ButtonStyle

    /**
     * Стиль скроллбара текстового поля
     */
    val scrollBarStyle: ScrollBarStyle

    companion object {
        /**
         * Возвращает экземпляр [AiInputStyleBuilder]
         */
        fun builder(receiver: Any? = null): AiInputStyleBuilder = DefaultAiInputStyle.Builder()
    }
}

/**
 * Билдер стиля [AiInputStyle]
 */
@ApiInfo
interface AiInputStyleBuilder : StyleBuilder<AiInputStyle> {

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: Shape): AiInputStyleBuilder = shape(shape.asStatefulValue())

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: StatefulValue<Shape>): AiInputStyleBuilder

    /**
     * Устанавливает режим отображения компонента
     */
    fun mode(mode: AiInputMode): AiInputStyleBuilder

    /**
     * Устанавливает типографику вводимого текста
     */
    fun inputStyle(inputStyle: TextStyle): AiInputStyleBuilder =
        inputStyle(inputStyle.asStatefulValue())

    /**
     * Устанавливает типографику вводимого текста
     */
    fun inputStyle(inputStyle: StatefulValue<TextStyle>): AiInputStyleBuilder

    /**
     * Устанавливает типографику placeholder
     */
    fun placeholderStyle(placeholderStyle: TextStyle): AiInputStyleBuilder =
        placeholderStyle(placeholderStyle.asStatefulValue())

    /**
     * Устанавливает типографику placeholder
     */
    fun placeholderStyle(placeholderStyle: StatefulValue<TextStyle>): AiInputStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     */
    @Composable
    fun colors(builder: @Composable AiInputColorsBuilder.() -> Unit): AiInputStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder]
     */
    @Composable
    fun dimensions(builder: @Composable AiInputDimensionsBuilder.() -> Unit): AiInputStyleBuilder

    /**
     * Устанавливает стиль компонента File
     */
    fun fileStyle(fileStyle: FileStyle): AiInputStyleBuilder

    /**
     * Устанавливает стиль группы кнопок слева
     */
    fun startButtonGroupStyle(startButtonGroupStyle: ButtonGroupStyle): AiInputStyleBuilder

    /**
     * Устанавливает стиль группы кнопок справа
     */
    fun endButtonGroupStyle(endButtonGroupStyle: ButtonGroupStyle): AiInputStyleBuilder

    /**
     * Устанавливает стиль кнопки отправки
     */
    fun sendButtonStyle(sendButtonStyle: ButtonStyle): AiInputStyleBuilder

    /**
     * Устанавливает стиль скроллбара текстового поля
     */
    fun scrollBarStyle(scrollBarStyle: ScrollBarStyle): AiInputStyleBuilder
}

@Immutable
private data class DefaultAiInputStyle(
    override val shape: StatefulValue<Shape>,
    override val mode: AiInputMode,
    override val inputStyle: StatefulValue<TextStyle>,
    override val placeholderStyle: StatefulValue<TextStyle>,
    override val colors: AiInputColors,
    override val dimensions: AiInputDimensions,
    override val fileStyle: FileStyle,
    override val startButtonGroupStyle: ButtonGroupStyle,
    override val endButtonGroupStyle: ButtonGroupStyle,
    override val sendButtonStyle: ButtonStyle,
    override val scrollBarStyle: ScrollBarStyle,
) : AiInputStyle {

    class Builder : AiInputStyleBuilder {
        private var shape: StatefulValue<Shape>? = null
        private var mode: AiInputMode = AiInputMode.Condensed
        private var inputStyle: StatefulValue<TextStyle>? = null
        private var placeholderStyle: StatefulValue<TextStyle>? = null
        private var colorsBuilder: AiInputColorsBuilder = AiInputColors.builder()
        private var dimensionsBuilder: AiInputDimensionsBuilder = AiInputDimensions.builder()
        private var fileStyle: FileStyle? = null
        private var startButtonGroupStyle: ButtonGroupStyle? = null
        private var endButtonGroupStyle: ButtonGroupStyle? = null
        private var sendButtonStyle: ButtonStyle? = null
        private var scrollBarStyle: ScrollBarStyle? = null

        override fun shape(shape: StatefulValue<Shape>) = apply { this.shape = shape }

        override fun mode(mode: AiInputMode) = apply { this.mode = mode }

        override fun inputStyle(inputStyle: StatefulValue<TextStyle>) = apply {
            this.inputStyle = inputStyle
        }

        override fun placeholderStyle(placeholderStyle: StatefulValue<TextStyle>) = apply {
            this.placeholderStyle = placeholderStyle
        }

        @Composable
        override fun colors(builder: @Composable AiInputColorsBuilder.() -> Unit) = apply {
            colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable AiInputDimensionsBuilder.() -> Unit) = apply {
            dimensionsBuilder.builder()
        }

        override fun fileStyle(fileStyle: FileStyle) = apply { this.fileStyle = fileStyle }

        override fun startButtonGroupStyle(startButtonGroupStyle: ButtonGroupStyle) = apply {
            this.startButtonGroupStyle = startButtonGroupStyle
        }

        override fun endButtonGroupStyle(endButtonGroupStyle: ButtonGroupStyle) = apply {
            this.endButtonGroupStyle = endButtonGroupStyle
        }

        override fun sendButtonStyle(sendButtonStyle: ButtonStyle) = apply {
            this.sendButtonStyle = sendButtonStyle
        }

        override fun scrollBarStyle(scrollBarStyle: ScrollBarStyle) = apply {
            this.scrollBarStyle = scrollBarStyle
        }

        override fun style(): AiInputStyle = DefaultAiInputStyle(
            shape = shape ?: RoundedCornerShape(0).asStatefulValue(),
            mode = mode,
            inputStyle = inputStyle ?: TextStyle.Default.asStatefulValue(),
            placeholderStyle = placeholderStyle ?: TextStyle.Default.asStatefulValue(),
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            fileStyle = fileStyle ?: FileStyle.builder().style(),
            startButtonGroupStyle = startButtonGroupStyle ?: ButtonGroupStyle.builder().style(),
            endButtonGroupStyle = endButtonGroupStyle ?: ButtonGroupStyle.builder().style(),
            sendButtonStyle = sendButtonStyle ?: ButtonStyle.iconButtonBuilder().style(),
            scrollBarStyle = scrollBarStyle ?: ScrollBarStyle.builder().style(),
        )
    }
}

/**
 * Цвета компонента [AiInput]
 */
@Stable
interface AiInputColors {

    /**
     * Кисть фона компонента
     */
    val backgroundColor: StatefulValue<Brush>

    /**
     * Кисть вводимого текста
     */
    val inputColor: StatefulValue<Brush>

    /**
     * Кисть placeholder
     */
    val placeholderColor: StatefulValue<Brush>

    /**
     * Кисть курсора
     */
    val cursorColor: StatefulValue<Brush>

    companion object {
        /**
         * Возвращает экземпляр [AiInputColorsBuilder]
         */
        fun builder(): AiInputColorsBuilder = DefaultAiInputColors.Builder()
    }
}

/**
 * Билдер для [AiInputColors]
 */
interface AiInputColorsBuilder {

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(color: Color): AiInputColorsBuilder =
        backgroundColor(SolidColor(color).asStatefulValue())

    /**
     * Устанавливает интерактивный цвет фона
     */
    fun backgroundColor(color: InteractiveColor): AiInputColorsBuilder =
        backgroundColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть фона
     */
    fun backgroundColor(brush: Brush): AiInputColorsBuilder =
        backgroundColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти фона
     */
    fun backgroundColor(brush: StatefulValue<Brush>): AiInputColorsBuilder

    /**
     * Устанавливает цвет вводимого текста
     */
    fun inputColor(color: Color): AiInputColorsBuilder =
        inputColor(color.asStatefulBrush())

    /**
     * Устанавливает интерактивный цвет вводимого текста
     */
    fun inputColor(color: InteractiveColor): AiInputColorsBuilder =
        inputColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть вводимого текста
     */
    fun inputColor(brush: Brush): AiInputColorsBuilder =
        inputColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти вводимого текста
     */
    fun inputColor(brush: StatefulValue<Brush>): AiInputColorsBuilder

    /**
     * Устанавливает цвет placeholder
     */
    fun placeholderColor(color: Color): AiInputColorsBuilder =
        placeholderColor(color.asStatefulBrush())

    /**
     * Устанавливает интерактивный цвет placeholder
     */
    fun placeholderColor(color: InteractiveColor): AiInputColorsBuilder =
        placeholderColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть placeholder
     */
    fun placeholderColor(brush: Brush): AiInputColorsBuilder =
        placeholderColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти placeholder
     */
    fun placeholderColor(brush: StatefulValue<Brush>): AiInputColorsBuilder

    /**
     * Устанавливает цвет курсора
     */
    fun cursorColor(color: Color): AiInputColorsBuilder =
        cursorColor(SolidColor(color).asStatefulValue())

    /**
     * Устанавливает интерактивный цвет курсора
     */
    fun cursorColor(color: InteractiveColor): AiInputColorsBuilder =
        cursorColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть курсора
     */
    fun cursorColor(brush: Brush): AiInputColorsBuilder =
        cursorColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти курсора
     */
    fun cursorColor(brush: StatefulValue<Brush>): AiInputColorsBuilder

    /**
     * Создаёт экземпляр [AiInputColors]
     */
    fun build(): AiInputColors
}

@Immutable
private class DefaultAiInputColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val inputColor: StatefulValue<Brush>,
    override val placeholderColor: StatefulValue<Brush>,
    override val cursorColor: StatefulValue<Brush>,
) : AiInputColors {

    class Builder : AiInputColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var inputColor: StatefulValue<Brush>? = null
        private var placeholderColor: StatefulValue<Brush>? = null
        private var cursorColor: StatefulValue<Brush>? = null

        override fun backgroundColor(brush: StatefulValue<Brush>) = apply {
            this.backgroundColor = brush
        }

        override fun inputColor(brush: StatefulValue<Brush>) = apply {
            this.inputColor = brush
        }

        override fun placeholderColor(brush: StatefulValue<Brush>) = apply {
            this.placeholderColor = brush
        }

        override fun cursorColor(brush: StatefulValue<Brush>) = apply {
            this.cursorColor = brush
        }

        override fun build(): AiInputColors = DefaultAiInputColors(
            backgroundColor = backgroundColor ?: SolidColor(Color.Transparent).asStatefulValue(),
            inputColor = inputColor ?: Color.Black.asStatefulBrush(),
            placeholderColor = placeholderColor ?: Color.Gray.asStatefulBrush(),
            cursorColor = cursorColor ?: Color.Black.asStatefulBrush(),
        )
    }
}

/**
 * Размеры и отступы компонента [AiInput]
 */
@Stable
interface AiInputDimensions {

    /**
     * Внешний отступ слева
     */
    val paddingStart: StatefulValue<Dp>

    /**
     * Внешний отступ справа
     */
    val paddingEnd: StatefulValue<Dp>

    /**
     * Внешний отступ сверху
     */
    val paddingTop: StatefulValue<Dp>

    /**
     * Внешний отступ снизу
     */
    val paddingBottom: StatefulValue<Dp>

    /**
     * Внутренний отступ текстового поля слева
     */
    val textFieldPaddingStart: StatefulValue<Dp>

    /**
     * Внутренний отступ текстового поля справа
     */
    val textFieldPaddingEnd: StatefulValue<Dp>

    /**
     * Внутренний отступ текстового поля сверху
     */
    val textFieldPaddingTop: StatefulValue<Dp>

    /**
     * Внутренний отступ текстового поля снизу
     */
    val textFieldPaddingBottom: StatefulValue<Dp>

    /**
     * Нижний отступ области контента
     */
    val contentPadding: StatefulValue<Dp>

    /**
     * Расстояние между элементами области контента
     */
    val contentSpacing: StatefulValue<Dp>

    /**
     * Отступ скроллбара от текстового поля (слева от скроллбара)
     */
    val scrollBarPaddingStart: StatefulValue<Dp>

    /**
     * Отступ скроллбара от верхней границы текстового поля
     */
    val scrollBarPaddingTop: StatefulValue<Dp>

    /**
     * Отступ скроллбара от нижней границы текстового поля
     */
    val scrollBarPaddingBottom: StatefulValue<Dp>

    companion object {
        /**
         * Возвращает экземпляр [AiInputDimensionsBuilder]
         */
        fun builder(): AiInputDimensionsBuilder = DefaultAiInputDimensions.Builder()
    }
}

/**
 * Билдер для [AiInputDimensions]
 */
interface AiInputDimensionsBuilder {

    /**
     * Устанавливает внешний отступ слева
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает внешний отступ слева; shorthand через [asStatefulValue]
     */
    fun paddingStart(paddingStart: Dp): AiInputDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает внешний отступ справа
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает внешний отступ справа; shorthand через [asStatefulValue]
     */
    fun paddingEnd(paddingEnd: Dp): AiInputDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает внешний отступ сверху
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает внешний отступ сверху; shorthand через [asStatefulValue]
     */
    fun paddingTop(paddingTop: Dp): AiInputDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает внешний отступ снизу
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает внешний отступ снизу; shorthand через [asStatefulValue]
     */
    fun paddingBottom(paddingBottom: Dp): AiInputDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает внутренний отступ текстового поля слева
     */
    fun textFieldPaddingStart(textFieldPaddingStart: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает внутренний отступ текстового поля слева; shorthand через [asStatefulValue]
     */
    fun textFieldPaddingStart(textFieldPaddingStart: Dp): AiInputDimensionsBuilder =
        textFieldPaddingStart(textFieldPaddingStart.asStatefulValue())

    /**
     * Устанавливает внутренний отступ текстового поля справа
     */
    fun textFieldPaddingEnd(textFieldPaddingEnd: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает внутренний отступ текстового поля справа; shorthand через [asStatefulValue]
     */
    fun textFieldPaddingEnd(textFieldPaddingEnd: Dp): AiInputDimensionsBuilder =
        textFieldPaddingEnd(textFieldPaddingEnd.asStatefulValue())

    /**
     * Устанавливает внутренний отступ текстового поля сверху
     */
    fun textFieldPaddingTop(textFieldPaddingTop: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает внутренний отступ текстового поля сверху; shorthand через [asStatefulValue]
     */
    fun textFieldPaddingTop(textFieldPaddingTop: Dp): AiInputDimensionsBuilder =
        textFieldPaddingTop(textFieldPaddingTop.asStatefulValue())

    /**
     * Устанавливает внутренний отступ текстового поля снизу
     */
    fun textFieldPaddingBottom(textFieldPaddingBottom: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает внутренний отступ текстового поля снизу; shorthand через [asStatefulValue]
     */
    fun textFieldPaddingBottom(textFieldPaddingBottom: Dp): AiInputDimensionsBuilder =
        textFieldPaddingBottom(textFieldPaddingBottom.asStatefulValue())

    /**
     * Устанавливает нижний отступ области контента
     */
    fun contentPadding(contentPadding: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает нижний отступ области контента; shorthand через [asStatefulValue]
     */
    fun contentPadding(contentPadding: Dp): AiInputDimensionsBuilder =
        contentPadding(contentPadding.asStatefulValue())

    /**
     * Устанавливает расстояние между элементами области контента
     */
    fun contentSpacing(contentSpacing: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает расстояние между элементами области контента; shorthand через [asStatefulValue]
     */
    fun contentSpacing(contentSpacing: Dp): AiInputDimensionsBuilder =
        contentSpacing(contentSpacing.asStatefulValue())

    /**
     * Устанавливает отступ скроллбара от текстового поля (слева от скроллбара)
     */
    fun scrollBarPaddingStart(scrollBarPaddingStart: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает отступ скроллбара от текстового поля (слева от скроллбара); shorthand через [asStatefulValue]
     */
    fun scrollBarPaddingStart(scrollBarPaddingStart: Dp): AiInputDimensionsBuilder =
        scrollBarPaddingStart(scrollBarPaddingStart.asStatefulValue())

    /**
     * Устанавливает отступ скроллбара от верхней границы текстового поля
     */
    fun scrollBarPaddingTop(scrollBarPaddingTop: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает отступ скроллбара от верхней границы текстового поля; shorthand через [asStatefulValue]
     */
    fun scrollBarPaddingTop(scrollBarPaddingTop: Dp): AiInputDimensionsBuilder =
        scrollBarPaddingTop(scrollBarPaddingTop.asStatefulValue())

    /**
     * Устанавливает отступ скроллбара от нижней границы текстового поля
     */
    fun scrollBarPaddingBottom(scrollBarPaddingBottom: StatefulValue<Dp>): AiInputDimensionsBuilder

    /**
     * Устанавливает отступ скроллбара от нижней границы текстового поля; shorthand через [asStatefulValue]
     */
    fun scrollBarPaddingBottom(scrollBarPaddingBottom: Dp): AiInputDimensionsBuilder =
        scrollBarPaddingBottom(scrollBarPaddingBottom.asStatefulValue())

    /**
     * Создаёт экземпляр [AiInputDimensions]
     */
    fun build(): AiInputDimensions
}

@Immutable
private data class DefaultAiInputDimensions(
    override val paddingStart: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val paddingTop: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,
    override val textFieldPaddingStart: StatefulValue<Dp>,
    override val textFieldPaddingEnd: StatefulValue<Dp>,
    override val textFieldPaddingTop: StatefulValue<Dp>,
    override val textFieldPaddingBottom: StatefulValue<Dp>,
    override val contentPadding: StatefulValue<Dp>,
    override val contentSpacing: StatefulValue<Dp>,
    override val scrollBarPaddingStart: StatefulValue<Dp>,
    override val scrollBarPaddingTop: StatefulValue<Dp>,
    override val scrollBarPaddingBottom: StatefulValue<Dp>,
) : AiInputDimensions {

    class Builder : AiInputDimensionsBuilder {
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var textFieldPaddingStart: StatefulValue<Dp>? = null
        private var textFieldPaddingEnd: StatefulValue<Dp>? = null
        private var textFieldPaddingTop: StatefulValue<Dp>? = null
        private var textFieldPaddingBottom: StatefulValue<Dp>? = null
        private var contentPadding: StatefulValue<Dp>? = null
        private var contentSpacing: StatefulValue<Dp>? = null
        private var scrollBarPaddingStart: StatefulValue<Dp>? = null
        private var scrollBarPaddingTop: StatefulValue<Dp>? = null
        private var scrollBarPaddingBottom: StatefulValue<Dp>? = null

        override fun paddingStart(paddingStart: StatefulValue<Dp>) =
            apply { this.paddingStart = paddingStart }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) =
            apply { this.paddingEnd = paddingEnd }

        override fun paddingTop(paddingTop: StatefulValue<Dp>) =
            apply { this.paddingTop = paddingTop }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>) =
            apply { this.paddingBottom = paddingBottom }

        override fun textFieldPaddingStart(textFieldPaddingStart: StatefulValue<Dp>) =
            apply { this.textFieldPaddingStart = textFieldPaddingStart }

        override fun textFieldPaddingEnd(textFieldPaddingEnd: StatefulValue<Dp>) =
            apply { this.textFieldPaddingEnd = textFieldPaddingEnd }

        override fun textFieldPaddingTop(textFieldPaddingTop: StatefulValue<Dp>) =
            apply { this.textFieldPaddingTop = textFieldPaddingTop }

        override fun textFieldPaddingBottom(textFieldPaddingBottom: StatefulValue<Dp>) =
            apply { this.textFieldPaddingBottom = textFieldPaddingBottom }

        override fun contentPadding(contentPadding: StatefulValue<Dp>) =
            apply { this.contentPadding = contentPadding }

        override fun contentSpacing(contentSpacing: StatefulValue<Dp>) =
            apply { this.contentSpacing = contentSpacing }

        override fun scrollBarPaddingStart(scrollBarPaddingStart: StatefulValue<Dp>) =
            apply { this.scrollBarPaddingStart = scrollBarPaddingStart }

        override fun scrollBarPaddingTop(scrollBarPaddingTop: StatefulValue<Dp>) =
            apply { this.scrollBarPaddingTop = scrollBarPaddingTop }

        override fun scrollBarPaddingBottom(scrollBarPaddingBottom: StatefulValue<Dp>) =
            apply { this.scrollBarPaddingBottom = scrollBarPaddingBottom }

        override fun build(): AiInputDimensions = DefaultAiInputDimensions(
            paddingStart = paddingStart ?: 0.dp.asStatefulValue(),
            paddingEnd = paddingEnd ?: 0.dp.asStatefulValue(),
            paddingTop = paddingTop ?: 0.dp.asStatefulValue(),
            paddingBottom = paddingBottom ?: 0.dp.asStatefulValue(),
            textFieldPaddingStart = textFieldPaddingStart ?: 0.dp.asStatefulValue(),
            textFieldPaddingEnd = textFieldPaddingEnd ?: 0.dp.asStatefulValue(),
            textFieldPaddingTop = textFieldPaddingTop ?: 0.dp.asStatefulValue(),
            textFieldPaddingBottom = textFieldPaddingBottom ?: 0.dp.asStatefulValue(),
            contentPadding = contentPadding ?: 0.dp.asStatefulValue(),
            contentSpacing = contentSpacing ?: 0.dp.asStatefulValue(),
            scrollBarPaddingStart = scrollBarPaddingStart ?: 0.dp.asStatefulValue(),
            scrollBarPaddingTop = scrollBarPaddingTop ?: 0.dp.asStatefulValue(),
            scrollBarPaddingBottom = scrollBarPaddingBottom ?: 0.dp.asStatefulValue(),
        )
    }
}
