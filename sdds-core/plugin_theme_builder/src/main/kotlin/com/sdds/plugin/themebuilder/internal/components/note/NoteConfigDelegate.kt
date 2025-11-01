package com.sdds.plugin.themebuilder.internal.components.note

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.note.compose.NoteComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.note.view.NoteStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

internal class NoteConfigDelegate : ComponentConfigDelegate<NoteConfig>() {

    override fun parseConfig(file: File): NoteConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<NoteConfig>? {
        val name = component.componentName.techToCamelCase()
        val style = component.styleName.techToCamelCase()
        val parent = if (name.contains("compact", true)) {
            "Sdds.Components.NoteCompact"
        } else {
            "Sdds.Components.Note"
        }
        val defStyleAttr = if (name.contains("compact", true)) {
            "sd_noteCompactStyle"
        } else {
            "sd_noteStyle"
        }
        return NoteStyleGeneratorView(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
            coreComponentName = name,
            styleComponentName = style,
            componentParent = parent,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
            defStyleAttr = defStyleAttr,
        )
    }

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ) = NoteComposeVariationGenerator(
        themeClassName = deps.themeClassName,
        themePackage = deps.packageResolver.getPackage(TargetPackage.THEME),
        dimensionsConfig = deps.dimensionsConfig,
        dimensAggregator = deps.dimensAggregator,
        resourceReferenceProvider = deps.resourceReferenceProvider,
        namespace = deps.namespace,
        ktFileBuilderFactory = deps.ktFileBuilderFactory,
        componentPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.${component.packageName}",
        componentName = component.styleName.techToSnakeCase(),
        outputLocation = KtFileBuilder.OutputLocation.Directory(deps.outputDir),
        styleBuilderName = "${component.componentName.techToCamelCase()}StyleBuilder",
        styleName = when {
            component.styleName.contains("compact", true) -> "NoteCompactStyle"
            else -> "NoteStyle"
        },
        linkButtonStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.linkbutton",
    )
}
