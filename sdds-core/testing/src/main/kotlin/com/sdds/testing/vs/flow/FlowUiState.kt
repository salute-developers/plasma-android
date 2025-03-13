package com.sdds.testing.vs.flow

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.FlowLayout
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Flow
 * @property variant вариация компонента
 * @property arrangement расположение элементов
 * @property alignment выравнивание элементов
 * @property orientation ориентация
 * @property itemsPerLine кол-во элементов в строке/столбце
 * @author Малышев Александр on 13.08.2025
 */
@Parcelize
data class FlowUiState(
    override val variant: String = "",
    val arrangement: FlowArrangement = FlowArrangement.START,
    val alignment: FlowAlignment = FlowAlignment.START,
    val orientation: FlowOrientation = FlowOrientation.HORIZONTAL,
    val itemsPerLine: Int = 2,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Тип расположения дочерних элементов компонента FlowLayout
 */
@Parcelize
enum class FlowArrangement : Parcelable {
    START,
    CENTER,
    END,
    SPACE_BETWEEN,
    SPACE_AROUND,
}

/**
 * Преобразует [FlowArrangement] в [FlowLayout.arrangement]
 */
fun FlowArrangement.toArrangement(): Int = when (this) {
    FlowArrangement.START -> FlowLayout.ARRANGEMENT_START
    FlowArrangement.CENTER -> FlowLayout.ARRANGEMENT_CENTER
    FlowArrangement.END -> FlowLayout.ARRANGEMENT_END
    FlowArrangement.SPACE_BETWEEN -> FlowLayout.ARRANGEMENT_SPACE_BETWEEN
    FlowArrangement.SPACE_AROUND -> FlowLayout.ARRANGEMENT_SPACE_AROUND
}

/**
 * Тип выравнивания дочерних элементов компонента FlowLayout
 */
@Parcelize
enum class FlowAlignment : Parcelable {
    START,
    CENTER,
    END,
}

/**
 * Преобразует [FlowAlignment] в [FlowLayout.alignment]
 */
fun FlowAlignment.toAlignment(): Int = when (this) {
    FlowAlignment.START -> FlowLayout.ALIGNMENT_START
    FlowAlignment.CENTER -> FlowLayout.ALIGNMENT_CENTER
    FlowAlignment.END -> FlowLayout.ALIGNMENT_END
}

/**
 * Тип ориентации компонента FlowLayout
 */
@Parcelize
enum class FlowOrientation : Parcelable {
    HORIZONTAL,
    VERTICAL,
}

/**
 * Преобразует [FlowOrientation] в [FlowLayout.orientation]
 */
fun FlowOrientation.toOrientation(): Int = when (this) {
    FlowOrientation.HORIZONTAL -> FlowLayout.ORIENTATION_HORIZONTAL
    FlowOrientation.VERTICAL -> FlowLayout.ORIENTATION_VERTICAL
}
