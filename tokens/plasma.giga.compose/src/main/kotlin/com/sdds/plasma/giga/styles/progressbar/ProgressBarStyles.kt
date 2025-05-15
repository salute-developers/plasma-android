// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.progressbar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.ProgressBarStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperProgressBar : BuilderWrapper<ProgressBarStyle, ProgressBarStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperProgressBarTerminate(
    public override val builder: ProgressBarStyleBuilder,
) : WrapperProgressBar

public val ProgressBar.Default: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            indicatorColor(
                PlasmaGigaTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Secondary: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            indicatorColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Accent: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            indicatorColor(
                PlasmaGigaTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Gradient: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            indicatorColor(
                PlasmaGigaTheme.gradients.surfaceDefaultAccentGradient.asLayered().asStatefulValue(),
            )
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Info: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            indicatorColor(
                PlasmaGigaTheme.colors.surfaceDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Negative: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            indicatorColor(
                PlasmaGigaTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Positive: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            indicatorColor(
                PlasmaGigaTheme.colors.surfaceDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Warning: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            indicatorColor(
                PlasmaGigaTheme.colors.surfaceDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperProgressBarTerminate)

private val ProgressBarStyleBuilder.invariantProps: ProgressBarStyleBuilder
    @Composable
    get() = this
        .indicatorShape(CircleShape)
        .backgroundShape(CircleShape)
        .dimensionValues {
            indicatorHeight(4.0.dp)
            backgroundHeight(4.0.dp)
        }
