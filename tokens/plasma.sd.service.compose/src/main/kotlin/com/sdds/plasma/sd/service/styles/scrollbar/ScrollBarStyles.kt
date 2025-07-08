// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.scrollbar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.ScrollBarStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperScrollBar : BuilderWrapper<ScrollBarStyle, ScrollBarStyleBuilder>

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperScrollBarS(
    public override val builder: ScrollBarStyleBuilder,
) : WrapperScrollBar

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperScrollBarM(
    public override val builder: ScrollBarStyleBuilder,
) : WrapperScrollBar

private val ScrollBarStyleBuilder.invariantProps: ScrollBarStyleBuilder
    @Composable
    get() = this
        .hoverExpandFactor(2.0f)
        .shape(CircleShape)
        .colors {
            thumbColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultSolidTertiary.asInteractive(),
            )
            trackColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
        }

public val ScrollBar.S: WrapperScrollBarS
    @Composable
    @JvmName("WrapperScrollBarS")
    get() = ScrollBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(2.0.dp)
        }
        .wrap(::WrapperScrollBarS)

public val ScrollBar.M: WrapperScrollBarM
    @Composable
    @JvmName("WrapperScrollBarM")
    get() = ScrollBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(4.0.dp)
        }
        .wrap(::WrapperScrollBarM)
