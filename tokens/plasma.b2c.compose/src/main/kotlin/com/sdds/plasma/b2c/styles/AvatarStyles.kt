package com.sdds.plasma.b2c.styles

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
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTheme

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
                statusOffset = Offset(7.dp.floatPx, 7.dp.floatPx),
            ),
        )
        .textStyle(PlasmaB2cTheme.typography.headerH2Bold)

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
                statusOffset = Offset(3.dp.floatPx, 3.dp.floatPx),
            ),
        )
        .textStyle(PlasmaB2cTheme.typography.headerH4Bold)

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
                statusOffset = Offset(2.dp.floatPx, 2.dp.floatPx),
            ),
        )
        .textStyle(PlasmaB2cTheme.typography.bodySBold)

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
        .textStyle(PlasmaB2cTheme.typography.bodyXxsBold)

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
    activeStatusColor(PlasmaB2cTheme.colors.textDefaultAccent)
    inactiveStatusColor(PlasmaB2cTheme.colors.surfaceOnLightSolidTertiary)
    textColor(PlasmaB2cTheme.gradients.textDefaultAccentGradient.first())
}