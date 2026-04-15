// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.modal.Default
import com.sdkit.star.designsystem.styles.modal.Modal

internal object PlasmaStardsModalVariationsCompose : ComposeStyleProvider<ModalStyle>() {
    override val variations: Map<String, ComposeStyleReference<ModalStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Modal.Default.style() },
        )
}
