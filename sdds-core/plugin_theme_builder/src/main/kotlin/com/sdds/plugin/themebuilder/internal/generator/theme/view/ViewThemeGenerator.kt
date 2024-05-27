package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.themeXmlFile
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
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
) : SimpleBaseGenerator {

    private val colors = mutableListOf<ColorTokenResult.TokenData>()
    private val shapes = mutableListOf<ShapeTokenResult.TokenData>()

    private val lightThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    private val darkThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    internal fun setColorTokenData(data: List<ColorTokenResult.TokenData>) {
        colors.clear()
        colors.addAll(data)
    }

    internal fun setShapeTokenData(data: List<ShapeTokenResult.TokenData>) {
        shapes.clear()
        shapes.addAll(data)
    }

    override fun generate() {
        with(darkThemeXmlFileBuilder) {
            addStyleWithAttrs(
                {
                    if (colors.isNotEmpty()) appendComment("Dark colors")
                    appendAttrs(
                        colors
                            .filter { !it.isLight }
                            .colorsToThemeAttrs(),
                        this,
                    )
                },
            )
            build(outputResDir.themeXmlFile(ThemeMode.DARK.qualifier))
        }

        with(lightThemeXmlFileBuilder) {
            addStyleWithAttrs(
                {
                    if (colors.isNotEmpty()) appendComment("Light colors")
                    appendAttrs(
                        attrs = colors
                            .filter { it.isLight }
                            .colorsToThemeAttrs(),
                        toElement = this,
                    )
                },
                {
                    if (shapes.isNotEmpty()) appendComment("Shapes")
                    appendAttrs(shapes.shapesToThemeAttrs(), this)
                },
            )
            build(outputResDir.themeXmlFile(ThemeMode.LIGHT.qualifier))
        }
    }

    private fun List<ColorTokenResult.TokenData>.colorsToThemeAttrs(): List<ViewThemeAttribute> =
        map { entry ->
            ViewThemeAttribute(
                name = entry.attrName,
                value = entry.tokenRefName,
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
        appendStyle(
            styleName = themeName,
            styleParent = parentThemeName,
        ) {
            attrBlocks.forEach { attrBlock ->
                attrBlock.invoke(this@appendStyle)
            }
        }
    }

    private enum class ThemeMode(val qualifier: String) {
        LIGHT(""),
        DARK("night"),
    }
}
