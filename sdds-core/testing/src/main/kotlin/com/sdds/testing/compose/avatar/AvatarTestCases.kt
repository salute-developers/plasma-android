package com.sdds.testing.compose.avatar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarCounter
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.Badge
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Image
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
        status = AvatarStatus.Active,
        painter = painterResource(id = R.drawable.il_avatar_for_test),
        actionEnabled = false,
        placeholder = AvatarPlaceholder.Name("Michael Scott"),
    )
}

/**
 * PLASMA-T1929
 */
@Composable
fun AvatarSizeM(style: AvatarStyle) {
    Avatar(
        style = style,
        status = AvatarStatus.Active,
        actionEnabled = false,
        placeholder = AvatarPlaceholder.Name("Michael Scott"),
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
                status = AvatarStatus.Active,
                actionEnabled = false,
                placeholder = AvatarPlaceholder.Name("Michael Scott"),
                painter = painterResource(id = R.drawable.il_avatar_for_test),
                contentScale = ContentScale.Fit,
            )
        }
        avatar {
            Avatar(
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

/**
 * PLASMA-T1982
 */
@Composable
fun AvatarSizeXxlCounterTopStart(style: AvatarStyle) {
    Avatar(
        style = style,
        status = AvatarStatus.Active,
        actionEnabled = false,
        placeholder = AvatarPlaceholder.Name("Michael Scott"),
        extra = {
            Counter(
                modifier = Modifier.align(Alignment.TopStart),
                count = "1",
            )
        },
        content = {},
    )
}

/**
 * PLASMA-T1983
 */
@Composable
fun AvatarSizeLCounterTopEnd(style: AvatarStyle) {
    Avatar(
        style = style,
        status = AvatarStatus.None,
        actionEnabled = false,
        placeholder = AvatarPlaceholder.Name("Michael Scott"),
        extra = {
            Counter(
                modifier = Modifier.align(Alignment.TopEnd),
                count = "123",
            )
        },
        content = {},
    )
}

/**
 * PLASMA-T1984
 */
@Composable
fun AvatarSizeMCounterBottomEnd(style: AvatarStyle) {
    Avatar(
        style = style,
        status = AvatarStatus.None,
        actionEnabled = false,
        placeholder = AvatarPlaceholder.Name("Michael Scott"),
        extra = {
            Counter(
                modifier = Modifier.align(Alignment.BottomEnd),
                count = "123",
            )
        },
        content = {
            Image(
                painterResource(id = R.drawable.il_avatar_for_test),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1985
 */
@Composable
fun AvatarSizeSCounterBottomStart(style: AvatarStyle) {
    Avatar(
        style = style,
        status = AvatarStatus.None,
        actionEnabled = false,
        placeholder = AvatarPlaceholder.Name("Michael Scott"),
        extra = {
            Counter(
                modifier = Modifier.align(Alignment.BottomStart),
                count = "1",
            )
        },
        content = {},
    )
}

/**
 * PLASMA-T1986
 */
@Composable
fun AvatarSizeXxlBadgeTopStartContentStart(style: AvatarStyle) {
    Avatar(
        style = style,
        status = AvatarStatus.None,
        actionEnabled = false,
        placeholder = AvatarPlaceholder.Name("Michael Scott"),
        extra = {
            Badge(
                modifier = Modifier.align(Alignment.TopStart),
                label = "Label",
                startContent = {
                    Icon(
                        painter = painterResource(id = com.sdds.icons.R.drawable.ic_plasma_16),
                        contentDescription = "",
                    )
                },
            )
        },
        content = {
            Image(
                painter = painterResource(id = R.drawable.il_avatar_for_test),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1987
 */
@Composable
fun AvatarSizeXxlBadgeBottomEndContentEnd(style: AvatarStyle) {
    Avatar(
        style = style,
        status = AvatarStatus.None,
        actionEnabled = false,
        placeholder = AvatarPlaceholder.Name("Michael Scott"),
        extra = {
            Badge(
                modifier = Modifier.align(Alignment.BottomEnd),
                label = "Label",
                endContent = {
                    Icon(
                        painter = painterResource(id = com.sdds.icons.R.drawable.ic_plasma_16),
                        contentDescription = "",
                    )
                },
            )
        },
        content = {},
    )
}

/**
 * PLASMA-T1988
 */
@Composable
fun AvatarSizeLBadgeTopEndContentStart(style: AvatarStyle) {
    Avatar(
        style = style,
        status = AvatarStatus.Active,
        actionEnabled = false,
        placeholder = AvatarPlaceholder.Name("Michael Scott"),
        extra = {
            Badge(
                modifier = Modifier.align(Alignment.TopEnd),
                label = "",
                startContent = {
                    Icon(
                        painter = painterResource(id = com.sdds.icons.R.drawable.ic_plasma_16),
                        contentDescription = "",
                    )
                },
            )
        },
        content = {},
    )
}

/**
 * PLASMA-T1989
 */
@Composable
fun AvatarSizeMBadgeBottomStart(style: AvatarStyle) {
    Avatar(
        style = style,
        status = AvatarStatus.None,
        actionEnabled = false,
        placeholder = AvatarPlaceholder.Name("Michael Scott"),
        extra = {
            Badge(
                modifier = Modifier.align(Alignment.BottomStart),
                label = "Label",
            )
        },
        content = {
            Image(
                painter = painterResource(id = R.drawable.il_avatar_for_test),
                contentDescription = "",
            )
        },
    )
}
