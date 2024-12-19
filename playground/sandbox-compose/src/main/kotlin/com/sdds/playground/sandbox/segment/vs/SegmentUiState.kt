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
    val stretch: Boolean = false,
    val orientation: SegmentOrientation = SegmentOrientation.HORIZONTAL,
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
    SegmentItemLDefault(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_LDefault),
    SegmentItemLSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_LSecondary),
    SegmentItemLClear(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_LClear),
    SegmentItemLDefaultPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_LDefaultPilled),
    SegmentItemLSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_LSecondaryPilled),
    SegmentItemMDefault(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_MDefault),
    SegmentItemMSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_MSecondary),
    SegmentItemMClear(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_MClear),
    SegmentItemMDefaultPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_MDefaultPilled),
    SegmentItemMSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_MSecondaryPilled),
    SegmentItemSDefault(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_SDefault),
    SegmentItemSSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_SSecondary),
    SegmentItemSClear(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_SClear),
    SegmentItemSDefaultPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_SDefaultPilled),
    SegmentItemSSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_SSecondaryPilled),
    SegmentItemXsDefault(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_XsDefault),
    SegmentItemXsSecondary(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_XsSecondary),
    SegmentItemXsClear(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_XsClear),
    SegmentItemXsDefaultPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_XsDefaultPilled),
    SegmentItemXsSecondaryPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentItem_XsSecondaryPilled),
}

@Parcelize
internal enum class SegmentVariant(@StyleRes override val styleRes: Int) : Variant {
    SegmentL(R.style.Serv_Sdds_ComponentOverlays_SegmentL),
    SegmentM(R.style.Serv_Sdds_ComponentOverlays_SegmentM),
    SegmentS(R.style.Serv_Sdds_ComponentOverlays_SegmentS),
    SegmentXs(R.style.Serv_Sdds_ComponentOverlays_SegmentXs),
    SegmentLPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentLPilled),
    SegmentMPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentMPilled),
    SegmentSPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentSPilled),
    SegmentXsPilled(R.style.Serv_Sdds_ComponentOverlays_SegmentXsPilled),
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
