// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.textarea

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldSemanticState
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.TextFieldType
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
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
            startContentColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            valueColor(
                SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(TextFieldSemanticState.Readonly)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                ),
            )
            captionColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            placeholderColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        InteractiveState.Focused,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

public val WrapperTextAreaClearView.Error: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SolidColor(StarDsTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(
                        InteractiveState.Activated,
                        TextFieldSemanticState.Readonly,
                    ) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            valueColor(
                SolidColor(StarDsTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        TextFieldSemanticState.Readonly,
                    ) to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                ),
            )
            captionColor(
                SolidColor(StarDsTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(
                        InteractiveState.Activated,
                        TextFieldSemanticState.Readonly,
                    ) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            placeholderColor(
                SolidColor(StarDsTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(
                        InteractiveState.Activated,
                        TextFieldSemanticState.Readonly,
                    ) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
        .captionStyle(StarDsTheme.typography.bodyXsNormal)
        .counterStyle(StarDsTheme.typography.bodyXsNormal)
        .singleLine(false)
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_start))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_end))
            optionalPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_optional_padding))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_helper_text_padding))
        }
        .colors {
            cursorColor(SolidColor(StarDsTheme.colors.textDefaultAccentMain).asStatefulValue())
            startContentColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            endContentColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(InteractiveState.Pressed) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondaryHover),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary.multiplyAlpha(0.4f)),
                ),
            )
            endContentColorReadOnly(StarDsTheme.colors.textDefaultSecondary.multiplyAlpha(0.4f).asInteractive())
            valueColorReadOnly(StarDsTheme.colors.textDefaultPrimary.asInteractive())
            captionColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            optionalColor(SolidColor(StarDsTheme.colors.textDefaultTertiary).asStatefulValue())
            counterColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        InteractiveState.Focused,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(
                        InteractiveState.Activated,
                        TextFieldSemanticState.Readonly,
                    ) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            counterColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            placeholderColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            dividerColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(TextFieldSemanticState.Readonly)
                        to SolidColor(StarDsTheme.colors.surfaceDefaultTransparentPrimary),
                ),
            )
            dividerColorReadOnly(StarDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
            indicatorColor(SolidColor(StarDsTheme.colors.surfaceDefaultNegative).asStatefulValue())
            prefixColor(
                SolidColor(StarDsTheme.colors.textDefaultTertiary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        InteractiveState.Focused,
                    ) to SolidColor(StarDsTheme.colors.textDefaultTertiary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultTertiary),
                ),
            )
            suffixColor(
                SolidColor(StarDsTheme.colors.textDefaultTertiary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        InteractiveState.Focused,
                    ) to SolidColor(StarDsTheme.colors.textDefaultTertiary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultTertiary),
                ),
            )
            prefixColorReadOnly(StarDsTheme.colors.textDefaultTertiary.asInteractive())
            suffixColorReadOnly(StarDsTheme.colors.textDefaultTertiary.asInteractive())
        }

public val TextAreaClear.Xs: WrapperTextAreaClearXs
    @Composable
    @JvmName("WrapperTextAreaClearXs")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodyXsNormal)
        .placeholderStyle(StarDsTheme.typography.bodyXsNormal)
        .prefixStyle(StarDsTheme.typography.bodyXsNormal)
        .suffixStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_xs))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_xs))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_padding_xs))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_padding_xs))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_min_height_xs))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_alignment_min_height_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_size_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_size_xs))
        }
        .wrap(::WrapperTextAreaClearXs)

public val WrapperTextAreaClearXs.OuterLabel: WrapperTextAreaClearXsOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearXsOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_xs_outer_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_xs_outer_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_xs_outer_label))
        }
        .colors {
            labelColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextAreaClearXsOuterLabel)

public val TextAreaClear.S: WrapperTextAreaClearS
    @Composable
    @JvmName("WrapperTextAreaClearS")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodySNormal)
        .placeholderStyle(StarDsTheme.typography.bodySNormal)
        .prefixStyle(StarDsTheme.typography.bodySNormal)
        .suffixStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_s))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_s))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_padding_s))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_padding_s))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_min_height_s))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_alignment_min_height_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_size_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_size_s))
        }
        .wrap(::WrapperTextAreaClearS)

public val WrapperTextAreaClearS.OuterLabel: WrapperTextAreaClearSOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearSOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .optionalStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_s_outer_label))
        }
        .colors {
            labelColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextAreaClearSOuterLabel)

public val WrapperTextAreaClearS.InnerLabel: WrapperTextAreaClearSInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearSInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_s_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_s_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_s_inner_label))
        }
        .colors {
            labelColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        InteractiveState.Focused,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            optionalColor(
                SolidColor(StarDsTheme.colors.textDefaultTertiary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        InteractiveState.Focused,
                    ) to SolidColor(StarDsTheme.colors.textDefaultTertiary),
                ),
            )
        }
        .wrap(::WrapperTextAreaClearSInnerLabel)

public val TextAreaClear.M: WrapperTextAreaClearM
    @Composable
    @JvmName("WrapperTextAreaClearM")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodyMNormal)
        .placeholderStyle(StarDsTheme.typography.bodyMNormal)
        .prefixStyle(StarDsTheme.typography.bodyMNormal)
        .suffixStyle(StarDsTheme.typography.bodyMNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_m))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_m))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_padding_m))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_padding_m))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_min_height_m))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_alignment_min_height_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_size_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_size_m))
        }
        .wrap(::WrapperTextAreaClearM)

public val WrapperTextAreaClearM.OuterLabel: WrapperTextAreaClearMOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearMOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .optionalStyle(StarDsTheme.typography.bodyMNormal)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_m_outer_label))
        }
        .colors {
            labelColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextAreaClearMOuterLabel)

public val WrapperTextAreaClearM.InnerLabel: WrapperTextAreaClearMInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearMInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_m_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_m_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_m_inner_label))
        }
        .colors {
            labelColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        InteractiveState.Focused,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            optionalColor(
                SolidColor(StarDsTheme.colors.textDefaultTertiary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        InteractiveState.Focused,
                    ) to SolidColor(StarDsTheme.colors.textDefaultTertiary),
                ),
            )
        }
        .wrap(::WrapperTextAreaClearMInnerLabel)

public val TextAreaClear.L: WrapperTextAreaClearL
    @Composable
    @JvmName("WrapperTextAreaClearL")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodyLNormal)
        .placeholderStyle(StarDsTheme.typography.bodyLNormal)
        .prefixStyle(StarDsTheme.typography.bodyLNormal)
        .suffixStyle(StarDsTheme.typography.bodyLNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_l))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_l))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_padding_l))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_padding_l))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_min_height_l))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_alignment_min_height_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_start_content_size_l))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_end_content_size_l))
        }
        .wrap(::WrapperTextAreaClearL)

public val WrapperTextAreaClearL.OuterLabel: WrapperTextAreaClearLOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearLOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .optionalStyle(StarDsTheme.typography.bodyLNormal)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_l_outer_label))
        }
        .colors {
            labelColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextAreaClearLOuterLabel)

public val WrapperTextAreaClearL.InnerLabel: WrapperTextAreaClearLInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearLInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_top_l_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_box_padding_bottom_l_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_clear_label_padding_l_inner_label))
        }
        .colors {
            labelColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        InteractiveState.Focused,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            optionalColor(
                SolidColor(StarDsTheme.colors.textDefaultTertiary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultTertiary),
                ),
            )
        }
        .wrap(::WrapperTextAreaClearLInnerLabel)
