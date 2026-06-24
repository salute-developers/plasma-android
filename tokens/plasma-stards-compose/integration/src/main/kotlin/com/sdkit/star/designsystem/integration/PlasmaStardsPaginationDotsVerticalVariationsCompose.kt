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
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsStyles
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsVertical
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsVerticalActiveType
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsVerticalSize
import com.sdkit.star.designsystem.styles.paginationdots.S
import com.sdkit.star.designsystem.styles.paginationdots.resolve

internal object PlasmaStardsPaginationDotsVerticalVariationsCompose : ComposeStyleProvider<PaginationDotsStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S")),
            Property.SingleChoiceProperty(name = "activeType", value = "Line", variants = listOf("Line")),
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
                "Line" -> PaginationDotsVerticalActiveType.Line
                else -> PaginationDotsVerticalActiveType.Line
            },
        ).key
    }
}
