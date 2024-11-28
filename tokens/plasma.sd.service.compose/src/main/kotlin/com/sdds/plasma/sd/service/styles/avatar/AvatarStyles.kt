package com.sdds.plasma.sd.service.styles.avatar

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarColorsBuilder
import com.sdds.compose.uikit.AvatarDimensions
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.AvatarGroupDimensions
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarGroupStyleBuilder
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.AvatarStyleBuilder
import com.sdds.compose.uikit.floatPx
import com.sdds.plasma.sd.service.tokens.compose.PlasmaSdServiceTheme

/**
 * Стиль [Avatar] размера XXL
 */
val Avatar.Xxl: AvatarStyleBuilder
    @Composable
    get() = AvatarStyle.builder()
        .colors { defaultColors() }
        .dimensions(
            AvatarDimensions(
                size = 88.dp,
                actionSize = Size(36.dp.floatPx, 36.dp.floatPx),
                statusSize = 12.dp,
                statusOffset = Offset(1.dp.floatPx, 7.dp.floatPx),
            ),
        )
        .textStyle(PlasmaSdServiceTheme.typography.headerH2Bold)

/**
 * Стиль [Avatar] размера L
 */
val Avatar.L: AvatarStyleBuilder
    @Composable
    get() = AvatarStyle.builder()
        .colors { defaultColors() }
        .dimensions(
            AvatarDimensions(
                size = 48.dp,
                actionSize = Size(24.dp.floatPx, 24.dp.floatPx),
                statusSize = 8.dp,
                statusOffset = Offset(1.dp.floatPx, 3.dp.floatPx),
            ),
        )
        .textStyle(PlasmaSdServiceTheme.typography.headerH4Bold)

/**
 * Стиль [Avatar] размера M
 */
val Avatar.M: AvatarStyleBuilder
    @Composable
    get() = AvatarStyle.builder()
        .colors { defaultColors() }
        .dimensions(
            AvatarDimensions(
                size = 36.dp,
                actionSize = Size(24.dp.floatPx, 24.dp.floatPx),
                statusSize = 8.dp,
                statusOffset = Offset(0.dp.floatPx, 2.dp.floatPx),
            ),
        )
        .textStyle(PlasmaSdServiceTheme.typography.bodySBold)

/**
 * Стиль [Avatar] размера S
 */
val Avatar.S: AvatarStyleBuilder
    @Composable
    get() = AvatarStyle.builder()
        .colors { defaultColors() }
        .dimensions(
            AvatarDimensions(
                size = 24.dp,
                actionSize = Size(16.dp.floatPx, 16.dp.floatPx),
                statusSize = 6.dp,
                statusOffset = Offset.Zero,
            ),
        )
        .textStyle(PlasmaSdServiceTheme.typography.bodyXxsBold)

/**
 * Стиль [AvatarGroup] размера S
 */
val AvatarGroup.S: AvatarGroupStyleBuilder
    @Composable
    get() = AvatarGroupStyle.builder()
        .avatarStyle(Avatar.S.style())
        .dimensions(
            AvatarGroupDimensions(
                itemOffset = 16.dp,
                itemSpacing = 2.dp,
            ),
        )

@Composable
private fun AvatarColorsBuilder.defaultColors(): AvatarColorsBuilder = apply {
    activeStatusColor(PlasmaSdServiceTheme.colors.surfaceDefaultPositive)
    inactiveStatusColor(PlasmaSdServiceTheme.colors.surfaceOnLightSolidTertiary)
    textColor(PlasmaSdServiceTheme.gradients.textDefaultAccentGradient.first())
}
