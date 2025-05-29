// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.toast

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.ToastStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperToast : BuilderWrapper<ToastStyle, ToastStyleBuilder>

/**
 * Обертка для вариации Rounded
 */
@JvmInline
public value class WrapperToastRounded(
    public override val builder: ToastStyleBuilder,
) : WrapperToast

/**
 * Обертка для вариации Pilled
 */
@JvmInline
public value class WrapperToastPilled(
    public override val builder: ToastStyleBuilder,
) : WrapperToast

private val ToastStyleBuilder.invariantProps: ToastStyleBuilder
    @Composable
    get() = this
        .textStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .colors {
            backgroundColor(
                SolidColor(StylesSaluteTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            textColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            contentStartColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            contentEndColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .dimensions {
            contentStartSize(16.0.dp)
            contentEndSize(16.0.dp)
            contentStartPadding(6.0.dp)
            contentEndPadding(8.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }

public val Toast.Rounded: WrapperToastRounded
    @Composable
    @JvmName("WrapperToastRounded")
    get() = ToastStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .wrap(::WrapperToastRounded)

public val Toast.Pilled: WrapperToastPilled
    @Composable
    @JvmName("WrapperToastPilled")
    get() = ToastStyle.builder(this)
        .invariantProps
        .shape(CircleShape)
        .wrap(::WrapperToastPilled)
