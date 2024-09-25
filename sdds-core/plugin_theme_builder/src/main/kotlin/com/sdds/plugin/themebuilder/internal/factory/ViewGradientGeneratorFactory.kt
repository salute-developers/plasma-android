package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.view.GradientDrawableGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.GradientStyleGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewGradientGenerator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Фабрика для [ViewGradientGenerator]
 */
internal class ViewGradientGeneratorFactory(
    private val outputResDir: File,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val resourcePrefix: String,
) {

    /**
     * Создает [ViewGradientGenerator]
     */
    fun create() = ViewGradientGenerator(
        gradientStyleGenerator = GradientStyleGenerator(
            outputResDir = outputResDir,
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
        ),
        gradientDrawableGenerator = GradientDrawableGenerator(
            outputResDir = outputResDir,
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            resourcePrefix = resourcePrefix,
        ),
    )
}
