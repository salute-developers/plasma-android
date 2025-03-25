// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.textarea

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
import com.sdds.compose.uikit.TextFieldIndicatorAlignmentMode
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.TextFieldType
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.styles.chip.EmbeddedChip
import com.sdds.stylessalute.styles.chip.L
import com.sdds.stylessalute.styles.chip.M
import com.sdds.stylessalute.styles.chip.S
import com.sdds.stylessalute.styles.chip.Secondary
import com.sdds.stylessalute.styles.chip.Xs
import com.sdds.stylessalute.styles.chip.group.ChipGroup
import com.sdds.stylessalute.styles.chip.group.Dense
import com.sdds.stylessalute.theme.StylesSaluteTheme
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
 * Обертка для вариации XsRequiredStart
 */
@JvmInline
public value class WrapperTextAreaXsRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации XsRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaXsRequiredEnd(
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
 * Обертка для вариации XsOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaXsOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации XsOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaXsOuterLabelRequiredEnd(
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
 * Обертка для вариации SRequiredStart
 */
@JvmInline
public value class WrapperTextAreaSRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации SRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaSRequiredEnd(
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
 * Обертка для вариации SOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaSOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации SOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaSOuterLabelRequiredEnd(
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
 * Обертка для вариации SInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaSInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации SInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaSInnerLabelRequiredEnd(
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
 * Обертка для вариации MRequiredStart
 */
@JvmInline
public value class WrapperTextAreaMRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации MRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaMRequiredEnd(
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
 * Обертка для вариации MOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaMOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации MOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaMOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации MInnerLabel
 */
@JvmInline
public value class WrapperTextAreaMInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации MInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaMInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации MInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaMInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTextAreaL(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации LRequiredStart
 */
@JvmInline
public value class WrapperTextAreaLRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации LRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaLRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации LOuterLabel
 */
@JvmInline
public value class WrapperTextAreaLOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации LOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaLOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации LOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaLOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации LInnerLabel
 */
@JvmInline
public value class WrapperTextAreaLInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации LInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaLInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

/**
 * Обертка для вариации LInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaLInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaView

public val WrapperTextAreaView.Default: WrapperTextAreaTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextAreaTerminate)

public val WrapperTextAreaView.Warning: WrapperTextAreaTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultSecondary,
                ),
            )
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextAreaTerminate)

public val WrapperTextAreaView.Error: WrapperTextAreaTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultSecondary,
                ),
            )
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextAreaTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .singleLine(false)
        .dimensions {
            optionalPadding(4.0.dp)
            chipsPadding(6.0.dp)
        }
        .captionStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .counterStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .chipGroupStyle(ChipGroup.Dense.style())
        .captionPlacement(TextFieldHelperTextPlacement.Inner)
        .counterPlacement(TextFieldHelperTextPlacement.Inner)
        .colors {
            optionalColor(
                StylesSaluteTheme.colors.textDefaultTertiary.asInteractive(),
            )
            valueColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultTertiary,
                ),
            )
            indicatorColor(
                StylesSaluteTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
            endContentColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultSecondaryHover,
                ),
            )
            endContentColorReadOnly(
                StylesSaluteTheme.colors.textDefaultSecondary.multiplyAlpha(0.4f).asInteractive(),
            )
            captionColorReadOnly(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
            counterColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
            backgroundColorReadOnly(
                StylesSaluteTheme.colors.surfaceDefaultSolidPrimary.multiplyAlpha(0.4f).asInteractive(),
            )
            cursorColor(
                StylesSaluteTheme.colors.textDefaultAccentMain.asInteractive(),
            )
            prefixColor(
                StylesSaluteTheme.colors.textDefaultTertiary.asInteractive(),
            )
            suffixColor(
                StylesSaluteTheme.colors.textDefaultTertiary.asInteractive(),
            )
        }
        .scrollBar {
            scrollBarThickness(2.0.dp)
            scrollBarPaddingTop(18.0.dp)
            scrollBarPaddingBottom(36.0.dp)
            scrollBarPaddingEnd(2.0.dp)
            scrollBarTrackColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            scrollBarThumbColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }

public val TextArea.Xs: WrapperTextAreaXs
    @Composable
    @JvmName("WrapperTextAreaXs")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundS.adjustBy(all = 0.0.dp))
        .dimensions {
            boxPaddingStart(8.0.dp)
            boxPaddingEnd(8.0.dp)
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            boxMinHeight(32.0.dp)
            alignmentLineHeight(32.0.dp)
            helperTextPadding(8.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(4.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
        }
        .valueStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .prefixStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .suffixStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .placeholderStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextAreaXs)

public val WrapperTextAreaXs.RequiredStart: WrapperTextAreaXsRequiredStart
    @Composable
    @JvmName("WrapperTextAreaXsRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaXsRequiredStart)

public val WrapperTextAreaXs.RequiredEnd: WrapperTextAreaXsRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaXsRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaXsRequiredEnd)

public val WrapperTextAreaXs.OuterLabel: WrapperTextAreaXsOuterLabel
    @Composable
    @JvmName("WrapperTextAreaXsOuterLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            labelPadding(6.0.dp)
        }
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaXsOuterLabel)

public val WrapperTextAreaXsOuterLabel.RequiredStart: WrapperTextAreaXsOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaXsOuterLabelRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaXsOuterLabelRequiredStart)

public val WrapperTextAreaXsOuterLabel.RequiredEnd: WrapperTextAreaXsOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaXsOuterLabelRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(2.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaXsOuterLabelRequiredEnd)

public val TextArea.S: WrapperTextAreaS
    @Composable
    @JvmName("WrapperTextAreaS")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            boxPaddingStart(12.0.dp)
            boxPaddingEnd(12.0.dp)
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(12.0.dp)
            boxMinHeight(40.0.dp)
            alignmentLineHeight(40.0.dp)
            helperTextPadding(12.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(6.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .valueStyle(StylesSaluteTheme.typography.bodySNormal)
        .prefixStyle(StylesSaluteTheme.typography.bodySNormal)
        .suffixStyle(StylesSaluteTheme.typography.bodySNormal)
        .placeholderStyle(StylesSaluteTheme.typography.bodySNormal)
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextAreaS)

public val WrapperTextAreaS.RequiredStart: WrapperTextAreaSRequiredStart
    @Composable
    @JvmName("WrapperTextAreaSRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaSRequiredStart)

public val WrapperTextAreaS.RequiredEnd: WrapperTextAreaSRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaSRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaSRequiredEnd)

public val WrapperTextAreaS.OuterLabel: WrapperTextAreaSOuterLabel
    @Composable
    @JvmName("WrapperTextAreaSOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(8.0.dp)
        }
        .labelStyle(StylesSaluteTheme.typography.bodySNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodySNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaSOuterLabel)

public val WrapperTextAreaSOuterLabel.RequiredStart: WrapperTextAreaSOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaSOuterLabelRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(6.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaSOuterLabelRequiredStart)

public val WrapperTextAreaSOuterLabel.RequiredEnd: WrapperTextAreaSOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaSOuterLabelRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaSOuterLabelRequiredEnd)

public val WrapperTextAreaS.InnerLabel: WrapperTextAreaSInnerLabel
    @Composable
    @JvmName("WrapperTextAreaSInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(4.0.dp)
            boxPaddingBottom(12.0.dp)
            labelPadding(0.0.dp)
        }
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaSInnerLabel)

public val WrapperTextAreaSInnerLabel.RequiredStart: WrapperTextAreaSInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaSInnerLabelRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaSInnerLabelRequiredStart)

public val WrapperTextAreaSInnerLabel.RequiredEnd: WrapperTextAreaSInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaSInnerLabelRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaSInnerLabelRequiredEnd)

public val TextArea.M: WrapperTextAreaM
    @Composable
    @JvmName("WrapperTextAreaM")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .dimensions {
            boxPaddingStart(14.0.dp)
            boxPaddingEnd(14.0.dp)
            boxPaddingTop(12.0.dp)
            boxPaddingBottom(12.0.dp)
            boxMinHeight(48.0.dp)
            alignmentLineHeight(48.0.dp)
            helperTextPadding(12.0.dp)
            startContentPadding(6.0.dp)
            endContentPadding(8.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .valueStyle(StylesSaluteTheme.typography.bodyMNormal)
        .prefixStyle(StylesSaluteTheme.typography.bodyMNormal)
        .suffixStyle(StylesSaluteTheme.typography.bodyMNormal)
        .placeholderStyle(StylesSaluteTheme.typography.bodyMNormal)
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextAreaM)

public val WrapperTextAreaM.RequiredStart: WrapperTextAreaMRequiredStart
    @Composable
    @JvmName("WrapperTextAreaMRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaMRequiredStart)

public val WrapperTextAreaM.RequiredEnd: WrapperTextAreaMRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaMRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaMRequiredEnd)

public val WrapperTextAreaM.OuterLabel: WrapperTextAreaMOuterLabel
    @Composable
    @JvmName("WrapperTextAreaMOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(10.0.dp)
        }
        .labelStyle(StylesSaluteTheme.typography.bodyMNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyMNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaMOuterLabel)

public val WrapperTextAreaMOuterLabel.RequiredStart: WrapperTextAreaMOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaMOuterLabelRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(7.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaMOuterLabelRequiredStart)

public val WrapperTextAreaMOuterLabel.RequiredEnd: WrapperTextAreaMOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaMOuterLabelRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaMOuterLabelRequiredEnd)

public val WrapperTextAreaM.InnerLabel: WrapperTextAreaMInnerLabel
    @Composable
    @JvmName("WrapperTextAreaMInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(6.0.dp)
            boxPaddingBottom(12.0.dp)
            labelPadding(2.0.dp)
        }
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaMInnerLabel)

public val WrapperTextAreaMInnerLabel.RequiredStart: WrapperTextAreaMInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaMInnerLabelRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaMInnerLabelRequiredStart)

public val WrapperTextAreaMInnerLabel.RequiredEnd: WrapperTextAreaMInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaMInnerLabelRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaMInnerLabelRequiredEnd)

public val TextArea.L: WrapperTextAreaL
    @Composable
    @JvmName("WrapperTextAreaL")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = 2.0.dp))
        .dimensions {
            boxPaddingStart(16.0.dp)
            boxPaddingEnd(16.0.dp)
            boxPaddingTop(16.0.dp)
            boxPaddingBottom(12.0.dp)
            boxMinHeight(56.0.dp)
            alignmentLineHeight(56.0.dp)
            helperTextPadding(12.0.dp)
            startContentPadding(8.0.dp)
            endContentPadding(10.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .valueStyle(StylesSaluteTheme.typography.bodyLNormal)
        .prefixStyle(StylesSaluteTheme.typography.bodyLNormal)
        .suffixStyle(StylesSaluteTheme.typography.bodyLNormal)
        .placeholderStyle(StylesSaluteTheme.typography.bodyLNormal)
        .chipStyle(EmbeddedChip.L.Secondary.style())
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextAreaL)

public val WrapperTextAreaL.RequiredStart: WrapperTextAreaLRequiredStart
    @Composable
    @JvmName("WrapperTextAreaLRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaLRequiredStart)

public val WrapperTextAreaL.RequiredEnd: WrapperTextAreaLRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaLRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaLRequiredEnd)

public val WrapperTextAreaL.OuterLabel: WrapperTextAreaLOuterLabel
    @Composable
    @JvmName("WrapperTextAreaLOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(12.0.dp)
        }
        .labelStyle(StylesSaluteTheme.typography.bodyLNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyLNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaLOuterLabel)

public val WrapperTextAreaLOuterLabel.RequiredStart: WrapperTextAreaLOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaLOuterLabelRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaLOuterLabelRequiredStart)

public val WrapperTextAreaLOuterLabel.RequiredEnd: WrapperTextAreaLOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaLOuterLabelRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaLOuterLabelRequiredEnd)

public val WrapperTextAreaL.InnerLabel: WrapperTextAreaLInnerLabel
    @Composable
    @JvmName("WrapperTextAreaLInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(9.0.dp)
            boxPaddingBottom(12.0.dp)
            labelPadding(2.0.dp)
        }
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaLInnerLabel)

public val WrapperTextAreaLInnerLabel.RequiredStart: WrapperTextAreaLInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaLInnerLabelRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaLInnerLabelRequiredStart)

public val WrapperTextAreaLInnerLabel.RequiredEnd: WrapperTextAreaLInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaLInnerLabelRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaLInnerLabelRequiredEnd)
