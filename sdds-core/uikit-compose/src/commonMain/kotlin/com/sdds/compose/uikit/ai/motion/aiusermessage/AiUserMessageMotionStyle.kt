package com.sdds.compose.uikit.ai.motion.aiusermessage

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.ai.AiUserMessage
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [AiUserMessageMotionStyle].
 */
val LocalAiUserMessageMotionStyle = compositionLocalOf {
    AiUserMessageMotionStyle.builder().style()
}

/**
 * Motion-стиль компонента [AiUserMessage].
 */
@Stable
interface AiUserMessageMotionStyle : MotionStyle {
    /**
     * Анимация фона контейнера с uploading файлами.
     */
    val uploadingBackground: MotionProperty<Brush>

    /**
     * Анимация фона контейнера с редактируемым текстовым полем.
     */
    val messageBackground: MotionProperty<Brush>

    /**
     * Анимация цвета редактируемого текста.
     */
    val textColor: MotionProperty<Brush>

    /**
     * Анимация стиля редактируемого текста.
     */
    val textStyle: MotionProperty<TextStyle>

    companion object {
        /**
         * Возвращает builder для [AiUserMessageMotionStyle].
         */
        fun builder(): AiUserMessageMotionStyleBuilder = DefaultAiUserMessageMotionStyle.Builder()
    }
}

/**
 * Builder [AiUserMessageMotionStyle].
 */
interface AiUserMessageMotionStyleBuilder : MotionStyleBuilder<AiUserMessageMotionStyle> {

    /**
     * Устанавливает анимацию фона контейнера с uploading файлами.
     */
    fun uploadingBackground(background: MotionProperty<Brush>): AiUserMessageMotionStyleBuilder

    /**
     * Устанавливает анимацию фона контейнера с редактируемым текстовым полем.
     */
    fun messageBackground(background: MotionProperty<Brush>): AiUserMessageMotionStyleBuilder

    /**
     * Устанавливает анимацию цвета редактируемого текста.
     */
    fun textColor(textColor: MotionProperty<Brush>): AiUserMessageMotionStyleBuilder

    /**
     * Устанавливает анимацию стиля редактируемого текста.
     */
    fun textStyle(textStyle: MotionProperty<TextStyle>): AiUserMessageMotionStyleBuilder
}

@Immutable
private data class DefaultAiUserMessageMotionStyle(
    override val uploadingBackground: MotionProperty<Brush>,
    override val messageBackground: MotionProperty<Brush>,
    override val textColor: MotionProperty<Brush>,
    override val textStyle: MotionProperty<TextStyle>,
) : AiUserMessageMotionStyle {
    class Builder : AiUserMessageMotionStyleBuilder {
        private var uploadingBackground: MotionProperty<Brush>? = null
        private var messageBackground: MotionProperty<Brush>? = null
        private var textColor: MotionProperty<Brush>? = null
        private var textStyle: MotionProperty<TextStyle>? = null

        override fun messageBackground(background: MotionProperty<Brush>) = apply {
            this.messageBackground = background
        }

        override fun textColor(textColor: MotionProperty<Brush>) = apply {
            this.textColor = textColor
        }

        override fun uploadingBackground(background: MotionProperty<Brush>) = apply {
            this.uploadingBackground = background
        }

        override fun textStyle(textStyle: MotionProperty<TextStyle>) = apply {
            this.textStyle = textStyle
        }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): AiUserMessageMotionStyle {
            return DefaultAiUserMessageMotionStyle(
                uploadingBackground = uploadingBackground ?: noMotion(),
                messageBackground = messageBackground ?: noMotion(),
                textColor = textColor ?: noMotion(),
                textStyle = textStyle ?: noMotion(),
            )
        }
    }
}
