package com.sdkit.star.designsystem.styles.avatar

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.dimensionResource
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
import com.sdkit.star.designsystem.R
import com.sdkit.star.designsystem.theme.StarDsTheme

/**
 * Стиль [Avatar] размера XXL
 */
val Avatar.Xxl: AvatarStyleBuilder
    @Composable
    get() = AvatarStyle.builder()
        .colors { defaultColors() }
        .dimensions(
            AvatarDimensions(
                size = dimensionResource(id = R.dimen.sdkit_cmp_avatar_xxl_height),
                actionSize = dimensionResource(id = R.dimen.sdkit_cmp_avatar_xxl_action_size).let {
                    Size(it.floatPx, it.floatPx)
                },
                statusSize = dimensionResource(id = R.dimen.sdkit_cmp_avatar_xxl_status_size),
                statusOffset = Offset(
                    dimensionResource(id = R.dimen.sdkit_cmp_avatar_xxl_status_offset_x).floatPx,
                    dimensionResource(id = R.dimen.sdkit_cmp_avatar_xxl_status_offset_y).floatPx,
                ),
            ),
        )
        .textStyle(StarDsTheme.typography.headerH2Bold)

/**
 * Стиль [Avatar] размера L
 */
val Avatar.L: AvatarStyleBuilder
    @Composable
    get() = AvatarStyle.builder()
        .colors { defaultColors() }
        .dimensions(
            AvatarDimensions(
                size = dimensionResource(id = R.dimen.sdkit_cmp_avatar_l_height),
                actionSize = dimensionResource(id = R.dimen.sdkit_cmp_avatar_l_action_size).let {
                    Size(it.floatPx, it.floatPx)
                },
                statusSize = dimensionResource(id = R.dimen.sdkit_cmp_avatar_l_status_size),
                statusOffset = Offset(
                    dimensionResource(id = R.dimen.sdkit_cmp_avatar_l_status_offset_x).floatPx,
                    dimensionResource(id = R.dimen.sdkit_cmp_avatar_l_status_offset_y).floatPx,
                ),
            ),
        )
        .textStyle(StarDsTheme.typography.headerH4Bold)

/**
 * Стиль [Avatar] размера M
 */
val Avatar.M: AvatarStyleBuilder
    @Composable
    get() = AvatarStyle.builder()
        .colors { defaultColors() }
        .dimensions(
            AvatarDimensions(
                size = dimensionResource(id = R.dimen.sdkit_cmp_avatar_m_height),
                actionSize = dimensionResource(id = R.dimen.sdkit_cmp_avatar_m_action_size).let {
                    Size(it.floatPx, it.floatPx)
                },
                statusSize = dimensionResource(id = R.dimen.sdkit_cmp_avatar_m_status_size),
                statusOffset = Offset(
                    dimensionResource(id = R.dimen.sdkit_cmp_avatar_m_status_offset_x).floatPx,
                    dimensionResource(id = R.dimen.sdkit_cmp_avatar_m_status_offset_y).floatPx,
                ),
            ),
        )
        .textStyle(StarDsTheme.typography.bodySBold)

/**
 * Стиль [Avatar] размера S
 */
val Avatar.S: AvatarStyleBuilder
    @Composable
    get() = AvatarStyle.builder()
        .colors { defaultColors() }
        .dimensions(
            AvatarDimensions(
                size = dimensionResource(id = R.dimen.sdkit_cmp_avatar_s_height),
                actionSize = dimensionResource(id = R.dimen.sdkit_cmp_avatar_s_action_size).let {
                    Size(it.floatPx, it.floatPx)
                },
                statusSize = dimensionResource(id = R.dimen.sdkit_cmp_avatar_s_status_size),
                statusOffset = Offset.Zero,
            ),
        )
        .textStyle(StarDsTheme.typography.bodyXxsBold)

/**
 * Стиль [AvatarGroup] размера S
 */
val AvatarGroup.S: AvatarGroupStyleBuilder
    @Composable
    get() = AvatarGroupStyle.builder()
        .avatarStyle(Avatar.S.style())
        .dimensions(
            AvatarGroupDimensions(
                itemOffset = dimensionResource(id = R.dimen.sdkit_cmp_avatar_group_s_item_offset),
                itemSpacing = dimensionResource(id = R.dimen.sdkit_cmp_avatar_group_s_item_spacing),
            ),
        )

@Composable
private fun AvatarColorsBuilder.defaultColors(): AvatarColorsBuilder = apply {
    activeStatusColor(StarDsTheme.colors.surfaceDefaultPositive)
    inactiveStatusColor(StarDsTheme.colors.surfaceOnLightSolidTertiary)
    textColor(StarDsTheme.gradients.textDefaultGradientMain.first())
}
