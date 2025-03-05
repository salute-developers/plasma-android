// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.plasma.sd.service.styles.button.link

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.linkButtonBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperLinkButton : BuilderWrapper<ButtonStyle, LinkButtonStyleBuilder>

public interface WrapperLinkButtonView : WrapperLinkButton

@JvmInline
public value class WrapperLinkButtonDefaultViewTerminate(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButton

@JvmInline
public value class WrapperLinkButtonSecondaryViewTerminate(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButton

@JvmInline
public value class WrapperLinkButtonAccentViewTerminate(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButton

@JvmInline
public value class WrapperLinkButtonPositiveViewTerminate(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButton

@JvmInline
public value class WrapperLinkButtonNegativeViewTerminate(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButton

@JvmInline
public value class WrapperLinkButtonWarningViewTerminate(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButton

@JvmInline
public value class WrapperLinkButtonXl(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

@JvmInline
public value class WrapperLinkButtonL(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

@JvmInline
public value class WrapperLinkButtonM(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

@JvmInline
public value class WrapperLinkButtonS(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

@JvmInline
public value class WrapperLinkButtonXs(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

@JvmInline
public value class WrapperLinkButtonXxs(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

public val WrapperLinkButtonView.Default: WrapperLinkButtonDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                ),
            )
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonDefaultViewTerminate)

public val WrapperLinkButtonView.Secondary: WrapperLinkButtonSecondaryViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryHover,
                ),
            )
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonSecondaryViewTerminate)

public val WrapperLinkButtonView.Accent: WrapperLinkButtonAccentViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultAccentHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultAccentHover,
                ),
            )
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonAccentViewTerminate)

public val WrapperLinkButtonView.Positive: WrapperLinkButtonPositiveViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPositiveHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPositiveHover,
                ),
            )
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPositiveHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonPositiveViewTerminate)

public val WrapperLinkButtonView.Negative: WrapperLinkButtonNegativeViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeHover,
                ),
            )
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonNegativeViewTerminate)

public val WrapperLinkButtonView.Warning: WrapperLinkButtonWarningViewTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultWarningHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultWarningHover,
                ),
            )
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultWarningHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonWarningViewTerminate)

private val LinkButtonStyleBuilder.invariantProps: LinkButtonStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.06f)
        .disableAlpha(0.4f)

public val LinkButton.Xl: WrapperLinkButtonXl
    @Composable
    @JvmName("WrapperLinkButtonXl")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .dimensions {
            height(64.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(50.0.dp)
            iconSize(24.0.dp)
            spinnerSize(24.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(8.0.dp)
        }
        .wrap(::WrapperLinkButtonXl)

public val LinkButton.L: WrapperLinkButtonL
    @Composable
    @JvmName("WrapperLinkButtonL")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .dimensions {
            height(56.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(50.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(8.0.dp)
        }
        .wrap(::WrapperLinkButtonL)

public val LinkButton.M: WrapperLinkButtonM
    @Composable
    @JvmName("WrapperLinkButtonM")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMBold)
        .dimensions {
            height(48.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(44.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(6.0.dp)
        }
        .wrap(::WrapperLinkButtonM)

public val LinkButton.S: WrapperLinkButtonS
    @Composable
    @JvmName("WrapperLinkButtonS")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodySBold)
        .dimensions {
            height(40.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(39.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(4.0.dp)
        }
        .wrap(::WrapperLinkButtonS)

public val LinkButton.Xs: WrapperLinkButtonXs
    @Composable
    @JvmName("WrapperLinkButtonXs")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsBold)
        .dimensions {
            height(32.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(33.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(1.0.dp)
            iconMargin(4.0.dp)
        }
        .wrap(::WrapperLinkButtonXs)

public val LinkButton.Xxs: WrapperLinkButtonXxs
    @Composable
    @JvmName("WrapperLinkButtonXxs")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsBold)
        .dimensions {
            height(24.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(33.0.dp)
            iconSize(12.0.dp)
            spinnerSize(12.0.dp)
            spinnerStrokeWidth(1.0.dp)
            iconMargin(4.0.dp)
        }
        .wrap(::WrapperLinkButtonXxs)
