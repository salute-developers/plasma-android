package com.sdds.plugin.themebuilder.internal.utils

import java.io.File
import java.io.FileWriter
import java.io.Writer
import java.util.Locale

/**
 * Провайдер имен файлов для токенов
 * @author Малышев Александр on 07.03.2024
 */
object FileProvider {

    /**
     * Директория values с указанным квалификатором [qualifier]
     */
    private fun File.valuesDir(qualifier: String = ""): File {
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
     * Директория colors с указанным квалификатором [qualifier]
     */
    private fun File.colorsDir(qualifier: String = ""): File {
        val valueDirName = if (qualifier.isNotBlank()) {
            "color-$qualifier"
        } else {
            "color"
        }
        val valueDir = File("${this.path}/$valueDirName")
        if (!valueDir.exists()) valueDir.mkdirs()
        return valueDir
    }

    /**
     * Директория drawable с указанным квалификатором [qualifier]
     */
    private fun File.drawableDir(qualifier: String = ""): File {
        val drawableDirName = if (qualifier.isNotBlank()) {
            "drawable-$qualifier"
        } else {
            "drawable"
        }
        val drawableDir = File("${this.path}/$drawableDirName")
        if (!drawableDir.exists()) drawableDir.mkdirs()
        return drawableDir
    }

    /**
     * Директория font для шрифтов
     */
    fun File.fontDir(): File {
        val fontDirName = "font"
        val fontDir = File("${this.path}/$fontDirName")
        if (!fontDir.exists()) fontDir.mkdirs()
        return fontDir
    }

    /**
     * Директория xml для шрифтов
     */
    fun File.xmlDir(): File {
        val xmlDir = File("${this.path}/xml")
        if (!xmlDir.exists()) xmlDir.mkdirs()
        return xmlDir
    }

    /**
     * XML файл для токенов цвета
     */
    fun File.colorsXmlFile(): File =
        File("${valuesDir().path}/colors.xml")

    /**
     * XML файл для параметров токенов градиента
     */
    fun File.gradientParametersXmlFile(): File =
        File("${valuesDir().path}/gradient-parameters.xml")

    /**
     * XML файл для стилей токенов градиента
     */
    fun File.gradientStylesXmlFile(): File =
        File("${valuesDir().path}/gradient-styles.xml")

    /**
     * XML файл для drawable
     */
    fun File.drawableXmlFile(name: String, prefix: String? = null): File =
        File("${drawableDir().path}/${name.withPrefixIfNeed(prefix)}.xml")

    /**
     * XML файл для размеров
     *
     * @param filePref опциональный префикс названия файла
     */
    fun File.dimensFile(filePref: String = ""): File {
        val prefix = if (filePref.isBlank()) "" else "$filePref-"
        return File("${valuesDir().path}/${prefix}dimens.xml")
    }

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

    /**
     * XML файл для токена font-family с именем [familyName]
     * @param familyName название семейства шрифтов
     * @param prefix префикс для названия ресурса
     */
    fun File.fontFamilyXmlFile(
        familyName: String,
        prefix: String = "",
    ): File = File("${fontDir().path}/${familyName.withPrefixIfNeed(prefix)}.xml")

    /**
     * XML файл для токенов форм
     */
    fun File.shapesXmlFile(): File =
        File("${valuesDir().path}/shapes.xml")

    /**
     * XML файл для токенов теней
     */
    fun File.shadowsXmlFile(): File =
        File("${valuesDir().path}/shadows.xml")

    /**
     * XML файл для токенов теней
     */
    fun File.shadowsStylesXmlFile(): File =
        File("${valuesDir().path}/styles-shadows.xml")

    /**
     * XML файл для токенов отступов
     */
    fun File.spacingXmlFile(): File =
        File("${valuesDir().path}/spacing.xml")

    /**
     * XML файл темы
     */
    fun File.themeXmlFile(qualifier: String = ""): File =
        File("${valuesDir(qualifier).path}/theme.xml")

    /**
     * Возвращает экземпляр [FileWriter] для текущего файла
     */
    fun File.fileWriter(): Writer = FileWriter(this)

    /**
     * Файл с атрибутами
     *
     * @param type тип атрибутов.
     */
    fun File.attrsFile(type: String): File {
        return File("${valuesDir().path}/$type-attributes.xml")
    }

    /**
     * XML файл с ColorStateList из директории colors
     */
    fun File.colorXmlFile(fileName: String, prefix: String = ""): File =
        File("${colorsDir().path}/${fileName.withPrefixIfNeed(prefix)}.xml")

    /**
     * XML файл для стилей
     */
    fun File.componentStyleXmlFile(componentName: String): File =
        File("${valuesDir().path}/styles-${componentName.toLowerCase(Locale.getDefault())}.xml")

    /**
     * XML файл с ValueStateList из директории xml
     */
    fun File.selectorXmlFile(fileName: String, prefix: String = ""): File =
        File("${xmlDir().path}/${fileName.withPrefixIfNeed(prefix)}.xml")
}
