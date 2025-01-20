package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.components.button.ButtonConfig
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
        linkButtonStyleGeneratorCompose.generate(linkButtonConfig)
        textFieldStyleGeneratorCompose.generate(textFieldConfig)
        textFieldClearStyleGeneratorCompose.generate(textFieldClearConfig)
        textAreaStyleGeneratorCompose.generate(textAreaConfig)
        textAreaClearStyleGeneratorCompose.generate(textAreaClearConfig)
    }

    private fun generateViewsConfigs() {
        basicButtonStyleGeneratorView.generate(basicButtonConfig)
        iconButtonStyleGeneratorView.generate(iconButtonConfig)
        linkButtonStyleGeneratorView.generate(linkButtonConfig)
        textFieldStyleGeneratorView.generate(textFieldConfig)
        textAreaStyleGeneratorView.generate(textAreaConfig)
    }
}
