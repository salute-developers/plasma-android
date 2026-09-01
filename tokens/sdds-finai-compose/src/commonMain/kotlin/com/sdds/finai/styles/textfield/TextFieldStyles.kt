// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
import com.sdds.compose.uikit.TextFieldIndicatorAlignmentMode
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldSemanticState
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.TextFieldType
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.styles.chipgroup.EmbeddedChipGroup
import com.sdds.finai.styles.chipgroup.S
import com.sdds.finai.styles.chipgroup.Secondary
import com.sdds.finai.styles.chipgroup.Xs
import com.sdds.finai.theme.SddsFinAiTheme
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
 * Обертка для вариации SInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldSInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

public val WrapperTextFieldView.Default: WrapperTextFieldTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentCard).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentCard),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            strokeColor(
                SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                ),
            )
        }
        .wrap(::WrapperTextFieldTerminate)

public val WrapperTextFieldView.Success: WrapperTextFieldTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentCard),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            strokeColor(
                SolidColor(SddsFinAiTheme.colors.outlineDefaultTransparentPositive).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                ),
            )
        }
        .wrap(::WrapperTextFieldTerminate)

public val WrapperTextFieldView.Warning: WrapperTextFieldTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentCard),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            strokeColor(
                SolidColor(SddsFinAiTheme.colors.outlineDefaultTransparentWarning).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                ),
            )
        }
        .wrap(::WrapperTextFieldTerminate)

public val WrapperTextFieldView.Error: WrapperTextFieldTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentCard),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            strokeColor(
                SolidColor(SddsFinAiTheme.colors.outlineDefaultTransparentNegative).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                ),
            )
        }
        .wrap(::WrapperTextFieldTerminate)

public val WrapperTextFieldView.Edited: WrapperTextFieldTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.dataDefaultBlueLight).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentCard),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentCard),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentCard),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            strokeColor(
                SolidColor(SddsFinAiTheme.colors.outlineDefaultTransparentInfo).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                ),
            )
        }
        .wrap(::WrapperTextFieldTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
        .captionStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .counterStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .singleLine(true)
        .dimensions {
            optionalPadding(4.0.dp)
            helperTextPadding(4.0.dp)
            chipsPadding(6.0.dp)
            strokeWidth(2.0.dp)
        }
        .colors {
            cursorColor(SolidColor(SddsFinAiTheme.colors.textDefaultAccent).asStatefulValue())
            startContentColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            endContentColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            valueColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(TextFieldSemanticState.Disabled)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            optionalColor(SolidColor(SddsFinAiTheme.colors.textDefaultTertiary).asStatefulValue())
            counterColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            placeholderColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultTertiary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly, InteractiveState.Activated) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            indicatorColor(SolidColor(SddsFinAiTheme.colors.surfaceDefaultNegative).asStatefulValue())
            prefixColor(SolidColor(SddsFinAiTheme.colors.textDefaultTertiary).asStatefulValue())
            suffixColor(SolidColor(SddsFinAiTheme.colors.textDefaultTertiary).asStatefulValue())
        }

public val TextField.Xs: WrapperTextFieldXs
    @Composable
    @JvmName("WrapperTextFieldXs")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundXs.adjustBy(all = 0.0.dp))
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .prefixStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .suffixStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .chipGroupStyle(EmbeddedChipGroup.Xs.Secondary.style())
        .dimensions {
            boxPaddingStart(8.0.dp)
            boxPaddingEnd(8.0.dp)
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(4.0.dp)
            boxMinHeight(32.0.dp)
            alignmentLineHeight(32.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
        }
        .wrap(::WrapperTextFieldXs)

public val WrapperTextFieldXs.RequiredEnd: WrapperTextFieldXsRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldXsRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldXsRequiredEnd)

public val WrapperTextFieldXs.OuterLabel: WrapperTextFieldXsOuterLabel
    @Composable
    @JvmName("WrapperTextFieldXsOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .optionalStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            labelPadding(6.0.dp)
        }
        .colors {
            labelColor(SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextFieldXsOuterLabel)

public val WrapperTextFieldXsOuterLabel.RequiredEnd: WrapperTextFieldXsOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldXsOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(2.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldXsOuterLabelRequiredEnd)

public val TextField.S: WrapperTextFieldS
    @Composable
    @JvmName("WrapperTextFieldS")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundS.adjustBy(all = -2.0.dp))
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(SddsFinAiTheme.typography.bodySNormal)
        .placeholderStyle(SddsFinAiTheme.typography.bodySNormal)
        .prefixStyle(SddsFinAiTheme.typography.bodySNormal)
        .suffixStyle(SddsFinAiTheme.typography.bodySNormal)
        .chipGroupStyle(EmbeddedChipGroup.S.Secondary.style())
        .dimensions {
            boxPaddingStart(12.0.dp)
            boxPaddingEnd(12.0.dp)
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(6.0.dp)
            boxMinHeight(40.0.dp)
            alignmentLineHeight(40.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .wrap(::WrapperTextFieldS)

public val WrapperTextFieldS.RequiredEnd: WrapperTextFieldSRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldSRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldSRequiredEnd)

public val WrapperTextFieldS.OuterLabel: WrapperTextFieldSOuterLabel
    @Composable
    @JvmName("WrapperTextFieldSOuterLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Outer)
        .labelStyle(SddsFinAiTheme.typography.bodySNormal)
        .optionalStyle(SddsFinAiTheme.typography.bodySNormal)
        .dimensions {
            labelPadding(8.0.dp)
        }
        .colors {
            labelColor(SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextFieldSOuterLabel)

public val WrapperTextFieldSOuterLabel.RequiredEnd: WrapperTextFieldSOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldSOuterLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Outside)
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldSOuterLabelRequiredEnd)

public val WrapperTextFieldS.InnerLabel: WrapperTextFieldSInnerLabel
    @Composable
    @JvmName("WrapperTextFieldSInnerLabel")
    get() = builder
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .labelStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .optionalStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(4.0.dp)
            boxPaddingBottom(4.0.dp)
            labelPadding(0.0.dp)
        }
        .colors {
            labelColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
        }
        .wrap(::WrapperTextFieldSInnerLabel)

public val WrapperTextFieldSInnerLabel.RequiredEnd: WrapperTextFieldSInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldSInnerLabelRequiredEnd")
    get() = builder
        .fieldType(TextFieldType.RequiredEnd)
        .indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
        .dimensions {
            indicatorDimensions {
                indicatorSize(6.0.dp)
            }
        }
        .wrap(::WrapperTextFieldSInnerLabelRequiredEnd)
