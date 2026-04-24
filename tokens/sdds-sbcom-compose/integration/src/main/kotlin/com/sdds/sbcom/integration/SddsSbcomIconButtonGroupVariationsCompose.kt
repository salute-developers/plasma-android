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
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.buttongroup.Default
import com.sdds.sbcom.styles.buttongroup.IconButtonGroup

internal object SddsSbcomIconButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {

    override val variations: Map<String, ComposeStyleReference<ButtonGroupStyle>> =
        mapOf(
            "IconButtonGroup.Default" to ComposeStyleReference { IconButtonGroup.Default.style() },
        )
}
