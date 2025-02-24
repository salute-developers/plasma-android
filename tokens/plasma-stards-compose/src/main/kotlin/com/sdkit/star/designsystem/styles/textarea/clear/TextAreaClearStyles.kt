// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.textarea.clear

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextAreaClear
import com.sdds.compose.uikit.TextAreaClearStyleBuilder
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.compose.uikit.textAreaClearBuilder
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.chip.L
import com.sdkit.star.designsystem.styles.chip.M
import com.sdkit.star.designsystem.styles.chip.S
import com.sdkit.star.designsystem.styles.chip.Secondary
import com.sdkit.star.designsystem.styles.chip.Xs
import com.sdkit.star.designsystem.styles.chip.group.Dense
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperTextAreaClear : BuilderWrapper<TextFieldStyle, TextAreaClearStyleBuilder>

public interface WrapperTextAreaClearView : WrapperTextAreaClear

@JvmInline
public value class WrapperTextAreaClearDefaultViewTerminate(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClear

@JvmInline
public value class WrapperTextAreaClearErrorViewTerminate(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClear

@JvmInline
public value class WrapperTextAreaClearXs(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

@JvmInline
public value class WrapperTextAreaClearXsOuterLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

@JvmInline
public value class WrapperTextAreaClearS(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

@JvmInline
public value class WrapperTextAreaClearSOuterLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

@JvmInline
public value class WrapperTextAreaClearSInnerLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

@JvmInline
public value class WrapperTextAreaClearM(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

@JvmInline
public value class WrapperTextAreaClearMOuterLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

@JvmInline
public value class WrapperTextAreaClearMInnerLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

@JvmInline
public value class WrapperTextAreaClearL(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

@JvmInline
public value class WrapperTextAreaClearLOuterLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

@JvmInline
public value class WrapperTextAreaClearLInnerLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

public val WrapperTextAreaClearView.Default: WrapperTextAreaClearDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            captionColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearDefaultViewTerminate)

public val WrapperTextAreaClearView.Error: WrapperTextAreaClearErrorViewTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(InteractiveState.Activated)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(InteractiveState.Activated)
                        to StarDsTheme.colors.textDefaultSecondary,
                ),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(InteractiveState.Activated)
                        to StarDsTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(InteractiveState.Activated)
                        to StarDsTheme.colors.textDefaultSecondary,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearErrorViewTerminate)

private val TextAreaClearStyleBuilder.invariantProps: TextAreaClearStyleBuilder
    @Composable
    get() = this
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_start_TextAreaClear))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_end_TextAreaClear))
            optionalPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_optional_padding_TextAreaClear))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_helper_text_padding_TextAreaClear))
            chipsPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_chips_padding_TextAreaClear))
        }
        .captionStyle(StarDsTheme.typography.bodyXsNormal)
        .counterStyle(StarDsTheme.typography.bodyXsNormal)
        .chipGroupStyle(ChipGroup.Dense.style())
        .colors {
            optionalColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(),
            )
            valueColorReadOnly(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColorReadOnly(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            indicatorColor(
                StarDsTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColorReadOnly(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            endContentColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
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
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            cursorColor(
                StarDsTheme.colors.textDefaultAccentMain.asInteractive(),
            )
            dividerColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(),
            )
            dividerColorReadOnly(
                StarDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            prefixColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInverseTertiary,
                ),
            )
            suffixColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInverseTertiary,
                ),
            )
        }

public val TextAreaClear.Xs: WrapperTextAreaClearXs
    @Composable
    @JvmName("WrapperTextAreaClearXs")
    get() = TextFieldStyle.textAreaClearBuilder(this)
        .invariantProps
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_xs))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_xs))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_min_height_xs))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_alignment_line_height_xs))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_padding_xs))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_padding_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_size_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_size_xs))
        }
        .valueStyle(StarDsTheme.typography.bodyXsNormal)
        .prefixStyle(StarDsTheme.typography.bodyXsNormal)
        .suffixStyle(StarDsTheme.typography.bodyXsNormal)
        .placeholderStyle(StarDsTheme.typography.bodyXsNormal)
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaClearXs)

public val WrapperTextAreaClearXs.OuterLabel: WrapperTextAreaClearXsOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearXsOuterLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_xs_outer_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_xs_outer_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_xs_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearXsOuterLabel)

public val TextAreaClear.S: WrapperTextAreaClearS
    @Composable
    @JvmName("WrapperTextAreaClearS")
    get() = TextFieldStyle.textAreaClearBuilder(this)
        .invariantProps
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_s))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_s))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_min_height_s))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_alignment_line_height_s))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_padding_s))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_padding_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_size_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_size_s))
        }
        .valueStyle(StarDsTheme.typography.bodySNormal)
        .prefixStyle(StarDsTheme.typography.bodySNormal)
        .suffixStyle(StarDsTheme.typography.bodySNormal)
        .placeholderStyle(StarDsTheme.typography.bodySNormal)
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaClearS)

public val WrapperTextAreaClearS.OuterLabel: WrapperTextAreaClearSOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearSOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_s_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .optionalStyle(StarDsTheme.typography.bodySNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearSOuterLabel)

public val WrapperTextAreaClearS.InnerLabel: WrapperTextAreaClearSInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearSInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_s_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_s_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_s_inner_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearSInnerLabel)

public val TextAreaClear.M: WrapperTextAreaClearM
    @Composable
    @JvmName("WrapperTextAreaClearM")
    get() = TextFieldStyle.textAreaClearBuilder(this)
        .invariantProps
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_m))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_m))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_min_height_m))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_alignment_line_height_m))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_padding_m))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_padding_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_size_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_size_m))
        }
        .valueStyle(StarDsTheme.typography.bodyMNormal)
        .prefixStyle(StarDsTheme.typography.bodyMNormal)
        .suffixStyle(StarDsTheme.typography.bodyMNormal)
        .placeholderStyle(StarDsTheme.typography.bodyMNormal)
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaClearM)

public val WrapperTextAreaClearM.OuterLabel: WrapperTextAreaClearMOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearMOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_m_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .optionalStyle(StarDsTheme.typography.bodyMNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearMOuterLabel)

public val WrapperTextAreaClearM.InnerLabel: WrapperTextAreaClearMInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearMInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_m_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_m_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_m_inner_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearMInnerLabel)

public val TextAreaClear.L: WrapperTextAreaClearL
    @Composable
    @JvmName("WrapperTextAreaClearL")
    get() = TextFieldStyle.textAreaClearBuilder(this)
        .invariantProps
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_l))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_l))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_min_height_l))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_alignment_line_height_l))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_padding_l))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_padding_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_size_l))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_size_l))
        }
        .valueStyle(StarDsTheme.typography.bodyLNormal)
        .prefixStyle(StarDsTheme.typography.bodyLNormal)
        .suffixStyle(StarDsTheme.typography.bodyLNormal)
        .placeholderStyle(StarDsTheme.typography.bodyLNormal)
        .chipStyle(EmbeddedChip.L.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaClearL)

public val WrapperTextAreaClearL.OuterLabel: WrapperTextAreaClearLOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearLOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_l_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .optionalStyle(StarDsTheme.typography.bodyLNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearLOuterLabel)

public val WrapperTextAreaClearL.InnerLabel: WrapperTextAreaClearLInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearLInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_l_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_l_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_l_inner_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearLInnerLabel)
