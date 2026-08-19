// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.avatar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.AvatarStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.styles.counter.Counter
import com.sdds.finai.styles.counter.L
import com.sdds.finai.styles.counter.Negative
import com.sdds.finai.styles.counter.S
import com.sdds.finai.styles.counter.Xs
import com.sdds.finai.styles.counter.Xxs
import com.sdds.finai.styles.indicator.AvatarIndicator
import com.sdds.finai.styles.indicator.L
import com.sdds.finai.styles.indicator.M
import com.sdds.finai.styles.indicator.S
import com.sdds.finai.theme.SddsFinAiTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAvatar : BuilderWrapper<AvatarStyle, AvatarStyleBuilder>

/**
 * Обертка для вариации Xxl
 */
@JvmInline
public value class WrapperAvatarXxl(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAvatarL(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAvatarM(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAvatarS(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

private val AvatarStyleBuilder.invariantProps: AvatarStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .colors {
            textColor(SolidColor(SddsFinAiTheme.colors.textDefaultAccent).asStatefulValue())
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultAccent.multiplyAlpha(0.2f)).asStatefulValue(),
            )
        }

public val Avatar.Xxl: WrapperAvatarXxl
    @Composable
    @JvmName("WrapperAvatarXxl")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsFinAiTheme.typography.headerH2Bold)
        .statusStyle(AvatarIndicator.L.style())
        .counterStyle(Counter.L.Negative.style())
        .dimensions {
            statusOffsetX(7.0.dp)
            statusOffsetY(7.0.dp)
            width(88.0.dp)
            height(88.0.dp)
        }
        .wrap(::WrapperAvatarXxl)

public val Avatar.L: WrapperAvatarL
    @Composable
    @JvmName("WrapperAvatarL")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsFinAiTheme.typography.headerH4Bold)
        .statusStyle(AvatarIndicator.M.style())
        .counterStyle(Counter.S.Negative.style())
        .dimensions {
            statusOffsetX(3.0.dp)
            statusOffsetY(3.0.dp)
            width(48.0.dp)
            height(48.0.dp)
        }
        .wrap(::WrapperAvatarL)

public val Avatar.M: WrapperAvatarM
    @Composable
    @JvmName("WrapperAvatarM")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsFinAiTheme.typography.bodySBold)
        .statusStyle(AvatarIndicator.M.style())
        .counterStyle(Counter.Xs.Negative.style())
        .dimensions {
            statusOffsetX(2.0.dp)
            statusOffsetY(2.0.dp)
            width(36.0.dp)
            height(36.0.dp)
        }
        .wrap(::WrapperAvatarM)

public val Avatar.S: WrapperAvatarS
    @Composable
    @JvmName("WrapperAvatarS")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsFinAiTheme.typography.bodyXxsBold)
        .statusStyle(AvatarIndicator.S.style())
        .counterStyle(Counter.Xxs.Negative.style())
        .dimensions {
            statusOffsetX(0.0.dp)
            statusOffsetY(0.0.dp)
            width(24.0.dp)
            height(24.0.dp)
        }
        .wrap(::WrapperAvatarS)
