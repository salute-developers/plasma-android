package com.sdds.plasma.b2c.styles

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldClear
import com.sdds.compose.uikit.TextFieldColorsBuilder
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTheme

val TextFieldClear.Xs: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Clear)
        .helperTextPlacement(TextField.HelperTextPlacement.Outer)
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.Xs.Secondary.style(),
            ).style(),
        )
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 0.dp,
                boxPaddingEnd = 0.dp,
                boxPaddingTopInnerLabel = 8.dp,
                boxPaddingBottomInnerLabel = 8.dp,
                boxPaddingTopOuterLabel = 8.dp,
                boxPaddingBottomOuterLabel = 8.dp,
                innerLabelPadding = 0.dp,
                outerLabelPadding = 2.dp,
                optionalPadding = 4.dp,
                helperTextPaddingInner = 0.dp,
                helperTextPaddingOuter = 4.dp,
                startContentEndPadding = 4.dp,
                endContentStartPadding = 4.dp,
                chipsPadding = 6.dp,
                chipsSpacing = 2.dp,
                boxMinHeight = 32.dp,
                alignmentLineHeight = 32.dp,
                iconSize = 16.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 4.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 0.dp,
                    startFieldHorizontalPadding = 4.dp,
                    startFieldVerticalPadding = 0.dp,
                    endFieldHorizontalPadding = 4.dp,
                    endFieldVerticalPadding = 0.dp,
                    fieldIndicatorSize = 6.dp,
                    labelIndicatorSize = 6.dp,
                ),
            ),
        )
        .innerLabelStyle(PlasmaB2cTheme.typography.bodyXxsNormal)
        .outerLabelStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .innerOptionalStyle(PlasmaB2cTheme.typography.bodyXxsNormal)
        .outerOptionalStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .valueStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .captionStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .dropInnerLabel(true)
        .singleLine(true)

val TextFieldClear.S: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Clear)
        .helperTextPlacement(TextField.HelperTextPlacement.Outer)
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.S.Secondary.style(),
            ).style(),
        )
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 0.dp,
                boxPaddingEnd = 0.dp,
                boxPaddingTopInnerLabel = 4.dp,
                boxPaddingBottomInnerLabel = 4.dp,
                boxPaddingTopOuterLabel = 8.dp,
                boxPaddingBottomOuterLabel = 8.dp,
                innerLabelPadding = 0.dp,
                outerLabelPadding = 4.dp,
                optionalPadding = 4.dp,
                helperTextPaddingInner = 0.dp,
                helperTextPaddingOuter = 4.dp,
                startContentEndPadding = 4.dp,
                endContentStartPadding = 6.dp,
                chipsPadding = 6.dp,
                chipsSpacing = 2.dp,
                boxMinHeight = 40.dp,
                alignmentLineHeight = 40.dp,
                iconSize = 24.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 6.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 0.dp,
                    startFieldHorizontalPadding = 6.dp,
                    startFieldVerticalPadding = 0.dp,
                    endFieldHorizontalPadding = 6.dp,
                    endFieldVerticalPadding = 0.dp,
                    fieldIndicatorSize = 6.dp,
                    labelIndicatorSize = 6.dp,
                ),
            ),
        )
        .innerLabelStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .outerLabelStyle(PlasmaB2cTheme.typography.bodySNormal)
        .innerOptionalStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .outerOptionalStyle(PlasmaB2cTheme.typography.bodySNormal)
        .valueStyle(PlasmaB2cTheme.typography.bodySNormal)
        .captionStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaB2cTheme.typography.bodySNormal)
        .singleLine(true)

val TextFieldClear.M: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Clear)
        .helperTextPlacement(TextField.HelperTextPlacement.Outer)
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.M.Secondary.style(),
            ).style(),
        )
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 0.dp,
                boxPaddingEnd = 0.dp,
                boxPaddingTopInnerLabel = 6.dp,
                boxPaddingBottomInnerLabel = 6.dp,
                boxPaddingTopOuterLabel = 12.dp,
                boxPaddingBottomOuterLabel = 12.dp,
                innerLabelPadding = 2.dp,
                outerLabelPadding = 4.dp,
                optionalPadding = 4.dp,
                helperTextPaddingInner = 0.dp,
                helperTextPaddingOuter = 4.dp,
                startContentEndPadding = 6.dp,
                endContentStartPadding = 8.dp,
                chipsPadding = 6.dp,
                chipsSpacing = 2.dp,
                boxMinHeight = 48.dp,
                alignmentLineHeight = 48.dp,
                iconSize = 24.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 6.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 6.dp,
                    endLabelVerticalPadding = 0.dp,
                    startFieldHorizontalPadding = 6.dp,
                    startFieldVerticalPadding = 0.dp,
                    endFieldHorizontalPadding = 6.dp,
                    endFieldVerticalPadding = 0.dp,
                    fieldIndicatorSize = 8.dp,
                    labelIndicatorSize = 8.dp,
                ),
            ),
        )
        .innerLabelStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .outerLabelStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .innerOptionalStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .outerOptionalStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .valueStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .captionStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .singleLine(true)

val TextFieldClear.L: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Clear)
        .helperTextPlacement(TextField.HelperTextPlacement.Outer)
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.L.Secondary.style(),
            ).style(),
        )
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 0.dp,
                boxPaddingEnd = 0.dp,
                boxPaddingTopInnerLabel = 9.dp,
                boxPaddingBottomInnerLabel = 9.dp,
                boxPaddingTopOuterLabel = 16.dp,
                boxPaddingBottomOuterLabel = 16.dp,
                innerLabelPadding = 2.dp,
                outerLabelPadding = 4.dp,
                optionalPadding = 4.dp,
                helperTextPaddingInner = 0.dp,
                helperTextPaddingOuter = 4.dp,
                startContentEndPadding = 8.dp,
                endContentStartPadding = 10.dp,
                chipsPadding = 6.dp,
                chipsSpacing = 2.dp,
                boxMinHeight = 56.dp,
                alignmentLineHeight = 56.dp,
                iconSize = 24.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 6.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 6.dp,
                    endLabelVerticalPadding = 0.dp,
                    startFieldHorizontalPadding = 6.dp,
                    startFieldVerticalPadding = 0.dp,
                    endFieldHorizontalPadding = 6.dp,
                    endFieldVerticalPadding = 0.dp,
                    fieldIndicatorSize = 8.dp,
                    labelIndicatorSize = 8.dp,
                ),
            ),
        )
        .innerLabelStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .outerLabelStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .innerOptionalStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .outerOptionalStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .valueStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .captionStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .singleLine(true)

@Composable
internal fun TextFieldColorsBuilder.defaultClearColors(): TextFieldColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(PlasmaB2cTheme.colors.textDefaultAccent)
    startContentColor(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    endContentColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaB2cTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary)
    valueColor(PlasmaB2cTheme.colors.textDefaultPrimary.asInteractive())
    valueColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    captionColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaB2cTheme.colors.textDefaultTertiary)
    counterColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive(
            focused = PlasmaB2cTheme.colors.textDefaultTertiary,
            pressed = PlasmaB2cTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        PlasmaB2cTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
            focused = PlasmaB2cTheme.colors.surfaceDefaultAccent,
            pressed = PlasmaB2cTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(PlasmaB2cTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(PlasmaB2cTheme.colors.surfaceDefaultNegative)
}

@Composable
internal fun TextFieldColorsBuilder.successClearColors(): TextFieldColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(PlasmaB2cTheme.colors.textDefaultAccent)
    startContentColor(PlasmaB2cTheme.colors.surfaceDefaultPositive.asInteractive())
    endContentColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaB2cTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary)
    valueColor(
        PlasmaB2cTheme.colors.textDefaultPositive.asInteractive(
            focused = PlasmaB2cTheme.colors.textDefaultPrimary,
            pressed = PlasmaB2cTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        PlasmaB2cTheme.colors.textDefaultPositive.asInteractive(
            focused = PlasmaB2cTheme.colors.textDefaultSecondary,
            pressed = PlasmaB2cTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaB2cTheme.colors.textDefaultTertiary)
    counterColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaB2cTheme.colors.textDefaultPositive.asInteractive(
            focused = PlasmaB2cTheme.colors.textDefaultTertiary,
            pressed = PlasmaB2cTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        PlasmaB2cTheme.colors.surfaceDefaultPositive.asInteractive(
            focused = PlasmaB2cTheme.colors.surfaceDefaultAccent,
            pressed = PlasmaB2cTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(PlasmaB2cTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(PlasmaB2cTheme.colors.surfaceDefaultNegative)
}

@Composable
internal fun TextFieldColorsBuilder.warningClearColors(): TextFieldColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(PlasmaB2cTheme.colors.textDefaultAccent)
    startContentColor(PlasmaB2cTheme.colors.surfaceDefaultWarning.asInteractive())
    endContentColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaB2cTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary)
    valueColor(
        PlasmaB2cTheme.colors.textDefaultWarning.asInteractive(
            focused = PlasmaB2cTheme.colors.textDefaultPrimary,
            pressed = PlasmaB2cTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        PlasmaB2cTheme.colors.textDefaultWarning.asInteractive(
            focused = PlasmaB2cTheme.colors.textDefaultSecondary,
            pressed = PlasmaB2cTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaB2cTheme.colors.textDefaultTertiary)
    counterColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaB2cTheme.colors.textDefaultWarning.asInteractive(
            focused = PlasmaB2cTheme.colors.textDefaultTertiary,
            pressed = PlasmaB2cTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        PlasmaB2cTheme.colors.surfaceDefaultWarning.asInteractive(
            focused = PlasmaB2cTheme.colors.surfaceDefaultAccent,
            pressed = PlasmaB2cTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(PlasmaB2cTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(PlasmaB2cTheme.colors.surfaceDefaultNegative)
}

@Composable
internal fun TextFieldColorsBuilder.errorClearColors(): TextFieldColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(PlasmaB2cTheme.colors.textDefaultAccent)
    startContentColor(PlasmaB2cTheme.colors.surfaceDefaultNegative.asInteractive())
    endContentColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaB2cTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary)
    valueColor(
        PlasmaB2cTheme.colors.textDefaultNegative.asInteractive(
            focused = PlasmaB2cTheme.colors.textDefaultPrimary,
            pressed = PlasmaB2cTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        PlasmaB2cTheme.colors.textDefaultNegative.asInteractive(
            focused = PlasmaB2cTheme.colors.textDefaultSecondary,
            pressed = PlasmaB2cTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaB2cTheme.colors.textDefaultTertiary)
    counterColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaB2cTheme.colors.textDefaultNegative.asInteractive(
            focused = PlasmaB2cTheme.colors.textDefaultTertiary,
            pressed = PlasmaB2cTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        PlasmaB2cTheme.colors.surfaceDefaultNegative.asInteractive(
            focused = PlasmaB2cTheme.colors.surfaceDefaultAccent,
            pressed = PlasmaB2cTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(PlasmaB2cTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(PlasmaB2cTheme.colors.surfaceDefaultNegative)
}
