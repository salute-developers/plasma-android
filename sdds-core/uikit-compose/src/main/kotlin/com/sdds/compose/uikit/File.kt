package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.cell.BaseCell
import com.sdds.compose.uikit.internal.common.StyledText

/**
 * Расположение кнопки действия и встроенного прогресса
 */
enum class FileActionPlacement {
    /**
     * В начале компонента
     */
    Start,

    /**
     * В конце компонента
     */
    End,
}

/**
 * Расположение прогресса
 */
enum class FileProgressPlacement {

    /**
     * Прогресс встроен слева или справа, см. [FileActionPlacement]
     */
    Inline,

    /**
     * Прогресс расположен снизу
     */
    Outer,
}

/**
 * Компонент для отображения загрузки файла
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param isLoading состояние загрузки
 * @param label основная надпись, например название файла
 * @param description дополнительная надпись, например размер файла
 * @param image слот для изображения
 * @param progress слот для прогресса
 * @param action слот для кнопки действия
 * @param actionPlacement расположение кнопки действия [action] и встроенного [progress]
 * @param interactionSource источник взаимодействий
 *
 */
@Composable
fun File(
    modifier: Modifier = Modifier,
    style: FileStyle = LocalFileStyle.current,
    isLoading: Boolean = false,
    label: String,
    description: String? = null,
    image: (@Composable () -> Unit)? = null,
    progress: (@Composable () -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    actionPlacement: FileActionPlacement = style.actionPlacement,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    Column(modifier.width(IntrinsicSize.Max)) {
        BaseCell(
            modifier = Modifier.fillMaxWidth(),
            gravity = CellGravity.Center,
            dimensions = object : CellDimensions {
                override val contentPaddingStart: Dp = style.dimensions.startContentPadding
                override val contentPaddingEnd: Dp = style.dimensions.endContentPadding
            },
            startContent = startContent(
                style = style,
                interactionSource = interactionSource,
                actionPlacement = actionPlacement,
                progressPlacement = style.progressPlacement,
                image = image,
                progress = progress,
                action = action,
                isLoading = isLoading,
            ),
            centerContent = {
                StyledText(
                    text = label,
                    textStyle = style.labelStyle,
                    textColor = style.colors.labelColor.colorForInteraction(interactionSource),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                description?.let {
                    StyledText(
                        text = it,
                        modifier = Modifier.padding(top = style.dimensions.descriptionPadding),
                        textStyle = style.descriptionStyle,
                        textColor = style.colors.descriptionColor.colorForInteraction(
                            interactionSource,
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            },
            endContent = endContent(
                style = style,
                interactionSource = interactionSource,
                actionPlacement = actionPlacement,
                progressPlacement = style.progressPlacement,
                progress = progress,
                action = action,
                isLoading = isLoading,
            ),
        )
        BottomContent(style, isLoading, progress)
    }
}

@Composable
private fun ColumnScope.BottomContent(
    style: FileStyle,
    isLoading: Boolean,
    progress: @Composable (() -> Unit)?,
) {
    if (style.progressPlacement == FileProgressPlacement.Outer && isLoading) {
        CompositionLocalProvider(
            LocalProgressBarStyle provides style.progressBarStyle,
        ) {
            Box(Modifier.padding(top = 8.dp)) {
                progress?.invoke()
            }
        }
    }
}

private fun startContent(
    style: FileStyle,
    interactionSource: InteractionSource,
    actionPlacement: FileActionPlacement,
    progressPlacement: FileProgressPlacement,
    image: @Composable (() -> Unit)?,
    progress: @Composable (() -> Unit)?,
    action: @Composable (() -> Unit)?,
    isLoading: Boolean,
): (@Composable RowScope.() -> Unit)? {
    val imageOrNull: (@Composable RowScope.() -> Unit)? = image?.let {
        {
            val color = style.colors.iconColor.colorForInteraction(interactionSource)
            CompositionLocalProvider(LocalTint provides color) {
                image.invoke()
            }
        }
    }

    return when (progressPlacement) {
        FileProgressPlacement.Inline -> {
            when (actionPlacement) {
                FileActionPlacement.Start -> {
                    if (progress == null && action == null) return null

                    if (isLoading) {
                        inlineProgress(progress, style)
                    } else {
                        action(action, style, interactionSource)
                    }
                }

                FileActionPlacement.End -> imageOrNull
            }
        }

        FileProgressPlacement.Outer -> {
            when (actionPlacement) {
                FileActionPlacement.Start -> {
                    if (action == null) return null
                    action(action, style, interactionSource)
                }

                FileActionPlacement.End -> imageOrNull
            }
        }
    }
}

private fun endContent(
    style: FileStyle,
    interactionSource: InteractionSource,
    actionPlacement: FileActionPlacement,
    progressPlacement: FileProgressPlacement,
    progress: @Composable (() -> Unit)?,
    action: @Composable (() -> Unit)?,
    isLoading: Boolean,
): (@Composable RowScope.() -> Unit)? {
    return when (progressPlacement) {
        FileProgressPlacement.Inline -> {
            when (actionPlacement) {
                FileActionPlacement.End -> {
                    if (progress == null && action == null) return null

                    if (isLoading) {
                        inlineProgress(progress, style)
                    } else {
                        action(action, style, interactionSource)
                    }
                }

                FileActionPlacement.Start -> null
            }
        }

        FileProgressPlacement.Outer -> {
            when (actionPlacement) {
                FileActionPlacement.End -> {
                    if (action == null) return null

                    action(action, style, interactionSource)
                }

                FileActionPlacement.Start -> null
            }
        }
    }
}

private fun inlineProgress(
    progress: @Composable (() -> Unit)?,
    style: FileStyle,
): @Composable (RowScope.() -> Unit)? {
    progress ?: return null
    return {
        CompositionLocalProvider(
            LocalCircularProgressBarStyle provides style.circularProgressBarStyle,
        ) {
            progress.invoke()
        }
    }
}

private fun action(
    action: @Composable (() -> Unit)?,
    style: FileStyle,
    interactionSource: InteractionSource,
): @Composable (RowScope.() -> Unit)? {
    action ?: return null
    return {
        val iconColor = style.colors.iconColor.colorForInteraction(interactionSource)
        CompositionLocalProvider(
            LocalTint provides iconColor,
            LocalIconButtonStyle provides style.actionButtonStyle,
        ) {
            action.invoke()
        }
    }
}
