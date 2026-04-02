// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.paginationdots.ActiveTypeLine
import com.sdds.serv.styles.paginationdots.M
import com.sdds.serv.styles.paginationdots.PaginationDotsVertical
import com.sdds.serv.styles.paginationdots.S

internal object SddsServPaginationDotsVerticalVariationsCompose : ComposeStyleProvider<PaginationDotsStyle>() {
    override val variations: Map<String, ComposeStyleReference<PaginationDotsStyle>> =
        mapOf(
            "M" to ComposeStyleReference { PaginationDotsVertical.M.style() },
            "M.ActiveTypeLine" to ComposeStyleReference { PaginationDotsVertical.M.ActiveTypeLine.style() },
            "S" to ComposeStyleReference { PaginationDotsVertical.S.style() },
            "S.ActiveTypeLine" to ComposeStyleReference { PaginationDotsVertical.S.ActiveTypeLine.style() },
        )
}
