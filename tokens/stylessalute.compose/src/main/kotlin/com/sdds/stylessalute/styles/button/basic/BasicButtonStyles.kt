// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.stylessalute.styles.button.basic

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButton
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonAccentViewTerminate
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonBlackViewTerminate
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonClearViewTerminate
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonDarkViewTerminate
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonDefaultViewTerminate
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonL
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonM
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonNegativeViewTerminate
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonPositiveViewTerminate
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonS
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonSecondaryViewTerminate
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonView
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonWarningViewTerminate
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonWhiteViewTerminate
import com.sdds.stylessalute.styles.button.basic.WrapperBasicButtonXs
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

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
    spinnerColor(StylesSaluteTheme.colors.textInversePrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textInversePrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textInversePrimaryHover))
    iconColor(StylesSaluteTheme.colors.textInversePrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textInversePrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textInversePrimaryHover))
    labelColor(StylesSaluteTheme.colors.textInversePrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textInversePrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textInversePrimaryHover))
    valueColor(StylesSaluteTheme.colors.textInverseSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textInverseSecondaryActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.textInverseSecondaryHover))
    backgroundColor(StylesSaluteTheme.colors.surfaceDefaultSolidDefault.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.surfaceDefaultSolidDefaultActive,
            setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.surfaceDefaultSolidDefaultHover))
    }
    .loadingAlpha(0.0f)
    .wrap(::WrapperBasicButtonDefaultViewTerminate)

public val WrapperBasicButtonView.Secondary: WrapperBasicButtonSecondaryViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textDefaultPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textDefaultPrimaryHover))
    iconColor(StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textDefaultPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textDefaultPrimaryHover))
    labelColor(StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textDefaultPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textDefaultPrimaryHover))
    valueColor(StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textDefaultSecondaryActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.textDefaultSecondaryHover))
    backgroundColor(StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.surfaceDefaultTransparentSecondaryActive,
            setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.surfaceDefaultTransparentSecondaryHover))
    }
    .loadingAlpha(0.0f)
    .wrap(::WrapperBasicButtonSecondaryViewTerminate)

public val WrapperBasicButtonView.Accent: WrapperBasicButtonAccentViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    iconColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    labelColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    valueColor(StylesSaluteTheme.colors.textOnDarkSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkSecondaryActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.textOnDarkSecondaryHover))
    backgroundColor(StylesSaluteTheme.colors.surfaceDefaultAccentMain.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.surfaceDefaultAccentMainActive,
            setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.surfaceDefaultAccentMainHover))
    }
    .loadingAlpha(0.0f)
    .wrap(::WrapperBasicButtonAccentViewTerminate)

public val WrapperBasicButtonView.Positive: WrapperBasicButtonPositiveViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    iconColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    labelColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    valueColor(StylesSaluteTheme.colors.textOnDarkSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkSecondaryActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.textOnDarkSecondaryHover))
    backgroundColor(StylesSaluteTheme.colors.surfaceDefaultPositive.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.surfaceDefaultPositiveActive,
            setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.surfaceDefaultPositiveHover))
    }
    .loadingAlpha(0.0f)
    .wrap(::WrapperBasicButtonPositiveViewTerminate)

public val WrapperBasicButtonView.Negative: WrapperBasicButtonNegativeViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    iconColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    labelColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    valueColor(StylesSaluteTheme.colors.textOnDarkSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkSecondaryActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.textOnDarkSecondaryHover))
    backgroundColor(StylesSaluteTheme.colors.surfaceDefaultNegative.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.surfaceDefaultNegativeActive,
            setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.surfaceDefaultNegativeHover))
    }
    .loadingAlpha(0.0f)
    .wrap(::WrapperBasicButtonNegativeViewTerminate)

public val WrapperBasicButtonView.Warning: WrapperBasicButtonWarningViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    iconColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    labelColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    valueColor(StylesSaluteTheme.colors.textOnDarkSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkSecondaryActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.textOnDarkSecondaryHover))
    backgroundColor(StylesSaluteTheme.colors.surfaceDefaultWarning.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.surfaceDefaultWarningActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.surfaceDefaultWarningHover))
    }
    .loadingAlpha(0.0f)
    .wrap(::WrapperBasicButtonWarningViewTerminate)

public val WrapperBasicButtonView.Clear: WrapperBasicButtonClearViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textDefaultPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textDefaultPrimaryHover))
    iconColor(StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textDefaultPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textDefaultPrimaryHover))
    labelColor(StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textDefaultPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textDefaultPrimaryHover))
    valueColor(StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textDefaultSecondaryActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.textDefaultSecondaryHover))
    backgroundColor(StylesSaluteTheme.colors.surfaceDefaultClear.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.surfaceDefaultClearActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.surfaceDefaultClearHover))
    }
    .loadingAlpha(0.06f)
    .wrap(::WrapperBasicButtonClearViewTerminate)

public val WrapperBasicButtonView.Dark: WrapperBasicButtonDarkViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    iconColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    labelColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    valueColor(StylesSaluteTheme.colors.textOnDarkSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkSecondaryActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.textOnDarkSecondaryHover))
    backgroundColor(StylesSaluteTheme.colors.surfaceOnLightTransparentDeep.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.surfaceOnLightTransparentDeepActive,
            setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.surfaceOnLightTransparentDeepHover))
    }
    .loadingAlpha(0.0f)
    .wrap(::WrapperBasicButtonDarkViewTerminate)

public val WrapperBasicButtonView.Black: WrapperBasicButtonBlackViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    iconColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    labelColor(StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnDarkPrimaryHover))
    valueColor(StylesSaluteTheme.colors.textOnDarkSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnDarkSecondaryActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.textOnDarkSecondaryHover))
    backgroundColor(StylesSaluteTheme.colors.surfaceOnLightSolidDefault.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.surfaceOnLightSolidDefaultActive,
            setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.surfaceOnLightSolidDefaultHover))
    }
    .loadingAlpha(0.0f)
    .wrap(::WrapperBasicButtonBlackViewTerminate)

public val WrapperBasicButtonView.White: WrapperBasicButtonWhiteViewTerminate
    @Composable
    get() = builder
    .colors {
    spinnerColor(StylesSaluteTheme.colors.textOnLightPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnLightPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnLightPrimaryHover))
    iconColor(StylesSaluteTheme.colors.textOnLightPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnLightPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnLightPrimaryHover))
    labelColor(StylesSaluteTheme.colors.textOnLightPrimary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnLightPrimaryActive, setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.textOnLightPrimaryHover))
    valueColor(StylesSaluteTheme.colors.textOnLightSecondary.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.textOnLightSecondaryActive, setOf(InteractiveState.Hovered)
            to StylesSaluteTheme.colors.textOnLightSecondaryHover))
    backgroundColor(StylesSaluteTheme.colors.surfaceOnDarkSolidDefault.asInteractive(setOf(InteractiveState.Pressed)
            to StylesSaluteTheme.colors.surfaceOnDarkSolidDefaultActive,
            setOf(InteractiveState.Hovered) to
            StylesSaluteTheme.colors.surfaceOnDarkSolidDefaultHover))
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
    .shape(StylesSaluteTheme.shapes.roundL.adjustBy(all = -2.0.dp))
    .labelStyle(StylesSaluteTheme.typography.bodyLBold)
    .valueStyle(StylesSaluteTheme.typography.bodyLBold)
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
    .shape(StylesSaluteTheme.shapes.roundM)
    .labelStyle(StylesSaluteTheme.typography.bodyMBold)
    .valueStyle(StylesSaluteTheme.typography.bodyMBold)
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
    .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
    .labelStyle(StylesSaluteTheme.typography.bodySBold)
    .valueStyle(StylesSaluteTheme.typography.bodySBold)
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
    .shape(StylesSaluteTheme.shapes.roundS)
    .labelStyle(StylesSaluteTheme.typography.bodyXsBold)
    .valueStyle(StylesSaluteTheme.typography.bodyXsBold)
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
