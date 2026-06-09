package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.setExclusiveEnum
import com.sdds.compose.uikit.internal.common.surface
import com.sdds.compose.uikit.internal.focusselector.BorderType
import com.sdds.compose.uikit.internal.focusselector.permanentBorder
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.dropzone.DropZoneMotionStyle
import com.sdds.compose.uikit.motion.components.dropzone.rememberDropZoneMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState

/**
 * Расположение иконки в DropZone
 */
enum class DropZoneIconPlacement {

    /**
     * Иконка сверху
     */
    Top,

    /**
     * Иконка в начале
     */
    Start,

    /**
     * Иконка не отображается
     */
    None,
}

/**
 * Тип обводки компонента
 */
enum class DropZoneBorderType {

    /**
     * Бордер в виде прерывистой линии (пунктирной)
     */
    Dashes,

    /**
     * Бордер в виде сплошной линии
     */
    Solid,

    /**
     * Бордер не отображается
     */
    None,
}

/**
 * Семантические состояния [DropZone].
 */
enum class DropZoneState : ValueState {

    /**
     * DropZone находится в состоянии, при котором взаимодействие с ним не возможно.
     */
    Disabled,

    /**
     * DropZone находится в обычном состоянии, готов к взаимодействию.
     */
    Idle,

    /**
     * DropZone находится в активизированном состоянии, когда dragging content находится над ним.
     */
    DraggingOver,
}

/**
 * Компонент DropZone - интерактивная область, предназначенная для перетаскивания и загрузки файлов.
 *
 * @param modifier модификатор
 * @param onClick поведение при клике
 * @param style стиль компонента
 * @param state состояние DropZone
 * @param iconPlacement  расположение контента относительно title
 * @param icon иконка или произвольный контент
 * @param title тайтл
 * @param description описание
 * @param motion объект анимаций
 */
@Composable
fun DropZone(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    style: DropZoneStyle = LocalDropZoneStyle.current,
    state: DropZoneState = DropZoneState.Idle,
    iconPlacement: DropZoneIconPlacement = style.iconPlacement,
    icon: (@Composable () -> Unit)? = null,
    title: (@Composable () -> Unit)? = null,
    description: (@Composable () -> Unit)? = null,
    motion: Motion<DropZoneMotionStyle> = rememberDropZoneMotion(),
) {
    SideEffect {
        motion.context.semanticStateSource.setExclusiveEnum(state)
    }

    val background = style.colors.background.getBrushAsState(motion.context, motion.style.backgroundColor)
    val borderColor = style.colors.borderColor.getBrushAsState(motion.context, motion.style.borderColor)
    val shape by style.shape.getValueAsState(motion.context)
    val stroke by style.dimensions.borderThickness.getValueAsState(motion.context)
    val dashWidth = style.dimensions.borderDashWidth.getValueAsState(motion.context)
    val dashGap = style.dimensions.borderDashGap.getValueAsState(motion.context)
    val border = when (style.borderType) {
        DropZoneBorderType.Solid -> BorderType.Solid
        DropZoneBorderType.Dashes -> BorderType.Dashed(
            dashWidth.value,
            dashGap.value,
        )

        else -> BorderType.None
    }

    Box(
        modifier = modifier
            .permanentBorder(
                shape = shape,
                brush = { borderColor.value },
                strokeWidth = stroke,
                borderType = border,
            )
            .surface(
                shape = shape,
                onClick = onClick,
                backgroundColor = { background.value },
                enabled = state != DropZoneState.Disabled,
                alpha = { if (it) ENABLED_DROPZONE_ALPHA else style.disableAlpha },
                interactionSource = motion.context.interactionSource,
            ),
        contentAlignment = Alignment.Center,
    ) {
        val gap by style.dimensions.gap.getValueAsState(motion.context)
        Column(
            modifier = Modifier
                .padding(style.dimensions.getContentPaddings(motion)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(gap),
        ) {
            DropZoneTitleBlock(
                style = style,
                motion = motion,
                iconPlacement = iconPlacement,
                title = title,
                icon = icon,
            )
            if (description != null) {
                DropZoneDescription(style, motion, description)
            }
        }
        if (state == DropZoneState.DraggingOver) {
            Overlay(
                modifier = Modifier
                    .matchParentSize()
                    .clip(shape),
                style = style.overlayStyle,
            )
        }
    }
}

@Composable
private fun DropZoneTitleBlock(
    style: DropZoneStyle,
    motion: Motion<DropZoneMotionStyle>,
    iconPlacement: DropZoneIconPlacement,
    title: (@Composable () -> Unit)? = null,
    icon: (@Composable () -> Unit)? = null,
) {
    when (iconPlacement) {
        DropZoneIconPlacement.Top -> {
            val padding by style.dimensions.iconPadding.getValueAsState(motion.context)
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(padding),
            ) {
                if (icon != null) {
                    DropZoneIcon(style, motion, icon)
                }
                if (title != null) {
                    DropZoneTitle(style, motion, title)
                }
            }
        }

        DropZoneIconPlacement.Start -> {
            val padding by style.dimensions.iconPadding.getValueAsState(motion.context)
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(padding),
            ) {
                if (icon != null) {
                    DropZoneIcon(style, motion, icon)
                }
                if (title != null) {
                    DropZoneTitle(style, motion, title)
                }
            }
        }

        DropZoneIconPlacement.None -> {
            if (title != null) {
                DropZoneTitle(style, motion, title)
            }
        }
    }
}

@Composable
private fun DropZoneIcon(
    style: DropZoneStyle,
    motion: Motion<DropZoneMotionStyle>,
    icon: @Composable () -> Unit,
) {
    val iconBrush = style.colors.iconColor.getBrushAsState(motion.context, motion.style.iconColor)
    val iconSize = style.dimensions.iconSize.getValueAsState(motion.context).value
    val actualIconSize = if (iconSize == 0.dp) Dp.Unspecified else iconSize
    CompositionLocalProvider(
        LocalTintBrushProducer provides { iconBrush.value },
        LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
    ) {
        icon.invoke()
    }
}

@Composable
private fun DropZoneTitle(
    style: DropZoneStyle,
    motion: Motion<DropZoneMotionStyle>,
    title: @Composable () -> Unit,
) {
    val titleStyle by style.titleStyle.getTextStyleAsState(
        motion.context,
        motion.style.titleStyle,
    )
    val titleBrush = style.colors.titleColor.getBrushAsState(
        motion.context,
        motion.style.titleColor,
    )
    ProvideTextStyle(
        titleStyle,
        brush = { titleBrush.value },
        title,
    )
}

@Composable
private fun DropZoneDescription(
    style: DropZoneStyle,
    motion: Motion<DropZoneMotionStyle>,
    description: @Composable () -> Unit,
) {
    val descriptionStyle by style.descriptionStyle.getTextStyleAsState(
        motion.context,
        motion.style.descriptionStyle,
    )
    val descriptionBrush = style.colors.descriptionColor.getBrushAsState(
        motion.context,
        motion.style.descriptionColor,
    )
    ProvideTextStyle(
        descriptionStyle,
        brush = { descriptionBrush.value },
        description,
    )
}

@Composable
private fun DropZoneDimensions.getContentPaddings(
    motion: Motion<DropZoneMotionStyle>,
) = PaddingValues(
    paddingStart.getValueAsState(motion.context).value,
    paddingTop.getValueAsState(motion.context).value,
    paddingEnd.getValueAsState(motion.context).value,
    paddingBottom.getValueAsState(motion.context).value,
)

@Composable
@Preview
private fun DropZonPreview() {
    DropZone(
        state = DropZoneState.DraggingOver,
        title = {
            Text(
                text = "title",
            )
        },
        description = {
            Text(
                text = "description",
            )
        },
    )
}

private const val ENABLED_DROPZONE_ALPHA = 1f
