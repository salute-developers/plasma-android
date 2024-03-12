package com.sdds.plugin.themebuilder.internal.utils

import java.io.File

/**
 * Провайдер имен файлов для токенов
 * @author Малышев Александр on 07.03.2024
 */
object FileProvider {

    /**
     * Директория values с указанным квалификатором [qualifier]
     */
    fun File.valuesDir(qualifier: String = ""): File {
        val valueDirName = if (qualifier.isNotBlank()) {
            "values-$qualifier"
        } else {
            "values"
        }
        val valueDir = File("${this.path}/$valueDirName")
        if (!valueDir.exists()) valueDir.mkdirs()
        return valueDir
    }

    /**
     * XML файл для токенов цвета
     */
    fun File.colorsXmlFile(): File =
        File("${valuesDir().path}/colors.xml")

    /**
     * XML файл для токенов градиента
     */
    fun File.gradientsXmlFile(): File =
        File("${valuesDir().path}/gradients.xml")

    /**
     * XML файл для размеров
     */
    fun File.dimensFile(): File =
        File("${valuesDir().path}/dimens.xml")

    /**
     * XML файл для токенов стилей текста
     */
    fun File.textAppearancesXmlFile(
        qualifier: String = "",
    ): File = File("${valuesDir(qualifier).path}/text-appearances.xml")

    /**
     * XML файл для токенов типографии
     */
    fun File.typographyXmlFile(
        qualifier: String = "",
    ): File = File("${valuesDir(qualifier).path}/typography.xml")
}
