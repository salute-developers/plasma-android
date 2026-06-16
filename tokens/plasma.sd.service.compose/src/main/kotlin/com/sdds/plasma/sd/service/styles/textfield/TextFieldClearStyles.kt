// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.textfield

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
import com.sdds.plasma.sd.service.styles.chipgroup.EmbeddedChipGroupDense
import com.sdds.plasma.sd.service.styles.chipgroup.L
import com.sdds.plasma.sd.service.styles.chipgroup.M
import com.sdds.plasma.sd.service.styles.chipgroup.S
import com.sdds.plasma.sd.service.styles.chipgroup.Secondary
import com.sdds.plasma.sd.service.styles.chipgroup.Xl
import com.sdds.plasma.sd.service.styles.chipgroup.Xs
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
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
            startContentColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
            valueColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
            captionColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
            placeholderColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultTertiary,
                ),
            )
            dividerColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Success: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            valueColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimary,
                ),
            )
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            placeholderColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultTertiary,
                ),
            )
            dividerColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Warning: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            valueColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimary,
                ),
            )
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            placeholderColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultTertiary,
                ),
            )
            dividerColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Error: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            valueColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimary,
                ),
            )
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            placeholderColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultTertiary,
                ),
            )
            dividerColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextFieldClearTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
        .captionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
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
        .colors {
            cursorColor(PlasmaSdServiceTheme.colors.textDefaultAccent.asInteractive())
            startContentColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
            endContentColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaSdServiceTheme.colors.textDefaultSecondaryHover,
                ),
            )
            endContentColorReadOnly(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.multiplyAlpha(0.4f).asInteractive(),
            )
            valueColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
            captionColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
            optionalColor(PlasmaSdServiceTheme.colors.textDefaultTertiary.asInteractive())
            counterColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
            placeholderColorReadOnly(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
            dividerColorReadOnly(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
            indicatorColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative.asInteractive())
            prefixColor(PlasmaSdServiceTheme.colors.textDefaultTertiary.asInteractive())
            suffixColor(PlasmaSdServiceTheme.colors.textDefaultTertiary.asInteractive())
        }

public val TextFieldClear.Xs: WrapperTextFieldClearXs
    @Composable
    @JvmName("WrapperTextFieldClearXs")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .chipGroupStyle(EmbeddedChipGroupDense.Xs.Secondary.style())
        .dimensions {
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(4.0.dp)
            boxMinHeight(32.0.dp)
            alignmentLineHeight(32.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
        }
        .wrap(::WrapperTextFieldClearXs)

public val WrapperTextFieldClearXs.RequiredStart: WrapperTextFieldClearXsRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearXsRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(13.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearXsRequiredStart)

public val WrapperTextFieldClearXs.RequiredEnd: WrapperTextFieldClearXsRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearXsRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(13.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearXsRequiredEnd)

public val WrapperTextFieldClearXs.OuterLabel: WrapperTextFieldClearXsOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearXsOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            labelPadding(2.0.dp)
        }
        .colors {
            labelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearXsOuterLabel)

public val WrapperTextFieldClearXsOuterLabel.RequiredStart:
    WrapperTextFieldClearXsOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearXsOuterLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearXsOuterLabelRequiredStart)

public val WrapperTextFieldClearXsOuterLabel.RequiredEnd:
    WrapperTextFieldClearXsOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearXsOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(2.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearXsOuterLabelRequiredEnd)

public val TextFieldClear.S: WrapperTextFieldClearS
    @Composable
    @JvmName("WrapperTextFieldClearS")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .chipGroupStyle(EmbeddedChipGroupDense.S.Secondary.style())
        .dimensions {
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(6.0.dp)
            boxMinHeight(40.0.dp)
            alignmentLineHeight(40.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .wrap(::WrapperTextFieldClearS)

public val WrapperTextFieldClearS.RequiredStart: WrapperTextFieldClearSRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearSRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearSRequiredStart)

public val WrapperTextFieldClearS.RequiredEnd: WrapperTextFieldClearSRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearSRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearSRequiredEnd)

public val WrapperTextFieldClearS.OuterLabel: WrapperTextFieldClearSOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearSOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .dimensions {
            labelPadding(4.0.dp)
        }
        .colors {
            labelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearSOuterLabel)

public val WrapperTextFieldClearSOuterLabel.RequiredStart:
    WrapperTextFieldClearSOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearSOuterLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(6.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearSOuterLabelRequiredStart)

public val WrapperTextFieldClearSOuterLabel.RequiredEnd: WrapperTextFieldClearSOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearSOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearSOuterLabelRequiredEnd)

public val WrapperTextFieldClearS.InnerLabel: WrapperTextFieldClearSInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearSInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(4.0.dp)
            boxPaddingBottom(4.0.dp)
            labelPadding(0.0.dp)
        }
        .colors {
            labelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearSInnerLabel)

public val WrapperTextFieldClearSInnerLabel.RequiredStart:
    WrapperTextFieldClearSInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearSInnerLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearSInnerLabelRequiredStart)

public val WrapperTextFieldClearSInnerLabel.RequiredEnd: WrapperTextFieldClearSInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearSInnerLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearSInnerLabelRequiredEnd)

public val TextFieldClear.M: WrapperTextFieldClearM
    @Composable
    @JvmName("WrapperTextFieldClearM")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .chipGroupStyle(EmbeddedChipGroupDense.M.Secondary.style())
        .dimensions {
            boxPaddingTop(12.0.dp)
            boxPaddingBottom(12.0.dp)
            startContentPadding(6.0.dp)
            endContentPadding(8.0.dp)
            boxMinHeight(48.0.dp)
            alignmentLineHeight(48.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .wrap(::WrapperTextFieldClearM)

public val WrapperTextFieldClearM.RequiredStart: WrapperTextFieldClearMRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearMRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearMRequiredStart)

public val WrapperTextFieldClearM.RequiredEnd: WrapperTextFieldClearMRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearMRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearMRequiredEnd)

public val WrapperTextFieldClearM.OuterLabel: WrapperTextFieldClearMOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearMOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .dimensions {
            labelPadding(4.0.dp)
        }
        .colors {
            labelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearMOuterLabel)

public val WrapperTextFieldClearMOuterLabel.RequiredStart:
    WrapperTextFieldClearMOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearMOuterLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(7.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearMOuterLabelRequiredStart)

public val WrapperTextFieldClearMOuterLabel.RequiredEnd: WrapperTextFieldClearMOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearMOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearMOuterLabelRequiredEnd)

public val WrapperTextFieldClearM.InnerLabel: WrapperTextFieldClearMInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearMInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(6.0.dp)
            boxPaddingBottom(6.0.dp)
            labelPadding(2.0.dp)
        }
        .colors {
            labelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearMInnerLabel)

public val WrapperTextFieldClearMInnerLabel.RequiredStart:
    WrapperTextFieldClearMInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearMInnerLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearMInnerLabelRequiredStart)

public val WrapperTextFieldClearMInnerLabel.RequiredEnd: WrapperTextFieldClearMInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearMInnerLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearMInnerLabelRequiredEnd)

public val TextFieldClear.L: WrapperTextFieldClearL
    @Composable
    @JvmName("WrapperTextFieldClearL")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .chipGroupStyle(EmbeddedChipGroupDense.L.Secondary.style())
        .dimensions {
            boxPaddingTop(16.0.dp)
            boxPaddingBottom(16.0.dp)
            startContentPadding(8.0.dp)
            endContentPadding(10.0.dp)
            boxMinHeight(56.0.dp)
            alignmentLineHeight(56.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .wrap(::WrapperTextFieldClearL)

public val WrapperTextFieldClearL.RequiredStart: WrapperTextFieldClearLRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearLRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearLRequiredStart)

public val WrapperTextFieldClearL.RequiredEnd: WrapperTextFieldClearLRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearLRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearLRequiredEnd)

public val WrapperTextFieldClearL.OuterLabel: WrapperTextFieldClearLOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearLOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .dimensions {
            labelPadding(4.0.dp)
        }
        .colors {
            labelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearLOuterLabel)

public val WrapperTextFieldClearLOuterLabel.RequiredStart:
    WrapperTextFieldClearLOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearLOuterLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearLOuterLabelRequiredStart)

public val WrapperTextFieldClearLOuterLabel.RequiredEnd: WrapperTextFieldClearLOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearLOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearLOuterLabelRequiredEnd)

public val WrapperTextFieldClearL.InnerLabel: WrapperTextFieldClearLInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearLInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(9.0.dp)
            boxPaddingBottom(9.0.dp)
            labelPadding(2.0.dp)
        }
        .colors {
            labelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearLInnerLabel)

public val WrapperTextFieldClearLInnerLabel.RequiredStart:
    WrapperTextFieldClearLInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearLInnerLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearLInnerLabelRequiredStart)

public val WrapperTextFieldClearLInnerLabel.RequiredEnd: WrapperTextFieldClearLInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearLInnerLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearLInnerLabelRequiredEnd)

public val TextFieldClear.Xl: WrapperTextFieldClearXl
    @Composable
    @JvmName("WrapperTextFieldClearXl")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .chipGroupStyle(EmbeddedChipGroupDense.Xl.Secondary.style())
        .dimensions {
            boxPaddingTop(20.0.dp)
            boxPaddingBottom(20.0.dp)
            startContentPadding(8.0.dp)
            endContentPadding(10.0.dp)
            boxMinHeight(64.0.dp)
            alignmentLineHeight(64.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .wrap(::WrapperTextFieldClearXl)

public val WrapperTextFieldClearXl.RequiredStart: WrapperTextFieldClearXlRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearXlRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearXlRequiredStart)

public val WrapperTextFieldClearXl.RequiredEnd: WrapperTextFieldClearXlRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearXlRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearXlRequiredEnd)

public val WrapperTextFieldClearXl.OuterLabel: WrapperTextFieldClearXlOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearXlOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .dimensions {
            labelPadding(4.0.dp)
        }
        .colors {
            labelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearXlOuterLabel)

public val WrapperTextFieldClearXlOuterLabel.RequiredStart:
    WrapperTextFieldClearXlOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearXlOuterLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearXlOuterLabelRequiredStart)

public val WrapperTextFieldClearXlOuterLabel.RequiredEnd:
    WrapperTextFieldClearXlOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearXlOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearXlOuterLabelRequiredEnd)

public val WrapperTextFieldClearXl.InnerLabel: WrapperTextFieldClearXlInnerLabel
    @Composable
    @JvmName("WrapperTextFieldClearXlInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(13.0.dp)
            boxPaddingBottom(13.0.dp)
            labelPadding(2.0.dp)
        }
        .colors {
            labelColor(PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive())
        }
        .wrap(::WrapperTextFieldClearXlInnerLabel)

public val WrapperTextFieldClearXlInnerLabel.RequiredStart:
    WrapperTextFieldClearXlInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldClearXlInnerLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearXlInnerLabelRequiredStart)

public val WrapperTextFieldClearXlInnerLabel.RequiredEnd:
    WrapperTextFieldClearXlInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldClearXlInnerLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextFieldClearXlInnerLabelRequiredEnd)
