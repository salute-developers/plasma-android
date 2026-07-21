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
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.indicator.AvatarIndicator
import com.sdds.serv.styles.indicator.AvatarIndicatorSize
import com.sdds.serv.styles.indicator.IndicatorStyles
import com.sdds.serv.styles.indicator.L
import com.sdds.serv.styles.indicator.M
import com.sdds.serv.styles.indicator.S
import com.sdds.serv.styles.indicator.resolve

internal object SddsServAvatarIndicatorVariationsCompose : ComposeStyleProvider<IndicatorStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<IndicatorStyle>> =
        mapOf(
            "AvatarIndicator.L" to ComposeStyleReference { AvatarIndicator.L.style() },
            "AvatarIndicator.M" to ComposeStyleReference { AvatarIndicator.M.style() },
            "AvatarIndicator.S" to ComposeStyleReference { AvatarIndicator.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IndicatorStyles.AvatarIndicator.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> AvatarIndicatorSize.L
                "M" -> AvatarIndicatorSize.M
                "S" -> AvatarIndicatorSize.S
                else -> AvatarIndicatorSize.L
            },
        ).key
    }
}
