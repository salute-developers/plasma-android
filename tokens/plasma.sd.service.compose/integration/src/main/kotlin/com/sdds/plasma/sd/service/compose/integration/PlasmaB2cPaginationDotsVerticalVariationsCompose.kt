// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.paginationdots.ActiveTypeLine
import com.sdds.plasma.sd.service.styles.paginationdots.M
import com.sdds.plasma.sd.service.styles.paginationdots.PaginationDotsVertical
import com.sdds.plasma.sd.service.styles.paginationdots.S

internal object PlasmaB2cPaginationDotsVerticalVariationsCompose : ComposeStyleProvider<PaginationDotsStyle>() {
    override val variations: Map<String, ComposeStyleReference<PaginationDotsStyle>> =
        mapOf(
            "M" to ComposeStyleReference { PaginationDotsVertical.M.style() },
            "M.ActiveTypeLine" to ComposeStyleReference { PaginationDotsVertical.M.ActiveTypeLine.style() },
            "S" to ComposeStyleReference { PaginationDotsVertical.S.style() },
            "S.ActiveTypeLine" to ComposeStyleReference { PaginationDotsVertical.S.ActiveTypeLine.style() },
        )
}
