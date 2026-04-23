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
 * Обертка для вариации Size40
 */
@JvmInline
public value class WrapperCircularProgressBarSize40(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

/**
 * Обертка для вариации Size32
 */
@JvmInline
public value class WrapperCircularProgressBarSize32(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

/**
 * Обертка для вариации Size24
 */
@JvmInline
public value class WrapperCircularProgressBarSize24(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

/**
 * Обертка для вариации Size16
 */
@JvmInline
public value class WrapperCircularProgressBarSize16(
    public override val builder: CircularProgressBarStyleBuilder,
) : WrapperCircularProgressBarView

public val WrapperCircularProgressBarView.ModeColorPrimary: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.ModeColorSecondary: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.ModeColorGlobalWhite: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimary).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.ModeColorAccent: WrapperCircularProgressBarTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(),
            )
        }
        .wrap(::WrapperCircularProgressBarTerminate)

public val WrapperCircularProgressBarView.ModeColorDanger: WrapperCircularProgressBarTerminate
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
        .valueEnabled(true)

public val CircularProgressBar.Size40: WrapperCircularProgressBarSize40
    @Composable
    @JvmName("WrapperCircularProgressBarSize40")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(40.0.dp)
            height(40.0.dp)
            trackThickness(3.0.dp)
            progressThickness(3.0.dp)
            iconSize(24.0.dp)
        }
        .wrap(::WrapperCircularProgressBarSize40)

public val CircularProgressBar.Size32: WrapperCircularProgressBarSize32
    @Composable
    @JvmName("WrapperCircularProgressBarSize32")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(32.0.dp)
            height(32.0.dp)
            trackThickness(2.0.dp)
            progressThickness(2.0.dp)
            iconSize(20.0.dp)
        }
        .wrap(::WrapperCircularProgressBarSize32)

public val CircularProgressBar.Size24: WrapperCircularProgressBarSize24
    @Composable
    @JvmName("WrapperCircularProgressBarSize24")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(24.0.dp)
            height(24.0.dp)
            trackThickness(1.5.dp)
            progressThickness(1.5.dp)
            iconSize(16.0.dp)
        }
        .wrap(::WrapperCircularProgressBarSize24)

public val CircularProgressBar.Size16: WrapperCircularProgressBarSize16
    @Composable
    @JvmName("WrapperCircularProgressBarSize16")
    get() = CircularProgressBarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(16.0.dp)
            height(16.0.dp)
            trackThickness(1.0.dp)
            progressThickness(1.0.dp)
            iconSize(12.0.dp)
        }
        .wrap(::WrapperCircularProgressBarSize16)
