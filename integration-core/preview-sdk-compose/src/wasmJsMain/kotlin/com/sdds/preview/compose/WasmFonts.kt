package com.sdds.preview.compose

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

/** Создаёт byte-backed Compose font для Wasm/Skiko. */
public fun createWasmFontFamily(faces: List<LoadedFontFace>): FontFamily {
    require(faces.isNotEmpty()) { "FontFamily требует хотя бы одно начертание" }
    return FontFamily(
        faces.map { face ->
            androidx.compose.ui.text.platform.Font(
                identity = face.identity,
                data = face.bytes,
                weight = FontWeight(face.weight),
                style = if (face.italic) FontStyle.Italic else FontStyle.Normal,
            )
        },
    )
}

/** Wasm/Skiko factory для byte-backed fonts. */
public val WasmLoadedFontFamilyFactory: LoadedFontFamilyFactory =
    LoadedFontFamilyFactory(::createWasmFontFamily)
