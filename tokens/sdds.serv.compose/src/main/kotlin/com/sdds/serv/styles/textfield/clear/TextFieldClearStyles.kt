package com.sdds.serv.styles.textfield.clear

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldClear
import com.sdds.compose.uikit.TextFieldClearColorsBuilder
import com.sdds.compose.uikit.TextFieldClearStyleBuilder
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.textFieldClearBuilder
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chip.S
import com.sdds.serv.styles.chip.Secondary
import com.sdds.serv.styles.chip.Xs
import com.sdds.serv.styles.chip.group.Dense
import com.sdds.serv.theme.SddsServTheme

val TextFieldClearStyleBuilder.Default: TextFieldClearStyleBuilder
    @Composable
    get() = colors { defaultClearColors() }

val TextFieldClearStyleBuilder.Error: TextFieldClearStyleBuilder
    @Composable
    get() = colors { errorClearColors() }

val TextFieldClearStyleBuilder.Warning: TextFieldClearStyleBuilder
    @Composable
    get() = colors { warningClearColors() }

val TextFieldClearStyleBuilder.Success: TextFieldClearStyleBuilder
    @Composable
    get() = colors { successClearColors() }

val TextFieldClearStyleBuilder.RequiredStart: TextFieldClearStyleBuilder
    get() = fieldType(TextField.FieldType.RequiredStart)

val TextFieldClearStyleBuilder.RequiredEnd: TextFieldClearStyleBuilder
    get() = fieldType(TextField.FieldType.RequiredEnd)

val TextFieldClearStyleBuilder.Optional: TextFieldClearStyleBuilder
    get() = fieldType(TextField.FieldType.Optional)

val TextFieldClearStyleBuilder.InnerLabel: TextFieldClearStyleBuilder
    get() = labelPlacement(TextField.LabelPlacement.Inner)

val TextFieldClearStyleBuilder.OuterLabel: TextFieldClearStyleBuilder
    get() = labelPlacement(TextField.LabelPlacement.Outer)

val TextFieldClear.Xs: TextFieldClearStyleBuilder
    @Composable
    get() = TextFieldStyle.textFieldClearBuilder(this)
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
                boxMinHeight = 32.dp,
                alignmentLineHeight = 32.dp,
                iconSize = 16.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 4.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 2.dp,
                    startFieldHorizontalPadding = 4.dp,
                    startFieldVerticalPadding = 0.dp,
                    endFieldHorizontalPadding = 4.dp,
                    endFieldVerticalPadding = 0.dp,
                    fieldIndicatorSize = 6.dp,
                    labelIndicatorSize = 6.dp,
                ),
            ),
        )
        .innerLabelStyle(SddsServTheme.typography.bodyXxsNormal)
        .outerLabelStyle(SddsServTheme.typography.bodyXsNormal)
        .innerOptionalStyle(SddsServTheme.typography.bodyXxsNormal)
        .outerOptionalStyle(SddsServTheme.typography.bodyXsNormal)
        .valueStyle(SddsServTheme.typography.bodyXsNormal)
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodyXsNormal)
        .dropInnerLabel(true)

val TextFieldClear.S: TextFieldClearStyleBuilder
    @Composable
    get() = TextFieldStyle.textFieldClearBuilder(this)
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
                boxMinHeight = 40.dp,
                alignmentLineHeight = 40.dp,
                iconSize = 24.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 6.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 4.dp,
                    startFieldHorizontalPadding = 6.dp,
                    startFieldVerticalPadding = 0.dp,
                    endFieldHorizontalPadding = 6.dp,
                    endFieldVerticalPadding = 0.dp,
                    fieldIndicatorSize = 6.dp,
                    labelIndicatorSize = 6.dp,
                ),
            ),
        )
        .innerLabelStyle(SddsServTheme.typography.bodyXsNormal)
        .outerLabelStyle(SddsServTheme.typography.bodySNormal)
        .innerOptionalStyle(SddsServTheme.typography.bodyXsNormal)
        .outerOptionalStyle(SddsServTheme.typography.bodySNormal)
        .valueStyle(SddsServTheme.typography.bodySNormal)
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodySNormal)

val TextFieldClear.M: TextFieldClearStyleBuilder
    @Composable
    get() = TextFieldStyle.textFieldClearBuilder(this)
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
                boxMinHeight = 48.dp,
                alignmentLineHeight = 48.dp,
                iconSize = 24.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 6.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 4.dp,
                    startFieldHorizontalPadding = 6.dp,
                    startFieldVerticalPadding = 0.dp,
                    endFieldHorizontalPadding = 6.dp,
                    endFieldVerticalPadding = 0.dp,
                    fieldIndicatorSize = 8.dp,
                    labelIndicatorSize = 6.dp,
                ),
            ),
        )
        .innerLabelStyle(SddsServTheme.typography.bodyXsNormal)
        .outerLabelStyle(SddsServTheme.typography.bodyMNormal)
        .innerOptionalStyle(SddsServTheme.typography.bodyXsNormal)
        .outerOptionalStyle(SddsServTheme.typography.bodyMNormal)
        .valueStyle(SddsServTheme.typography.bodyMNormal)
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodyMNormal)

val TextFieldClear.L: TextFieldClearStyleBuilder
    @Composable
    get() = TextFieldStyle.textFieldClearBuilder(this)
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
                boxMinHeight = 56.dp,
                alignmentLineHeight = 56.dp,
                iconSize = 24.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 6.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 4.dp,
                    startFieldHorizontalPadding = 6.dp,
                    startFieldVerticalPadding = 0.dp,
                    endFieldHorizontalPadding = 6.dp,
                    endFieldVerticalPadding = 0.dp,
                    fieldIndicatorSize = 8.dp,
                    labelIndicatorSize = 6.dp,
                ),
            ),
        )
        .innerLabelStyle(SddsServTheme.typography.bodyXsNormal)
        .outerLabelStyle(SddsServTheme.typography.bodyLNormal)
        .innerOptionalStyle(SddsServTheme.typography.bodyXsNormal)
        .outerOptionalStyle(SddsServTheme.typography.bodyLNormal)
        .valueStyle(SddsServTheme.typography.bodyLNormal)
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodyLNormal)

val TextFieldClearStyleBuilder.HasDivider: TextFieldClearStyleBuilder
    get() = hasDivider(true)

val TextFieldClearStyleBuilder.NoDivider: TextFieldClearStyleBuilder
    get() = hasDivider(false)

@Composable
private fun TextFieldClearColorsBuilder.defaultClearColors(): TextFieldClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(SddsServTheme.colors.textDefaultAccent)
    startContentColor(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    endContentColor(SddsServTheme.colors.textDefaultSecondary)
    innerLabelColor(SddsServTheme.colors.textDefaultSecondary)
    outerLabelColor(SddsServTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(SddsServTheme.colors.textDefaultSecondary)
    valueColor(SddsServTheme.colors.textDefaultPrimary.asInteractive())
    valueColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    captionColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(SddsServTheme.colors.textDefaultTertiary)
    counterColor(SddsServTheme.colors.textDefaultSecondary)
    placeholderColor(
        SddsServTheme.colors.textDefaultSecondary.asInteractive(
            focused = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        SddsServTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
            focused = SddsServTheme.colors.surfaceDefaultAccent,
            pressed = SddsServTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextFieldClearColorsBuilder.successClearColors(): TextFieldClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(SddsServTheme.colors.textDefaultAccent)
    startContentColor(
        SddsServTheme.colors.surfaceDefaultPositive.asInteractive(
            focused = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    endContentColor(SddsServTheme.colors.textDefaultSecondary)
    innerLabelColor(SddsServTheme.colors.textDefaultSecondary)
    outerLabelColor(SddsServTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(SddsServTheme.colors.textDefaultSecondary)
    valueColor(
        SddsServTheme.colors.textDefaultPositive.asInteractive(
            focused = SddsServTheme.colors.textDefaultPrimary,
            pressed = SddsServTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        SddsServTheme.colors.textDefaultPositive.asInteractive(
            focused = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(SddsServTheme.colors.textDefaultTertiary)
    counterColor(SddsServTheme.colors.textDefaultSecondary)
    placeholderColor(
        SddsServTheme.colors.textDefaultPositive.asInteractive(
            focused = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        SddsServTheme.colors.surfaceDefaultPositive.asInteractive(
            focused = SddsServTheme.colors.surfaceDefaultAccent,
            pressed = SddsServTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextFieldClearColorsBuilder.warningClearColors(): TextFieldClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(SddsServTheme.colors.textDefaultAccent)
    startContentColor(
        SddsServTheme.colors.surfaceDefaultWarning.asInteractive(
            focused = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    endContentColor(SddsServTheme.colors.textDefaultSecondary)
    innerLabelColor(SddsServTheme.colors.textDefaultSecondary)
    outerLabelColor(SddsServTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(SddsServTheme.colors.textDefaultSecondary)
    valueColor(
        SddsServTheme.colors.textDefaultWarning.asInteractive(
            focused = SddsServTheme.colors.textDefaultPrimary,
            pressed = SddsServTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        SddsServTheme.colors.textDefaultWarning.asInteractive(
            focused = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(SddsServTheme.colors.textDefaultTertiary)
    counterColor(SddsServTheme.colors.textDefaultSecondary)
    placeholderColor(
        SddsServTheme.colors.textDefaultWarning.asInteractive(
            focused = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        SddsServTheme.colors.surfaceDefaultWarning.asInteractive(
            focused = SddsServTheme.colors.surfaceDefaultAccent,
            pressed = SddsServTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextFieldClearColorsBuilder.errorClearColors(): TextFieldClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(SddsServTheme.colors.textDefaultAccent)
    startContentColor(
        SddsServTheme.colors.surfaceDefaultNegative.asInteractive(
            focused = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    endContentColor(SddsServTheme.colors.textDefaultSecondary)
    innerLabelColor(SddsServTheme.colors.textDefaultSecondary)
    outerLabelColor(SddsServTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(SddsServTheme.colors.textDefaultSecondary)
    valueColor(
        SddsServTheme.colors.textDefaultNegative.asInteractive(
            focused = SddsServTheme.colors.textDefaultPrimary,
            pressed = SddsServTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        SddsServTheme.colors.textDefaultNegative.asInteractive(
            focused = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(SddsServTheme.colors.textDefaultTertiary)
    counterColor(SddsServTheme.colors.textDefaultSecondary)
    placeholderColor(
        SddsServTheme.colors.textDefaultNegative.asInteractive(
            focused = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        SddsServTheme.colors.surfaceDefaultNegative.asInteractive(
            focused = SddsServTheme.colors.surfaceDefaultAccent,
            pressed = SddsServTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}
