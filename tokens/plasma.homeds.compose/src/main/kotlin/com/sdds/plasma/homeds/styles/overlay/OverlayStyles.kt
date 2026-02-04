// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.overlay

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.OverlayStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperOverlay : BuilderWrapper<OverlayStyle, OverlayStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperOverlayDefault(
    public override val builder: OverlayStyleBuilder,
) : WrapperOverlay

/**
 * Обертка для вариации DirectionTop
 */
@JvmInline
public value class WrapperOverlayDirectionTop(
    public override val builder: OverlayStyleBuilder,
) : WrapperOverlay

/**
 * Обертка для вариации DirectionBottom
 */
@JvmInline
public value class WrapperOverlayDirectionBottom(
    public override val builder: OverlayStyleBuilder,
) : WrapperOverlay

private val OverlayStyleBuilder.invariantProps: OverlayStyleBuilder
    @Composable
    get() = this

public val Overlay.Default: WrapperOverlayDefault
    @Composable
    @JvmName("WrapperOverlayDefault")
    get() = OverlayStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(
                SolidColor(PlasmaHomeDsTheme.colors.overlayOnDarkSoft).asStatefulValue(),
            )
        }
        .wrap(::WrapperOverlayDefault)

public val Overlay.DirectionTop: WrapperOverlayDirectionTop
    @Composable
    @JvmName("WrapperOverlayDirectionTop")
    get() = OverlayStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(
                PlasmaHomeDsTheme.gradients.overlayDefaultGradientUp.asLayered().asStatefulValue(),
            )
        }
        .wrap(::WrapperOverlayDirectionTop)

public val Overlay.DirectionBottom: WrapperOverlayDirectionBottom
    @Composable
    @JvmName("WrapperOverlayDirectionBottom")
    get() = OverlayStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(
                PlasmaHomeDsTheme.gradients.overlayDefaultGradientDown.asLayered().asStatefulValue(),
            )
        }
        .wrap(::WrapperOverlayDirectionBottom)
