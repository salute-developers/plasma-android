// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.TextFieldType
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
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
        .colors {
            startContentColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            valueColor(StarDsTheme.colors.textDefaultPrimary.asInteractive())
            captionColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
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
        .colors {
            startContentColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(InteractiveState.Activated) to
                        StarDsTheme.colors.textDefaultSecondary,
                ),
            )
            valueColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(InteractiveState.Activated) to
                        StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            captionColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(InteractiveState.Activated) to
                        StarDsTheme.colors.textDefaultSecondary,
                ),
            )
            placeholderColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(InteractiveState.Activated) to
                        StarDsTheme.colors.textDefaultSecondary,
                ),
            )
        }
        .wrap(::WrapperTextFieldClearTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
        .captionStyle(StarDsTheme.typography.bodyXsNormal)
        .counterStyle(StarDsTheme.typography.bodyXsNormal)
        .singleLine(true)
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_start))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_end))
            optionalPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_optional_padding))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_helper_text_padding))
        }
        .colors {
            cursorColor(StarDsTheme.colors.textDefaultAccentMain.asInteractive())
            startContentColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            endContentColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(InteractiveState.Pressed) to
                        StarDsTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                        StarDsTheme.colors.textDefaultSecondaryHover,
                ),
            )
            endContentColorReadOnly(StarDsTheme.colors.textDefaultSecondary.multiplyAlpha(0.4f).asInteractive())
            valueColorReadOnly(StarDsTheme.colors.textDefaultPrimary.asInteractive())
            captionColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            optionalColor(StarDsTheme.colors.textDefaultTertiary.asInteractive())
            counterColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            counterColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            placeholderColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            dividerColor(StarDsTheme.colors.surfaceDefaultClear.asInteractive())
            indicatorColor(StarDsTheme.colors.surfaceDefaultNegative.asInteractive())
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
            prefixColorReadOnly(StarDsTheme.colors.textDefaultTertiary.asInteractive())
            suffixColorReadOnly(StarDsTheme.colors.textDefaultTertiary.asInteractive())
        }

public val TextFieldClear.Xs: WrapperTextFieldClearXs
    @Composable
    @JvmName("WrapperTextFieldClearXs")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodyXsNormal)
        .placeholderStyle(StarDsTheme.typography.bodyXsNormal)
        .prefixStyle(StarDsTheme.typography.bodyXsNormal)
        .suffixStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_xs))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_xs))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_padding_xs))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_padding_xs))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_min_height_xs))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_alignment_min_height_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_size_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_size_xs))
        }
        .wrap(::WrapperTextFieldClearXs)

public val WrapperTextFieldClearXs.OuterLabel: WrapperTextFieldClearXsOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearXsOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_xs_outer_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_xs_outer_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_xs_outer_label))
        }
        .colors {
            labelColor(StarDsTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearXsOuterLabel)

public val TextFieldClear.S: WrapperTextFieldClearS
    @Composable
    @JvmName("WrapperTextFieldClearS")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodySNormal)
        .placeholderStyle(StarDsTheme.typography.bodySNormal)
        .prefixStyle(StarDsTheme.typography.bodySNormal)
        .suffixStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_s))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_s))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_padding_s))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_padding_s))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_min_height_s))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_alignment_min_height_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_size_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_size_s))
        }
        .wrap(::WrapperTextFieldClearS)

public val WrapperTextFieldClearS.OuterLabel: WrapperTextFieldClearSOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearSOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .optionalStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_s_outer_label))
        }
        .colors {
            labelColor(StarDsTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearSOuterLabel)

public val WrapperTextFieldClearS.InnerLabel: WrapperTextFieldClearSInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearSInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_s_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_s_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_s_inner_label))
        }
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
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodyMNormal)
        .placeholderStyle(StarDsTheme.typography.bodyMNormal)
        .prefixStyle(StarDsTheme.typography.bodyMNormal)
        .suffixStyle(StarDsTheme.typography.bodyMNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_m))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_m))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_padding_m))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_padding_m))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_min_height_m))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_alignment_min_height_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_size_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_size_m))
        }
        .wrap(::WrapperTextFieldClearM)

public val WrapperTextFieldClearM.OuterLabel: WrapperTextFieldClearMOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearMOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .optionalStyle(StarDsTheme.typography.bodyMNormal)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_m_outer_label))
        }
        .colors {
            labelColor(StarDsTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearMOuterLabel)

public val WrapperTextFieldClearM.InnerLabel: WrapperTextFieldClearMInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearMInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_m_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_m_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_m_inner_label))
        }
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
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodyLNormal)
        .placeholderStyle(StarDsTheme.typography.bodyLNormal)
        .prefixStyle(StarDsTheme.typography.bodyLNormal)
        .suffixStyle(StarDsTheme.typography.bodyLNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_l))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_l))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_padding_l))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_padding_l))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_min_height_l))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_alignment_min_height_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_start_content_size_l))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_end_content_size_l))
        }
        .wrap(::WrapperTextFieldClearL)

public val WrapperTextFieldClearL.OuterLabel: WrapperTextFieldClearLOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearLOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .optionalStyle(StarDsTheme.typography.bodyLNormal)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_l_outer_label))
        }
        .colors {
            labelColor(StarDsTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearLOuterLabel)

public val WrapperTextFieldClearL.InnerLabel: WrapperTextFieldClearLInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearLInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_top_l_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_box_padding_bottom_l_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_field_clear_label_padding_l_inner_label))
        }
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
