package com.sdds.playground.sandbox.textfield

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextAreaClear
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldClear
import com.sdds.compose.uikit.TextFieldColorsBuilder
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.applyFor
import com.sdds.playground.sandbox.chip.L
import com.sdds.playground.sandbox.chip.M
import com.sdds.playground.sandbox.chip.S
import com.sdds.playground.sandbox.chip.Secondary
import com.sdds.playground.sandbox.chip.Xs
import com.sdds.playground.sandbox.chip.group.Dense
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

internal val TextFieldStyleBuilder.Default: TextFieldStyleBuilder
    @Composable
    get() = applyFor(TextField) {
        colors { defaultColors() }
    }.applyFor(TextArea) {
        colors { defaultColors() }
    }.applyFor(TextFieldClear) {
        colors { defaultClearColors() }
    }.applyFor(TextAreaClear) {
        colors { defaultClearColors() }
    }

internal val TextFieldStyleBuilder.Error: TextFieldStyleBuilder
    @Composable
    get() = applyFor(TextField) {
        colors { errorColors() }
    }.applyFor(TextArea) {
        colors { errorColors() }
    }.applyFor(TextFieldClear) {
        colors { errorClearColors() }
    }.applyFor(TextAreaClear) {
        colors { errorClearColors() }
    }

internal val TextFieldStyleBuilder.Warning: TextFieldStyleBuilder
    @Composable
    get() = applyFor(TextField) {
        colors { warningColors() }
    }.applyFor(TextArea) {
        colors { warningColors() }
    }.applyFor(TextFieldClear) {
        colors { warningClearColors() }
    }.applyFor(TextAreaClear) {
        colors { warningClearColors() }
    }

internal val TextFieldStyleBuilder.Success: TextFieldStyleBuilder
    @Composable
    get() = applyFor(TextField) {
        colors { successColors() }
    }.applyFor(TextArea) {
        colors { successColors() }
    }.applyFor(TextFieldClear) {
        colors { successClearColors() }
    }.applyFor(TextAreaClear) {
        colors { successClearColors() }
    }

internal val TextFieldStyleBuilder.RequiredStart: TextFieldStyleBuilder
    get() = fieldType(TextField.FieldType.RequiredStart)

internal val TextFieldStyleBuilder.RequiredEnd: TextFieldStyleBuilder
    get() = fieldType(TextField.FieldType.RequiredEnd)

internal val TextFieldStyleBuilder.Optional: TextFieldStyleBuilder
    get() = fieldType(TextField.FieldType.Optional)

internal val TextFieldStyleBuilder.InnerLabel: TextFieldStyleBuilder
    get() = labelPlacement(TextField.LabelPlacement.Inner)

internal val TextFieldStyleBuilder.OuterLabel: TextFieldStyleBuilder
    get() = labelPlacement(TextField.LabelPlacement.Outer)

internal val TextField.Xs: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(SddsServTheme.shapes.roundS)
        .chipContainerShape(SddsServTheme.shapes.roundXxs.adjustBy(all = (-2).dp))
        .helperTextPlacement(TextField.HelperTextPlacement.Outer)
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.Xs.Secondary.style(),
            ).style(),
        )
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 8.dp,
                boxPaddingEnd = 8.dp,
                boxPaddingTopInnerLabel = 8.dp,
                boxPaddingBottomInnerLabel = 8.dp,
                boxPaddingTopOuterLabel = 8.dp,
                boxPaddingBottomOuterLabel = 8.dp,
                innerLabelPadding = 0.dp,
                outerLabelPadding = 6.dp,
                optionalPadding = 4.dp,
                helperTextPaddingInner = 8.dp,
                helperTextPaddingOuter = 4.dp,
                startContentEndPadding = 4.dp,
                endContentStartPadding = 4.dp,
                chipsPadding = 6.dp,
                chipsSpacing = 2.dp,
                boxMinHeight = 32.dp,
                alignmentLineHeight = 32.dp,
                iconSize = 16.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 6.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 2.dp,
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
        .singleLine(true)

internal val TextField.S: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = (-2).dp))
        .chipContainerShape(SddsServTheme.shapes.roundXxs)
        .helperTextPlacement(TextField.HelperTextPlacement.Outer)
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.S.Secondary.style(),
            ).style(),
        )
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 12.dp,
                boxPaddingEnd = 12.dp,
                boxPaddingTopInnerLabel = 4.dp,
                boxPaddingBottomInnerLabel = 4.dp,
                boxPaddingTopOuterLabel = 8.dp,
                boxPaddingBottomOuterLabel = 8.dp,
                innerLabelPadding = 0.dp,
                outerLabelPadding = 8.dp,
                optionalPadding = 4.dp,
                helperTextPaddingInner = 12.dp,
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
                    endLabelVerticalPadding = 4.dp,
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
        .singleLine(true)

internal val TextField.M: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(SddsServTheme.shapes.roundM)
        .chipContainerShape(SddsServTheme.shapes.roundXs)
        .helperTextPlacement(TextField.HelperTextPlacement.Outer)
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.M.Secondary.style(),
            ).style(),
        )
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 14.dp,
                boxPaddingEnd = 14.dp,
                boxPaddingTopInnerLabel = 6.dp,
                boxPaddingBottomInnerLabel = 6.dp,
                boxPaddingTopOuterLabel = 12.dp,
                boxPaddingBottomOuterLabel = 12.dp,
                innerLabelPadding = 2.dp,
                outerLabelPadding = 10.dp,
                optionalPadding = 4.dp,
                helperTextPaddingInner = 12.dp,
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
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 4.dp,
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
        .singleLine(true)

internal val TextField.L: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = 2.dp))
        .chipContainerShape(SddsServTheme.shapes.roundS)
        .helperTextPlacement(TextField.HelperTextPlacement.Outer)
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.L.Secondary.style(),
            ).style(),
        )
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 16.dp,
                boxPaddingEnd = 16.dp,
                boxPaddingTopInnerLabel = 9.dp,
                boxPaddingBottomInnerLabel = 9.dp,
                boxPaddingTopOuterLabel = 16.dp,
                boxPaddingBottomOuterLabel = 16.dp,
                innerLabelPadding = 2.dp,
                outerLabelPadding = 12.dp,
                optionalPadding = 4.dp,
                helperTextPaddingInner = 12.dp,
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
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 4.dp,
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
        .singleLine(true)

private val readOnlyAlpha: Float
    @Composable
    get() = if (isSystemInDarkTheme()) 0.02f else 0.01f

private val surfaceAlpha: Float
    @Composable
    get() = if (isSystemInDarkTheme()) 0.12f else 0.06f

@Composable
internal fun TextFieldColorsBuilder.defaultColors(): TextFieldColorsBuilder = apply {
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
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultTransparentPrimary
            .asInteractive(
                focused = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                pressed = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
            ),
    )
    backgroundColorReadOnly(
        SddsServTheme.colors.surfaceDefaultSolidDefault
            .copy(alpha = readOnlyAlpha)
            .asInteractive(),
    )
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}

@Composable
internal fun TextFieldColorsBuilder.successColors(): TextFieldColorsBuilder = apply {
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
        SddsServTheme.colors.textDefaultSecondary.asInteractive(
            focused = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultPositive.copy(alpha = surfaceAlpha)
            .asInteractive(
                focused = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                pressed = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
            ),
    )
    backgroundColorReadOnly(
        SddsServTheme.colors.surfaceDefaultSolidDefault
            .copy(alpha = readOnlyAlpha)
            .asInteractive(),
    )
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}

@Composable
internal fun TextFieldColorsBuilder.warningColors(): TextFieldColorsBuilder = apply {
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
        SddsServTheme.colors.textDefaultSecondary.asInteractive(
            focused = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultWarning.copy(alpha = surfaceAlpha)
            .asInteractive(
                focused = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                pressed = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
            ),
    )
    backgroundColorReadOnly(
        SddsServTheme.colors.surfaceDefaultSolidDefault
            .copy(alpha = readOnlyAlpha)
            .asInteractive(),
    )
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}

@Composable
internal fun TextFieldColorsBuilder.errorColors(): TextFieldColorsBuilder = apply {
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
        SddsServTheme.colors.textDefaultSecondary.asInteractive(
            focused = SddsServTheme.colors.textDefaultTertiary,
            pressed = SddsServTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(SddsServTheme.colors.textDefaultSecondary.asInteractive())
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultNegative.copy(alpha = surfaceAlpha)
            .asInteractive(
                focused = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                pressed = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
            ),
    )
    backgroundColorReadOnly(
        SddsServTheme.colors.surfaceDefaultSolidDefault
            .copy(alpha = readOnlyAlpha)
            .asInteractive(),
    )
    indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
}