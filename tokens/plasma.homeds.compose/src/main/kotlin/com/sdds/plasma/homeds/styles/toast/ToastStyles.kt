// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.toast

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
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperToast : BuilderWrapper<ToastStyle, ToastStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperToastTerminate(
    public override val builder: ToastStyleBuilder,
) : WrapperToast

public val Toast.Default: WrapperToastTerminate
    @Composable
    get() = ToastStyle.builder(this)
        .invariantProps
        .colors {
            contentStartColor(
                PlasmaHomeDsTheme.colors.textInversePrimary.asInteractive(),
            )
        }
        .wrap(::WrapperToastTerminate)

public val Toast.Positive: WrapperToastTerminate
    @Composable
    get() = ToastStyle.builder(this)
        .invariantProps
        .colors {
            contentStartColor(
                PlasmaHomeDsTheme.colors.textInversePositive.asInteractive(),
            )
        }
        .wrap(::WrapperToastTerminate)

public val Toast.Negative: WrapperToastTerminate
    @Composable
    get() = ToastStyle.builder(this)
        .invariantProps
        .colors {
            contentStartColor(
                PlasmaHomeDsTheme.colors.textInverseNegative.asInteractive(),
            )
        }
        .wrap(::WrapperToastTerminate)

private val ToastStyleBuilder.invariantProps: ToastStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .textStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .colors {
            backgroundColor(
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(),
            )
            textColor(
                PlasmaHomeDsTheme.colors.textInversePrimary.asInteractive(),
            )
            contentEndColor(
                PlasmaHomeDsTheme.colors.textInverseSecondary.asInteractive(),
            )
        }
        .dimensions {
            contentStartSize(16.0.dp)
            contentEndSize(16.0.dp)
            contentStartPadding(6.0.dp)
            contentEndPadding(6.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
        }
