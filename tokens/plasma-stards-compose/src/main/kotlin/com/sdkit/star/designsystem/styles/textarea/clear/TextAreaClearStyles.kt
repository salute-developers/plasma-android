// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.textarea.clear

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
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
import com.sdkit.star.designsystem.styles.chip.group.ChipGroup
import com.sdkit.star.designsystem.styles.chip.group.Dense
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTextAreaClear : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTextAreaClearView : WrapperTextAreaClear

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTextAreaClearTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClear

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperTextAreaClearXs(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XsOuterLabel
 */
@JvmInline
public value class WrapperTextAreaClearXsOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTextAreaClearS(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации SOuterLabel
 */
@JvmInline
public value class WrapperTextAreaClearSOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации SInnerLabel
 */
@JvmInline
public value class WrapperTextAreaClearSInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTextAreaClearM(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации MOuterLabel
 */
@JvmInline
public value class WrapperTextAreaClearMOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации MInnerLabel
 */
@JvmInline
public value class WrapperTextAreaClearMInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTextAreaClearL(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации LOuterLabel
 */
@JvmInline
public value class WrapperTextAreaClearLOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации LInnerLabel
 */
@JvmInline
public value class WrapperTextAreaClearLInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

public val WrapperTextAreaClearView.Default: WrapperTextAreaClearTerminate
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
        .wrap(::WrapperTextAreaClearTerminate)

public val WrapperTextAreaClearView.Error: WrapperTextAreaClearTerminate
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
        .wrap(::WrapperTextAreaClearTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .singleLine(false)
        .helperTextPlacement(TextFieldHelperTextPlacement.Outer)
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_start_TextAreaClear))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_end_TextAreaClear))
            optionalPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_optional_padding_TextAreaClear))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_helper_text_padding_TextAreaClear))
            chipsPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_chips_padding_TextAreaClear))
            chipsPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_chips_padding_start_TextAreaClear))
            chipsPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_chips_padding_end_TextAreaClear))
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
            dividerColorReadOnly(
                StarDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
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

public val TextAreaClear.Xs: WrapperTextAreaClearXs
    @Composable
    @JvmName("WrapperTextAreaClearXs")
    get() = TextFieldStyle.builder(this)
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
        .labelPlacement(TextFieldLabelPlacement.None)
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
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearXsOuterLabel)

public val TextAreaClear.S: WrapperTextAreaClearS
    @Composable
    @JvmName("WrapperTextAreaClearS")
    get() = TextFieldStyle.builder(this)
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
        .labelPlacement(TextFieldLabelPlacement.None)
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
        .labelPlacement(TextFieldLabelPlacement.Outer)
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
        .wrap(::WrapperTextAreaClearSInnerLabel)

public val TextAreaClear.M: WrapperTextAreaClearM
    @Composable
    @JvmName("WrapperTextAreaClearM")
    get() = TextFieldStyle.builder(this)
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
        .labelPlacement(TextFieldLabelPlacement.None)
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
        .labelPlacement(TextFieldLabelPlacement.Outer)
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
        .wrap(::WrapperTextAreaClearMInnerLabel)

public val TextAreaClear.L: WrapperTextAreaClearL
    @Composable
    @JvmName("WrapperTextAreaClearL")
    get() = TextFieldStyle.builder(this)
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
        .labelPlacement(TextFieldLabelPlacement.None)
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
        .labelPlacement(TextFieldLabelPlacement.Outer)
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
        .wrap(::WrapperTextAreaClearLInnerLabel)
