package com.sdds.testing.vs.segement

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.Segment
import kotlinx.parcelize.Parcelize

/**
 * Состояние Segment и SegmentItem
 * @property variant вариация компонента
 * @property amount количество SegmentItem в Segment
 * @property icon положение и ресурс иконки [SegmentItemIcon]
 * @property segmentItemLabel подпись
 * @property segmentItemValue значени
 * @property enabled включен ли компонент
 * @property checked выбран ли компонент
 * @property stretch включен ли режим stretch компонента
 * @property orientation ориентация компонента
 * @property counter включена ли счетчик
 * @property count текст счетчика
 */
@Parcelize
data class SegmentUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 2,
    val icon: SegmentItemIcon = SegmentItemIcon.No,
    val segmentItemLabel: String = "Label",
    val segmentItemValue: String? = null,
    val enabled: Boolean = true,
    val checked: Boolean = false,
    val stretch: Boolean = false,
    val orientation: SegmentOrientation = SegmentOrientation.HORIZONTAL,
    val counter: Boolean = false,
    val count: String = "1",
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Иконка
 * @property iconId идентификатор ресурса кнопки
 */
@Parcelize
sealed class SegmentItemIcon(val iconId: Int = com.sdds.icons.R.drawable.ic_plasma_24) :
    Parcelable {

    /**
     * Иконка вначале
     */
    object Start : SegmentItemIcon()

    /**
     * Иконка вконце
     */
    object End : SegmentItemIcon()

    /**
     * Отсутствие иконки
     */
    object No : SegmentItemIcon(0)
}

/**
 * Ориентация компонента Segment
 * @property orientationState значение ориентации
 */
@Parcelize
enum class SegmentOrientation(val orientationState: Int) : Parcelable {
    HORIZONTAL(Segment.HORIZONTAL),
    VERTICAL(Segment.VERTICAL),
}
