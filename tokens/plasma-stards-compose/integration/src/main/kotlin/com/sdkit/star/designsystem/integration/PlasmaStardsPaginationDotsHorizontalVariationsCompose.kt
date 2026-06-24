// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.paginationdots.ActiveTypeLine
import com.sdkit.star.designsystem.styles.paginationdots.M
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsHorizontal
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsHorizontalActiveType
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsHorizontalSize
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsStyles
import com.sdkit.star.designsystem.styles.paginationdots.S
import com.sdkit.star.designsystem.styles.paginationdots.resolve

internal object PlasmaStardsPaginationDotsHorizontalVariationsCompose : ComposeStyleProvider<PaginationDotsStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S")),
            Property.SingleChoiceProperty(name = "activeType", value = "Line", variants = listOf("Line")),
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
                "Line" -> PaginationDotsHorizontalActiveType.Line
                else -> PaginationDotsHorizontalActiveType.Line
            },
        ).key
    }
}
