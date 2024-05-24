package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewThemeAttribute.Companion.attrNameFromTokenName
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.isLight
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
) {
    private val lightThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    private val darkThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    fun generate(colors: Map<ColorToken, String>) {
        if (colors.isEmpty()) return
        with(darkThemeXmlFileBuilder) {
            addStyleWithAttrs(
                attrs = colors
                    .filter { it.key.isDark }
                    .toThemeAttrs(),
            )
            build(outputResDir.themeXmlFile(ThemeMode.DARK.qualifier))
        }

        with(lightThemeXmlFileBuilder) {
            addStyleWithAttrs(
                attrs = colors
                    .filter { it.key.isLight }
                    .toThemeAttrs(),
            )
            build(outputResDir.themeXmlFile(ThemeMode.LIGHT.qualifier))
        }
    }

    private fun Map<ColorToken, String>.toThemeAttrs(): List<ViewThemeAttribute> =
        map { entry ->
            ViewThemeAttribute(
                name = attrNameFromTokenName(name = entry.key.name),
                value = entry.value,
            )
        }

    private fun XmlResourcesDocumentBuilder.addStyleWithAttrs(attrs: List<ViewThemeAttribute>) {
        appendStyle(
            styleName = THEME_NAME,
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

    private companion object {
        const val THEME_NAME = "Theme"
    }
}
