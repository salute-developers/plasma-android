@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.annotations.DrawableRes

@Composable
@Deprecated(
    "Use TabItem with ImageSource actionIcon",
    replaceWith = ReplaceWith("TabItem(actionIcon = resourceImageSource(actionIcon))"),
    level = DeprecationLevel.WARNING,
)
fun TabItem(
    @DrawableRes actionIcon: Int,
    modifier: Modifier = Modifier,
    style: TabItemStyle = LocalTabItemStyle.current,
    isSelected: Boolean = false,
    label: String? = null,
    helpText: String? = null,
    count: String? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    onActionClicked: () -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = TabItem(
    modifier = modifier,
    style = style,
    isSelected = isSelected,
    label = label,
    helpText = helpText,
    count = count,
    startContent = startContent,
    endContent = endContent,
    actionIcon = resourceImageSource(actionIcon),
    onActionClicked = onActionClicked,
    interactionSource = interactionSource,
)
