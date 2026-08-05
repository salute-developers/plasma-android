package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.internal.tabbar.BaseTabBarItem
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.tabbar.TabBarItemMotionStyle
import com.sdds.compose.uikit.motion.components.tabbar.rememberTabBarItemMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Элемент [TabBar]
 *
 * @param icon слот иконки
 * @param modifier модификатор
 * @param isSelected выбран ли элемент
 * @param onClick обработчик нажатия
 * @param onClickLabel accessibility текст при клике на компонент
 * @param style стиль компонента
 * @param labelContent слот лэйбла
 * @param extra дополнительный контент в правом верхнем углу иконки
 * @param motion объект анимаций
 */
@Composable
fun TabBarItem(
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onClick: (() -> Unit)? = null,
    onClickLabel: String? = null,
    style: TabBarItemStyle = LocalTabBarItemStyle.current,
    labelContent: (@Composable () -> Unit)? = null,
    extra: (@Composable () -> Unit)? = null,
    motion: Motion<TabBarItemMotionStyle> = rememberTabBarItemMotion(),
) {
    BaseTabBarItem(
        icon = icon,
        modifier = modifier,
        isSelected = isSelected,
        onClick = onClick,
        onClickLabel = onClickLabel,
        style = style,
        labelContent = labelContent,
        extra = extra,
        motion = motion,
    )
}

/**
 * Элемент [TabBar]
 *
 * @param modifier модификатор
 * @param isSelected выбран ли элемент
 * @param onClick обработчик нажатия
 * @param style стиль компонента
 * @param defaultIcon источник иконки при [isSelected] == false
 * @param selectedIcon источник иконки при [isSelected] == true
 * @param label текст лэйбла
 * @param interactionSource источник взаимодействий
 * @param extra дополнительный контент в правом верхнем углу иконки
 */
@Composable
fun TabBarItem(
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onClick: (() -> Unit)? = null,
    style: TabBarItemStyle = LocalTabBarItemStyle.current,
    defaultIcon: @Composable () -> Unit,
    selectedIcon: @Composable () -> Unit,
    label: String? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    extra: (@Composable () -> Unit)? = null,
) {
    val motionInteractionSource = remember(interactionSource) {
        interactionSource as? MutableInteractionSource ?: MutableInteractionSource()
    }
    val motion = rememberTabBarItemMotion(motionContext = rememberMotionContext(motionInteractionSource))
    TabBarItem(
        icon = { if (isSelected) selectedIcon() else defaultIcon() },
        modifier = modifier,
        isSelected = isSelected,
        onClick = onClick,
        style = style,
        labelContent = label?.takeIf { it.isNotEmpty() }?.let { labelText ->
            {
                val labelColor = style.colors.label.getBrushAsState(motion.context, motion.style.labelColor)
                val labelStyle by style.labelStyleValue.getTextStyleAsState(motion.context, motion.style.labelStyle)
                Text(labelText, style = labelStyle, brush = { labelColor.value })
            }
        },
        extra = extra,
        motion = motion,
    )
}

/**
 * Элемент [TabBar]
 *
 * @param modifier модификатор
 * @param onClick обработчик нажатия
 * @param style стиль компонента
 * @param defaultIcon источник иконки при [isSelected] == false
 * @param selectedIcon источник иконки при [isSelected] == true
 * @param label текст лэйбла
 * @param interactionSource источник взаимодействий
 * @param extra дополнительный контент в правом верхнем углу иконки
 */
@Composable
fun TabBarItem(
    modifier: Modifier = Modifier,
    isSelected: Boolean,
    onClick: (() -> Unit)? = null,
    style: TabBarItemStyle = LocalTabBarItemStyle.current,
    defaultIcon: ImageSource,
    selectedIcon: ImageSource,
    label: String? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    extra: (@Composable () -> Unit)? = null,
) {
    val motionInteractionSource = remember(interactionSource) {
        interactionSource as? MutableInteractionSource ?: MutableInteractionSource()
    }
    val motion = rememberTabBarItemMotion(motionContext = rememberMotionContext(motionInteractionSource))
    TabBarItem(
        icon = {
            Icon(
                source = if (isSelected) selectedIcon else defaultIcon,
                contentDescription = "",
            )
        },
        modifier = modifier,
        onClick = onClick,
        isSelected = isSelected,
        style = style,
        labelContent = label?.takeIf { it.isNotEmpty() }?.let { labelText ->
            {
                val labelColor = style.colors.label.getBrushAsState(motion.context, motion.style.labelColor)
                val labelStyle by style.labelStyleValue.getTextStyleAsState(motion.context, motion.style.labelStyle)
                Text(labelText, style = labelStyle, brush = { labelColor.value })
            }
        },
        extra = extra,
        motion = motion,
    )
}

/**
 * Размещение label в [TabBar]
 */
enum class TabBarLabelPlacement {

    /**
     * Лэйбл отсутствует
     */
    None,

    /**
     * Лэйбл снизу
     */
    Bottom,
}
