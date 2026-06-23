package com.sdds.compose.uikit.ai.motion.aianswer

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.ai.AiAnswer
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [AiAnswerMotionStyle].
 */
val LocalAiAnswerMotionStyle = compositionLocalOf {
    AiAnswerMotionStyle.builder().style()
}

/**
 * Motion-стиль компонента [AiAnswer].
 */
@Stable
interface AiAnswerMotionStyle : MotionStyle {
    /**
     * Анимация фона.
     */
    val background: MotionProperty<Brush>

    /**
     * Анимация цвета title.
     */
    val titleColor: MotionProperty<Brush>

    /**
     * Анимация цвета основного контента.
     */
    val contentColor: MotionProperty<Brush>

    /**
     * Анимация цвета loading-текста.
     */
    val loadingTextColor: MotionProperty<Brush>

    /**
     * Анимация стиля title.
     */
    val titleStyle: MotionProperty<TextStyle>

    /**
     * Анимация стиля основного контента.
     */
    val contentStyle: MotionProperty<TextStyle>

    /**
     * Анимация стиля loading-текста.
     */
    val loadingTextStyle: MotionProperty<TextStyle>

    /**
     * Анимация отступа слева.
     */
    val paddingStart: MotionProperty<Dp>

    /**
     * Анимация отступа справа.
     */
    val paddingEnd: MotionProperty<Dp>

    /**
     * Анимация отступа сверху.
     */
    val paddingTop: MotionProperty<Dp>

    /**
     * Анимация отступа снизу.
     */
    val paddingBottom: MotionProperty<Dp>

    /**
     * Анимация отступа между title и content.
     */
    val contentGap: MotionProperty<Dp>

    /**
     * Анимация отступа между content и actions.
     */
    val actionsGap: MotionProperty<Dp>

    /**
     * Анимация отступа между actions и suggestions.
     */
    val suggestionsGap: MotionProperty<Dp>

    /**
     * Анимация отступа между spinner и loading-текстом.
     */
    val loadingGap: MotionProperty<Dp>

    companion object {
        /**
         * Возвращает builder для [AiAnswerMotionStyle].
         */
        fun builder(): AiAnswerMotionStyleBuilder = DefaultAiAnswerMotionStyle.Builder()
    }
}

/**
 * Builder [AiAnswerMotionStyle].
 */
interface AiAnswerMotionStyleBuilder : MotionStyleBuilder<AiAnswerMotionStyle> {
    /**
     * Устанавливает анимацию фона.
     */
    fun background(background: MotionProperty<Brush>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию цвета title.
     */
    fun titleColor(titleColor: MotionProperty<Brush>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию цвета основного контента.
     */
    fun contentColor(contentColor: MotionProperty<Brush>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию цвета loading-текста.
     */
    fun loadingTextColor(loadingTextColor: MotionProperty<Brush>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию стиля title.
     */
    fun titleStyle(titleStyle: MotionProperty<TextStyle>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию стиля основного контента.
     */
    fun contentStyle(contentStyle: MotionProperty<TextStyle>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию стиля loading-текста.
     */
    fun loadingTextStyle(loadingTextStyle: MotionProperty<TextStyle>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию отступа слева.
     */
    fun paddingStart(paddingStart: MotionProperty<Dp>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию отступа справа.
     */
    fun paddingEnd(paddingEnd: MotionProperty<Dp>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию отступа сверху.
     */
    fun paddingTop(paddingTop: MotionProperty<Dp>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию отступа снизу.
     */
    fun paddingBottom(paddingBottom: MotionProperty<Dp>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию отступа между title и content.
     */
    fun contentGap(contentGap: MotionProperty<Dp>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию отступа между content и actions.
     */
    fun actionsGap(actionsGap: MotionProperty<Dp>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию отступа между actions и suggestions.
     */
    fun suggestionsGap(suggestionsGap: MotionProperty<Dp>): AiAnswerMotionStyleBuilder

    /**
     * Устанавливает анимацию отступа между spinner и loading-текстом.
     */
    fun loadingGap(loadingGap: MotionProperty<Dp>): AiAnswerMotionStyleBuilder
}

@Immutable
private data class DefaultAiAnswerMotionStyle(
    override val background: MotionProperty<Brush>,
    override val titleColor: MotionProperty<Brush>,
    override val contentColor: MotionProperty<Brush>,
    override val loadingTextColor: MotionProperty<Brush>,
    override val titleStyle: MotionProperty<TextStyle>,
    override val contentStyle: MotionProperty<TextStyle>,
    override val loadingTextStyle: MotionProperty<TextStyle>,
    override val paddingStart: MotionProperty<Dp>,
    override val paddingEnd: MotionProperty<Dp>,
    override val paddingTop: MotionProperty<Dp>,
    override val paddingBottom: MotionProperty<Dp>,
    override val contentGap: MotionProperty<Dp>,
    override val actionsGap: MotionProperty<Dp>,
    override val suggestionsGap: MotionProperty<Dp>,
    override val loadingGap: MotionProperty<Dp>,
) : AiAnswerMotionStyle {
    class Builder : AiAnswerMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null
        private var titleColor: MotionProperty<Brush>? = null
        private var contentColor: MotionProperty<Brush>? = null
        private var loadingTextColor: MotionProperty<Brush>? = null
        private var titleStyle: MotionProperty<TextStyle>? = null
        private var contentStyle: MotionProperty<TextStyle>? = null
        private var loadingTextStyle: MotionProperty<TextStyle>? = null
        private var paddingStart: MotionProperty<Dp>? = null
        private var paddingEnd: MotionProperty<Dp>? = null
        private var paddingTop: MotionProperty<Dp>? = null
        private var paddingBottom: MotionProperty<Dp>? = null
        private var contentGap: MotionProperty<Dp>? = null
        private var actionsGap: MotionProperty<Dp>? = null
        private var suggestionsGap: MotionProperty<Dp>? = null
        private var loadingGap: MotionProperty<Dp>? = null

        override fun background(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun titleColor(titleColor: MotionProperty<Brush>) = apply {
            this.titleColor = titleColor
        }

        override fun contentColor(contentColor: MotionProperty<Brush>) = apply {
            this.contentColor = contentColor
        }

        override fun loadingTextColor(loadingTextColor: MotionProperty<Brush>) = apply {
            this.loadingTextColor = loadingTextColor
        }

        override fun titleStyle(titleStyle: MotionProperty<TextStyle>) = apply {
            this.titleStyle = titleStyle
        }

        override fun contentStyle(contentStyle: MotionProperty<TextStyle>) = apply {
            this.contentStyle = contentStyle
        }

        override fun loadingTextStyle(loadingTextStyle: MotionProperty<TextStyle>) = apply {
            this.loadingTextStyle = loadingTextStyle
        }

        override fun paddingStart(paddingStart: MotionProperty<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: MotionProperty<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: MotionProperty<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: MotionProperty<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun contentGap(contentGap: MotionProperty<Dp>) = apply {
            this.contentGap = contentGap
        }

        override fun actionsGap(actionsGap: MotionProperty<Dp>) = apply {
            this.actionsGap = actionsGap
        }

        override fun suggestionsGap(suggestionsGap: MotionProperty<Dp>) = apply {
            this.suggestionsGap = suggestionsGap
        }

        override fun loadingGap(loadingGap: MotionProperty<Dp>) = apply {
            this.loadingGap = loadingGap
        }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): AiAnswerMotionStyle {
            return DefaultAiAnswerMotionStyle(
                background = background ?: noMotion(),
                titleColor = titleColor ?: noMotion(),
                contentColor = contentColor ?: noMotion(),
                loadingTextColor = loadingTextColor ?: noMotion(),
                titleStyle = titleStyle ?: noMotion(),
                contentStyle = contentStyle ?: noMotion(),
                loadingTextStyle = loadingTextStyle ?: noMotion(),
                paddingStart = paddingStart ?: noMotion(),
                paddingEnd = paddingEnd ?: noMotion(),
                paddingTop = paddingTop ?: noMotion(),
                paddingBottom = paddingBottom ?: noMotion(),
                contentGap = contentGap ?: noMotion(),
                actionsGap = actionsGap ?: noMotion(),
                suggestionsGap = suggestionsGap ?: noMotion(),
                loadingGap = loadingGap ?: noMotion(),
            )
        }
    }
}
