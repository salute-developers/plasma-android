package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

/**
 * Делегат для компонентов, использующих универсальный генератор стилей Compose.
 * [componentMeta] — мета-информация компонента, сгенерированная api-info-ksp.
 * [allMeta] — полный список мета-информации всех компонентов (для разрешения пакетов при ссылках на стили).
 */
internal class UniversalComponentConfigDelegate(
    private val componentMeta: ComponentMeta,
    private val allMeta: List<ComponentMeta> = emptyList(),
    private val allComponents: List<Component> = emptyList(),
) : ComponentConfigDelegate<UniversalComponentConfig>() {

    private val packageLookup: Map<String, String> = buildMap {
        // KSP component-name entries (authoritative packageName where non-blank)
        allMeta.forEach { meta ->
            put(meta.componentName.lowercase(), meta.packageName.ifBlank { meta.componentName.lowercase() })
        }
        // Exact style-name → package, using KSP packageName when available, else Component.packageName
        val kspPackageByComponentName = allMeta.associate { it.componentName.lowercase() to it.packageName }
        allComponents.forEach { comp ->
            val kspPackage = kspPackageByComponentName[comp.componentName.lowercase()]
            val resolvedPackage = if (!kspPackage.isNullOrBlank()) kspPackage else comp.packageName
            put(comp.styleName.replace("-", "").lowercase(), resolvedPackage)
        }
    }

    override fun parseConfig(file: File): UniversalComponentConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<UniversalComponentConfig> {
        val componentName = component.styleName.techToSnakeCase()
        val styleBuilderName = componentMeta.qualifiedName.substringAfterLast(".")
        val styleBuilderPackage = componentMeta.qualifiedName.substringBeforeLast(".")
        val registry = PropertyMapperRegistry(
            componentMeta = componentMeta,
            themeClassName = deps.themeClassName,
            componentName = componentName,
            componentXmlPrefix = componentName,
            dimensAggregator = deps.dimensAggregator,
            dimensionsConfig = deps.dimensionsConfig,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            themeStylesPackage = deps.packageResolver.getPackage(TargetPackage.STYLES),
            packageLookup = packageLookup,
        )
        return UniversalComposeVariationGenerator(
            componentMeta = componentMeta,
            mapperRegistry = registry,
            themeClassName = deps.themeClassName,
            themePackage = deps.packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = deps.dimensionsConfig,
            namespace = deps.namespace,
            ktFileBuilderFactory = deps.ktFileBuilderFactory,
            componentPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.${
                componentMeta.packageName.ifBlank { component.packageName }
            }",
            outputLocation = KtFileBuilder.OutputLocation.Directory(deps.outputDir),
            componentName = componentName,
            styleBuilderName = styleBuilderName,
            styleBuilderFactoryFunName = componentMeta.builderFunName.ifBlank { "builder" },
            componentStylePackage = styleBuilderPackage,
        )
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<UniversalComponentConfig>? = null
}
