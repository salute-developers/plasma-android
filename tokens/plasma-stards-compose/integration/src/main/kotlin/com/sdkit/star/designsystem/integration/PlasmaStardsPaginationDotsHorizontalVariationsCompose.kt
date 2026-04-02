// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.paginationdots.ActiveTypeLine
import com.sdkit.star.designsystem.styles.paginationdots.M
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsHorizontal
import com.sdkit.star.designsystem.styles.paginationdots.S

internal object PlasmaStardsPaginationDotsHorizontalVariationsCompose : ComposeStyleProvider<PaginationDotsStyle>() {
    override val variations: Map<String, ComposeStyleReference<PaginationDotsStyle>> =
        mapOf(
            "M" to ComposeStyleReference { PaginationDotsHorizontal.M.style() },
            "M.ActiveTypeLine" to ComposeStyleReference { PaginationDotsHorizontal.M.ActiveTypeLine.style() },
            "S" to ComposeStyleReference { PaginationDotsHorizontal.S.style() },
            "S.ActiveTypeLine" to ComposeStyleReference { PaginationDotsHorizontal.S.ActiveTypeLine.style() },
        )
}
