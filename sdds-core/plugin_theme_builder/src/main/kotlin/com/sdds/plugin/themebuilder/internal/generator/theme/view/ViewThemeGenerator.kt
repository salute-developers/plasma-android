package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.themeXmlFile
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.configurationcache.extensions.capitalized
import org.w3c.dom.Element
import java.io.File

/**
 * Генератор темы для View
 *
 * @property xmlBuilderFactory фабрика [XmlResourcesDocumentBuilder]
 * @property outputResDir директория для xml-ресурсов
 * @property parentThemeName название темы, от которой будет унаследована генерируемая тема
 */
internal class ViewThemeGenerator(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val parentThemeName: String,
    private val themeName: String,
    private val resPrefix: String,
) : SimpleBaseGenerator {

    private var colors: ColorTokenResult.TokenData? = null
    private val colorAttributes = mutableSetOf<String>()
    private val shapes = mutableListOf<ShapeTokenResult.TokenData>()
    private val typography = mutableListOf<TypographyTokenResult.ViewTokenData>()

    private val lightThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    private val darkThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    internal fun setColorTokenData(data: ColorTokenResult.TokenData) {
        colors = data
        colorAttributes.clear()
        colorAttributes.addAll(data.mergedLightAndDark())
    }

    internal fun setShapeTokenData(data: List<ShapeTokenResult.TokenData>) {
        shapes.clear()
        shapes.addAll(data)
    }

    internal fun setTypographyTokenData(data: List<TypographyTokenResult.ViewTokenData>) {
        typography.clear()
        typography.addAll(data)
    }

    override fun generate() {
        with(darkThemeXmlFileBuilder) {
            appendStyle(resPrefix.capitalized())
            addStyleWithAttrs(
                {
                    if (colorAttributes.isNotEmpty()) appendComment("Dark colors")
                    appendAttrs(
                        attrs = colorAttributes
                            .toDarkThemeAttrs(),
                        toElement = this,
                    )
                },
            )
            build(outputResDir.themeXmlFile(ThemeMode.DARK.qualifier))
        }

        with(lightThemeXmlFileBuilder) {
            appendStyle(resPrefix.capitalized())
            addStyleWithAttrs(
                {
                    if (colorAttributes.isNotEmpty()) appendComment("Light colors")
                    appendAttrs(
                        attrs = colorAttributes
                            .toLightThemeAttrs(),
                        toElement = this,
                    )
                },
                {
                    if (shapes.isNotEmpty()) appendComment("Shapes")
                    appendAttrs(shapes.shapesToThemeAttrs(), this)
                },
                {
                    if (typography.isNotEmpty()) appendComment("Typography")
                    appendAttrs(typography.typographyToThemeAttrs(), this)
                },
            )
            build(outputResDir.themeXmlFile(ThemeMode.LIGHT.qualifier))
        }
    }

    private fun List<TypographyTokenResult.ViewTokenData>.typographyToThemeAttrs(): List<ViewThemeAttribute> =
        map { entry ->
            ViewThemeAttribute(
                name = entry.attrName,
                value = entry.tokenRefName,
            )
        }

    private fun Set<String>.toDarkThemeAttrs(): List<ViewThemeAttribute> =
        map { color ->
            ViewThemeAttribute(
                name = color,
                value = colors?.dark?.get(color)
                    ?: colors?.light?.get(color)
                    ?: throw ThemeBuilderException("Can't find token value for color $color"),
            )
        }

    private fun Set<String>.toLightThemeAttrs(): List<ViewThemeAttribute> =
        map { color ->
            ViewThemeAttribute(
                name = color,
                value = colors?.light?.get(color)
                    ?: colors?.dark?.get(color)
                    ?: throw ThemeBuilderException("Can't find token value for color $color"),
            )
        }

    private fun List<ShapeTokenResult.TokenData>.shapesToThemeAttrs(): List<ViewThemeAttribute> =
        map { entry ->
            ViewThemeAttribute(
                name = entry.attrName,
                value = entry.tokenRefName,
            )
        }

    private fun XmlResourcesDocumentBuilder.appendAttrs(
        attrs: List<ViewThemeAttribute>,
        toElement: Element,
    ) {
        attrs.forEach {
            toElement.appendElement(
                elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
                tokenName = it.name,
                value = it.value,
            )
        }
    }

    private fun XmlResourcesDocumentBuilder.addStyleWithAttrs(vararg attrBlocks: Element.() -> Unit) {
        appendStyleWithPrefix(
            styleName = themeName,
            styleParent = parentThemeName,
        ) {
            attrBlocks.forEach { attrBlock ->
                attrBlock.invoke(this@appendStyleWithPrefix)
            }
        }
    }

    private enum class ThemeMode(val qualifier: String) {
        LIGHT(""),
        DARK("night"),
    }
}
