package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.button.BasicButtonStyleGeneratorCompose
import com.sdds.plugin.themebuilder.internal.components.button.BasicButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.button.ButtonStyleGeneratorComposeFactory
import com.sdds.plugin.themebuilder.internal.components.button.IconButtonStyleGeneratorCompose
import com.sdds.plugin.themebuilder.internal.components.button.IconButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.button.LinkButtonStyleGeneratorCompose
import com.sdds.plugin.themebuilder.internal.components.button.LinkButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.generator.DimenTokenGenerator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.api.file.DirectoryProperty
import java.io.File

internal class ComponentStyleGeneratorFactory(
    private val outputDirPath: String,
    private val outputResDirPath: String,
    private val projectDir: DirectoryProperty,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val themeName: String,
    private val packageResolver: PackageResolver,
    private val namespace: String,
    private val dimensionsConfig: DimensionsConfig,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val resourcePrefixConfig: ResourcePrefixConfig,
) {
    private val outputDir: File by unsafeLazy {
        projectDir.get().dir(outputDirPath).asFile
    }

    private val outputResDir: File by unsafeLazy {
        projectDir.get().dir(outputResDirPath).asFile
    }

    private val buttonStyleGeneratorComposeFactory by unsafeLazy {
        ButtonStyleGeneratorComposeFactory(
            outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
            ktFileBuilderFactory = ktFileBuilderFactory,
            themeName = themeName,
            packageResolver = packageResolver,
            namespace = namespace,
            dimensionsConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
        )
    }

    fun createBasicButtonStyleGeneratorCompose(): BasicButtonStyleGeneratorCompose =
        buttonStyleGeneratorComposeFactory.createBasicButtonGenerator()

    fun createBasicButtonStyleGeneratorView(): BasicButtonStyleGeneratorView =
        BasicButtonStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = outputResDir,
            attrPrefix = resourcePrefixConfig.resourcePrefix,
        )

    fun createIconButtonStyleGeneratorCompose(): IconButtonStyleGeneratorCompose =
        buttonStyleGeneratorComposeFactory.createIconButtonGenerator()

    fun createIconButtonStyleGeneratorView(): IconButtonStyleGeneratorView =
        IconButtonStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = outputResDir,
            attrPrefix = resourcePrefixConfig.resourcePrefix,
        )

    fun createLinkButtonStyleGeneratorCompose(): LinkButtonStyleGeneratorCompose =
        buttonStyleGeneratorComposeFactory.createLinkButtonGenerator()

    fun createLinkButtonStyleGeneratorView(): LinkButtonStyleGeneratorView =
        LinkButtonStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = outputResDir,
            attrPrefix = resourcePrefixConfig.resourcePrefix,
        )

    fun createDimensionGenerator(): DimenTokenGenerator = DimenTokenGenerator(
        outputResDir = outputResDir,
        dimensAggregator = dimensAggregator,
        dimensConfig = dimensionsConfig,
        xmlBuilderFactory = xmlBuilderFactory,
        filePrefix = "style",
    )
}