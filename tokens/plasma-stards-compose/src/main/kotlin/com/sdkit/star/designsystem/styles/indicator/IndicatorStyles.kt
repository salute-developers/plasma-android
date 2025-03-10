// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.indicator

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.Indicator
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.IndicatorStyleBuilder
import com.sdds.compose.uikit.indicatorBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperIndicator : BuilderWrapper<IndicatorStyle, IndicatorStyleBuilder>

public interface WrapperIndicatorView : WrapperIndicator

@JvmInline
public value class WrapperIndicatorDefaultViewTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

@JvmInline
public value class WrapperIndicatorAccentViewTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

@JvmInline
public value class WrapperIndicatorInactiveViewTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

@JvmInline
public value class WrapperIndicatorPositiveViewTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

@JvmInline
public value class WrapperIndicatorWarningViewTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

@JvmInline
public value class WrapperIndicatorNegativeViewTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

@JvmInline
public value class WrapperIndicatorDarkViewTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

@JvmInline
public value class WrapperIndicatorBlackViewTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

@JvmInline
public value class WrapperIndicatorWhiteViewTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

@JvmInline
public value class WrapperIndicatorL(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

@JvmInline
public value class WrapperIndicatorM(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

@JvmInline
public value class WrapperIndicatorS(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

public val WrapperIndicatorView.Default: WrapperIndicatorDefaultViewTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorDefaultViewTerminate)

public val WrapperIndicatorView.Accent: WrapperIndicatorAccentViewTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultAccentMain.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorAccentViewTerminate)

public val WrapperIndicatorView.Inactive: WrapperIndicatorInactiveViewTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultSolidTertiary.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorInactiveViewTerminate)

public val WrapperIndicatorView.Positive: WrapperIndicatorPositiveViewTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorPositiveViewTerminate)

public val WrapperIndicatorView.Warning: WrapperIndicatorWarningViewTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorWarningViewTerminate)

public val WrapperIndicatorView.Negative: WrapperIndicatorNegativeViewTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorNegativeViewTerminate)

public val WrapperIndicatorView.Dark: WrapperIndicatorDarkViewTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceOnLightTransparentDeep.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorDarkViewTerminate)

public val WrapperIndicatorView.Black: WrapperIndicatorBlackViewTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceOnLightSolidDefault.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorBlackViewTerminate)

public val WrapperIndicatorView.White: WrapperIndicatorWhiteViewTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorWhiteViewTerminate)

private val IndicatorStyleBuilder.invariantProps: IndicatorStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)

public val Indicator.L: WrapperIndicatorL
    @Composable
    @JvmName("WrapperIndicatorL")
    get() = IndicatorStyle.indicatorBuilder(this)
        .invariantProps
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_indicator_height_l))
            width(dimensionResource(R.dimen.sdkit_cmp_indicator_width_l))
        }
        .wrap(::WrapperIndicatorL)

public val Indicator.M: WrapperIndicatorM
    @Composable
    @JvmName("WrapperIndicatorM")
    get() = IndicatorStyle.indicatorBuilder(this)
        .invariantProps
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_indicator_height_m))
            width(dimensionResource(R.dimen.sdkit_cmp_indicator_width_m))
        }
        .wrap(::WrapperIndicatorM)

public val Indicator.S: WrapperIndicatorS
    @Composable
    @JvmName("WrapperIndicatorS")
    get() = IndicatorStyle.indicatorBuilder(this)
        .invariantProps
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_indicator_height_s))
            width(dimensionResource(R.dimen.sdkit_cmp_indicator_width_s))
        }
        .wrap(::WrapperIndicatorS)
