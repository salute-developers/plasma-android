package com.sdds.plasma.sd.service.styles.textarea

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextAreaColorsBuilder
import com.sdds.compose.uikit.TextAreaStyleBuilder
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.textAreaBuilder
import com.sdds.plasma.sd.service.styles.chip.L
import com.sdds.plasma.sd.service.styles.chip.M
import com.sdds.plasma.sd.service.styles.chip.S
import com.sdds.plasma.sd.service.styles.chip.Secondary
import com.sdds.plasma.sd.service.styles.chip.Xs
import com.sdds.plasma.sd.service.styles.chip.group.Dense
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme

val TextAreaStyleBuilder.Default: TextAreaStyleBuilder
    @Composable
    get() = colors { defaultColors() }

val TextAreaStyleBuilder.Error: TextAreaStyleBuilder
    @Composable
    get() = colors { errorColors() }

val TextAreaStyleBuilder.Warning: TextAreaStyleBuilder
    @Composable
    get() = colors { warningColors() }

val TextAreaStyleBuilder.Success: TextAreaStyleBuilder
    @Composable
    get() = colors { successColors() }

val TextAreaStyleBuilder.RequiredStart: TextAreaStyleBuilder
    get() = fieldType(TextField.FieldType.RequiredStart)

val TextAreaStyleBuilder.RequiredEnd: TextAreaStyleBuilder
    get() = fieldType(TextField.FieldType.RequiredEnd)

val TextAreaStyleBuilder.Optional: TextAreaStyleBuilder
    get() = fieldType(TextField.FieldType.Optional)

val TextAreaStyleBuilder.InnerLabel: TextAreaStyleBuilder
    get() = labelPlacement(TextField.LabelPlacement.Inner)

val TextAreaStyleBuilder.OuterLabel: TextAreaStyleBuilder
    get() = labelPlacement(TextField.LabelPlacement.Outer)

val TextArea.Xs: TextAreaStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaBuilder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.Xs.Secondary.style(),
            ).style(),
        )
        .scrollBar(scrollBar)
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
                boxMinHeight = 32.dp,
                alignmentLineHeight = 32.dp,
                iconSize = 16.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 4.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 2.dp,
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

val TextArea.S: TextAreaStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaBuilder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = (-2).dp))
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.S.Secondary.style(),
            ).style(),
        )
        .scrollBar(scrollBar)
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 12.dp,
                boxPaddingEnd = 12.dp,
                boxPaddingTopInnerLabel = 4.dp,
                boxPaddingBottomInnerLabel = 12.dp,
                boxPaddingTopOuterLabel = 8.dp,
                boxPaddingBottomOuterLabel = 12.dp,
                innerLabelPadding = 0.dp,
                outerLabelPadding = 8.dp,
                optionalPadding = 4.dp,
                helperTextPaddingInner = 12.dp,
                helperTextPaddingOuter = 4.dp,
                startContentEndPadding = 4.dp,
                endContentStartPadding = 6.dp,
                chipsPadding = 6.dp,
                boxMinHeight = 40.dp,
                alignmentLineHeight = 40.dp,
                iconSize = 24.dp,
                indicatorDimensions = TextField.Dimensions.IndicatorDimensions(
                    startLabelHorizontalPadding = 4.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 4.dp,
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

val TextArea.M: TextAreaStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaBuilder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.M.Secondary.style(),
            ).style(),
        )
        .scrollBar(scrollBar)
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 14.dp,
                boxPaddingEnd = 14.dp,
                boxPaddingTopInnerLabel = 6.dp,
                boxPaddingBottomInnerLabel = 12.dp,
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
        .innerLabelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .outerLabelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .innerOptionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .outerOptionalStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .captionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyMNormal)

val TextArea.L: TextAreaStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaBuilder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = 2.dp))
        .chipGroupStyle(
            ChipGroup.Dense.chipStyle(
                EmbeddedChip.L.Secondary.style(),
            ).style(),
        )
        .scrollBar(scrollBar)
        .dimensions(
            TextField.Dimensions(
                boxPaddingStart = 16.dp,
                boxPaddingEnd = 16.dp,
                boxPaddingTopInnerLabel = 9.dp,
                boxPaddingBottomInnerLabel = 12.dp,
                boxPaddingTopOuterLabel = 16.dp,
                boxPaddingBottomOuterLabel = 12.dp,
                innerLabelPadding = 2.dp,
                outerLabelPadding = 12.dp,
                optionalPadding = 4.dp,
                helperTextPaddingInner = 12.dp,
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
                    fieldIndicatorSize = 8.dp,
                    labelIndicatorSize = 6.dp,
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

private val scrollBar: ScrollBar
    @Composable
    get() = ScrollBar(
        indicatorThickness = 1.dp,
        indicatorColor = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentTertiary,
        backgroundColor = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary,
        padding = PaddingValues(top = 18.dp, end = 2.dp, bottom = 36.dp),
    )

private val readOnlyAlpha: Float
    @Composable
    get() = if (isSystemInDarkTheme()) 0.02f else 0.01f

private val surfaceAlpha: Float
    @Composable
    get() = if (isSystemInDarkTheme()) 0.12f else 0.06f

@Composable
private fun TextAreaColorsBuilder.defaultColors(): TextAreaColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
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
            focused = PlasmaSdServiceTheme.colors.textDefaultTertiary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary
            .asInteractive(
                focused = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
                pressed = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
            ),
    )
    backgroundColorReadOnly(
        PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault
            .copy(alpha = readOnlyAlpha)
            .asInteractive(),
    )
    indicatorColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextAreaColorsBuilder.successColors(): TextAreaColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(PlasmaSdServiceTheme.colors.textDefaultAccent)
    startContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    endContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    valueColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
    valueColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
            focused = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaSdServiceTheme.colors.textDefaultTertiary)
    counterColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
            focused = PlasmaSdServiceTheme.colors.textDefaultTertiary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultPositive.copy(alpha = surfaceAlpha)
            .asInteractive(
                focused = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
                pressed = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
            ),
    )
    backgroundColorReadOnly(
        PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault
            .copy(alpha = readOnlyAlpha)
            .asInteractive(),
    )
    indicatorColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextAreaColorsBuilder.warningColors(): TextAreaColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(PlasmaSdServiceTheme.colors.textDefaultAccent)
    startContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    endContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    valueColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
    valueColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
            focused = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaSdServiceTheme.colors.textDefaultTertiary)
    counterColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
            focused = PlasmaSdServiceTheme.colors.textDefaultTertiary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultWarning.copy(alpha = surfaceAlpha)
            .asInteractive(
                focused = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
                pressed = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
            ),
    )
    backgroundColorReadOnly(
        PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault
            .copy(alpha = readOnlyAlpha)
            .asInteractive(),
    )
    indicatorColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative)
}

@Composable
private fun TextAreaColorsBuilder.errorColors(): TextAreaColorsBuilder = apply {
    disabledAlpha(0.4f)
    enabledAlpha(1f)
    cursorColor(PlasmaSdServiceTheme.colors.textDefaultAccent)
    startContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    endContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    innerLabelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    outerLabelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary)
    outerLabelColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    valueColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
    valueColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    captionColor(
        PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
            focused = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondary,
        ),
    )
    captionColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    optionalColor(PlasmaSdServiceTheme.colors.textDefaultTertiary)
    counterColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    placeholderColor(
        PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
            focused = PlasmaSdServiceTheme.colors.textDefaultTertiary,
            pressed = PlasmaSdServiceTheme.colors.textDefaultTertiary,
        ),
    )
    placeholderColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultNegative.copy(alpha = surfaceAlpha)
            .asInteractive(
                focused = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
                pressed = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
            ),
    )
    backgroundColorReadOnly(
        PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault
            .copy(alpha = readOnlyAlpha)
            .asInteractive(),
    )
    indicatorColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative)
}
