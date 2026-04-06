package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.internal.tabs.BaseTabs

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
     * @param [content] получает в параметрах Boolean-значение, которое сигнализирует о том, выбран таб или нет
     */
    fun tabItem(content: @Composable () -> Unit)

    /**
     * Добавляет таб с контентом [content].
     *
     * @param [dropdownAlias] текстовое представление таба, для отображения в раскрывающемся списке по нажатию на disclosure-кнопку.
     * В этот список попадают те табы, которые не поместились в основной контейнер.
     * @param [content] получает в параметрах Boolean-значение, которое сигнализирует о том, выбран таб или нет
     */
    fun tab(dropdownAlias: String = "", content: @Composable (Boolean) -> Unit)

    /**
     * Добавляет таб с контентом [content].
     *
     * @param [dropdownAlias] текстовое представление таба, для отображения в раскрывающемся списке по нажатию на disclosure-кнопку.
     * В этот список попадают те табы, которые не поместились в основной контейнер.
     * @param [content] получает в параметрах Boolean-значение, которое сигнализирует о том, выбран таб или нет
     */
    fun tabItem(dropdownAlias: String = "", content: @Composable () -> Unit)

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
    selectedTabIndexProvider: () -> Int,
    modifier: Modifier = Modifier,
    style: TabsStyle = LocalTabsStyle.current,
    onDisclosureTabClicked: (Int) -> Unit,
    selectedTabOffset: () -> Float = { 0f },
    clip: TabsClip = TabsClip.None,
    stretch: Boolean = false,
    enabled: Boolean = true,
    indicatorEnabled: Boolean = style.indicatorEnabled,
    dividerEnabled: Boolean = style.dividerEnabled,
    orientation: TabsOrientation = style.orientation,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    tabs: TabScope.() -> Unit,
) {
    BaseTabs(
        selectedTabIndexProvider = selectedTabIndexProvider,
        modifier = modifier,
        style = style,
        onDisclosureTabClicked = onDisclosureTabClicked,
        selectedTabOffset = selectedTabOffset,
        clip = clip,
        stretch = stretch,
        enabled = enabled,
        indicatorEnabled = indicatorEnabled,
        dividerEnabled = dividerEnabled,
        orientation = orientation,
        interactionSource = interactionSource,
        tabs = tabs
    )
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
    BaseTabs(
        selectedTabIndexProvider = { selectedTabIndex },
        modifier = modifier,
        style = style,
        onDisclosureTabClicked = { onTabClicked(it) },
        onTabClicked = { onTabClicked(it) },
        selectedTabOffset = { 0f },
        clip = clip,
        stretch = stretch,
        enabled = enabled,
        indicatorEnabled = indicatorEnabled,
        dividerEnabled = dividerEnabled,
        orientation = orientation,
        interactionSource = interactionSource,
        tabs = tabs
    )
}
