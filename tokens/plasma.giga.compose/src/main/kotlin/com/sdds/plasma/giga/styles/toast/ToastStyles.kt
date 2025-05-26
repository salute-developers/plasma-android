// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.toast

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
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperToast : BuilderWrapper<ToastStyle, ToastStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperToastView : WrapperToast

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperToastTerminate(
    public override val builder: ToastStyleBuilder,
) : WrapperToast

/**
 * Обертка для вариации Rounded
 */
@JvmInline
public value class WrapperToastRounded(
    public override val builder: ToastStyleBuilder,
) : WrapperToastView

/**
 * Обертка для вариации Pilled
 */
@JvmInline
public value class WrapperToastPilled(
    public override val builder: ToastStyleBuilder,
) : WrapperToastView

public val WrapperToastView.Default: WrapperToastTerminate
    @Composable
    get() = builder
        .colors {
            contentStartColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperToastTerminate)

public val WrapperToastView.Positive: WrapperToastTerminate
    @Composable
    get() = builder
        .colors {
            contentStartColor(
                PlasmaGigaTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperToastTerminate)

public val WrapperToastView.Negative: WrapperToastTerminate
    @Composable
    get() = builder
        .colors {
            contentStartColor(
                PlasmaGigaTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperToastTerminate)

private val ToastStyleBuilder.invariantProps: ToastStyleBuilder
    @Composable
    get() = this
        .textStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .colors {
            backgroundColor(
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            textColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
            contentEndColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
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
        .shape(PlasmaGigaTheme.shapes.roundM)
        .wrap(::WrapperToastRounded)

public val Toast.Pilled: WrapperToastPilled
    @Composable
    @JvmName("WrapperToastPilled")
    get() = ToastStyle.builder(this)
        .invariantProps
        .shape(CircleShape)
        .wrap(::WrapperToastPilled)
