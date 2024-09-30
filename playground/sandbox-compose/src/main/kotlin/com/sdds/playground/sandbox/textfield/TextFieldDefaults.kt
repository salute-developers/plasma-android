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
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.HelperTextPosition
import com.sdds.compose.uikit.TextField.LabelPlacement
import com.sdds.compose.uikit.adjustBy
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChip
import com.sdds.playground.sandbox.textfield.SandboxTextField.InputState
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

/**
 * Цвета текстового поля
 */
@Stable
internal interface SandboxTextFieldColors {

    /**
     * Цвет значения текстового поля
     *
     * @param state состояние текстового поля
     * @param isClear текстовое поле с фоном или без фона
     */
    @Composable
    fun valueColor(state: InputState, isClear: Boolean): State<Color>

    /**
     * Цвет контента в начале
     *
     * @param state состояние текстового поля
     * @param isClear текстовое поле с фоном или без фона
     */
    @Composable
    fun startContentColor(state: InputState, isClear: Boolean): State<Color>

    /**
     * Цвет фона текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun backgroundColor(state: InputState): State<Color>

    /**
     * Цвет разделителя текстового поля в состоянии без фона
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun dividerColor(state: InputState): State<Color>

    /**
     * Цвет заглушки текстового поля
     *
     * @param state состояние текстового поля
     * @param isClear текстовое поле с фоном или без фона
     */
    @Composable
    fun placeholderColor(state: InputState, isClear: Boolean): State<Color>

    /**
     * Цвет лейбла текстового поля
     *
     * @param state состояние текстового поля
     * @param type тип лейбла
     */
    @Composable
    fun labelColor(state: InputState, type: LabelPlacement): State<Color>

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

    @Composable
    fun optionalColor(): State<Color>

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
     * Текстовый стиль внутреннего лейбла
     * @param size размер текстового поля
     * @param inputState cостояние текстового поля
     * @param isEmpty true, если поле пустое
     * @param colors цвета текстового поля
     */
    @Composable
    fun labelStyle(
        size: SandboxTextField.Size,
        inputState: InputState,
        isEmpty: Boolean,
        colors: SandboxTextFieldColors,
        labelPlacement: LabelPlacement,
    ): State<TextStyle>

    @Composable
    fun optionalStyle(
        size: SandboxTextField.Size,
        inputState: InputState,
        isEmpty: Boolean,
        colors: SandboxTextFieldColors,
        labelPlacement: LabelPlacement,
    ): State<TextStyle>

    /**
     * Текстовый стиль значения поля
     * @param size размер текстового поля
     * @param colors цвета текстового поля
     * @param inputState состояние текстового поля
     * @param isClear текстовое поле с фоном или без фона
     */
    @Composable
    fun valueStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
        isClear: Boolean,
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

    @Composable
    fun counterStyle(
        size: SandboxTextField.Size,
    ): State<TextStyle>

    /**
     * Текстовый стиль заглушки поля
     * @param size размер текстового поля
     * @param colors цвета текстового поля
     * @param inputState состояние текстового поля
     * @param isClear текстовое поле с фоном или без фона
     */
    @Composable
    fun placeholderStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
        isClear: Boolean,
    ): State<TextStyle>
}

/**
 * Значения по-умолчанию текстового поля
 */
@Immutable
internal object TextFieldDefaults {

    @Composable
    fun scrollBarConfig(isClear: Boolean): ScrollBar? =
        if (isClear) {
            null
        } else {
            ScrollBar(
                indicatorThickness = 1.dp,
                indicatorColor = SddsServTheme.colors.surfaceDefaultTransparentTertiary,
                backgroundColor = SddsServTheme.colors.surfaceDefaultTransparentPrimary,
                padding = PaddingValues(top = 18.dp, end = 2.dp, bottom = 36.dp),
            )
        }

    @Composable
    fun fieldAppearance(
        isClear: Boolean,
        colors: SandboxTextFieldColors,
        inputState: InputState,
        size: SandboxTextField.Size,
        hasDivider: Boolean,
    ): TextField.FieldAppearance {
        return if (!isClear) {
            TextField.FieldAppearance.Solid(
                backgroundColor = colors.backgroundColor(state = inputState).value,
                shape = textFieldShapeFor(size),
            )
        } else {
            TextField.FieldAppearance.Clear(
                dividerColor = if (hasDivider) {
                    colors.dividerColor(inputState).value
                } else {
                    Color.Transparent
                },
                dividerThickness = 1.dp,
            )
        }
    }

    @Composable
    fun SandboxTextField.FieldType.toFieldType(
        labelPlacement: LabelPlacement,
        placement: TextField.Indicator.Placement,
        hasLabel: Boolean,
        optionalText: String,
        size: SandboxTextField.Size,
        fieldAppearance: TextField.FieldAppearance,
    ): TextField.FieldType {
        return when (this) {
            SandboxTextField.FieldType.Optional -> TextField.FieldType.Optional(
                optionalText = optionalText,
            )

            SandboxTextField.FieldType.Required -> TextField.FieldType.Required(
                indicator = indicator(labelPlacement, placement, hasLabel, size, fieldAppearance),
            )
        }
    }

    @Composable
    private fun indicator(
        labelPlacement: LabelPlacement,
        placement: TextField.Indicator.Placement,
        hasLabel: Boolean,
        size: SandboxTextField.Size,
        fieldAppearance: TextField.FieldAppearance,
    ): TextField.Indicator {
        return when {
            labelPlacement == LabelPlacement.Outer && hasLabel -> {
                val horizontalPadding: Dp
                val verticalPadding: Dp
                if (placement == TextField.Indicator.Placement.Start) {
                    horizontalPadding = 6.dp
                    verticalPadding = 0.dp
                } else {
                    horizontalPadding = 4.dp
                    verticalPadding = if (size == SandboxTextField.Size.XS) 2.dp else 4.dp
                }

                TextField.Indicator(
                    size = 6.dp,
                    color = SddsServTheme.colors.surfaceDefaultNegative,
                    placement = placement,
                    horizontalPadding = horizontalPadding,
                    verticalPadding = verticalPadding,
                )
            }

            fieldAppearance is TextField.FieldAppearance.Clear -> {
                TextField.Indicator(
                    size = if (size == SandboxTextField.Size.S || size == SandboxTextField.Size.XS) {
                        6.dp
                    } else {
                        8.dp
                    },
                    color = SddsServTheme.colors.surfaceDefaultNegative,
                    placement = placement,
                    horizontalPadding = if (size == SandboxTextField.Size.XS) {
                        4.dp
                    } else {
                        6.dp
                    },
                )
            }

            else -> TextField.Indicator(
                size = if (size == SandboxTextField.Size.S || size == SandboxTextField.Size.XS) {
                    6.dp
                } else {
                    8.dp
                },
                color = SddsServTheme.colors.surfaceDefaultNegative,
                placement = placement,
            )
        }
    }

    fun chipSize(size: SandboxTextField.Size): SandboxEmbeddedChip.Size {
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
            SandboxTextField.Size.L -> SddsServTheme.shapes.roundS
            SandboxTextField.Size.M -> SddsServTheme.shapes.roundXs
            SandboxTextField.Size.S -> SddsServTheme.shapes.roundXxs
            SandboxTextField.Size.XS -> SddsServTheme.shapes.roundXxs.adjustBy(all = (-2).dp)
        }
    }

    fun chipHeight(size: SandboxTextField.Size): Dp {
        return when (size) {
            SandboxTextField.Size.L -> SandboxEmbeddedChip.Size.L.height
            SandboxTextField.Size.M -> SandboxEmbeddedChip.Size.M.height
            SandboxTextField.Size.S -> SandboxEmbeddedChip.Size.S.height
            SandboxTextField.Size.XS -> SandboxEmbeddedChip.Size.XS.height
        }
    }

    fun boxMinHeight(size: SandboxTextField.Size): Dp {
        return when (size) {
            SandboxTextField.Size.L -> 56.dp
            SandboxTextField.Size.M -> 48.dp
            SandboxTextField.Size.S -> 40.dp
            SandboxTextField.Size.XS -> 32.dp
        }
    }

    fun coreTextFieldPaddings(
        size: SandboxTextField.Size,
        labelPlacement: LabelPlacement,
        helperTextPosition: HelperTextPosition,
        singleLine: Boolean,
        isClear: Boolean,
    ): TextField.Paddings {
        return TextField.Paddings(
            boxPaddingStart = startContentPadding(size, isClear),
            boxPaddingEnd = endContentPadding(size, isClear),
            boxPaddingTop = textTopPadding(size, labelPlacement),
            boxPaddingBottom = textBottomPadding(size, labelPlacement, singleLine, isClear),
            labelPadding = if (labelPlacement == LabelPlacement.Outer) {
                outerLabelBottomPadding(size, isClear)
            } else {
                innerLabelToValuePadding(size)
            },
            helperTextPadding = if (helperTextPosition == HelperTextPosition.Outer || isClear) {
                helperTextTopOuterPadding(size)
            } else {
                helperTextInnerTopPadding(size)
            },
            optionalPadding = 4.dp,
            startContentEndPadding = startIconMargin(size),
            endContentStartPadding = endIconMargin(size),
            chipsPadding = 6.dp,
            chipsSpacing = 2.dp,
            keepIndicatorStartPadding = null,
        )
    }

    private fun textTopPadding(size: SandboxTextField.Size, labelPlacement: LabelPlacement): Dp {
        return if (labelPlacement == LabelPlacement.Inner) {
            when (size) {
                SandboxTextField.Size.L -> 9.dp
                SandboxTextField.Size.M -> 6.dp
                SandboxTextField.Size.S -> 4.dp
                SandboxTextField.Size.XS -> 8.dp
            }
        } else {
            when (size) {
                SandboxTextField.Size.L -> 16.dp
                SandboxTextField.Size.M -> 12.dp
                SandboxTextField.Size.S -> 8.dp
                SandboxTextField.Size.XS -> 8.dp
            }
        }
    }

    private fun textBottomPadding(
        size: SandboxTextField.Size,
        labelPlacement: LabelPlacement,
        singleLine: Boolean,
        isClear: Boolean,
    ): Dp {
        return if (singleLine || isClear) {
            singleLineTextTopPadding(size, labelPlacement)
        } else {
            when (size) {
                SandboxTextField.Size.L -> 12.dp
                SandboxTextField.Size.M -> 12.dp
                SandboxTextField.Size.S -> 12.dp
                SandboxTextField.Size.XS -> 8.dp
            }
        }
    }

    private fun singleLineTextTopPadding(
        size: SandboxTextField.Size,
        labelPlacement: LabelPlacement,
    ): Dp {
        return if (labelPlacement == LabelPlacement.Inner) {
            when (size) {
                SandboxTextField.Size.L -> 9.dp
                SandboxTextField.Size.M -> 6.dp
                SandboxTextField.Size.S -> 4.dp
                SandboxTextField.Size.XS -> 8.dp
            }
        } else {
            when (size) {
                SandboxTextField.Size.L -> 16.dp
                SandboxTextField.Size.M -> 12.dp
                SandboxTextField.Size.S -> 8.dp
                SandboxTextField.Size.XS -> 8.dp
            }
        }
    }

    private fun startIconMargin(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L -> 8.dp
            SandboxTextField.Size.M -> 6.dp
            SandboxTextField.Size.S -> 4.dp
            SandboxTextField.Size.XS -> 4.dp
        }

    private fun endIconMargin(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L -> 10.dp
            SandboxTextField.Size.M -> 8.dp
            SandboxTextField.Size.S -> 6.dp
            SandboxTextField.Size.XS -> 4.dp
        }

    private fun startContentPadding(size: SandboxTextField.Size, isClear: Boolean): Dp =
        if (isClear) {
            0.dp
        } else {
            when (size) {
                SandboxTextField.Size.L -> 16.dp
                SandboxTextField.Size.M -> 14.dp
                SandboxTextField.Size.S -> 12.dp
                SandboxTextField.Size.XS -> 8.dp
            }
        }

    private fun endContentPadding(size: SandboxTextField.Size, isClear: Boolean): Dp =
        if (isClear) {
            0.dp
        } else {
            when (size) {
                SandboxTextField.Size.L -> 16.dp
                SandboxTextField.Size.M -> 14.dp
                SandboxTextField.Size.S -> 12.dp
                SandboxTextField.Size.XS -> 8.dp
            }
        }

    private fun innerLabelToValuePadding(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L,
            SandboxTextField.Size.M,
            -> 2.dp

            SandboxTextField.Size.S,
            SandboxTextField.Size.XS,
            -> 0.dp
        }

    private fun outerLabelBottomPadding(size: SandboxTextField.Size, isClear: Boolean): Dp =
        if (isClear) {
            when (size) {
                SandboxTextField.Size.L -> 4.dp
                SandboxTextField.Size.M -> 4.dp
                SandboxTextField.Size.S -> 4.dp
                SandboxTextField.Size.XS -> 2.dp
            }
        } else {
            when (size) {
                SandboxTextField.Size.L -> 12.dp
                SandboxTextField.Size.M -> 10.dp
                SandboxTextField.Size.S -> 8.dp
                SandboxTextField.Size.XS -> 6.dp
            }
        }

    private fun helperTextTopOuterPadding(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L,
            SandboxTextField.Size.M,
            SandboxTextField.Size.S,
            SandboxTextField.Size.XS,
            -> 4.dp
        }

    private fun helperTextInnerTopPadding(size: SandboxTextField.Size): Dp =
        when (size) {
            SandboxTextField.Size.L,
            SandboxTextField.Size.M,
            SandboxTextField.Size.S,
            -> 12.dp

            SandboxTextField.Size.XS -> 8.dp
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
        SandboxTextField.Size.XS -> SddsServTheme.shapes.roundS
        SandboxTextField.Size.S -> SddsServTheme.shapes.roundM.adjustBy(all = (-2).dp)
        SandboxTextField.Size.M -> SddsServTheme.shapes.roundM
        SandboxTextField.Size.L -> SddsServTheme.shapes.roundM.adjustBy(all = 2.dp)
    }
}

@Immutable
private class DefaultSandboxTextFieldColors : SandboxTextFieldColors {

    @Composable
    override fun leadingIconColor(state: InputState): State<Color> {
        return rememberUpdatedState(SddsServTheme.colors.textDefaultSecondary)
    }

    @Composable
    override fun trailingIconColor(state: InputState, disabledAlpha: Float): State<Color> {
        var color = SddsServTheme.colors.textDefaultSecondary
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
            InputState.Normal -> SddsServTheme.colors.surfaceDefaultTransparentPrimary
            InputState.Focused -> SddsServTheme.colors.surfaceDefaultTransparentSecondary
            InputState.Error -> SddsServTheme.colors.surfaceDefaultNegative.copy(alpha = surfaceAlpha)
            InputState.Warning -> SddsServTheme.colors.surfaceDefaultWarning.copy(alpha = surfaceAlpha)
            InputState.Success -> SddsServTheme.colors.surfaceDefaultPositive.copy(alpha = surfaceAlpha)
            InputState.ReadOnly -> SddsServTheme.colors.surfaceDefaultSolidDefault.copy(alpha = readOnlyAlpha)
        }
        return rememberUpdatedState(color)
    }

    @Composable
    override fun dividerColor(state: InputState): State<Color> {
        val color = when (state) {
            InputState.Normal -> SddsServTheme.colors.surfaceDefaultTransparentTertiary
            InputState.Focused -> SddsServTheme.colors.surfaceDefaultAccent
            InputState.Error -> SddsServTheme.colors.surfaceDefaultNegative
            InputState.Warning -> SddsServTheme.colors.surfaceDefaultWarning
            InputState.Success -> SddsServTheme.colors.surfaceDefaultPositive
            InputState.ReadOnly -> SddsServTheme.colors.surfaceDefaultTransparentPrimary
        }
        return rememberUpdatedState(color)
    }

    @Composable
    override fun placeholderColor(state: InputState, isClear: Boolean): State<Color> {
        return rememberUpdatedState(
            if (state == InputState.Focused) {
                SddsServTheme.colors.textDefaultTertiary
            } else {
                if (isClear) {
                    when (state) {
                        InputState.Error -> SddsServTheme.colors.textDefaultNegative
                        InputState.Warning -> SddsServTheme.colors.textDefaultWarning
                        InputState.Success -> SddsServTheme.colors.textDefaultPositive
                        else -> SddsServTheme.colors.textDefaultSecondary
                    }
                } else {
                    SddsServTheme.colors.textDefaultSecondary
                }
            },
        )
    }

    @Composable
    override fun labelColor(state: InputState, type: LabelPlacement): State<Color> {
        val color = when (type) {
            LabelPlacement.Outer -> textFieldTextColor(state = state)
            LabelPlacement.Inner -> SddsServTheme.colors.textDefaultSecondary
            else -> Color.Unspecified
        }
        return rememberUpdatedState(color)
    }

    @Composable
    override fun valueColor(state: InputState, isClear: Boolean): State<Color> {
        return if (isClear) {
            rememberUpdatedState(
                when (state) {
                    InputState.Error -> SddsServTheme.colors.textDefaultNegative
                    InputState.Warning -> SddsServTheme.colors.textDefaultWarning
                    InputState.Success -> SddsServTheme.colors.textDefaultPositive
                    else -> textFieldTextColor(state)
                },
            )
        } else {
            rememberUpdatedState(textFieldTextColor(state = state))
        }
    }

    @Composable
    override fun startContentColor(state: InputState, isClear: Boolean): State<Color> {
        return if (isClear) {
            rememberUpdatedState(
                when (state) {
                    InputState.Error -> SddsServTheme.colors.surfaceDefaultNegative
                    InputState.Warning -> SddsServTheme.colors.surfaceDefaultWarning
                    InputState.Success -> SddsServTheme.colors.surfaceDefaultPositive
                    else -> SddsServTheme.colors.textDefaultSecondary
                },
            )
        } else {
            rememberUpdatedState(SddsServTheme.colors.textDefaultSecondary)
        }
    }

    @Composable
    override fun cursorColor(state: InputState): State<Color> {
        return rememberUpdatedState(SddsServTheme.colors.textDefaultAccent)
    }

    @Composable
    override fun captionColor(state: InputState): State<Color> {
        val color = when (state) {
            InputState.Normal,
            InputState.Focused,
            InputState.ReadOnly,
            -> SddsServTheme.colors.textDefaultSecondary

            InputState.Error -> SddsServTheme.colors.textDefaultNegative
            InputState.Warning -> SddsServTheme.colors.textDefaultWarning
            InputState.Success -> SddsServTheme.colors.textDefaultPositive
        }
        return rememberUpdatedState(newValue = color)
    }

    @Composable
    override fun optionalColor(): State<Color> {
        return rememberUpdatedState(SddsServTheme.colors.textDefaultTertiary)
    }

    @Composable
    private fun textFieldTextColor(state: InputState) = when (state) {
        InputState.ReadOnly -> SddsServTheme.colors.textDefaultSecondary
        InputState.Normal,
        InputState.Focused,
        InputState.Error,
        InputState.Warning,
        InputState.Success,
        -> SddsServTheme.colors.textDefaultPrimary
    }
}

@Immutable
private class DefaultSandboxTextFieldStyles : SandboxTextFieldStyles {
    @Composable
    override fun labelStyle(
        size: SandboxTextField.Size,
        inputState: InputState,
        isEmpty: Boolean,
        colors: SandboxTextFieldColors,
        labelPlacement: LabelPlacement,
    ): State<TextStyle> {
        val style = when (labelPlacement) {
            LabelPlacement.Outer -> { textFieldTextStyle(size) }
            LabelPlacement.Inner -> {
                when (size) {
                    SandboxTextField.Size.XS -> SddsServTheme.typography.bodyXxsNormal
                    SandboxTextField.Size.S -> SddsServTheme.typography.bodyXsNormal
                    SandboxTextField.Size.M -> SddsServTheme.typography.bodyXsNormal
                    SandboxTextField.Size.L -> SddsServTheme.typography.bodyXsNormal
                }
            }
            else -> TextStyle.Default
        }

        return rememberUpdatedState(
            style.copy(
                color = colors.labelColor(
                    state = inputState,
                    type = labelPlacement,
                ).value,
            ),
        )
    }

    @Composable
    override fun optionalStyle(
        size: SandboxTextField.Size,
        inputState: InputState,
        isEmpty: Boolean,
        colors: SandboxTextFieldColors,
        labelPlacement: LabelPlacement,
    ): State<TextStyle> {
        val style = when (labelPlacement) {
            LabelPlacement.Outer -> { textFieldTextStyle(size) }
            LabelPlacement.Inner -> {
                when (size) {
                    SandboxTextField.Size.XS -> SddsServTheme.typography.bodyXxsNormal
                    SandboxTextField.Size.S -> SddsServTheme.typography.bodyXsNormal
                    SandboxTextField.Size.M -> SddsServTheme.typography.bodyXsNormal
                    SandboxTextField.Size.L -> SddsServTheme.typography.bodyXsNormal
                }
            }
            else -> TextStyle.Default
        }

        return rememberUpdatedState(
            style.copy(
                color = colors.optionalColor().value,
            ),
        )
    }

    @Composable
    override fun valueStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
        isClear: Boolean,
    ): State<TextStyle> {
        return rememberUpdatedState(
            textFieldTextStyle(size).copy(
                color = colors.valueColor(inputState, isClear).value,
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
            SddsServTheme.typography.bodyXsNormal.copy(
                color = colors.captionColor(inputState).value,
            ),
        )
    }

    @Composable
    override fun counterStyle(size: SandboxTextField.Size): State<TextStyle> {
        return rememberUpdatedState(
            SddsServTheme.typography.bodyXsNormal.copy(
                color = SddsServTheme.colors.textDefaultSecondary,
            ),
        )
    }

    @Composable
    override fun placeholderStyle(
        size: SandboxTextField.Size,
        colors: SandboxTextFieldColors,
        inputState: InputState,
        isClear: Boolean,
    ): State<TextStyle> {
        return rememberUpdatedState(
            textFieldTextStyle(size).copy(
                color = colors.placeholderColor(inputState, isClear).value,
            ),
        )
    }

    @Composable
    private fun textFieldTextStyle(size: SandboxTextField.Size) = when (size) {
        SandboxTextField.Size.XS -> SddsServTheme.typography.bodyXsNormal
        SandboxTextField.Size.S -> SddsServTheme.typography.bodySNormal
        SandboxTextField.Size.M -> SddsServTheme.typography.bodyMNormal
        SandboxTextField.Size.L -> SddsServTheme.typography.bodyLNormal
    }
}
