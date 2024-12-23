package com.sdds.serv.styles.textarea

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
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chip.S
import com.sdds.serv.styles.chip.Secondary
import com.sdds.serv.styles.chip.Xs
import com.sdds.serv.styles.chip.group.Dense
import com.sdds.serv.theme.SddsServTheme

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
        .shape(SddsServTheme.shapes.roundS)
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
        .innerLabelStyle(SddsServTheme.typography.bodyXxsNormal)
        .outerLabelStyle(SddsServTheme.typography.bodyXsNormal)
        .innerOptionalStyle(SddsServTheme.typography.bodyXxsNormal)
        .outerOptionalStyle(SddsServTheme.typography.bodyXsNormal)
        .valueStyle(SddsServTheme.typography.bodyXsNormal)
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodyXsNormal)
        .dropInnerLabel(true)

val TextArea.S: TextAreaStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaBuilder(this)
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = (-2).dp))
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
        .innerLabelStyle(SddsServTheme.typography.bodyXsNormal)
        .outerLabelStyle(SddsServTheme.typography.bodySNormal)
        .innerOptionalStyle(SddsServTheme.typography.bodyXsNormal)
        .outerOptionalStyle(SddsServTheme.typography.bodySNormal)
        .valueStyle(SddsServTheme.typography.bodySNormal)
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodySNormal)

val TextArea.M: TextAreaStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaBuilder(this)
        .shape(SddsServTheme.shapes.roundM)
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
        .innerLabelStyle(SddsServTheme.typography.bodyXsNormal)
        .outerLabelStyle(SddsServTheme.typography.bodyMNormal)
        .innerOptionalStyle(SddsServTheme.typography.bodyXsNormal)
        .outerOptionalStyle(SddsServTheme.typography.bodyMNormal)
        .valueStyle(SddsServTheme.typography.bodyMNormal)
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodyMNormal)

val TextArea.L: TextAreaStyleBuilder
    @Composable
    get() = TextFieldStyle.textAreaBuilder(this)
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = 2.dp))
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
        .innerLabelStyle(SddsServTheme.typography.bodyXsNormal)
        .outerLabelStyle(SddsServTheme.typography.bodyLNormal)
        .innerOptionalStyle(SddsServTheme.typography.bodyXsNormal)
        .outerOptionalStyle(SddsServTheme.typography.bodyLNormal)
        .valueStyle(SddsServTheme.typography.bodyLNormal)
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodyLNormal)

private val scrollBar: ScrollBar
    @Composable
    get() = ScrollBar(
        indicatorThickness = 1.dp,
        indicatorColor = SddsServTheme.colors.surfaceDefaultTransparentTertiary,
        backgroundColor = SddsServTheme.colors.surfaceDefaultTransparentPrimary,
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
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultTransparentPrimary
            .asInteractive(
                activated = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
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
private fun TextAreaColorsBuilder.successColors(): TextAreaColorsBuilder = apply {
    disabledAlpha(0.4f)
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
            activated = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
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
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultPositive.copy(alpha = surfaceAlpha)
            .asInteractive(
                activated = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
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
private fun TextAreaColorsBuilder.warningColors(): TextAreaColorsBuilder = apply {
    disabledAlpha(0.4f)
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
            activated = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
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
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultWarning.copy(alpha = surfaceAlpha)
            .asInteractive(
                activated = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
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
private fun TextAreaColorsBuilder.errorColors(): TextAreaColorsBuilder = apply {
    disabledAlpha(0.4f)
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
            activated = SddsServTheme.colors.textDefaultSecondary,
            pressed = SddsServTheme.colors.textDefaultSecondary,
        ),
    )
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
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultNegative.copy(alpha = surfaceAlpha)
            .asInteractive(
                activated = SddsServTheme.colors.surfaceDefaultTransparentSecondary,
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
