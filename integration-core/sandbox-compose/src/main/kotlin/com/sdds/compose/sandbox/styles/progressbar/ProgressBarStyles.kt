// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.progressbar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.ProgressBarStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
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
            indicatorColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultSolidDefault).asStatefulValue())
            backgroundColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue())
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Secondary: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            indicatorColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentTertiary).asStatefulValue())
            backgroundColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue())
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Accent: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            indicatorColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultAccent).asStatefulValue())
            backgroundColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue())
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Gradient: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            indicatorColor(SddsSandboxTheme.gradients.surfaceDefaultAccentGradient.asLayered().asStatefulValue())
            backgroundColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue())
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Info: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            indicatorColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultInfo).asStatefulValue())
            backgroundColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue())
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Negative: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            indicatorColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultNegative).asStatefulValue())
            backgroundColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue())
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Positive: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            indicatorColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultPositive).asStatefulValue())
            backgroundColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue())
        }
        .wrap(::WrapperProgressBarTerminate)

public val ProgressBar.Warning: WrapperProgressBarTerminate
    @Composable
    get() = ProgressBarStyle.builder(this)
        .invariantProps
        .colorValues {
            indicatorColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultWarning).asStatefulValue())
            backgroundColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue())
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
