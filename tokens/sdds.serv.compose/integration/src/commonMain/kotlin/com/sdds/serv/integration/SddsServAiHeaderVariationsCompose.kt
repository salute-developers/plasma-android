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
import com.sdds.compose.uikit.ai.AiHeaderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.aiheader.AiHeader
import com.sdds.serv.styles.aiheader.AiHeaderSize
import com.sdds.serv.styles.aiheader.AiHeaderStyles
import com.sdds.serv.styles.aiheader.AiHeaderView
import com.sdds.serv.styles.aiheader.Clear
import com.sdds.serv.styles.aiheader.Default
import com.sdds.serv.styles.aiheader.H2
import com.sdds.serv.styles.aiheader.H3
import com.sdds.serv.styles.aiheader.H4
import com.sdds.serv.styles.aiheader.H5
import com.sdds.serv.styles.aiheader.L
import com.sdds.serv.styles.aiheader.M
import com.sdds.serv.styles.aiheader.S
import com.sdds.serv.styles.aiheader.Secondary
import com.sdds.serv.styles.aiheader.Xl
import com.sdds.serv.styles.aiheader.Xs
import com.sdds.serv.styles.aiheader.resolve

internal object SddsServAiHeaderVariationsCompose : ComposeStyleProvider<AiHeaderStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Xs",
                variants = listOf("Xs", "S", "M", "L", "Xl", "H5", "H4", "H3", "H2"),
            ),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Clear"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<AiHeaderStyle>> =
        mapOf(
            "AiHeader.Xs.Default" to ComposeStyleReference { AiHeader.Xs.Default.style() },
            "AiHeader.Xs.Secondary" to ComposeStyleReference { AiHeader.Xs.Secondary.style() },
            "AiHeader.Xs.Clear" to ComposeStyleReference { AiHeader.Xs.Clear.style() },
            "AiHeader.S.Default" to ComposeStyleReference { AiHeader.S.Default.style() },
            "AiHeader.S.Secondary" to ComposeStyleReference { AiHeader.S.Secondary.style() },
            "AiHeader.S.Clear" to ComposeStyleReference { AiHeader.S.Clear.style() },
            "AiHeader.M.Default" to ComposeStyleReference { AiHeader.M.Default.style() },
            "AiHeader.M.Secondary" to ComposeStyleReference { AiHeader.M.Secondary.style() },
            "AiHeader.M.Clear" to ComposeStyleReference { AiHeader.M.Clear.style() },
            "AiHeader.L.Default" to ComposeStyleReference { AiHeader.L.Default.style() },
            "AiHeader.L.Secondary" to ComposeStyleReference { AiHeader.L.Secondary.style() },
            "AiHeader.L.Clear" to ComposeStyleReference { AiHeader.L.Clear.style() },
            "AiHeader.Xl.Default" to ComposeStyleReference { AiHeader.Xl.Default.style() },
            "AiHeader.Xl.Secondary" to ComposeStyleReference { AiHeader.Xl.Secondary.style() },
            "AiHeader.Xl.Clear" to ComposeStyleReference { AiHeader.Xl.Clear.style() },
            "AiHeader.H5.Default" to ComposeStyleReference { AiHeader.H5.Default.style() },
            "AiHeader.H5.Secondary" to ComposeStyleReference { AiHeader.H5.Secondary.style() },
            "AiHeader.H5.Clear" to ComposeStyleReference { AiHeader.H5.Clear.style() },
            "AiHeader.H4.Default" to ComposeStyleReference { AiHeader.H4.Default.style() },
            "AiHeader.H4.Secondary" to ComposeStyleReference { AiHeader.H4.Secondary.style() },
            "AiHeader.H4.Clear" to ComposeStyleReference { AiHeader.H4.Clear.style() },
            "AiHeader.H3.Default" to ComposeStyleReference { AiHeader.H3.Default.style() },
            "AiHeader.H3.Secondary" to ComposeStyleReference { AiHeader.H3.Secondary.style() },
            "AiHeader.H3.Clear" to ComposeStyleReference { AiHeader.H3.Clear.style() },
            "AiHeader.H2.Default" to ComposeStyleReference { AiHeader.H2.Default.style() },
            "AiHeader.H2.Secondary" to ComposeStyleReference { AiHeader.H2.Secondary.style() },
            "AiHeader.H2.Clear" to ComposeStyleReference { AiHeader.H2.Clear.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AiHeaderStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AiHeaderSize.Xs
                "S" -> AiHeaderSize.S
                "M" -> AiHeaderSize.M
                "L" -> AiHeaderSize.L
                "Xl" -> AiHeaderSize.Xl
                "H5" -> AiHeaderSize.H5
                "H4" -> AiHeaderSize.H4
                "H3" -> AiHeaderSize.H3
                "H2" -> AiHeaderSize.H2
                else -> AiHeaderSize.Xs
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> AiHeaderView.Default
                "Secondary" -> AiHeaderView.Secondary
                "Clear" -> AiHeaderView.Clear
                else -> AiHeaderView.Default
            },
        ).key
    }
}
