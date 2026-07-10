@file:Suppress("UndocumentedPublicFunction", "MaxLineLength")

package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import com.sdds.compose.uikit.annotations.DrawableRes
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.cell.CellMotionStyle
import com.sdds.compose.uikit.motion.components.cell.rememberCellMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

@Composable
@Deprecated(
    "Use Cell with disclosureIconSource",
    replaceWith = ReplaceWith("Cell(disclosureIconSource = resourceImageSource(disclosureIconRes))"),
    level = DeprecationLevel.WARNING,
)
fun Cell(
    modifier: Modifier = Modifier,
    style: CellStyle = LocalCellStyle.current,
    gravity: CellGravity = CellGravity.Center,
    title: AnnotatedString = AnnotatedString(""),
    subtitle: AnnotatedString = AnnotatedString(""),
    label: AnnotatedString = AnnotatedString(""),
    disclosureContentEnabled: Boolean = false,
    @DrawableRes disclosureIconRes: Int?,
    disclosureText: AnnotatedString = AnnotatedString(""),
    startContent: (@Composable RowScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<CellMotionStyle> = rememberCellMotion(motionContext = rememberMotionContext(interactionSource)),
) = Cell(
    modifier = modifier,
    style = style,
    gravity = gravity,
    title = title,
    subtitle = subtitle,
    label = label,
    disclosureContentEnabled = disclosureContentEnabled,
    disclosureIconSource = disclosureIconRes?.let(::resourceImageSource),
    disclosureText = disclosureText,
    startContent = startContent,
    endContent = endContent,
    interactionSource = interactionSource,
    motion = motion,
)
