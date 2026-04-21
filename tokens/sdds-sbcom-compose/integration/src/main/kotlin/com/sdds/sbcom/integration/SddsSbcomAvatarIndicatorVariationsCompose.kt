// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.indicator.AvatarIndicator
import com.sdds.sbcom.styles.indicator.IndicatorAvatarIndicatorSize
import com.sdds.sbcom.styles.indicator.IndicatorStyles
import com.sdds.sbcom.styles.indicator.Size10
import com.sdds.sbcom.styles.indicator.Size12
import com.sdds.sbcom.styles.indicator.Size14
import com.sdds.sbcom.styles.indicator.Size6
import com.sdds.sbcom.styles.indicator.Size8
import com.sdds.sbcom.styles.indicator.resolve

internal object SddsSbcomAvatarIndicatorVariationsCompose : ComposeStyleProvider<IndicatorStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Size14",
                variants = listOf("Size14", "Size12", "Size10", "Size8", "Size6"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<IndicatorStyle>> =
        mapOf(
            "AvatarIndicator.Size14" to ComposeStyleReference { AvatarIndicator.Size14.style() },
            "AvatarIndicator.Size12" to ComposeStyleReference { AvatarIndicator.Size12.style() },
            "AvatarIndicator.Size10" to ComposeStyleReference { AvatarIndicator.Size10.style() },
            "AvatarIndicator.Size8" to ComposeStyleReference { AvatarIndicator.Size8.style() },
            "AvatarIndicator.Size6" to ComposeStyleReference { AvatarIndicator.Size6.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IndicatorStyles.AvatarIndicator.resolve(
            size = when (bindings["size"]?.toString()) {
                "Size14" -> IndicatorAvatarIndicatorSize.Size14
                "Size12" -> IndicatorAvatarIndicatorSize.Size12
                "Size10" -> IndicatorAvatarIndicatorSize.Size10
                "Size8" -> IndicatorAvatarIndicatorSize.Size8
                "Size6" -> IndicatorAvatarIndicatorSize.Size6
                else -> IndicatorAvatarIndicatorSize.Size14
            },
        ).key
    }
}
