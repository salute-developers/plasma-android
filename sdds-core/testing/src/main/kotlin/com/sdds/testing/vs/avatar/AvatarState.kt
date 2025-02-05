package com.sdds.testing.vs.avatar

import com.sdds.serv.R
import com.sdds.testing.component
import com.sdds.uikit.Avatar

/**
 * Тест кейс для Avatar
 */
fun avatarXxl() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        avatarFactory(
            context = context,
            avatarStyle = R.style.Serv_Sdds_ComponentOverlays_AvatarXXL,
            fullName = "Michael Scott",
            actionEnabled = false,
            imageMode = ImageMode.Local,
            status = Avatar.Status.ACTIVE,
            avatarId = 1,
        )
    }
}

/**
 * Тест кейс для Avatar
 */
fun avatarM() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        avatarFactory(
            context = context,
            avatarStyle = R.style.Serv_Sdds_ComponentOverlays_AvatarM,
            fullName = "Michael Scott",
            actionEnabled = false,
            imageMode = ImageMode.Placeholder,
            status = Avatar.Status.ACTIVE,
            avatarId = 1,
        )
    }
}
