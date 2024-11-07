package com.sdds.playground.sandbox.avatar

import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarCounter
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme

/**
 * Превью [Avatar]
 */
@Composable
@Preview(showBackground = true)
internal fun AvatarPreviewSizeXXL() {
    SandboxTheme {
        Avatar(
            style = Avatar.Xxl.style(),
            status = Avatar.Status.Active,
            painter = painterResource(id = R.drawable.il_avatar_test),
            actionEnabled = false,
            placeholder = Avatar.Placeholder.Name("Michael Scott"),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun AvatarPreviewSizeM() {
    SandboxTheme {
        Avatar(
            style = Avatar.M.style(),
            status = Avatar.Status.Active,
            actionEnabled = false,
            placeholder = Avatar.Placeholder.Name("Michael Scott"),
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
                    status = Avatar.Status.Active,
                    actionEnabled = false,
                    placeholder = Avatar.Placeholder.Name("Michael Scott"),
                    painter = painterResource(id = R.drawable.il_avatar_test),
                    contentScale = ContentScale.Fit,
                )
            }
            avatar {
                Avatar(
                    style = Avatar.S.style(),
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
}
