package com.sdds.playground.sandbox.compose.avatar

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.avatar
import com.sdds.compose.uikit.floatPx
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.ScrimColor
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.colorFor
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.getDimensionsFor
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.textStyleFor
import com.sdds.playground.sandbox.compose.R
import com.sdds.playground.sandbox.compose.SandboxTheme

@Composable
internal fun SandboxAvatar(
    modifier: Modifier = Modifier,
    size: SandboxAvatar.Size = SandboxAvatar.Size.M,
    status: SandboxAvatar.Status = SandboxAvatar.Status.None,
    action: Painter? = null,
    actionEnabled: Boolean = false,
    text: String? = null,
    contentDescription: String = "Avatar",
    image: Painter? = null,
    contentScale: ContentScale = ContentScale.None,
) {
    val dimensions = getDimensionsFor(size)
    Avatar(
        modifier = modifier.size(size.value),
        statusEnabled = true,
        statusColor = colorFor(status = status),
        statusOffset = Offset(dimensions.statusOffsetX.floatPx, dimensions.statusOffsetY.floatPx),
        statusSize = dimensions.statusSize,
        text = text,
        textStyle = textStyleFor(size = size),
        action = action,
        actionEnabled = actionEnabled,
        actionSize = Size(dimensions.actionSize.floatPx, dimensions.actionSize.floatPx),
        actionScrimColor = ScrimColor,
        contentDescription = contentDescription,
        painter = image,
        contentScale = contentScale,
    )
}

internal fun Modifier.avatar(
    size: SandboxAvatar.Size = SandboxAvatar.Size.M,
    status: SandboxAvatar.Status = SandboxAvatar.Status.None,
    action: Painter? = null,
    actionEnabled: Boolean = false,
    text: String? = null,
): Modifier = this
    .size(size.value)
    .composed {
        val dimensions = getDimensionsFor(size)
        avatar(
            statusEnabled = true,
            statusColor = colorFor(status = status),
            statusOffset = Offset(dimensions.statusOffsetX.floatPx, dimensions.statusOffsetY.floatPx),
            statusSize = dimensions.statusSize,
            text = text,
            textStyle = textStyleFor(size = size),
            action = action,
            actionEnabled = actionEnabled,
            actionSize = Size(dimensions.actionSize.floatPx, dimensions.actionSize.floatPx),
            actionScrimColor = ScrimColor,
        )
    }

/**
 * Параметры компонента [SandboxAvatar]
 */
internal object SandboxAvatar {

    @Immutable
    data class Dimensions(
        val actionSize: Dp,
        val statusSize: Dp,
        val statusOffsetX: Dp,
        val statusOffsetY: Dp,
    )

    /**
     * Размер компонента
     */
    enum class Size(val value: Dp) {
        XXL(88.dp),
        L(48.dp),
        M(36.dp),
        S(24.dp),
    }

    enum class Status {
        None, Active, Inactive
    }
}

/**
 * Превью [SandboxAvatar]
 */
@Composable
@Preview(showBackground = true)
fun SandboxAvatarPreview() {
    SandboxTheme {
        SandboxAvatar(
            image = painterResource(id = R.drawable.il_avatar_test),
        )
    }
}
