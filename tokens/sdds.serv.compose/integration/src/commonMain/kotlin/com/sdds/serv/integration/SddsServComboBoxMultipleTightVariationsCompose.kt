// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ComboBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.combobox.ComboBoxMultipleTight
import com.sdds.serv.styles.combobox.ComboBoxMultipleTightSize
import com.sdds.serv.styles.combobox.ComboBoxStyles
import com.sdds.serv.styles.combobox.L
import com.sdds.serv.styles.combobox.M
import com.sdds.serv.styles.combobox.S
import com.sdds.serv.styles.combobox.Xl
import com.sdds.serv.styles.combobox.Xs
import com.sdds.serv.styles.combobox.resolve

internal object SddsServComboBoxMultipleTightVariationsCompose : ComposeStyleProvider<ComboBoxStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ComboBoxStyle>> =
        mapOf(
            "ComboBoxMultipleTight.Xl" to ComposeStyleReference { ComboBoxMultipleTight.Xl.style() },
            "ComboBoxMultipleTight.L" to ComposeStyleReference { ComboBoxMultipleTight.L.style() },
            "ComboBoxMultipleTight.M" to ComposeStyleReference { ComboBoxMultipleTight.M.style() },
            "ComboBoxMultipleTight.S" to ComposeStyleReference { ComboBoxMultipleTight.S.style() },
            "ComboBoxMultipleTight.Xs" to ComposeStyleReference { ComboBoxMultipleTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ComboBoxStyles.MultipleTight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ComboBoxMultipleTightSize.Xl
                "L" -> ComboBoxMultipleTightSize.L
                "M" -> ComboBoxMultipleTightSize.M
                "S" -> ComboBoxMultipleTightSize.S
                "Xs" -> ComboBoxMultipleTightSize.Xs
                else -> ComboBoxMultipleTightSize.Xl
            },
        ).key
    }
}
