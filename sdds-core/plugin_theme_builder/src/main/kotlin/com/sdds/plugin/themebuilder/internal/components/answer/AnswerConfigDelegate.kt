package com.sdds.plugin.themebuilder.internal.components.answer

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.answer.compose.AnswerComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

internal class AnswerConfigDelegate : ComponentConfigDelegate<AnswerConfig>() {
    override fun parseConfig(file: File): AnswerConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<AnswerConfig>? = null

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<AnswerConfig> {
        val stylesPackage = deps.packageResolver.getPackage(TargetPackage.STYLES)
        return AnswerComposeVariationGenerator(
            noteStylesPackage = "$stylesPackage.note",
            spinnerStylesPackage = "$stylesPackage.spinner",
            buttonGroupStylesPackage = "$stylesPackage.buttongroup",
            chipGroupStylesPackage = "$stylesPackage.chipgroup",
            themeClassName = deps.themeClassName,
            themePackage = deps.packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = deps.dimensionsConfig,
            dimensAggregator = deps.dimensAggregator,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            namespace = deps.namespace,
            ktFileBuilderFactory = deps.ktFileBuilderFactory,
            componentPackage = "$stylesPackage.${component.packageName}",
            componentName = component.styleName.techToSnakeCase(),
            styleBuilderName = "${component.componentName.techToCamelCase()}StyleBuilder",
            outputLocation = KtFileBuilder.OutputLocation.Directory(deps.outputDir),
        )
    }
}
