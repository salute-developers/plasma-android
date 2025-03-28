package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.components.badge.BadgeConfig
import com.sdds.plugin.themebuilder.internal.components.button.ButtonConfig
import com.sdds.plugin.themebuilder.internal.components.card.CardConfig
import com.sdds.plugin.themebuilder.internal.components.cell.CellConfig
import com.sdds.plugin.themebuilder.internal.components.counter.CounterConfig
import com.sdds.plugin.themebuilder.internal.components.divider.DividerConfig
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorConfig
import com.sdds.plugin.themebuilder.internal.components.segment.SegmentConfig
import com.sdds.plugin.themebuilder.internal.components.segment.item.SegmentItemConfig
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldConfig
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ComponentStyleGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.provideDelegate

internal abstract class GenerateComponentConfigsTask : DefaultTask() {

    /**
     * Файл с конфигом BasicButton
     */
    @get:InputFile
    abstract val basicButtonConfigFile: RegularFileProperty

    /**
     * Файл с конфигом IconButton
     */
    @get:InputFile
    abstract val iconButtonConfigFile: RegularFileProperty

    /**
     * Файл с конфигом LinkButton
     */
    @get:InputFile
    abstract val linkButtonConfigFile: RegularFileProperty

    /**
     * Файл с конфигом TextField
     */
    @get:InputFile
    abstract val textFieldConfigFile: RegularFileProperty

    /**
     * Файл с конфигом TextFieldClear
     */
    @get:InputFile
    abstract val textFieldClearConfigFile: RegularFileProperty

    /**
     * Файл с конфигом TextArea
     */
    @get:InputFile
    abstract val textAreaConfigFile: RegularFileProperty

    /**
     * Файл с конфигом TextAreaClear
     */
    @get:InputFile
    abstract val textAreaClearConfigFile: RegularFileProperty

    /**
     * Файл с конфигом Cell
     */
    @get:InputFile
    abstract val cellConfigFile: RegularFileProperty

    /**
     * Файл с конфигом Card
     */
    @get:InputFile
    abstract val cardConfigFile: RegularFileProperty

    /**
     * Файл с конфигом CardClear
     */
    @get:InputFile
    abstract val cardClearConfigFile: RegularFileProperty

    /**
     * Файл с конфигом Indicator
     */
    @get:InputFile
    abstract val indicatorConfigFile: RegularFileProperty

    /**
     * Файл с конфигом Counter
     */
    @get:InputFile
    abstract val counterConfigFile: RegularFileProperty

    /**
     * Файл с конфигом Badge
     */
    @get:InputFile
    abstract val badgeConfigFile: RegularFileProperty

    /**
     * Файл с конфигом BadgeClear
     */
    @get:InputFile
    abstract val badgeClearConfigFile: RegularFileProperty

    /**
     * Файл с конфигом BadgeTransparent
     */
    @get:InputFile
    abstract val badgeTransparentConfigFile: RegularFileProperty

    /**
     * Файл с конфигом IconBadge
     */
    @get:InputFile
    abstract val iconBadgeConfigFile: RegularFileProperty

    /**
     * Файл с конфигом IconBadgeClear
     */
    @get:InputFile
    abstract val iconBadgeClearConfigFile: RegularFileProperty

    /**
     * Файл с конфигом IconBadgeTransparent
     */
    @get:InputFile
    abstract val iconBadgeTransparentConfigFile: RegularFileProperty

    /**
     * Файл с конфигом SegmentItem
     */
    @get:InputFile
    abstract val segmentItemConfigFile: RegularFileProperty

    /**
     * Файл с конфигом Segment
     */
    @get:InputFile
    abstract val segmentConfigFile: RegularFileProperty

    /**
     * Файл с конфигом Divider
     */
    @get:InputFile
    abstract val dividerConfigFile: RegularFileProperty

    /**
     * Путь для сохранения kt-файлов токенов
     */
    @get:OutputDirectory
    abstract val outputDirPath: Property<String>

    /**
     * Путь для сохранения файлов ресурсов
     */
    @get:OutputDirectory
    abstract val outputResDirPath: Property<String>

    /**
     * Название пакета для файлов kotlin
     */
    @get:Input
    abstract val packageName: Property<String>

    /**
     * Название темы
     */
    @get:Input
    abstract val themeName: Property<String>

    /**
     * Пакет модуля
     */
    @get:Input
    abstract val namespace: Property<String>

    /**
     * Директория проекта
     */
    @get:OutputDirectory
    abstract val projectDir: DirectoryProperty

    /**
     * Конфигурация размеров
     */
    @get:Input
    abstract val dimensionsConfig: Property<DimensionsConfig>

    /**
     * Префикс для названий ресурсов токенов
     */
    @get:Input
    abstract val resourcesPrefixConfig: Property<ResourcePrefixConfig>

    /**
     * Целевой фреймворк
     */
    @get:Input
    abstract val target: Property<ThemeBuilderTarget>

    private val packageResolver by unsafeLazy {
        PackageResolver(packageName.get())
    }

    private val dimensAggregator by unsafeLazy { DimensAggregator() }
    private val dimensGenerator by unsafeLazy { componentStyleGeneratorFactory.createDimensionGenerator() }

    private val componentStyleGeneratorFactory by unsafeLazy {
        val resPrefixConfig = resourcesPrefixConfig.get()
        val themeName = themeName.get()
        val xmlBuilderFactory = XmlResourcesDocumentBuilderFactory(
            resPrefixConfig.resourcePrefix,
            themeName,
        )
        val ktFileBuilderFactory = KtFileBuilderFactory(packageResolver)
        ComponentStyleGeneratorFactory(
            outputDirPath = outputDirPath.get(),
            outputResDirPath = outputResDirPath.get(),
            projectDir = projectDir,
            ktFileBuilderFactory = ktFileBuilderFactory,
            xmlBuilderFactory = xmlBuilderFactory,
            packageResolver = packageResolver,
            themeName = themeName,
            namespace = namespace.get(),
            dimensionsConfig = dimensionsConfig.get(),
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = ResourceReferenceProvider(
                resourcePrefix = resPrefixConfig.resourcePrefix,
                themeName = themeName,
            ),
            resourcePrefixConfig = resPrefixConfig,
        )
    }

    private val basicButtonStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createBasicButtonStyleGeneratorCompose()
    }

    private val basicButtonStyleGeneratorView by unsafeLazy {
        componentStyleGeneratorFactory.createBasicButtonStyleGeneratorView()
    }

    private val iconButtonStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createIconButtonStyleGeneratorCompose()
    }

    private val iconButtonStyleGeneratorView by unsafeLazy {
        componentStyleGeneratorFactory.createIconButtonStyleGeneratorView()
    }

    private val indicatorStyleGeneratorView by unsafeLazy {
        componentStyleGeneratorFactory.createIndicatorStyleGeneratorView()
    }

    private val indicatorStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createIndicatorStyleGeneratorCompose()
    }

    private val counterStyleGeneratorView by unsafeLazy {
        componentStyleGeneratorFactory.createCounterStyleGeneratorView()
    }

    private val linkButtonStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createLinkButtonStyleGeneratorCompose()
    }

    private val linkButtonStyleGeneratorView by unsafeLazy {
        componentStyleGeneratorFactory.createLinkButtonStyleGeneratorView()
    }

    private val textFieldStyleGeneratorView by unsafeLazy {
        componentStyleGeneratorFactory.createTextFieldStyleGeneratorView()
    }

    private val textAreaStyleGeneratorView by unsafeLazy {
        componentStyleGeneratorFactory.createTextAreaStyleGeneratorView()
    }

    private val textFieldStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createTextFieldStyleGeneratorCompose()
    }

    private val textFieldClearStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createTextFieldClearStyleGeneratorCompose()
    }

    private val textAreaStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createTextAreaStyleGeneratorCompose()
    }

    private val textAreaClearStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createTextAreaClearStyleGeneratorCompose()
    }

    private val badgeStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createBadgeStyleGeneratorCompose()
    }

    private val badgeClearStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createBadgeClearStyleGeneratorCompose()
    }

    private val badgeTransparentStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createBadgeTransparentStyleGeneratorCompose()
    }

    private val iconBadgeStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createIconBadgeStyleGeneratorCompose()
    }

    private val iconBadgeClearStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createIconBadgeClearStyleGeneratorCompose()
    }

    private val iconBadgeTransparentStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createIconBadgeTransparentStyleGeneratorCompose()
    }

    private val cellStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createCellStyleGeneratorCompose()
    }

    private val cardStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createCardStyleGeneratorCompose()
    }

    private val cardClearStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createCardClearStyleGeneratorCompose()
    }

    private val counterStyleGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createCounterStyleGeneratorCompose()
    }

    private val segmentItemGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createSegmentItemStyleGeneratorCompose()
    }

    private val segmentGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createSegmentStyleGeneratorCompose()
    }

    private val cardSolidStyleGeneratorView by unsafeLazy {
        componentStyleGeneratorFactory.createCardStyleGeneratorView("CardSolid")
    }

    private val cardClearStyleGeneratorView by unsafeLazy {
        componentStyleGeneratorFactory.createCardStyleGeneratorView("CardClear")
    }

    private val dividerGeneratorCompose by unsafeLazy {
        componentStyleGeneratorFactory.createDividerStyleGeneratorCompose()
    }

    private val dividerGeneratorView by unsafeLazy {
        componentStyleGeneratorFactory.createDividerStyleGeneratorView()
    }

    private val basicButtonConfig: ButtonConfig by unsafeLazy {
        basicButtonConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val iconButtonConfig: ButtonConfig by unsafeLazy {
        iconButtonConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val indicatorConfig: IndicatorConfig by unsafeLazy {
        indicatorConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val counterConfig: CounterConfig by unsafeLazy {
        counterConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val linkButtonConfig: ButtonConfig by unsafeLazy {
        linkButtonConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val textFieldConfig: TextFieldConfig by unsafeLazy {
        textFieldConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val textFieldClearConfig: TextFieldConfig by unsafeLazy {
        textFieldClearConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val textAreaConfig: TextFieldConfig by unsafeLazy {
        textAreaConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val textAreaClearConfig: TextFieldConfig by unsafeLazy {
        textAreaClearConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val cellConfig: CellConfig by unsafeLazy {
        cellConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val cardConfig: CardConfig by unsafeLazy {
        cardConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val cardClearConfig: CardConfig by unsafeLazy {
        cardClearConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val badgeConfig: BadgeConfig by unsafeLazy {
        badgeConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val badgeClearConfig: BadgeConfig by unsafeLazy {
        badgeClearConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val badgeTransparentConfig: BadgeConfig by unsafeLazy {
        badgeTransparentConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val iconBadgeConfig: BadgeConfig by unsafeLazy {
        iconBadgeConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val iconBadgeClearConfig: BadgeConfig by unsafeLazy {
        iconBadgeClearConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val iconBadgeTransparentConfig: BadgeConfig by unsafeLazy {
        iconBadgeTransparentConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val segmentItemConfig: SegmentItemConfig by unsafeLazy {
        segmentItemConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val segmentConfig: SegmentConfig by unsafeLazy {
        segmentConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    private val dividerConfig: DividerConfig by unsafeLazy {
        dividerConfigFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    @TaskAction
    fun generate() {
        when (target.get()) {
            ThemeBuilderTarget.VIEW_SYSTEM -> generateViewsConfigs()
            ThemeBuilderTarget.COMPOSE -> generateComposeConfigs()
            ThemeBuilderTarget.ALL -> {
                generateViewsConfigs()
                generateComposeConfigs()
            }
            else -> {}
        }
        dimensGenerator.generate()
    }

    private fun generateComposeConfigs() {
        basicButtonStyleGeneratorCompose.generate(basicButtonConfig)
        iconButtonStyleGeneratorCompose.generate(iconButtonConfig)
        indicatorStyleGeneratorCompose.generate(indicatorConfig)
        linkButtonStyleGeneratorCompose.generate(linkButtonConfig)
        textFieldStyleGeneratorCompose.generate(textFieldConfig)
        textFieldClearStyleGeneratorCompose.generate(textFieldClearConfig)
        textAreaStyleGeneratorCompose.generate(textAreaConfig)
        textAreaClearStyleGeneratorCompose.generate(textAreaClearConfig)
        badgeStyleGeneratorCompose.generate(badgeConfig)
        badgeClearStyleGeneratorCompose.generate(badgeClearConfig)
        badgeTransparentStyleGeneratorCompose.generate(badgeTransparentConfig)
        iconBadgeStyleGeneratorCompose.generate(iconBadgeConfig)
        iconBadgeClearStyleGeneratorCompose.generate(iconBadgeClearConfig)
        iconBadgeTransparentStyleGeneratorCompose.generate(iconBadgeTransparentConfig)
        segmentItemGeneratorCompose.generate(segmentItemConfig)
        segmentGeneratorCompose.generate(segmentConfig)
        cellStyleGeneratorCompose.generate(cellConfig)
        counterStyleGeneratorCompose.generate(counterConfig)
        cardStyleGeneratorCompose.generate(cardConfig)
        cardClearStyleGeneratorCompose.generate(cardClearConfig)
        dividerGeneratorCompose.generate(dividerConfig)
    }

    private fun generateViewsConfigs() {
        basicButtonStyleGeneratorView.generate(basicButtonConfig)
        iconButtonStyleGeneratorView.generate(iconButtonConfig)
        indicatorStyleGeneratorView.generate(indicatorConfig)
        linkButtonStyleGeneratorView.generate(linkButtonConfig)
        textFieldStyleGeneratorView.generate(textFieldConfig)
        textAreaStyleGeneratorView.generate(textAreaConfig)
        counterStyleGeneratorView.generate(counterConfig)
        cardSolidStyleGeneratorView.generate(cardConfig)
        cardClearStyleGeneratorView.generate(cardClearConfig)
        dividerGeneratorView.generate(dividerConfig)
    }
}
