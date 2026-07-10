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
import com.sdds.api.info.compose.ApiInfo
import com.sdds.api.info.compose.ApiName
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
 * CompositionLocal, предоставляющий текущий [AiAnswerStyle].
 */
val LocalAiAnswerStyle = compositionLocalOf(structuralEqualityPolicy()) {
    AiAnswerStyle.builder().style()
}

/**
 * Стиль компонента [AiAnswer].
 */
@Stable
interface AiAnswerStyle : Style {
    /**
     * Цвета компонента.
     */
    val colors: AiAnswerColors

    /**
     * Размеры и отступы компонента.
     */
    val dimensions: AiAnswerDimensions

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
         * Возвращает builder для [AiAnswerStyle].
         */
        fun builder(receiver: Any? = null): AiAnswerStyleBuilder = DefaultAiAnswerStyle.Builder(receiver)
    }
}

/**
 * Цвета компонента [AiAnswer].
 */
@Stable
interface AiAnswerColors {
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
 * Размеры компонента [AiAnswer].
 */
@Stable
interface AiAnswerDimensions {
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
 * Builder [AiAnswerStyle].
 */
@ApiInfo
interface AiAnswerStyleBuilder : StyleBuilder<AiAnswerStyle> {
    /**
     * Устанавливает цвета компонента.
     */
    @Composable
    fun colors(builder: @Composable AiAnswerColorsBuilder.() -> Unit): AiAnswerStyleBuilder

    /**
     * Устанавливает размеры компонента.
     */
    @Composable
    fun dimensions(builder: @Composable AiAnswerDimensionsBuilder.() -> Unit): AiAnswerStyleBuilder

    /**
     * Устанавливает стиль title.
     */
    fun titleStyle(titleStyle: TextStyle): AiAnswerStyleBuilder = titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает stateful стиль title.
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): AiAnswerStyleBuilder

    /**
     * Устанавливает стиль основного контента.
     */
    fun contentStyle(contentStyle: TextStyle): AiAnswerStyleBuilder = contentStyle(contentStyle.asStatefulValue())

    /**
     * Устанавливает stateful стиль основного контента.
     */
    fun contentStyle(contentStyle: StatefulValue<TextStyle>): AiAnswerStyleBuilder

    /**
     * Устанавливает стиль loading-текста.
     */
    fun loadingTextStyle(loadingTextStyle: TextStyle): AiAnswerStyleBuilder =
        loadingTextStyle(loadingTextStyle.asStatefulValue())

    /**
     * Устанавливает stateful стиль loading-текста.
     */
    fun loadingTextStyle(loadingTextStyle: StatefulValue<TextStyle>): AiAnswerStyleBuilder

    /**
     * Устанавливает стиль Note для error-состояния.
     */
    fun noteStyle(noteStyle: NoteStyle): AiAnswerStyleBuilder

    /**
     * Устанавливает стиль Spinner для loading-состояния.
     */
    fun loadingSpinnerStyle(loadingSpinnerStyle: SpinnerStyle): AiAnswerStyleBuilder

    /**
     * Устанавливает стиль стартового [com.sdds.compose.uikit.ButtonGroup].
     */
    fun actionsStartButtonGroupStyle(actionsStartButtonGroupStyle: ButtonGroupStyle): AiAnswerStyleBuilder

    /**
     * Устанавливает стиль конечного [com.sdds.compose.uikit.ButtonGroup].
     */
    fun actionsEndButtonGroupStyle(actionsEndButtonGroupStyle: ButtonGroupStyle): AiAnswerStyleBuilder

    /**
     * Устанавливает стиль [com.sdds.compose.uikit.ChipGroup] для suggestions.
     */
    fun suggestionsChipGroupStyle(suggestionsChipGroupStyle: ChipGroupStyle): AiAnswerStyleBuilder
}

/**
 * Builder цветов [AiAnswer].
 */
interface AiAnswerColorsBuilder {
    /**
     * Устанавливает фон.
     */
    @ApiName(name = "backgroundColor")
    fun background(background: StatefulValue<Brush>): AiAnswerColorsBuilder

    /**
     * Устанавливает фон.
     */
    @ApiName(name = "backgroundColor")
    fun background(background: Brush): AiAnswerColorsBuilder = background(background.asStatefulValue())

    /**
     * Устанавливает фон.
     */
    @ApiName(name = "backgroundColor")
    fun background(background: Color): AiAnswerColorsBuilder = background(background.asStatefulBrush())

    /**
     * Устанавливает фон.
     */
    @ApiName(name = "backgroundColor")
    fun background(background: InteractiveColor): AiAnswerColorsBuilder = background(background.asStatefulBrush())

    /**
     * Устанавливает цвет title.
     */
    fun titleColor(title: StatefulValue<Brush>): AiAnswerColorsBuilder

    /**
     * Устанавливает цвет title.
     */
    fun titleColor(title: Brush): AiAnswerColorsBuilder = titleColor(title.asStatefulValue())

    /**
     * Устанавливает цвет title.
     */
    fun titleColor(title: Color): AiAnswerColorsBuilder = titleColor(title.asInteractive())

    /**
     * Устанавливает цвет title.
     */
    fun titleColor(title: InteractiveColor): AiAnswerColorsBuilder = titleColor(title.asStatefulBrush())

    /**
     * Устанавливает цвет основного контента.
     */
    fun contentColor(content: StatefulValue<Brush>): AiAnswerColorsBuilder

    /**
     * Устанавливает цвет основного контента.
     */
    fun contentColor(content: Brush): AiAnswerColorsBuilder = contentColor(content.asStatefulValue())

    /**
     * Устанавливает цвет основного контента.
     */
    fun contentColor(content: Color): AiAnswerColorsBuilder = contentColor(content.asInteractive())

    /**
     * Устанавливает цвет основного контента.
     */
    fun contentColor(content: InteractiveColor): AiAnswerColorsBuilder = contentColor(content.asStatefulBrush())

    /**
     * Устанавливает цвет loading-текста.
     */
    fun loadingTextColor(loadingText: StatefulValue<Brush>): AiAnswerColorsBuilder

    /**
     * Устанавливает цвет loading-текста.
     */
    fun loadingTextColor(loadingText: Brush): AiAnswerColorsBuilder = loadingTextColor(loadingText.asStatefulValue())

    /**
     * Устанавливает цвет loading-текста.
     */
    fun loadingTextColor(loadingText: Color): AiAnswerColorsBuilder = loadingTextColor(loadingText.asInteractive())

    /**
     * Устанавливает цвет loading-текста.
     */
    fun loadingTextColor(loadingText: InteractiveColor): AiAnswerColorsBuilder =
        loadingTextColor(loadingText.asStatefulBrush())

    /**
     * Возвращает готовые цвета.
     */
    fun build(): AiAnswerColors
}

/**
 * Builder размеров [AiAnswer].
 */
interface AiAnswerDimensionsBuilder {
    /**
     * Устанавливает отступ слева.
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): AiAnswerDimensionsBuilder

    /**
     * Устанавливает отступ слева.
     */
    fun paddingStart(paddingStart: Dp): AiAnswerDimensionsBuilder = paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ справа.
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): AiAnswerDimensionsBuilder

    /**
     * Устанавливает отступ справа.
     */
    fun paddingEnd(paddingEnd: Dp): AiAnswerDimensionsBuilder = paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ сверху.
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): AiAnswerDimensionsBuilder

    /**
     * Устанавливает отступ сверху.
     */
    fun paddingTop(paddingTop: Dp): AiAnswerDimensionsBuilder = paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ снизу.
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): AiAnswerDimensionsBuilder

    /**
     * Устанавливает отступ снизу.
     */
    fun paddingBottom(paddingBottom: Dp): AiAnswerDimensionsBuilder = paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ между title и content.
     */
    fun contentGap(contentGap: StatefulValue<Dp>): AiAnswerDimensionsBuilder

    /**
     * Устанавливает отступ между title и content.
     */
    fun contentGap(contentGap: Dp): AiAnswerDimensionsBuilder = contentGap(contentGap.asStatefulValue())

    /**
     * Устанавливает отступ между content и actions.
     */
    fun actionsGap(actionsGap: StatefulValue<Dp>): AiAnswerDimensionsBuilder

    /**
     * Устанавливает отступ между content и actions.
     */
    fun actionsGap(actionsGap: Dp): AiAnswerDimensionsBuilder = actionsGap(actionsGap.asStatefulValue())

    /**
     * Устанавливает отступ между actions и suggestions.
     */
    fun suggestionsGap(suggestionsGap: StatefulValue<Dp>): AiAnswerDimensionsBuilder

    /**
     * Устанавливает отступ между actions и suggestions.
     */
    fun suggestionsGap(suggestionsGap: Dp): AiAnswerDimensionsBuilder = suggestionsGap(suggestionsGap.asStatefulValue())

    /**
     * Устанавливает отступ между spinner и loading-текстом.
     */
    fun loadingGap(loadingGap: StatefulValue<Dp>): AiAnswerDimensionsBuilder

    /**
     * Устанавливает отступ между spinner и loading-текстом.
     */
    fun loadingGap(loadingGap: Dp): AiAnswerDimensionsBuilder = loadingGap(loadingGap.asStatefulValue())

    /**
     * Возвращает готовые размеры.
     */
    fun build(): AiAnswerDimensions
}

@Immutable
private data class DefaultAiAnswerStyle(
    override val colors: AiAnswerColors,
    override val dimensions: AiAnswerDimensions,
    override val titleStyle: StatefulValue<TextStyle>,
    override val contentStyle: StatefulValue<TextStyle>,
    override val loadingTextStyle: StatefulValue<TextStyle>,
    override val noteStyle: NoteStyle,
    override val loadingSpinnerStyle: SpinnerStyle,
    override val actionsStartButtonGroupStyle: ButtonGroupStyle,
    override val actionsEndButtonGroupStyle: ButtonGroupStyle,
    override val suggestionsChipGroupStyle: ChipGroupStyle,
) : AiAnswerStyle {
    class Builder(receiver: Any?) : AiAnswerStyleBuilder {
        private var colorsBuilder: AiAnswerColorsBuilder = DefaultAiAnswerColors.Builder()
        private var dimensionsBuilder: AiAnswerDimensionsBuilder = DefaultAiAnswerDimensions.Builder()
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var contentStyle: StatefulValue<TextStyle>? = null
        private var loadingTextStyle: StatefulValue<TextStyle>? = null
        private var noteStyle: NoteStyle? = null
        private var loadingSpinnerStyle: SpinnerStyle? = null
        private var actionsStartButtonGroupStyle: ButtonGroupStyle? = null
        private var actionsEndButtonGroupStyle: ButtonGroupStyle? = null
        private var suggestionsChipGroupStyle: ChipGroupStyle? = null

        @Composable
        override fun colors(builder: @Composable AiAnswerColorsBuilder.() -> Unit) = apply {
            colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable AiAnswerDimensionsBuilder.() -> Unit) = apply {
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

        override fun style(): AiAnswerStyle {
            return DefaultAiAnswerStyle(
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
private data class DefaultAiAnswerColors(
    override val background: StatefulValue<Brush>,
    override val title: StatefulValue<Brush>,
    override val content: StatefulValue<Brush>,
    override val loadingText: StatefulValue<Brush>,
) : AiAnswerColors {
    class Builder : AiAnswerColorsBuilder {
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

        override fun build(): AiAnswerColors {
            return DefaultAiAnswerColors(
                background = background ?: Color.Transparent.asStatefulBrush(),
                title = title ?: Color.Black.asStatefulBrush(),
                content = content ?: Color.Black.asStatefulBrush(),
                loadingText = loadingText ?: Color.Black.asStatefulBrush(),
            )
        }
    }
}

@Immutable
private data class DefaultAiAnswerDimensions(
    override val paddingStart: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val paddingTop: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,
    override val contentGap: StatefulValue<Dp>,
    override val actionsGap: StatefulValue<Dp>,
    override val suggestionsGap: StatefulValue<Dp>,
    override val loadingGap: StatefulValue<Dp>,
) : AiAnswerDimensions {
    class Builder : AiAnswerDimensionsBuilder {
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

        override fun build(): AiAnswerDimensions {
            return DefaultAiAnswerDimensions(
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
