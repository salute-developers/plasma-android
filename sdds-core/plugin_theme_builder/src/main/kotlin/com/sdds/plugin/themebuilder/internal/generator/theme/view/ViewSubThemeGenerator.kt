package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.OverrideToken
import com.sdds.plugin.themebuilder.internal.generator.theme.SubTheme
import com.sdds.plugin.themebuilder.internal.generator.theme.overriddenBySubTheme
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.colorAttrName
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.subThemeXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.capitalized
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.utils.withPrefixIfNeed
import org.w3c.dom.Element
import java.io.File

internal class ViewSubThemeGenerator(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val resourcePrefixConfig: ResourcePrefixConfig,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    themeName: String,
) : SimpleBaseGenerator {

    private val defaultSubThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }
    private val nightSubThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }
    private val capitalizedResPrefix = resourcePrefixConfig.resourcePrefix.capitalized()
    private val camelCaseThemeName = themeName.snakeToCamelCase()
    private var colorTokenData: ColorTokenResult.TokenData? = null
    private var gradientTokenData: GradientTokenResult.ViewTokenData? = null

    private val colorSubThemes: MutableMap<SubTheme, List<OverrideToken>> = mutableMapOf()
    private val gradientSubThemes: MutableMap<SubTheme, List<OverrideToken>> = mutableMapOf()

    private val nightModeThemes: MutableSet<SubTheme> = mutableSetOf()

    fun setColorTokens(tokens: List<ColorToken>, data: ColorTokenResult.TokenData) {
        colorTokenData = data
        colorSubThemes.putAll(tokens.overriddenBySubTheme())
    }

    fun setGradientTokens(tokens: List<GradientToken>, data: GradientTokenResult.ViewTokenData) {
        gradientTokenData = data
        gradientSubThemes.putAll(tokens.overriddenBySubTheme())
    }

    override fun generate() {
        with(defaultSubThemeXmlFileBuilder) {
            (colorSubThemes.keys + gradientSubThemes.keys).forEach { subTheme ->
                val attrs = colorSubThemes.getOrDefault(subTheme, emptyList()) +
                    gradientSubThemes.getOrDefault(subTheme, emptyList())
                addXmlSubTheme(subTheme, false, attrs)
                addXmlSubTheme(subTheme, true, attrs)
            }
            build(outputResDir.subThemeXmlFile())
        }
        if (nightModeThemes.isNotEmpty()) {
            with(nightSubThemeXmlFileBuilder) {
                nightModeThemes.forEach {
                    appendStyleWithResPrefix(
                        styleName = subThemeStyleName(it),
                        styleParent = subThemeStyleName(it, true)
                            .withPrefixIfNeed(capitalizedResPrefix, "."),
                    )
                }
                build(outputResDir.subThemeXmlFile("night"))
            }
        }
    }

    private fun XmlResourcesDocumentBuilder.addXmlSubTheme(
        subTheme: SubTheme,
        isDark: Boolean,
        attrs: List<OverrideToken>,
    ) {
        val themeName = subThemeStyleName(subTheme, isDark)
        appendStyleWithResPrefix(themeName) {
            attrs.distinctBy { it.old.xmlName }.forEach { attr ->
                overrideXmlAttr(this, isDark, attr)
            }
        }
        if (isDark) {
            nightModeThemes.add(subTheme)
        } else {
            appendStyleWithResPrefix(
                subThemeStyleName(subTheme),
                styleParent = themeName.withPrefixIfNeed(capitalizedResPrefix, "."),
            )
        }
    }

    private fun XmlResourcesDocumentBuilder.overrideXmlAttr(
        styleElement: Element,
        isDark: Boolean,
        attr: OverrideToken,
    ) {
        if (attr.new.isDark != isDark) return

        val (name, value) = when (attr.old) {
            is ColorToken -> attr.old.colorAttrName() to getValueReference(attr.new.colorAttrName(), isDark)
            is GradientToken -> attr.old.colorAttrName() to getGradientValueReference(attr.new.colorAttrName(), isDark)
            else -> return
        }
        styleElement.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = name,
            value = value ?: return,
            usePrefix = true,
        )
    }

    private fun getValueReference(attributeName: String, isDark: Boolean): String? {
        return if (isDark) {
            colorTokenData?.dark?.get(attributeName)?.colorRef
        } else {
            colorTokenData?.light?.get(attributeName)?.colorRef
        }
    }

    private fun getGradientValueReference(attributeName: String, isDark: Boolean): String? {
        val value = if (isDark) {
            gradientTokenData?.dark?.get(attributeName)
        } else {
            gradientTokenData?.light?.get(attributeName)
        }
        return value?.let {
            if (value.isTextGradient) {
                resourceReferenceProvider.style("Gradient.${value.nameSnakeCase.snakeToCamelCase()}")
            } else {
                resourceReferenceProvider.drawable(it.nameSnakeCase)
            }
        }
    }

    private fun subThemeStyleName(subTheme: SubTheme, isDark: Boolean? = null, withPrefix: Boolean = false): String {
        return listOfNotNull(
            capitalizedResPrefix.takeIf { withPrefix },
            camelCaseThemeName.takeIf { it.isNotBlank() },
            subTheme.suffix(isDark).takeIf { it.isNotBlank() },
        ).joinToString(THEME_NAME_DELIMITER)
    }

    private companion object {
        const val THEME_NAME_DELIMITER = "."

        fun SubTheme.suffix(isDark: Boolean?): String {
            val modeSuffix = when (isDark) {
                true -> "Dark"
                false -> "Light"
                null -> null
            }
            return buildString {
                if (modeSuffix != null) append(modeSuffix)
                append(suffix)
            }
        }
    }
}
