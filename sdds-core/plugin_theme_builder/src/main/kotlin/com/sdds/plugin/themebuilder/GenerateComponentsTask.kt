package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Components
import com.sdds.plugin.themebuilder.internal.components.componentDelegates
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.provideDelegate
import java.io.File

internal abstract class GenerateComponentsTask : DefaultTask() {

    /**
     * Директория с конфигами
     */
    @get:InputDirectory
    abstract val componentsDir: DirectoryProperty

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
     * Название темы
     */
    @get:Input
    abstract val themeName: Property<String>

    /**
     * Целевой фреймворк
     */
    @get:Input
    abstract val target: Property<ThemeBuilderTarget>

    @TaskAction
    @Suppress("TooGenericExceptionCaught")
    fun generate() {
        val deps = getGeneratorDependencies()
        val componentsDir = componentsDir.get()

        metaInfo.components.forEach { component ->
            try {
                val configFile = componentsDir
                    .file(component.config)
                    .asFile
                val componentDelegate = componentDelegates[component.componentName]
                componentDelegate?.generate(
                    file = configFile,
                    deps = deps,
                    component = component,
                )
            } catch (e: Exception) {
                logger.error("Style generating failed for component ${component.config}", e)
            }
        }

        if (target.get().isViewSystemOrAll || dimensionsConfig.get().fromResources) {
            deps.dimensGenerator.generate()
        }
    }

    private val metaInfo: Components by unsafeLazy {
        componentsDir
            .get()
            .file(META_FILE_NAME)
            .asFile
            .decode(Serializer.componentConfig)
    }

    private fun getGeneratorDependencies(): StyleGeneratorDependencies {
        val themeName = themeName.get()
        val packageResolver = PackageResolver(packageName.get())
        val outputDir: File = projectDir.get().dir(outputDirPath.get()).asFile
        val outputResDir: File = projectDir.get().dir(outputResDirPath.get()).asFile
        val xmlBuilderFactory = XmlResourcesDocumentBuilderFactory(
            tokenPrefix = resourcesPrefixConfig.get().resourcePrefix,
            themeName = themeName,
        )
        val ktFileBuilderFactory = KtFileBuilderFactory(packageResolver)
        val mViewColorStateGeneratorFactory = ViewColorStateGeneratorFactory(
            ktFileBuilderFactory = ktFileBuilderFactory,
            xmlBuilderFactory = xmlBuilderFactory,
            outputResDir = outputResDir,
            colorStateOutputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
            resourcePrefixConfig = resourcesPrefixConfig.get(),
            namespace = namespace.get(),
            packageResolver = packageResolver,
        )
        val colorStateListGeneratorFactory = ColorStateListGeneratorFactory(
            xmlBuilderFactory = xmlBuilderFactory,
            resourcePrefixConfig = resourcesPrefixConfig.get(),
            outputResDir = outputResDir,
        )

        return StyleGeneratorDependencies(
            outputResDir = outputResDir,
            outputDir = outputDir,
            projectDir = projectDir,
            ktFileBuilderFactory = ktFileBuilderFactory,
            xmlBuilderFactory = xmlBuilderFactory,
            themeClassName = "${themeName.snakeToCamelCase()}Theme",
            namespace = namespace.get(),
            dimensionsConfig = dimensionsConfig.get(),
            resourceReferenceProvider = ResourceReferenceProvider(
                resourcePrefix = resourcesPrefixConfig.get().resourcePrefix,
                themeName = themeName,
            ),
            resourcePrefixConfig = resourcesPrefixConfig.get(),
            viewColorStateGeneratorFactory = mViewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = colorStateListGeneratorFactory,
            packageResolver = packageResolver,
            target = target.get(),
        )
    }

    private companion object {
        const val META_FILE_NAME = "meta.json"
    }
}
