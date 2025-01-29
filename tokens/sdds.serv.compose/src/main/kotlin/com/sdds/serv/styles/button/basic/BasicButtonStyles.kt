// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.styles.button.basic

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme

public interface WrapperBasicButton : BuilderWrapper<ButtonStyle, BasicButtonStyleBuilder>

public interface WrapperBasicButtonView : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonDefaultViewTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonSecondaryViewTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonAccentViewTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonPositiveViewTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonNegativeViewTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonWarningViewTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonClearViewTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonDarkViewTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonBlackViewTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonWhiteViewTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

@JvmInline
public value class WrapperBasicButtonL(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

@JvmInline
public value class WrapperBasicButtonM(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

@JvmInline
public value class WrapperBasicButtonS(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

@JvmInline
public value class WrapperBasicButtonXs(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

public val WrapperBasicButtonView.Default: WrapperBasicButtonDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textInversePrimaryHover
                )
            )
            iconColor(
                SddsServTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textInversePrimaryHover
                )
            )
            labelColor(
                SddsServTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textInversePrimaryHover
                )
            )
            valueColor(
                SddsServTheme.colors.textInverseSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textInverseSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textInverseSecondaryHover
                )
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultSolidDefaultHover
                )
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonDefaultViewTerminate)

public val WrapperBasicButtonView.Secondary: WrapperBasicButtonSecondaryViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textDefaultPrimaryHover
                )
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textDefaultPrimaryHover
                )
            )
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textDefaultPrimaryHover
                )
            )
            valueColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textDefaultSecondaryHover
                )
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultTransparentSecondaryHover
                )
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonSecondaryViewTerminate)

public val WrapperBasicButtonView.Accent: WrapperBasicButtonAccentViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            iconColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            labelColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            valueColor(
                SddsServTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkSecondaryHover
                )
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultAccentHover
                )
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonAccentViewTerminate)

public val WrapperBasicButtonView.Positive: WrapperBasicButtonPositiveViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            iconColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            labelColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            valueColor(
                SddsServTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkSecondaryHover
                )
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultPositiveHover
                )
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonPositiveViewTerminate)

public val WrapperBasicButtonView.Negative: WrapperBasicButtonNegativeViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            iconColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            labelColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            valueColor(
                SddsServTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkSecondaryHover
                )
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultNegativeHover
                )
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonNegativeViewTerminate)

public val WrapperBasicButtonView.Warning: WrapperBasicButtonWarningViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            iconColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            labelColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            valueColor(
                SddsServTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkSecondaryHover
                )
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultWarningHover
                )
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonWarningViewTerminate)

public val WrapperBasicButtonView.Clear: WrapperBasicButtonClearViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textDefaultPrimaryHover
                )
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textDefaultPrimaryHover
                )
            )
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textDefaultPrimaryHover
                )
            )
            valueColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textDefaultSecondaryHover
                )
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultClearActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultClearHover
                )
            )
        }
        .loadingAlpha(0.06f)
        .wrap(::WrapperBasicButtonClearViewTerminate)

public val WrapperBasicButtonView.Dark: WrapperBasicButtonDarkViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            iconColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            labelColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            valueColor(
                SddsServTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkSecondaryHover
                )
            )
            backgroundColor(
                SddsServTheme.colors.surfaceOnLightTransparentDeep.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceOnLightTransparentDeepActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceOnLightTransparentDeepHover
                )
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonDarkViewTerminate)

public val WrapperBasicButtonView.Black: WrapperBasicButtonBlackViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            iconColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            labelColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkPrimaryHover
                )
            )
            valueColor(
                SddsServTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnDarkSecondaryHover
                )
            )
            backgroundColor(
                SddsServTheme.colors.surfaceOnLightSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceOnLightSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceOnLightSolidDefaultHover
                )
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonBlackViewTerminate)

public val WrapperBasicButtonView.White: WrapperBasicButtonWhiteViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnLightPrimaryHover
                )
            )
            iconColor(
                SddsServTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnLightPrimaryHover
                )
            )
            labelColor(
                SddsServTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnLightPrimaryHover
                )
            )
            valueColor(
                SddsServTheme.colors.textOnLightSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.textOnLightSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.textOnLightSecondaryHover
                )
            )
            backgroundColor(
                SddsServTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                            to SddsServTheme.colors.surfaceOnDarkSolidDefaultHover
                )
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonWhiteViewTerminate)

private val BasicButtonStyleBuilder.invariantProps: BasicButtonStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)

public val BasicButton.L: WrapperBasicButtonL
    @Composable
    @JvmName("WrapperBasicButtonL")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .labelStyle(SddsServTheme.typography.bodyLBold)
        .valueStyle(SddsServTheme.typography.bodyLBold)
        .dimensions {
            height(56.0.dp)
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            minWidth(98.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(8.0.dp)
            valueMargin(4.0.dp)
        }
        .wrap(::WrapperBasicButtonL)

public val BasicButton.M: WrapperBasicButtonM
    @Composable
    @JvmName("WrapperBasicButtonM")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
        .labelStyle(SddsServTheme.typography.bodyMBold)
        .valueStyle(SddsServTheme.typography.bodyMBold)
        .dimensions {
            height(48.0.dp)
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            minWidth(84.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(6.0.dp)
            valueMargin(4.0.dp)
        }
        .wrap(::WrapperBasicButtonM)

public val BasicButton.S: WrapperBasicButtonS
    @Composable
    @JvmName("WrapperBasicButtonS")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .labelStyle(SddsServTheme.typography.bodySBold)
        .valueStyle(SddsServTheme.typography.bodySBold)
        .dimensions {
            height(40.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            minWidth(71.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(4.0.dp)
            valueMargin(4.0.dp)
        }
        .wrap(::WrapperBasicButtonS)

public val BasicButton.Xs: WrapperBasicButtonXs
    @Composable
    @JvmName("WrapperBasicButtonXs")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .labelStyle(SddsServTheme.typography.bodyXsBold)
        .valueStyle(SddsServTheme.typography.bodyXsBold)
        .dimensions {
            height(32.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            minWidth(57.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(1.0.dp)
            iconMargin(4.0.dp)
            valueMargin(2.0.dp)
        }
        .wrap(::WrapperBasicButtonXs)
