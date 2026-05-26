package com.sdds.compose.uikit.ai

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal, предоставляющий текущий [AnswerStyle].
 */
val LocalAnswerStyle = compositionLocalOf(structuralEqualityPolicy()) {
    AnswerStyle.builder().style()
}

/**
 * Стиль компонента [Answer].
 */
@Stable
interface AnswerStyle : Style {
    /**
     * Цвета компонента.
     */
    val colors: AnswerColors

    /**
     * Размеры и отступы компонента.
     */
    val dimensions: AnswerDimensions

    /**
     * Стиль текста title.
     */
    val titleStyle: StatefulValue<TextStyle>

    /**
     * Стиль основного контента.
     */
    val contentStyle: StatefulValue<TextStyle>

    /**
     * Стиль текста loading-состояния.
     */
    val loadingTextStyle: StatefulValue<TextStyle>

    /**
     * Стиль [com.sdds.compose.uikit.Note] для error-состояния.
     */
    val noteStyle: NoteStyle

    /**
     * Стиль [com.sdds.compose.uikit.Spinner] для loading-состояния.
     */
    val loadingSpinnerStyle: SpinnerStyle

    /**
     * Стиль стартовой группы действий.
     */
    val actionsStartButtonGroupStyle: ButtonGroupStyle

    /**
     * Стиль конечной группы действий.
     */
    val actionsEndButtonGroupStyle: ButtonGroupStyle

    /**
     * Стиль группы suggestions.
     */
    val suggestionsChipGroupStyle: ChipGroupStyle

    companion object {
        /**
         * Возвращает builder для [AnswerStyle].
         */
        fun builder(receiver: Any? = null): AnswerStyleBuilder = DefaultAnswerStyle.Builder(receiver)
    }
}

/**
 * Цвета компонента [Answer].
 */
@Stable
interface AnswerColors {
    /**
     * Фон контейнера.
     */
    val background: StatefulValue<Brush>

    /**
     * Цвет title.
     */
    val title: StatefulValue<Brush>

    /**
     * Цвет основного контента.
     */
    val content: StatefulValue<Brush>

    /**
     * Цвет loading-текста.
     */
    val loadingText: StatefulValue<Brush>
}

/**
 * Размеры компонента [Answer].
 */
@Stable
interface AnswerDimensions {
    /**
     * Отступ слева.
     */
    val paddingStart: StatefulValue<Dp>

    /**
     * Отступ справа.
     */
    val paddingEnd: StatefulValue<Dp>

    /**
     * Отступ сверху.
     */
    val paddingTop: StatefulValue<Dp>

    /**
     * Отступ снизу.
     */
    val paddingBottom: StatefulValue<Dp>

    /**
     * Отступ между title и content.
     */
    val contentGap: StatefulValue<Dp>

    /**
     * Отступ между content и actions.
     */
    val actionsGap: StatefulValue<Dp>

    /**
     * Отступ между actions и suggestions.
     */
    val suggestionsGap: StatefulValue<Dp>

    /**
     * Отступ между spinner и loading-текстом.
     */
    val loadingGap: StatefulValue<Dp>
}

/**
 * Builder [AnswerStyle].
 */
interface AnswerStyleBuilder : StyleBuilder<AnswerStyle> {
    /**
     * Устанавливает цвета компонента.
     */
    @Composable
    fun colors(builder: @Composable AnswerColorsBuilder.() -> Unit): AnswerStyleBuilder

    /**
     * Устанавливает размеры компонента.
     */
    @Composable
    fun dimensions(builder: @Composable AnswerDimensionsBuilder.() -> Unit): AnswerStyleBuilder

    /**
     * Устанавливает стиль title.
     */
    fun titleStyle(titleStyle: TextStyle): AnswerStyleBuilder = titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает stateful стиль title.
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): AnswerStyleBuilder

    /**
     * Устанавливает стиль основного контента.
     */
    fun contentStyle(contentStyle: TextStyle): AnswerStyleBuilder = contentStyle(contentStyle.asStatefulValue())

    /**
     * Устанавливает stateful стиль основного контента.
     */
    fun contentStyle(contentStyle: StatefulValue<TextStyle>): AnswerStyleBuilder

    /**
     * Устанавливает стиль loading-текста.
     */
    fun loadingTextStyle(loadingTextStyle: TextStyle): AnswerStyleBuilder =
        loadingTextStyle(loadingTextStyle.asStatefulValue())

    /**
     * Устанавливает stateful стиль loading-текста.
     */
    fun loadingTextStyle(loadingTextStyle: StatefulValue<TextStyle>): AnswerStyleBuilder

    /**
     * Устанавливает стиль Note для error-состояния.
     */
    fun noteStyle(noteStyle: NoteStyle): AnswerStyleBuilder

    /**
     * Устанавливает стиль Spinner для loading-состояния.
     */
    fun loadingSpinnerStyle(loadingSpinnerStyle: SpinnerStyle): AnswerStyleBuilder

    /**
     * Устанавливает стиль стартового [com.sdds.compose.uikit.ButtonGroup].
     */
    fun actionsStartButtonGroupStyle(actionsStartButtonGroupStyle: ButtonGroupStyle): AnswerStyleBuilder

    /**
     * Устанавливает стиль конечного [com.sdds.compose.uikit.ButtonGroup].
     */
    fun actionsEndButtonGroupStyle(actionsEndButtonGroupStyle: ButtonGroupStyle): AnswerStyleBuilder

    /**
     * Устанавливает стиль [com.sdds.compose.uikit.ChipGroup] для suggestions.
     */
    fun suggestionsChipGroupStyle(suggestionsChipGroupStyle: ChipGroupStyle): AnswerStyleBuilder
}

/**
 * Builder цветов [Answer].
 */
interface AnswerColorsBuilder {
    /**
     * Устанавливает фон.
     */
    fun background(background: StatefulValue<Brush>): AnswerColorsBuilder

    /**
     * Устанавливает фон.
     */
    fun background(background: Brush): AnswerColorsBuilder = background(background.asStatefulValue())

    /**
     * Устанавливает фон.
     */
    fun background(background: Color): AnswerColorsBuilder = background(background.asStatefulBrush())

    /**
     * Устанавливает фон.
     */
    fun background(background: InteractiveColor): AnswerColorsBuilder = background(background.asStatefulBrush())

    /**
     * Устанавливает цвет title.
     */
    fun titleColor(title: StatefulValue<Brush>): AnswerColorsBuilder

    /**
     * Устанавливает цвет title.
     */
    fun titleColor(title: Brush): AnswerColorsBuilder = titleColor(title.asStatefulValue())

    /**
     * Устанавливает цвет title.
     */
    fun titleColor(title: Color): AnswerColorsBuilder = titleColor(title.asInteractive())

    /**
     * Устанавливает цвет title.
     */
    fun titleColor(title: InteractiveColor): AnswerColorsBuilder = titleColor(title.asStatefulBrush())

    /**
     * Устанавливает цвет основного контента.
     */
    fun contentColor(content: StatefulValue<Brush>): AnswerColorsBuilder

    /**
     * Устанавливает цвет основного контента.
     */
    fun contentColor(content: Brush): AnswerColorsBuilder = contentColor(content.asStatefulValue())

    /**
     * Устанавливает цвет основного контента.
     */
    fun contentColor(content: Color): AnswerColorsBuilder = contentColor(content.asInteractive())

    /**
     * Устанавливает цвет основного контента.
     */
    fun contentColor(content: InteractiveColor): AnswerColorsBuilder = contentColor(content.asStatefulBrush())

    /**
     * Устанавливает цвет loading-текста.
     */
    fun loadingTextColor(loadingText: StatefulValue<Brush>): AnswerColorsBuilder

    /**
     * Устанавливает цвет loading-текста.
     */
    fun loadingTextColor(loadingText: Brush): AnswerColorsBuilder = loadingTextColor(loadingText.asStatefulValue())

    /**
     * Устанавливает цвет loading-текста.
     */
    fun loadingTextColor(loadingText: Color): AnswerColorsBuilder = loadingTextColor(loadingText.asInteractive())

    /**
     * Устанавливает цвет loading-текста.
     */
    fun loadingTextColor(loadingText: InteractiveColor): AnswerColorsBuilder =
        loadingTextColor(loadingText.asStatefulBrush())

    /**
     * Возвращает готовые цвета.
     */
    fun build(): AnswerColors
}

/**
 * Builder размеров [Answer].
 */
interface AnswerDimensionsBuilder {
    /**
     * Устанавливает отступ слева.
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): AnswerDimensionsBuilder

    /**
     * Устанавливает отступ слева.
     */
    fun paddingStart(paddingStart: Dp): AnswerDimensionsBuilder = paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ справа.
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): AnswerDimensionsBuilder

    /**
     * Устанавливает отступ справа.
     */
    fun paddingEnd(paddingEnd: Dp): AnswerDimensionsBuilder = paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ сверху.
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): AnswerDimensionsBuilder

    /**
     * Устанавливает отступ сверху.
     */
    fun paddingTop(paddingTop: Dp): AnswerDimensionsBuilder = paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ снизу.
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): AnswerDimensionsBuilder

    /**
     * Устанавливает отступ снизу.
     */
    fun paddingBottom(paddingBottom: Dp): AnswerDimensionsBuilder = paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ между title и content.
     */
    fun contentGap(contentGap: StatefulValue<Dp>): AnswerDimensionsBuilder

    /**
     * Устанавливает отступ между title и content.
     */
    fun contentGap(contentGap: Dp): AnswerDimensionsBuilder = contentGap(contentGap.asStatefulValue())

    /**
     * Устанавливает отступ между content и actions.
     */
    fun actionsGap(actionsGap: StatefulValue<Dp>): AnswerDimensionsBuilder

    /**
     * Устанавливает отступ между content и actions.
     */
    fun actionsGap(actionsGap: Dp): AnswerDimensionsBuilder = actionsGap(actionsGap.asStatefulValue())

    /**
     * Устанавливает отступ между actions и suggestions.
     */
    fun suggestionsGap(suggestionsGap: StatefulValue<Dp>): AnswerDimensionsBuilder

    /**
     * Устанавливает отступ между actions и suggestions.
     */
    fun suggestionsGap(suggestionsGap: Dp): AnswerDimensionsBuilder = suggestionsGap(suggestionsGap.asStatefulValue())

    /**
     * Устанавливает отступ между spinner и loading-текстом.
     */
    fun loadingGap(loadingGap: StatefulValue<Dp>): AnswerDimensionsBuilder

    /**
     * Устанавливает отступ между spinner и loading-текстом.
     */
    fun loadingGap(loadingGap: Dp): AnswerDimensionsBuilder = loadingGap(loadingGap.asStatefulValue())

    /**
     * Возвращает готовые размеры.
     */
    fun build(): AnswerDimensions
}

@Immutable
private data class DefaultAnswerStyle(
    override val colors: AnswerColors,
    override val dimensions: AnswerDimensions,
    override val titleStyle: StatefulValue<TextStyle>,
    override val contentStyle: StatefulValue<TextStyle>,
    override val loadingTextStyle: StatefulValue<TextStyle>,
    override val noteStyle: NoteStyle,
    override val loadingSpinnerStyle: SpinnerStyle,
    override val actionsStartButtonGroupStyle: ButtonGroupStyle,
    override val actionsEndButtonGroupStyle: ButtonGroupStyle,
    override val suggestionsChipGroupStyle: ChipGroupStyle,
) : AnswerStyle {
    class Builder(receiver: Any?) : AnswerStyleBuilder {
        private var colorsBuilder: AnswerColorsBuilder = DefaultAnswerColors.Builder()
        private var dimensionsBuilder: AnswerDimensionsBuilder = DefaultAnswerDimensions.Builder()
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var contentStyle: StatefulValue<TextStyle>? = null
        private var loadingTextStyle: StatefulValue<TextStyle>? = null
        private var noteStyle: NoteStyle? = null
        private var loadingSpinnerStyle: SpinnerStyle? = null
        private var actionsStartButtonGroupStyle: ButtonGroupStyle? = null
        private var actionsEndButtonGroupStyle: ButtonGroupStyle? = null
        private var suggestionsChipGroupStyle: ChipGroupStyle? = null

        @Composable
        override fun colors(builder: @Composable AnswerColorsBuilder.() -> Unit) = apply {
            colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable AnswerDimensionsBuilder.() -> Unit) = apply {
            dimensionsBuilder.builder()
        }

        override fun titleStyle(titleStyle: StatefulValue<TextStyle>) = apply {
            this.titleStyle = titleStyle
        }

        override fun contentStyle(contentStyle: StatefulValue<TextStyle>) = apply {
            this.contentStyle = contentStyle
        }

        override fun loadingTextStyle(loadingTextStyle: StatefulValue<TextStyle>) = apply {
            this.loadingTextStyle = loadingTextStyle
        }

        override fun noteStyle(noteStyle: NoteStyle) = apply {
            this.noteStyle = noteStyle
        }

        override fun loadingSpinnerStyle(loadingSpinnerStyle: SpinnerStyle) = apply {
            this.loadingSpinnerStyle = loadingSpinnerStyle
        }

        override fun actionsStartButtonGroupStyle(actionsStartButtonGroupStyle: ButtonGroupStyle) = apply {
            this.actionsStartButtonGroupStyle = actionsStartButtonGroupStyle
        }

        override fun actionsEndButtonGroupStyle(actionsEndButtonGroupStyle: ButtonGroupStyle) = apply {
            this.actionsEndButtonGroupStyle = actionsEndButtonGroupStyle
        }

        override fun suggestionsChipGroupStyle(suggestionsChipGroupStyle: ChipGroupStyle) = apply {
            this.suggestionsChipGroupStyle = suggestionsChipGroupStyle
        }

        override fun style(): AnswerStyle {
            return DefaultAnswerStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                titleStyle = titleStyle ?: TextStyle.Default.asStatefulValue(),
                contentStyle = contentStyle ?: TextStyle.Default.asStatefulValue(),
                loadingTextStyle = loadingTextStyle ?: TextStyle.Default.asStatefulValue(),
                noteStyle = noteStyle ?: NoteStyle.builder().style(),
                loadingSpinnerStyle = loadingSpinnerStyle ?: SpinnerStyle.builder().style(),
                actionsStartButtonGroupStyle = actionsStartButtonGroupStyle ?: ButtonGroupStyle.builder().style(),
                actionsEndButtonGroupStyle = actionsEndButtonGroupStyle ?: ButtonGroupStyle.builder().style(),
                suggestionsChipGroupStyle = suggestionsChipGroupStyle ?: ChipGroupStyle.builder().style(),
            )
        }
    }
}

@Immutable
private data class DefaultAnswerColors(
    override val background: StatefulValue<Brush>,
    override val title: StatefulValue<Brush>,
    override val content: StatefulValue<Brush>,
    override val loadingText: StatefulValue<Brush>,
) : AnswerColors {
    class Builder : AnswerColorsBuilder {
        private var background: StatefulValue<Brush>? = null
        private var title: StatefulValue<Brush>? = null
        private var content: StatefulValue<Brush>? = null
        private var loadingText: StatefulValue<Brush>? = null

        override fun background(background: StatefulValue<Brush>) = apply {
            this.background = background
        }

        override fun titleColor(title: StatefulValue<Brush>) = apply {
            this.title = title
        }

        override fun contentColor(content: StatefulValue<Brush>) = apply {
            this.content = content
        }

        override fun loadingTextColor(loadingText: StatefulValue<Brush>) = apply {
            this.loadingText = loadingText
        }

        override fun build(): AnswerColors {
            return DefaultAnswerColors(
                background = background ?: Color.Transparent.asStatefulBrush(),
                title = title ?: Color.Black.asStatefulBrush(),
                content = content ?: Color.Black.asStatefulBrush(),
                loadingText = loadingText ?: Color.Black.asStatefulBrush(),
            )
        }
    }
}

@Immutable
private data class DefaultAnswerDimensions(
    override val paddingStart: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val paddingTop: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,
    override val contentGap: StatefulValue<Dp>,
    override val actionsGap: StatefulValue<Dp>,
    override val suggestionsGap: StatefulValue<Dp>,
    override val loadingGap: StatefulValue<Dp>,
) : AnswerDimensions {
    class Builder : AnswerDimensionsBuilder {
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var contentGap: StatefulValue<Dp>? = null
        private var actionsGap: StatefulValue<Dp>? = null
        private var suggestionsGap: StatefulValue<Dp>? = null
        private var loadingGap: StatefulValue<Dp>? = null

        override fun paddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun contentGap(contentGap: StatefulValue<Dp>) = apply {
            this.contentGap = contentGap
        }

        override fun actionsGap(actionsGap: StatefulValue<Dp>) = apply {
            this.actionsGap = actionsGap
        }

        override fun suggestionsGap(suggestionsGap: StatefulValue<Dp>) = apply {
            this.suggestionsGap = suggestionsGap
        }

        override fun loadingGap(loadingGap: StatefulValue<Dp>) = apply {
            this.loadingGap = loadingGap
        }

        override fun build(): AnswerDimensions {
            return DefaultAnswerDimensions(
                paddingStart = paddingStart ?: 0.dp.asStatefulValue(),
                paddingEnd = paddingEnd ?: 0.dp.asStatefulValue(),
                paddingTop = paddingTop ?: 0.dp.asStatefulValue(),
                paddingBottom = paddingBottom ?: 0.dp.asStatefulValue(),
                contentGap = contentGap ?: 8.dp.asStatefulValue(),
                actionsGap = actionsGap ?: 12.dp.asStatefulValue(),
                suggestionsGap = suggestionsGap ?: 12.dp.asStatefulValue(),
                loadingGap = loadingGap ?: 8.dp.asStatefulValue(),
            )
        }
    }
}
