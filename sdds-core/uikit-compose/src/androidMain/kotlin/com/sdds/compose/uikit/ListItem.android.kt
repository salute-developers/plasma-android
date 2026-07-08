@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.annotations.DrawableRes
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.list.ListItemMotionStyle
import com.sdds.compose.uikit.motion.components.list.rememberListItemMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

@Composable
@Deprecated(
    "Use ListItem with disclosureIconSource",
    replaceWith = ReplaceWith("ListItem(disclosureIconSource = resourceImageSource(disclosureIconRes))"),
    level = DeprecationLevel.WARNING,
)
fun ListItem(
    modifier: Modifier = Modifier,
    style: ListItemStyle = LocalListItemStyle.current,
    text: String,
    disclosureEnabled: Boolean = false,
    @DrawableRes disclosureIconRes: Int?,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    startContent: (@Composable RowScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    label: String? = null,
    subtitle: String? = null,
    motion: Motion<ListItemMotionStyle> =
        rememberListItemMotion(motionContext = rememberMotionContext(interactionSource)),
) = ListItem(
    modifier = modifier,
    style = style,
    text = text,
    disclosureEnabled = disclosureEnabled,
    disclosureIconSource = disclosureIconRes?.let(::resourceImageSource),
    interactionSource = interactionSource,
    startContent = startContent,
    endContent = endContent,
    label = label,
    subtitle = subtitle,
    motion = motion,
)
