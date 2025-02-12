package com.sdds.testing.vs.radiobox

import com.sdds.serv.R
import com.sdds.testing.component

/**
 * Тест кейсы для RadioBox
 */
fun radioBoxM() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        radioBoxFactory(
            context = context,
            radioBoxStyle = R.style.Serv_Sdds_Components_RadioBox_M,
            label = "Label",
            description = "Description",
            isChecked = true,
            isEnabled = true,
            radioBoxId = 1,
        )
    }
}
