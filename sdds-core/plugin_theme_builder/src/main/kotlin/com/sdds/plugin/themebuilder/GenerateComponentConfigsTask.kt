package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.components.button.ButtonComponentConfig
import com.sdds.plugin.themebuilder.internal.factory.ComponentStyleGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
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
     * Путь для сохранения kt-файлов токенов
     */
    @get:OutputDirectory
    abstract val outputDirPath: Property<String>

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
     * Директория проекта
     */
    @get:OutputDirectory
    abstract val projectDir: DirectoryProperty

    private val packageResolver by unsafeLazy {
        PackageResolver(packageName.get())
    }

    private val componentStyleGeneratorFactory by unsafeLazy {
        ComponentStyleGeneratorFactory(
            outputDirPath = outputDirPath.get(),
            projectDir = projectDir,
            ktFileBuilderFactory = KtFileBuilderFactory(packageResolver),
            packageResolver = packageResolver,
            themeName = themeName.get(),
        )
    }

    private val basicButtonStyleGenerator by unsafeLazy {
        componentStyleGeneratorFactory.createBasicButtonStyleGeneratorCompose()
    }

    private val iconButtonStyleGenerator by unsafeLazy {
        componentStyleGeneratorFactory.createIconButtonStyleGeneratorCompose()
    }

    private val linkButtonStyleGenerator by unsafeLazy {
        componentStyleGeneratorFactory.createLinkButtonStyleGeneratorCompose()
    }

    private val basicButtonConfig: ButtonComponentConfig by unsafeLazy {
        basicButtonConfigFile.get()
            .asFile
            .decode<ButtonComponentConfig>(Serializer.componentConfig)
    }

    private val iconButtonConfig: ButtonComponentConfig by unsafeLazy {
        iconButtonConfigFile.get()
            .asFile
            .decode<ButtonComponentConfig>(Serializer.componentConfig)
    }

    private val linkButtonConfig: ButtonComponentConfig by unsafeLazy {
        linkButtonConfigFile.get()
            .asFile
            .decode<ButtonComponentConfig>(Serializer.componentConfig)
    }

    @TaskAction
    fun generate() {
        basicButtonStyleGenerator.generate(basicButtonConfig)
        iconButtonStyleGenerator.generate(iconButtonConfig)
        linkButtonStyleGenerator.generate(linkButtonConfig)
    }
}
