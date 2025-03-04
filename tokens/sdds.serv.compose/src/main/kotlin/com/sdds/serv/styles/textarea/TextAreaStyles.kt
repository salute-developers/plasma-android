// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.serv.styles.textarea

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextAreaStyleBuilder
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.compose.uikit.textAreaBuilder
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
public interface WrapperTextArea : BuilderWrapper<TextFieldStyle, TextAreaStyleBuilder>

/**
 * Интерфейс, который реализуют все врапперы вариаций корневого уровня
 * и врапперы их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим врапперам.
 */
public interface WrapperTextAreaView : WrapperTextArea

/**
 * Терминальный враппер
 */
@JvmInline
public value class WrapperTextAreaTerminate(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextArea

/**
 * Враппер для вариации Xs
 */
@JvmInline
public value class WrapperTextAreaXs(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации XsRequiredStart
 */
@JvmInline
public value class WrapperTextAreaXsRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации XsRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaXsRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации XsOuterLabel
 */
@JvmInline
public value class WrapperTextAreaXsOuterLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации XsOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaXsOuterLabelRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации XsOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaXsOuterLabelRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации S
 */
@JvmInline
public value class WrapperTextAreaS(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации SRequiredStart
 */
@JvmInline
public value class WrapperTextAreaSRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации SRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaSRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации SOuterLabel
 */
@JvmInline
public value class WrapperTextAreaSOuterLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации SOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaSOuterLabelRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации SOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaSOuterLabelRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации SInnerLabel
 */
@JvmInline
public value class WrapperTextAreaSInnerLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации SInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaSInnerLabelRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации SInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaSInnerLabelRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации M
 */
@JvmInline
public value class WrapperTextAreaM(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации MRequiredStart
 */
@JvmInline
public value class WrapperTextAreaMRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации MRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaMRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации MOuterLabel
 */
@JvmInline
public value class WrapperTextAreaMOuterLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации MOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaMOuterLabelRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации MOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaMOuterLabelRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации MInnerLabel
 */
@JvmInline
public value class WrapperTextAreaMInnerLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации MInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaMInnerLabelRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации MInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaMInnerLabelRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации L
 */
@JvmInline
public value class WrapperTextAreaL(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации LRequiredStart
 */
@JvmInline
public value class WrapperTextAreaLRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации LRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaLRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации LOuterLabel
 */
@JvmInline
public value class WrapperTextAreaLOuterLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации LOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaLOuterLabelRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации LOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaLOuterLabelRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации LInnerLabel
 */
@JvmInline
public value class WrapperTextAreaLInnerLabel(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации LInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextAreaLInnerLabelRequiredStart(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

/**
 * Враппер для вариации LInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextAreaLInnerLabelRequiredEnd(
    public override val builder: TextAreaStyleBuilder,
) : WrapperTextAreaView

public val WrapperTextAreaView.Default: WrapperTextAreaTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextAreaTerminate)

public val WrapperTextAreaView.Warning: WrapperTextAreaTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultSecondary,
                ),
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextAreaTerminate)

public val WrapperTextAreaView.Error: WrapperTextAreaTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultSecondary,
                ),
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextAreaTerminate)

private val TextAreaStyleBuilder.invariantProps: TextAreaStyleBuilder
    @Composable
    get() = this
        .dimensions {
            optionalPadding(4.0.dp)
            chipsPadding(6.0.dp)
        }
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .chipGroupStyle(ChipGroup.Dense.style())
        .colors {
            optionalColor(
                SddsServTheme.colors.textDefaultTertiary.asInteractive(),
            )
            valueColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultTertiary,
                ),
            )
            indicatorColor(
                SddsServTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColor(
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
            backgroundColorReadOnly(
                SddsServTheme.colors.surfaceDefaultSolidPrimary.multiplyAlpha(0.4f).asInteractive(),
            )
            cursorColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(),
            )
            prefixColor(
                SddsServTheme.colors.textDefaultTertiary.asInteractive(),
            )
            suffixColor(
                SddsServTheme.colors.textDefaultTertiary.asInteractive(),
            )
        }
        .scrollBar {
            scrollBarThickness(2.0.dp)
            scrollBarPaddingTop(18.0.dp)
            scrollBarPaddingBottom(36.0.dp)
            scrollBarPaddingEnd(2.0.dp)
            scrollBarTrackColor(
                SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            scrollBarThumbColor(
                SddsServTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }

public val TextArea.Xs: WrapperTextAreaXs
    @Composable
    @JvmName("WrapperTextAreaXs")
    get() = TextFieldStyle.textAreaBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS.adjustBy(all = 0.0.dp))
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
        .valueStyle(SddsServTheme.typography.bodyXsNormal)
        .prefixStyle(SddsServTheme.typography.bodyXsNormal)
        .suffixStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodyXsNormal)
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaXs)

public val WrapperTextAreaXs.RequiredStart: WrapperTextAreaXsRequiredStart
    @Composable
    @JvmName("WrapperTextAreaXsRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaXsRequiredStart)

public val WrapperTextAreaXs.RequiredEnd: WrapperTextAreaXsRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaXsRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaXsOuterLabel)

public val WrapperTextAreaXsOuterLabel.RequiredStart: WrapperTextAreaXsOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaXsOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaXsOuterLabelRequiredStart)

public val WrapperTextAreaXsOuterLabel.RequiredEnd: WrapperTextAreaXsOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaXsOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(2.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaXsOuterLabelRequiredEnd)

public val TextArea.S: WrapperTextAreaS
    @Composable
    @JvmName("WrapperTextAreaS")
    get() = TextFieldStyle.textAreaBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
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
        .valueStyle(SddsServTheme.typography.bodySNormal)
        .prefixStyle(SddsServTheme.typography.bodySNormal)
        .suffixStyle(SddsServTheme.typography.bodySNormal)
        .placeholderStyle(SddsServTheme.typography.bodySNormal)
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaS)

public val WrapperTextAreaS.RequiredStart: WrapperTextAreaSRequiredStart
    @Composable
    @JvmName("WrapperTextAreaSRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaSRequiredStart)

public val WrapperTextAreaS.RequiredEnd: WrapperTextAreaSRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaSRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaSRequiredEnd)

public val WrapperTextAreaS.OuterLabel: WrapperTextAreaSOuterLabel
    @Composable
    @JvmName("WrapperTextAreaSOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(8.0.dp)
        }
        .labelStyle(SddsServTheme.typography.bodySNormal)
        .optionalStyle(SddsServTheme.typography.bodySNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaSOuterLabel)

public val WrapperTextAreaSOuterLabel.RequiredStart: WrapperTextAreaSOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaSOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(6.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaSOuterLabelRequiredStart)

public val WrapperTextAreaSOuterLabel.RequiredEnd: WrapperTextAreaSOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaSOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaSInnerLabel)

public val WrapperTextAreaSInnerLabel.RequiredStart: WrapperTextAreaSInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaSInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaSInnerLabelRequiredStart)

public val WrapperTextAreaSInnerLabel.RequiredEnd: WrapperTextAreaSInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaSInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaSInnerLabelRequiredEnd)

public val TextArea.M: WrapperTextAreaM
    @Composable
    @JvmName("WrapperTextAreaM")
    get() = TextFieldStyle.textAreaBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
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
        .valueStyle(SddsServTheme.typography.bodyMNormal)
        .prefixStyle(SddsServTheme.typography.bodyMNormal)
        .suffixStyle(SddsServTheme.typography.bodyMNormal)
        .placeholderStyle(SddsServTheme.typography.bodyMNormal)
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaM)

public val WrapperTextAreaM.RequiredStart: WrapperTextAreaMRequiredStart
    @Composable
    @JvmName("WrapperTextAreaMRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaMRequiredStart)

public val WrapperTextAreaM.RequiredEnd: WrapperTextAreaMRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaMRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaMRequiredEnd)

public val WrapperTextAreaM.OuterLabel: WrapperTextAreaMOuterLabel
    @Composable
    @JvmName("WrapperTextAreaMOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(10.0.dp)
        }
        .labelStyle(SddsServTheme.typography.bodyMNormal)
        .optionalStyle(SddsServTheme.typography.bodyMNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaMOuterLabel)

public val WrapperTextAreaMOuterLabel.RequiredStart: WrapperTextAreaMOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaMOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(7.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaMOuterLabelRequiredStart)

public val WrapperTextAreaMOuterLabel.RequiredEnd: WrapperTextAreaMOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaMOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaMInnerLabel)

public val WrapperTextAreaMInnerLabel.RequiredStart: WrapperTextAreaMInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaMInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaMInnerLabelRequiredStart)

public val WrapperTextAreaMInnerLabel.RequiredEnd: WrapperTextAreaMInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaMInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaMInnerLabelRequiredEnd)

public val TextArea.L: WrapperTextAreaL
    @Composable
    @JvmName("WrapperTextAreaL")
    get() = TextFieldStyle.textAreaBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = 2.0.dp))
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
        .valueStyle(SddsServTheme.typography.bodyLNormal)
        .prefixStyle(SddsServTheme.typography.bodyLNormal)
        .suffixStyle(SddsServTheme.typography.bodyLNormal)
        .placeholderStyle(SddsServTheme.typography.bodyLNormal)
        .chipStyle(EmbeddedChip.L.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextAreaL)

public val WrapperTextAreaL.RequiredStart: WrapperTextAreaLRequiredStart
    @Composable
    @JvmName("WrapperTextAreaLRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaLRequiredStart)

public val WrapperTextAreaL.RequiredEnd: WrapperTextAreaLRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaLRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaLRequiredEnd)

public val WrapperTextAreaL.OuterLabel: WrapperTextAreaLOuterLabel
    @Composable
    @JvmName("WrapperTextAreaLOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(12.0.dp)
        }
        .labelStyle(SddsServTheme.typography.bodyLNormal)
        .optionalStyle(SddsServTheme.typography.bodyLNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaLOuterLabel)

public val WrapperTextAreaLOuterLabel.RequiredStart: WrapperTextAreaLOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaLOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaLOuterLabelRequiredStart)

public val WrapperTextAreaLOuterLabel.RequiredEnd: WrapperTextAreaLOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaLOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextAreaLInnerLabel)

public val WrapperTextAreaLInnerLabel.RequiredStart: WrapperTextAreaLInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextAreaLInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextAreaLInnerLabelRequiredStart)

public val WrapperTextAreaLInnerLabel.RequiredEnd: WrapperTextAreaLInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextAreaLInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextAreaLInnerLabelRequiredEnd)
