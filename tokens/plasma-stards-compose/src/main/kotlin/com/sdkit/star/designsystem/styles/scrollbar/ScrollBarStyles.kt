// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.scrollbar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.ScrollBarStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
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
                StarDsTheme.colors.surfaceDefaultSolidTertiary.asInteractive(),
            )
            trackColor(
                StarDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
        }

public val ScrollBar.S: WrapperScrollBarS
    @Composable
    @JvmName("WrapperScrollBarS")
    get() = ScrollBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_scroll_bar_width_s))
        }
        .wrap(::WrapperScrollBarS)

public val ScrollBar.M: WrapperScrollBarM
    @Composable
    @JvmName("WrapperScrollBarM")
    get() = ScrollBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_scroll_bar_width_m))
        }
        .wrap(::WrapperScrollBarM)
