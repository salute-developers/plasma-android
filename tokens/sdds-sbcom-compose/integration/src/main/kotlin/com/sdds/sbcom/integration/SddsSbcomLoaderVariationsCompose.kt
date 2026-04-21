// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.loader.Loader
import com.sdds.sbcom.styles.loader.LoaderModeColor
import com.sdds.sbcom.styles.loader.LoaderSize
import com.sdds.sbcom.styles.loader.LoaderStyles
import com.sdds.sbcom.styles.loader.ModeColorAccent
import com.sdds.sbcom.styles.loader.ModeColorDanger
import com.sdds.sbcom.styles.loader.ModeColorGlobalWhite
import com.sdds.sbcom.styles.loader.ModeColorPrimary
import com.sdds.sbcom.styles.loader.ModeColorSecondary
import com.sdds.sbcom.styles.loader.Size16
import com.sdds.sbcom.styles.loader.Size24
import com.sdds.sbcom.styles.loader.Size32
import com.sdds.sbcom.styles.loader.Size40
import com.sdds.sbcom.styles.loader.resolve

internal object SddsSbcomLoaderVariationsCompose : ComposeStyleProvider<LoaderStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Size40", variants = listOf("Size40", "Size32", "Size24", "Size16")),
            Property.SingleChoiceProperty(name = "modeColor", value = "Primary", variants = listOf("Primary", "Secondary", "GlobalWhite", "Accent", "Danger")),
        )

    override val variations: Map<String, ComposeStyleReference<LoaderStyle>> =
        mapOf(
            "Loader.Size40.ModeColorPrimary" to ComposeStyleReference { Loader.Size40.ModeColorPrimary.style() },
            "Loader.Size40.ModeColorSecondary" to ComposeStyleReference { Loader.Size40.ModeColorSecondary.style() },
            "Loader.Size40.ModeColorGlobalWhite" to ComposeStyleReference { Loader.Size40.ModeColorGlobalWhite.style() },
            "Loader.Size40.ModeColorAccent" to ComposeStyleReference { Loader.Size40.ModeColorAccent.style() },
            "Loader.Size40.ModeColorDanger" to ComposeStyleReference { Loader.Size40.ModeColorDanger.style() },
            "Loader.Size32.ModeColorPrimary" to ComposeStyleReference { Loader.Size32.ModeColorPrimary.style() },
            "Loader.Size32.ModeColorSecondary" to ComposeStyleReference { Loader.Size32.ModeColorSecondary.style() },
            "Loader.Size32.ModeColorGlobalWhite" to ComposeStyleReference { Loader.Size32.ModeColorGlobalWhite.style() },
            "Loader.Size32.ModeColorAccent" to ComposeStyleReference { Loader.Size32.ModeColorAccent.style() },
            "Loader.Size32.ModeColorDanger" to ComposeStyleReference { Loader.Size32.ModeColorDanger.style() },
            "Loader.Size24.ModeColorPrimary" to ComposeStyleReference { Loader.Size24.ModeColorPrimary.style() },
            "Loader.Size24.ModeColorSecondary" to ComposeStyleReference { Loader.Size24.ModeColorSecondary.style() },
            "Loader.Size24.ModeColorGlobalWhite" to ComposeStyleReference { Loader.Size24.ModeColorGlobalWhite.style() },
            "Loader.Size24.ModeColorAccent" to ComposeStyleReference { Loader.Size24.ModeColorAccent.style() },
            "Loader.Size24.ModeColorDanger" to ComposeStyleReference { Loader.Size24.ModeColorDanger.style() },
            "Loader.Size16.ModeColorPrimary" to ComposeStyleReference { Loader.Size16.ModeColorPrimary.style() },
            "Loader.Size16.ModeColorSecondary" to ComposeStyleReference { Loader.Size16.ModeColorSecondary.style() },
            "Loader.Size16.ModeColorGlobalWhite" to ComposeStyleReference { Loader.Size16.ModeColorGlobalWhite.style() },
            "Loader.Size16.ModeColorAccent" to ComposeStyleReference { Loader.Size16.ModeColorAccent.style() },
            "Loader.Size16.ModeColorDanger" to ComposeStyleReference { Loader.Size16.ModeColorDanger.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return LoaderStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Size40" -> LoaderSize.Size40
                "Size32" -> LoaderSize.Size32
                "Size24" -> LoaderSize.Size24
                "Size16" -> LoaderSize.Size16
                else -> LoaderSize.Size40
            },
            modeColor = when (bindings["modeColor"]?.toString()) {
                "Primary" -> LoaderModeColor.Primary
                "Secondary" -> LoaderModeColor.Secondary
                "GlobalWhite" -> LoaderModeColor.GlobalWhite
                "Accent" -> LoaderModeColor.Accent
                "Danger" -> LoaderModeColor.Danger
                else -> LoaderModeColor.Primary
            },
        ).key
    }
}
