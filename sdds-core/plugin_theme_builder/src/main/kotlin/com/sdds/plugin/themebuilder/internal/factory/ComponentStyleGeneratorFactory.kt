package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.button.compose.ButtonComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.button.view.BasicButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.button.view.IconButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.button.view.LinkButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.cell.compose.CellComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.indicator.compose.IndicatorComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.indicator.view.IndicatorStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.textfield.compose.TextFieldComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.textfield.view.ViewTextAreaStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.textfield.view.ViewTextFieldStyleGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.generator.DimenTokenGenerator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
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

    private val mViewColorStateGeneratorFactory by unsafeLazy {
        ViewColorStateGeneratorFactory(
            ktFileBuilderFactory = ktFileBuilderFactory,
            xmlBuilderFactory = xmlBuilderFactory,
            outputResDir = outputResDir,
            colorStateOutputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
            resourcePrefixConfig = resourcePrefixConfig,
            namespace = namespace,
            packageResolver = packageResolver,
        )
    }

    private val colorStateListGeneratorFactory by unsafeLazy {
        ColorStateListGeneratorFactory(
            xmlBuilderFactory = xmlBuilderFactory,
            resourcePrefixConfig = resourcePrefixConfig,
        )
    }

    fun createBasicButtonStyleGeneratorView(): BasicButtonStyleGeneratorView =
        BasicButtonStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = outputResDir,
            resourcePrefix = resourcePrefixConfig.resourcePrefix,
            colorStateListGeneratorFactory = colorStateListGeneratorFactory,
            viewColorStateGeneratorFactory = mViewColorStateGeneratorFactory,
        )

    fun createIconButtonStyleGeneratorView(): IconButtonStyleGeneratorView =
        IconButtonStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = outputResDir,
            attrPrefix = resourcePrefixConfig.resourcePrefix,
            viewColorStateGeneratorFactory = mViewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = colorStateListGeneratorFactory,
        )

    fun createIndicatorStyleGeneratorView(): IndicatorStyleGeneratorView =
        IndicatorStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = outputResDir,
            resourcePrefix = resourcePrefixConfig.resourcePrefix,
            viewColorStateGeneratorFactory = mViewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = colorStateListGeneratorFactory,
        )

    fun createLinkButtonStyleGeneratorView(): LinkButtonStyleGeneratorView =
        LinkButtonStyleGeneratorView(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = outputResDir,
            attrPrefix = resourcePrefixConfig.resourcePrefix,
            viewColorStateGeneratorFactory = mViewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = colorStateListGeneratorFactory,
        )

    fun createTextFieldStyleGeneratorView(): ViewTextFieldStyleGenerator =
        ViewTextFieldStyleGenerator(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = outputResDir,
            resourcePrefix = resourcePrefixConfig.resourcePrefix,
            viewColorStateGeneratorFactory = mViewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = colorStateListGeneratorFactory,
        )

    fun createTextAreaStyleGeneratorView(): ViewTextAreaStyleGenerator =
        ViewTextAreaStyleGenerator(
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensAggregator = dimensAggregator,
            outputResDir = outputResDir,
            resourcePrefix = resourcePrefixConfig.resourcePrefix,
            viewColorStateGeneratorFactory = mViewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = colorStateListGeneratorFactory,
        )

    fun createTextFieldStyleGeneratorCompose() =
        createBaseTextFieldStyleGeneratorCompose(
            componentName = "text_field",
            componentPackage = "textfield",
        )

    fun createTextAreaStyleGeneratorCompose() =
        createBaseTextFieldStyleGeneratorCompose(
            componentName = "text_area",
            componentPackage = "textarea",
        )

    fun createTextFieldClearStyleGeneratorCompose() =
        createBaseTextFieldStyleGeneratorCompose(
            componentName = "text_field_clear",
            componentPackage = "textfield.clear",
        )

    fun createTextAreaClearStyleGeneratorCompose() =
        createBaseTextFieldStyleGeneratorCompose(
            componentName = "text_area_clear",
            componentPackage = "textarea.clear",
        )

    fun createCellStyleGeneratorCompose() = CellComposeVariationGenerator(
        themeClassName = "${themeName.snakeToCamelCase()}Theme",
        themePackage = packageResolver.getPackage(TargetPackage.THEME),
        dimensionsConfig = dimensionsConfig,
        dimensAggregator = dimensAggregator,
        resourceReferenceProvider = resourceReferenceProvider,
        namespace = namespace,
        ktFileBuilderFactory = ktFileBuilderFactory,
        componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.cell",
        componentName = "cell",
        outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
        avatarStylesPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.avatar",
        iconButtonStylesPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.button.icon",
        checkBoxStylesPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.checkbox",
        radioBoxStylesPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.radiobox",
        switchStylesPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.switcher",
    )

    private fun createBaseTextFieldStyleGeneratorCompose(
        componentName: String,
        componentPackage: String,
    ) = TextFieldComposeVariationGenerator(
        themeClassName = "${themeName.snakeToCamelCase()}Theme",
        themePackage = packageResolver.getPackage(TargetPackage.THEME),
        chipStylesPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.chip",
        chipGroupStylesPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.chip.group",
        dimensionsConfig = dimensionsConfig,
        dimensAggregator = dimensAggregator,
        resourceReferenceProvider = resourceReferenceProvider,
        namespace = namespace,
        ktFileBuilderFactory = ktFileBuilderFactory,
        componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.$componentPackage",
        componentName = componentName,
        outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
    )

    fun createIndicatorStyleGeneratorCompose() =
        IndicatorComposeVariationGenerator(
            themeClassName = "${themeName.snakeToCamelCase()}Theme",
            themePackage = packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
            namespace = namespace,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.indicator",
            componentName = "indicator",
            outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
        )

    fun createBasicButtonStyleGeneratorCompose() =
        createBaseButtonStyleGeneratorCompose(
            componentName = "basic_button",
            componentPackage = "button.basic",
        )

    fun createLinkButtonStyleGeneratorCompose() =
        createBaseButtonStyleGeneratorCompose(
            componentName = "link_button",
            componentPackage = "button.link",
        )

    fun createIconButtonStyleGeneratorCompose() =
        createBaseButtonStyleGeneratorCompose(
            componentName = "icon_button",
            componentPackage = "button.icon",
        )

    private fun createBaseButtonStyleGeneratorCompose(
        componentName: String,
        componentPackage: String,
    ) = ButtonComposeVariationGenerator(
        themeClassName = "${themeName.snakeToCamelCase()}Theme",
        themePackage = packageResolver.getPackage(TargetPackage.THEME),
        dimensionsConfig = dimensionsConfig,
        dimensAggregator = dimensAggregator,
        resourceReferenceProvider = resourceReferenceProvider,
        namespace = namespace,
        ktFileBuilderFactory = ktFileBuilderFactory,
        componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.$componentPackage",
        componentName = componentName,
        outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
    )

    fun createDimensionGenerator(): DimenTokenGenerator = DimenTokenGenerator(
        outputResDir = outputResDir,
        dimensAggregator = dimensAggregator,
        dimensConfig = dimensionsConfig,
        xmlBuilderFactory = xmlBuilderFactory,
        filePrefix = "style",
    )
}
