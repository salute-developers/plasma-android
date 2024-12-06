package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewColorStateGenerator
import java.io.File

/**
 * Фабрика для [ViewColorStateGenerator]
 * @author Малышев Александр on 04.12.2024
 */
internal class ViewColorStateGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val colorStateOutputLocation: KtFileBuilder.OutputLocation,
    private val resourcePrefixConfig: ResourcePrefixConfig,
    private val namespace: String,
    private val packageResolver: PackageResolver,
) {

    /**
     * Возвращает генератор функционала ColorState для компонента с названием [componentName]
     */
    fun create(componentName: String): ViewColorStateGenerator =
        ViewColorStateGenerator(
            xmlBuilderFactory = xmlBuilderFactory,
            ktFileBuilderFactory = ktFileBuilderFactory,
            outputResDir = outputResDir,
            colorStateOutputLocation = colorStateOutputLocation,
            componentName = componentName,
            resourcePrefix = resourcePrefixConfig.resourcePrefix,
            namespace = namespace,
            packageResolver = packageResolver,
        )
}
