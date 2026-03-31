package com.sdds.compose.uikit

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.round
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.internal.popover.BasePopover
import com.sdds.compose.uikit.internal.popover.DefaultPopupProperties
import kotlin.math.max

/**
 * Компонент Popover.
 * Представляет из себя всплывающее окно, привязанное к какому-либо тригеру.
 *
 * @param show будет ли показан Popover
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне Popover либо по истечении [duration]
 * @param triggerInfo информация о размерах и размещении триггера
 * @param style стиль компонента
 * @param placement ориентация компонента относительно триггера
 * @param placementMode режим размещения [PopoverPlacementMode]
 * @param triggerCentered если true, то компонент будет выравнен относительно триггера таким образом,
 * что указатель будет смотреть на центр триггера
 * @param alignment выравнивание компонента относительно триггера
 * @param tailEnabled включен ли указатель
 * @param duration время, в течение которого будет показан Popover.
 * Если null, то компонент будет показываться до принудительного закрытия.
 * @param popupProperties свойства [Popup]
 * @param enterTransition анимация появления
 * @param exitTransition анимация исчезновения
 * @param interactionSource источник взаимодействий
 * @param content содержимое Popover
 */
@Composable
@NonRestartableComposable
fun Popover(
    show: Boolean,
    onDismissRequest: () -> Unit,
    triggerInfo: TriggerInfo,
    style: PopoverStyle = LocalPopoverStyle.current,
    placement: PopoverPlacement = PopoverPlacement.Top,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    triggerCentered: Boolean = false,
    alignment: PopoverAlignment = PopoverAlignment.Start,
    tailEnabled: Boolean = true,
    duration: Long? = null,
    popupProperties: PopupProperties = DefaultPopupProperties,
    enterTransition: EnterTransition = fadeIn(),
    exitTransition: ExitTransition = fadeOut(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    BasePopover(
        show = show,
        onDismissRequest = onDismissRequest,
        triggerInfo = { triggerInfo },
        shape = style.shape,
        shadow = style.shadow,
        dimensions = style.dimensions,
        colors = style.colors,
        placement = placement,
        placementMode = placementMode,
        triggerCentered = triggerCentered,
        alignment = alignment,
        tailEnabled = tailEnabled,
        duration = duration,
        popupProperties = popupProperties,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Режим выравнивания компонента и указателя относительно триггера
 */
enum class PopoverAlignment {

    /**
     * Компонент и указатель выравниваются по началу триггера
     */
    Start,

    /**
     * Компонент и указатель выравниваются по центру триггера
     */
    Center,

    /**
     * Компонент и указатель выравниваются по концу триггера
     */
    End,
}

/**
 * Ориентация компонента относительно триггера
 */
enum class PopoverPlacement {
    /**
     * В начале триггера
     */
    Start,

    /**
     * Cверху от триггера
     */
    Top,

    /**
     * В конце триггера
     */
    End,

    /**
     * Снизу от триггера
     */
    Bottom,

    ;

    internal companion object {
        val StartFallbacks = arrayOf(End, Top, Bottom)
        val EndFallbacks = arrayOf(Start, Top, Bottom)
        val TopFallbacks = arrayOf(Bottom, Start, End)
        val BottomFallbacks = arrayOf(Top, Start, End)
    }
}

/**
 * Режим расположения компонента
 */
enum class PopoverPlacementMode {
    /**
     * Компонент будет размещен строго в соответствии с [PopoverPlacement] даже при отсутствии свободного места
     */
    Strict,

    /**
     * Компонент может изменять ориентацию [PopoverPlacement] при отсутствии свободного места
     */
    Loose,
}

/**
 * Модификатор, позволяющий получать информацию о размещении триггера,
 * необходимую для корректной работы [Popover], [Tooltip], [DropdownMenu]
 */
fun Modifier.popoverTrigger(triggerInfo: MutableState<TriggerInfo>): Modifier {
    return composed {
        val currentScaleFactor = LocalFocusSelectorSettings.current.scale.scaleFactor
        layout { measurable, constraints ->
            val placeable = measurable.measure(constraints)
            triggerInfo.value = triggerInfo.value.copy(
                topAlignmentLine = placeable[topAlignmentLine],
                bottomAlignmentLine = placeable[bottomAlignmentLine],
                startAlignmentLine = placeable[startAlignmentLine],
                endAlignmentLine = placeable[endAlignmentLine],
            )
            return@layout layout(placeable.width, placeable.height) {
                placeable.placeRelative(IntOffset.Zero)
            }
        }.onGloballyPositioned {
            triggerInfo.value = triggerInfo.value.copy(
                size = it.size,
                positionInRoot = it.positionInWindow().round(),
            )
        }.onFocusChanged {
            val scaleFactor = if (it.isFocused) {
                currentScaleFactor
            } else {
                0f
            }
            triggerInfo.value = triggerInfo.value.copy(focusScaleFactor = scaleFactor)
        }
    }
}

internal val topAlignmentLine = HorizontalAlignmentLine(merger = { old, new -> max(old, new) })
internal val bottomAlignmentLine = HorizontalAlignmentLine(merger = { old, new -> max(old, new) })
internal val startAlignmentLine = VerticalAlignmentLine(merger = { old, new -> max(old, new) })
internal val endAlignmentLine = VerticalAlignmentLine(merger = { old, new -> max(old, new) })

/**
 * Информация о размерах и расположении триггера
 *
 * @property positionInRoot координаты триггера
 * @property size размеры триггера
 * @property focusScaleFactor на сколько триггер увеличен в фокусе
 * @property topAlignmentLine верхняя линия выранивания триггера. Рассчитывается относительно [positionInRoot]
 * @property bottomAlignmentLine верхняя линия выранивания триггера. Рассчитывается относительно [positionInRoot]
 * @property topAlignmentLine верхняя линия выранивания триггера. Рассчитывается относительно [positionInRoot]
 * @property bottomAlignmentLine нижняя линия выранивания триггера. Рассчитывается относительно [positionInRoot]
 * @property startAlignmentLine начальная линия выранивания триггера. Рассчитывается относительно [positionInRoot]
 * @property endAlignmentLine конечная линия выранивания триггера. Рассчитывается относительно [positionInRoot]
 */
@Stable
data class TriggerInfo(
    val positionInRoot: IntOffset = IntOffset.Zero,
    val size: IntSize = IntSize.Zero,
    val focusScaleFactor: Float = 0f,
    val topAlignmentLine: Int = AlignmentLine.Unspecified,
    val bottomAlignmentLine: Int = AlignmentLine.Unspecified,
    val startAlignmentLine: Int = AlignmentLine.Unspecified,
    val endAlignmentLine: Int = AlignmentLine.Unspecified,
)
