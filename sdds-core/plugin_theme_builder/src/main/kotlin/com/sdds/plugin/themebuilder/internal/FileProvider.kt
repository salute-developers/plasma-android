package com.sdds.plugin.themebuilder.internal

import java.io.File

/**
 *
 * @author Малышев Александр on 07.03.2024
 */
object FileProvider {

    fun File.valueDir(qualifier: String = ""): File {
        val valueDirName = if (qualifier.isNotBlank()) {
            "values-$qualifier"
        } else {
            "values"
        }
        val valueDir = File("${this.path}/$valueDirName")
        if (!valueDir.exists()) valueDir.mkdirs()
        return valueDir
    }

    fun File.colorsXmlFile(): File =
        File("${valueDir().path}/colors.xml")

    fun File.gradientsXmlFile(): File =
        File("${valueDir().path}/gradients.xml")

    fun File.dimensFile(): File =
        File("${valueDir().path}/dimens.xml")

    fun File.textAppearancesXmlFile(
        qualifier: String = ""
    ): File = File("${valueDir(qualifier).path}/text-appearances.xml")

    fun File.typographyXmlFile(
        qualifier: String = ""
    ): File = File("${valueDir(qualifier).path}/typography.xml")
}