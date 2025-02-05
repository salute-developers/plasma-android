package com.sdds.testing.vs.switcher

import com.sdds.serv.R
import com.sdds.testing.component

/**
 * Тест кейс для Switch
 */
fun switchM() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        switchFactory(
            context = context,
            switchStyle = R.style.Serv_Sdds_Components_Switch_M,
            label = "Label",
            description = "Description",
            isChecked = true,
            isEnabled = true,
            switchId = 1,
        )
    }
}
