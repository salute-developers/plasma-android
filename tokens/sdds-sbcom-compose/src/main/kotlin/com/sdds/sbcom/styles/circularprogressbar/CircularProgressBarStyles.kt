// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.circularprogressbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.CircularProgressBarStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
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

public val WrapperCircularProgressBarView.Primary: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimary).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Secondary: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentTertiary).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.GlobalWhite: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidPrimary).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Accent: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Danger: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultNegative).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

private val CircularProgressBarStyleBuilder.invariantProps: CircularProgressBarStyleBuilder
    @Composable
    get() = this
        .colors {
            trackColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
        }
        .valueEnabled(false)

public val CircularProgressBar.Xxl: WrapperCircularProgressBarXxl
    @Composable
    @JvmName("WrapperCircularProgressBarXxl")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(112.0.dp)
            height(112.0.dp)
            trackThickness(8.0.dp)
            progressThickness(8.0.dp)
        }
        .wrap(::WrapperCircularProgressBarXxl)

public val CircularProgressBar.M: WrapperCircularProgressBarM
    @Composable
    @JvmName("WrapperCircularProgressBarM")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(40.0.dp)
            height(40.0.dp)
            trackThickness(3.0.dp)
            progressThickness(3.0.dp)
            iconSize(24.0.dp)
        }
        .wrap(::WrapperCircularProgressBarM)

public val CircularProgressBar.S: WrapperCircularProgressBarS
    @Composable
    @JvmName("WrapperCircularProgressBarS")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(32.0.dp)
            height(32.0.dp)
            trackThickness(2.0.dp)
            progressThickness(2.0.dp)
            iconSize(20.0.dp)
        }
        .wrap(::WrapperCircularProgressBarS)

public val CircularProgressBar.Xs: WrapperCircularProgressBarXs
    @Composable
    @JvmName("WrapperCircularProgressBarXs")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(24.0.dp)
            height(24.0.dp)
            trackThickness(1.5.dp)
            progressThickness(1.5.dp)
            iconSize(16.0.dp)
        }
        .wrap(::WrapperCircularProgressBarXs)

public val CircularProgressBar.Xxs: WrapperCircularProgressBarXxs
    @Composable
    @JvmName("WrapperCircularProgressBarXxs")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(16.0.dp)
            height(16.0.dp)
            trackThickness(1.0.dp)
            progressThickness(1.0.dp)
            iconSize(12.0.dp)
        }
        .wrap(::WrapperCircularProgressBarXxs)
