package com.sdds.playground.sandbox.textfield

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.playground.sandbox.chip.L
import com.sdds.playground.sandbox.chip.M
import com.sdds.playground.sandbox.chip.S
import com.sdds.playground.sandbox.chip.Secondary
import com.sdds.playground.sandbox.chip.Xs
import com.sdds.playground.sandbox.chip.group.Dense
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

internal val TextArea.Xs: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(SddsServTheme.shapes.roundS)
        .chipContainerShape(SddsServTheme.shapes.roundXxs.adjustBy(all = (-2).dp))
        .helperTextPlacement(TextField.HelperTextPlacement.Inner)
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
        .singleLine(false)

internal val TextArea.S: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = (-2).dp))
        .chipContainerShape(SddsServTheme.shapes.roundXxs)
        .helperTextPlacement(TextField.HelperTextPlacement.Inner)
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
        .singleLine(false)

internal val TextArea.M: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(SddsServTheme.shapes.roundM)
        .chipContainerShape(SddsServTheme.shapes.roundXs)
        .helperTextPlacement(TextField.HelperTextPlacement.Inner)
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
        .singleLine(false)

internal val TextArea.L: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = 2.dp))
        .chipContainerShape(SddsServTheme.shapes.roundS)
        .helperTextPlacement(TextField.HelperTextPlacement.Inner)
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
        .singleLine(false)

private val scrollBar: ScrollBar
    @Composable
    get() = ScrollBar(
        indicatorThickness = 1.dp,
        indicatorColor = SddsServTheme.colors.surfaceDefaultTransparentTertiary,
        backgroundColor = SddsServTheme.colors.surfaceDefaultTransparentPrimary,
        padding = PaddingValues(top = 18.dp, end = 2.dp, bottom = 36.dp),
    )
