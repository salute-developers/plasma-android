// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.indicator

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.IndicatorStyleBuilder
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
                SolidColor(SddsServTheme.colors.surfaceDefaultPositive).asStatefulValue(
                    setOf(AvatarStatus.Inactive)
                        to SolidColor(SddsServTheme.colors.surfaceOnLightSolidTertiary),
                ),
            )
        }

public val AvatarIndicator.L: WrapperAvatarIndicatorL
    @Composable
    @JvmName("WrapperAvatarIndicatorL")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(12.0.dp)
            width(12.0.dp)
        }
        .wrap(::WrapperAvatarIndicatorL)

public val AvatarIndicator.M: WrapperAvatarIndicatorM
    @Composable
    @JvmName("WrapperAvatarIndicatorM")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(8.0.dp)
            width(8.0.dp)
        }
        .wrap(::WrapperAvatarIndicatorM)

public val AvatarIndicator.S: WrapperAvatarIndicatorS
    @Composable
    @JvmName("WrapperAvatarIndicatorS")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(6.0.dp)
            width(6.0.dp)
        }
        .wrap(::WrapperAvatarIndicatorS)
