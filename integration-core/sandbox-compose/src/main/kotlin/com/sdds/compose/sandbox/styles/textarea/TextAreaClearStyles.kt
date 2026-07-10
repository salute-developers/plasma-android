// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.textarea

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.styles.chipgroup.EmbeddedChipGroupDense
import com.sdds.compose.sandbox.styles.chipgroup.L
import com.sdds.compose.sandbox.styles.chipgroup.M
import com.sdds.compose.sandbox.styles.chipgroup.S
import com.sdds.compose.sandbox.styles.chipgroup.Secondary
import com.sdds.compose.sandbox.styles.chipgroup.Xl
import com.sdds.compose.sandbox.styles.chipgroup.Xs
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
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
            startContentColor(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
            valueColor(SddsSandboxTheme.colors.textDefaultPrimary.asInteractive())
            captionColor(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
            placeholderColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.textDefaultTertiary,
                ),
            )
            dividerColor(
                SddsSandboxTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

public val WrapperTextAreaClearView.Warning: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsSandboxTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.textDefaultSecondary,
                ),
            )
            valueColor(
                SddsSandboxTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.textDefaultPrimary,
                ),
            )
            captionColor(
                SddsSandboxTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.textDefaultSecondary,
                ),
            )
            placeholderColor(
                SddsSandboxTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.textDefaultTertiary,
                ),
            )
            dividerColor(
                SddsSandboxTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

public val WrapperTextAreaClearView.Error: WrapperTextAreaClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsSandboxTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.textDefaultSecondary,
                ),
            )
            valueColor(
                SddsSandboxTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.textDefaultPrimary,
                ),
            )
            captionColor(
                SddsSandboxTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.textDefaultSecondary,
                ),
            )
            placeholderColor(
                SddsSandboxTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.textDefaultTertiary,
                ),
            )
            dividerColor(
                SddsSandboxTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsSandboxTheme.colors.surfaceDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTextAreaClearTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
        .captionStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .counterStyle(SddsSandboxTheme.typography.bodyXsNormal)
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
            cursorColor(SddsSandboxTheme.colors.textDefaultAccent.asInteractive())
            startContentColorReadOnly(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
            endContentColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textDefaultSecondaryHover,
                ),
            )
            endContentColorReadOnly(SddsSandboxTheme.colors.textDefaultSecondary.multiplyAlpha(0.4f).asInteractive())
            valueColorReadOnly(SddsSandboxTheme.colors.textDefaultPrimary.asInteractive())
            captionColorReadOnly(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
            optionalColor(SddsSandboxTheme.colors.textDefaultTertiary.asInteractive())
            counterColor(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
            placeholderColorReadOnly(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
            dividerColorReadOnly(SddsSandboxTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
            indicatorColor(SddsSandboxTheme.colors.surfaceDefaultNegative.asInteractive())
            prefixColor(SddsSandboxTheme.colors.textDefaultTertiary.asInteractive())
            suffixColor(SddsSandboxTheme.colors.textDefaultTertiary.asInteractive())
        }

public val TextAreaClear.Xs: WrapperTextAreaClearXs
    @Composable
    @JvmName("WrapperTextAreaClearXs")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .prefixStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .suffixStyle(SddsSandboxTheme.typography.bodyXsNormal)
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
        .wrap(::WrapperTextAreaClearXs)

public val WrapperTextAreaClearXs.RequiredStart: WrapperTextAreaClearXsRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearXsRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(13.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearXsRequiredStart)

public val WrapperTextAreaClearXs.RequiredEnd: WrapperTextAreaClearXsRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearXsRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(13.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearXsRequiredEnd)

public val WrapperTextAreaClearXs.OuterLabel: WrapperTextAreaClearXsOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearXsOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .optionalStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            labelPadding(2.0.dp)
        }
        .colors {
            labelColor(SddsSandboxTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextAreaClearXsOuterLabel)

public val WrapperTextAreaClearXsOuterLabel.RequiredStart:
    WrapperTextAreaClearXsOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearXsOuterLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearXsOuterLabelRequiredStart)

public val WrapperTextAreaClearXsOuterLabel.RequiredEnd: WrapperTextAreaClearXsOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearXsOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(2.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearXsOuterLabelRequiredEnd)

public val TextAreaClear.S: WrapperTextAreaClearS
    @Composable
    @JvmName("WrapperTextAreaClearS")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(SddsSandboxTheme.typography.bodySNormal)
        .placeholderStyle(SddsSandboxTheme.typography.bodySNormal)
        .prefixStyle(SddsSandboxTheme.typography.bodySNormal)
        .suffixStyle(SddsSandboxTheme.typography.bodySNormal)
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
        .wrap(::WrapperTextAreaClearS)

public val WrapperTextAreaClearS.RequiredStart: WrapperTextAreaClearSRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearSRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearSRequiredStart)

public val WrapperTextAreaClearS.RequiredEnd: WrapperTextAreaClearSRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearSRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearSRequiredEnd)

public val WrapperTextAreaClearS.OuterLabel: WrapperTextAreaClearSOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearSOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(SddsSandboxTheme.typography.bodySNormal)
        .optionalStyle(SddsSandboxTheme.typography.bodySNormal)
        .dimensions {
            labelPadding(4.0.dp)
        }
        .colors {
            labelColor(SddsSandboxTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextAreaClearSOuterLabel)

public val WrapperTextAreaClearSOuterLabel.RequiredStart:
    WrapperTextAreaClearSOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearSOuterLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(6.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearSOuterLabelRequiredStart)

public val WrapperTextAreaClearSOuterLabel.RequiredEnd: WrapperTextAreaClearSOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearSOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearSOuterLabelRequiredEnd)

public val WrapperTextAreaClearS.InnerLabel: WrapperTextAreaClearSInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearSInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .optionalStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(4.0.dp)
            boxPaddingBottom(4.0.dp)
            labelPadding(0.0.dp)
        }
        .colors {
            labelColor(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
        }
        .wrap(::WrapperTextAreaClearSInnerLabel)

public val WrapperTextAreaClearSInnerLabel.RequiredStart:
    WrapperTextAreaClearSInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearSInnerLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearSInnerLabelRequiredStart)

public val WrapperTextAreaClearSInnerLabel.RequiredEnd: WrapperTextAreaClearSInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearSInnerLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(17.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearSInnerLabelRequiredEnd)

public val TextAreaClear.M: WrapperTextAreaClearM
    @Composable
    @JvmName("WrapperTextAreaClearM")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(SddsSandboxTheme.typography.bodyMNormal)
        .placeholderStyle(SddsSandboxTheme.typography.bodyMNormal)
        .prefixStyle(SddsSandboxTheme.typography.bodyMNormal)
        .suffixStyle(SddsSandboxTheme.typography.bodyMNormal)
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
        .wrap(::WrapperTextAreaClearM)

public val WrapperTextAreaClearM.RequiredStart: WrapperTextAreaClearMRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearMRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearMRequiredStart)

public val WrapperTextAreaClearM.RequiredEnd: WrapperTextAreaClearMRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearMRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearMRequiredEnd)

public val WrapperTextAreaClearM.OuterLabel: WrapperTextAreaClearMOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearMOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(SddsSandboxTheme.typography.bodyMNormal)
        .optionalStyle(SddsSandboxTheme.typography.bodyMNormal)
        .dimensions {
            labelPadding(4.0.dp)
        }
        .colors {
            labelColor(SddsSandboxTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextAreaClearMOuterLabel)

public val WrapperTextAreaClearMOuterLabel.RequiredStart:
    WrapperTextAreaClearMOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearMOuterLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(7.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearMOuterLabelRequiredStart)

public val WrapperTextAreaClearMOuterLabel.RequiredEnd: WrapperTextAreaClearMOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearMOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearMOuterLabelRequiredEnd)

public val WrapperTextAreaClearM.InnerLabel: WrapperTextAreaClearMInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearMInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .optionalStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(6.0.dp)
            boxPaddingBottom(6.0.dp)
            labelPadding(2.0.dp)
        }
        .colors {
            labelColor(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
        }
        .wrap(::WrapperTextAreaClearMInnerLabel)

public val WrapperTextAreaClearMInnerLabel.RequiredStart:
    WrapperTextAreaClearMInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearMInnerLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearMInnerLabelRequiredStart)

public val WrapperTextAreaClearMInnerLabel.RequiredEnd: WrapperTextAreaClearMInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearMInnerLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(20.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearMInnerLabelRequiredEnd)

public val TextAreaClear.L: WrapperTextAreaClearL
    @Composable
    @JvmName("WrapperTextAreaClearL")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(SddsSandboxTheme.typography.bodyLNormal)
        .placeholderStyle(SddsSandboxTheme.typography.bodyLNormal)
        .prefixStyle(SddsSandboxTheme.typography.bodyLNormal)
        .suffixStyle(SddsSandboxTheme.typography.bodyLNormal)
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
        .wrap(::WrapperTextAreaClearL)

public val WrapperTextAreaClearL.RequiredStart: WrapperTextAreaClearLRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearLRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearLRequiredStart)

public val WrapperTextAreaClearL.RequiredEnd: WrapperTextAreaClearLRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearLRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearLRequiredEnd)

public val WrapperTextAreaClearL.OuterLabel: WrapperTextAreaClearLOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearLOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(SddsSandboxTheme.typography.bodyLNormal)
        .optionalStyle(SddsSandboxTheme.typography.bodyLNormal)
        .dimensions {
            labelPadding(4.0.dp)
        }
        .colors {
            labelColor(SddsSandboxTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextAreaClearLOuterLabel)

public val WrapperTextAreaClearLOuterLabel.RequiredStart:
    WrapperTextAreaClearLOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearLOuterLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearLOuterLabelRequiredStart)

public val WrapperTextAreaClearLOuterLabel.RequiredEnd: WrapperTextAreaClearLOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearLOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearLOuterLabelRequiredEnd)

public val WrapperTextAreaClearL.InnerLabel: WrapperTextAreaClearLInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearLInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .optionalStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(9.0.dp)
            boxPaddingBottom(9.0.dp)
            labelPadding(2.0.dp)
        }
        .colors {
            labelColor(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
        }
        .wrap(::WrapperTextAreaClearLInnerLabel)

public val WrapperTextAreaClearLInnerLabel.RequiredStart:
    WrapperTextAreaClearLInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearLInnerLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearLInnerLabelRequiredStart)

public val WrapperTextAreaClearLInnerLabel.RequiredEnd: WrapperTextAreaClearLInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearLInnerLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(24.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearLInnerLabelRequiredEnd)

public val TextAreaClear.Xl: WrapperTextAreaClearXl
    @Composable
    @JvmName("WrapperTextAreaClearXl")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(SddsSandboxTheme.typography.bodyLNormal)
        .placeholderStyle(SddsSandboxTheme.typography.bodyLNormal)
        .prefixStyle(SddsSandboxTheme.typography.bodyLNormal)
        .suffixStyle(SddsSandboxTheme.typography.bodyLNormal)
        .chipGroupStyle(EmbeddedChipGroupDense.Xl.Secondary.style())
        .dimensions {
            boxPaddingTop(21.0.dp)
            boxPaddingBottom(21.0.dp)
            startContentPadding(8.0.dp)
            endContentPadding(10.0.dp)
            boxMinHeight(64.0.dp)
            alignmentLineHeight(64.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .wrap(::WrapperTextAreaClearXl)

public val WrapperTextAreaClearXl.RequiredStart: WrapperTextAreaClearXlRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearXlRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearXlRequiredStart)

public val WrapperTextAreaClearXl.RequiredEnd: WrapperTextAreaClearXlRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearXlRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearXlRequiredEnd)

public val WrapperTextAreaClearXl.OuterLabel: WrapperTextAreaClearXlOuterLabel
    @Composable
    @JvmName("WrapperTextAreaClearXlOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(SddsSandboxTheme.typography.bodyLNormal)
        .optionalStyle(SddsSandboxTheme.typography.bodyLNormal)
        .dimensions {
            labelPadding(4.0.dp)
        }
        .colors {
            labelColor(SddsSandboxTheme.colors.textDefaultPrimary.asInteractive())
        }
        .wrap(::WrapperTextAreaClearXlOuterLabel)

public val WrapperTextAreaClearXlOuterLabel.RequiredStart:
    WrapperTextAreaClearXlOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearXlOuterLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearXlOuterLabelRequiredStart)

public val WrapperTextAreaClearXlOuterLabel.RequiredEnd: WrapperTextAreaClearXlOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearXlOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearXlOuterLabelRequiredEnd)

public val WrapperTextAreaClearXl.InnerLabel: WrapperTextAreaClearXlInnerLabel
    @Composable
    @JvmName("WrapperTextAreaClearXlInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .optionalStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(9.0.dp)
            boxPaddingBottom(9.0.dp)
            labelPadding(2.0.dp)
        }
        .colors {
            labelColor(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
        }
        .wrap(::WrapperTextAreaClearXlInnerLabel)

public val WrapperTextAreaClearXlInnerLabel.RequiredStart:
    WrapperTextAreaClearXlInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaClearXlInnerLabelRequiredStart")
    get() = builder
        .fieldType(TextFieldType.RequiredStart)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearXlInnerLabelRequiredStart)

public val WrapperTextAreaClearXlInnerLabel.RequiredEnd: WrapperTextAreaClearXlInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaClearXlInnerLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(28.0.dp)
                indicatorSize(8.0.dp)
            }
        }
        .wrap(::WrapperTextAreaClearXlInnerLabelRequiredEnd)
