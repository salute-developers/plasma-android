// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.serv.styles.textarea.clear

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextAreaClear
import com.sdds.compose.uikit.TextAreaClearStyleBuilder
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.compose.uikit.textAreaClearBuilder
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chip.S
import com.sdds.serv.styles.chip.Secondary
import com.sdds.serv.styles.chip.Xs
import com.sdds.serv.styles.chip.group.Dense
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех врапперов этого стиля
 */
public interface WrapperTextAreaClear : BuilderWrapper<TextFieldStyle, TextAreaClearStyleBuilder>

/**
 * Интерфейс, который реализуют все врапперы вариаций корневого уровня
 * и врапперы их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим врапперам.
 */
public interface WrapperTextAreaClearView : WrapperTextAreaClear

/**
 * Терминальный враппер
 */
@JvmInline
public value class WrapperTextAreaClearTerminate(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClear

/**
 * Враппер для вариации Xs
 */
@JvmInline
public value class WrapperTextAreaClearXs(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации XsRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearXsRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации XsRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearXsRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации XsOuterLabel
 */
@JvmInline
public value class WrapperTextAreaClearXsOuterLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации XsOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearXsOuterLabelRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации XsOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearXsOuterLabelRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации S
 */
@JvmInline
public value class WrapperTextAreaClearS(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации SRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearSRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации SRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearSRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации SOuterLabel
 */
@JvmInline
public value class WrapperTextAreaClearSOuterLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации SOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearSOuterLabelRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации SOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearSOuterLabelRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации SInnerLabel
 */
@JvmInline
public value class WrapperTextAreaClearSInnerLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации SInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearSInnerLabelRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации SInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearSInnerLabelRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации M
 */
@JvmInline
public value class WrapperTextAreaClearM(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации MRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearMRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации MRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearMRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации MOuterLabel
 */
@JvmInline
public value class WrapperTextAreaClearMOuterLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации MOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearMOuterLabelRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации MOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearMOuterLabelRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации MInnerLabel
 */
@JvmInline
public value class WrapperTextAreaClearMInnerLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации MInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearMInnerLabelRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации MInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearMInnerLabelRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации L
 */
@JvmInline
public value class WrapperTextAreaClearL(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации LRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearLRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации LRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearLRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации LOuterLabel
 */
@JvmInline
public value class WrapperTextAreaClearLOuterLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации LOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearLOuterLabelRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации LOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearLOuterLabelRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации LInnerLabel
 */
@JvmInline
public value class WrapperTextAreaClearLInnerLabel(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации LInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaClearLInnerLabelRequiredStart(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

/**
 * Враппер для вариации LInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaClearLInnerLabelRequiredEnd(
    public override val builder: TextAreaClearStyleBuilder,
) : WrapperTextAreaClearView

public val WrapperTextAreaClearView.Default: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            captionColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            dividerColor(
                SddsServTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

public val WrapperTextAreaClearView.Warning: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultSecondary,
                ),
            )
            dividerColor(
                SddsServTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

public val WrapperTextAreaClearView.Error: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultSecondary,
                ),
            )
            dividerColor(
                SddsServTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

private val TextAreaClearStyleBuilder.invariantProps: TextAreaClearStyleBuilder
    @Composable
    get() = this
        .dimensions {
            boxPaddingStart(0.0.dp)
            boxPaddingEnd(0.0.dp)
            optionalPadding(4.0.dp)
            helperTextPadding(4.0.dp)
            chipsPadding(6.0.dp)
        }
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .chipGroupStyle(ChipGroup.Dense.style())
        .colors {
            optionalColor(
                SddsServTheme.colors.textDefaultTertiary.asInteractive(),
            )
            valueColorReadOnly(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColorReadOnly(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            indicatorColor(
                SddsServTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColorReadOnly(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            endContentColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                ),
            )
            endContentColorReadOnly(
                SddsServTheme.colors.textDefaultSecondary.multiplyAlpha(0.4f).asInteractive(),
            )
            captionColorReadOnly(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            counterColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            cursorColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(),
            )
            dividerColorReadOnly(
                SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            prefixColor(
                SddsServTheme.colors.textDefaultTertiary.asInteractive(),
            )
            suffixColor(
                SddsServTheme.colors.textDefaultTertiary.asInteractive(),
            )
        }

public val TextAreaClear.Xs: WrapperTextAreaClearXs
    @Composable
    @JvmName("WrapperTextAreaClearXs")
    get() = TextFieldStyle.textAreaClearBuilder(this)
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
        .valueStyle(SddsServTheme.typography.bodyXsNormal)
        .prefixStyle(SddsServTheme.typography.bodyXsNormal)
        .suffixStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodyXsNormal)
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearXsOuterLabelRequiredEnd)

public val TextAreaClear.S: WrapperTextAreaClearS
    @Composable
    @JvmName("WrapperTextAreaClearS")
    get() = TextFieldStyle.textAreaClearBuilder(this)
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
        .valueStyle(SddsServTheme.typography.bodySNormal)
        .prefixStyle(SddsServTheme.typography.bodySNormal)
        .suffixStyle(SddsServTheme.typography.bodySNormal)
        .placeholderStyle(SddsServTheme.typography.bodySNormal)
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearSRequiredEnd)

public val WrapperTextAreaClearS.OuterLabel: WrapperTextAreaClearSOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearSOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(4.0.dp)
        }
        .labelStyle(SddsServTheme.typography.bodySNormal)
        .optionalStyle(SddsServTheme.typography.bodySNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearSInnerLabelRequiredEnd)

public val TextAreaClear.M: WrapperTextAreaClearM
    @Composable
    @JvmName("WrapperTextAreaClearM")
    get() = TextFieldStyle.textAreaClearBuilder(this)
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
        .valueStyle(SddsServTheme.typography.bodyMNormal)
        .prefixStyle(SddsServTheme.typography.bodyMNormal)
        .suffixStyle(SddsServTheme.typography.bodyMNormal)
        .placeholderStyle(SddsServTheme.typography.bodyMNormal)
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearMRequiredEnd)

public val WrapperTextAreaClearM.OuterLabel: WrapperTextAreaClearMOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearMOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(4.0.dp)
        }
        .labelStyle(SddsServTheme.typography.bodyMNormal)
        .optionalStyle(SddsServTheme.typography.bodyMNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearMInnerLabelRequiredEnd)

public val TextAreaClear.L: WrapperTextAreaClearL
    @Composable
    @JvmName("WrapperTextAreaClearL")
    get() = TextFieldStyle.textAreaClearBuilder(this)
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
        .valueStyle(SddsServTheme.typography.bodyLNormal)
        .prefixStyle(SddsServTheme.typography.bodyLNormal)
        .suffixStyle(SddsServTheme.typography.bodyLNormal)
        .placeholderStyle(SddsServTheme.typography.bodyLNormal)
        .chipStyle(EmbeddedChip.L.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearLRequiredEnd)

public val WrapperTextAreaClearL.OuterLabel: WrapperTextAreaClearLOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearLOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(4.0.dp)
        }
        .labelStyle(SddsServTheme.typography.bodyLNormal)
        .optionalStyle(SddsServTheme.typography.bodyLNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
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
        .fieldType(TextField.FieldType.RequiredStart)
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
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaClearLInnerLabelRequiredEnd)
