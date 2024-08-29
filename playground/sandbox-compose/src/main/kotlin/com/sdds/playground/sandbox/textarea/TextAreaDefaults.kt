package com.sdds.playground.sandbox.textarea

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ScrollBarConfig
import com.sdds.compose.uikit.TextField.LabelType
import com.sdds.compose.uikit.adjustBy
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChip
import com.sdds.playground.sandbox.textfield.SandboxTextField
import com.sdds.playground.sandbox.textfield.SandboxTextField.InputState
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

/**
 * Цвета текстового поля
 */
@Stable
internal interface SandboxTextAreaColors {

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
     * Цвет иконки в конце текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun iconColor(state: InputState, disabledAlpha: Float): State<Color>

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
internal interface SandboxTextAreaStyles {

    /**
     * Текстовый стиль внешнего лейбла
     * @param size размер текстового поля
     * @param colors цвета текстового поля
     * @param inputState состояние текстового поля
     */
    @Composable
    fun outerLabelStyle(
        size: SandboxTextArea.Size,
        colors: SandboxTextAreaColors,
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
        size: SandboxTextArea.Size,
        inputState: InputState,
        isEmpty: Boolean,
        colors: SandboxTextAreaColors,
    ): State<TextStyle>

    /**
     * Текстовый стиль значения поля
     * @param size размер текстового поля
     * @param colors цвета текстового поля
     * @param inputState состояние текстового поля
     */
    @Composable
    fun valueStyle(
        size: SandboxTextArea.Size,
        colors: SandboxTextAreaColors,
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
        size: SandboxTextArea.Size,
        colors: SandboxTextAreaColors,
        inputState: InputState,
    ): State<TextStyle>

    /**
     * Текстовый стиль счетчика поля
     * @param size размер текстового поля
     * @param colors цвета текстового поля
     * @param inputState состояние текстового поля
     */
    @Composable
    fun counterStyle(
        size: SandboxTextArea.Size,
        colors: SandboxTextAreaColors,
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
        size: SandboxTextArea.Size,
        colors: SandboxTextAreaColors,
        inputState: InputState,
    ): State<TextStyle>
}

/**
 * Значения по-умолчанию текстового поля
 */
@Immutable
internal object TextAreaDefaults {

    @Composable
    fun scrollBarConfig(): ScrollBarConfig = ScrollBarConfig(
        indicatorThickness = 1.dp,
        indicatorColor = StylesSaluteTheme.colors.surfaceDefaultTransparentTertiary,
        backgroundColor = StylesSaluteTheme.colors.surfaceDefaultTransparentPrimary,
        padding = PaddingValues(top = 18.dp, end = 2.dp, bottom = 36.dp),
    )

    @Composable
    fun chipGroupSize(size: SandboxTextArea.Size): SandboxEmbeddedChip.Size {
        return when (size) {
            SandboxTextArea.Size.L -> SandboxEmbeddedChip.Size.L
            SandboxTextArea.Size.M -> SandboxEmbeddedChip.Size.M
            SandboxTextArea.Size.S -> SandboxEmbeddedChip.Size.S
            SandboxTextArea.Size.XS -> SandboxEmbeddedChip.Size.XS
        }
    }

    @Composable
    fun textTopPadding(size: SandboxTextArea.Size, labelType: LabelType): Dp {
        return if (labelType == LabelType.Outer) {
            when (size) {
                SandboxTextArea.Size.L -> 17.dp
                SandboxTextArea.Size.M -> 14.dp
                SandboxTextArea.Size.S -> 11.dp
                SandboxTextArea.Size.XS -> 11.dp
            }
        } else {
            when (size) {
                SandboxTextArea.Size.L -> 26.dp
                SandboxTextArea.Size.M -> 24.dp
                SandboxTextArea.Size.S -> 18.dp
                SandboxTextArea.Size.XS -> 9.dp
            }
        }
    }

    @Composable
    fun textBottomPadding(size: SandboxTextArea.Size): Dp {
        return when (size) {
            SandboxTextArea.Size.L -> 12.dp
            SandboxTextArea.Size.M -> 12.dp
            SandboxTextArea.Size.S -> 12.dp
            SandboxTextArea.Size.XS -> 8.dp
        }
    }

    @Composable
    fun iconHorizontalMargin(size: SandboxTextArea.Size): Dp =
        when (size) {
            SandboxTextArea.Size.L -> 12.dp
            SandboxTextArea.Size.M -> 10.dp
            SandboxTextArea.Size.S -> 8.dp
            SandboxTextArea.Size.XS -> 6.dp
        }

    @Composable
    fun horizontalContentPadding(size: SandboxTextArea.Size): Dp =
        when (size) {
            SandboxTextArea.Size.L -> 16.dp
            SandboxTextArea.Size.M -> 14.dp
            SandboxTextArea.Size.S -> 12.dp
            SandboxTextArea.Size.XS -> 8.dp
        }

    @Composable
    fun innerLabelToValuePadding(size: SandboxTextArea.Size): Dp =
        when (size) {
            SandboxTextArea.Size.L,
            SandboxTextArea.Size.M,
            -> 2.dp
            SandboxTextArea.Size.S -> 1.dp
            SandboxTextArea.Size.XS -> 0.dp
        }

    @Composable
    fun outerLabelBottomPadding(size: SandboxTextArea.Size): Dp =
        when (size) {
            SandboxTextArea.Size.L -> 12.dp
            SandboxTextArea.Size.M -> 10.dp
            SandboxTextArea.Size.S -> 8.dp
            SandboxTextArea.Size.XS -> 6.dp
        }

    @Composable
    fun iconTopPadding(size: SandboxTextArea.Size): Dp =
        when (size) {
            SandboxTextArea.Size.L -> 16.dp
            SandboxTextArea.Size.M -> 12.dp
            SandboxTextArea.Size.S -> 8.dp
            SandboxTextArea.Size.XS -> 8.dp
        }

    @Composable
    fun bottomTextBottomPadding(size: SandboxTextArea.Size): Dp =
        when (size) {
            SandboxTextArea.Size.L -> 12.dp
            SandboxTextArea.Size.M -> 12.dp
            SandboxTextArea.Size.S -> 12.dp
            SandboxTextArea.Size.XS -> 8.dp
        }

    @Composable
    fun iconSize(size: SandboxTextArea.Size): Dp =
        when (size) {
            SandboxTextArea.Size.L,
            SandboxTextArea.Size.M,
            SandboxTextArea.Size.S,
            -> 24.dp

            SandboxTextArea.Size.XS -> 16.dp
        }

    /**
     *  Цветовые настройки поля
     */
    @Composable
    fun textAreaColors(): SandboxTextAreaColors = DefaultSandboxTextAreaColors()

    /**
     *  Текстовые стили поля
     */
    @Composable
    fun textAreaStyles(): SandboxTextAreaStyles = DefaultSandboxTextAreaStyles()

    /**
     * Форма в зависимости от размера поля [SandboxTextField.Size]
     */
    @Composable
    fun textAreaShapeFor(size: SandboxTextArea.Size) = when (size) {
        SandboxTextArea.Size.XS -> StylesSaluteTheme.shapes.roundS
        SandboxTextArea.Size.S -> StylesSaluteTheme.shapes.roundM.adjustBy(all = (-2).dp)
        SandboxTextArea.Size.M -> StylesSaluteTheme.shapes.roundM
        SandboxTextArea.Size.L -> StylesSaluteTheme.shapes.roundL.adjustBy(all = (-2).dp)
    }
}

@Immutable
private class DefaultSandboxTextAreaColors : SandboxTextAreaColors {

    @Composable
    override fun iconColor(state: InputState, disabledAlpha: Float): State<Color> {
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
private class DefaultSandboxTextAreaStyles : SandboxTextAreaStyles {
    @Composable
    override fun outerLabelStyle(
        size: SandboxTextArea.Size,
        colors: SandboxTextAreaColors,
        inputState: InputState,
    ): State<TextStyle> {
        val style = when (size) {
            SandboxTextArea.Size.XS -> StylesSaluteTheme.typography.bodyXsNormal
            SandboxTextArea.Size.S -> StylesSaluteTheme.typography.bodySNormal
            SandboxTextArea.Size.M -> StylesSaluteTheme.typography.bodyMNormal
            SandboxTextArea.Size.L -> StylesSaluteTheme.typography.bodyLNormal
        }
        return rememberUpdatedState(
            style.copy(
                color = colors.labelColor(
                    state = inputState,
                    type = LabelType.Outer,
                ).value,
            ),
        )
    }

    @Composable
    override fun innerLabelStyle(
        size: SandboxTextArea.Size,
        inputState: InputState,
        isEmpty: Boolean,
        colors: SandboxTextAreaColors,
    ): State<TextStyle> {
        val style = if (inputState != InputState.Focused && isEmpty) {
            when (size) {
                SandboxTextArea.Size.XS -> StylesSaluteTheme.typography.bodyXsNormal
                SandboxTextArea.Size.S -> StylesSaluteTheme.typography.bodyXsNormal
                SandboxTextArea.Size.M -> StylesSaluteTheme.typography.bodyMNormal
                SandboxTextArea.Size.L -> StylesSaluteTheme.typography.bodyLNormal
            }
        } else {
            when (size) {
                SandboxTextArea.Size.XS -> StylesSaluteTheme.typography.bodyXxsNormal
                SandboxTextArea.Size.S -> StylesSaluteTheme.typography.bodyXsNormal
                SandboxTextArea.Size.M -> StylesSaluteTheme.typography.bodyXsNormal
                SandboxTextArea.Size.L -> StylesSaluteTheme.typography.bodyXsNormal
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
        size: SandboxTextArea.Size,
        colors: SandboxTextAreaColors,
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
        size: SandboxTextArea.Size,
        colors: SandboxTextAreaColors,
        inputState: InputState,
    ): State<TextStyle> {
        return rememberUpdatedState(
            StylesSaluteTheme.typography.bodyXsNormal.copy(
                color = colors.captionColor(inputState).value,
            ),
        )
    }

    @Composable
    override fun counterStyle(
        size: SandboxTextArea.Size,
        colors: SandboxTextAreaColors,
        inputState: InputState,
    ): State<TextStyle> {
        return rememberUpdatedState(
            StylesSaluteTheme.typography.bodyXsNormal.copy(
                color = StylesSaluteTheme.colors.textDefaultSecondary,
            ),
        )
    }

    @Composable
    override fun placeholderStyle(
        size: SandboxTextArea.Size,
        colors: SandboxTextAreaColors,
        inputState: InputState,
    ): State<TextStyle> {
        return rememberUpdatedState(
            textFieldTextStyle(size).copy(
                color = colors.placeholderColor(inputState).value,
            ),
        )
    }

    @Composable
    private fun textFieldTextStyle(size: SandboxTextArea.Size) = when (size) {
        SandboxTextArea.Size.XS -> StylesSaluteTheme.typography.bodyXsNormal
        SandboxTextArea.Size.S -> StylesSaluteTheme.typography.bodyXsNormal
        SandboxTextArea.Size.M -> StylesSaluteTheme.typography.bodyMNormal
        SandboxTextArea.Size.L -> StylesSaluteTheme.typography.bodyLNormal
    }
}
