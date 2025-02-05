package com.sdds.testing.vs.segement

import com.sdds.serv.R
import com.sdds.testing.component

/**
 * Тест кейсы для SegmentItem
 */
fun segmentItemLDefault() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        segmentItemFactory(
            context = context,
            icon = SegmentItemIcon.Start,
            label = "Label",
            value = "",
            segmentId = 1,
            segmentStyle = R.style.Serv_Sdds_Components_Segment_L,
            isEnabled = true,
            isChecked = true,
            stretch = false,
            counter = false,
            count = "",
        )
    }
}
