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
import com.sdds.serv.styles.combobox.ComboBoxSingleNormal
import com.sdds.serv.styles.combobox.ComboBoxSingleNormalSize
import com.sdds.serv.styles.combobox.ComboBoxStyles
import com.sdds.serv.styles.combobox.L
import com.sdds.serv.styles.combobox.M
import com.sdds.serv.styles.combobox.S
import com.sdds.serv.styles.combobox.Xl
import com.sdds.serv.styles.combobox.Xs
import com.sdds.serv.styles.combobox.resolve

internal object SddsServComboBoxSingleNormalVariationsCompose : ComposeStyleProvider<ComboBoxStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ComboBoxStyle>> =
        mapOf(
            "ComboBoxSingleNormal.Xl" to ComposeStyleReference { ComboBoxSingleNormal.Xl.style() },
            "ComboBoxSingleNormal.L" to ComposeStyleReference { ComboBoxSingleNormal.L.style() },
            "ComboBoxSingleNormal.M" to ComposeStyleReference { ComboBoxSingleNormal.M.style() },
            "ComboBoxSingleNormal.S" to ComposeStyleReference { ComboBoxSingleNormal.S.style() },
            "ComboBoxSingleNormal.Xs" to ComposeStyleReference { ComboBoxSingleNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ComboBoxStyles.SingleNormal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ComboBoxSingleNormalSize.Xl
                "L" -> ComboBoxSingleNormalSize.L
                "M" -> ComboBoxSingleNormalSize.M
                "S" -> ComboBoxSingleNormalSize.S
                "Xs" -> ComboBoxSingleNormalSize.Xs
                else -> ComboBoxSingleNormalSize.Xl
            },
        ).key
    }
}
