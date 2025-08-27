package com.sdds.testing.vs.drawer

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.DrawerLayout
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Drawer
 * @property variant вариация
 * @property hasOverlay отображение Overlay при открытии панели
 * @property hasClose включить отображение кнопки закрытия
 * @property closeIconPlacement расположение кнопки закрытия
 * @property alignment начальное положение выдвижной панели
 * @property gesturesEnabled управление жестами
 * @property moveContentEnabled основной контент двигается вместе с панелью
 * @property hasPeekOffset видимая часть панели
 * @property header отображение заголовка
 * @property footer отображение нижнего колонтитула
 * @property wrapContent ширина выдвижной панели по контенту
 */
@Parcelize
data class DrawerUiState(
    override val variant: String = "",
    val hasOverlay: Boolean = false,
    val hasClose: Boolean = false,
    val closeIconPlacement: CloseAlignment = CloseAlignment.Right,
    val alignment: DrawerLayout.DrawerPlacement = DrawerLayout.DrawerPlacement.LEFT,
    val gesturesEnabled: Boolean = true,
    val moveContentEnabled: Boolean = false,
    val hasPeekOffset: Boolean = false,
    val header: Boolean = true,
    val footer: Boolean = true,
    val wrapContent: Boolean = true,
) : UiState, Parcelable {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Расположение иконки закрытия
 */
@Parcelize
enum class CloseAlignment : Parcelable {

    /**
     * Иконка закрытия вначале header
     */
    Left,

    /**
     * Иконка закрытия вконце header
     */
    Right,
}
