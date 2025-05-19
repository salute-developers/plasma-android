// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.circularprogressbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.CircularProgressBarStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCircularProgressBar :
    BuilderWrapper<CircularProgressBarStyle, CircularProgressBarStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperCircularProgressBarView : WrapperCircularProgressBar

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperCircularProgressBarTerminate(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBar

/**
 * Обертка для вариации Xxl
 */
@JvmInline
public value class WrapperCircularProgressBarXxl(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperCircularProgressBarXl(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCircularProgressBarL(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCircularProgressBarM(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperCircularProgressBarS(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperCircularProgressBarXs(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

/**
 * Обертка для вариации Xxs
 */
@JvmInline
public value class WrapperCircularProgressBarXxs(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

public val WrapperCircularProgressBarView.Default: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Secondary: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentTertiary).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Accent: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultAccent).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Gradient: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsServTheme.gradients.surfaceDefaultAccentGradient.asLayered().asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Info: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultInfo).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Negative: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultNegative).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Positive: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultPositive).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Warning: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultWarning).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

private val CircularProgressBarStyleBuilder.invariantProps: CircularProgressBarStyleBuilder
    @Composable
    get() = this
        .colors {
            trackColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            valueColor(
                SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue(),
            )
        }
        .valueEnabled(true)

public val CircularProgressBar.Xxl: WrapperCircularProgressBarXxl
    @Composable
    @JvmName("WrapperCircularProgressBarXxl")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .valueStyle(SddsServTheme.typography.headerH2Bold)
        .dimensions {
            width(128.0.dp)
            height(128.0.dp)
            trackThickness(4.0.dp)
            progressThickness(4.0.dp)
        }
        .wrap(::WrapperCircularProgressBarXxl)

public val CircularProgressBar.Xl: WrapperCircularProgressBarXl
    @Composable
    @JvmName("WrapperCircularProgressBarXl")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .valueStyle(SddsServTheme.typography.headerH5Bold)
        .dimensions {
            width(88.0.dp)
            height(88.0.dp)
            trackThickness(4.0.dp)
            progressThickness(4.0.dp)
        }
        .wrap(::WrapperCircularProgressBarXl)

public val CircularProgressBar.L: WrapperCircularProgressBarL
    @Composable
    @JvmName("WrapperCircularProgressBarL")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(56.0.dp)
            height(56.0.dp)
            trackThickness(2.0.dp)
            progressThickness(2.0.dp)
        }
        .valueEnabled(false)
        .wrap(::WrapperCircularProgressBarL)

public val CircularProgressBar.M: WrapperCircularProgressBarM
    @Composable
    @JvmName("WrapperCircularProgressBarM")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(48.0.dp)
            height(48.0.dp)
            trackThickness(2.0.dp)
            progressThickness(2.0.dp)
        }
        .valueEnabled(false)
        .wrap(::WrapperCircularProgressBarM)

public val CircularProgressBar.S: WrapperCircularProgressBarS
    @Composable
    @JvmName("WrapperCircularProgressBarS")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(36.0.dp)
            height(36.0.dp)
            trackThickness(2.0.dp)
            progressThickness(2.0.dp)
        }
        .valueEnabled(false)
        .wrap(::WrapperCircularProgressBarS)

public val CircularProgressBar.Xs: WrapperCircularProgressBarXs
    @Composable
    @JvmName("WrapperCircularProgressBarXs")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(24.0.dp)
            height(24.0.dp)
            trackThickness(2.0.dp)
            progressThickness(2.0.dp)
        }
        .valueEnabled(false)
        .wrap(::WrapperCircularProgressBarXs)

public val CircularProgressBar.Xxs: WrapperCircularProgressBarXxs
    @Composable
    @JvmName("WrapperCircularProgressBarXxs")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(16.0.dp)
            height(16.0.dp)
            trackThickness(2.0.dp)
            progressThickness(2.0.dp)
        }
        .valueEnabled(false)
        .wrap(::WrapperCircularProgressBarXxs)
