package com.sdds.testing.vs.button

import androidx.core.content.ContextCompat
import com.sdds.icons.R
import com.sdds.testing.component
import com.sdds.uikit.Button

/**
 * Тест кейсы для Button
 */
fun basicButtonLDefault() {
    component(com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        basicButton(
            context = context,
            buttonStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_BasicButtonLDefault,
            label = "Label",
            value = "",
            isLoading = false,
            isEnabled = true,
            buttonId = 1,
        )
    }
}

/**
 * Тест кейсы для Button
 */
fun basicButtonMAccent() {
    component(com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        basicButton(
            context = context,
            buttonStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_BasicButtonMAccent,
            label = "Label",
            value = "",
            icon = ContextCompat.getDrawable(context, R.drawable.ic_plasma_24),
            iconPosition = Button.IconPosition.TextStart,
            isLoading = false,
            isEnabled = true,
            buttonId = 1,
        )
    }
}

/**
 * Тест кейсы для Button
 */
fun basicButtonSWarning() {
    component(com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        basicButton(
            context = context,
            buttonStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_BasicButtonSWarning,
            label = "Label",
            value = "",
            icon = ContextCompat.getDrawable(context, R.drawable.ic_plasma_24),
            iconPosition = Button.IconPosition.TextEnd,
            isLoading = false,
            isEnabled = true,
            buttonId = 1,
        )
    }
}

/**
 * Тест кейсы для Button
 */
fun basicButtonXSDark() {
    component(com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        basicButton(
            context = context,
            buttonStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_BasicButtonXsDark,
            label = "Label",
            value = "Value",
            isLoading = false,
            isEnabled = true,
            buttonId = 1,
        )
    }
}

/**
 * Тест кейсы для Button
 */
fun basicButtonIsLoading() {
    component(com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        basicButton(
            context = context,
            buttonStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_BasicButtonLDefault,
            label = "Label",
            value = "",
            isLoading = true,
            isEnabled = true,
            buttonId = 1,
        )
    }
}

/**
 * Тест кейсы для Button
 */
fun basicButtonDisabled() {
    component(com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        basicButton(
            context = context,
            buttonStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_BasicButtonLDefault,
            label = "Label",
            value = "",
            isLoading = false,
            isEnabled = false,
            buttonId = 1,
        )
    }
}

/**
 * Тест кейсы для Button
 */
fun basicButtonLStretching() {
    component(com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        basicButton(
            context = context,
            buttonStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_BasicButtonLSecondary,
            label = "Label",
            value = "",
            icon = ContextCompat.getDrawable(context, R.drawable.ic_plasma_24),
            iconPosition = Button.IconPosition.TextStart,
            isLoading = false,
            isEnabled = true,
            buttonId = 1,
            spacing = Button.Spacing.Packed,
            fixedSize = true,
        )
    }
}

/**
 * Тест кейсы для Button
 */
fun basicButtonMClearSpaceBetween() {
    component(com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        basicButton(
            context = context,
            buttonStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_BasicButtonMDefault,
            label = "Label",
            value = "Value",
            icon = ContextCompat.getDrawable(context, R.drawable.ic_plasma_24),
            iconPosition = Button.IconPosition.TextStart,
            isLoading = false,
            isEnabled = true,
            buttonId = 1,
            spacing = Button.Spacing.SpaceBetween,
            fixedSize = true,
        )
    }
}

/**
 * Тест кейсы для Button
 */
fun basicButtonLongText() {
    component(com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
        basicButton(
            context = context,
            buttonStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_BasicButtonLDefault,
            label = "LabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabel",
            value = "",
            isLoading = false,
            isEnabled = true,
            icon = ContextCompat.getDrawable(context, R.drawable.ic_plasma_24),
            iconPosition = Button.IconPosition.TextEnd,
            buttonId = 1,
        )
    }
}
