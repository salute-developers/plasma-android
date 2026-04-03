package com.sdds.uikit.fixtures.stories.tabs

import android.content.Context
import android.os.Parcelable
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Tabs
import com.sdds.uikit.fixtures.UiState
import com.sdds.uikit.fixtures.stories.IconTabsUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.IconTabsUiStateTransformer
import kotlinx.parcelize.Parcelize

/**
 * Состояние IconTabs
 * @property variant вариация компонента
 * @property amount количество вкладок
 * @property enabled включен ли компонент
 * @property displayMode режим отображения вкладок
 * @property counter включена ли счетчик
 * @property count текст счетчика
 * @property actionEnabled включена ли иконка действия
 * @property dividerEnabled включен ли разделитель
 * @property indicatorEnabled включен ли индикатор
 * @property disclosureText текст элементов в Dropdown
 */
@Parcelize
@StoryUiState
data class IconTabsUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 5,
    val enabled: Boolean = true,
    val displayMode: DisplayMode = DisplayMode.SCROLL,
    val counter: Boolean = false,
    val count: String = "1",
    val actionEnabled: Boolean = false,
    val dividerEnabled: Boolean = true,
    val indicatorEnabled: Boolean = true,
    val disclosureText: String = "Item",
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * История компонента IconTabs для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации IconTabs.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.IconTabs
 */
@Story
object IconTabsStory : ViewBaseStory<IconTabsUiState, Tabs>(
    ComponentKey.IconTabs,
    IconTabsUiState(),
    IconTabsUiStatePropertiesProducer,
    IconTabsUiStateTransformer,
) {
    override fun getComponent(context: Context): Tabs {
        return iconTabs(context)
    }

    override fun onComponentUpdate(component: Tabs, state: IconTabsUiState) {
        component.applyIconsState(state)
    }
}
