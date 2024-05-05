package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.core.utils.unsafeLazy
import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.BaseGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.themeXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.gradle.kotlin.dsl.provideDelegate
import java.io.File

/**
 * Генератор темы.
 *
 * @property xmlBuilderFactory фабрика билдеров xml документов
 * @property resourceReferenceProvider провайдер сыылок на ресурсы
 * @property target целевой фреймворк
 * @property outputResDir директория для сохранения xml-файла с темой
 * @property parentThemeName префикс родительской темы для ссылки на ее атрибуты
 * @property parentThemeName имя родительской темы
 */
internal class ThemeGenerator(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val target: ThemeBuilderTarget,
    private val outputResDir: File,
    private val parentThemePrefix: String,
    private val parentThemeName: String,
) : BaseGenerator {

    private val lightThemeAttributes = mutableListOf<ThemeAttribute>()
    private val darkThemeAttributes = mutableListOf<ThemeAttribute>()

    private val lightThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    private val darkThemeXmlFileBuilder by unsafeLazy {
        xmlBuilderFactory.create()
    }

    override fun generate() {
        if (target.isViewSystemOrAll) generateViewSystem()
    }

    /**
     * Инициализирует атрибут цвета в генерируемой теме.
     * Название атрибута получает из названия цвета [colorName]
     * и префикса родительской темы [parentThemePrefix].
     * Значением атрибута является ссылка на ресурс цвета, получаемая из [colorTokenName].
     *
     * @param colorName название цвета без префикса
     * @param colorTokenName название токена без префикса
     */
    fun addXmlColorAttribute(
        colorName: String,
        colorTokenName: String,
        themeMode: ThemeMode = ThemeMode.LIGHT,
    ) {
        when (themeMode) {
            ThemeMode.LIGHT ->
                lightThemeAttributes.add(
                    ThemeAttribute(
                        name = colorName.withParentThemePrefix(),
                        value = resourceReferenceProvider.color(colorTokenName),
                    ),
                )

            ThemeMode.DARK -> darkThemeAttributes.add(
                ThemeAttribute(
                    name = colorName.withParentThemePrefix(),
                    value = resourceReferenceProvider.color(colorTokenName),
                ),
            )
        }
    }

    private fun String.withParentThemePrefix(): String = "${parentThemePrefix}_$this"

    private fun generateViewSystem() {
        if (lightThemeAttributes.isNotEmpty()) {
            with(lightThemeXmlFileBuilder) {
                addStyleWithAttrs(lightThemeAttributes)
                build(outputResDir.themeXmlFile(ThemeMode.LIGHT.qualifier))
            }
        }

        if (darkThemeAttributes.isNotEmpty()) {
            with(darkThemeXmlFileBuilder) {
                addStyleWithAttrs(darkThemeAttributes)
                build(outputResDir.themeXmlFile(ThemeMode.DARK.qualifier))
            }
        }
    }

    private fun XmlResourcesDocumentBuilder.addStyleWithAttrs(attrs: List<ThemeAttribute>) {
        appendStyle(
            styleName = THEME_NAME,
            styleParent = parentThemeName,
        ) {
            attrs.forEach { themeAttribute ->
                appendElement(
                    elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
                    tokenName = themeAttribute.name,
                    value = themeAttribute.value,
                    usePrefix = false,
                )
            }
        }
    }

    internal enum class ThemeMode(val qualifier: String) {
        LIGHT(""),
        DARK("night"),
    }

    private companion object {
        const val THEME_NAME = "Theme"
    }
}
