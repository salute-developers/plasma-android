package com.sdds.testing.vs.drawer

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.DrawerLayout
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Drawer
 * @property variant вариация
 * @property alignment начальное положение выдвижной панели
 * @property closeIconAlignment расположение кнопки закрытия
 * @property header отображение заголовка
 * @property footer отображение нижнего колонтитула
 * @property hasOverlay отображение Overlay при открытии панели
 * @property hasPeekOffset видимая часть панели
 * @property gesturesEnabled управление жестами
 * @property moveContentEnabled основной контент двигается вместе с панелью
 * @property absoluteClosePlacement размещает иконку закрытия поверх body
 * если header отсутствует
 */
@Parcelize
data class DrawerUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val alignment: DrawerLayout.DrawerPlacement = DrawerLayout.DrawerPlacement.TOP,
    val closeIconAlignment: CloseAlignment = CloseAlignment.Right,
    val header: Boolean = true,
    val footer: Boolean = true,
    val hasOverlay: Boolean = false,
    val hasPeekOffset: Boolean = false,
    val gesturesEnabled: Boolean = true,
    val moveContentEnabled: Boolean = false,
    val absoluteClosePlacement: Boolean = false,
) : UiState, Parcelable {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
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
