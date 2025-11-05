package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Tabs.DISABLE_ALPHA
import com.sdds.compose.uikit.Tabs.DIVIDER_LAYOUT_ID
import com.sdds.compose.uikit.Tabs.END_BUTTON_LAYOUT_ID
import com.sdds.compose.uikit.Tabs.TABS_CONTAINER_LAYOUT_ID
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.internal.tabs.TabScopeImpl
import com.sdds.compose.uikit.internal.tabs.container.TabsContainer
import com.sdds.compose.uikit.internal.tabs.measure.HorizontalMeasurePolicy
import com.sdds.compose.uikit.internal.tabs.measure.VerticalMeasurePolicy
import com.sdds.compose.uikit.internal.tabs.scrollToNextTab
import com.sdds.compose.uikit.internal.tabs.scrollToPreviousTab
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Cкоуп [Tabs]
 */
interface TabScope {
    /**
     * Добавляет таб с контентом [content].
     *
     * @param [content] получает в параметрах Boolean-значение, которое сигнализирует о том, выбран таб или нет
     */
    fun tab(content: @Composable (Boolean) -> Unit)

    /**
     * Добавляет таб с контентом [content].
     *
     * @param [dropdownAlias] текстовое представление таба, для отображения в раскрывающемся списке по нажатию на disclosure-кнопку.
     * В этот список попадают те табы, которые не поместились в основной контейнер.
     * @param [content] получает в параметрах Boolean-значение, которое сигнализирует о том, выбран таб или нет
     */
    fun tab(dropdownAlias: String = "", content: @Composable (Boolean) -> Unit)

    /**
     * Устанавливает контент для disclosure кнопки.
     * Обработка нажатия происходит внутри компонента - это означает, что [content] не должен внутри себя перехватывать клики.
     */
    fun disclosureButton(content: @Composable () -> Unit)
}

/**
 * Режим ограничения размера контейнера с табами
 */
enum class TabsClip {
    /**
     * Табы размещаются как есть. Непоместившиеся табы уйдут за границу контейнера.
     */
    None,

    /**
     * Табы размещаются, пока есть место в контейнере.
     * Если все табы не помещаются, отображается disclosure-кнопка, по нажатию которой открывается список с непоместившимися табами.
     * При этом табы имеют текстовое представление с текстом, указанным в [dropdownAlias] - см. [TabScope.tab]
     */
    ShowMore,

    /**
     * Табы размещаются в скроллящемся контейнере
     */
    Scroll,
}

/**
 * Ориентация табов
 */
enum class TabsOrientation {
    /**
     * Табы располагаются по-горизонтали
     */
    Horizontal,

    /**
     * Табы располагаются по-вертикали
     */
    Vertical,
}

/**
 * Элемент навигации, состоящий из нескольких вкладок.
 * В компоненте доступно отображение максимум 10 табов.
 *
 * @param modifier модификатор
 * @param style стиль компонента [TabsStyle]
 * @param selectedTabIndex индекс выбранного таба
 * @param onTabClicked обработчик нажатия на таб.
 * В параметре лямбды доступен индекс нажатого таба.
 * @param clip режимразмещения ограничения размеров контейнера с табами [TabsClip]
 * @param stretch занимают ли табы доступное пространство
 * @param enabled включает/выключает компонент
 * @param indicatorEnabled включает индикатор выбранного таба
 * @param dividerEnabled включает разделитель
 * @param orientation ориентация расположения табов
 * @param interactionSource источник взаимодействий
 * @param tabs контент с табами. Наполняется с помощью функций из [TabScope]
 */
@Composable
@Suppress("LongMethod")
fun Tabs(
    modifier: Modifier = Modifier,
    style: TabsStyle = LocalTabsStyle.current,
    selectedTabIndex: Int,
    onTabClicked: (Int) -> Unit,
    clip: TabsClip = TabsClip.None,
    stretch: Boolean = false,
    enabled: Boolean = true,
    indicatorEnabled: Boolean = style.indicatorEnabled,
    dividerEnabled: Boolean = style.dividerEnabled,
    orientation: TabsOrientation = style.orientation,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    tabs: TabScope.() -> Unit,
) {
    var overflowIndex by remember { mutableIntStateOf(-1) }
    val tabScope = remember { TabScopeImpl() }
    tabScope.reset()
    tabScope.tabs()
    Box(modifier = modifier) {
        @DrawableRes
        val overFlowNextIcon: Int? = style.overflowNextIcon

        @DrawableRes
        val overFlowPrevIcon: Int? = style.overflowPrevIcon
        val dropdownTriggerInfo = remember { mutableStateOf(TriggerInfo()) }
        val showDropdown = remember { mutableStateOf(false) }
        Layout(
            modifier = Modifier
                .background(
                    color = style.colors.backgroundColor.colorForInteraction(interactionSource),
                )
                .clip(style.shape),
            measurePolicy = remember(orientation) {
                when (orientation) {
                    TabsOrientation.Horizontal -> HorizontalMeasurePolicy()
                    TabsOrientation.Vertical -> VerticalMeasurePolicy()
                }
            },
            content = {
                val scrollState = rememberScrollState()
                val coroutineScope = rememberCoroutineScope()
                val canStretch = stretch && clip != TabsClip.Scroll
                val spacingDp = getItemSpacing(style.dimensions.minSpacing, canStretch)
                val spacingPx = with(LocalDensity.current) {
                    spacingDp.roundToPx()
                }
                val tabSizes = remember { mutableStateListOf<Int>() }
                StartControl(
                    overFlowIcon = overFlowPrevIcon,
                    clip = clip,
                    coroutineScope = coroutineScope,
                    scrollState = scrollState,
                    tabSizes = tabSizes,
                    spacingPx = spacingPx,
                    color = style.colors.overflowPrevIconColor,
                    interactionSource = interactionSource,
                    enabled = enabled,
                )
                TabsContainer(
                    modifier = Modifier
                        .layoutId(TABS_CONTAINER_LAYOUT_ID)
                        .clipToBounds(),
                    style = style,
                    enabled = enabled,
                    selectedTabIndex = selectedTabIndex,
                    onTabClicked = onTabClicked,
                    clip = clip,
                    canStretch = canStretch,
                    spacingDp = spacingDp,
                    spacingPx = spacingPx,
                    scrollState = scrollState,
                    coroutineScope = coroutineScope,
                    indicatorEnabled = indicatorEnabled,
                    orientation = orientation,
                    interactionSource = interactionSource,
                    tabSizes = tabSizes,
                    dropdownTriggerInfo = dropdownTriggerInfo,
                    onDisclosureClick = { showDropdown.value = true },
                    tabs = tabScope.tabs.map { it.main },
                    disclosureContent = tabScope.disclosureContent,
                    onOverflowTab = { overflowIndex = it },
                )
                EndControl(
                    overFlowIcon = overFlowNextIcon,
                    clip = clip,
                    coroutineScope = coroutineScope,
                    scrollState = scrollState,
                    tabSizes = tabSizes,
                    spacingPx = spacingPx,
                    color = style.colors.overflowNextIconColor,
                    interactionSource = interactionSource,
                    enabled = enabled,
                )
                if (dividerEnabled) {
                    Divider(
                        modifier = Modifier.layoutId(DIVIDER_LAYOUT_ID),
                        style = style.dividerStyle,
                        orientation = when (orientation) {
                            TabsOrientation.Horizontal -> DividerOrientation.Horizontal
                            TabsOrientation.Vertical -> DividerOrientation.Vertical
                        },
                    )
                }
            },
        )

        DropdownIfNeed(
            clip = clip,
            showDropdown = showDropdown,
            style = style,
            dropdownTriggerInfo = dropdownTriggerInfo,
            tabScope = tabScope,
            overflowIndex = overflowIndex,
            onTabClicked = onTabClicked,
        )
    }
}

internal object Tabs {
    const val DISABLE_ALPHA = 0.4f
    const val START_BUTTON_LAYOUT_ID = "StartButton"
    const val END_BUTTON_LAYOUT_ID = "EndButton"
    const val DIVIDER_LAYOUT_ID = "Divider"
    const val TABS_CONTAINER_LAYOUT_ID = "TabsContainer"
}

@Composable
private fun DropdownIfNeed(
    clip: TabsClip,
    showDropdown: MutableState<Boolean>,
    style: TabsStyle,
    dropdownTriggerInfo: MutableState<TriggerInfo>,
    tabScope: TabScopeImpl,
    overflowIndex: Int,
    onTabClicked: (Int) -> Unit,
) {
    if (clip == TabsClip.ShowMore) {
        DropdownMenu(
            modifier = Modifier,
            opened = showDropdown.value,
            onDismissRequest = { showDropdown.value = false },
            triggerInfo = dropdownTriggerInfo.value,
            placement = PopoverPlacement.Bottom,
            placementMode = PopoverPlacementMode.Loose,
            alignment = PopoverAlignment.Start,
            style = style.dropdownMenuStyle,
        ) {
            List {
                for (i in overflowIndex..tabScope.tabs.lastIndex) {
                    item {
                        val interactionSource = remember { MutableInteractionSource() }
                        ListItem(
                            modifier = Modifier
                                .clickable(
                                    indication = null,
                                    interactionSource = interactionSource,
                                ) {
                                    onTabClicked.invoke(i)
                                    showDropdown.value = false
                                }
                                .focusable(interactionSource = interactionSource),
                            text = tabScope.tabs[i].dropdownAlias,
                            disclosureEnabled = false,
                            interactionSource = interactionSource,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun StartControl(
    overFlowIcon: Int?,
    clip: TabsClip,
    coroutineScope: CoroutineScope,
    scrollState: ScrollState,
    tabSizes: SnapshotStateList<Int>,
    spacingPx: Int,
    color: InteractiveColor,
    interactionSource: InteractionSource,
    enabled: Boolean,
) {
    if (overFlowIcon != null && clip == TabsClip.Scroll) {
        val nonTransparentAlpha = if (enabled) 1f else DISABLE_ALPHA
        Icon(
            modifier = Modifier
                .graphicsLayer { alpha = if (!scrollState.isStart()) nonTransparentAlpha else 0f }
                .clickable(
                    enabled = enabled,
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() },
                ) {
                    coroutineScope.launch {
                        scrollToPreviousTab(
                            tabSizes = tabSizes,
                            scrollState = scrollState,
                            spacing = spacingPx,
                        )
                    }
                }
                .layoutId(Tabs.START_BUTTON_LAYOUT_ID),
            painter = painterResource(overFlowIcon),
            contentDescription = "",
            tint = color.colorForInteraction(interactionSource),
        )
    }
}

@Composable
private fun EndControl(
    overFlowIcon: Int?,
    clip: TabsClip,
    coroutineScope: CoroutineScope,
    scrollState: ScrollState,
    tabSizes: SnapshotStateList<Int>,
    spacingPx: Int,
    color: InteractiveColor,
    interactionSource: InteractionSource,
    enabled: Boolean,
) {
    if (overFlowIcon != null && clip == TabsClip.Scroll) {
        val nonTransparentAlpha = if (enabled) 1f else DISABLE_ALPHA
        Icon(
            modifier = Modifier
                .graphicsLayer { alpha = if (!scrollState.isEnd()) nonTransparentAlpha else 0f }
                .clickable(
                    enabled = enabled,
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() },
                ) {
                    coroutineScope.launch {
                        scrollToNextTab(
                            tabSizes = tabSizes,
                            scrollState = scrollState,
                            spacing = spacingPx,
                        )
                    }
                }
                .layoutId(END_BUTTON_LAYOUT_ID),
            painter = painterResource(overFlowIcon),
            contentDescription = "",
            tint = color.colorForInteraction(interactionSource),
        )
    }
}

private fun ScrollState.isStart(): Boolean {
    return this.value == 0
}

private fun ScrollState.isEnd(): Boolean {
    return this.value == this.maxValue
}

private fun getItemSpacing(styleMinSpacing: Dp, canStretch: Boolean) =
    if (canStretch) 0.dp else styleMinSpacing
