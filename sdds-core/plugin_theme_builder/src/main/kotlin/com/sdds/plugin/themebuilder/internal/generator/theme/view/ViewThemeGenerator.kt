package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.ViewThemeParent
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.themeXmlFile
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.configurationcache.extensions.capitalized
import org.w3c.dom.Element
import java.io.File

/**
 * Генератор тем для View.
 *
 * @property xmlBuilderFactory фабрика [XmlResourcesDocumentBuilder]
 * @property outputResDir директория для xml-ресурсов
 * @property viewThemeParents список тем, от которых необходимо унаследовать генерируемые темы
 * @property resPrefixConfig префикс ресурсов
 * @param themeName название темы
 *
 * @see ViewThemeType
 * @see ViewThemeParent
 */
internal class ViewThemeGenerator(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val viewThemeParents: List<ViewThemeParent>,
    private val resPrefixConfig: ResourcePrefixConfig,
    themeName: String,
) : SimpleBaseGenerator {

    private var colors: ColorTokenResult.TokenData? = null
    private val colorAttributes = mutableSetOf<String>()
    private val shapes = mutableListOf<ShapeTokenResult.TokenData>()
    private var typography: TypographyTokenResult.ViewTokenData? = null

    private val emptyStylesCollector = mutableSetOf<String>()
    private val stylesWithAttributesCollector = mutableSetOf<String>()

    private val defaultThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    private val nightThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    private val capitalizedResPrefix = resPrefixConfig.resourcePrefix.capitalized()
    private val camelCaseThemeName = themeName.snakeToCamelCase()

    internal fun setColorTokenData(data: ColorTokenResult.TokenData) {
        colors = data
        colorAttributes.clear()
        colorAttributes.addAll(data.mergedLightAndDark())
    }

    internal fun setShapeTokenData(data: List<ShapeTokenResult.TokenData>) {
        shapes.clear()
        shapes.addAll(data)
    }

    internal fun setTypographyTokenData(data: TypographyTokenResult.ViewTokenData) {
        typography = data
    }

    fun generateEmptyTheme() {
        with(defaultThemeXmlFileBuilder) {
            collectEmptyBaseStyles()
            addEmptyStyles()
            build(outputResDir.themeXmlFile(ThemeMode.LIGHT.qualifier))
        }
    }

    override fun generate() {
        emptyStylesCollector.clear()
        stylesWithAttributesCollector.clear()

        if (viewThemeParents.isEmpty()) {
            addStyleWithDefaultAttributes(mode = ThemeMode.DARK)
            addStyleWithDefaultAttributes(mode = ThemeMode.LIGHT)
            addDayNightStyle()
        } else {
            viewThemeParents.forEach {
                addStyleWithDefaultAttributes(parent = it, mode = ThemeMode.DARK)
                addStyleWithDefaultAttributes(parent = it, mode = ThemeMode.LIGHT)
                addDayNightStyle(parent = it)
            }
        }

        collectEmptyBaseStyles()
        addEmptyStyles()
        buildFiles()
    }

    private fun collectEmptyBaseStyles() {
        if (resPrefixConfig.shouldGenerateResPrefixStyle) {
            emptyStylesCollector.add(capitalizedResPrefix)
        }
        emptyStylesCollector.add("$capitalizedResPrefix.$camelCaseThemeName")
    }

    private fun addEmptyStyles() {
        (emptyStylesCollector - stylesWithAttributesCollector)
            .forEach(defaultThemeXmlFileBuilder::appendStyle)
    }

    private fun buildFiles() {
        defaultThemeXmlFileBuilder.build(outputResDir.themeXmlFile())
        nightThemeXmlFileBuilder.build(outputResDir.themeXmlFile(ThemeMode.DAYNIGHT.qualifier))
    }

    private fun addStyleWithDefaultAttributes(parent: ViewThemeParent? = null, mode: ThemeMode) {
        with(defaultThemeXmlFileBuilder) {
            collectEmptyStyles(parent)
            addStyleWithAttrs(
                styleName = themeStyleName(mode, parent),
                parent = parent?.fullName(mode),
                colorAttributesBlock(lightColorTokens = mode == ThemeMode.LIGHT),
                shapeAttributesBlock(),
                typographyAttributesBlock(),
            )
        }
    }

    private fun addDayNightStyle(parent: ViewThemeParent? = null) {
        with(defaultThemeXmlFileBuilder) {
            addStyleWithAttrs(
                styleName = themeStyleName(ThemeMode.DAYNIGHT, parent),
                parent = themeStyleName(ThemeMode.LIGHT, parent, true),
            )
        }
        with(nightThemeXmlFileBuilder) {
            addStyleWithAttrs(
                styleName = themeStyleName(ThemeMode.DAYNIGHT, parent),
                parent = themeStyleName(ThemeMode.DARK, parent, true),
            )
        }
    }

    private fun themeStyleName(mode: ThemeMode, parent: ViewThemeParent? = null, withPrefix: Boolean = false): String {
        return buildString {
            if (withPrefix) {
                append(capitalizedResPrefix)
                append(THEME_NAME_DELIMITER)
            }
            append(camelCaseThemeName)
            parent?.let {
                append(THEME_NAME_DELIMITER)
                append(it.childSuffix)
            }
            if (mode.suffix.isNotBlank()) {
                append(THEME_NAME_DELIMITER)
                append(mode.suffix)
            }
        }
    }

    private fun collectEmptyStyles(viewThemeParent: ViewThemeParent?) {
        viewThemeParent?.let { themeParent ->
            val subStyles = themeParent.childSuffix.split('.')
            val styleBuilder = StringBuilder("$capitalizedResPrefix.$camelCaseThemeName")
            subStyles
                .subList(0, subStyles.lastIndex)
                .forEach { subStyle ->
                    styleBuilder.append(".$subStyle")
                    val style = styleBuilder.toString()
                    emptyStylesCollector.add(style)
                }
        }
    }

    private fun XmlResourcesDocumentBuilder.colorAttributesBlock(
        lightColorTokens: Boolean,
    ): Element.() -> Unit =
        {
            val commentText: String
            val attrs: List<ViewThemeAttribute>
            if (lightColorTokens) {
                commentText = "Light colors"
                attrs = colorAttributes.toLightThemeAttrs()
            } else {
                commentText = "Dark colors"
                attrs = colorAttributes.toDarkThemeAttrs()
            }
            if (attrs.isNotEmpty()) appendComment(commentText)
            appendAttrs(
                attrs = attrs,
                toElement = this,
            )
        }

    private fun XmlResourcesDocumentBuilder.shapeAttributesBlock(): Element.() -> Unit = {
        if (shapes.isNotEmpty()) appendComment("Shapes")
        appendAttrs(shapes.shapesToThemeAttrs(), this)
    }

    private fun XmlResourcesDocumentBuilder.typographyAttributesBlock(): Element.() -> Unit = {
        val data = typography?.attrs
        if (!data.isNullOrEmpty()) {
            appendComment("Typography")
            appendAttrs(data.typographyToThemeAttrs(), this)
        }
    }

    private fun Map<String, String>?.typographyToThemeAttrs(): List<ViewThemeAttribute> =
        this?.map { entry ->
            ViewThemeAttribute(
                name = entry.key,
                value = entry.value,
            )
        } ?: emptyList()

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

    private fun XmlResourcesDocumentBuilder.addStyleWithAttrs(
        styleName: String,
        parent: String? = null,
        vararg attrBlocks: Element.() -> Unit,
    ) {
        stylesWithAttributesCollector.add("$capitalizedResPrefix.$styleName")
        appendStyleWithResPrefix(
            styleName = styleName,
            styleParent = parent,
        ) {
            attrBlocks.forEach { attrBlock ->
                attrBlock.invoke(this@appendStyleWithResPrefix)
            }
        }
    }

    private enum class ThemeMode(val suffix: String, val qualifier: String) {
        LIGHT("Light", ""),
        DARK("", ""),
        DAYNIGHT("DayNight", "night"),
    }

    private companion object {
        const val THEME_NAME_DELIMITER = "."

        fun ViewThemeParent.fullName(mode: ThemeMode): String {
            if (mode.suffix.isBlank()) return fullName
            return buildString {
                append(themePrefix)
                append(THEME_NAME_DELIMITER)
                append(mode.suffix)
                if (themeSuffix.isNotBlank()) {
                    append(THEME_NAME_DELIMITER)
                    append(themeSuffix)
                }
            }
        }
    }
}
