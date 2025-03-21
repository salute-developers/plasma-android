package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.badge.compose.BadgeComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.button.compose.ButtonComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.button.view.BasicButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.button.view.IconButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.button.view.LinkButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.card.compose.CardComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.card.vs.CardStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.cell.compose.CellComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.counter.compose.CounterComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.counter.view.CounterStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.indicator.compose.IndicatorComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.indicator.view.IndicatorStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.segment.SegmentComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.segment.item.SegmentItemComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.textfield.compose.TextFieldComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.textfield.compose.TextFieldComposeVariationGenerator.TextFieldType
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

    private val themeClassName = "${themeName.snakeToCamelCase()}Theme"

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

    fun createCounterStyleGeneratorView(): CounterStyleGeneratorView =
        CounterStyleGeneratorView(
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
            textFieldType = TextFieldType.TextField,
        )

    fun createTextAreaStyleGeneratorCompose() =
        createBaseTextFieldStyleGeneratorCompose(
            componentName = "text_area",
            componentPackage = "textarea",
            textFieldType = TextFieldType.TextArea,
        )

    fun createTextFieldClearStyleGeneratorCompose() =
        createBaseTextFieldStyleGeneratorCompose(
            componentName = "text_field_clear",
            componentPackage = "textfield.clear",
            textFieldType = TextFieldType.TextFieldClear,
        )

    fun createTextAreaClearStyleGeneratorCompose() =
        createBaseTextFieldStyleGeneratorCompose(
            componentName = "text_area_clear",
            componentPackage = "textarea.clear",
            textFieldType = TextFieldType.TextAreaClear,
        )

    fun createCellStyleGeneratorCompose() = CellComposeVariationGenerator(
        themeClassName = themeClassName,
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
        textFieldType: TextFieldType,
    ) = TextFieldComposeVariationGenerator(
        themeClassName = themeClassName,
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
        textFieldType = textFieldType,
        styleBuilderName = "TextFieldStyleBuilder",
    )

    fun createIndicatorStyleGeneratorCompose() =
        IndicatorComposeVariationGenerator(
            themeClassName = themeClassName,
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

    fun createCounterStyleGeneratorCompose() =
        CounterComposeVariationGenerator(
            themeClassName = themeClassName,
            themePackage = packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
            namespace = namespace,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.counter",
            componentName = "counter",
            outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
        )

    fun createCardStyleGeneratorCompose() =
        createCardStyleGeneratorCompose(componentName = "card_solid")

    fun createCardClearStyleGeneratorCompose() =
        createCardStyleGeneratorCompose(componentName = "card_clear")

    private fun createCardStyleGeneratorCompose(
        componentName: String,
    ) =
        CardComposeVariationGenerator(
            themeClassName = themeClassName,
            themePackage = packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
            namespace = namespace,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.card",
            componentName = componentName,
            outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
            styleBuilderName = "CardStyleBuilder",
        )

    fun createBasicButtonStyleGeneratorCompose() =
        createBaseButtonStyleGeneratorCompose(
            componentName = "basic_button",
            componentPackage = "button.basic",
            styleBuilderFactoryFunName = "basicButtonBuilder",
        )

    fun createLinkButtonStyleGeneratorCompose() =
        createBaseButtonStyleGeneratorCompose(
            componentName = "link_button",
            componentPackage = "button.link",
            styleBuilderFactoryFunName = "linkButtonBuilder",
        )

    fun createIconButtonStyleGeneratorCompose() =
        createBaseButtonStyleGeneratorCompose(
            componentName = "icon_button",
            componentPackage = "button.icon",
            styleBuilderFactoryFunName = "iconButtonBuilder",
        )

    private fun createBaseButtonStyleGeneratorCompose(
        componentName: String,
        componentPackage: String,
        styleBuilderFactoryFunName: String,
    ) = ButtonComposeVariationGenerator(
        themeClassName = themeClassName,
        themePackage = packageResolver.getPackage(TargetPackage.THEME),
        dimensionsConfig = dimensionsConfig,
        dimensAggregator = dimensAggregator,
        resourceReferenceProvider = resourceReferenceProvider,
        namespace = namespace,
        ktFileBuilderFactory = ktFileBuilderFactory,
        componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.$componentPackage",
        componentName = componentName,
        outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
        styleBuilderFactoryFunName = styleBuilderFactoryFunName,
    )

    fun createBadgeStyleGeneratorCompose() =
        createBadgeStyleGeneratorCompose(
            componentName = "badge_solid",
        )

    fun createBadgeClearStyleGeneratorCompose() =
        createBadgeStyleGeneratorCompose(
            componentName = "badge_clear",
        )

    fun createBadgeTransparentStyleGeneratorCompose() =
        createBadgeStyleGeneratorCompose(
            componentName = "badge_transparent",
        )

    private fun createBadgeStyleGeneratorCompose(
        componentName: String,
    ) =
        BadgeComposeVariationGenerator(
            themeClassName = themeClassName,
            themePackage = packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
            namespace = namespace,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.badge",
            componentName = componentName,
            outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
            styleBuilderName = "BadgeStyleBuilder",
            styleBuilderFactoryFunName = "badgeBuilder",
        )

    fun createIconBadgeStyleGeneratorCompose() =
        createIconBadgeStyleGeneratorCompose(
            componentName = "icon_badge_solid",
        )

    fun createIconBadgeClearStyleGeneratorCompose() =
        createIconBadgeStyleGeneratorCompose(
            componentName = "icon_badge_clear",
        )

    fun createIconBadgeTransparentStyleGeneratorCompose() =
        createIconBadgeStyleGeneratorCompose(
            componentName = "icon_badge_transparent",
        )

    fun createCardStyleGeneratorView(styleComponentName: String): CardStyleGeneratorView = CardStyleGeneratorView(
        xmlBuilderFactory = xmlBuilderFactory,
        resourceReferenceProvider = resourceReferenceProvider,
        dimensAggregator = dimensAggregator,
        outputResDir = outputResDir,
        styleComponentName = styleComponentName,
        resourcePrefix = resourcePrefixConfig.resourcePrefix,
        viewColorStateGeneratorFactory = mViewColorStateGeneratorFactory,
        colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    )

    private fun createIconBadgeStyleGeneratorCompose(
        componentName: String,
    ) =
        BadgeComposeVariationGenerator(
            themeClassName = themeClassName,
            themePackage = packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
            namespace = namespace,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.badge.icon",
            componentName = componentName,
            outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
            styleBuilderName = "IconBadgeStyleBuilder",
            styleBuilderFactoryFunName = "iconBadgeBuilder",
        )

    fun createSegmentItemStyleGeneratorCompose() = SegmentItemComposeVariationGenerator(
        themeClassName = themeClassName,
        themePackage = packageResolver.getPackage(TargetPackage.THEME),
        dimensionsConfig = dimensionsConfig,
        dimensAggregator = dimensAggregator,
        resourceReferenceProvider = resourceReferenceProvider,
        namespace = namespace,
        ktFileBuilderFactory = ktFileBuilderFactory,
        componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.segment.item",
        componentName = "segment_item",
        outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
        counterStylesPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.counter",
    )

    fun createSegmentStyleGeneratorCompose() = SegmentComposeVariationGenerator(
        themeClassName = themeClassName,
        themePackage = packageResolver.getPackage(TargetPackage.THEME),
        dimensionsConfig = dimensionsConfig,
        dimensAggregator = dimensAggregator,
        resourceReferenceProvider = resourceReferenceProvider,
        namespace = namespace,
        ktFileBuilderFactory = ktFileBuilderFactory,
        componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.segment",
        componentName = "segment",
        outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
        segmentItemStylesPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.segment.item",
    )

    fun createDimensionGenerator(): DimenTokenGenerator = DimenTokenGenerator(
        outputResDir = outputResDir,
        dimensAggregator = dimensAggregator,
        dimensConfig = dimensionsConfig,
        xmlBuilderFactory = xmlBuilderFactory,
        filePrefix = "style",
    )
}
