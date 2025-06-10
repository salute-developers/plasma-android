package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.selection

internal val LocalNavigationViewStyle = compositionLocalOf { NavigationViewStyle.create() }

internal interface NavigationViewStyle {
    val itemTextStyle: TextStyle
    val itemTextColor: InteractiveColor
    val itemBackground: InteractiveColor
    val menuBackground: Color
    val itemPadding: Dp
    val itemHeight: Dp
    val menuShape: Shape
    val selectedShape: Shape
    val menuWidth: Dp
    val headerHeight: Dp
    val headerTextStyle: TextStyle
    val headerTextColor: Color
    val itemCard: CardStyle

    companion object {

        fun create(
            itemTextStyle: TextStyle = TextStyle.Default,
            itemTextColor: InteractiveColor = Color.Black.asInteractive(),
            itemBackground: InteractiveColor = Color.Black.asInteractive(),
            menuBackground: Color = Color.Black,
            itemPaddings: Dp = 6.dp,
            menuShape: Shape = RoundedCornerShape(10.dp),
            selectedShape: Shape = RoundedCornerShape(10.dp),
            menuWidth: Dp = 200.dp,
            headerHeight: Dp = 56.dp,
            headerTextStyle: TextStyle = TextStyle.Default,
            headerTextColor: Color = Color.Black,
            itemHeight: Dp = 24.dp,
            itemCard: CardStyle = CardStyle.builder().style(),
        ): NavigationViewStyle =
            NavigationViewStyleImpl(
                itemTextStyle = itemTextStyle,
                itemTextColor = itemTextColor,
                itemBackground = itemBackground,
                itemPadding = itemPaddings,
                menuBackground = menuBackground,
                menuShape = menuShape,
                selectedShape = selectedShape,
                menuWidth = menuWidth,
                headerHeight = headerHeight,
                headerTextStyle = headerTextStyle,
                headerTextColor = headerTextColor,
                itemHeight = itemHeight,
                itemCard = itemCard,
            )
    }
}

/**
 *
 * @author Малышев Александр on 25.02.2025
 */
@Composable
internal fun NavigationViewTv(
    items: List<MenuItem>,
    onSelect: (MenuItem) -> Unit,
    title: String,
    modifier: Modifier = Modifier,
    focusable: Boolean = false,
    style: NavigationViewStyle = LocalNavigationViewStyle.current,
) {
    var currentIndex by remember { mutableIntStateOf(0) }
    Column(
        modifier = modifier
            .fillMaxHeight()
            .width(style.menuWidth)
            .background(
                color = style.menuBackground,
                shape = style.menuShape,
            )
            .padding(start = 4.dp, end = 4.dp, bottom = 24.dp),

    ) {
        Row(
            Modifier
                .height(style.headerHeight)
                .padding(horizontal = style.itemPadding),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = title,
                style = style.headerTextStyle.copy(color = style.headerTextColor),
            )
        }
        Column(
            modifier = modifier
                .verticalScroll(rememberScrollState()),
        ) {
            items.forEachIndexed { index, menuItem ->
                NavigationItemTv(
                    title = menuItem.title,
                    style = style,
                    focusable = focusable,
                    isSelected = index == currentIndex,
                    onClick = {
                        currentIndex = index
                        onSelect(menuItem)
                    },
                )
            }
        }
    }
}

@Composable
private fun NavigationItemTv(
    title: String,
    style: NavigationViewStyle,
    isSelected: Boolean = false,
    focusable: Boolean = false,
    focusRequester: FocusRequester? = null,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val background = style.itemBackground.colorForInteraction(interactionSource)
    val titleColor = style.itemTextColor.colorForInteraction(interactionSource)
    Row(
        modifier = Modifier
            .height(style.itemHeight)
            .fillMaxWidth()
            .focusableItem(
                enabled = focusable,
                focusRequester = focusRequester,
                interactionSource = interactionSource,
            )
            .selection(
                selected = isSelected,
                interactionSource = interactionSource,
            )
            .background(color = background, shape = style.selectedShape)
            .clickable(
                enabled = true,
                interactionSource = interactionSource,
                role = Role.Button,
                indication = rememberRipple(),
                onClick = onClick,
            )
            .padding(horizontal = style.itemPadding),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = title,
            style = style.itemTextStyle.copy(color = titleColor),
        )
    }
}

private data class NavigationViewStyleImpl(
    override val itemTextStyle: TextStyle,
    override val itemTextColor: InteractiveColor,
    override val itemBackground: InteractiveColor,
    override val itemPadding: Dp,
    override val menuBackground: Color,
    override val menuShape: Shape,
    override val selectedShape: Shape,
    override val menuWidth: Dp,
    override val headerHeight: Dp,
    override val headerTextStyle: TextStyle,
    override val headerTextColor: Color,
    override val itemHeight: Dp,
    override val itemCard: CardStyle,
) : NavigationViewStyle
