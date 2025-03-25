// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.textarea

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.adjustBy
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
public interface WrapperTextArea : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTextAreaView : WrapperTextArea

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTextAreaTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextArea

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperTextAreaXs(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации XsOuterLabel
 */
@JvmInline
public value class WrapperTextAreaXsOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTextAreaS(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации SOuterLabel
 */
@JvmInline
public value class WrapperTextAreaSOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации SInnerLabel
 */
@JvmInline
public value class WrapperTextAreaSInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTextAreaM(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации MOuterLabel
 */
@JvmInline
public value class WrapperTextAreaMOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации MInnerLabel
 */
@JvmInline
public value class WrapperTextAreaMInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

public val WrapperTextAreaView.Default: WrapperTextAreaTerminate
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
        .wrap(::WrapperTextAreaTerminate)

public val WrapperTextAreaView.Error: WrapperTextAreaTerminate
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
        .wrap(::WrapperTextAreaTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .singleLine(false)
        .dimensions {
            optionalPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_optional_padding_TextArea))
            chipsPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_chips_padding_TextArea))
        }
        .captionStyle(StarDsTheme.typography.bodyXsNormal)
        .counterStyle(StarDsTheme.typography.bodyXsNormal)
        .chipGroupStyle(ChipGroup.Dense.style())
        .captionPlacement(TextFieldHelperTextPlacement.Inner)
        .counterPlacement(TextFieldHelperTextPlacement.Inner)
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
    get() = TextFieldStyle.builder(this)
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
        .labelPlacement(TextFieldLabelPlacement.None)
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
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaXsOuterLabel)

public val TextArea.S: WrapperTextAreaS
    @Composable
    @JvmName("WrapperTextAreaS")
    get() = TextFieldStyle.builder(this)
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
        .labelPlacement(TextFieldLabelPlacement.None)
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
        .labelPlacement(TextFieldLabelPlacement.Outer)
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
        .labelPlacement(TextFieldLabelPlacement.Inner)
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
        .wrap(::WrapperTextAreaSInnerLabel)

public val TextArea.M: WrapperTextAreaM
    @Composable
    @JvmName("WrapperTextAreaM")
    get() = TextFieldStyle.builder(this)
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
        .labelPlacement(TextFieldLabelPlacement.None)
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
        .labelPlacement(TextFieldLabelPlacement.Outer)
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
        .labelPlacement(TextFieldLabelPlacement.Inner)
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
        .wrap(::WrapperTextAreaMInnerLabel)
