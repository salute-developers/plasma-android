package com.sdds.testing.compose.badge

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Badge
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconBadge
import com.sdds.icons.R

/**
 * Тест кейсы для Badge
 */
@Suppress("UndocumentedPublicFunction")
@Composable
fun BadgeSizeLDefaultContentLeft(style: BadgeStyle) {
    Badge(
        style = style,
        label = "Label",
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_plasma_16),
                contentDescription = "",
            )
        },
    )
}

@Suppress("UndocumentedPublicFunction")
@Composable
fun BadgeSizeMAccentContentRight(style: BadgeStyle) {
    Badge(
        style = style,
        label = "Label",
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_plasma_16),
                contentDescription = "",
            )
        },
    )
}

@Suppress("UndocumentedPublicFunction")
@Composable
fun BadgeCommon(style: BadgeStyle) {
    Badge(
        style = style,
        label = "Label",
    )
}

@Suppress("UndocumentedPublicFunction")
@Composable
fun IconBadgeCommon(style: BadgeStyle) {
    IconBadge(
        style = style,
        content = {
            Icon(
                painter = painterResource(id = R.drawable.ic_plasma_16),
                contentDescription = "",
            )
        },
    )
}
