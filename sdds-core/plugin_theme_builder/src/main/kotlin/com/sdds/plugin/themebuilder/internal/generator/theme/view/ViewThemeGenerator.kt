package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.ViewThemeParent
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
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
    private val viewGradientGenerator: ViewGradientGenerator,
    private val resPrefixConfig: ResourcePrefixConfig,
    themeName: String,
) : SimpleBaseGenerator {

    private var colorData: ColorTokenResult.TokenData? = null
    private var gradientData: GradientTokenResult.ViewTokenData? = null
    private val colorAttributes = mutableSetOf<String>()
    private val gradientAttributes = mutableSetOf<String>()
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
        colorData = data
        colorAttributes.clear()
        colorAttributes.addAll(data.mergedLightAndDark())
    }

    internal fun setGradientTokenData(data: GradientTokenResult.ViewTokenData) {
        gradientData = data
        gradientAttributes.clear()
        gradientAttributes.addAll(data.mergedLightAndDark())
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

        viewGradientGenerator.generate()
        collectEmptyBaseStyles()
        addEmptyStyles()
        buildFiles()
    }

    private fun collectEmptyBaseStyles() {
        if (resPrefixConfig.shouldGenerateResPrefixStyle) {
            emptyStylesCollector.add(capitalizedResPrefix)
        }
        if (camelCaseThemeName.isNotBlank()) {
            emptyStylesCollector.add("$capitalizedResPrefix.$camelCaseThemeName")
        }
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
                gradientAttributesBlock(lightGradientTokens = mode == ThemeMode.LIGHT),
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
        return listOfNotNull(
            capitalizedResPrefix.takeIf { withPrefix },
            camelCaseThemeName.takeIf { it.isNotBlank() },
            parent?.childSuffix?.takeIf { it.isNotBlank() },
            mode.suffix.takeIf { it.isNotBlank() },
        ).joinToString(THEME_NAME_DELIMITER)
    }

    private fun collectEmptyStyles(viewThemeParent: ViewThemeParent?) {
        viewThemeParent?.let { themeParent ->
            val subStyles = themeParent.childSuffix.split('.')
            val base = if (camelCaseThemeName.isNotBlank()) {
                "$capitalizedResPrefix.$camelCaseThemeName"
            } else {
                capitalizedResPrefix
            }
            val styleBuilder = StringBuilder(base)
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
                attrs = colorAttributes.toLightColorThemeAttrs()
            } else {
                commentText = "Dark colors"
                attrs = colorAttributes.toDarkColorThemeAttrs()
            }
            if (attrs.isNotEmpty()) appendComment(commentText)
            appendAttrs(
                attrs = attrs,
                toElement = this,
            )
        }

    private fun XmlResourcesDocumentBuilder.gradientAttributesBlock(
        lightGradientTokens: Boolean,
    ): Element.() -> Unit =
        {
            val commentText: String
            val attrs: List<ViewThemeAttribute>
            if (lightGradientTokens) {
                commentText = "Light gradients"
                attrs = gradientAttributes.toLightGradientThemeAttrs()
            } else {
                commentText = "Dark gradients"
                attrs = gradientAttributes.toDarkGradientThemeAttrs()
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

    private fun Set<String>.toDarkColorThemeAttrs(): List<ViewThemeAttribute> =
        map { color ->
            ViewThemeAttribute(
                name = color,
                value = colorData?.dark?.get(color)
                    ?: colorData?.light?.get(color)
                    ?: throw ThemeBuilderException("Can't find token value for color $color"),
            )
        }

    private fun Set<String>.toLightColorThemeAttrs(): List<ViewThemeAttribute> =
        map { color ->
            ViewThemeAttribute(
                name = color,
                value = colorData?.light?.get(color)
                    ?: colorData?.dark?.get(color)
                    ?: throw ThemeBuilderException("Can't find token value for color $color"),
            )
        }

    private fun Set<String>.toLightGradientThemeAttrs(): List<ViewThemeAttribute> =
        map { gradient ->
            val gradientValue = gradientData?.light?.get(gradient)
                ?: gradientData?.dark?.get(gradient)
                ?: throw ThemeBuilderException("Can't find token value for gradient $gradient")
            val resReference = viewGradientGenerator.addGradient(gradientValue)
            ViewThemeAttribute(name = gradient, value = resReference)
        }

    private fun Set<String>.toDarkGradientThemeAttrs(): List<ViewThemeAttribute> =
        map { gradient ->
            val gradientValue = gradientData?.dark?.get(gradient)
                ?: gradientData?.light?.get(gradient)
                ?: throw ThemeBuilderException("Can't find token value for gradient $gradient")
            val resReference = viewGradientGenerator.addGradient(gradientValue)
            ViewThemeAttribute(name = gradient, value = resReference)
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
            return listOfNotNull(
                themePrefix.takeIf { it.isNotBlank() },
                mode.suffix.takeIf { it.isNotBlank() },
                themeSuffix.takeIf { it.isNotBlank() },
            ).joinToString(THEME_NAME_DELIMITER)
        }
    }
}
