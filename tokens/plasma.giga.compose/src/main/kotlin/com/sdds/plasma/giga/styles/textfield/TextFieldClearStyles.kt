// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.textfield

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
import com.sdds.plasma.giga.styles.chipgroup.ChipGroup
import com.sdds.plasma.giga.styles.chipgroup.Dense
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
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
 * Обертка для вариации XsRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearXsRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XsRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearXsRequiredEnd(
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
 * Обертка для вариации XsOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearXsOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XsOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearXsOuterLabelRequiredEnd(
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
 * Обертка для вариации SRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearSRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации SRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearSRequiredEnd(
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
 * Обертка для вариации SOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearSOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации SOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearSOuterLabelRequiredEnd(
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
 * Обертка для вариации SInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearSInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации SInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearSInnerLabelRequiredEnd(
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
 * Обертка для вариации MRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearMRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации MRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearMRequiredEnd(
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
 * Обертка для вариации MOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearMOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации MOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearMOuterLabelRequiredEnd(
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
 * Обертка для вариации MInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearMInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации MInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearMInnerLabelRequiredEnd(
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
 * Обертка для вариации LRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearLRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации LRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearLRequiredEnd(
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
 * Обертка для вариации LOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearLOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации LOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearLOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации LInnerLabel
 */
@JvmInline
public value class WrapperTextFieldClearLInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации LInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearLInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации LInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearLInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperTextFieldClearXl(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XlRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearXlRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XlRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearXlRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XlOuterLabel
 */
@JvmInline
public value class WrapperTextFieldClearXlOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XlOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearXlOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XlOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearXlOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XlInnerLabel
 */
@JvmInline
public value class WrapperTextFieldClearXlInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XlInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearXlInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Обертка для вариации XlInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearXlInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

public val WrapperTextFieldClearView.Default: WrapperTextFieldClearTerminate
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
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Success: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                PlasmaGigaTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                PlasmaGigaTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                PlasmaGigaTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                ),
            )
            dividerColor(
                PlasmaGigaTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Warning: WrapperTextFieldClearTerminate
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
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Error: WrapperTextFieldClearTerminate
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
        .wrap(::WrapperTextFieldClearTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .singleLine(true)
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

public val TextFieldClear.Xs: WrapperTextFieldClearXs
    @Composable
    @JvmName("WrapperTextFieldClearXs")
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
        .wrap(::WrapperTextFieldClearXs)

public val WrapperTextFieldClearXs.RequiredStart: WrapperTextFieldClearXsRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearXsRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(13.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearXsRequiredStart)

public val WrapperTextFieldClearXs.RequiredEnd: WrapperTextFieldClearXsRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearXsRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(13.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearXsRequiredEnd)

public val WrapperTextFieldClearXs.OuterLabel: WrapperTextFieldClearXsOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearXsOuterLabel")
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
        .wrap(::WrapperTextFieldClearXsOuterLabel)

public val WrapperTextFieldClearXsOuterLabel.RequiredStart:
    WrapperTextFieldClearXsOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearXsOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearXsOuterLabelRequiredStart)

public val WrapperTextFieldClearXsOuterLabel.RequiredEnd:
    WrapperTextFieldClearXsOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearXsOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(2.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearXsOuterLabelRequiredEnd)

public val TextFieldClear.S: WrapperTextFieldClearS
    @Composable
    @JvmName("WrapperTextFieldClearS")
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
        .wrap(::WrapperTextFieldClearS)

public val WrapperTextFieldClearS.RequiredStart: WrapperTextFieldClearSRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearSRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearSRequiredStart)

public val WrapperTextFieldClearS.RequiredEnd: WrapperTextFieldClearSRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearSRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearSRequiredEnd)

public val WrapperTextFieldClearS.OuterLabel: WrapperTextFieldClearSOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearSOuterLabel")
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
        .wrap(::WrapperTextFieldClearSOuterLabel)

public val WrapperTextFieldClearSOuterLabel.RequiredStart:
    WrapperTextFieldClearSOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearSOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(6.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearSOuterLabelRequiredStart)

public val WrapperTextFieldClearSOuterLabel.RequiredEnd: WrapperTextFieldClearSOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearSOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearSOuterLabelRequiredEnd)

public val WrapperTextFieldClearS.InnerLabel: WrapperTextFieldClearSInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearSInnerLabel")
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
        .wrap(::WrapperTextFieldClearSInnerLabel)

public val WrapperTextFieldClearSInnerLabel.RequiredStart:
    WrapperTextFieldClearSInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearSInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearSInnerLabelRequiredStart)

public val WrapperTextFieldClearSInnerLabel.RequiredEnd: WrapperTextFieldClearSInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearSInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearSInnerLabelRequiredEnd)

public val TextFieldClear.M: WrapperTextFieldClearM
    @Composable
    @JvmName("WrapperTextFieldClearM")
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
        .wrap(::WrapperTextFieldClearM)

public val WrapperTextFieldClearM.RequiredStart: WrapperTextFieldClearMRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearMRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearMRequiredStart)

public val WrapperTextFieldClearM.RequiredEnd: WrapperTextFieldClearMRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearMRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearMRequiredEnd)

public val WrapperTextFieldClearM.OuterLabel: WrapperTextFieldClearMOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearMOuterLabel")
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
        .wrap(::WrapperTextFieldClearMOuterLabel)

public val WrapperTextFieldClearMOuterLabel.RequiredStart:
    WrapperTextFieldClearMOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearMOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(7.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearMOuterLabelRequiredStart)

public val WrapperTextFieldClearMOuterLabel.RequiredEnd: WrapperTextFieldClearMOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearMOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearMOuterLabelRequiredEnd)

public val WrapperTextFieldClearM.InnerLabel: WrapperTextFieldClearMInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearMInnerLabel")
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
        .wrap(::WrapperTextFieldClearMInnerLabel)

public val WrapperTextFieldClearMInnerLabel.RequiredStart:
    WrapperTextFieldClearMInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearMInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearMInnerLabelRequiredStart)

public val WrapperTextFieldClearMInnerLabel.RequiredEnd: WrapperTextFieldClearMInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearMInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearMInnerLabelRequiredEnd)

public val TextFieldClear.L: WrapperTextFieldClearL
    @Composable
    @JvmName("WrapperTextFieldClearL")
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
        .wrap(::WrapperTextFieldClearL)

public val WrapperTextFieldClearL.RequiredStart: WrapperTextFieldClearLRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearLRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearLRequiredStart)

public val WrapperTextFieldClearL.RequiredEnd: WrapperTextFieldClearLRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearLRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearLRequiredEnd)

public val WrapperTextFieldClearL.OuterLabel: WrapperTextFieldClearLOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearLOuterLabel")
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
        .wrap(::WrapperTextFieldClearLOuterLabel)

public val WrapperTextFieldClearLOuterLabel.RequiredStart:
    WrapperTextFieldClearLOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearLOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearLOuterLabelRequiredStart)

public val WrapperTextFieldClearLOuterLabel.RequiredEnd: WrapperTextFieldClearLOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearLOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearLOuterLabelRequiredEnd)

public val WrapperTextFieldClearL.InnerLabel: WrapperTextFieldClearLInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearLInnerLabel")
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
        .wrap(::WrapperTextFieldClearLInnerLabel)

public val WrapperTextFieldClearLInnerLabel.RequiredStart:
    WrapperTextFieldClearLInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearLInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearLInnerLabelRequiredStart)

public val WrapperTextFieldClearLInnerLabel.RequiredEnd: WrapperTextFieldClearLInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearLInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearLInnerLabelRequiredEnd)

public val TextFieldClear.Xl: WrapperTextFieldClearXl
    @Composable
    @JvmName("WrapperTextFieldClearXl")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .dimensions {
            boxPaddingTop(20.0.dp)
            boxPaddingBottom(20.0.dp)
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
        .wrap(::WrapperTextFieldClearXl)

public val WrapperTextFieldClearXl.RequiredStart: WrapperTextFieldClearXlRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearXlRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearXlRequiredStart)

public val WrapperTextFieldClearXl.RequiredEnd: WrapperTextFieldClearXlRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearXlRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearXlRequiredEnd)

public val WrapperTextFieldClearXl.OuterLabel: WrapperTextFieldClearXlOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearXlOuterLabel")
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
        .wrap(::WrapperTextFieldClearXlOuterLabel)

public val WrapperTextFieldClearXlOuterLabel.RequiredStart:
    WrapperTextFieldClearXlOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearXlOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearXlOuterLabelRequiredStart)

public val WrapperTextFieldClearXlOuterLabel.RequiredEnd:
    WrapperTextFieldClearXlOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearXlOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearXlOuterLabelRequiredEnd)

public val WrapperTextFieldClearXl.InnerLabel: WrapperTextFieldClearXlInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearXlInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(13.0.dp)
            boxPaddingBottom(13.0.dp)
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
        .wrap(::WrapperTextFieldClearXlInnerLabel)

public val WrapperTextFieldClearXlInnerLabel.RequiredStart:
    WrapperTextFieldClearXlInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearXlInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredStart)
        .wrap(::WrapperTextFieldClearXlInnerLabelRequiredStart)

public val WrapperTextFieldClearXlInnerLabel.RequiredEnd:
    WrapperTextFieldClearXlInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearXlInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextFieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearXlInnerLabelRequiredEnd)
