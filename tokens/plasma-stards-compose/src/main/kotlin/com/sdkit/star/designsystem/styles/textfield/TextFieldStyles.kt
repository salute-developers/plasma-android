// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.compose.uikit.textFieldBuilder
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.chip.M
import com.sdkit.star.designsystem.styles.chip.S
import com.sdkit.star.designsystem.styles.chip.Secondary
import com.sdkit.star.designsystem.styles.chip.Xs
import com.sdkit.star.designsystem.styles.chip.group.Dense
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperTextField : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

public interface WrapperTextFieldView : WrapperTextField

@JvmInline
public value class WrapperTextFieldDefaultViewTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextField

@JvmInline
public value class WrapperTextFieldErrorViewTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextField

@JvmInline
public value class WrapperTextFieldXs(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXsOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldS(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldSOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldSInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldM(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldMOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldMInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

public val WrapperTextFieldView.Default: WrapperTextFieldDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
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
        .wrap(::WrapperTextFieldDefaultViewTerminate)

public val WrapperTextFieldView.Error: WrapperTextFieldErrorViewTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
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
        .wrap(::WrapperTextFieldErrorViewTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .dimensions {
            optionalPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_optional_padding_TextField))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_helper_text_padding_TextField))
            chipsPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_chips_padding_TextField))
        }
        .captionStyle(StarDsTheme.typography.bodyXsNormal)
        .counterStyle(StarDsTheme.typography.bodyXsNormal)
        .chipGroupStyle(ChipGroup.Dense.style())
        .colors {
            optionalColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(),
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
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
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

public val TextField.Xs: WrapperTextFieldXs
    @Composable
    @JvmName("WrapperTextFieldXs")
    get() = TextFieldStyle.textFieldBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundS.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_text_field_shapeAdjustment_xs),
            ),
        )
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_start_xs))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_end_xs))
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_top_xs))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_bottom_xs))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_box_min_height_xs))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_alignment_line_height_xs))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_start_content_padding_xs))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_end_content_padding_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_start_content_size_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_end_content_size_xs))
        }
        .valueStyle(StarDsTheme.typography.bodyXsNormal)
        .prefixStyle(StarDsTheme.typography.bodyXsNormal)
        .suffixStyle(StarDsTheme.typography.bodyXsNormal)
        .placeholderStyle(StarDsTheme.typography.bodyXsNormal)
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextFieldXs)

public val WrapperTextFieldXs.OuterLabel: WrapperTextFieldXsOuterLabel
    @Composable
    @JvmName("WrapperTextFieldXsOuterLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_top_xs_outer_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_bottom_xs_outer_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_label_padding_xs_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldXsOuterLabel)

public val TextField.S: WrapperTextFieldS
    @Composable
    @JvmName("WrapperTextFieldS")
    get() = TextFieldStyle.textFieldBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_text_field_shapeAdjustment_s),
            ),
        )
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_start_s))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_end_s))
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_top_s))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_bottom_s))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_box_min_height_s))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_alignment_line_height_s))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_start_content_padding_s))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_end_content_padding_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_start_content_size_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_end_content_size_s))
        }
        .valueStyle(StarDsTheme.typography.bodySNormal)
        .prefixStyle(StarDsTheme.typography.bodySNormal)
        .suffixStyle(StarDsTheme.typography.bodySNormal)
        .placeholderStyle(StarDsTheme.typography.bodySNormal)
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextFieldS)

public val WrapperTextFieldS.OuterLabel: WrapperTextFieldSOuterLabel
    @Composable
    @JvmName("WrapperTextFieldSOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_label_padding_s_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .optionalStyle(StarDsTheme.typography.bodySNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldSOuterLabel)

public val WrapperTextFieldS.InnerLabel: WrapperTextFieldSInnerLabel
    @Composable
    @JvmName("WrapperTextFieldSInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_top_s_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_bottom_s_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_label_padding_s_inner_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightSecondary,
                ),
            )
            optionalColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightTertiary,
                ),
            )
        }
        .wrap(::WrapperTextFieldSInnerLabel)

public val TextField.M: WrapperTextFieldM
    @Composable
    @JvmName("WrapperTextFieldM")
    get() = TextFieldStyle.textFieldBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundM)
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_start_m))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_end_m))
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_top_m))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_bottom_m))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_box_min_height_m))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_alignment_line_height_m))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_start_content_padding_m))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_end_content_padding_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_start_content_size_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_end_content_size_m))
        }
        .valueStyle(StarDsTheme.typography.bodyMNormal)
        .prefixStyle(StarDsTheme.typography.bodyMNormal)
        .suffixStyle(StarDsTheme.typography.bodyMNormal)
        .placeholderStyle(StarDsTheme.typography.bodyMNormal)
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextFieldM)

public val WrapperTextFieldM.OuterLabel: WrapperTextFieldMOuterLabel
    @Composable
    @JvmName("WrapperTextFieldMOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_label_padding_m_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .optionalStyle(StarDsTheme.typography.bodyMNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldMOuterLabel)

public val WrapperTextFieldM.InnerLabel: WrapperTextFieldMInnerLabel
    @Composable
    @JvmName("WrapperTextFieldMInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_top_m_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_box_padding_bottom_m_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_label_padding_m_inner_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightSecondary,
                ),
            )
            optionalColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textOnLightTertiary,
                ),
            )
        }
        .wrap(::WrapperTextFieldMInnerLabel)
