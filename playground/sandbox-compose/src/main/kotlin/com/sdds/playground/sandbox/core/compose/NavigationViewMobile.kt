package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.style.Style
import com.sdds.icons.R
import com.sdds.playground.sandbox.ThemeInfoCompose
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun NavigationItemMobile(
    title: String,
    icon: Painter,
    preview: @Composable () -> Unit,
    onClick: () -> Unit,
) {
    val style = LocalNavigationViewStyle.current
    val interactionSource = remember { MutableInteractionSource() }

    Card(
        style = style.itemCard,
        onClick = onClick,
        interactionSource = interactionSource,
        focusSelectorSettings = LocalFocusSelectorSettings.current,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    painter = icon,
                    contentDescription = "",
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = title,
                    style = style.headerTextStyle.copy(style.headerTextColor),
                )
            }
            Spacer(Modifier.height(12.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 92.dp, max = 400.dp),
                contentAlignment = Alignment.Center,
            ) {
                preview()
            }
        }
    }
}

@Composable
internal fun NavigationViewMobile(
    modifier: Modifier = Modifier,
    items: List<MenuItem>,
    themeInfo: ThemeInfoCompose,
    onSelect: (MenuItem) -> Unit,
) {
    var currentIndex by remember { mutableIntStateOf(0) }
    LazyColumn(
        Modifier
            .fillMaxWidth()
            .padding(6.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        itemsIndexed(items) { index, menuItem ->
            NavigationItemMobile(
                title = menuItem.title,
                icon = painterResource(id = R.drawable.ic_romb_outline_16),
                onClick = {
                    currentIndex = index
                    onSelect(menuItem)
                },
                preview = {
                    ComponentPreview(
                        key = menuItem.componentKey,
                        themeInfo = themeInfo,
                    ) { style, key ->
                        menuItem.destination.preview?.invoke(style, key)
                    }
                },
            )
        }
    }
}

@Composable
internal fun ComponentPreview(
    key: ComponentKey,
    themeInfo: ThemeInfoCompose,
    component: @Composable (Style, ComponentKey) -> Unit,
) {
    themeInfo.themeWrapper {
        val styleProvider = themeInfo.components.get<String, Style>(key).styleProvider
        val style = styleProvider.style("")
        component(style, key)
    }
}
