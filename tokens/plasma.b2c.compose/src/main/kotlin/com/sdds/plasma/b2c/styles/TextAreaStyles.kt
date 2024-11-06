package com.sdds.plasma.b2c.styles

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
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTheme

val TextArea.Xs: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(PlasmaB2cTheme.shapes.roundS)
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
                    startLabelHorizontalPadding = 4.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 2.dp,
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
        .singleLine(false)

val TextArea.S: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(PlasmaB2cTheme.shapes.roundM.adjustBy(all = (-2).dp))
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
                    startLabelHorizontalPadding = 4.dp,
                    startLabelVerticalPadding = 0.dp,
                    endLabelHorizontalPadding = 4.dp,
                    endLabelVerticalPadding = 4.dp,
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
        .singleLine(false)

val TextArea.M: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(PlasmaB2cTheme.shapes.roundM)
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
        .innerLabelStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .outerLabelStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .innerOptionalStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .outerOptionalStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .valueStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .captionStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .singleLine(false)

val TextArea.L: TextFieldStyleBuilder
    @Composable
    get() = TextFieldStyle.builder(this)
        .fieldAppearance(TextField.FieldAppearance.Solid)
        .shape(PlasmaB2cTheme.shapes.roundM.adjustBy(all = 2.dp))
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
        .innerLabelStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .outerLabelStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .innerOptionalStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .outerOptionalStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .valueStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .captionStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .singleLine(false)

private val scrollBar: ScrollBar
    @Composable
    get() = ScrollBar(
        indicatorThickness = 1.dp,
        indicatorColor = PlasmaB2cTheme.colors.surfaceDefaultTransparentTertiary,
        backgroundColor = PlasmaB2cTheme.colors.surfaceDefaultTransparentPrimary,
        padding = PaddingValues(top = 18.dp, end = 2.dp, bottom = 36.dp),
    )
