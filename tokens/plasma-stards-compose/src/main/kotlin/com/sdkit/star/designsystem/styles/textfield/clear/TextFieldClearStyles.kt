// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.textfield.clear

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.chip.EmbeddedChip
import com.sdkit.star.designsystem.styles.chip.L
import com.sdkit.star.designsystem.styles.chip.M
import com.sdkit.star.designsystem.styles.chip.S
import com.sdkit.star.designsystem.styles.chip.Secondary
import com.sdkit.star.designsystem.styles.chip.Xs
import com.sdkit.star.designsystem.styles.chip.group.ChipGroup
import com.sdkit.star.designsystem.styles.chip.group.Dense
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTextFieldClear : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTextFieldClearView : WrapperTextFieldClear

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTextFieldClearTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClear

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperTextFieldClearXs(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XsOuterLabel
 */
@JvmInline
public value class WrapperTextFieldClearXsOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTextFieldClearS(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации SOuterLabel
 */
@JvmInline
public value class WrapperTextFieldClearSOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации SInnerLabel
 */
@JvmInline
public value class WrapperTextFieldClearSInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTextFieldClearM(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации MOuterLabel
 */
@JvmInline
public value class WrapperTextFieldClearMOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации MInnerLabel
 */
@JvmInline
public value class WrapperTextFieldClearMInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTextFieldClearL(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации LOuterLabel
 */
@JvmInline
public value class WrapperTextFieldClearLOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации LInnerLabel
 */
@JvmInline
public value class WrapperTextFieldClearLInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

public val WrapperTextFieldClearView.Default: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .singleLine(true)
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
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Error: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .singleLine(true)
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
        .wrap(::WrapperTextFieldClearTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .singleLine(true)
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_start_TextFieldClear))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_end_TextFieldClear))
            optionalPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_optional_padding_TextFieldClear))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_helper_text_padding_TextFieldClear))
            chipsPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_chips_padding_TextFieldClear))
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
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            cursorColor(
                StarDsTheme.colors.textDefaultAccentMain.asInteractive(),
            )
            dividerColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(),
            )
            prefixColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            suffixColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
        }

public val TextFieldClear.Xs: WrapperTextFieldClearXs
    @Composable
    @JvmName("WrapperTextFieldClearXs")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .singleLine(true)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_xs))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_xs))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_min_height_xs))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_alignment_line_height_xs))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_padding_xs))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_padding_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_size_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_size_xs))
        }
        .valueStyle(StarDsTheme.typography.bodyXsNormal)
        .prefixStyle(StarDsTheme.typography.bodyXsNormal)
        .suffixStyle(StarDsTheme.typography.bodyXsNormal)
        .placeholderStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextFieldClearXs)

public val WrapperTextFieldClearXs.OuterLabel: WrapperTextFieldClearXsOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearXsOuterLabel")
    get() = builder
        .singleLine(true)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_xs_outer_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_xs_outer_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_xs_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldClearXsOuterLabel)

public val TextFieldClear.S: WrapperTextFieldClearS
    @Composable
    @JvmName("WrapperTextFieldClearS")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .singleLine(true)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_s))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_s))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_min_height_s))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_alignment_line_height_s))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_padding_s))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_padding_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_size_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_size_s))
        }
        .valueStyle(StarDsTheme.typography.bodySNormal)
        .prefixStyle(StarDsTheme.typography.bodySNormal)
        .suffixStyle(StarDsTheme.typography.bodySNormal)
        .placeholderStyle(StarDsTheme.typography.bodySNormal)
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextFieldClearS)

public val WrapperTextFieldClearS.OuterLabel: WrapperTextFieldClearSOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearSOuterLabel")
    get() = builder
        .singleLine(true)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_s_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .optionalStyle(StarDsTheme.typography.bodySNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldClearSOuterLabel)

public val WrapperTextFieldClearS.InnerLabel: WrapperTextFieldClearSInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearSInnerLabel")
    get() = builder
        .singleLine(true)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_s_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_s_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_s_inner_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            optionalColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
        }
        .wrap(::WrapperTextFieldClearSInnerLabel)

public val TextFieldClear.M: WrapperTextFieldClearM
    @Composable
    @JvmName("WrapperTextFieldClearM")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .singleLine(true)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_m))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_m))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_min_height_m))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_alignment_line_height_m))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_padding_m))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_padding_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_size_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_size_m))
        }
        .valueStyle(StarDsTheme.typography.bodyMNormal)
        .prefixStyle(StarDsTheme.typography.bodyMNormal)
        .suffixStyle(StarDsTheme.typography.bodyMNormal)
        .placeholderStyle(StarDsTheme.typography.bodyMNormal)
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextFieldClearM)

public val WrapperTextFieldClearM.OuterLabel: WrapperTextFieldClearMOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearMOuterLabel")
    get() = builder
        .singleLine(true)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_m_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .optionalStyle(StarDsTheme.typography.bodyMNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldClearMOuterLabel)

public val WrapperTextFieldClearM.InnerLabel: WrapperTextFieldClearMInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearMInnerLabel")
    get() = builder
        .singleLine(true)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_m_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_m_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_m_inner_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            optionalColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
        }
        .wrap(::WrapperTextFieldClearMInnerLabel)

public val TextFieldClear.L: WrapperTextFieldClearL
    @Composable
    @JvmName("WrapperTextFieldClearL")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .singleLine(true)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_l))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_l))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_min_height_l))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_alignment_line_height_l))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_padding_l))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_padding_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_size_l))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_size_l))
        }
        .valueStyle(StarDsTheme.typography.bodyLNormal)
        .prefixStyle(StarDsTheme.typography.bodyLNormal)
        .suffixStyle(StarDsTheme.typography.bodyLNormal)
        .placeholderStyle(StarDsTheme.typography.bodyLNormal)
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextFieldClearL)

public val WrapperTextFieldClearL.OuterLabel: WrapperTextFieldClearLOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearLOuterLabel")
    get() = builder
        .singleLine(true)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_l_outer_label))
        }
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .optionalStyle(StarDsTheme.typography.bodyLNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldClearLOuterLabel)

public val WrapperTextFieldClearL.InnerLabel: WrapperTextFieldClearLInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearLInnerLabel")
    get() = builder
        .singleLine(true)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_l_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_l_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_l_inner_label))
        }
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            optionalColor(
                StarDsTheme.colors.textDefaultTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
        }
        .wrap(::WrapperTextFieldClearLInnerLabel)
