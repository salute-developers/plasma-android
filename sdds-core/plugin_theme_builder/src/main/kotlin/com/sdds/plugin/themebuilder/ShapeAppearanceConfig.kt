package com.sdds.plugin.themebuilder

import java.io.Serializable

/**
 * Конфиг описывает названия атрибутов для токенов форм view-фреймворка
 *
 * @property cornerFamilyAttr название атрибута cornerFamily
 * @property cornerSizeAttr название атрибута cornerSize
 */
data class ShapeAppearanceConfig(
    val cornerFamilyAttr: String,
    val cornerSizeAttr: String,
) : Serializable {

    companion object {

        /**
         * Отдает конфиг [ShapeAppearanceConfig] для библиотеки material
         */
        fun materialShape() = ShapeAppearanceConfig(
            "cornerFamily",
            "cornerSize",
        )

        /**
         * Отдает конфиг [ShapeAppearanceConfig] для библиотеки sdds-uikit
         */
        fun sddsShape() = ShapeAppearanceConfig(
            "sd_cornerFamily",
            "sd_cornerSize",
        )
    }
}
