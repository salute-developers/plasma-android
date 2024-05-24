package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.themeXmlFile
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
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
) {
    private val lightThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    private val darkThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    fun generate(colors: List<ColorTokenResult.TokenData>) {
        if (colors.isEmpty()) return
        with(darkThemeXmlFileBuilder) {
            addStyleWithAttrs(
                attrs = colors
                    .filter { !it.isLight }
                    .toThemeAttrs(),
            )
            build(outputResDir.themeXmlFile(ThemeMode.DARK.qualifier))
        }

        with(lightThemeXmlFileBuilder) {
            addStyleWithAttrs(
                attrs = colors
                    .filter { it.isLight }
                    .toThemeAttrs(),
            )
            build(outputResDir.themeXmlFile(ThemeMode.LIGHT.qualifier))
        }
    }

    private fun List<ColorTokenResult.TokenData>.toThemeAttrs(): List<ViewThemeAttribute> =
        map { entry ->
            ViewThemeAttribute(
                name = entry.attrName,
                value = entry.tokenRefName,
            )
        }

    private fun XmlResourcesDocumentBuilder.addStyleWithAttrs(attrs: List<ViewThemeAttribute>) {
        appendStyle(
            styleName = themeName,
            styleParent = parentThemeName,
        ) {
            attrs.forEach { themeAttribute ->
                appendElement(
                    elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
                    tokenName = themeAttribute.name,
                    value = themeAttribute.value,
                )
            }
        }
    }

    private enum class ThemeMode(val qualifier: String) {
        LIGHT(""),
        DARK("night"),
    }
}
