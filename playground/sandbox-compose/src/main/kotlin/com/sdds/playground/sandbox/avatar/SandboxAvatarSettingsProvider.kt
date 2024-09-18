package com.sdds.playground.sandbox.avatar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

/**
 * Провайдер настроек для [SandboxAvatar]
 */
internal object SandboxAvatarSettingsProvider {

    val ScrimColor: Color
        @Composable
        @ReadOnlyComposable
        get() = Color(0x8F080808)

    const val Threshold = 3

    @Composable
    fun getGroupDimensions(size: SandboxAvatar.Size): SandboxAvatarGroup.Dimensions =
        SandboxAvatarGroup.Dimensions(
            itemOffset = size.value * 0.66f,
            itemSpacing = 2.dp,
        )

    @Composable
    fun getDimensionsFor(size: SandboxAvatar.Size): SandboxAvatar.Dimensions =
        when (size) {
            SandboxAvatar.Size.XXL -> SandboxAvatar.Dimensions(
                actionSize = 36.dp,
                statusSize = 12.dp,
                statusOffsetX = 7.dp,
                statusOffsetY = 7.dp,
            )
            SandboxAvatar.Size.L -> SandboxAvatar.Dimensions(
                actionSize = 24.dp,
                statusSize = 8.dp,
                statusOffsetX = 3.dp,
                statusOffsetY = 3.dp,
            )
            SandboxAvatar.Size.M -> SandboxAvatar.Dimensions(
                actionSize = 24.dp,
                statusSize = 8.dp,
                statusOffsetX = 2.dp,
                statusOffsetY = 2.dp,
            )

            SandboxAvatar.Size.S -> SandboxAvatar.Dimensions(
                actionSize = 16.dp,
                statusSize = 6.dp,
                statusOffsetX = 0.dp,
                statusOffsetY = 0.dp,
            )
        }

    @Composable
    fun textStyleFor(size: SandboxAvatar.Size): TextStyle =
        when (size) {
            SandboxAvatar.Size.XXL -> SddsServTheme.typography.headerH2Bold
            SandboxAvatar.Size.L -> SddsServTheme.typography.headerH4Bold
            SandboxAvatar.Size.M -> SddsServTheme.typography.bodySBold
            SandboxAvatar.Size.S -> SddsServTheme.typography.bodyXxsBold
        }

    @Composable
    fun colorFor(status: SandboxAvatar.Status): Color =
        when (status) {
            SandboxAvatar.Status.None -> Color.Transparent
            SandboxAvatar.Status.Active -> SddsServTheme.colors.textDefaultAccent
            SandboxAvatar.Status.Inactive -> Color(0xFFDDDDDD)
        }
}
