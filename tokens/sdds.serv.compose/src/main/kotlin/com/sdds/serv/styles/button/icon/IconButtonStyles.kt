// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.styles.button.icon

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme

public interface WrapperIconButton : BuilderWrapper<ButtonStyle, IconButtonStyleBuilder>

public interface WrapperIconButtonView : WrapperIconButton

@JvmInline
public value class WrapperIconButtonDefaultViewTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonSecondaryViewTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonAccentViewTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonPositiveViewTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonNegativeViewTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonWarningViewTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonClearViewTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonDarkViewTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonBlackViewTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonWhiteViewTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonL(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

@JvmInline
public value class WrapperIconButtonLPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

@JvmInline
public value class WrapperIconButtonM(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

@JvmInline
public value class WrapperIconButtonMPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

@JvmInline
public value class WrapperIconButtonS(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

@JvmInline
public value class WrapperIconButtonSPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

@JvmInline
public value class WrapperIconButtonXs(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

@JvmInline
public value class WrapperIconButtonXsPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

public val WrapperIconButtonView.Default: WrapperIconButtonDefaultViewTerminate
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
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultSolidDefaultHover
                )
            )
        }
        .wrap(::WrapperIconButtonDefaultViewTerminate)

public val WrapperIconButtonView.Secondary: WrapperIconButtonSecondaryViewTerminate
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
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultTransparentSecondaryHover
                )
            )
        }
        .wrap(::WrapperIconButtonSecondaryViewTerminate)

public val WrapperIconButtonView.Accent: WrapperIconButtonAccentViewTerminate
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
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultAccentHover
                )
            )
        }
        .wrap(::WrapperIconButtonAccentViewTerminate)

public val WrapperIconButtonView.Positive: WrapperIconButtonPositiveViewTerminate
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
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultPositiveHover
                )
            )
        }
        .wrap(::WrapperIconButtonPositiveViewTerminate)

public val WrapperIconButtonView.Negative: WrapperIconButtonNegativeViewTerminate
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
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultNegativeHover
                )
            )
        }
        .wrap(::WrapperIconButtonNegativeViewTerminate)

public val WrapperIconButtonView.Warning: WrapperIconButtonWarningViewTerminate
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
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultWarningHover
                )
            )
        }
        .wrap(::WrapperIconButtonWarningViewTerminate)

public val WrapperIconButtonView.Clear: WrapperIconButtonClearViewTerminate
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
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceDefaultClearActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceDefaultClearHover
                )
            )
        }
        .wrap(::WrapperIconButtonClearViewTerminate)

public val WrapperIconButtonView.Dark: WrapperIconButtonDarkViewTerminate
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
            backgroundColor(
                SddsServTheme.colors.surfaceOnLightTransparentDeep.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceOnLightTransparentDeepActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceOnLightTransparentDeepHover
                )
            )
        }
        .wrap(::WrapperIconButtonDarkViewTerminate)

public val WrapperIconButtonView.Black: WrapperIconButtonBlackViewTerminate
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
            backgroundColor(
                SddsServTheme.colors.surfaceOnLightSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceOnLightSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                            SddsServTheme.colors.surfaceOnLightSolidDefaultHover
                )
            )
        }
        .wrap(::WrapperIconButtonBlackViewTerminate)

public val WrapperIconButtonView.White: WrapperIconButtonWhiteViewTerminate
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
            backgroundColor(
                SddsServTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                            to SddsServTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                            to SddsServTheme.colors.surfaceOnDarkSolidDefaultHover
                )
            )
        }
        .wrap(::WrapperIconButtonWhiteViewTerminate)

private val IconButtonStyleBuilder.invariantProps: IconButtonStyleBuilder
    @Composable
    get() = this
        .loadingAlpha(0.0f)
        .disableAlpha(0.4f)

public val IconButton.L: WrapperIconButtonL
    @Composable
    @JvmName("WrapperIconButtonL")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .dimensions {
            height(56.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            minWidth(56.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperIconButtonL)

public val WrapperIconButtonL.Pilled: WrapperIconButtonLPilled
    @Composable
    @JvmName("WrapperIconButtonLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonLPilled)

public val IconButton.M: WrapperIconButtonM
    @Composable
    @JvmName("WrapperIconButtonM")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
        .dimensions {
            height(48.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            minWidth(48.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperIconButtonM)

public val WrapperIconButtonM.Pilled: WrapperIconButtonMPilled
    @Composable
    @JvmName("WrapperIconButtonMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonMPilled)

public val IconButton.S: WrapperIconButtonS
    @Composable
    @JvmName("WrapperIconButtonS")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            height(40.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            minWidth(40.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperIconButtonS)

public val WrapperIconButtonS.Pilled: WrapperIconButtonSPilled
    @Composable
    @JvmName("WrapperIconButtonSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonSPilled)

public val IconButton.Xs: WrapperIconButtonXs
    @Composable
    @JvmName("WrapperIconButtonXs")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .dimensions {
            height(32.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            minWidth(32.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(1.0.dp)
        }
        .wrap(::WrapperIconButtonXs)

public val WrapperIconButtonXs.Pilled: WrapperIconButtonXsPilled
    @Composable
    @JvmName("WrapperIconButtonXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonXsPilled)
