package com.sdds.testing.vs.cell

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.Gravity
import com.sdds.uikit.CellLayout

/**
 * Фабрика для создания ячейки
 */
fun cellLayoutFactory(
    context: Context,
    gravity: Int = Gravity.START,
    label: String = "Label",
    title: String = "Title",
    subtitle: String = "Subtitle",
    isEnabled: Boolean = true,
    cellStyle: Int = 0,
    startContent: CellContent? = null,
    endContent: CellContent? = null,
    disclosureText: String = "",
    hasDisclosure: Boolean = true,
    cellId: Int = 0,
): CellLayout {
    return CellLayout(ContextThemeWrapper(context, cellStyle)).apply {
        this.gravity = gravity
        this.isEnabled = isEnabled
        this.disclosureText = disclosureText
        this.id = cellId
        populate(
            label,
            title,
            subtitle,
            startContent,
            endContent,
            isEnabled,
            cellStyle,
            disclosureText,
            hasDisclosure,
        )
    }
}

/**
 * Создание ячейки
 */
private fun CellLayout.populate(
    label: String = "Label",
    title: String = "Title",
    subtitle: String = "Subtittle",
    startContent: CellContent? = null,
    endContent: CellContent? = null,
    isEnabled: Boolean = true,
    cellStyle: Int = 0,
    disclosureText: String = "text",
    hasDisclosure: Boolean = true,
) {
    addView(
        cellLayoutFactory(
            context = context,
            label = label,
            title = title,
            subtitle = subtitle,
            isEnabled = isEnabled,
            cellStyle = cellStyle,
            startContent = CellContent.AVATAR,
            endContent = CellContent.ICON,
            disclosureText = disclosureText,
            hasDisclosure = hasDisclosure,
        ),
    )
}

/**
 * Содержимое ячейки
 */
enum class CellContent {
    NONE,
    AVATAR,
    ICON,
    SWITCH,
    CHECKBOX,
    RADIOBOX,
}
