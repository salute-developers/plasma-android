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
import com.sdds.serv.styles.combobox.ComboBoxMultipleNormal
import com.sdds.serv.styles.combobox.ComboBoxMultipleNormalSize
import com.sdds.serv.styles.combobox.ComboBoxStyles
import com.sdds.serv.styles.combobox.L
import com.sdds.serv.styles.combobox.M
import com.sdds.serv.styles.combobox.S
import com.sdds.serv.styles.combobox.Xl
import com.sdds.serv.styles.combobox.Xs
import com.sdds.serv.styles.combobox.resolve

internal object SddsServComboBoxMultipleNormalVariationsCompose : ComposeStyleProvider<ComboBoxStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ComboBoxStyle>> =
        mapOf(
            "ComboBoxMultipleNormal.Xl" to ComposeStyleReference { ComboBoxMultipleNormal.Xl.style() },
            "ComboBoxMultipleNormal.L" to ComposeStyleReference { ComboBoxMultipleNormal.L.style() },
            "ComboBoxMultipleNormal.M" to ComposeStyleReference { ComboBoxMultipleNormal.M.style() },
            "ComboBoxMultipleNormal.S" to ComposeStyleReference { ComboBoxMultipleNormal.S.style() },
            "ComboBoxMultipleNormal.Xs" to ComposeStyleReference { ComboBoxMultipleNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ComboBoxStyles.MultipleNormal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ComboBoxMultipleNormalSize.Xl
                "L" -> ComboBoxMultipleNormalSize.L
                "M" -> ComboBoxMultipleNormalSize.M
                "S" -> ComboBoxMultipleNormalSize.S
                "Xs" -> ComboBoxMultipleNormalSize.Xs
                else -> ComboBoxMultipleNormalSize.Xl
            },
        ).key
    }
}
