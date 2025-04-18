package com.sdds.playground.sandbox.avatar.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarCounter
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.styles.avatar.Avatar
import com.sdds.serv.styles.avatar.M
import com.sdds.serv.styles.avatar.S
import com.sdds.serv.styles.avatar.Xxl
import com.sdds.serv.styles.avatargroup.AvatarGroup
import com.sdds.serv.styles.avatargroup.S

/**
 * Превью [Avatar]
 */
@Composable
@Preview(showBackground = true)
internal fun AvatarPreviewSizeXXL() {
    SandboxTheme {
        Avatar(
            style = Avatar.Xxl.style(),
            status = AvatarStatus.Active,
            painter = painterResource(id = R.drawable.il_avatar_test),
            actionEnabled = false,
            placeholder = AvatarPlaceholder.Name("Michael Scott"),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun AvatarPreviewSizeM() {
    SandboxTheme {
        Avatar(
            style = Avatar.M.style(),
            status = AvatarStatus.Active,
            actionEnabled = false,
            placeholder = AvatarPlaceholder.Name("Michael Scott"),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun AvatarGroupPreviewSizeS() {
    SandboxTheme {
        AvatarGroup(
            style = AvatarGroup.S.style(),
            threshold = 1,
        ) {
            avatar {
                Avatar(
                    style = Avatar.S.style(),
                    status = AvatarStatus.Active,
                    actionEnabled = false,
                    placeholder = AvatarPlaceholder.Name("Michael Scott"),
                    painter = painterResource(id = R.drawable.il_avatar_test),
                    contentScale = ContentScale.Fit,
                )
            }
            avatar {
                Avatar(
                    style = Avatar.S.style(),
                    status = AvatarStatus.Active,
                    actionEnabled = false,
                    placeholder = AvatarPlaceholder.Name("Michael Scott"),
                )
            }
            counter {
                AvatarCounter(3)
            }
        }
    }
}
