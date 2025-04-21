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
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.styles.chipgroup.EmbeddedChipGroupDense
import com.sdds.stylessalute.styles.chipgroup.L
import com.sdds.stylessalute.styles.chipgroup.M
import com.sdds.stylessalute.styles.chipgroup.S
import com.sdds.stylessalute.styles.chipgroup.Secondary
import com.sdds.stylessalute.styles.chipgroup.Xs
import com.sdds.stylessalute.theme.StylesSaluteTheme
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

public val WrapperTextAreaClearView.Default: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
            captionColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
            dividerColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.surfaceDefaultAccentMain,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

public val WrapperTextAreaClearView.Warning: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultSecondary,
                ),
            )
            dividerColor(
                StylesSaluteTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.surfaceDefaultAccentMain,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

public val WrapperTextAreaClearView.Error: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            valueColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultPrimary,
                ),
            )
            placeholderColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultTertiary,
                ),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultSecondary,
                ),
            )
            captionColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.textDefaultSecondary,
                ),
            )
            dividerColor(
                StylesSaluteTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to StylesSaluteTheme.colors.surfaceDefaultAccentMain,
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
        .captionStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .counterStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
        .colors {
            optionalColor(
                StylesSaluteTheme.colors.textDefaultTertiary.asInteractive(),
            )
            valueColorReadOnly(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColorReadOnly(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
            indicatorColor(
                StylesSaluteTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColorReadOnly(
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
            cursorColor(
                StylesSaluteTheme.colors.textDefaultAccentMain.asInteractive(),
            )
            dividerColorReadOnly(
                StylesSaluteTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            prefixColor(
                StylesSaluteTheme.colors.textDefaultTertiary.asInteractive(),
            )
            suffixColor(
                StylesSaluteTheme.colors.textDefaultTertiary.asInteractive(),
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
        .valueStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .prefixStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .suffixStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .placeholderStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .chipGroupStyle(EmbeddedChipGroupDense.Xs.Secondary.style())
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
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
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
        .valueStyle(StylesSaluteTheme.typography.bodySNormal)
        .prefixStyle(StylesSaluteTheme.typography.bodySNormal)
        .suffixStyle(StylesSaluteTheme.typography.bodySNormal)
        .placeholderStyle(StylesSaluteTheme.typography.bodySNormal)
        .chipGroupStyle(EmbeddedChipGroupDense.S.Secondary.style())
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
        .labelStyle(StylesSaluteTheme.typography.bodySNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodySNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
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
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
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
        .valueStyle(StylesSaluteTheme.typography.bodyMNormal)
        .prefixStyle(StylesSaluteTheme.typography.bodyMNormal)
        .suffixStyle(StylesSaluteTheme.typography.bodyMNormal)
        .placeholderStyle(StylesSaluteTheme.typography.bodyMNormal)
        .chipGroupStyle(EmbeddedChipGroupDense.M.Secondary.style())
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
        .labelStyle(StylesSaluteTheme.typography.bodyMNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyMNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
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
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
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
        .valueStyle(StylesSaluteTheme.typography.bodyLNormal)
        .prefixStyle(StylesSaluteTheme.typography.bodyLNormal)
        .suffixStyle(StylesSaluteTheme.typography.bodyLNormal)
        .placeholderStyle(StylesSaluteTheme.typography.bodyLNormal)
        .chipGroupStyle(EmbeddedChipGroupDense.L.Secondary.style())
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
        .labelStyle(StylesSaluteTheme.typography.bodyLNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyLNormal)
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
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
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .optionalStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
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
