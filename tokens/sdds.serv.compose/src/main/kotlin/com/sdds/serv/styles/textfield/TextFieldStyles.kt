// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.serv.styles.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.compose.uikit.textFieldBuilder
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
public interface WrapperTextField : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

/**
 * Интерфейс, который реализуют все врапперы вариаций корневого уровня
 * и врапперы их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим врапперам.
 */
public interface WrapperTextFieldView : WrapperTextField

/**
 * Терминальный враппер
 */
@JvmInline
public value class WrapperTextFieldTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextField

/**
 * Враппер для вариации Xs
 */
@JvmInline
public value class WrapperTextFieldXs(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации XsRequiredStart
 */
@JvmInline
public value class WrapperTextFieldXsRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации XsRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldXsRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации XsOuterLabel
 */
@JvmInline
public value class WrapperTextFieldXsOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации XsOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldXsOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации XsOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldXsOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации S
 */
@JvmInline
public value class WrapperTextFieldS(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации SRequiredStart
 */
@JvmInline
public value class WrapperTextFieldSRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации SRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldSRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации SOuterLabel
 */
@JvmInline
public value class WrapperTextFieldSOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации SOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldSOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации SOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldSOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации SInnerLabel
 */
@JvmInline
public value class WrapperTextFieldSInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации SInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldSInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации SInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldSInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации M
 */
@JvmInline
public value class WrapperTextFieldM(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации MRequiredStart
 */
@JvmInline
public value class WrapperTextFieldMRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации MRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldMRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации MOuterLabel
 */
@JvmInline
public value class WrapperTextFieldMOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации MOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldMOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации MOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldMOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации MInnerLabel
 */
@JvmInline
public value class WrapperTextFieldMInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации MInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldMInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации MInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldMInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации L
 */
@JvmInline
public value class WrapperTextFieldL(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации LRequiredStart
 */
@JvmInline
public value class WrapperTextFieldLRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации LRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldLRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации LOuterLabel
 */
@JvmInline
public value class WrapperTextFieldLOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации LOuterLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldLOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации LOuterLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldLOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации LInnerLabel
 */
@JvmInline
public value class WrapperTextFieldLInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации LInnerLabelRequiredStart
 */
@JvmInline
public value class WrapperTextFieldLInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

/**
 * Враппер для вариации LInnerLabelRequiredEnd
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
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextFieldTerminate)

public val WrapperTextFieldView.Success: WrapperTextFieldTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.textDefaultSecondary,
                ),
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextFieldTerminate)

public val WrapperTextFieldView.Warning: WrapperTextFieldTerminate
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
        .wrap(::WrapperTextFieldTerminate)

public val WrapperTextFieldView.Error: WrapperTextFieldTerminate
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
        .wrap(::WrapperTextFieldTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .dimensions {
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

public val TextField.Xs: WrapperTextFieldXs
    @Composable
    @JvmName("WrapperTextFieldXs")
    get() = TextFieldStyle.textFieldBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS.adjustBy(all = 0.0.dp))
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
        .valueStyle(SddsServTheme.typography.bodyXsNormal)
        .prefixStyle(SddsServTheme.typography.bodyXsNormal)
        .suffixStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodyXsNormal)
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextFieldXs)

public val WrapperTextFieldXs.RequiredStart: WrapperTextFieldXsRequiredStart
    @Composable
    @JvmName("WrapperTextFieldXsRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldXsRequiredStart)

public val WrapperTextFieldXs.RequiredEnd: WrapperTextFieldXsRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldXsRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldXsOuterLabel)

public val WrapperTextFieldXsOuterLabel.RequiredStart: WrapperTextFieldXsOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldXsOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldXsOuterLabelRequiredStart)

public val WrapperTextFieldXsOuterLabel.RequiredEnd: WrapperTextFieldXsOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldXsOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(2.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldXsOuterLabelRequiredEnd)

public val TextField.S: WrapperTextFieldS
    @Composable
    @JvmName("WrapperTextFieldS")
    get() = TextFieldStyle.textFieldBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
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
        .valueStyle(SddsServTheme.typography.bodySNormal)
        .prefixStyle(SddsServTheme.typography.bodySNormal)
        .suffixStyle(SddsServTheme.typography.bodySNormal)
        .placeholderStyle(SddsServTheme.typography.bodySNormal)
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextFieldS)

public val WrapperTextFieldS.RequiredStart: WrapperTextFieldSRequiredStart
    @Composable
    @JvmName("WrapperTextFieldSRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldSRequiredStart)

public val WrapperTextFieldS.RequiredEnd: WrapperTextFieldSRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldSRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldSRequiredEnd)

public val WrapperTextFieldS.OuterLabel: WrapperTextFieldSOuterLabel
    @Composable
    @JvmName("WrapperTextFieldSOuterLabel")
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
        .wrap(::WrapperTextFieldSOuterLabel)

public val WrapperTextFieldSOuterLabel.RequiredStart: WrapperTextFieldSOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldSOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(6.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldSOuterLabelRequiredStart)

public val WrapperTextFieldSOuterLabel.RequiredEnd: WrapperTextFieldSOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldSOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldSInnerLabel)

public val WrapperTextFieldSInnerLabel.RequiredStart: WrapperTextFieldSInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldSInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldSInnerLabelRequiredStart)

public val WrapperTextFieldSInnerLabel.RequiredEnd: WrapperTextFieldSInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldSInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldSInnerLabelRequiredEnd)

public val TextField.M: WrapperTextFieldM
    @Composable
    @JvmName("WrapperTextFieldM")
    get() = TextFieldStyle.textFieldBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
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
        .valueStyle(SddsServTheme.typography.bodyMNormal)
        .prefixStyle(SddsServTheme.typography.bodyMNormal)
        .suffixStyle(SddsServTheme.typography.bodyMNormal)
        .placeholderStyle(SddsServTheme.typography.bodyMNormal)
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextFieldM)

public val WrapperTextFieldM.RequiredStart: WrapperTextFieldMRequiredStart
    @Composable
    @JvmName("WrapperTextFieldMRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldMRequiredStart)

public val WrapperTextFieldM.RequiredEnd: WrapperTextFieldMRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldMRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldMRequiredEnd)

public val WrapperTextFieldM.OuterLabel: WrapperTextFieldMOuterLabel
    @Composable
    @JvmName("WrapperTextFieldMOuterLabel")
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
        .wrap(::WrapperTextFieldMOuterLabel)

public val WrapperTextFieldMOuterLabel.RequiredStart: WrapperTextFieldMOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldMOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(7.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldMOuterLabelRequiredStart)

public val WrapperTextFieldMOuterLabel.RequiredEnd: WrapperTextFieldMOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldMOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldMInnerLabel)

public val WrapperTextFieldMInnerLabel.RequiredStart: WrapperTextFieldMInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldMInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldMInnerLabelRequiredStart)

public val WrapperTextFieldMInnerLabel.RequiredEnd: WrapperTextFieldMInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldMInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldMInnerLabelRequiredEnd)

public val TextField.L: WrapperTextFieldL
    @Composable
    @JvmName("WrapperTextFieldL")
    get() = TextFieldStyle.textFieldBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = 2.0.dp))
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
        .valueStyle(SddsServTheme.typography.bodyLNormal)
        .prefixStyle(SddsServTheme.typography.bodyLNormal)
        .suffixStyle(SddsServTheme.typography.bodyLNormal)
        .placeholderStyle(SddsServTheme.typography.bodyLNormal)
        .chipStyle(EmbeddedChip.L.Secondary.style())
        .labelPlacement(TextField.LabelPlacement.None)
        .wrap(::WrapperTextFieldL)

public val WrapperTextFieldL.RequiredStart: WrapperTextFieldLRequiredStart
    @Composable
    @JvmName("WrapperTextFieldLRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldLRequiredStart)

public val WrapperTextFieldL.RequiredEnd: WrapperTextFieldLRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldLRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldLRequiredEnd)

public val WrapperTextFieldL.OuterLabel: WrapperTextFieldLOuterLabel
    @Composable
    @JvmName("WrapperTextFieldLOuterLabel")
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
        .wrap(::WrapperTextFieldLOuterLabel)

public val WrapperTextFieldLOuterLabel.RequiredStart: WrapperTextFieldLOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldLOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldLOuterLabelRequiredStart)

public val WrapperTextFieldLOuterLabel.RequiredEnd: WrapperTextFieldLOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldLOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
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
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldLInnerLabel)

public val WrapperTextFieldLInnerLabel.RequiredStart: WrapperTextFieldLInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldLInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldLInnerLabelRequiredStart)

public val WrapperTextFieldLInnerLabel.RequiredEnd: WrapperTextFieldLInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldLInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldLInnerLabelRequiredEnd)
