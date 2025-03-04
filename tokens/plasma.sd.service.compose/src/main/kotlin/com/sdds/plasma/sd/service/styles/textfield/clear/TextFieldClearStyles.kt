// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.plasma.sd.service.styles.textfield.clear

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldClear
import com.sdds.compose.uikit.TextFieldClearStyleBuilder
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.compose.uikit.textFieldClearBuilder
import com.sdds.plasma.sd.service.styles.chip.L
import com.sdds.plasma.sd.service.styles.chip.M
import com.sdds.plasma.sd.service.styles.chip.S
import com.sdds.plasma.sd.service.styles.chip.Secondary
import com.sdds.plasma.sd.service.styles.chip.Xs
import com.sdds.plasma.sd.service.styles.chip.group.Dense
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех врапперов этого стиля
 */
public interface WrapperTextFieldClear : BuilderWrapper<TextFieldStyle, TextFieldClearStyleBuilder>

/**
 * Интерфейс, который реализуют все врапперы вариаций корневого уровня
 * и врапперы их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим врапперам.
 */
public interface WrapperTextFieldClearView : WrapperTextFieldClear

/**
 * Терминальный враппер
 */
@JvmInline
public value class WrapperTextFieldClearTerminate(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClear

/**
 * Враппер для вариации Xs
 */
@JvmInline
public value class WrapperTextFieldClearXs(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации XsRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearXsRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации XsRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearXsRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации XsOuterLabel
 */
@JvmInline
public value class WrapperTextFieldClearXsOuterLabel(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации XsOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearXsOuterLabelRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации XsOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearXsOuterLabelRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации S
 */
@JvmInline
public value class WrapperTextFieldClearS(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации SRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearSRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации SRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearSRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации SOuterLabel
 */
@JvmInline
public value class WrapperTextFieldClearSOuterLabel(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации SOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearSOuterLabelRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации SOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearSOuterLabelRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации SInnerLabel
 */
@JvmInline
public value class WrapperTextFieldClearSInnerLabel(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации SInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearSInnerLabelRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации SInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearSInnerLabelRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации M
 */
@JvmInline
public value class WrapperTextFieldClearM(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации MRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearMRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации MRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearMRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации MOuterLabel
 */
@JvmInline
public value class WrapperTextFieldClearMOuterLabel(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации MOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearMOuterLabelRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации MOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearMOuterLabelRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации MInnerLabel
 */
@JvmInline
public value class WrapperTextFieldClearMInnerLabel(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации MInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearMInnerLabelRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации MInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearMInnerLabelRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации L
 */
@JvmInline
public value class WrapperTextFieldClearL(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации LRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearLRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации LRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearLRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации LOuterLabel
 */
@JvmInline
public value class WrapperTextFieldClearLOuterLabel(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации LOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearLOuterLabelRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации LOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearLOuterLabelRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации LInnerLabel
 */
@JvmInline
public value class WrapperTextFieldClearLInnerLabel(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации LInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldClearLInnerLabelRequiredStart(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

/**
 * Враппер для вариации LInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearLInnerLabelRequiredEnd(
    public override val builder: TextFieldClearStyleBuilder,
) : WrapperTextFieldClearView

public val WrapperTextFieldClearView.Default: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
            )
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
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
            valueColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
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
            valueColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
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
            valueColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
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

private val TextFieldClearStyleBuilder.invariantProps: TextFieldClearStyleBuilder
    @Composable
    get() = this
        .dimensions {
            boxPaddingStart(0.0.dp)
            boxPaddingEnd(0.0.dp)
            optionalPadding(4.0.dp)
            helperTextPadding(4.0.dp)
            chipsPadding(6.0.dp)
        }
        .captionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .chipGroupStyle(ChipGroup.Dense.style())
        .colors {
            optionalColor(
                PlasmaSdServiceTheme.colors.textDefaultTertiary.asInteractive(),
            )
            valueColorReadOnly(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColorReadOnly(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
            )
            indicatorColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColorReadOnly(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
            )
            endContentColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryHover,
                ),
            )
            endContentColorReadOnly(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.multiplyAlpha(0.4f).asInteractive(),
            )
            captionColorReadOnly(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
            )
            counterColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
            )
            cursorColor(
                PlasmaSdServiceTheme.colors.textDefaultAccent.asInteractive(),
            )
            dividerColorReadOnly(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            prefixColor(
                PlasmaSdServiceTheme.colors.textDefaultTertiary.asInteractive(),
            )
            suffixColor(
                PlasmaSdServiceTheme.colors.textDefaultTertiary.asInteractive(),
            )
        }

public val TextFieldClear.Xs: WrapperTextFieldClearXs
    @Composable
    @JvmName("WrapperTextFieldClearXs")
    get() = TextFieldStyle.textFieldClearBuilder(this)
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
        .valueStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearXsOuterLabelRequiredEnd)

public val TextFieldClear.S: WrapperTextFieldClearS
    @Composable
    @JvmName("WrapperTextFieldClearS")
    get() = TextFieldStyle.textFieldClearBuilder(this)
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
        .valueStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearSRequiredEnd)

public val WrapperTextFieldClearS.OuterLabel: WrapperTextFieldClearSOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearSOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(4.0.dp)
        }
        .labelStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearSInnerLabelRequiredEnd)

public val TextFieldClear.M: WrapperTextFieldClearM
    @Composable
    @JvmName("WrapperTextFieldClearM")
    get() = TextFieldStyle.textFieldClearBuilder(this)
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
        .valueStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearMRequiredEnd)

public val WrapperTextFieldClearM.OuterLabel: WrapperTextFieldClearMOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearMOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(4.0.dp)
        }
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearMInnerLabelRequiredEnd)

public val TextFieldClear.L: WrapperTextFieldClearL
    @Composable
    @JvmName("WrapperTextFieldClearL")
    get() = TextFieldStyle.textFieldClearBuilder(this)
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
        .valueStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .chipStyle(EmbeddedChip.L.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearLRequiredEnd)

public val WrapperTextFieldClearL.OuterLabel: WrapperTextFieldClearLOuterLabel
    @Composable
    @JvmName("WrapperTextFieldClearLOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(4.0.dp)
        }
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldClearLInnerLabelRequiredEnd)
