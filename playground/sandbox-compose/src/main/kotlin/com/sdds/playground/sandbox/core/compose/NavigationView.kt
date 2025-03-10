package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive

internal val LocalNavigationViewStyle = compositionLocalOf { NavigationViewStyle.create() }

internal interface NavigationViewStyle {
    val itemTextStyle: TextStyle
    val itemTextColor: InteractiveColor
    val itemBackground: InteractiveColor

    val itemPadding: PaddingValues

    val dividerStartIndent: Dp

    companion object {

        fun create(
            itemTextStyle: TextStyle = TextStyle.Default,
            itemTextColor: InteractiveColor = Color.Black.asInteractive(),
            itemBackground: InteractiveColor = Color.Black.asInteractive(),
            itemPaddings: PaddingValues = PaddingValues(all = 16.dp),
            dividerStartIndent: Dp = 16.dp,
        ): NavigationViewStyle =
            NavigationViewStyleImpl(
                itemTextStyle = itemTextStyle,
                itemTextColor = itemTextColor,
                itemBackground = itemBackground,
                itemPadding = itemPaddings,
                dividerStartIndent = dividerStartIndent,
            )
    }
}

/**
 *
 * @author Малышев Александр on 25.02.2025
 */
@Composable
internal fun NavigationView(
    items: List<MenuItem>,
    onSelect: (MenuItem) -> Unit,
    modifier: Modifier = Modifier,
    focusable: Boolean = false,
    style: NavigationViewStyle = LocalNavigationViewStyle.current,
) {
    var currentIndex by remember { mutableStateOf(0) }
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .statusBarsPadding(),
    ) {
        items.forEachIndexed { index, menuItem ->
            NavigationItem(
                title = menuItem.title,
                style = style,
                focusable = focusable,
                onClick = {
                    currentIndex = index
                    onSelect(menuItem)
                },
            )
            if (index < items.size - 1) {
                Divider(startIndent = style.dividerStartIndent)
            }
        }
    }
}

@Composable
private fun NavigationItem(
    title: String,
    style: NavigationViewStyle,
    focusable: Boolean = false,
    focusRequester: FocusRequester? = null,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val background = style.itemBackground.colorForInteraction(interactionSource)
    val titleColor = style.itemTextColor.colorForInteraction(interactionSource)
    Text(
        text = title,
        modifier = Modifier
            .fillMaxWidth()
            .focusableItem(
                enabled = focusable,
                focusRequester = focusRequester,
                interactionSource = interactionSource,
            )
            .background(background)
            .clickable(
                enabled = true,
                interactionSource = interactionSource,
                role = Role.Button,
                indication = rememberRipple(),
                onClick = onClick,
            )
            .padding(style.itemPadding),
        style = style.itemTextStyle.copy(color = titleColor),
    )
}

private data class NavigationViewStyleImpl(
    override val itemTextStyle: TextStyle,
    override val itemTextColor: InteractiveColor,
    override val itemBackground: InteractiveColor,
    override val dividerStartIndent: Dp,
    override val itemPadding: PaddingValues,
) : NavigationViewStyle
