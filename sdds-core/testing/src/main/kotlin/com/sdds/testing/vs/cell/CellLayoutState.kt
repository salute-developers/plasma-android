package com.sdds.testing.vs.cell

import android.view.Gravity
import com.sdds.serv.R
import com.sdds.testing.R
import com.sdds.testing.component

/**
 * Тест кейсы для CellLayout
 */
fun cellLayoutL() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        cellLayoutFactory(
            context = context,
            cellStyle = R.style.Serv_Sdds_ComponentOverlays_CellL,
            label = "Label",
            gravity = Gravity.START,
            title = "Title",
            subtitle = "subtitle",
            disclosureText = "",
            isEnabled = true,
            startContent = CellContent.AVATAR,
            endContent = CellContent.ICON,
            hasDisclosure = true,
            cellId = 1,
        )
    }
}
