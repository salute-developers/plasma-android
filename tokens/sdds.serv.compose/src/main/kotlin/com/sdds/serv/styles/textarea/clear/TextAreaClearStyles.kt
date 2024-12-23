package com.sdds.serv.styles.textarea.clear

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextAreaClear
import com.sdds.compose.uikit.TextAreaClearColorsBuilder
import com.sdds.compose.uikit.TextAreaClearStyleBuilder
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.textAreaClearBuilder
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chip.S
import com.sdds.serv.styles.chip.Secondary
import com.sdds.serv.styles.chip.Xs
import com.sdds.serv.styles.chip.group.Dense
import com.sdds.serv.theme.SddsServTheme

val TextAreaClearStyleBuilder.Default: TextAreaClearStyleBuilder
    @Composable
    get() = colors { defaultClearColors() }

val TextAreaClearStyleBuilder.Error: TextAreaClearStyleBuilder
    @Composable
    get() = colors { errorClearColors() }

val TextAreaClearStyleBuilder.Warning: TextAreaClearStyleBuilder
    @Composable
    get() = colors { warningClearColors() }

val TextAreaClearStyleBuilder.Success: TextAreaClearStyleBuilder
    @Composable
    get() = colors { successClearColors() }

val TextAreaClearStyleBuilder.RequiredStart: TextAreaClearStyleBuilder
    get() = fieldType(TextField.FieldType.RequiredStart)

val TextAreaClearStyleBuilder.RequiredEnd: TextAreaClearStyleBuilder
    get() = fieldType(TextField.FieldType.RequiredEnd)

val TextAreaClearStyleBuilder.Optional: TextAreaClearStyleBuilder
    get() = fieldType(TextField.FieldType.Optional)

val TextAreaClearStyleBuilder.InnerLabel: TextAreaClearStyleBuilder
    get() = labelPlacement(TextField.LabelPlacement.Inner)

val TextAreaClearStyleBuilder.OuterLabel: TextAreaClearStyleBuilder
    get() = labelPlacement(TextField.LabelPlacement.Outer)

val TextAreaClear.Xs: TextAreaClearStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaClearBuilder(this)
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

val TextAreaClear.S: TextAreaClearStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaClearBuilder(this)
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

val TextAreaClear.M: TextAreaClearStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaClearBuilder(this)
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
                    labelIndicatorSize = 8.dp,
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

val TextAreaClear.L: TextAreaClearStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaClearBuilder(this)
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
                    labelIndicatorSize = 8.dp,
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

val TextAreaClearStyleBuilder.HasDivider: TextAreaClearStyleBuilder
    get() = hasDivider(true)

val TextAreaClearStyleBuilder.NoDivider: TextAreaClearStyleBuilder
    get() = hasDivider(false)

@Composable
private fun TextAreaClearColorsBuilder.defaultClearColors(): TextAreaClearColorsBuilder = apply {
    disabledAlpha(0.4f)
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
            activated = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        SddsServTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
            activated = SddsServTheme.colors.surfaceDefaultAccent,
            pressed = SddsServTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextAreaClearColorsBuilder.successClearColors(): TextAreaClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    cursorColor(SddsServTheme.colors.textDefaultAccent)
    startContentColor(
        SddsServTheme.colors.surfaceDefaultPositive.asInteractive(
            activated = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    endContentColor(SddsServTheme.colors.textDefaultSecondary)
    innerLabelColor(SddsServTheme.colors.textDefaultSecondary)
    outerLabelColor(SddsServTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(SddsServTheme.colors.textDefaultSecondary)
    valueColor(
        SddsServTheme.colors.textDefaultPositive.asInteractive(
            activated = SddsServTheme.colors.textDefaultPrimary,
            pressed = SddsServTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        SddsServTheme.colors.textDefaultPositive.asInteractive(
            activated = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(SddsServTheme.colors.textDefaultTertiary)
    counterColor(SddsServTheme.colors.textDefaultSecondary)
    placeholderColor(
        SddsServTheme.colors.textDefaultPositive.asInteractive(
            activated = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        SddsServTheme.colors.surfaceDefaultPositive.asInteractive(
            activated = SddsServTheme.colors.surfaceDefaultAccent,
            pressed = SddsServTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextAreaClearColorsBuilder.warningClearColors(): TextAreaClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    cursorColor(SddsServTheme.colors.textDefaultAccent)
    startContentColor(
        SddsServTheme.colors.surfaceDefaultWarning.asInteractive(
            activated = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    endContentColor(SddsServTheme.colors.textDefaultSecondary)
    innerLabelColor(SddsServTheme.colors.textDefaultSecondary)
    outerLabelColor(SddsServTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(SddsServTheme.colors.textDefaultSecondary)
    valueColor(
        SddsServTheme.colors.textDefaultWarning.asInteractive(
            activated = SddsServTheme.colors.textDefaultPrimary,
            pressed = SddsServTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        SddsServTheme.colors.textDefaultWarning.asInteractive(
            activated = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(SddsServTheme.colors.textDefaultTertiary)
    counterColor(SddsServTheme.colors.textDefaultSecondary)
    placeholderColor(
        SddsServTheme.colors.textDefaultWarning.asInteractive(
            activated = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        SddsServTheme.colors.surfaceDefaultWarning.asInteractive(
            activated = SddsServTheme.colors.surfaceDefaultAccent,
            pressed = SddsServTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextAreaClearColorsBuilder.errorClearColors(): TextAreaClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    cursorColor(SddsServTheme.colors.textDefaultAccent)
    startContentColor(
        SddsServTheme.colors.surfaceDefaultNegative.asInteractive(
            activated = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    endContentColor(SddsServTheme.colors.textDefaultSecondary)
    innerLabelColor(SddsServTheme.colors.textDefaultSecondary)
    outerLabelColor(SddsServTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(SddsServTheme.colors.textDefaultSecondary)
    valueColor(
        SddsServTheme.colors.textDefaultNegative.asInteractive(
            activated = SddsServTheme.colors.textDefaultPrimary,
            pressed = SddsServTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        SddsServTheme.colors.textDefaultNegative.asInteractive(
            activated = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(SddsServTheme.colors.textDefaultTertiary)
    counterColor(SddsServTheme.colors.textDefaultSecondary)
    placeholderColor(
        SddsServTheme.colors.textDefaultNegative.asInteractive(
            activated = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        SddsServTheme.colors.surfaceDefaultNegative.asInteractive(
            activated = SddsServTheme.colors.surfaceDefaultAccent,
            pressed = SddsServTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}
