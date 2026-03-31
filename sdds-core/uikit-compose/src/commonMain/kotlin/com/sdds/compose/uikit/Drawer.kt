package com.sdds.compose.uikit

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import com.sdds.compose.uikit.DrawerAlignment.Bottom
import com.sdds.compose.uikit.DrawerAlignment.End
import com.sdds.compose.uikit.DrawerAlignment.Start
import com.sdds.compose.uikit.DrawerAlignment.Top
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.internal.drawer.DrawerContent
import com.sdds.compose.uikit.internal.drawer.DrawerLayout
import com.sdds.compose.uikit.internal.drawer.DrawerOverlay
import com.sdds.compose.uikit.internal.drawer.DrawerStateImpl
import com.sdds.compose.uikit.internal.drawer.anchorDistance
import com.sdds.compose.uikit.internal.drawer.calculateFraction
import com.sdds.compose.uikit.internal.drawer.confirmStateChange
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

/**
 * Контейнер выезжающей панели (Drawer), накладываемой поверх/рядом с основным контентом.
 * Управляется через [DrawerState] и поддерживает жесты перетаскивания и оверлей.
 *
 * @param drawerContent содержимое панели (внутренний контент дроуэра).
 * @param modifier модификатор для контейнера панели.
 * @param style стиль панели.
 * @param drawerState состояние панели: положение, выравнивание и анимация.
 * @param gesturesEnabled включает управление жестами.
 * @param overlayEnabled включает затемняющий оверлей под панелью.
 * @param moveContentEnabled сдвигает основной контент при открытии панели.
 * @param closeIconPlacement расположение иконки закрытия относительно панели.
 * @param closeIconAlignment выравнивание иконки закрытия относительно панели.
 * @param closeIconAbsolute включает абсолютное расположение иконки закрытия.
 * Иконка закрытия будет накладываться на контент внутри [drawerContent]. Работает только при [CloseIconPlacement.Inner]
 * @param peekOffset видимая «подсказка» (величина подглядывания) закрытой панели.
 * @param interactionSource источник интеракций для иконки закрытия.
 * @param closeIcon кастомная иконка закрытия; если не задана — используется из [style].
 * @param drawerHeader необязательный заголовок панели.
 * @param drawerFooter необязательный футер панели.
 * @param content основной контент экрана под панелью.
 */
@Composable
fun Drawer(
    drawerContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: DrawerStyle = LocalDrawerStyle.current,
    drawerState: DrawerState = rememberDrawerState(DrawerValue.Closed),
    gesturesEnabled: Boolean = true,
    overlayEnabled: Boolean = true,
    moveContentEnabled: Boolean = false,
    openOnFocus: Boolean = true,
    closeIconPlacement: CloseIconPlacement = style.closeIconPlacement,
    closeIconAlignment: CloseIconAlignment = style.closeIconAlignment,
    closeIconAbsolute: Boolean = false,
    peekOffset: Dp = style.dimensions.peekSize,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    closeIcon: (@Composable () -> Unit)? = null,
    drawerHeader: (@Composable () -> Unit)? = null,
    drawerFooter: (@Composable () -> Unit)? = null,
    content: @Composable BoxScope.() -> Unit,
) {
    val scope = rememberCoroutineScope()

    DrawerLayout(
        drawerState = drawerState,
        gesturesEnabled = gesturesEnabled,
        modifier = Modifier.clip(RectangleShape),
    ) { drawerConstraints ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .moveContent(moveContentEnabled, drawerState),
            content = content,
        )

        if (overlayEnabled) {
            DrawerOverlay(
                open = { drawerState.isOpen },
                fraction = { drawerState.calculateFraction() },
                onClose = {
                    val close = gesturesEnabled && drawerState.confirmStateChange(DrawerValue.Closed)
                    if (close) scope.launch { drawerState.close() }
                },
            )
        }

        DrawerContent(
            modifier = modifier
                .align(
                    when (drawerState.alignment) {
                        Start -> Alignment.CenterStart
                        Top -> Alignment.TopCenter
                        End -> Alignment.CenterEnd
                        Bottom -> Alignment.BottomCenter
                    },
                ),
            drawerConstraints = drawerConstraints,
            drawerState = drawerState,
            style = style,
            onClose = {
                scope.launch { drawerState.close() }
            },
            interactionSource = interactionSource,
            header = drawerHeader,
            openOnFocus = openOnFocus,
            closeIcon = getCloseIcon(style.closeIconRes, style.colors.closeIconColor, closeIcon, closeIconPlacement) {
                scope.launch { drawerState.close() }
            },
            closeIconPlacement = closeIconPlacement,
            closeIconAlignment = closeIconAlignment,
            closeIconAbsolute = closeIconAbsolute,
            peekOffset = peekOffset,
            footer = drawerFooter,
            content = drawerContent,
        )
    }
}

/**
 * Создаёт и запоминает [DrawerState] с сохранением через `rememberSaveable`.
 *
 * @param initialValue начальное значение состояния (открыт/закрыт).
 * @param alignment сторона, с которой появляется панель.
 * @param confirmStateChange колбэк для подтверждения смены состояния.
 * @return экземпляр [DrawerState].
 */
@Composable
fun rememberDrawerState(
    initialValue: DrawerValue,
    alignment: DrawerAlignment = Start,
    confirmStateChange: (DrawerValue) -> Boolean = { true },
): DrawerState {
    val density = LocalDensity.current
    return rememberSaveable(density, alignment, saver = DrawerStateImpl.saver(density, confirmStateChange)) {
        DrawerStateImpl(initialValue, alignment, density, confirmStateChange)
    }
}

/**
 * Сторона, с которой открывается панель.
 */
enum class DrawerAlignment {
    /** Выравнивание слева. */
    Start,

    /** Выравнивание сверху. */
    Top,

    /** Выравнивание справа. */
    End,

    /** Выравнивание снизу. */
    Bottom,
}

/**
 * Текущее или целевое состояние панели.
 */
enum class DrawerValue {
    /** Панель открыта. */
    Opened,

    /** Панель закрыта. */
    Closed,
}

/**
 * Выравнивание иконки закрытия относительно панели Drawer
 */
enum class CloseIconAlignment {
    /** Иконка слева. */
    Start,

    /** Иконка справа. */
    End,
}

/**
 * Расположение иконки закрытия панели Drawer
 */
enum class CloseIconPlacement {

    /**
     * Иконка отсутствует
     */
    None,

    /**
     * Иконка внутри панели Drawer
     */
    Inner,

    /**
     * Иконка снаружи панели Drawer
     */
    Outer,
}

/**
 * Состояние выезжающей панели (Drawer).
 * Описывает текущее положение панели, целевое состояние, а также параметры жестов и прокрутки.
 */
@Stable
interface DrawerState {

    /**
     * Сторона, с которой открывается панель.
     */
    val alignment: DrawerAlignment

    /**
     * Признак, что панель полностью открыта.
     */
    val isOpen: Boolean

    /**
     * Признак, что панель полностью закрыта.
     */
    val isClosed: Boolean

    /**
     * Текущее зафиксированное состояние панели.
     */
    val currentValue: DrawerValue

    /**
     * Целевое состояние, к которому идёт анимация (если она выполняется).
     */
    val targetValue: DrawerValue

    /**
     * Идёт ли сейчас анимация изменения состояния.
     */
    val isAnimationRunning: Boolean

    /**
     * Текущий сдвиг панели в пикселях (может быть нечислом, если ещё не рассчитан).
     */
    val offset: Float

    /**
     * Соединение для вложенной прокрутки, позволяющее согласовать жесты с родителем/потомками.
     */
    val nestedScrollConnection: NestedScrollConnection

    /**
     * Состояние жеста перетаскивания между якорями (закрыто/открыто).
     */
    @OptIn(ExperimentalFoundationApi::class)
    val anchoredDraggableState: AnchoredDraggableState<DrawerValue>

    /**
     * Открывает панель с анимацией перехода к состоянию [DrawerValue.Opened].
     */
    suspend fun open()

    /**
     * Закрывает панель с анимацией перехода к состоянию [DrawerValue.Closed].
     */
    suspend fun close()

    /**
     * Мгновенно устанавливает указанное состояние без анимации.
     *
     * @param targetValue целевое состояние панели.
     */
    suspend fun snapTo(targetValue: DrawerValue)
}

internal fun DrawerAlignment.isHorizontal(): Boolean {
    return this == Start || this == End
}

private fun getDefaultCloseIcon(
    closeIconRes: Int,
    interactionSource: MutableInteractionSource,
    onClose: () -> Unit,
): (@Composable () -> Unit)? {
    return if (closeIconRes != -1) {
        {
            Icon(
                modifier = Modifier.clickable(
                    interactionSource = interactionSource,
                    indication = null,
                    onClick = onClose,
                ),
                painter = painterResource(closeIconRes),
                contentDescription = "Close",
            )
        }
    } else {
        null
    }
}

private fun getCloseIcon(
    closeIconRes: Int,
    closeIconColor: InteractiveColor,
    closeIcon: @Composable (() -> Unit)?,
    closeIconPlacement: CloseIconPlacement,
    onClose: () -> Unit,
): (@Composable () -> Unit)? {
    return if (closeIconPlacement != CloseIconPlacement.None) {
        {
            val interactionSource = remember { MutableInteractionSource() }
            val color by closeIconColor.colorForInteractionAsState(interactionSource)
            CompositionLocalProvider(LocalTint provides color) {
                closeIcon?.invoke() ?: getDefaultCloseIcon(closeIconRes, interactionSource, onClose)?.invoke()
            }
        }
    } else {
        null
    }
}

private fun Modifier.moveContent(enabled: Boolean, drawerState: DrawerState): Modifier {
    return this.offset {
        drawerState.offset
            .takeIf { it.isFinite() && enabled }
            ?.roundToInt()
            ?.let { drawerState.alignment.toContentOffset(it, drawerState.anchorDistance().toInt()) }
            ?: NoContentOffset
    }
}

private fun DrawerAlignment.toContentOffset(offset: Int, distance: Int): IntOffset {
    return when (this) {
        Start -> IntOffset(distance + offset, 0)
        End -> IntOffset(offset - distance, 0)
        Top -> IntOffset(0, distance + offset)
        Bottom -> IntOffset(0, offset - distance)
    }
}

private val NoContentOffset = IntOffset(0, 0)
