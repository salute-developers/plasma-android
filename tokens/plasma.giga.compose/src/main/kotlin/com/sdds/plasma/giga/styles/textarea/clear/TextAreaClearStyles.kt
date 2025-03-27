// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.textarea.clear

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
import com.sdds.compose.uikit.TextFieldIndicatorAlignmentMode
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.TextFieldType
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.styles.chip.EmbeddedChip
import com.sdds.plasma.giga.styles.chip.L
import com.sdds.plasma.giga.styles.chip.M
import com.sdds.plasma.giga.styles.chip.S
import com.sdds.plasma.giga.styles.chip.Secondary
import com.sdds.plasma.giga.styles.chip.Xs
import com.sdds.plasma.giga.styles.chip.group.ChipGroup
import com.sdds.plasma.giga.styles.chip.group.Dense
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
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
 * Обертка для вариации XsRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearXsRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XsRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearXsRequiredEnd(
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
 * Обертка для вариации XsOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearXsOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XsOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearXsOuterLabelRequiredEnd(
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
 * Обертка для вариации SRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearSRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации SRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearSRequiredEnd(
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
 * Обертка для вариации SOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearSOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации SOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearSOuterLabelRequiredEnd(
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
 * Обертка для вариации SInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearSInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации SInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearSInnerLabelRequiredEnd(
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
 * Обертка для вариации MRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearMRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации MRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearMRequiredEnd(
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
 * Обертка для вариации MOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearMOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации MOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearMOuterLabelRequiredEnd(
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
 * Обертка для вариации MInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearMInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации MInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearMInnerLabelRequiredEnd(
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
 * Обертка для вариации LRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearLRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации LRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearLRequiredEnd(
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
 * Обертка для вариации LOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearLOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации LOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearLOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации LInnerLabel
 */
@JvmInline
public value class WrapperTextAreaClearLInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации LInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearLInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации LInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearLInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperTextAreaClearXl(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XlRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearXlRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XlRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearXlRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XlOuterLabel
 */
@JvmInline
public value class WrapperTextAreaClearXlOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XlOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearXlOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XlOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearXlOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XlInnerLabel
 */
@JvmInline
public value class WrapperTextAreaClearXlInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XlInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearXlInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Обертка для вариации XlInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearXlInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextAreaClearView

public val WrapperTextAreaClearView.Default: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
            captionColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
            dividerColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

public val WrapperTextAreaClearView.Warning: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                PlasmaGigaTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                PlasmaGigaTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                PlasmaGigaTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                ),
            )
            dividerColor(
                PlasmaGigaTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

public val WrapperTextAreaClearView.Error: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                PlasmaGigaTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                PlasmaGigaTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                PlasmaGigaTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                ),
            )
            dividerColor(
                PlasmaGigaTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .singleLine(false)
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            boxPaddingStart(0.0.dp)
            boxPaddingEnd(0.0.dp)
            optionalPadding(4.0.dp)
            helperTextPadding(4.0.dp)
            chipsPadding(6.0.dp)
            chipsPaddingStart(0.0.dp)
            chipsPaddingEnd(0.0.dp)
        }
        .captionStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .chipGroupStyle(ChipGroup.Dense.style())
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
        .colors {
            optionalColor(
                PlasmaGigaTheme.colors.textDefaultTertiary.asInteractive(),
            )
            valueColorReadOnly(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColorReadOnly(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
            indicatorColor(
                PlasmaGigaTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColorReadOnly(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                ),
            )
            endContentColorReadOnly(
                PlasmaGigaTheme.colors.textDefaultSecondary.multiplyAlpha(0.4f).asInteractive(),
            )
            captionColorReadOnly(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
            counterColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
            cursorColor(
                PlasmaGigaTheme.colors.textDefaultAccent.asInteractive(),
            )
            dividerColorReadOnly(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            prefixColor(
                PlasmaGigaTheme.colors.textDefaultTertiary.asInteractive(),
            )
            suffixColor(
                PlasmaGigaTheme.colors.textDefaultTertiary.asInteractive(),
            )
        }

public val TextAreaClear.Xs: WrapperTextAreaClearXs
    @Composable
    @JvmName("WrapperTextAreaClearXs")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .dimensions {
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            boxMinHeight(32.0.dp)
            alignmentLineHeight(32.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(4.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
        }
        .valueStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .prefixStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .suffixStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextAreaClearXs)

public val WrapperTextAreaClearXs.RequiredStart: WrapperTextAreaClearXsRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearXsRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(13.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearXsRequiredStart)

public val WrapperTextAreaClearXs.RequiredEnd: WrapperTextAreaClearXsRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearXsRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(13.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearXsRequiredEnd)

public val WrapperTextAreaClearXs.OuterLabel: WrapperTextAreaClearXsOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearXsOuterLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            labelPadding(2.0.dp)
        }
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearXsOuterLabel)

public val WrapperTextAreaClearXsOuterLabel.RequiredStart:
    WrapperTextAreaClearXsOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearXsOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearXsOuterLabelRequiredStart)

public val WrapperTextAreaClearXsOuterLabel.RequiredEnd: WrapperTextAreaClearXsOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearXsOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(2.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearXsOuterLabelRequiredEnd)

public val TextAreaClear.S: WrapperTextAreaClearS
    @Composable
    @JvmName("WrapperTextAreaClearS")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .dimensions {
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            boxMinHeight(40.0.dp)
            alignmentLineHeight(40.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(6.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .valueStyle(PlasmaGigaTheme.typography.bodySNormal)
        .prefixStyle(PlasmaGigaTheme.typography.bodySNormal)
        .suffixStyle(PlasmaGigaTheme.typography.bodySNormal)
        .placeholderStyle(PlasmaGigaTheme.typography.bodySNormal)
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextAreaClearS)

public val WrapperTextAreaClearS.RequiredStart: WrapperTextAreaClearSRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearSRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearSRequiredStart)

public val WrapperTextAreaClearS.RequiredEnd: WrapperTextAreaClearSRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearSRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearSRequiredEnd)

public val WrapperTextAreaClearS.OuterLabel: WrapperTextAreaClearSOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearSOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(4.0.dp)
        }
        .labelStyle(PlasmaGigaTheme.typography.bodySNormal)
        .optionalStyle(PlasmaGigaTheme.typography.bodySNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearSOuterLabel)

public val WrapperTextAreaClearSOuterLabel.RequiredStart:
    WrapperTextAreaClearSOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearSOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(6.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearSOuterLabelRequiredStart)

public val WrapperTextAreaClearSOuterLabel.RequiredEnd: WrapperTextAreaClearSOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearSOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearSOuterLabelRequiredEnd)

public val WrapperTextAreaClearS.InnerLabel: WrapperTextAreaClearSInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearSInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(4.0.dp)
            boxPaddingBottom(4.0.dp)
            labelPadding(0.0.dp)
        }
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearSInnerLabel)

public val WrapperTextAreaClearSInnerLabel.RequiredStart:
    WrapperTextAreaClearSInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearSInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearSInnerLabelRequiredStart)

public val WrapperTextAreaClearSInnerLabel.RequiredEnd: WrapperTextAreaClearSInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearSInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearSInnerLabelRequiredEnd)

public val TextAreaClear.M: WrapperTextAreaClearM
    @Composable
    @JvmName("WrapperTextAreaClearM")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .dimensions {
            boxPaddingTop(12.0.dp)
            boxPaddingBottom(12.0.dp)
            boxMinHeight(48.0.dp)
            alignmentLineHeight(48.0.dp)
            startContentPadding(6.0.dp)
            endContentPadding(8.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .valueStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .prefixStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .suffixStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .placeholderStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextAreaClearM)

public val WrapperTextAreaClearM.RequiredStart: WrapperTextAreaClearMRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearMRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearMRequiredStart)

public val WrapperTextAreaClearM.RequiredEnd: WrapperTextAreaClearMRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearMRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearMRequiredEnd)

public val WrapperTextAreaClearM.OuterLabel: WrapperTextAreaClearMOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearMOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(4.0.dp)
        }
        .labelStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .optionalStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearMOuterLabel)

public val WrapperTextAreaClearMOuterLabel.RequiredStart:
    WrapperTextAreaClearMOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearMOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(7.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearMOuterLabelRequiredStart)

public val WrapperTextAreaClearMOuterLabel.RequiredEnd: WrapperTextAreaClearMOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearMOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearMOuterLabelRequiredEnd)

public val WrapperTextAreaClearM.InnerLabel: WrapperTextAreaClearMInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearMInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(6.0.dp)
            boxPaddingBottom(6.0.dp)
            labelPadding(2.0.dp)
        }
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearMInnerLabel)

public val WrapperTextAreaClearMInnerLabel.RequiredStart:
    WrapperTextAreaClearMInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearMInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearMInnerLabelRequiredStart)

public val WrapperTextAreaClearMInnerLabel.RequiredEnd: WrapperTextAreaClearMInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearMInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearMInnerLabelRequiredEnd)

public val TextAreaClear.L: WrapperTextAreaClearL
    @Composable
    @JvmName("WrapperTextAreaClearL")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .dimensions {
            boxPaddingTop(16.0.dp)
            boxPaddingBottom(16.0.dp)
            boxMinHeight(56.0.dp)
            alignmentLineHeight(56.0.dp)
            startContentPadding(8.0.dp)
            endContentPadding(10.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .valueStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .prefixStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .suffixStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .placeholderStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .chipStyle(EmbeddedChip.L.Secondary.style())
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextAreaClearL)

public val WrapperTextAreaClearL.RequiredStart: WrapperTextAreaClearLRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearLRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearLRequiredStart)

public val WrapperTextAreaClearL.RequiredEnd: WrapperTextAreaClearLRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearLRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearLRequiredEnd)

public val WrapperTextAreaClearL.OuterLabel: WrapperTextAreaClearLOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearLOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(4.0.dp)
        }
        .labelStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .optionalStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearLOuterLabel)

public val WrapperTextAreaClearLOuterLabel.RequiredStart:
    WrapperTextAreaClearLOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearLOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearLOuterLabelRequiredStart)

public val WrapperTextAreaClearLOuterLabel.RequiredEnd: WrapperTextAreaClearLOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearLOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearLOuterLabelRequiredEnd)

public val WrapperTextAreaClearL.InnerLabel: WrapperTextAreaClearLInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearLInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(9.0.dp)
            boxPaddingBottom(9.0.dp)
            labelPadding(2.0.dp)
        }
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearLInnerLabel)

public val WrapperTextAreaClearLInnerLabel.RequiredStart:
    WrapperTextAreaClearLInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearLInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearLInnerLabelRequiredStart)

public val WrapperTextAreaClearLInnerLabel.RequiredEnd: WrapperTextAreaClearLInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearLInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearLInnerLabelRequiredEnd)

public val TextAreaClear.Xl: WrapperTextAreaClearXl
    @Composable
    @JvmName("WrapperTextAreaClearXl")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .dimensions {
            boxPaddingTop(21.0.dp)
            boxPaddingBottom(21.0.dp)
            boxMinHeight(64.0.dp)
            alignmentLineHeight(64.0.dp)
            startContentPadding(8.0.dp)
            endContentPadding(10.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .valueStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .prefixStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .suffixStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .placeholderStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .chipStyle(EmbeddedChip.L.Secondary.style())
        .labelPlacement(TextFieldLabelPlacement.None)
        .wrap(::WrapperTextAreaClearXl)

public val WrapperTextAreaClearXl.RequiredStart: WrapperTextAreaClearXlRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearXlRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearXlRequiredStart)

public val WrapperTextAreaClearXl.RequiredEnd: WrapperTextAreaClearXlRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearXlRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearXlRequiredEnd)

public val WrapperTextAreaClearXl.OuterLabel: WrapperTextAreaClearXlOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearXlOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(4.0.dp)
        }
        .labelStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .optionalStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearXlOuterLabel)

public val WrapperTextAreaClearXlOuterLabel.RequiredStart:
    WrapperTextAreaClearXlOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearXlOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearXlOuterLabelRequiredStart)

public val WrapperTextAreaClearXlOuterLabel.RequiredEnd: WrapperTextAreaClearXlOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearXlOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearXlOuterLabelRequiredEnd)

public val WrapperTextAreaClearXl.InnerLabel: WrapperTextAreaClearXlInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearXlInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(9.0.dp)
            boxPaddingBottom(9.0.dp)
            labelPadding(2.0.dp)
        }
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaClearXlInnerLabel)

public val WrapperTextAreaClearXlInnerLabel.RequiredStart:
    WrapperTextAreaClearXlInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearXlInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextAreaClearXlInnerLabelRequiredStart)

public val WrapperTextAreaClearXlInnerLabel.RequiredEnd: WrapperTextAreaClearXlInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearXlInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearXlInnerLabelRequiredEnd)
