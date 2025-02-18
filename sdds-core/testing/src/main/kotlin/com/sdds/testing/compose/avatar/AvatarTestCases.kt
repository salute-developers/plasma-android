package com.sdds.testing.compose.avatar

import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarCounter
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.testing.R

/**
 * Тест кейсы для Avatar
 */

/**
 * PLASMA-T1434
 */
@Composable
fun AvatarSizeXxl(style: AvatarStyle) {
    Avatar(
        style = style,
        status = Avatar.Status.Active,
        painter = painterResource(id = R.drawable.il_avatar_for_test),
        actionEnabled = false,
        placeholder = Avatar.Placeholder.Name("Michael Scott"),
    )
}

/**
 * PLASMA-T1929
 */
@Composable
fun AvatarSizeM(style: AvatarStyle) {
    Avatar(
        style = style,
        status = Avatar.Status.Active,
        actionEnabled = false,
        placeholder = Avatar.Placeholder.Name("Michael Scott"),
    )
}

/**
 * PLASMA-T1510
 */
@Composable
fun AvatarGroupSizeS(style: AvatarGroupStyle) {
    AvatarGroup(
        style = style,
        threshold = 1,
    ) {
        avatar {
            Avatar(
                status = Avatar.Status.Active,
                actionEnabled = false,
                placeholder = Avatar.Placeholder.Name("Michael Scott"),
                painter = painterResource(id = R.drawable.il_avatar_for_test),
                contentScale = ContentScale.Fit,
            )
        }
        avatar {
            Avatar(
                status = Avatar.Status.Active,
                actionEnabled = false,
                placeholder = Avatar.Placeholder.Name("Michael Scott"),
            )
        }
        counter {
            AvatarCounter(3)
        }
    }
}
