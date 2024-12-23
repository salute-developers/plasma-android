package com.sdds.plasma.sd.service.styles.textarea.clear

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
import com.sdds.plasma.sd.service.styles.chip.L
import com.sdds.plasma.sd.service.styles.chip.M
import com.sdds.plasma.sd.service.styles.chip.S
import com.sdds.plasma.sd.service.styles.chip.Secondary
import com.sdds.plasma.sd.service.styles.chip.Xs
import com.sdds.plasma.sd.service.styles.chip.group.Dense
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme

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
        .innerLabelStyle(PlasmaSdServiceTheme.typography.bodyXxsNormal)
        .outerLabelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .innerOptionalStyle(PlasmaSdServiceTheme.typography.bodyXxsNormal)
        .outerOptionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .captionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
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
        .innerLabelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .outerLabelStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .innerOptionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .outerOptionalStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .valueStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .captionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodySNormal)

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
        .innerLabelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .outerLabelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .innerOptionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .outerOptionalStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .captionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyMNormal)

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
        .innerLabelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .outerLabelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .innerOptionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .outerOptionalStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .captionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyLNormal)

val TextAreaClearStyleBuilder.HasDivider: TextAreaClearStyleBuilder
    get() = hasDivider(true)

val TextAreaClearStyleBuilder.NoDivider: TextAreaClearStyleBuilder
    get() = hasDivider(false)

@Composable
private fun TextAreaClearColorsBuilder.defaultClearColors(): TextAreaClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    cursorColor(PlasmaSdServiceTheme.colors.textDefaultAccent)
    startContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    endContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    valueColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
    valueColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    captionColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaSdServiceTheme.colors.textDefaultTertiary)
    counterColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultTertiary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
            activated = PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextAreaClearColorsBuilder.successClearColors(): TextAreaClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    cursorColor(PlasmaSdServiceTheme.colors.textDefaultAccent)
    startContentColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultPositive.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondary,
        ),
    )
    endContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    valueColor(
        PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultPrimary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaSdServiceTheme.colors.textDefaultTertiary)
    counterColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultTertiary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultPositive.asInteractive(
            activated = PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextAreaClearColorsBuilder.warningClearColors(): TextAreaClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    cursorColor(PlasmaSdServiceTheme.colors.textDefaultAccent)
    startContentColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultWarning.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondary,
        ),
    )
    endContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    valueColor(
        PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultPrimary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaSdServiceTheme.colors.textDefaultTertiary)
    counterColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultTertiary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultWarning.asInteractive(
            activated = PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextAreaClearColorsBuilder.errorClearColors(): TextAreaClearColorsBuilder = apply {
    disabledAlpha(0.4f)
    cursorColor(PlasmaSdServiceTheme.colors.textDefaultAccent)
    startContentColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultNegative.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondary,
        ),
    )
    endContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    valueColor(
        PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultPrimary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultPrimary,
        ),
    )
    valueColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaSdServiceTheme.colors.textDefaultTertiary)
    counterColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
            activated = PlasmaSdServiceTheme.colors.textDefaultTertiary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    dividerColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultNegative.asInteractive(
            activated = PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
        ),
    )
    dividerColorReadOnly(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
    indicatorColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative)
}
