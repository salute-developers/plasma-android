package com.sdds.plugin.themebuilder.internal.components

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.DimenTokenGenerator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.api.file.DirectoryProperty
import org.gradle.kotlin.dsl.provideDelegate
import java.io.File

internal class StyleGeneratorDependencies(
    val outputResDir: File,
    val outputDir: File,
    val projectDir: DirectoryProperty,
    val ktFileBuilderFactory: KtFileBuilderFactory,
    val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    val themeClassName: String,
    val packageResolver: PackageResolver,
    val namespace: String,
    val dimensionsConfig: DimensionsConfig,
    val resourceReferenceProvider: ResourceReferenceProvider,
    val resourcePrefixConfig: ResourcePrefixConfig,
    val viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    val colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    val target: ThemeBuilderTarget,
) {
    val dimensAggregator by unsafeLazy { DimensAggregator() }
    val dimensGenerator by unsafeLazy {
        DimenTokenGenerator(
            outputResDir = outputResDir,
            dimensAggregator = dimensAggregator,
            dimensConfig = dimensionsConfig,
            xmlBuilderFactory = xmlBuilderFactory,
            filePrefix = "style",
        )
    }
}
