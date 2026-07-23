@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.annotations.DrawableRes

@Composable
@Deprecated(
    "Use TabBarItem with ImageSource icons",
    replaceWith = ReplaceWith(
        "TabBarItem(defaultIcon = resourceImageSource(defaultIcon), selectedIcon = resourceImageSource(selectedIcon))",
    ),
    level = DeprecationLevel.WARNING,
)
fun TabBarItem(
    modifier: Modifier = Modifier,
    isSelected: Boolean,
    onClick: (() -> Unit)? = null,
    style: TabBarItemStyle = LocalTabBarItemStyle.current,
    @DrawableRes defaultIcon: Int,
    @DrawableRes selectedIcon: Int,
    label: String? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    extra: (@Composable () -> Unit)? = null,
) = TabBarItem(
    modifier = modifier,
    isSelected = isSelected,
    onClick = onClick,
    style = style,
    defaultIcon = resourceImageSource(defaultIcon),
    selectedIcon = resourceImageSource(selectedIcon),
    label = label,
    interactionSource = interactionSource,
    extra = extra,
)
