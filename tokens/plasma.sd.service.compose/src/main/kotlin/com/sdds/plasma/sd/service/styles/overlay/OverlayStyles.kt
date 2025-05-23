// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.overlay

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.OverlayStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
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

public val Overlay.Default: WrapperOverlayDefault
    @Composable
    @JvmName("WrapperOverlayDefault")
    get() = OverlayStyle.builder(this)
        .color {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.overlayDefaultSoft).asStatefulValue(),
            )
        }
        .wrap(::WrapperOverlayDefault)
