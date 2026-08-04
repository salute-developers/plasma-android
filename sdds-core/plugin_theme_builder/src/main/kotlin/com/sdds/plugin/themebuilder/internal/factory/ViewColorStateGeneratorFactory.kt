package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.universal.view.ViewColorStateGenerator
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
     * Генераторы кэшируются по имени компонента: `ColorState` — сущность uikit-класса,
     * а не отдельного вида компонента, и все виды пишут в один и тот же enum и один
     * attrs-файл. Без кэша второй вид (напр. `segment-item-counter` при уже собранном
     * `counter`) перезаписывал бы файл своим набором состояний, и стили первого вида
     * ссылались бы на несуществующие значения.
     */
    private val generators = mutableMapOf<String, ViewColorStateGenerator>()

    /**
     * Возвращает генератор функционала ColorState для компонента с названием [componentName]
     */
    fun create(componentName: String): ViewColorStateGenerator =
        generators.getOrPut(componentName) { createGenerator(componentName) }

    private fun createGenerator(componentName: String): ViewColorStateGenerator =
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
