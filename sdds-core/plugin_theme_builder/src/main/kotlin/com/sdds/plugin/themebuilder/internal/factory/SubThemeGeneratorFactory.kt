package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeSubThemeGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewSubThemeGenerator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Фабрика [ViewSubThemeGenerator] и [ComposeSubThemeGenerator]
 */
internal class SubThemeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val packageResolver: PackageResolver,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val xmlResourcesDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val themeName: String,
    private val resPrefixConfig: ResourcePrefixConfig,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) {

    /**
     * Создает [ViewSubThemeGenerator]
     */
    fun createView(): ViewSubThemeGenerator =
        ViewSubThemeGenerator(
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
            outputResDir = outputResDir,
            themeName = themeName,
            resourcePrefixConfig = resPrefixConfig,
            resourceReferenceProvider = resourceReferenceProvider,
        )

    /**
     * Создает [ComposeSubThemeGenerator]
     */
    fun createCompose(): ComposeSubThemeGenerator =
        ComposeSubThemeGenerator(
            themeName = themeName,
            ktFileBuilderFactory = ktFileBuilderFactory,
            packageResolver = packageResolver,
            outputLocation = outputLocation,
        )
}
