// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.textarea

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextAreaStyleBuilder
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.compose.uikit.textAreaBuilder
import com.sdkit.star.designsystem.R
import com.sdkit.star.designsystem.styles.chip.M
import com.sdkit.star.designsystem.styles.chip.S
import com.sdkit.star.designsystem.styles.chip.Secondary
import com.sdkit.star.designsystem.styles.chip.Xs
import com.sdkit.star.designsystem.styles.chip.group.Dense
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperTextArea : BuilderWrapper<TextFieldStyle, TextAreaStyleBuilder>

public interface WrapperTextAreaView : WrapperTextArea

@JvmInline
public value class WrapperTextAreaDefaultViewTerminate(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextArea

@JvmInline
public value class WrapperTextAreaErrorViewTerminate(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextArea

@JvmInline
public value class WrapperTextAreaXs(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

@JvmInline
public value class WrapperTextAreaXsOuterLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

@JvmInline
public value class WrapperTextAreaS(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

@JvmInline
public value class WrapperTextAreaSOuterLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

@JvmInline
public value class WrapperTextAreaSInnerLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

@JvmInline
public value class WrapperTextAreaM(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

@JvmInline
public value class WrapperTextAreaMOuterLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

@JvmInline
public value class WrapperTextAreaMInnerLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

public val WrapperTextAreaView.Default: WrapperTextAreaDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInverseSecondary,
                ),
            )
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.surfaceDefaultSolidDefault,
                    setOf(InteractiveState.Activated)
                        to StarDsTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextAreaDefaultViewTerminate)

public val WrapperTextAreaView.Error: WrapperTextAreaErrorViewTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInverseSecondary,
                    setOf(InteractiveState.Activated)
                        to StarDsTheme.colors.textDefaultSecondary,
                ),
            )
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.surfaceDefaultSolidDefault,
                    setOf(InteractiveState.Activated)
                        to StarDsTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextAreaErrorViewTerminate)

private val TextAreaStyleBuilder.invariantProps: TextAreaStyleBuilder
    @Composable
    get() = this
        .dimensions {
            optionalPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_optional_padding_TextArea))
            chipsPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_chips_padding_TextArea))
        }
        .captionStyle(StarDsTheme.typography.bodyXsNormal)
        .counterStyle(StarDsTheme.typography.bodyXsNormal)
        .chipGroupStyle(ChipGroup.Dense.style())
        .colors {
            optionalColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightTertiary,
                ),
            )
            valueColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightPrimary,
                ),
            )
            placeholderColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightSecondary,
                ),
            )
            indicatorColor(
                StarDsTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightSecondary,
                ),
            )
            endContentColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightSecondary,
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultSecondaryHover,
                ),
            )
            endContentColorReadOnly(
                StarDsTheme.colors.textDefaultSecondary.multiplyAlpha(0.4f).asInteractive(),
            )
            captionColorReadOnly(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            counterColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInverseSecondary,
                ),
            )
            backgroundColorReadOnly(
                StarDsTheme.colors.surfaceDefaultSolidPrimary.multiplyAlpha(0.4f).asInteractive(),
            )
            cursorColor(
                StarDsTheme.colors.textDefaultAccentMain.asInteractive(),
            )
            prefixColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightTertiary,
                ),
            )
            suffixColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightTertiary,
                ),
            )
        }
        .scrollBar {
            scrollBarThickness(dimensionResource(R.dimen.sdkit_cmp_text_area_scroll_bar_thickness_TextArea))
            scrollBarPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_scroll_bar_padding_top_TextArea))
            scrollBarPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_scroll_bar_padding_bottom_TextArea))
            scrollBarPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_scroll_bar_padding_end_TextArea))
            scrollBarTrackColor(
                StarDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            scrollBarThumbColor(
                StarDsTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }

public val TextArea.Xs: WrapperTextAreaXs
    @Composable
    @JvmName("WrapperTextAreaXs")
    get() = TextFieldStyle.textAreaBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundS.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_text_area_shapeAdjustment_xs),
            ),
        )
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_start_xs))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_end_xs))
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_xs))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_xs))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_box_min_height_xs))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_alignment_line_height_xs))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_helper_text_padding_xs))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_padding_xs))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_padding_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_size_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_size_xs))
        }
        .valueStyle(StarDsTheme.typography.bodyXsNormal)
        .prefixStyle(StarDsTheme.typography.bodyXsNormal)
        .suffixStyle(StarDsTheme.typography.bodyXsNormal)
        .placeholderStyle(StarDsTheme.typography.bodyXsNormal)
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaXs)

public val WrapperTextAreaXs.OuterLabel: WrapperTextAreaXsOuterLabel
    @Composable
    @JvmName("WrapperTextAreaXsOuterLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_xs_outer_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_xs_outer_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_label_padding_xs_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaXsOuterLabel)

public val TextArea.S: WrapperTextAreaS
    @Composable
    @JvmName("WrapperTextAreaS")
    get() = TextFieldStyle.textAreaBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_text_area_shapeAdjustment_s),
            ),
        )
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_start_s))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_end_s))
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_s))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_s))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_box_min_height_s))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_alignment_line_height_s))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_helper_text_padding_s))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_padding_s))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_padding_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_size_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_size_s))
        }
        .valueStyle(StarDsTheme.typography.bodySNormal)
        .prefixStyle(StarDsTheme.typography.bodySNormal)
        .suffixStyle(StarDsTheme.typography.bodySNormal)
        .placeholderStyle(StarDsTheme.typography.bodySNormal)
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaS)

public val WrapperTextAreaS.OuterLabel: WrapperTextAreaSOuterLabel
    @Composable
    @JvmName("WrapperTextAreaSOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_label_padding_s_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .optionalStyle(StarDsTheme.typography.bodySNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaSOuterLabel)

public val WrapperTextAreaS.InnerLabel: WrapperTextAreaSInnerLabel
    @Composable
    @JvmName("WrapperTextAreaSInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_s_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_s_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_label_padding_s_inner_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaSInnerLabel)

public val TextArea.M: WrapperTextAreaM
    @Composable
    @JvmName("WrapperTextAreaM")
    get() = TextFieldStyle.textAreaBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundM)
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_start_m))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_end_m))
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_m))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_m))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_box_min_height_m))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_alignment_line_height_m))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_helper_text_padding_m))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_padding_m))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_padding_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_size_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_size_m))
        }
        .valueStyle(StarDsTheme.typography.bodyMNormal)
        .prefixStyle(StarDsTheme.typography.bodyMNormal)
        .suffixStyle(StarDsTheme.typography.bodyMNormal)
        .placeholderStyle(StarDsTheme.typography.bodyMNormal)
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaM)

public val WrapperTextAreaM.OuterLabel: WrapperTextAreaMOuterLabel
    @Composable
    @JvmName("WrapperTextAreaMOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_label_padding_m_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .optionalStyle(StarDsTheme.typography.bodyMNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaMOuterLabel)

public val WrapperTextAreaM.InnerLabel: WrapperTextAreaMInnerLabel
    @Composable
    @JvmName("WrapperTextAreaMInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_m_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_m_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_label_padding_m_inner_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaMInnerLabel)
