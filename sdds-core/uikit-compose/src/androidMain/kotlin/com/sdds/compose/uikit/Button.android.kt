@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.annotations.DrawableRes
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.button.IconButtonMotionStyle

@Composable
@Deprecated(
    "Use IconButton with iconSource",
    replaceWith = ReplaceWith("IconButton(iconSource = resourceImageSource(iconRes))"),
    level = DeprecationLevel.WARNING,
)
fun IconButton(
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    iconContentDescription: String? = null,
    style: ButtonStyle = LocalIconButtonStyle.current,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClickLabel: String? = null,
    onClick: () -> Unit,
) = IconButton(
    iconSource = resourceImageSource(iconRes),
    modifier = modifier,
    iconContentDescription = iconContentDescription,
    style = style,
    enabled = enabled,
    loading = loading,
    indication = indication,
    interactionSource = interactionSource,
    onClickLabel = onClickLabel,
    onClick = onClick,
)

@Composable
@Deprecated(
    "Use IconButton with iconSource",
    replaceWith = ReplaceWith("IconButton(iconSource = resourceImageSource(iconRes))"),
    level = DeprecationLevel.WARNING,
)
fun IconButton(
    @DrawableRes iconRes: Int,
    motion: Motion<IconButtonMotionStyle>,
    modifier: Modifier = Modifier,
    iconContentDescription: String? = null,
    style: ButtonStyle = LocalIconButtonStyle.current,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = LocalIndication.current,
    onClickLabel: String? = null,
    onClick: () -> Unit,
) = IconButton(
    iconSource = resourceImageSource(iconRes),
    motion = motion,
    modifier = modifier,
    iconContentDescription = iconContentDescription,
    style = style,
    enabled = enabled,
    loading = loading,
    indication = indication,
    onClickLabel = onClickLabel,
    onClick = onClick,
)

/**
 * Создает [ButtonIcons] с указанными drawable-ресурсами вначале [startRes] и вконце [endRes].
 */
@Deprecated(
    "Use ButtonIcons constructor with ImageSource instead",
    replaceWith = ReplaceWith(
        expression = "ButtonIcons(" +
            "startSource = startRes?.let(::resourceImageSource), " +
            "endSource = endRes?.let(::resourceImageSource)" +
            ")",
    ),
    level = DeprecationLevel.WARNING,
)
fun ButtonIcons(
    @DrawableRes startRes: Int?,
    @DrawableRes endRes: Int? = null,
    startContentDescription: String? = null,
    endContentDescription: String? = null,
): ButtonIcons = ButtonIcons(
    startSource = startRes?.let(::resourceImageSource),
    endSource = endRes?.let(::resourceImageSource),
    startContentDescription = startContentDescription,
    endContentDescription = endContentDescription,
)

/**
 * Создает [ButtonIcons] с указанным drawable-ресурсом вконце [endRes].
 */
@Deprecated(
    "Use ButtonIcons constructor with ImageSource instead",
    replaceWith = ReplaceWith("ButtonIcons(endSource = endRes?.let(::resourceImageSource))"),
    level = DeprecationLevel.WARNING,
)
fun ButtonIcons(
    @DrawableRes endRes: Int?,
    startContentDescription: String? = null,
    endContentDescription: String? = null,
): ButtonIcons = ButtonIcons(
    endSource = endRes?.let(::resourceImageSource),
    startContentDescription = startContentDescription,
    endContentDescription = endContentDescription,
)
