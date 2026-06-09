// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DropZoneStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.dropzone.Default
import com.sdds.plasma.sd.service.styles.dropzone.DropZone

internal object PlasmaB2cDropZoneVariationsCompose : ComposeStyleProvider<DropZoneStyle>() {

    override val variations: Map<String, ComposeStyleReference<DropZoneStyle>> =
        mapOf(
            "DropZone.Default" to ComposeStyleReference { DropZone.Default.style() },
        )
}
