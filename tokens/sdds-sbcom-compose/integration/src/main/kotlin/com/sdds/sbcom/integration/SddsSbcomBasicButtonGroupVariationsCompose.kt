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
import com.sdds.sbcom.styles.buttongroup.BasicButtonGroup
import com.sdds.sbcom.styles.buttongroup.Default

internal object SddsSbcomBasicButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {

    override val variations: Map<String, ComposeStyleReference<ButtonGroupStyle>> =
        mapOf(
            "BasicButtonGroup.Default" to ComposeStyleReference { BasicButtonGroup.Default.style() },
        )
}
