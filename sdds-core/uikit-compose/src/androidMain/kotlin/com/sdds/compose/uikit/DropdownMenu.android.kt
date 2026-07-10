@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.annotations.DrawableRes

@Composable
@Deprecated(
    "Use EmptyState with iconSource",
    replaceWith = ReplaceWith("EmptyState(iconSource = resourceImageSource(iconRes))"),
    level = DeprecationLevel.WARNING,
)
fun DropdownScope.EmptyState(
    style: DropdownEmptyStateStyle = LocalDropdownEmptyStateStyle.current,
    @DrawableRes iconRes: Int?,
    description: String,
    buttonLabel: String? = null,
    onClick: (() -> Unit)? = null,
) = EmptyState(
    style = style,
    iconSource = iconRes?.let(::resourceImageSource),
    description = description,
    buttonLabel = buttonLabel,
    onClick = onClick,
)
