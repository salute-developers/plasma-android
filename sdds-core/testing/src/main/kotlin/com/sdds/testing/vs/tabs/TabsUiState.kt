package com.sdds.testing.vs.tabs

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.Tabs
import kotlinx.parcelize.Parcelize

/**
 * Состояние Tabs
 * @property variant вариация компонента
 * @property amount количество вкладок
 * @property icon положение и ресурс иконки [TabItemIcon]
 * @property tabItemLabel подпись
 * @property tabItemValue значени
 * @property enabled включен ли компонент
 * @property displayMode режим отображения вкладок
 * @property counter включена ли счетчик
 * @property count текст счетчика
 * @property actionEnabled включена ли иконка действия
 * @property dividerEnabled включен ли разделитель
 * @property indicatorEnabled включен ли индикатор
 */
@Parcelize
data class TabsUiState(
    override val variant: String = "",
    val amount: Int = 5,
    val icon: TabItemIcon = TabItemIcon.No,
    val tabItemLabel: String = "Label",
    val tabItemValue: String? = null,
    val enabled: Boolean = true,
    val displayMode: DisplayMode = DisplayMode.SCROLL,
    val counter: Boolean = false,
    val count: String = "1",
    val actionEnabled: Boolean = false,
    val dividerEnabled: Boolean = true,
    val indicatorEnabled: Boolean = true,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Режим отображения вкладок
 * @property mode числовой код режима
 *
 * Возможные значения:
 * - [SCROLL] – вкладки прокручиваются горизонтально.
 * - [STRETCH] – вкладки растягиваются, занимая всю доступную ширину.
 * - [IF_ROOM] – вкладки отображаются только если хватает места, иначе переходят в dropdown меню.
 */
@Parcelize
enum class DisplayMode(val mode: Int) : Parcelable {
    SCROLL(Tabs.DISPLAY_MODE_SCROLL),
    STRETCH(Tabs.DISPLAY_MODE_STRETCH),
    IF_ROOM(Tabs.DISPLAY_MODE_IF_ROOM),
}

/**
 * Иконка
 * @property iconId идентификатор ресурса кнопки
 */
@Parcelize
sealed class TabItemIcon(val iconId: Int = com.sdds.icons.R.drawable.ic_plasma_24) :
    Parcelable {

    /**
     * Иконка вначале
     */
    object Start : TabItemIcon()

    /**
     * Иконка вконце
     */
    object End : TabItemIcon()

    /**
     * Отсутствие иконки
     */
    object No : TabItemIcon(0)
}
