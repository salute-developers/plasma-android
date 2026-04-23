// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.indicator

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.IndicatorStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAvatarIndicator : BuilderWrapper<IndicatorStyle, IndicatorStyleBuilder>

/**
 * Обертка для вариации Size14
 */
@JvmInline
public value class WrapperAvatarIndicatorSize14(
    public override val builder: IndicatorStyleBuilder,
) : WrapperAvatarIndicator

/**
 * Обертка для вариации Size12
 */
@JvmInline
public value class WrapperAvatarIndicatorSize12(
    public override val builder: IndicatorStyleBuilder,
) : WrapperAvatarIndicator

/**
 * Обертка для вариации Size10
 */
@JvmInline
public value class WrapperAvatarIndicatorSize10(
    public override val builder: IndicatorStyleBuilder,
) : WrapperAvatarIndicator

/**
 * Обертка для вариации Size8
 */
@JvmInline
public value class WrapperAvatarIndicatorSize8(
    public override val builder: IndicatorStyleBuilder,
) : WrapperAvatarIndicator

/**
 * Обертка для вариации Size6
 */
@JvmInline
public value class WrapperAvatarIndicatorSize6(
    public override val builder: IndicatorStyleBuilder,
) : WrapperAvatarIndicator

private val IndicatorStyleBuilder.invariantProps: IndicatorStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .color {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
        }

public val AvatarIndicator.Size14: WrapperAvatarIndicatorSize14
    @Composable
    @JvmName("WrapperAvatarIndicatorSize14")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(14.0.dp)
            width(14.0.dp)
        }
        .wrap(::WrapperAvatarIndicatorSize14)

public val AvatarIndicator.Size12: WrapperAvatarIndicatorSize12
    @Composable
    @JvmName("WrapperAvatarIndicatorSize12")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(12.0.dp)
            width(12.0.dp)
        }
        .wrap(::WrapperAvatarIndicatorSize12)

public val AvatarIndicator.Size10: WrapperAvatarIndicatorSize10
    @Composable
    @JvmName("WrapperAvatarIndicatorSize10")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(10.0.dp)
            width(10.0.dp)
        }
        .wrap(::WrapperAvatarIndicatorSize10)

public val AvatarIndicator.Size8: WrapperAvatarIndicatorSize8
    @Composable
    @JvmName("WrapperAvatarIndicatorSize8")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(8.0.dp)
            width(8.0.dp)
        }
        .wrap(::WrapperAvatarIndicatorSize8)

public val AvatarIndicator.Size6: WrapperAvatarIndicatorSize6
    @Composable
    @JvmName("WrapperAvatarIndicatorSize6")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(6.0.dp)
            width(6.0.dp)
        }
        .wrap(::WrapperAvatarIndicatorSize6)
