package com.sdds.plugin.themebuilder.internal.components.textfield

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.textfield.compose.TextFieldComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.textfield.compose.TextFieldComposeVariationGenerator.TextFieldType
import com.sdds.plugin.themebuilder.internal.components.textfield.view.ViewTextAreaStyleGenerator
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

internal class TextAreaConfigDelegate : ComponentConfigDelegate<TextFieldConfig>() {

    override fun parseConfig(file: File) = file.decode<TextFieldConfig>(Serializer.componentConfig)

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<TextFieldConfig>? {
        return ViewTextAreaStyleGenerator(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
        )
    }

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<TextFieldConfig>? {
        return TextFieldComposeVariationGenerator(
            chipStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.chip",
            chipGroupStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.chipgroup",
            dimensionsConfig = deps.dimensionsConfig,
            dimensAggregator = deps.dimensAggregator,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            themeClassName = deps.themeClassName,
            namespace = deps.namespace,
            themePackage = deps.packageResolver.getPackage(TargetPackage.THEME),
            ktFileBuilderFactory = deps.ktFileBuilderFactory,
            componentName = component.styleName.techToSnakeCase(),
            componentPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.${component.packageName}",
            outputLocation = KtFileBuilder.OutputLocation.Directory(deps.outputDir),
            styleBuilderName = "TextFieldStyleBuilder",
            textFieldType = TextFieldType.TextArea,
        )
    }
}
