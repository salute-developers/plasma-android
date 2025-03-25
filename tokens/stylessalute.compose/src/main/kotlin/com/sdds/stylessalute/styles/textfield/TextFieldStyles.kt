// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.textfield

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
public interface WrapperTextField : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTextFieldView : WrapperTextField

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTextFieldTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextField

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperTextFieldXs(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации XsRequiredStart
 */
@JvmInline
public value class WrapperTextFieldXsRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации XsRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldXsRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации XsOuterLabel
 */
@JvmInline
public value class WrapperTextFieldXsOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации XsOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldXsOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации XsOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldXsOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTextFieldS(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации SRequiredStart
 */
@JvmInline
public value class WrapperTextFieldSRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации SRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldSRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации SOuterLabel
 */
@JvmInline
public value class WrapperTextFieldSOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации SOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldSOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации SOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldSOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации SInnerLabel
 */
@JvmInline
public value class WrapperTextFieldSInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации SInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldSInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации SInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldSInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTextFieldM(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации MRequiredStart
 */
@JvmInline
public value class WrapperTextFieldMRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации MRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldMRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации MOuterLabel
 */
@JvmInline
public value class WrapperTextFieldMOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации MOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldMOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации MOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldMOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации MInnerLabel
 */
@JvmInline
public value class WrapperTextFieldMInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации MInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldMInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации MInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldMInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTextFieldL(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации LRequiredStart
 */
@JvmInline
public value class WrapperTextFieldLRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации LRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldLRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации LOuterLabel
 */
@JvmInline
public value class WrapperTextFieldLOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации LOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldLOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации LOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldLOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации LInnerLabel
 */
@JvmInline
public value class WrapperTextFieldLInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации LInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldLInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Обертка для вариации LInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldLInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

public val WrapperTextFieldView.Default: WrapperTextFieldTerminate
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
        .wrap(::WrapperTextFieldTerminate)

public val WrapperTextFieldView.Success: WrapperTextFieldTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                StylesSaluteTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultSecondary,
                ),
            )
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextFieldTerminate)

public val WrapperTextFieldView.Warning: WrapperTextFieldTerminate
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
        .wrap(::WrapperTextFieldTerminate)

public val WrapperTextFieldView.Error: WrapperTextFieldTerminate
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
        .wrap(::WrapperTextFieldTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .singleLine(true)
        .dimensions {
            optionalPadding(4.0.dp)
            helperTextPadding(4.0.dp)
            chipsPadding(6.0.dp)
        }
        .captionStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .counterStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .chipGroupStyle(ChipGroup.Dense.style())
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
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

public val TextField.Xs: WrapperTextFieldXs
    @Composable
    @JvmName("WrapperTextFieldXs")
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
        .wrap(::WrapperTextFieldXs)

public val WrapperTextFieldXs.RequiredStart: WrapperTextFieldXsRequiredStart
    @Composable
    @JvmName("WrapperTextFieldXsRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldXsRequiredStart)

public val WrapperTextFieldXs.RequiredEnd: WrapperTextFieldXsRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldXsRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldXsRequiredEnd)

public val WrapperTextFieldXs.OuterLabel: WrapperTextFieldXsOuterLabel
    @Composable
    @JvmName("WrapperTextFieldXsOuterLabel")
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
        .wrap(::WrapperTextFieldXsOuterLabel)

public val WrapperTextFieldXsOuterLabel.RequiredStart: WrapperTextFieldXsOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldXsOuterLabelRequiredStart")
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
        .wrap(::WrapperTextFieldXsOuterLabelRequiredStart)

public val WrapperTextFieldXsOuterLabel.RequiredEnd: WrapperTextFieldXsOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldXsOuterLabelRequiredEnd")
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
        .wrap(::WrapperTextFieldXsOuterLabelRequiredEnd)

public val TextField.S: WrapperTextFieldS
    @Composable
    @JvmName("WrapperTextFieldS")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            boxPaddingStart(12.0.dp)
            boxPaddingEnd(12.0.dp)
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            boxMinHeight(40.0.dp)
            alignmentLineHeight(40.0.dp)
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
        .wrap(::WrapperTextFieldS)

public val WrapperTextFieldS.RequiredStart: WrapperTextFieldSRequiredStart
    @Composable
    @JvmName("WrapperTextFieldSRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldSRequiredStart)

public val WrapperTextFieldS.RequiredEnd: WrapperTextFieldSRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldSRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldSRequiredEnd)

public val WrapperTextFieldS.OuterLabel: WrapperTextFieldSOuterLabel
    @Composable
    @JvmName("WrapperTextFieldSOuterLabel")
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
        .wrap(::WrapperTextFieldSOuterLabel)

public val WrapperTextFieldSOuterLabel.RequiredStart: WrapperTextFieldSOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldSOuterLabelRequiredStart")
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
        .wrap(::WrapperTextFieldSOuterLabelRequiredStart)

public val WrapperTextFieldSOuterLabel.RequiredEnd: WrapperTextFieldSOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldSOuterLabelRequiredEnd")
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
        .wrap(::WrapperTextFieldSOuterLabelRequiredEnd)

public val WrapperTextFieldS.InnerLabel: WrapperTextFieldSInnerLabel
    @Composable
    @JvmName("WrapperTextFieldSInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(4.0.dp)
            boxPaddingBottom(4.0.dp)
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
        .wrap(::WrapperTextFieldSInnerLabel)

public val WrapperTextFieldSInnerLabel.RequiredStart: WrapperTextFieldSInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldSInnerLabelRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldSInnerLabelRequiredStart)

public val WrapperTextFieldSInnerLabel.RequiredEnd: WrapperTextFieldSInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldSInnerLabelRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldSInnerLabelRequiredEnd)

public val TextField.M: WrapperTextFieldM
    @Composable
    @JvmName("WrapperTextFieldM")
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
        .wrap(::WrapperTextFieldM)

public val WrapperTextFieldM.RequiredStart: WrapperTextFieldMRequiredStart
    @Composable
    @JvmName("WrapperTextFieldMRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldMRequiredStart)

public val WrapperTextFieldM.RequiredEnd: WrapperTextFieldMRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldMRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldMRequiredEnd)

public val WrapperTextFieldM.OuterLabel: WrapperTextFieldMOuterLabel
    @Composable
    @JvmName("WrapperTextFieldMOuterLabel")
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
        .wrap(::WrapperTextFieldMOuterLabel)

public val WrapperTextFieldMOuterLabel.RequiredStart: WrapperTextFieldMOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldMOuterLabelRequiredStart")
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
        .wrap(::WrapperTextFieldMOuterLabelRequiredStart)

public val WrapperTextFieldMOuterLabel.RequiredEnd: WrapperTextFieldMOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldMOuterLabelRequiredEnd")
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
        .wrap(::WrapperTextFieldMOuterLabelRequiredEnd)

public val WrapperTextFieldM.InnerLabel: WrapperTextFieldMInnerLabel
    @Composable
    @JvmName("WrapperTextFieldMInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(6.0.dp)
            boxPaddingBottom(6.0.dp)
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
        .wrap(::WrapperTextFieldMInnerLabel)

public val WrapperTextFieldMInnerLabel.RequiredStart: WrapperTextFieldMInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldMInnerLabelRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldMInnerLabelRequiredStart)

public val WrapperTextFieldMInnerLabel.RequiredEnd: WrapperTextFieldMInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldMInnerLabelRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldMInnerLabelRequiredEnd)

public val TextField.L: WrapperTextFieldL
    @Composable
    @JvmName("WrapperTextFieldL")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = 2.0.dp))
        .dimensions {
            boxPaddingStart(16.0.dp)
            boxPaddingEnd(16.0.dp)
            boxPaddingTop(16.0.dp)
            boxPaddingBottom(16.0.dp)
            boxMinHeight(56.0.dp)
            alignmentLineHeight(56.0.dp)
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
        .wrap(::WrapperTextFieldL)

public val WrapperTextFieldL.RequiredStart: WrapperTextFieldLRequiredStart
    @Composable
    @JvmName("WrapperTextFieldLRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldLRequiredStart)

public val WrapperTextFieldL.RequiredEnd: WrapperTextFieldLRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldLRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldLRequiredEnd)

public val WrapperTextFieldL.OuterLabel: WrapperTextFieldLOuterLabel
    @Composable
    @JvmName("WrapperTextFieldLOuterLabel")
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
        .wrap(::WrapperTextFieldLOuterLabel)

public val WrapperTextFieldLOuterLabel.RequiredStart: WrapperTextFieldLOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldLOuterLabelRequiredStart")
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
        .wrap(::WrapperTextFieldLOuterLabelRequiredStart)

public val WrapperTextFieldLOuterLabel.RequiredEnd: WrapperTextFieldLOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldLOuterLabelRequiredEnd")
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
        .wrap(::WrapperTextFieldLOuterLabelRequiredEnd)

public val WrapperTextFieldL.InnerLabel: WrapperTextFieldLInnerLabel
    @Composable
    @JvmName("WrapperTextFieldLInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(9.0.dp)
            boxPaddingBottom(9.0.dp)
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
        .wrap(::WrapperTextFieldLInnerLabel)

public val WrapperTextFieldLInnerLabel.RequiredStart: WrapperTextFieldLInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldLInnerLabelRequiredStart")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldLInnerLabelRequiredStart)

public val WrapperTextFieldLInnerLabel.RequiredEnd: WrapperTextFieldLInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldLInnerLabelRequiredEnd")
    get() = builder
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldLInnerLabelRequiredEnd)
