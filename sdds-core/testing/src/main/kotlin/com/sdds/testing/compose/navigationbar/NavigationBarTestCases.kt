package com.sdds.testing.compose.navigationbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavigationBar
import com.sdds.compose.uikit.NavigationBarContentPlacement
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.compose.uikit.NavigationBarTextPlacement
import com.sdds.compose.uikit.Text

/**
 * Тест-кейсы для компонента [NavigationBar]
 */

/**
 * PLASMA-T2339
 */
@Composable
fun NavigationBarTextContentInlineCenter(style: NavigationBarStyle) {
    NavigationBar(
        style = style,
        textPlacement = NavigationBarTextPlacement.Inline,
        textAlign = NavigationBarTextAlign.Center,
        contentPlacement = NavigationBarContentPlacement.Inline,
        textContent = { Text(text = "Text") },
        content = { Text(text = "Content") },
        actionStart = {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                contentDescription = "",
            )
        },
        actionEnd = {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T2340
 */
@Composable
fun NavigationBarContentBottomStart(style: NavigationBarStyle) {
    NavigationBar(
        style = style,
        textPlacement = NavigationBarTextPlacement.Bottom,
        textAlign = NavigationBarTextAlign.Start,
        contentPlacement = NavigationBarContentPlacement.Bottom,
        textContent = {},
        content = { Text(text = "Content") },
        actionStart = {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                contentDescription = "",
            )
        },
        actionEnd = {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T2341
 */
@Composable
fun NavigationBarLongTextContentInlineCenterBottom(style: NavigationBarStyle) {
    NavigationBar(
        style = style,
        textPlacement = NavigationBarTextPlacement.Bottom,
        textAlign = NavigationBarTextAlign.Start,
        contentPlacement = NavigationBarContentPlacement.Bottom,
        textContent = { Text(text = LONG_TEXT) },
        content = { Text(text = LONG_CONTENT) },
        actionStart = {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                contentDescription = "",
            )
        },
        actionEnd = {},
    )
}

/**
 * PLASMA-T2342
 */
@Composable
fun NavigationBarTextHasActionEndInlineEndBottom(style: NavigationBarStyle) {
    NavigationBar(
        style = style,
        textPlacement = NavigationBarTextPlacement.Inline,
        textAlign = NavigationBarTextAlign.End,
        contentPlacement = NavigationBarContentPlacement.Bottom,
        textContent = { Text(text = "Text") },
        content = {},
        actionStart = {},
        actionEnd = {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T2343
 */
@Composable
fun NavigationBarLongTextBottomStartInline(style: NavigationBarStyle) {
    NavigationBar(
        style = style,
        textPlacement = NavigationBarTextPlacement.Bottom,
        textAlign = NavigationBarTextAlign.Start,
        contentPlacement = NavigationBarContentPlacement.Inline,
        textContent = { Text(text = LONG_CONTENT) },
        content = { Text(text = "Content") },
        actionStart = {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                contentDescription = "",
            )
        },
        actionEnd = {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T2344
 */
@Composable
fun NavigationBarTextContentBottomCenterBottom(style: NavigationBarStyle) {
    NavigationBar(
        style = style,
        textPlacement = NavigationBarTextPlacement.Bottom,
        textAlign = NavigationBarTextAlign.Center,
        contentPlacement = NavigationBarContentPlacement.Bottom,
        textContent = { Text(text = "Text") },
        content = { Text(text = "Content") },
        actionStart = {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                contentDescription = "",
            )
        },
        actionEnd = {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                contentDescription = "",
            )
        },
    )
}

private const val LONG_TEXT =
    "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

private const val LONG_CONTENT =
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
        "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
        "It has survived not only five centuries, but also the leap into electronic typesetting, " +
        "remaining essentially unchanged. It was popularised in the 1960s with the release of " +
        "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
        "software like Aldus PageMaker including versions of Lorem Ipsum."
