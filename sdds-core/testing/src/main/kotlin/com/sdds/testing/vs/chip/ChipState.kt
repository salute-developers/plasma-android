package com.sdds.testing.vs.chip

import androidx.core.content.ContextCompat
import com.sdds.serv.R
import com.sdds.testing.component

/**
 * Тест кейсы для Chip
 */
fun chipLDefault() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        chip(
            context = context,
            label = "Label",
            drawableEnd = ContextCompat.getDrawable(context, com.sdds.icons.R.drawable.ic_close_24),
            isEnabled = true,
            isWrapped = false,
            chipStyle = R.style.Serv_Sdds_ComponentOverlays_ChipLDefault,
            chipId = 1,
        )
    }
}

/**
 * Тест кейсы для Chip
 */
fun chipMPilledSecondary() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        chip(
            context = context,
            label = "Label",
            isEnabled = true,
            isWrapped = false,
            chipStyle = R.style.Serv_Sdds_ComponentOverlays_ChipMPilledSecondary,
            chipId = 1,
        )
    }
}

/**
 * Тест кейсы для Chip
 */
fun chipSAccent() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        chip(
            context = context,
            label = "Label",
            isEnabled = true,
            isWrapped = false,
            chipStyle = R.style.Serv_Sdds_ComponentOverlays_ChipSAccent,
            chipId = 1,
        )
    }
}

/**
 * Тест кейсы для Chip
 */
fun chipXs() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        chip(
            context = context,
            label = "Label",
            drawableStart = ContextCompat.getDrawable(context, com.sdds.icons.R.drawable.ic_plasma_24),
            isEnabled = true,
            isWrapped = false,
            chipStyle = R.style.Serv_Sdds_ComponentOverlays_ChipXSDefault,
            chipId = 1,
        )
    }
}

/**
 * Тест кейсы для Chip
 */
fun chipDisabled() {
    component(R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        chip(
            context = context,
            label = "Label",
            drawableEnd = ContextCompat.getDrawable(context, com.sdds.icons.R.drawable.ic_close_24),
            isEnabled = false,
            isWrapped = false,
            chipStyle = R.style.Serv_Sdds_ComponentOverlays_ChipLDefault,
            chipId = 1,
        )
    }
}
