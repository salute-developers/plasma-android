package com.sdds.testing.vs.navigationdrawer

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.NavigationDrawer
import kotlinx.parcelize.Parcelize

/**
 * Состояние NavigationDrawer
 * @property variant вариация компонента
 * @property amount количество элементов в NavigationDrawer
 * @property itemLabel подпись
 * @property mode включен ли компонент
 * @property counterEnabled включена ли счетчик
 * @property counterText текст счетчика
 * @property hasHeader включен ли header
 * @property hasFooter включен ли footer
 */
@Parcelize
data class NavigationDrawerUiState(
    override val variant: String = "",
    val amount: Int = 5,
    val itemLabel: String = "Label",
    val counterEnabled: Boolean = false,
    val counterText: String = "1",
    val mode: NavigationDrawerMode = NavigationDrawerMode.AUTO,
    val hasHeader: Boolean = false,
    val hasFooter: Boolean = false,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Режим отображения NavigationDrawer
 * @property value значение [NavigationDrawer.mode]
 */
enum class NavigationDrawerMode(val value: Int) {
    AUTO(NavigationDrawer.MODE_AUTO),
    EXPANDED(NavigationDrawer.MODE_EXPANDED),
    COLLAPSED(NavigationDrawer.MODE_COLLAPSED),
}
