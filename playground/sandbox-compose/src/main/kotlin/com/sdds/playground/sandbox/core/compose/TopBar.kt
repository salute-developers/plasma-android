package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.selection
import com.sdds.icons.R
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.allComposeThemes

internal val LocalTopBarStyle = compositionLocalOf { TopBarStyle.create() }

@Immutable
internal interface TopBarStyle {
    val titleStyle: TextStyle
    val titleColor: InteractiveColor
    val backgroundColor: Color
    val contentColor: Color
    val navigationButtonStyle: ButtonStyle
    val actionButtonStyle: ButtonStyle
    val shapeDropDown: Shape
    val dropItemBackground: InteractiveColor
    val dropItemTextStyle: TextStyle
    val dropItemHeight: Dp

    companion object {

        fun create(
            titleStyle: TextStyle = TextStyle.Default,
            titleColor: InteractiveColor = Color.Black.asInteractive(),
            backgroundColor: Color = Color.Transparent,
            contentColor: Color = Color.Black,
            navigationButtonStyle: ButtonStyle = ButtonStyle.iconButtonBuilder().style(),
            actionButtonStyle: ButtonStyle = ButtonStyle.iconButtonBuilder().style(),
            shapeDropDown: Shape = RoundedCornerShape(6.dp),
            dropItemBackground: InteractiveColor = Color.Gray.asInteractive(),
            dropItemTextStyle: TextStyle = TextStyle.Default,
            dropItemHeight: Dp = 24.dp,
        ): TopBarStyle =
            TopBarStyleImpl(
                titleStyle = titleStyle,
                titleColor = titleColor,
                backgroundColor = backgroundColor,
                contentColor = contentColor,
                navigationButtonStyle = navigationButtonStyle,
                actionButtonStyle = actionButtonStyle,
                shapeDropDown = shapeDropDown,
                dropItemBackground = dropItemBackground,
                dropItemTextStyle = dropItemTextStyle,
                dropItemHeight = dropItemHeight,
            )
    }
}

@Composable
internal fun TopBarSection(
    currentTheme: Theme,
    onThemeSelected: (Theme) -> Unit,
    isThemePickerExpanded: Boolean,
    onNavigationClick: () -> Unit,
    onDismissRequest: () -> Unit,
    style: TopBarStyle = LocalTopBarStyle.current,
) {
    Box {
        TopBar(
            title = currentTheme.name,
            onNavigationClick = onNavigationClick,
        )
        DropdownMenu(
            expanded = isThemePickerExpanded,
            onDismissRequest = onDismissRequest,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = style.backgroundColor)
                .padding(horizontal = 6.dp),
        ) {
            allComposeThemes.forEach { theme ->
                val isSelected = currentTheme == theme
                val interactionSource = remember { MutableInteractionSource() }
                DropdownMenuItem(
                    modifier = Modifier
                        .height(style.dropItemHeight)
                        .focusableItem(
                            interactionSource = interactionSource,
                        )
                        .selection(isSelected, interactionSource)
                        .background(
                            color = style.dropItemBackground.colorForInteraction(interactionSource),
                            shape = style.shapeDropDown,
                        ),
                    onClick = {
                        onThemeSelected(theme)
                        onDismissRequest()
                    },
                ) {
                    Text(
                        modifier = Modifier,
                        text = theme.name,
                        style = style.dropItemTextStyle.copy(style.titleColor.colorForInteraction(interactionSource)),
                    )
                }
            }
        }
    }
}

@Composable
internal fun TopBar(
    title: String,
    onNavigationClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .focusable()
                .indication(interactionSource, null)
                .clickable { onNavigationClick() },
        ) {
            Text(
                text = title,
                modifier = Modifier.padding(horizontal = 8.dp),
            )
            Icon(
                painter = painterResource(R.drawable.ic_disclosure_down_outline_16),
                contentDescription = null,
            )
        }
    }
}

@Immutable
private data class TopBarStyleImpl(
    override val titleStyle: TextStyle,
    override val titleColor: InteractiveColor,
    override val backgroundColor: Color,
    override val contentColor: Color,
    override val navigationButtonStyle: ButtonStyle,
    override val actionButtonStyle: ButtonStyle,
    override val shapeDropDown: Shape,
    override val dropItemBackground: InteractiveColor,
    override val dropItemTextStyle: TextStyle,
    override val dropItemHeight: Dp,
) : TopBarStyle
