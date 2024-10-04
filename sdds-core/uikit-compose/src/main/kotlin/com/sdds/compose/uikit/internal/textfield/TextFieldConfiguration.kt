package com.sdds.compose.uikit.internal.textfield

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.Indicator
import com.sdds.compose.uikit.TextField.LabelPlacement

interface TextFieldStyles {

    @Composable
    fun fieldType(
        indicatorPlacement: Indicator.Placement,
        labelPlacement: LabelPlacement,
        optionalText: String?,
    ): TextField.FieldType

    @Composable
    fun fieldAppearance(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
    ): TextField.FieldAppearance

    @Composable
    fun hideInnerLabel(): Boolean

    // Размеры и отступы
    @Composable
    fun paddings(
        labelPlacement: LabelPlacement,
        helperTextPosition: TextField.HelperTextPosition,
    ): TextField.Paddings

    @Composable
    fun chipContainerShape(): CornerBasedShape

    @Composable
    fun chipHeight(): Dp

    @Composable
    fun boxMinHeight(): Dp

    @Composable
    fun alignmentLineHeight(): Dp

    @Composable
    fun iconSize(): Dp

    @Composable
    fun scrollBar(): ScrollBar

    // Стили
    @Composable
    fun labelStyle(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
        labelPlacement: LabelPlacement,
        hasValue: Boolean,
    ): TextStyle

    @Composable
    fun optionalStyle(
        isFocused: Boolean,
        isReadOnly: Boolean,
        labelPlacement: LabelPlacement,
        hasValue: Boolean,
    ): TextStyle

    @Composable
    fun valueStyle(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
    ): TextStyle

    @Composable
    fun captionStyle(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
    ): TextStyle

    @Composable
    fun counterStyle(): TextStyle

    @Composable
    fun placeholderStyle(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
    ): TextStyle

    // Цвета
    @Composable
    fun cursorColor(): State<Color>

    @Composable
    fun startContentColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean
    ): State<Color>

    @Composable
    fun endContentColor(): State<Color>

    @Composable
    fun labelColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
        labelPlacement: LabelPlacement,
    ): State<Color>

    @Composable
    fun valueColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
    ): State<Color>

    @Composable
    fun captionColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
    ): State<Color>

    @Composable
    fun optionalColor(): State<Color>

    @Composable
    fun placeholderColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
    ): State<Color>

    @Composable
    fun backgroundColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
    ): State<Color>

    @Composable
    fun dividerColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
    ): State<Color>
}

/**
 * Пример реализации [TextField].
 * Для text field clear, text area и text area clear удобнее сделать отдельные реализации стилей. нет?
 */
@Immutable
private data class DummyTextFieldStyles(
    val isRequired: Boolean = false,
    val requiredIndicator: Indicator = Indicator(),
    val indicatorPlacement: Indicator.Placement = Indicator.Placement.Start,
    val labelPlacement: LabelPlacement = LabelPlacement.Outer,
    val hideInnerLabel: Boolean = false,
    val dividerThickness: Dp = 1.dp,
    val shape: CornerBasedShape = RoundedCornerShape(8.dp),
) : TextFieldStyles {
    @Composable
    override fun fieldType(
        indicatorPlacement: Indicator.Placement,
        labelPlacement: LabelPlacement,
        optionalText: String?,
    ): TextField.FieldType {
        return if (isRequired) {
            TextField.FieldType.Required(
                indicator = requiredIndicator
            )
        } else {
            TextField.FieldType.Optional(optionalText.orEmpty())
        }
    }

    @Composable
    override fun fieldAppearance(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
    ): TextField.FieldAppearance {
        return TextField.FieldAppearance.Solid(
            backgroundColor = backgroundColor(
                isFocused,
                isPressed,
                isHovered,
                isDragged,
                isReadOnly
            ).value,
            shape = shape,
        )
    }

    @Composable
    override fun hideInnerLabel() = hideInnerLabel

    @Composable
    override fun paddings(
        labelPlacement: LabelPlacement,
        helperTextPosition: TextField.HelperTextPosition
    ): TextField.Paddings {
        TODO("Not yet implemented")
    }

    @Composable
    override fun chipHeight(): Dp {
        TODO("Not yet implemented")
    }

    @Composable
    override fun boxMinHeight(): Dp {
        TODO("Not yet implemented")
    }

    @Composable
    override fun alignmentLineHeight(): Dp {
        TODO("Not yet implemented")
    }

    @Composable
    override fun iconSize(): Dp {
        TODO("Not yet implemented")
    }

    @Composable
    override fun chipContainerShape(): CornerBasedShape {
        TODO("Not yet implemented")
    }

    @Composable
    override fun scrollBar(): ScrollBar {
        TODO("Not yet implemented")
    }

    @Composable
    override fun labelStyle(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
        labelPlacement: LabelPlacement,
        hasValue: Boolean
    ): TextStyle {
        TODO("Not yet implemented")
    }

    @Composable
    override fun optionalStyle(
        isFocused: Boolean,
        isReadOnly: Boolean,
        labelPlacement: LabelPlacement,
        hasValue: Boolean
    ): TextStyle {
        TODO("Not yet implemented")
    }

    @Composable
    override fun valueStyle(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean
    ): TextStyle {
        TODO("Not yet implemented")
    }

    @Composable
    override fun captionStyle(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean
    ): TextStyle {
        TODO("Not yet implemented")
    }

    @Composable
    override fun counterStyle(): TextStyle {
        TODO("Not yet implemented")
    }

    @Composable
    override fun placeholderStyle(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean
    ): TextStyle {
        TODO("Not yet implemented")
    }

    @Composable
    override fun cursorColor(): State<Color> {
        TODO("Not yet implemented")
    }

    @Composable
    override fun startContentColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean
    ): State<Color> {
        TODO("Not yet implemented")
    }

    @Composable
    override fun endContentColor(): State<Color> {
        TODO("Not yet implemented")
    }

    @Composable
    override fun labelColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean,
        labelPlacement: LabelPlacement
    ): State<Color> {
        TODO("Not yet implemented")
    }

    @Composable
    override fun valueColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean
    ): State<Color> {
        TODO("Not yet implemented")
    }

    @Composable
    override fun captionColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean
    ): State<Color> {
        TODO("Not yet implemented")
    }

    @Composable
    override fun optionalColor(): State<Color> {
        TODO("Not yet implemented")
    }

    @Composable
    override fun placeholderColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean
    ): State<Color> {
        TODO("Not yet implemented")
    }

    @Composable
    override fun backgroundColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean
    ): State<Color> {
        TODO("Not yet implemented")
    }

    @Composable
    override fun dividerColor(
        isFocused: Boolean,
        isPressed: Boolean,
        isHovered: Boolean,
        isDragged: Boolean,
        isReadOnly: Boolean
    ): State<Color> {
        TODO("Not yet implemented")
    }
}

/**
 * Пример реализации вариаций
 */
object TextFieldStyle {
    object XS {
        object Default {

            object InnerLabel {
                val RequiredStart: TextFieldStyles
                    get() = DummyTextFieldStyles(
                        isRequired = true,
                        requiredIndicator = Indicator(),
                        indicatorPlacement = Indicator.Placement.Start,
                        labelPlacement = LabelPlacement.Inner,
                        hideInnerLabel = true // прячем inner label в размере xs
                    )

                val RequiredEnd: TextFieldStyles
                    get() = DummyTextFieldStyles(
                        isRequired = true,
                        requiredIndicator = Indicator(),
                        indicatorPlacement = Indicator.Placement.End,
                        labelPlacement = LabelPlacement.Inner,
                        hideInnerLabel = true // прячем inner label в размере xs
                    )

                val Optional: TextFieldStyles
                    get() = DummyTextFieldStyles(
                        isRequired = false,
                        labelPlacement = LabelPlacement.Inner,
                        hideInnerLabel = true // прячем inner label в размере xs
                    )
            }

            object OuterLabel {
                val RequiredStart: TextFieldStyles
                    get() = DummyTextFieldStyles(
                        isRequired = true,
                        requiredIndicator = Indicator(),
                        indicatorPlacement = Indicator.Placement.Start,
                        labelPlacement = LabelPlacement.Outer,
                    )

                val RequiredEnd: TextFieldStyles
                    get() = DummyTextFieldStyles(
                        isRequired = true,
                        requiredIndicator = Indicator(),
                        indicatorPlacement = Indicator.Placement.End,
                        labelPlacement = LabelPlacement.Outer,
                    )

                val Optional: TextFieldStyles
                    get() = DummyTextFieldStyles(
                        isRequired = false,
                        labelPlacement = LabelPlacement.Outer,
                    )
            }
        }
    }
}

fun test() {
    val style = TextFieldStyle.XS.Default.InnerLabel.RequiredStart
}
