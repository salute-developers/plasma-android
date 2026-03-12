// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.tooltip

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.TooltipStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
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
public interface WrapperTooltip : BuilderWrapper<TooltipStyle, TooltipStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperTooltipDefault(
    public override val builder: TooltipStyleBuilder,
) : WrapperTooltip

public val Tooltip.Default: WrapperTooltipDefault
    @Composable
    @JvmName("WrapperTooltipDefault")
    get() = TooltipStyle.builder(this)
        .shape(SddsSbComTheme.shapes.roundXxs)
        .textStyle(SddsSbComTheme.typography.bodySNormal)
        .shadow(SddsSbComTheme.shadows.downHardM)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(),
            )
            textColor(
                SolidColor(SddsSbComTheme.colors.textInversePrimary).asStatefulValue(),
            )
            contentStartColor(
                SddsSbComTheme.colors.textInversePrimary.asInteractive(),
            )
        }
        .dimensions {
            contentStartSize(16.0.dp)
            contentStartPadding(6.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
            offset(8.0.dp)
            tailWidth(20.0.dp)
            tailHeight(8.0.dp)
            tailPadding(10.0.dp)
        }
        .wrap(::WrapperTooltipDefault)
