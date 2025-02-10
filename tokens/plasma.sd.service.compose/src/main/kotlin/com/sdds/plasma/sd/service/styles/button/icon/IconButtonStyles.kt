// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.styles.button.icon

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
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButton
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonAccentViewTerminate
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonBlackViewTerminate
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonClearViewTerminate
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonDarkViewTerminate
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonDefaultViewTerminate
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonL
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonLPilled
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonM
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonMPilled
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonNegativeViewTerminate
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonPositiveViewTerminate
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonS
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonSPilled
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonSecondaryViewTerminate
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonView
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonWarningViewTerminate
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonWhiteViewTerminate
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonXs
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonXsPilled
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

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
    spinnerColor(PlasmaSdServiceTheme.colors.textInversePrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textInversePrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textInversePrimaryHover))
    iconColor(PlasmaSdServiceTheme.colors.textInversePrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textInversePrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textInversePrimaryHover))
    backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefaultActive,
            setOf(InteractiveState.Hovered) to
            PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefaultHover))
    }
    .wrap(::WrapperIconButtonDefaultViewTerminate)

public val WrapperIconButtonView.Secondary: WrapperIconButtonSecondaryViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover))
    iconColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover))
    backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondaryActive,
            setOf(InteractiveState.Hovered) to
            PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondaryHover))
    }
    .wrap(::WrapperIconButtonSecondaryViewTerminate)

public val WrapperIconButtonView.Accent: WrapperIconButtonAccentViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    iconColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultAccent.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.surfaceDefaultAccentActive,
            setOf(InteractiveState.Hovered) to
            PlasmaSdServiceTheme.colors.surfaceDefaultAccentHover))
    }
    .wrap(::WrapperIconButtonAccentViewTerminate)

public val WrapperIconButtonView.Positive: WrapperIconButtonPositiveViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    iconColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultPositive.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.surfaceDefaultPositiveActive,
            setOf(InteractiveState.Hovered) to
            PlasmaSdServiceTheme.colors.surfaceDefaultPositiveHover))
    }
    .wrap(::WrapperIconButtonPositiveViewTerminate)

public val WrapperIconButtonView.Negative: WrapperIconButtonNegativeViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    iconColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.surfaceDefaultNegativeActive,
            setOf(InteractiveState.Hovered) to
            PlasmaSdServiceTheme.colors.surfaceDefaultNegativeHover))
    }
    .wrap(::WrapperIconButtonNegativeViewTerminate)

public val WrapperIconButtonView.Warning: WrapperIconButtonWarningViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    iconColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultWarning.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.surfaceDefaultWarningActive,
            setOf(InteractiveState.Hovered) to
            PlasmaSdServiceTheme.colors.surfaceDefaultWarningHover))
    }
    .wrap(::WrapperIconButtonWarningViewTerminate)

public val WrapperIconButtonView.Clear: WrapperIconButtonClearViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover))
    iconColor(PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover))
    backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.surfaceDefaultClearActive,
            setOf(InteractiveState.Hovered) to
            PlasmaSdServiceTheme.colors.surfaceDefaultClearHover))
    }
    .wrap(::WrapperIconButtonClearViewTerminate)

public val WrapperIconButtonView.Dark: WrapperIconButtonDarkViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    iconColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    backgroundColor(PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeep.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeepActive,
            setOf(InteractiveState.Hovered) to
            PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeepHover))
    }
    .wrap(::WrapperIconButtonDarkViewTerminate)

public val WrapperIconButtonView.Black: WrapperIconButtonBlackViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    iconColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover))
    backgroundColor(PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefault.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefaultActive,
            setOf(InteractiveState.Hovered) to
            PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefaultHover))
    }
    .wrap(::WrapperIconButtonBlackViewTerminate)

public val WrapperIconButtonView.White: WrapperIconButtonWhiteViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(PlasmaSdServiceTheme.colors.textOnLightPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnLightPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnLightPrimaryHover))
    iconColor(PlasmaSdServiceTheme.colors.textOnLightPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.textOnLightPrimaryActive, setOf(InteractiveState.Hovered)
            to PlasmaSdServiceTheme.colors.textOnLightPrimaryHover))
    backgroundColor(PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefault.asInteractive(setOf(InteractiveState.Pressed)
            to PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefaultActive,
            setOf(InteractiveState.Hovered) to
            PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefaultHover))
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
    .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
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
    .shape(PlasmaSdServiceTheme.shapes.roundM)
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
    .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = -2.0.dp))
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
    .shape(PlasmaSdServiceTheme.shapes.roundS)
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
