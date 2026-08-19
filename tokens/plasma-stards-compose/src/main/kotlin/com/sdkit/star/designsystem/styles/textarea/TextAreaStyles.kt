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
import com.sdds.compose.uikit.adjustBy
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
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textInverseSecondary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultTransparentPrimary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.surfaceDefaultSolidDefault),
                    setOf(InteractiveState.Focused, InteractiveState.Activated) to
                        SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.surfaceDefaultSolidPrimary.multiplyAlpha(0.4f)),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.surfaceDefaultSolidPrimary.multiplyAlpha(0.4f)),
                ),
            )
        }
        .wrap(::WrapperTextAreaTerminate)

public val WrapperTextAreaView.Error: WrapperTextAreaTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                SolidColor(StarDsTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textInverseSecondary),
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
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.surfaceDefaultSolidDefault),
                    setOf(InteractiveState.Focused, InteractiveState.Activated) to
                        SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.surfaceDefaultSolidPrimary.multiplyAlpha(0.4f)),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.surfaceDefaultSolidPrimary.multiplyAlpha(0.4f)),
                ),
            )
        }
        .wrap(::WrapperTextAreaTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .captionPlacement(TextFieldHelperTextPlacement.Inner)
        .counterPlacement(TextFieldHelperTextPlacement.Inner)
        .captionStyle(StarDsTheme.typography.bodyXsNormal)
        .counterStyle(StarDsTheme.typography.bodyXsNormal)
        .singleLine(false)
        .dimensions {
            optionalPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_optional_padding))
        }
        .colors {
            cursorColor(SolidColor(StarDsTheme.colors.textDefaultAccentMain).asStatefulValue())
            startContentColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textOnLightSecondary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            startContentColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            endContentColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textOnLightSecondary),
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
            valueColor(
                SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textOnLightPrimary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultPrimary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultPrimary),
                ),
            )
            valueColorReadOnly(StarDsTheme.colors.textDefaultPrimary.asInteractive())
            captionColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            optionalColor(SolidColor(StarDsTheme.colors.textDefaultTertiary).asStatefulValue())
            counterColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textInverseSecondary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly, InteractiveState.Activated) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            counterColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            placeholderColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textOnLightSecondary),
                    setOf(InteractiveState.Activated, InteractiveState.Focused) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            placeholderColorReadOnly(StarDsTheme.colors.textDefaultSecondary.asInteractive())
            backgroundColorReadOnly(StarDsTheme.colors.surfaceDefaultSolidPrimary.multiplyAlpha(0.4f).asInteractive())
            indicatorColor(SolidColor(StarDsTheme.colors.surfaceDefaultNegative).asStatefulValue())
            prefixColor(
                SolidColor(StarDsTheme.colors.textDefaultTertiary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textOnLightTertiary),
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
                        to SolidColor(StarDsTheme.colors.textOnLightTertiary),
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
        .scrollBar {
            scrollBarThickness(dimensionResource(R.dimen.sdkit_cmp_text_area_scroll_bar_thickness))
            scrollBarPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_scroll_bar_padding_top))
            scrollBarPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_scroll_bar_padding_bottom))
            scrollBarPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_scroll_bar_padding_end))
            scrollBarTrackColor(StarDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
            scrollBarThumbColor(StarDsTheme.colors.surfaceDefaultTransparentTertiary.asInteractive())
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
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodyXsNormal)
        .placeholderStyle(StarDsTheme.typography.bodyXsNormal)
        .prefixStyle(StarDsTheme.typography.bodyXsNormal)
        .suffixStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_start_xs))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_end_xs))
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_xs))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_xs))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_helper_text_padding_xs))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_padding_xs))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_padding_xs))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_box_min_height_xs))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_alignment_min_height_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_size_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_size_xs))
        }
        .wrap(::WrapperTextAreaXs)

public val WrapperTextAreaXs.OuterLabel: WrapperTextAreaXsOuterLabel
    @Composable
    @JvmName("WrapperTextAreaXsOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_xs_outer_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_xs_outer_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_label_padding_xs_outer_label))
        }
        .colors {
            labelColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
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
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodySNormal)
        .placeholderStyle(StarDsTheme.typography.bodySNormal)
        .prefixStyle(StarDsTheme.typography.bodySNormal)
        .suffixStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_start_s))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_end_s))
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_s))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_s))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_helper_text_padding_s))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_padding_s))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_padding_s))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_box_min_height_s))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_alignment_min_height_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_size_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_size_s))
        }
        .wrap(::WrapperTextAreaS)

public val WrapperTextAreaS.OuterLabel: WrapperTextAreaSOuterLabel
    @Composable
    @JvmName("WrapperTextAreaSOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .optionalStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_label_padding_s_outer_label))
        }
        .colors {
            labelColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextAreaSOuterLabel)

public val WrapperTextAreaS.InnerLabel: WrapperTextAreaSInnerLabel
    @Composable
    @JvmName("WrapperTextAreaSInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_s_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_s_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_label_padding_s_inner_label))
        }
        .colors {
            labelColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textOnLightSecondary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            optionalColor(
                SolidColor(StarDsTheme.colors.textDefaultTertiary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textOnLightTertiary),
                    setOf(
                        InteractiveState.Activated,
                        InteractiveState.Focused,
                    ) to SolidColor(StarDsTheme.colors.textDefaultTertiary),
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
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(StarDsTheme.typography.bodyMNormal)
        .placeholderStyle(StarDsTheme.typography.bodyMNormal)
        .prefixStyle(StarDsTheme.typography.bodyMNormal)
        .suffixStyle(StarDsTheme.typography.bodyMNormal)
        .dimensions {
            boxPaddingStart(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_start_m))
            boxPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_end_m))
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_m))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_m))
            helperTextPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_helper_text_padding_m))
            startContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_padding_m))
            endContentPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_padding_m))
            boxMinHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_box_min_height_m))
            alignmentLineHeight(dimensionResource(R.dimen.sdkit_cmp_text_area_alignment_min_height_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_start_content_size_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_text_area_end_content_size_m))
        }
        .wrap(::WrapperTextAreaM)

public val WrapperTextAreaM.OuterLabel: WrapperTextAreaMOuterLabel
    @Composable
    @JvmName("WrapperTextAreaMOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .optionalStyle(StarDsTheme.typography.bodyMNormal)
        .dimensions {
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_label_padding_m_outer_label))
        }
        .colors {
            labelColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextAreaMOuterLabel)

public val WrapperTextAreaM.InnerLabel: WrapperTextAreaMInnerLabel
    @Composable
    @JvmName("WrapperTextAreaMInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .optionalStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_top_m_inner_label))
            boxPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_text_area_box_padding_bottom_m_inner_label))
            labelPadding(dimensionResource(R.dimen.sdkit_cmp_text_area_label_padding_m_inner_label))
        }
        .colors {
            labelColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textOnLightSecondary),
                    setOf(InteractiveState.Activated, InteractiveState.Focused) to
                        SolidColor(StarDsTheme.colors.textDefaultSecondary),
                ),
            )
            optionalColor(
                SolidColor(StarDsTheme.colors.textDefaultTertiary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textOnLightTertiary),
                    setOf(
                        InteractiveState.Focused,
                        InteractiveState.Activated,
                    ) to SolidColor(StarDsTheme.colors.textDefaultTertiary),
                ),
            )
        }
        .wrap(::WrapperTextAreaMInnerLabel)
