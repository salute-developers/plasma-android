package com.sdds.compose.uikit

import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.valueStateSetOf
import com.sdds.compose.uikit.internal.navigationdrawer.LocalNavigationDrawerValue
import com.sdds.compose.uikit.internal.navigationdrawer.NavigationDrawerLayout
import com.sdds.compose.uikit.internal.navigationdrawer.NavigationDrawerStateImpl
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.navigationdrawer.NavigationDrawerMotionStyle
import com.sdds.compose.uikit.motion.components.navigationdrawer.rememberNavigationDrawerMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.compose.uikit.shadow.shadow
import kotlinx.coroutines.launch

/**
 * Текущее или целевое состояние [NavigationDrawer].
 */
enum class NavigationDrawerValue : ValueState {
    /**
     * NavigationDrawer отображается в развёрнутом состоянии.
     */
    Expanded,

    /**
     * NavigationDrawer отображается как видимый интерактивный rail.
     */
    Collapsed,
}

/**
 * Состояние [NavigationDrawer].
 *
 * Управляет семантическим состоянием компонента: [NavigationDrawerValue.Expanded]
 * или [NavigationDrawerValue.Collapsed]. Анимация визуальных значений задаётся
 * стилями motion-компонента, а не этим объектом состояния.
 */
@Stable
interface NavigationDrawerState {

    /**
     * Текущее зафиксированное состояние [NavigationDrawer].
     */
    val currentValue: NavigationDrawerValue

    /**
     * Целевое состояние [NavigationDrawer].
     */
    val targetValue: NavigationDrawerValue

    /**
     * Прогресс раскрытия [NavigationDrawer] в диапазоне от `0f` до `1f`.
     *
     * `0f` соответствует [NavigationDrawerValue.Collapsed], `1f` соответствует
     * [NavigationDrawerValue.Expanded]. Во время motion-перехода значение отражает
     * текущую анимированную ширину drawer.
     */
    val progress: Float

    /**
     * Возвращает `true`, когда [NavigationDrawer] развёрнут.
     */
    val isExpanded: Boolean

    /**
     * Возвращает `true`, когда [NavigationDrawer] схлопнут до видимого rail.
     */
    val isCollapsed: Boolean

    /**
     * Возвращает `true`, когда выполняется переход между состояниями.
     */
    val isAnimationRunning: Boolean

    /**
     * Переводит [NavigationDrawer] в состояние [NavigationDrawerValue.Expanded].
     */
    suspend fun expand()

    /**
     * Переводит [NavigationDrawer] в состояние [NavigationDrawerValue.Collapsed].
     */
    suspend fun collapse()

    /**
     * Мгновенно устанавливает указанное состояние без визуального перехода.
     *
     * @param targetValue целевое состояние [NavigationDrawer].
     */
    suspend fun snapTo(targetValue: NavigationDrawerValue)

    /**
     * Переключается на противоположное значение состояния
     */
    suspend fun toggle() {
        if (isExpanded) collapse() else expand()
    }
}

/**
 * Создаёт и запоминает [NavigationDrawerState] с сохранением через `rememberSaveable`.
 *
 * @param initialValue начальное состояние [NavigationDrawer].
 */
@Composable
fun rememberNavigationDrawerState(
    initialValue: NavigationDrawerValue = NavigationDrawerValue.Collapsed,
): NavigationDrawerState {
    return rememberSaveable(saver = NavigationDrawerStateImpl.Saver) {
        NavigationDrawerStateImpl(initialValue)
    }
}

/**
 * Slot-based контейнер NavigationDrawer с областями header, content и footer.
 *
 * [NavigationDrawerValue.Collapsed] остаётся видимым интерактивным состоянием, поэтому
 * компонент меняет измеряемую ширину контейнера и не использует drag/gesture механику.
 *
 * @param modifier модификатор контейнера.
 * @param state состояние раскрытия [NavigationDrawer].
 * @param style стиль контейнера.
 * @param motion стиль анимаций контейнера.
 * @param expandOnFocus раскрывает drawer при фокусе внутри subtree и схлопывает при потере фокуса.
 * @param header необязательный верхний слот.
 * @param footer необязательный нижний слот.
 * @param content основной контент drawer.
 */
@Composable
fun NavigationDrawer(
    modifier: Modifier = Modifier,
    state: NavigationDrawerState = rememberNavigationDrawerState(),
    style: NavigationDrawerStyle = LocalNavigationDrawerStyle.current,
    motion: Motion<NavigationDrawerMotionStyle> = rememberNavigationDrawerMotion(state),
    expandOnFocus: Boolean = false,
    header: (@Composable ColumnScope.() -> Unit)? = null,
    footer: (@Composable ColumnScope.() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    val scope = rememberCoroutineScope()
    val density = LocalDensity.current
    val width by style.dimensions.width.getDpAsState(motion.context, motion.style.width)
    val background = style.colors.background.getBrushAsState(motion.context, motion.style.background)
    val shape = style.shape.getValueAsState(motion.context)
    val shadow = style.shadow.getValueAsState(motion.context)
    val paddings = style.dimensions.getPaddings(motion)
    val focusModifier = if (expandOnFocus) {
        Modifier.onFocusChanged {
            scope.launch {
                if (it.hasFocus) {
                    state.expand()
                } else {
                    state.collapse()
                }
            }
        }
    } else {
        Modifier
    }

    CompositionLocalProvider(
        LocalNavigationDrawerValue provides state.currentValue,
        LocalNavigationDrawerItemStyle provides style.itemStyle,
    ) {
        val currentShape = shape.value
        NavigationDrawerLayout(
            modifier = modifier
                .then(focusModifier)
                .focusable(enabled = expandOnFocus, interactionSource = motion.context.interactionSource)
                .shadow(shadow.value, currentShape)
                .clip(currentShape)
                .width(width)
                .fillMaxHeight()
                .backgroundBrush(
                    brushProducer = { background.value },
                    shape = currentShape,
                )
                .padding(paddings.value),
            header = header,
            footer = footer,
            content = content,
            motion = motion,
            style = style,
        )
    }
    SideEffect {
        if (state is NavigationDrawerStateImpl) {
            val progress = calculateProgress(
                currentWidth = width,
                widthStates = style.dimensions.width,
                density = density,
                fallbackValue = state.currentValue,
            )
            state.updateProgress(progress)
        }

        motion.context.semanticStateSource.setExclusive(
            state.currentValue,
            NavigationDrawerValue.Expanded,
            NavigationDrawerValue.Collapsed,
        )
    }
}

@Composable
private fun NavigationDrawerDimensions.getPaddings(
    motion: Motion<NavigationDrawerMotionStyle>,
): State<PaddingValues> {
    val paddingStart = paddingStart.getValueAsState(motion.context)
    val paddingEnd = paddingEnd.getValueAsState(motion.context)
    val paddingTop = paddingTop.getValueAsState(motion.context)
    val paddingBottom = paddingBottom.getValueAsState(motion.context)
    return remember {
        derivedStateOf {
            PaddingValues(
                start = paddingStart.value,
                top = paddingTop.value,
                end = paddingEnd.value,
                bottom = paddingBottom.value,
            )
        }
    }
}

private fun calculateProgress(
    currentWidth: Dp,
    widthStates: StatefulValue<Dp>,
    density: Density,
    fallbackValue: NavigationDrawerValue,
): Float {
    val collapsedWidth = widthStates.getValue(valueStateSetOf(NavigationDrawerValue.Collapsed))
    val expandedWidth = widthStates.getValue(valueStateSetOf(NavigationDrawerValue.Expanded))
    val currentPx = with(density) { currentWidth.toPx() }
    val collapsedPx = with(density) { collapsedWidth.toPx() }
    val expandedPx = with(density) { expandedWidth.toPx() }
    val range = expandedPx - collapsedPx
    if (range == 0f) return fallbackValue.progress
    return ((currentPx - collapsedPx) / range).coerceIn(0f, 1f)
}

private val NavigationDrawerValue.progress: Float
    get() = when (this) {
        NavigationDrawerValue.Expanded -> 1f
        NavigationDrawerValue.Collapsed -> 0f
    }
