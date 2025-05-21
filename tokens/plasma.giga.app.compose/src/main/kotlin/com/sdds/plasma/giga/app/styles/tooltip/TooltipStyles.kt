// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.tooltip

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.TooltipStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTooltip : BuilderWrapper<TooltipStyle, TooltipStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTooltipM(
    public override val builder: TooltipStyleBuilder,
) : WrapperTooltip

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTooltipS(
    public override val builder: TooltipStyleBuilder,
) : WrapperTooltip

private val TooltipStyleBuilder.invariantProps: TooltipStyleBuilder
    @Composable
    get() = this
        .shadow(PlasmaGigaAppTheme.shadows.downHardM)
        .colors {
            backgroundColor(
                SolidColor(PlasmaGigaAppTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            textColor(
                SolidColor(PlasmaGigaAppTheme.colors.textDefaultPrimary).asStatefulValue(),
            )
            contentStartColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .dimensions {
            contentStartSize(16.0.dp)
        }

public val Tooltip.M: WrapperTooltipM
    @Composable
    @JvmName("WrapperTooltipM")
    get() = TooltipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .textStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .dimensions {
            contentStartPadding(6.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
            offset(8.0.dp)
            tailWidth(20.0.dp)
            tailHeight(8.0.dp)
            tailPadding(10.0.dp)
        }
        .wrap(::WrapperTooltipM)

public val Tooltip.S: WrapperTooltipS
    @Composable
    @JvmName("WrapperTooltipS")
    get() = TooltipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundS)
        .textStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .dimensions {
            contentStartPadding(4.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            offset(6.0.dp)
            tailWidth(14.0.dp)
            tailHeight(6.0.dp)
            tailPadding(9.0.dp)
        }
        .wrap(::WrapperTooltipS)
