@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.annotations.DrawableRes

@Composable
@Deprecated(
    "Use Note with closeIconSource",
    replaceWith = ReplaceWith("Note(closeIconSource = resourceImageSource(closeIconRes))"),
    level = DeprecationLevel.WARNING,
)
fun Note(
    modifier: Modifier = Modifier,
    style: NoteStyle = LocalNoteStyle.current,
    title: String = "",
    text: String = "",
    @DrawableRes closeIconRes: Int?,
    onClose: (() -> Unit)? = null,
    contentBefore: (@Composable BoxScope.() -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    action: (@Composable BoxScope.() -> Unit)? = null,
) = Note(
    modifier = modifier,
    style = style,
    title = title,
    text = text,
    closeIconSource = closeIconRes?.let(::resourceImageSource),
    onClose = onClose,
    contentBefore = contentBefore,
    interactionSource = interactionSource,
    action = action,
)
