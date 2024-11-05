package com.sdds.playground.sandbox.avatar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
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
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

/**
 *
 * @author Малышев Александр on 25.10.2024
 */

internal val Avatar.Xxl: AvatarStyleBuilder
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
        .textStyle(SddsServTheme.typography.headerH2Bold)

internal val Avatar.L: AvatarStyleBuilder
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
        .textStyle(SddsServTheme.typography.headerH4Bold)

internal val Avatar.M: AvatarStyleBuilder
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
        .textStyle(SddsServTheme.typography.bodySBold)

internal val Avatar.S: AvatarStyleBuilder
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
        .textStyle(SddsServTheme.typography.bodyXxsBold)

internal val AvatarGroup.S: AvatarGroupStyleBuilder
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
@ReadOnlyComposable
private fun AvatarColorsBuilder.defaultColors(): AvatarColorsBuilder = apply {
    activeStatusColor(SddsServTheme.colors.surfaceDefaultPositive)
    inactiveStatusColor(SddsServTheme.colors.surfaceOnLightSolidTertiary)
    textColor(SddsServTheme.gradients.textDefaultAccentGradient.first())
}
