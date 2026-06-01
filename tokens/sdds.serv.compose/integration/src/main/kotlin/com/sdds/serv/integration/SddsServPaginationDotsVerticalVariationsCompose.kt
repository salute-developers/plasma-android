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
import com.sdds.serv.styles.paginationdots.PaginationDotsStyles
import com.sdds.serv.styles.paginationdots.PaginationDotsVertical
import com.sdds.serv.styles.paginationdots.PaginationDotsVerticalActiveType
import com.sdds.serv.styles.paginationdots.PaginationDotsVerticalSize
import com.sdds.serv.styles.paginationdots.S
import com.sdds.serv.styles.paginationdots.resolve

internal object SddsServPaginationDotsVerticalVariationsCompose : ComposeStyleProvider<PaginationDotsStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S")),
            Property.SingleChoiceProperty(name = "activeType", value = "Default", variants = listOf("Default", "Line")),
        )

    override val variations: Map<String, ComposeStyleReference<PaginationDotsStyle>> =
        mapOf(
            "PaginationDotsVertical.M" to ComposeStyleReference { PaginationDotsVertical.M.style() },
            "PaginationDotsVertical.M.ActiveTypeLine" to ComposeStyleReference { PaginationDotsVertical.M.ActiveTypeLine.style() },
            "PaginationDotsVertical.S" to ComposeStyleReference { PaginationDotsVertical.S.style() },
            "PaginationDotsVertical.S.ActiveTypeLine" to ComposeStyleReference { PaginationDotsVertical.S.ActiveTypeLine.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return PaginationDotsStyles.Vertical.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> PaginationDotsVerticalSize.M
                "S" -> PaginationDotsVerticalSize.S
                else -> PaginationDotsVerticalSize.M
            },
            activeType = when (bindings["activeType"]?.toString()) {
                "Default" -> PaginationDotsVerticalActiveType.Default
                "Line" -> PaginationDotsVerticalActiveType.Line
                else -> PaginationDotsVerticalActiveType.Default
            },
        ).key
    }
}
