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
import com.sdds.serv.styles.combobox.ComboBoxSingleTight
import com.sdds.serv.styles.combobox.ComboBoxSingleTightSize
import com.sdds.serv.styles.combobox.ComboBoxStyles
import com.sdds.serv.styles.combobox.L
import com.sdds.serv.styles.combobox.M
import com.sdds.serv.styles.combobox.S
import com.sdds.serv.styles.combobox.Xl
import com.sdds.serv.styles.combobox.Xs
import com.sdds.serv.styles.combobox.resolve

internal object SddsServComboBoxSingleTightVariationsCompose : ComposeStyleProvider<ComboBoxStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ComboBoxStyle>> =
        mapOf(
            "ComboBoxSingleTight.Xl" to ComposeStyleReference { ComboBoxSingleTight.Xl.style() },
            "ComboBoxSingleTight.L" to ComposeStyleReference { ComboBoxSingleTight.L.style() },
            "ComboBoxSingleTight.M" to ComposeStyleReference { ComboBoxSingleTight.M.style() },
            "ComboBoxSingleTight.S" to ComposeStyleReference { ComboBoxSingleTight.S.style() },
            "ComboBoxSingleTight.Xs" to ComposeStyleReference { ComboBoxSingleTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ComboBoxStyles.SingleTight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ComboBoxSingleTightSize.Xl
                "L" -> ComboBoxSingleTightSize.L
                "M" -> ComboBoxSingleTightSize.M
                "S" -> ComboBoxSingleTightSize.S
                "Xs" -> ComboBoxSingleTightSize.Xs
                else -> ComboBoxSingleTightSize.Xl
            },
        ).key
    }
}
