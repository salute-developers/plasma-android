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
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.paginationdots.ActiveTypeLine
import com.sdds.plasma.sd.service.styles.paginationdots.M
import com.sdds.plasma.sd.service.styles.paginationdots.PaginationDotsHorizontal
import com.sdds.plasma.sd.service.styles.paginationdots.PaginationDotsHorizontalActiveType
import com.sdds.plasma.sd.service.styles.paginationdots.PaginationDotsHorizontalSize
import com.sdds.plasma.sd.service.styles.paginationdots.PaginationDotsStyles
import com.sdds.plasma.sd.service.styles.paginationdots.S
import com.sdds.plasma.sd.service.styles.paginationdots.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cPaginationDotsHorizontalVariationsCompose : ComposeStyleProvider<PaginationDotsStyle>() {
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
