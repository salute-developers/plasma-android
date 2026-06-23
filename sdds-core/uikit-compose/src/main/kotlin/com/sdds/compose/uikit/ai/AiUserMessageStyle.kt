package com.sdds.compose.uikit.ai

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.ImageStyle
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal, предоставляющий текущий [AiUserMessageStyle].
 */
val LocalAiUserMessageStyle = compositionLocalOf(structuralEqualityPolicy()) {
    AiUserMessageStyle.builder().style()
}

/**
 * Стиль компонента [AiUserMessage].
 */
@Stable
interface AiUserMessageStyle : Style {

    /**
     * Цвета компонента.
     */
    val colors: AiUserMessageColors

    /**
     * Размеры и отступы компонента.
     */
    val dimensions: AiUserMessageDimensions

    /**
     * Стиль текста в редактируемом текстовом поле.
     */
    val textStyle: StatefulValue<TextStyle>

    /**
     * Формы контейнера с uploading файлами.
     */
    val uploadingShape: StatefulValue<Shape>

    /**
     * Формы контейнера с текстовым полем.
     */
    val messageShape: StatefulValue<Shape>

    /**
     * Стиль редактируемого поля.
     */
    val editableStyle: EditableStyle

    /**
     * Стиль группы действий, расположенной внизу компонента.
     */
    val actionsButtonGroupStyle: ButtonGroupStyle

    /**
     * Стиль группы действий, расположенной под редактируемым текстовым полем,
     * отображающейся в момент радктирования сообщения.
     */
    val editableActionsButtonGroupStyle: ButtonGroupStyle

    /**
     * Стиль загружаемых файлов.
     */
    val uploadingFileStyle: FileStyle

    /**
     * Стиль загружаемых файлов в виде изображения.
     */
    val uploadingImageStyle: ImageStyle

    companion object {
        /**
         * Возвращает builder для [AiUserMessageStyle].
         */
        fun builder(receiver: Any? = null): AiUserMessageStyleBuilder = DefaultAiUserMessageStyle.Builder(receiver)
    }
}

/**
 * Цвета компонента [AiUserMessage].
 */
@Stable
interface AiUserMessageColors {
    /**
     * Фон контейнера с текстовым полем.
     */
    val messageBackground: StatefulValue<Brush>

    /**
     * Фон контейнера с uploading файлами.
     */
    val uploadingBackground: StatefulValue<Brush>

    /**
     * Цвет текста в редактируемом текстовом поле.
     */
    val text: StatefulValue<Brush>
}

/**
 * Размеры компонента [AiUserMessage].
 */
@Stable
interface AiUserMessageDimensions {
    /**
     * Отступ в начале внутри контейнера с uploading файлами.
     */
    val uploadingPaddingStart: StatefulValue<Dp>

    /**
     * Отступ в конце внутри контейнера с uploading файлами.
     */
    val uploadingPaddingEnd: StatefulValue<Dp>

    /**
     * Отступ сверху внутри контейнера с uploading файлами.
     */
    val uploadingPaddingTop: StatefulValue<Dp>

    /**
     * Отступ снизу внутри контейнера с uploading файлами.
     */
    val uploadingPaddingBottom: StatefulValue<Dp>

    /**
     * Отступ в начале внутри контейнера с текстовым полем.
     */
    val messagePaddingStart: StatefulValue<Dp>

    /**
     * Отступ в конце внутри контейнера с текстовым полем.
     */
    val messagePaddingEnd: StatefulValue<Dp>

    /**
     * Отступ сверху внутри контейнера с текстовым полем.
     */
    val messagePaddingTop: StatefulValue<Dp>

    /**
     * Отступ снизу внутри контейнера с текстовым полем.
     */
    val messagePaddingBottom: StatefulValue<Dp>

    /**
     * Отступ между контейнером с uploading файлами и контейнером с текстовым полем.
     */
    val uploadingGroupGap: StatefulValue<Dp>

    /**
     * Отступ между контентом внутри контейнера с uploading файлами.
     */
    val uploadingFilesGap: StatefulValue<Dp>

    /**
     * Отступ между редактируемым текстовым полем и группой действий, расположенной под
     * редактируемым текстовым полем, отображающейся в момент радктирования сообщения.
     */
    val editableActionsGap: StatefulValue<Dp>

    /**
     * Отступ между контейнером с текстовым полем и группой действий внизу.
     */
    val actionsGap: StatefulValue<Dp>
}

/**
 * Builder [AiUserMessageStyle].
 */
@ApiInfo
interface AiUserMessageStyleBuilder : StyleBuilder<AiUserMessageStyle> {
    /**
     * Устанавливает цвета компонента.
     */
    @Composable
    fun colors(builder: @Composable AiUserMessageColorsBuilder.() -> Unit): AiUserMessageStyleBuilder

    /**
     * Устанавливает размеры компонента.
     */
    @Composable
    fun dimensions(builder: @Composable AiUserMessageDimensionsBuilder.() -> Unit): AiUserMessageStyleBuilder

    /**
     * Устанавливает стиль [textStyle] текста в редактируемом текстовом поле.
     */
    fun textStyle(textStyle: TextStyle): AiUserMessageStyleBuilder =
        textStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает stateful стиль [textStyle] текста в редактируемом текстовом поле.
     */
    fun textStyle(textStyle: StatefulValue<TextStyle>): AiUserMessageStyleBuilder

    /**
     * Устанавливает stateful форму контейнера с uploading файлами.
     */
    fun uploadingShape(uploadingShape: StatefulValue<Shape>): AiUserMessageStyleBuilder

    /**
     * Устанавливает форму контейнера с uploading файлами.
     */
    fun uploadingShape(uploadingShape: Shape): AiUserMessageStyleBuilder =
        uploadingShape(uploadingShape.asStatefulValue())

    /**
     * Устанавливает stateful форму контейнера с текстовым полем.
     */
    fun messageShape(messageShape: StatefulValue<Shape>): AiUserMessageStyleBuilder

    /**
     * Устанавливает форму контейнера с текстовым полем.
     */
    fun messageShape(messageShape: Shape): AiUserMessageStyleBuilder =
        messageShape(messageShape.asStatefulValue())

    /**
     * Устанавливает стиль [com.sdds.compose.uikit.Editable].
     */
    fun editableStyle(editableStyle: EditableStyle): AiUserMessageStyleBuilder

    /**
     * Устанавливает стиль [com.sdds.compose.uikit.ButtonGroup] внизу компонента.
     */
    fun actionsButtonGroupStyle(actionsButtonGroupStyle: ButtonGroupStyle): AiUserMessageStyleBuilder

    /**
     * Устанавливает стиль [com.sdds.compose.uikit.ButtonGroup] расположенной под редактируемым текстовым полем,
     * отображающейся в момент радктирования сообщения.
     */
    fun editableActionsButtonGroupStyle(editableActionsButtonGroupStyle: ButtonGroupStyle): AiUserMessageStyleBuilder

    /**
     * Устанавливает стиль загружаемых [com.sdds.compose.uikit.File] в контейнере с uploading файлами.
     */
    fun uploadingFileStyle(uploadingFileStyle: FileStyle): AiUserMessageStyleBuilder

    /**
     * Устанавливает стиль загружаемых [com.sdds.compose.uikit.Image] в контейнере с uploading файлами.
     */
    fun uploadingImageStyle(uploadingImageStyle: ImageStyle): AiUserMessageStyleBuilder
}

/**
 * Builder цветов [AiUserMessage].
 */
interface AiUserMessageColorsBuilder {
    /**
     * Устанавливает stateful кисть фона [background] контейнера с текстовым полем.
     */
    fun messageBackground(background: StatefulValue<Brush>): AiUserMessageColorsBuilder

    /**
     * Устанавливает кисть фона [background] контейнера с текстовым полем.
     */
    fun messageBackground(background: Brush): AiUserMessageColorsBuilder =
        messageBackground(background.asStatefulValue())

    /**
     * Устанавливает цвет фона [background] контейнера с текстовым полем.
     */
    fun messageBackground(background: Color): AiUserMessageColorsBuilder =
        messageBackground(background.asStatefulBrush())

    /**
     * Устанавливает интерактивный цвет фона [background] контейнера с текстовым полем.
     * @see InteractiveColor
     */
    fun messageBackground(background: InteractiveColor): AiUserMessageColorsBuilder =
        messageBackground(background.asStatefulBrush())

    /**
     * Устанавливает stateful кисть фона [background] контейнера с uploading файлами.
     */
    fun uploadingBackground(background: StatefulValue<Brush>): AiUserMessageColorsBuilder

    /**
     * Устанавливает кисть фона [background] контейнера с uploading файлами.
     */
    fun uploadingBackground(background: Brush): AiUserMessageColorsBuilder =
        uploadingBackground(background.asStatefulValue())

    /**
     * Устанавливает цвет фона [background] контейнера с uploading файлами.
     */
    fun uploadingBackground(background: Color): AiUserMessageColorsBuilder =
        uploadingBackground(background.asStatefulBrush())

    /**
     * Устанавливает интерактивный цвет фона [background] контейнера с uploading файлами.
     * @see InteractiveColor
     */
    fun uploadingBackground(background: InteractiveColor): AiUserMessageColorsBuilder =
        uploadingBackground(background.asStatefulBrush())

    /**
     * Устанавливает stateful цвет [textColor] кисти текста в редактируемом текстовом поле.
     */
    fun textColor(textColor: StatefulValue<Brush>): AiUserMessageColorsBuilder

    /**
     * Устанавливает цвет [textColor] кисти текста в редактируемом текстовом поле.
     */
    fun textColor(textColor: Brush): AiUserMessageColorsBuilder =
        textColor(textColor.asStatefulValue())

    /**
     * Устанавливает цвет [textColor] текста в редактируемом текстовом поле.
     */
    fun textColor(textColor: Color): AiUserMessageColorsBuilder =
        textColor(textColor.asInteractive())

    /**
     * Устанавливает интерактивный цвет [textColor] текста в редактируемом текстовом поле.
     * @see InteractiveColor
     */
    fun textColor(textColor: InteractiveColor): AiUserMessageColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Возвращает готовые цвета.
     */
    fun build(): AiUserMessageColors
}

/**
 * Builder размеров [AiUserMessage].
 */
interface AiUserMessageDimensionsBuilder {
    /**
     * Устанавливает stateful отступ в начале [paddingStart] внутри контейнера с uploading файлами.
     */
    fun uploadingPaddingStart(paddingStart: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart] внутри контейнера с uploading файлами.
     */
    fun uploadingPaddingStart(paddingStart: Dp): AiUserMessageDimensionsBuilder =
        uploadingPaddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает stateful отступ в конце [paddingEnd] внутри контейнера с uploading файлами.
     */
    fun uploadingPaddingEnd(paddingEnd: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd] внутри контейнера с uploading файлами.
     */
    fun uploadingPaddingEnd(paddingEnd: Dp): AiUserMessageDimensionsBuilder =
        uploadingPaddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает stateful отступ сверху [paddingTop] внутри контейнера с uploading файлами.
     */
    fun uploadingPaddingTop(paddingTop: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop] внутри контейнера с uploading файлами.
     */
    fun uploadingPaddingTop(paddingTop: Dp): AiUserMessageDimensionsBuilder =
        uploadingPaddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает stateful отступ снизу [paddingBottom] внутри контейнера с uploading файлами.
     */
    fun uploadingPaddingBottom(paddingBottom: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom] внутри контейнера с uploading файлами.
     */
    fun uploadingPaddingBottom(paddingBottom: Dp): AiUserMessageDimensionsBuilder =
        uploadingPaddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает stateful отступ в начале [paddingStart] внутри контейнера с текстовым полем.
     */
    fun messagePaddingStart(paddingStart: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart] внутри контейнера с текстовым полем.
     */
    fun messagePaddingStart(paddingStart: Dp): AiUserMessageDimensionsBuilder =
        messagePaddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает stateful отступ в конце [paddingEnd] внутри контейнера с текстовым полем.
     */
    fun messagePaddingEnd(paddingEnd: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd] внутри контейнера с текстовым полем.
     */
    fun messagePaddingEnd(paddingEnd: Dp): AiUserMessageDimensionsBuilder =
        messagePaddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает stateful отступ сверху [paddingTop] внутри контейнера с текстовым полем.
     */
    fun messagePaddingTop(paddingTop: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop] внутри контейнера с текстовым полем.
     */
    fun messagePaddingTop(paddingTop: Dp): AiUserMessageDimensionsBuilder =
        messagePaddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает stateful отступ снизу [paddingBottom] внутри контейнера с текстовым полем.
     */
    fun messagePaddingBottom(paddingBottom: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom] внутри контейнера с текстовым полем.
     */
    fun messagePaddingBottom(paddingBottom: Dp): AiUserMessageDimensionsBuilder =
        messagePaddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает stateful отступ [gap] между контейнером с uploading файлами
     * и контейнером с текстовым полем.
     */
    fun uploadingGroupGap(gap: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ [gap] между контейнером с uploading файлами
     * и контейнером с текстовым полем.
     */
    fun uploadingGroupGap(gap: Dp): AiUserMessageDimensionsBuilder =
        uploadingGroupGap(gap.asStatefulValue())

    /**
     * Устанавливает stateful отступ [gap] между контентом внутри контейнера с uploading файлами..
     */
    fun uploadingFilesGap(gap: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ [gap] между между контентом внутри контейнера с uploading файлами.
     */
    fun uploadingFilesGap(gap: Dp): AiUserMessageDimensionsBuilder =
        uploadingFilesGap(gap.asStatefulValue())

    /**
     * Устанавливает stateful отступ [gap] между контейнером с текстовым полем
     * и группой действий внизу.
     */
    fun actionsGap(gap: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ [gap] между контейнером с текстовым полем
     * и группой действий внизу.
     */
    fun actionsGap(gap: Dp): AiUserMessageDimensionsBuilder =
        actionsGap(gap.asStatefulValue())

    /**
     * Устанавливает stateful отступ [gap] между редактируемым текстовым полем и группой действий,
     * расположенной под редактируемым текстовым полем, отображающейся в момент радктирования сообщения.
     */
    fun editableActionsGap(gap: StatefulValue<Dp>): AiUserMessageDimensionsBuilder

    /**
     * Устанавливает отступ [gap] между редактируемым текстовым полем и группой действий,
     * расположенной под редактируемым текстовым полем, отображающейся в момент радктирования сообщения.
     */
    fun editableActionsGap(gap: Dp): AiUserMessageDimensionsBuilder =
        editableActionsGap(gap.asStatefulValue())

    /**
     * Возвращает готовые размеры.
     */
    fun build(): AiUserMessageDimensions
}

@Immutable
private data class DefaultAiUserMessageStyle(
    override val colors: AiUserMessageColors,
    override val dimensions: AiUserMessageDimensions,
    override val textStyle: StatefulValue<TextStyle>,
    override val actionsButtonGroupStyle: ButtonGroupStyle,
    override val editableActionsButtonGroupStyle: ButtonGroupStyle,
    override val uploadingFileStyle: FileStyle,
    override val uploadingShape: StatefulValue<Shape>,
    override val messageShape: StatefulValue<Shape>,
    override val editableStyle: EditableStyle,
    override val uploadingImageStyle: ImageStyle,
) : AiUserMessageStyle {
    class Builder(receiver: Any?) : AiUserMessageStyleBuilder {
        private var colorsBuilder: AiUserMessageColorsBuilder = DefaultAiUserMessageColors.Builder()
        private var dimensionsBuilder: AiUserMessageDimensionsBuilder = DefaultAiUserMessageDimensions.Builder()
        private var textStyle: StatefulValue<TextStyle>? = null
        private var editableStyle: EditableStyle? = null
        private var actionsButtonGroupStyle: ButtonGroupStyle? = null
        private var editableActionsButtonGroupStyle: ButtonGroupStyle? = null
        private var uploadingFileStyle: FileStyle? = null
        private var uploadingImageStyle: ImageStyle? = null
        private var uploadingShape: StatefulValue<Shape>? = null
        private var messageShape: StatefulValue<Shape>? = null

        @Composable
        override fun colors(builder: @Composable AiUserMessageColorsBuilder.() -> Unit) = apply {
            colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable AiUserMessageDimensionsBuilder.() -> Unit) = apply {
            dimensionsBuilder.builder()
        }

        override fun textStyle(textStyle: StatefulValue<TextStyle>) = apply {
            this.textStyle = textStyle
        }

        override fun uploadingShape(uploadingShape: StatefulValue<Shape>) = apply {
            this.uploadingShape = uploadingShape
        }

        override fun messageShape(messageShape: StatefulValue<Shape>) = apply {
            this.messageShape = messageShape
        }

        override fun editableStyle(editableStyle: EditableStyle) = apply {
            this.editableStyle = editableStyle
        }

        override fun actionsButtonGroupStyle(actionsButtonGroupStyle: ButtonGroupStyle) = apply {
            this.actionsButtonGroupStyle = actionsButtonGroupStyle
        }

        override fun editableActionsButtonGroupStyle(editableActionsButtonGroupStyle: ButtonGroupStyle) = apply {
            this.editableActionsButtonGroupStyle = editableActionsButtonGroupStyle
        }

        override fun uploadingFileStyle(uploadingFileStyle: FileStyle) = apply {
            this.uploadingFileStyle = uploadingFileStyle
        }

        override fun uploadingImageStyle(uploadingImageStyle: ImageStyle) = apply {
            this.uploadingImageStyle = uploadingImageStyle
        }

        override fun style(): AiUserMessageStyle {
            return DefaultAiUserMessageStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                textStyle = textStyle ?: TextStyle.Default.asStatefulValue(),
                editableStyle = editableStyle ?: EditableStyle.builder().style(),
                actionsButtonGroupStyle = actionsButtonGroupStyle ?: ButtonGroupStyle.builder().style(),
                editableActionsButtonGroupStyle = editableActionsButtonGroupStyle ?: ButtonGroupStyle.builder().style(),
                uploadingFileStyle = uploadingFileStyle ?: FileStyle.builder().style(),
                uploadingShape = uploadingShape ?: RoundedCornerShape(15).asStatefulValue(),
                messageShape = messageShape ?: RoundedCornerShape(15).asStatefulValue(),
                uploadingImageStyle = uploadingImageStyle ?: ImageStyle.builder().style(),
            )
        }
    }
}

@Immutable
private data class DefaultAiUserMessageColors(
    override val messageBackground: StatefulValue<Brush>,
    override val text: StatefulValue<Brush>,
    override val uploadingBackground: StatefulValue<Brush>,
) : AiUserMessageColors {
    class Builder : AiUserMessageColorsBuilder {
        private var messageBackground: StatefulValue<Brush>? = null
        private var textColor: StatefulValue<Brush>? = null
        private var uploadingBackground: StatefulValue<Brush>? = null

        override fun messageBackground(background: StatefulValue<Brush>) = apply {
            this.messageBackground = background
        }

        override fun uploadingBackground(background: StatefulValue<Brush>) = apply {
            this.uploadingBackground = background
        }

        override fun textColor(textColor: StatefulValue<Brush>) = apply {
            this.textColor = textColor
        }

        override fun build(): AiUserMessageColors {
            return DefaultAiUserMessageColors(
                messageBackground = messageBackground ?: Color.Transparent.asStatefulBrush(
                    setOf(AiUserMessageState.InEdit) to Color.LightGray,
                ),
                text = textColor ?: Color.Black.asStatefulBrush(),
                uploadingBackground = uploadingBackground ?: Color.Transparent.asStatefulBrush(),
            )
        }
    }
}

@Immutable
private data class DefaultAiUserMessageDimensions(
    override val uploadingPaddingStart: StatefulValue<Dp>,
    override val uploadingPaddingEnd: StatefulValue<Dp>,
    override val uploadingPaddingTop: StatefulValue<Dp>,
    override val uploadingPaddingBottom: StatefulValue<Dp>,
    override val uploadingGroupGap: StatefulValue<Dp>,
    override val editableActionsGap: StatefulValue<Dp>,
    override val actionsGap: StatefulValue<Dp>,
    override val uploadingFilesGap: StatefulValue<Dp>,
    override val messagePaddingStart: StatefulValue<Dp>,
    override val messagePaddingEnd: StatefulValue<Dp>,
    override val messagePaddingTop: StatefulValue<Dp>,
    override val messagePaddingBottom: StatefulValue<Dp>,
) : AiUserMessageDimensions {
    class Builder : AiUserMessageDimensionsBuilder {
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var uploadingGroupGap: StatefulValue<Dp>? = null
        private var actionsGap: StatefulValue<Dp>? = null
        private var editableActionsGap: StatefulValue<Dp>? = null
        private var uploadingFilesGap: StatefulValue<Dp>? = null
        private var messagePaddingStart: StatefulValue<Dp>? = null
        private var messagePaddingEnd: StatefulValue<Dp>? = null
        private var messagePaddingTop: StatefulValue<Dp>? = null
        private var messagePaddingBottom: StatefulValue<Dp>? = null

        override fun uploadingPaddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun uploadingPaddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun uploadingPaddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun uploadingPaddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun messagePaddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.messagePaddingStart = paddingStart
        }

        override fun messagePaddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.messagePaddingEnd = paddingEnd
        }

        override fun messagePaddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.messagePaddingTop = paddingTop
        }

        override fun messagePaddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.messagePaddingBottom = paddingBottom
        }

        override fun uploadingGroupGap(gap: StatefulValue<Dp>) = apply {
            this.uploadingGroupGap = gap
        }

        override fun uploadingFilesGap(gap: StatefulValue<Dp>) = apply {
            this.uploadingFilesGap = gap
        }

        override fun actionsGap(gap: StatefulValue<Dp>) = apply {
            this.actionsGap = gap
        }

        override fun editableActionsGap(gap: StatefulValue<Dp>) = apply {
            this.editableActionsGap = gap
        }

        override fun build(): AiUserMessageDimensions {
            return DefaultAiUserMessageDimensions(
                uploadingPaddingStart = paddingStart ?: 2.dp.asStatefulValue(),
                uploadingPaddingEnd = paddingEnd ?: 2.dp.asStatefulValue(),
                uploadingPaddingTop = paddingTop ?: 2.dp.asStatefulValue(),
                uploadingPaddingBottom = paddingBottom ?: 2.dp.asStatefulValue(),
                uploadingGroupGap = uploadingGroupGap ?: 10.dp.asStatefulValue(),
                editableActionsGap = actionsGap ?: 10.dp.asStatefulValue(),
                actionsGap = actionsGap ?: 10.dp.asStatefulValue(),
                uploadingFilesGap = uploadingFilesGap ?: 4.dp.asStatefulValue(),
                messagePaddingStart = messagePaddingStart ?: 10.dp.asStatefulValue(),
                messagePaddingEnd = messagePaddingEnd ?: 10.dp.asStatefulValue(),
                messagePaddingTop = messagePaddingTop ?: 10.dp.asStatefulValue(),
                messagePaddingBottom = messagePaddingBottom ?: 10.dp.asStatefulValue(),
            )
        }
    }
}
