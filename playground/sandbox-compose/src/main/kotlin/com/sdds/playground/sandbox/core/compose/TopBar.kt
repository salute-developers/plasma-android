package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.icons.R

internal val LocalTopBarStyle = compositionLocalOf { TopBarStyle.create() }

@Immutable
internal interface TopBarStyle {
    val titleStyle: TextStyle
    val titleColor: Color
    val backgroundColor: Color
    val contentColor: Color
    val navigationButtonStyle: ButtonStyle
    val actionButtonStyle: ButtonStyle

    companion object {

        fun create(
            titleStyle: TextStyle = TextStyle.Default,
            titleColor: Color = Color.Black,
            backgroundColor: Color = Color.Transparent,
            contentColor: Color = Color.Black,
            navigationButtonStyle: ButtonStyle = ButtonStyle.iconButtonBuilder().style(),
            actionButtonStyle: ButtonStyle = ButtonStyle.iconButtonBuilder().style(),
        ): TopBarStyle =
            TopBarStyleImpl(
                titleStyle = titleStyle,
                titleColor = titleColor,
                backgroundColor = backgroundColor,
                contentColor = contentColor,
                navigationButtonStyle = navigationButtonStyle,
                actionButtonStyle = actionButtonStyle,
            )
    }
}

/**
 *
 * @author Малышев Александр on 25.02.2025
 */
@Composable
internal fun TopBar(
    title: String,
    style: TopBarStyle = LocalTopBarStyle.current,
    onNavigationClick: () -> Unit,
    actions: @Composable RowScope.() -> Unit = {},
) {
    TopAppBar(
        modifier = Modifier.statusBarsPadding(),
        title = {
            Text(
                text = title,
                style = style.titleStyle.copy(color = style.titleColor),
            )
        },
        elevation = 1.dp,
        navigationIcon = {
            IconButton(
                style = style.navigationButtonStyle,
                icon = painterResource(id = R.drawable.ic_menu_24),
                onClick = onNavigationClick,
            )
        },
        backgroundColor = style.backgroundColor,
        contentColor = style.contentColor,
        actions = {
            CompositionLocalProvider(
                LocalIconButtonStyle provides style.actionButtonStyle,
                LocalButtonStyle provides style.actionButtonStyle,
            ) {
                actions()
            }
        },
    )
}

@Immutable
private data class TopBarStyleImpl(
    override val titleStyle: TextStyle,
    override val titleColor: Color,
    override val backgroundColor: Color,
    override val contentColor: Color,
    override val navigationButtonStyle: ButtonStyle,
    override val actionButtonStyle: ButtonStyle,
) : TopBarStyle
