// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.textfield

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
import com.sdds.compose.uikit.style.wrap
import com.sdds.compose.uikit.textFieldBuilder
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

public interface WrapperTextField : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

public interface WrapperTextFieldView : WrapperTextField

@JvmInline
public value class WrapperTextFieldDefaultViewTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextField

@JvmInline
public value class WrapperTextFieldSuccessViewTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextField

@JvmInline
public value class WrapperTextFieldWarningViewTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextField

@JvmInline
public value class WrapperTextFieldErrorViewTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextField

@JvmInline
public value class WrapperTextFieldXs(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXsRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXsRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXsOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXsOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXsOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldS(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldSRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldSRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldSOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldSOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldSOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldSInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldSInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldSInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldM(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldMRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldMRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldMOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldMOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldMOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldMInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldMInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldMInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldL(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldLRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldLRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldLOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldLOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldLOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldLInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldLInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldLInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXl(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXlRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXlRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXlOuterLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXlOuterLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXlOuterLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXlInnerLabel(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXlInnerLabelRequiredStart(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

@JvmInline
public value class WrapperTextFieldXlInnerLabelRequiredEnd(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextFieldView

public val WrapperTextFieldView.Default: WrapperTextFieldDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextFieldDefaultViewTerminate)

public val WrapperTextFieldView.Success: WrapperTextFieldSuccessViewTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPositive.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextFieldSuccessViewTerminate)

public val WrapperTextFieldView.Warning: WrapperTextFieldWarningViewTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentWarning.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextFieldWarningViewTerminate)

public val WrapperTextFieldView.Error: WrapperTextFieldErrorViewTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondary,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentNegative.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }
        .wrap(::WrapperTextFieldErrorViewTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .dimensions {
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
            valueColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
            placeholderColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.textDefaultTertiary,
                ),
            )
            indicatorColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColor(
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
            backgroundColorReadOnly(
                PlasmaSdServiceTheme.colors.surfaceDefaultSolidPrimary.multiplyAlpha(0.4f).asInteractive(),
            )
            cursorColor(
                PlasmaSdServiceTheme.colors.textDefaultAccent.asInteractive(),
            )
            prefixColor(
                PlasmaSdServiceTheme.colors.textDefaultTertiary.asInteractive(),
            )
            suffixColor(
                PlasmaSdServiceTheme.colors.textDefaultTertiary.asInteractive(),
            )
        }

public val TextField.Xs: WrapperTextFieldXs
    @Composable
    @JvmName("WrapperTextFieldXs")
    get() = TextFieldStyle.textFieldBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundS.adjustBy(all = 0.0.dp))
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
        .valueStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
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
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = -2.0.dp))
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
        .valueStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodySNormal)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
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
        .shape(PlasmaSdServiceTheme.shapes.roundM)
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
        .valueStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
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
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = 2.0.dp))
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
        .valueStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .prefixStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .suffixStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .placeholderStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .labelPlacement(TextField.LabelPlacement.Inner)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
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

public val TextField.Xl: WrapperTextFieldXl
    @Composable
    @JvmName("WrapperTextFieldXl")
    get() = TextFieldStyle.textFieldBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL)
        .dimensions {
            boxPaddingStart(18.0.dp)
            boxPaddingEnd(18.0.dp)
            boxPaddingTop(20.0.dp)
            boxPaddingBottom(20.0.dp)
            boxMinHeight(64.0.dp)
            alignmentLineHeight(64.0.dp)
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
        .wrap(::WrapperTextFieldXl)

public val WrapperTextFieldXl.RequiredStart: WrapperTextFieldXlRequiredStart
    @Composable
    @JvmName("WrapperTextFieldXlRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldXlRequiredStart)

public val WrapperTextFieldXl.RequiredEnd: WrapperTextFieldXlRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldXlRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldXlRequiredEnd)

public val WrapperTextFieldXl.OuterLabel: WrapperTextFieldXlOuterLabel
    @Composable
    @JvmName("WrapperTextFieldXlOuterLabel")
    get() = builder
        .dimensions {
            labelPadding(12.0.dp)
        }
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .optionalStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .labelPlacement(TextField.LabelPlacement.Outer)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldXlOuterLabel)

public val WrapperTextFieldXlOuterLabel.RequiredStart: WrapperTextFieldXlOuterLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldXlOuterLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(6.0.dp)
                verticalPadding(8.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldXlOuterLabelRequiredStart)

public val WrapperTextFieldXlOuterLabel.RequiredEnd: WrapperTextFieldXlOuterLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldXlOuterLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                horizontalPadding(4.0.dp)
                verticalPadding(4.0.dp)
                indicatorSize(6.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldXlOuterLabelRequiredEnd)

public val WrapperTextFieldXl.InnerLabel: WrapperTextFieldXlInnerLabel
    @Composable
    @JvmName("WrapperTextFieldXlInnerLabel")
    get() = builder
        .dimensions {
            boxPaddingTop(13.0.dp)
            boxPaddingBottom(13.0.dp)
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
        .wrap(::WrapperTextFieldXlInnerLabel)

public val WrapperTextFieldXlInnerLabel.RequiredStart: WrapperTextFieldXlInnerLabelRequiredStart
    @Composable
    @JvmName("WrapperTextFieldXlInnerLabelRequiredStart")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredStart)
        .wrap(::WrapperTextFieldXlInnerLabelRequiredStart)

public val WrapperTextFieldXlInnerLabel.RequiredEnd: WrapperTextFieldXlInnerLabelRequiredEnd
    @Composable
    @JvmName("WrapperTextFieldXlInnerLabelRequiredEnd")
    get() = builder
        .dimensions {
            indicatorDimensions {
                indicatorSize(8.0.dp)
            }
        }
        .fieldType(TextField.FieldType.RequiredEnd)
        .wrap(::WrapperTextFieldXlInnerLabelRequiredEnd)
