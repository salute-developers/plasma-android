package com.sdds.playground.sandbox.textfield

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.DotBadge
import com.sdds.compose.uikit.TextField.LabelType
import com.sdds.compose.uikit.adjustBy
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChip
import com.sdds.playground.sandbox.textfield.SandboxTextField.InputState
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

/**
 * Цвета текстового поля
 */
@Stable
internal interface SandboxTextFieldColors {

    /**
     * Цвет значения текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun valueColor(state: InputState): State<Color>

    /**
     * Цвет фона текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun backgroundColor(state: InputState): State<Color>

    /**
     * Цвет заглушки текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun placeholderColor(state: InputState): State<Color>

    /**
     * Цвет лейбла текстового поля
     *
     * @param state состояние текстового поля
     * @param type тип лейбла
     */
    @Composable
    fun labelColor(state: InputState, type: LabelType): State<Color>

    /**
     * Цвет иконки в начале текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun leadingIconColor(state: InputState): State<Color>

    /**
     * Цвет иконки в конце текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun trailingIconColor(state: InputState, disabledAlpha: Float): State<Color>

    /**
     * Цвет подписи текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun captionColor(state: InputState): State<Color>

    /**
     * Цвет курсора текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun cursorColor(state: InputState): State<Color>
}

/**
 * Текстовые стили поля
 */
@Stable
internal interface SandboxTextFieldStyles {

    /**
     * Текстовый стиль внешнего лейбла
     * @param size размер текстового поля
     * @param colors цвета текстового поля
     * @param inputState состояние текстового поля
     */
    @Composable
    fun outerLabelStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
    ): State<TextStyle>

    /**
     * Текстовый стиль внутреннего лейбла
     * @param size размер текстового поля
     * @param inputState cостояние текстового поля
     * @param isEmpty true, если поле пустое
     * @param colors цвета текстового поля
     */
    @Composable
    fun innerLabelStyle(
        size: SandboxTextField.Size,
        inputState: InputState,
        isEmpty: Boolean,
        colors: SandboxTextFieldColors,
    ): State<TextStyle>

    /**
     * Текстовый стиль значения поля
     * @param size размер текстового поля
     * @param colors цвета текстового поля
     * @param inputState состояние текстового поля
     */
    @Composable
    fun valueStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
    ): State<TextStyle>

    /**
     * Текстовый стиль подписи поля
     * @param size размер текстового поля
     * @param colors цвета текстового поля
     * @param inputState состояние текстового поля
     */
    @Composable
    fun captionStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
    ): State<TextStyle>

    /**
     * Текстовый стиль заглушки поля
     * @param size размер текстового поля
     * @param colors цвета текстового поля
     * @param inputState состояние текстового поля
     */
    @Composable
    fun placeholderStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
    ): State<TextStyle>
}

/**
 * Значения по-умолчанию текстового поля
 */
@Immutable
internal object TextFieldDefaults {

    @Composable
    fun SandboxTextField.FieldType.toFieldType(
        labelType: LabelType,
        position: DotBadge.Position,
        hasLabel: Boolean,
        optionalText: String,
    ): TextField.FieldType {
        return when (this) {
            SandboxTextField.FieldType.Optional -> TextField.FieldType.Optional(
                optionalText = optionalText,
            )
            SandboxTextField.FieldType.Required -> TextField.FieldType.Required(
                dotBadge = dotBadge(labelType, position, hasLabel),
            )
        }
    }

    private fun dotBadge(labelType: LabelType, position: DotBadge.Position, hasLabel: Boolean): DotBadge {
        return when {
            labelType == LabelType.Outer && hasLabel -> {
                val paddings = if (position == DotBadge.Position.Start) {
                    PaddingValues(end = 6.dp)
                } else {
                    PaddingValues(start = 4.dp, top = 4.dp)
                }
                DotBadge(
                    size = 6.dp,
                    paddingValues = paddings,
                    color = Color.Red,
                    position = position,
                )
            }

            else -> DotBadge(
                size = 8.dp,
                paddingValues = PaddingValues(),
                color = Color.Red,
                position = position,
            )
        }
    }

    fun chipGroupSize(size: SandboxTextField.Size): SandboxEmbeddedChip.Size {
        return when (size) {
            SandboxTextField.Size.L -> SandboxEmbeddedChip.Size.L
            SandboxTextField.Size.M -> SandboxEmbeddedChip.Size.M
            SandboxTextField.Size.S -> SandboxEmbeddedChip.Size.S
            SandboxTextField.Size.XS -> SandboxEmbeddedChip.Size.XS
        }
    }

    @Composable
    fun chipContainerShape(size: SandboxTextField.Size): CornerBasedShape {
        return when (size) {
            SandboxTextField.Size.L -> StylesSaluteTheme.shapes.roundS
            SandboxTextField.Size.M -> StylesSaluteTheme.shapes.roundXs
            SandboxTextField.Size.S -> StylesSaluteTheme.shapes.roundXxs
            SandboxTextField.Size.XS -> StylesSaluteTheme.shapes.roundXxs.adjustBy(all = (-2).dp)
        }
    }

    @Composable
    fun textTopPadding(size: SandboxTextField.Size, labelType: LabelType): Dp {
        return if (labelType == LabelType.Outer) {
            0.dp
        } else {
            when (size) {
                SandboxTextField.Size.L -> 25.dp
                SandboxTextField.Size.M -> 22.dp
                SandboxTextField.Size.S -> 18.dp
                SandboxTextField.Size.XS -> 0.dp
            }
        }
    }

    @Composable
    fun textBottomPadding(size: SandboxTextField.Size, labelType: LabelType): Dp {
        return if (labelType == LabelType.Outer) {
            0.dp
        } else {
            when (size) {
                SandboxTextField.Size.L -> 9.dp
                SandboxTextField.Size.M -> 6.dp
                SandboxTextField.Size.S -> 4.dp
                SandboxTextField.Size.XS -> 0.dp
            }
        }
    }

    @Composable
    fun iconMargin(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L -> 8.dp
            SandboxTextField.Size.M -> 6.dp
            SandboxTextField.Size.S -> 4.dp
            SandboxTextField.Size.XS -> 4.dp
        }

    @Composable
    fun horizontalContentPadding(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L -> 16.dp
            SandboxTextField.Size.M -> 14.dp
            SandboxTextField.Size.S -> 12.dp
            SandboxTextField.Size.XS -> 8.dp
        }

    @Composable
    fun innerLabelToValuePadding(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L,
            SandboxTextField.Size.M,
            -> 2.dp

            SandboxTextField.Size.S,
            SandboxTextField.Size.XS,
            -> 0.dp
        }

    @Composable
    fun outerLabelBottomPadding(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L -> 12.dp
            SandboxTextField.Size.M -> 10.dp
            SandboxTextField.Size.S -> 8.dp
            SandboxTextField.Size.XS -> 6.dp
        }

    @Composable
    fun captionTopPadding(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L,
            SandboxTextField.Size.M,
            SandboxTextField.Size.S,
            SandboxTextField.Size.XS,
            -> 4.dp
        }

    @Composable
    fun optionalTextPadding(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L,
            SandboxTextField.Size.M,
            SandboxTextField.Size.S,
            SandboxTextField.Size.XS,
            -> 4.dp
        }

    @Composable
    fun iconSize(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L,
            SandboxTextField.Size.M,
            SandboxTextField.Size.S,
            -> 24.dp

            SandboxTextField.Size.XS -> 16.dp
        }

    /**
     *  Цветовые настройки поля
     */
    @Composable
    fun textFieldColors(): SandboxTextFieldColors = DefaultSandboxTextFieldColors()

    /**
     *  Текстовые стили поля
     */
    @Composable
    fun textFieldStyles(): SandboxTextFieldStyles = DefaultSandboxTextFieldStyles()

    /**
     * Форма в зависимости от размера поля [SandboxTextField.Size]
     */
    @Composable
    fun textFieldShapeFor(size: SandboxTextField.Size) = when (size) {
        SandboxTextField.Size.XS -> StylesSaluteTheme.shapes.roundS
        SandboxTextField.Size.S -> StylesSaluteTheme.shapes.roundM.adjustBy(all = (-2).dp)
        SandboxTextField.Size.M -> StylesSaluteTheme.shapes.roundM
        SandboxTextField.Size.L -> StylesSaluteTheme.shapes.roundM.adjustBy(all = 2.dp)
    }
}

@Immutable
private class DefaultSandboxTextFieldColors : SandboxTextFieldColors {

    @Composable
    override fun leadingIconColor(state: InputState): State<Color> {
        return rememberUpdatedState(StylesSaluteTheme.colors.textDefaultSecondary)
    }

    @Composable
    override fun trailingIconColor(state: InputState, disabledAlpha: Float): State<Color> {
        var color = StylesSaluteTheme.colors.textDefaultSecondary
        if (state == InputState.ReadOnly) {
            color = color.copy(alpha = color.alpha * disabledAlpha)
        }
        return rememberUpdatedState(color)
    }

    @Composable
    override fun backgroundColor(state: InputState): State<Color> {
        val surfaceAlpha = if (isSystemInDarkTheme()) 0.12f else 0.06f
        val readOnlyAlpha = if (isSystemInDarkTheme()) 0.02f else 0.01f
        val color = when (state) {
            InputState.Normal -> StylesSaluteTheme.colors.surfaceDefaultTransparentPrimary
            InputState.Focused -> StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary
            InputState.Error -> StylesSaluteTheme.colors.surfaceDefaultNegative.copy(alpha = surfaceAlpha)
            InputState.Warning -> StylesSaluteTheme.colors.surfaceDefaultWarning.copy(alpha = surfaceAlpha)
            InputState.Success -> StylesSaluteTheme.colors.surfaceDefaultPositive.copy(alpha = surfaceAlpha)
            InputState.ReadOnly -> StylesSaluteTheme.colors.surfaceDefaultSolidDefault.copy(alpha = readOnlyAlpha)
        }
        return rememberUpdatedState(color)
    }

    @Composable
    override fun placeholderColor(state: InputState): State<Color> {
        return rememberUpdatedState(
            if (state == InputState.Focused) {
                StylesSaluteTheme.colors.textDefaultTertiary
            } else {
                StylesSaluteTheme.colors.textDefaultSecondary
            },
        )
    }

    @Composable
    override fun labelColor(state: InputState, type: LabelType): State<Color> {
        val color = when (type) {
            LabelType.Outer -> textFieldTextColor(state = state)
            LabelType.Inner -> StylesSaluteTheme.colors.textDefaultSecondary
        }
        return rememberUpdatedState(color)
    }

    @Composable
    override fun valueColor(state: InputState): State<Color> {
        return rememberUpdatedState(textFieldTextColor(state = state))
    }

    @Composable
    override fun cursorColor(state: InputState): State<Color> {
        return rememberUpdatedState(StylesSaluteTheme.colors.textDefaultAccent)
    }

    @Composable
    override fun captionColor(state: InputState): State<Color> {
        val color = when (state) {
            InputState.Normal,
            InputState.Focused,
            InputState.ReadOnly,
            -> StylesSaluteTheme.colors.textDefaultSecondary

            InputState.Error -> StylesSaluteTheme.colors.textDefaultNegative
            InputState.Warning -> StylesSaluteTheme.colors.textDefaultWarning
            InputState.Success -> StylesSaluteTheme.colors.textDefaultPositive
        }
        return rememberUpdatedState(newValue = color)
    }

    @Composable
    private fun textFieldTextColor(state: InputState) = when (state) {
        InputState.ReadOnly -> StylesSaluteTheme.colors.textDefaultSecondary
        InputState.Normal,
        InputState.Focused,
        InputState.Error,
        InputState.Warning,
        InputState.Success,
        -> StylesSaluteTheme.colors.textDefaultPrimary
    }
}

@Immutable
private class DefaultSandboxTextFieldStyles : SandboxTextFieldStyles {
    @Composable
    override fun outerLabelStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
    ): State<TextStyle> {
        return rememberUpdatedState(
            textFieldTextStyle(size).copy(
                color = colors.labelColor(
                    state = inputState,
                    type = LabelType.Outer,
                ).value,
            ),
        )
    }

    @Composable
    override fun innerLabelStyle(
        size: SandboxTextField.Size,
        inputState: InputState,
        isEmpty: Boolean,
        colors: SandboxTextFieldColors,
    ): State<TextStyle> {
        val style = if (inputState != InputState.Focused && isEmpty) {
            when (size) {
                SandboxTextField.Size.XS -> StylesSaluteTheme.typography.bodySNormal
                SandboxTextField.Size.S -> StylesSaluteTheme.typography.bodySNormal
                SandboxTextField.Size.M -> StylesSaluteTheme.typography.bodyMNormal
                SandboxTextField.Size.L -> StylesSaluteTheme.typography.bodyLNormal
            }
        } else {
            when (size) {
                SandboxTextField.Size.XS -> StylesSaluteTheme.typography.bodyXxsNormal
                SandboxTextField.Size.S -> StylesSaluteTheme.typography.bodyXxsNormal
                SandboxTextField.Size.M -> StylesSaluteTheme.typography.bodyXsNormal
                SandboxTextField.Size.L -> StylesSaluteTheme.typography.bodyXsNormal
            }
        }
        return rememberUpdatedState(
            style.copy(
                color = colors.labelColor(
                    state = inputState,
                    type = LabelType.Inner,
                ).value,
            ),
        )
    }

    @Composable
    override fun valueStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
    ): State<TextStyle> {
        return rememberUpdatedState(
            textFieldTextStyle(size).copy(
                color = colors.valueColor(inputState).value,
            ),
        )
    }

    @Composable
    override fun captionStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
    ): State<TextStyle> {
        return rememberUpdatedState(
            StylesSaluteTheme.typography.bodyXsNormal.copy(
                color = colors.captionColor(inputState).value,
            ),
        )
    }

    @Composable
    override fun placeholderStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
    ): State<TextStyle> {
        return rememberUpdatedState(
            textFieldTextStyle(size).copy(
                color = colors.placeholderColor(inputState).value,
            ),
        )
    }

    @Composable
    private fun textFieldTextStyle(size: SandboxTextField.Size) = when (size) {
        SandboxTextField.Size.XS -> StylesSaluteTheme.typography.bodyXsNormal
        SandboxTextField.Size.S -> StylesSaluteTheme.typography.bodySNormal
        SandboxTextField.Size.M -> StylesSaluteTheme.typography.bodyMNormal
        SandboxTextField.Size.L -> StylesSaluteTheme.typography.bodyLNormal
    }
}
