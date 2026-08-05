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
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.paginationdots.ActiveTypeLine
import com.sdds.serv.styles.paginationdots.M
import com.sdds.serv.styles.paginationdots.PaginationDotsHorizontal
import com.sdds.serv.styles.paginationdots.PaginationDotsHorizontalActiveType
import com.sdds.serv.styles.paginationdots.PaginationDotsHorizontalSize
import com.sdds.serv.styles.paginationdots.PaginationDotsStyles
import com.sdds.serv.styles.paginationdots.S
import com.sdds.serv.styles.paginationdots.resolve

internal object SddsServPaginationDotsHorizontalVariationsCompose : ComposeStyleProvider<PaginationDotsStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S")),
            Property.SingleChoiceProperty(name = "activeType", value = "Default", variants = listOf("Default", "Line")),
        )

    override val variations: Map<String, ComposeStyleReference<PaginationDotsStyle>> =
        mapOf(
            "PaginationDotsHorizontal.M" to ComposeStyleReference { PaginationDotsHorizontal.M.style() },
            "PaginationDotsHorizontal.M.ActiveTypeLine" to ComposeStyleReference {
                PaginationDotsHorizontal.M.ActiveTypeLine.style()
            },
            "PaginationDotsHorizontal.S" to ComposeStyleReference { PaginationDotsHorizontal.S.style() },
            "PaginationDotsHorizontal.S.ActiveTypeLine" to ComposeStyleReference {
                PaginationDotsHorizontal.S.ActiveTypeLine.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return PaginationDotsStyles.Horizontal.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> PaginationDotsHorizontalSize.M
                "S" -> PaginationDotsHorizontalSize.S
                else -> PaginationDotsHorizontalSize.M
            },
            activeType = when (bindings["activeType"]?.toString()) {
                "Default" -> PaginationDotsHorizontalActiveType.Default
                "Line" -> PaginationDotsHorizontalActiveType.Line
                else -> PaginationDotsHorizontalActiveType.Default
            },
        ).key
    }
}
