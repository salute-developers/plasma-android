
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.plasma.homeds.styles.customcomponents.bubble

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.shadow.ShadowLayer
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.icons.R
import com.sdds.plasma.homeds.components.bubble.BubbleStyle
import com.sdds.plasma.homeds.components.bubble.BubbleStyleBuilder
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperBubble : BuilderWrapper<BubbleStyle, BubbleStyleBuilder>

/**
 * Обёртка для вариации Default.
 */
@JvmInline
public value class WrapperBubbleDefault(
    public override val builder: BubbleStyleBuilder,
) : WrapperBubble

public val Bubble.Default: WrapperBubbleDefault
    @Composable
    @JvmName("WrapperBubbleDefault")
    get() = BubbleStyle.builder()
        .colors {
            bodyColor(PlasmaHomeDsTheme.colors.surfaceDefaultPositive)
            iconColor(PlasmaHomeDsTheme.colors.textOnDarkPrimary)
            borderColor(PlasmaHomeDsTheme.colors.outlineOnDarkTransparentPrimary)
            textColor(PlasmaHomeDsTheme.colors.textOnDarkPrimary)
            progressTrackColor(PlasmaHomeDsTheme.colors.textDefaultTertiary)
            progressValueColor(Color(0xF5D0FF77))
        }
        .dimensions {
            circleSize(32.dp)
            iconSize(16.dp)
            bodyCornerRadius(12.dp)
            bodyNearCornerRadius(5.dp)
            bodyMinHeight(40.dp)
            width(74.dp)
            neckWidth(12.dp)
            neckLength(3.dp)
            neckFilletRadius(3.dp)
            paddingStart(8.dp)
            paddingEnd(8.dp)
            paddingTop(6.dp)
            paddingBottom(8.dp)
            progressHeight(2.dp)
            progressSpacing(8.dp)
            progressPointerThickness(2.dp)
            progressCornerRadius(1.dp)
            chevronTextOverlap(3.dp)
            chevronIconSize(16.dp)
        }
        .textStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .shadow(
            ShadowAppearance(
                listOf(
                    ShadowLayer(
                        color = Color(0xFFD0FF77).copy(alpha = 0.6f),
                        offset = DpOffset.Zero,
                        spreadRadius = 0.dp,
                        blurRadius = 4.dp,
                    ),
                ),
            ),
        )
        .starIcon(R.drawable.ic_star_four_fill_16)
        .closeIcon(R.drawable.ic_close_24)
        .expandDuration(600)
        .collapseDuration(600)
        .wrap(::WrapperBubbleDefault)
