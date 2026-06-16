// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.indicator

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.IndicatorStyleBuilder
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
public interface WrapperAvatarIndicator : BuilderWrapper<IndicatorStyle, IndicatorStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAvatarIndicatorL(
    public override val builder: IndicatorStyleBuilder,
) : WrapperAvatarIndicator

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAvatarIndicatorM(
    public override val builder: IndicatorStyleBuilder,
) : WrapperAvatarIndicator

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAvatarIndicatorS(
    public override val builder: IndicatorStyleBuilder,
) : WrapperAvatarIndicator

private val IndicatorStyleBuilder.invariantProps: IndicatorStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .color {
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultPositive).asStatefulValue(
                    setOf(AvatarStatus.Inactive)
                        to SolidColor(StarDsTheme.colors.surfaceOnLightSolidTertiary),
                ),
            )
        }

public val AvatarIndicator.L: WrapperAvatarIndicatorL
    @Composable
    @JvmName("WrapperAvatarIndicatorL")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_avatar_indicator_height_l))
            width(dimensionResource(R.dimen.sdkit_cmp_avatar_indicator_width_l))
        }
        .wrap(::WrapperAvatarIndicatorL)

public val AvatarIndicator.M: WrapperAvatarIndicatorM
    @Composable
    @JvmName("WrapperAvatarIndicatorM")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_avatar_indicator_height_m))
            width(dimensionResource(R.dimen.sdkit_cmp_avatar_indicator_width_m))
        }
        .wrap(::WrapperAvatarIndicatorM)

public val AvatarIndicator.S: WrapperAvatarIndicatorS
    @Composable
    @JvmName("WrapperAvatarIndicatorS")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_avatar_indicator_height_s))
            width(dimensionResource(R.dimen.sdkit_cmp_avatar_indicator_width_s))
        }
        .wrap(::WrapperAvatarIndicatorS)
