package com.sdds.playground.sandbox.segment.vs

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.serv.R
import com.sdds.uikit.Segment
import kotlinx.parcelize.Parcelize

@Parcelize
internal data class SegmentUiState(
    val variant: Variant,
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
) : Parcelable

/**
 * Стили для SegmentItem и Segment
 * @property styleRes ресурс стиля
 */
@Parcelize
internal sealed interface Variant : Parcelable {

    /**
     * Ресурс стиля
     */
    @get:StyleRes
    val styleRes: Int
}

@Parcelize
internal enum class SegmentItemVariant(@StyleRes override val styleRes: Int) : Variant {
    SegmentItemLPrimary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_LPrimary),
    SegmentItemLSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_LSecondary),
    SegmentItemLDefault(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_LDefault),
    SegmentItemLPrimaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_LPrimaryPilled),
    SegmentItemLSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_LSecondaryPilled),
    SegmentItemMPrimary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_MPrimary),
    SegmentItemMSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_MSecondary),
    SegmentItemMDefault(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_MDefault),
    SegmentItemMPrimaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_MPrimaryPilled),
    SegmentItemMSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_MSecondaryPilled),
    SegmentItemSPrimary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_SPrimary),
    SegmentItemSSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_SSecondary),
    SegmentItemSDefault(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_SDefault),
    SegmentItemSPrimaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_SPrimaryPilled),
    SegmentItemSSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_SSecondaryPilled),
    SegmentItemXsPrimary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_XsPrimary),
    SegmentItemXsSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_XsSecondary),
    SegmentItemXsDefault(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_XsDefault),
    SegmentItemXsPrimaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_XsPrimaryPilled),
    SegmentItemXsSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_XsSecondaryPilled),
}

@Parcelize
internal enum class SegmentVariant(@StyleRes override val styleRes: Int) : Variant {
    SegmentLPrimary(R.style.Serv_Sdds_ComponentOverlays_SegmentLPrimary),
    SegmentMPrimary(R.style.Serv_Sdds_ComponentOverlays_SegmentMPrimary),
    SegmentSPrimary(R.style.Serv_Sdds_ComponentOverlays_SegmentSPrimary),
    SegmentXsPrimary(R.style.Serv_Sdds_ComponentOverlays_SegmentXsPrimary),
    SegmentLPrimaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentLPrimaryPilled),
    SegmentMPrimaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentMPrimaryPilled),
    SegmentSPrimaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentSPrimaryPilled),
    SegmentXsPrimaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentXsPrimaryPilled),

    SegmentLSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentLSecondary),
    SegmentMSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentMSecondary),
    SegmentSSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentSSecondary),
    SegmentXsSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentXsSecondary),
    SegmentLSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentLSecondary),
    SegmentMSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentMSecondaryPilled),
    SegmentSSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentSSecondaryPilled),
    SegmentXsSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentXsSecondaryPilled),
}

/**
 * Иконка
 */
@Parcelize
internal sealed class SegmentItemIcon(val iconId: Int = com.sdds.icons.R.drawable.ic_plasma_24) :
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

@Parcelize
internal enum class SegmentOrientation(val orientationState: Int) : Parcelable {
    HORIZONTAL(Segment.HORIZONTAL),
    VERTICAL(Segment.VERTICAL),
}
