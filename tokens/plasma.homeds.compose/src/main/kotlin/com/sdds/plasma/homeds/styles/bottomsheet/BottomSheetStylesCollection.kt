// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.bottomsheet

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.ModalBottomSheetStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента BottomSheet
 */
public enum class BottomSheetStyles(
    public val key: String,
) {
    ModalBottomSheetDefault("ModalBottomSheet.Default"),
    ;

    /**
     * Typed API для подбора стиля modal-bottom-sheet
     */
    public companion object
}

/**
 * Возвращает [ModalBottomSheetStyle] для [BottomSheetStyles]
 */
@Composable
public fun BottomSheetStyles.style(
    modify: @Composable ModalBottomSheetStyleBuilder.() -> Unit =
        {},
): ModalBottomSheetStyle {
    val builder = when (this) {
        BottomSheetStyles.ModalBottomSheetDefault -> ModalBottomSheet.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [BottomSheetStyles] для modal-bottom-sheet
 */
public fun BottomSheetStyles.Companion.resolve(): BottomSheetStyles =
    BottomSheetStyles.ModalBottomSheetDefault

/**
 * Возвращает [ModalBottomSheetStyle] для modal-bottom-sheet
 */
@Composable
public fun BottomSheetStyles.Companion.style(
    modify: @Composable
    ModalBottomSheetStyleBuilder.() -> Unit = {},
): ModalBottomSheetStyle =
    resolve().style(modify)
