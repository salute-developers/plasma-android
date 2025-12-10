// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.circularprogressbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.CircularProgressBarStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asStatefulValue
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
                SolidColor(StarDsTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Secondary: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultTransparentTertiary).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Accent: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultAccentMain).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Gradient: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                StarDsTheme.gradients.surfaceDefaultGradientMain.asLayered().asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Info: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultInfo).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Negative: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultNegative).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Positive: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultPositive).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.Warning: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultWarning).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

private val CircularProgressBarStyleBuilder.invariantProps: CircularProgressBarStyleBuilder
    @Composable
    get() = this
        .colors {
            trackColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            valueColor(
                SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue(),
            )
        }
        .valueEnabled(true)

public val CircularProgressBar.Xxl: WrapperCircularProgressBarXxl
    @Composable
    @JvmName("WrapperCircularProgressBarXxl")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .valueStyle(StarDsTheme.typography.headerH2Bold)
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_width_xxl))
            height(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_height_xxl))
            trackThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_track_thickness_xxl))
            progressThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_progress_thickness_xxl))
        }
        .wrap(::WrapperCircularProgressBarXxl)

public val CircularProgressBar.Xl: WrapperCircularProgressBarXl
    @Composable
    @JvmName("WrapperCircularProgressBarXl")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .valueStyle(StarDsTheme.typography.headerH5Bold)
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_width_xl))
            height(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_height_xl))
            trackThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_track_thickness_xl))
            progressThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_progress_thickness_xl))
        }
        .wrap(::WrapperCircularProgressBarXl)

public val CircularProgressBar.L: WrapperCircularProgressBarL
    @Composable
    @JvmName("WrapperCircularProgressBarL")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_width_l))
            height(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_height_l))
            trackThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_track_thickness_l))
            progressThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_progress_thickness_l))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_icon_size_l))
        }
        .valueEnabled(false)
        .wrap(::WrapperCircularProgressBarL)

public val CircularProgressBar.M: WrapperCircularProgressBarM
    @Composable
    @JvmName("WrapperCircularProgressBarM")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_width_m))
            height(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_height_m))
            trackThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_track_thickness_m))
            progressThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_progress_thickness_m))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_icon_size_m))
        }
        .valueEnabled(false)
        .wrap(::WrapperCircularProgressBarM)

public val CircularProgressBar.S: WrapperCircularProgressBarS
    @Composable
    @JvmName("WrapperCircularProgressBarS")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_width_s))
            height(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_height_s))
            trackThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_track_thickness_s))
            progressThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_progress_thickness_s))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_icon_size_s))
        }
        .valueEnabled(false)
        .wrap(::WrapperCircularProgressBarS)

public val CircularProgressBar.Xs: WrapperCircularProgressBarXs
    @Composable
    @JvmName("WrapperCircularProgressBarXs")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_width_xs))
            height(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_height_xs))
            trackThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_track_thickness_xs))
            progressThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_progress_thickness_xs))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_icon_size_xs))
        }
        .valueEnabled(false)
        .wrap(::WrapperCircularProgressBarXs)

public val CircularProgressBar.Xxs: WrapperCircularProgressBarXxs
    @Composable
    @JvmName("WrapperCircularProgressBarXxs")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_width_xxs))
            height(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_height_xxs))
            trackThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_track_thickness_xxs))
            progressThickness(dimensionResource(R.dimen.sdkit_cmp_circular_progress_bar_progress_thickness_xxs))
        }
        .valueEnabled(false)
        .wrap(::WrapperCircularProgressBarXxs)
