package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.cell.BaseCell
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.file.FileMotionStyle
import com.sdds.compose.uikit.motion.components.file.rememberFileMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

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
    Inner,

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
 * @param labelContent контент основной надписи, например название файла
 * @param descriptionContent контент дополнительной надписи, например размер файла
 * @param image слот для изображения
 * @param progress слот для прогресса
 * @param action слот для кнопки действия
 * @param actionPlacement расположение кнопки действия [action] и встроенного [progress]
 * @param interactionSource источник взаимодействий
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun File(
    modifier: Modifier = Modifier,
    style: FileStyle = LocalFileStyle.current,
    isLoading: Boolean = false,
    labelContent: @Composable () -> Unit,
    descriptionContent: (@Composable () -> Unit)?,
    image: (@Composable () -> Unit)? = null,
    progress: (@Composable () -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    actionPlacement: FileActionPlacement = style.actionPlacement,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    motion: Motion<FileMotionStyle> = rememberFileMotion(
        motionContext = rememberMotionContext(
            interactionSource = interactionSource as? MutableInteractionSource
                ?: remember { MutableInteractionSource() },
        ),
    ),
) {
    val background = style.colors.backgroundColor.getBrushAsState(motion.context, motion.style.backgroundColor)
    val shape by style.shape.getValueAsState(motion.context)
    val paddings = style.dimensions.getPaddingValues(motion)
    Column(
        modifier
            .backgroundBrush(
                brushProducer = { background.value },
                shape = shape,
            )
            .padding(paddings)
            .width(IntrinsicSize.Max),
    ) {
        BaseCell(
            modifier = Modifier.fillMaxWidth(),
            gravity = CellGravity.Center,
            dimensions = object : CellDimensions {
                override val contentPaddingStart: Dp = style.dimensions.startContentPadding
                override val contentPaddingStartValues: StatefulValue<Dp> =
                    style.dimensions.startContentPaddingValues
                override val contentPaddingEnd: Dp = style.dimensions.endContentPadding
                override val contentPaddingEndValues: StatefulValue<Dp> =
                    style.dimensions.endContentPaddingValues
            },
            startContent = startContent(
                style = style,
                motion = motion,
                actionPlacement = actionPlacement,
                progressPlacement = style.progressPlacement,
                image = image,
                progress = progress,
                action = action,
                isLoading = isLoading,
            ),
            centerContent = {
                val labelStyle by
                    style.labelStyles.getTextStyleAsState(motion.context, motion.style.labelStyle)
                val labelColor =
                    style.colors.labelBrush.getBrushAsState(motion.context, motion.style.labelColor)
                ProvideTextStyle(
                    value = labelStyle,
                    brush = { labelColor.value },
                    content = labelContent,
                )

                descriptionContent?.let {
                    val padding by style.dimensions.descriptionPaddingValues.getValueAsState(motion.context)
                    Box(
                        modifier = Modifier.padding(top = padding),
                    ) {
                        val descriptionStyle by
                            style.descriptionStyles.getTextStyleAsState(motion.context, motion.style.descriptionStyle)
                        val descriptionColor = style.colors.descriptionBrush.getBrushAsState(
                            motion.context,
                            motion.style.descriptionColor,
                        )
                        ProvideTextStyle(
                            value = descriptionStyle,
                            brush = { descriptionColor.value },
                            content = descriptionContent,
                        )
                    }
                }
            },
            endContent = endContent(
                style = style,
                motion = motion,
                actionPlacement = actionPlacement,
                progressPlacement = style.progressPlacement,
                progress = progress,
                action = action,
                isLoading = isLoading,
            ),
        )
        BottomContent(style, isLoading, motion, progress)
    }
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
 * @param motion объект анимаций
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
    motion: Motion<FileMotionStyle> = rememberFileMotion(
        motionContext = rememberMotionContext(
            interactionSource = interactionSource as? MutableInteractionSource
                ?: remember { MutableInteractionSource() },
        ),
    ),
) {
    File(
        modifier = modifier,
        style = style,
        isLoading = isLoading,
        labelContent = {
            Text(
                text = label,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        descriptionContent = if (!description.isNullOrEmpty()) {
            {
                Text(
                    text = description,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        } else {
            null
        },
        image = image,
        progress = progress,
        action = action,
        actionPlacement = actionPlacement,
        interactionSource = interactionSource,
        motion = motion,
    )
}

@Composable
private fun FileDimensions.getPaddingValues(
    motion: Motion<FileMotionStyle>,
): PaddingValues = PaddingValues(
    start = paddingStart.getValueAsState(motion.context).value,
    top = paddingTop.getValueAsState(motion.context).value,
    end = paddingEnd.getValueAsState(motion.context).value,
    bottom = paddingBottom.getValueAsState(motion.context).value,
)

@Composable
private fun ColumnScope.BottomContent(
    style: FileStyle,
    isLoading: Boolean,
    motion: Motion<FileMotionStyle>,
    progress: @Composable (() -> Unit)?,
) {
    if (style.progressPlacement == FileProgressPlacement.Outer && isLoading) {
        CompositionLocalProvider(
            LocalProgressBarStyle provides style.progressBarStyle,
        ) {
            val padding by style.dimensions.bottomContentPaddingValues.getValueAsState(motion.context)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = padding),
                propagateMinConstraints = true,
            ) {
                progress?.invoke()
            }
        }
    }
}

private fun startContent(
    style: FileStyle,
    motion: Motion<FileMotionStyle>,
    actionPlacement: FileActionPlacement,
    progressPlacement: FileProgressPlacement,
    image: @Composable (() -> Unit)?,
    progress: @Composable (() -> Unit)?,
    action: @Composable (() -> Unit)?,
    isLoading: Boolean,
): (@Composable RowScope.() -> Unit)? {
    val imageOrNull: (@Composable RowScope.() -> Unit)? = image?.let {
        {
            val color = style.colors.iconBrush.getBrushAsState(
                motion.context,
                motion.style.iconColor,
            )
            CompositionLocalProvider(
                LocalTintBrushProducer provides { color.value },
            ) {
                image.invoke()
            }
        }
    }

    return when (progressPlacement) {
        FileProgressPlacement.Inner -> {
            when (actionPlacement) {
                FileActionPlacement.Start -> {
                    if (progress == null && action == null) return null

                    if (isLoading) {
                        inlineProgress(progress, style, motion)
                    } else {
                        action(action, style, motion)
                    }
                }

                FileActionPlacement.End -> imageOrNull
            }
        }

        FileProgressPlacement.Outer -> {
            when (actionPlacement) {
                FileActionPlacement.Start -> {
                    if (action == null) return null
                    action(action, style, motion)
                }

                FileActionPlacement.End -> imageOrNull
            }
        }
    }
}

private fun endContent(
    style: FileStyle,
    motion: Motion<FileMotionStyle>,
    actionPlacement: FileActionPlacement,
    progressPlacement: FileProgressPlacement,
    progress: @Composable (() -> Unit)?,
    action: @Composable (() -> Unit)?,
    isLoading: Boolean,
): (@Composable RowScope.() -> Unit)? {
    return when (progressPlacement) {
        FileProgressPlacement.Inner -> {
            when (actionPlacement) {
                FileActionPlacement.End -> {
                    if (progress == null && action == null) return null

                    if (isLoading) {
                        inlineProgress(progress, style, motion)
                    } else {
                        action(action, style, motion)
                    }
                }

                FileActionPlacement.Start -> null
            }
        }

        FileProgressPlacement.Outer -> {
            when (actionPlacement) {
                FileActionPlacement.End -> {
                    if (action == null) return null

                    action(action, style, motion)
                }

                FileActionPlacement.Start -> null
            }
        }
    }
}

private fun inlineProgress(
    progress: @Composable (() -> Unit)?,
    style: FileStyle,
    motion: Motion<FileMotionStyle>,
): @Composable (RowScope.() -> Unit)? {
    progress ?: return null
    return {
        val iconColor = style.colors.iconBrush.getBrushAsState(
            motion.context,
            motion.style.iconColor,
        )
        CompositionLocalProvider(
            LocalTintBrushProducer provides { iconColor.value },
            LocalCircularProgressBarStyle provides style.circularProgressBarStyle,
        ) {
            progress.invoke()
        }
    }
}

private fun action(
    action: @Composable (() -> Unit)?,
    style: FileStyle,
    motion: Motion<FileMotionStyle>,
): @Composable (RowScope.() -> Unit)? {
    action ?: return null
    return {
        val iconColor = style.colors.iconBrush.getBrushAsState(
            motion.context,
            motion.style.iconColor,
        )
        CompositionLocalProvider(
            LocalTintBrushProducer provides { iconColor.value },
            LocalIconButtonStyle provides style.actionButtonStyle,
        ) {
            action.invoke()
        }
    }
}
