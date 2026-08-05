@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.annotations.DrawableRes

@Composable
@NonRestartableComposable
@Deprecated(
    "Use IconTabItem with ImageSource icon",
    replaceWith = ReplaceWith("IconTabItem(icon = resourceImageSource(icon))"),
    level = DeprecationLevel.WARNING,
)
fun IconTabItem(
    modifier: Modifier = Modifier,
    style: TabItemStyle = LocalTabItemStyle.current,
    isSelected: Boolean = false,
    @DrawableRes icon: Int?,
    @DrawableRes actionIcon: Int? = null,
    onActionClicked: () -> Unit = {},
    count: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = IconTabItem(
    modifier = modifier,
    style = style,
    isSelected = isSelected,
    icon = icon?.let(::resourceImageSource),
    actionIcon = actionIcon?.let(::resourceImageSource),
    onActionClicked = onActionClicked,
    count = count,
    interactionSource = interactionSource,
)
