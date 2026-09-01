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
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
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
 * Обертка для вариации SInnerLabelRequiredEnd
 */
@JvmInline
public value class WrapperTextFieldClearSInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldClearView

public val WrapperTextFieldClearView.Default: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            valueColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(TextFieldSemanticState.Disabled)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            captionColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            placeholderColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultTertiary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            dividerColor(SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Success: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
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
            valueColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPrimary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        TextFieldSemanticState.Readonly,
                    ) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
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
            placeholderColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultTertiary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            dividerColor(
                SolidColor(SddsFinAiTheme.colors.outlineDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                ),
            )
        }
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Warning: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
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
            valueColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPrimary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        TextFieldSemanticState.Readonly,
                    ) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
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
            placeholderColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultTertiary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            dividerColor(
                SolidColor(SddsFinAiTheme.colors.outlineDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                ),
            )
        }
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Error: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentPrimary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentPrimary),
                ),
            )
            valueColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPrimary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimary),
                    setOf(
                        InteractiveState.Activated,
                        TextFieldSemanticState.Readonly,
                    ) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
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
            placeholderColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultTertiary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            dividerColor(
                SolidColor(SddsFinAiTheme.colors.outlineDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                ),
            )
        }
        .wrap(::WrapperTextFieldClearTerminate)

public val WrapperTextFieldClearView.Edited: WrapperTextFieldClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            valueColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(TextFieldSemanticState.Disabled)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            captionColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            placeholderColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultTertiary),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondary),
                ),
            )
            dividerColor(
                SolidColor(SddsFinAiTheme.colors.outlineDefaultTransparentAccent).asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                    setOf(InteractiveState.Activated, TextFieldSemanticState.Readonly) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                    setOf(TextFieldSemanticState.Disabled) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultSolidPrimary),
                ),
            )
        }
        .wrap(::WrapperTextFieldClearTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
        .captionStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .counterStyle(SddsFinAiTheme.typography.bodyXsNormal)
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
            dividerThickness(2.0.dp)
        }
        .colors {
            cursorColor(SolidColor(SddsFinAiTheme.colors.textDefaultAccent).asStatefulValue())
            endContentColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondaryHover),
                ),
            )
            optionalColor(SolidColor(SddsFinAiTheme.colors.textDefaultTertiary).asStatefulValue())
            counterColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            dividerColorReadOnly(SddsFinAiTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
            indicatorColor(SolidColor(SddsFinAiTheme.colors.surfaceDefaultNegative).asStatefulValue())
            prefixColor(SolidColor(SddsFinAiTheme.colors.textDefaultTertiary).asStatefulValue())
            suffixColor(SolidColor(SddsFinAiTheme.colors.textDefaultTertiary).asStatefulValue())
        }

public val TextFieldClear.Xs: WrapperTextFieldClearXs
    @Composable
    @JvmName("WrapperTextFieldClearXs")
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .prefixStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .suffixStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .chipGroupStyle(EmbeddedChipGroup.Xs.Secondary.style())
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
        .labelStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .optionalStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .dimensions {
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            labelPadding(2.0.dp)
        }
        .colors {
            labelColor(SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextFieldClearXsOuterLabel)

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
        .valueStyle(SddsFinAiTheme.typography.bodySNormal)
        .placeholderStyle(SddsFinAiTheme.typography.bodySNormal)
        .prefixStyle(SddsFinAiTheme.typography.bodySNormal)
        .suffixStyle(SddsFinAiTheme.typography.bodySNormal)
        .chipGroupStyle(EmbeddedChipGroup.S.Secondary.style())
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
        .labelStyle(SddsFinAiTheme.typography.bodySNormal)
        .optionalStyle(SddsFinAiTheme.typography.bodySNormal)
        .dimensions {
            labelPadding(4.0.dp)
        }
        .colors {
            labelColor(SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperTextFieldClearSOuterLabel)

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
        .wrap(::WrapperTextFieldClearSInnerLabel)

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
