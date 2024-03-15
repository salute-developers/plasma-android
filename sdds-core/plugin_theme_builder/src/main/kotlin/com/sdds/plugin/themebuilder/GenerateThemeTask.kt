package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.GeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.LinearGradientToken
import com.sdds.plugin.themebuilder.internal.token.RadialGradientToken
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.SweepGradientToken
import com.sdds.plugin.themebuilder.internal.token.Theme
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import kotlinx.serialization.decodeFromString
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

/**
 * Gradle-задача для генерации темы
 * @author Малышев Александр on 05.03.2024
 */
abstract class GenerateThemeTask : DefaultTask() {

    /**
     * Путь до json-файла с темой
     */
    @get:InputFile
    abstract val themeFile: RegularFileProperty

    /**
     * Название пакета для файлов kotlin
     */
    @get:Input
    abstract val packageName: Property<String>

    /**
     * Префикс для названий ресурсов токенов
     */
    @get:Input
    abstract val resourcesPrefix: Property<String>

    /**
     * Целевой фреймворк
     */
    @get:Input
    abstract val target: Property<ThemeBuilderTarget>

    /**
     * Директория для сохранения kt-файлов токенов
     */
    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty

    /**
     * Директория для сохранения xml-файлов токенов
     */
    @get:OutputDirectory
    abstract val outputResDir: DirectoryProperty

    private val dimensAggregator by unsafeLazy { DimensAggregator() }
    private val generatorFactory by unsafeLazy {
        GeneratorFactory(
            outputDir.get().asFile,
            outputResDir.get().asFile,
            target.get(),
            dimensAggregator,
            XmlDocumentBuilderFactory(resourcesPrefix.get()),
            KtFileBuilderFactory(packageName.get()),
            ResourceReferenceProvider(resourcesPrefix.get()),
        )
    }

    private val colorGenerator by unsafeLazy { generatorFactory.createColorGenerator() }
    private val gradientGenerator by unsafeLazy { generatorFactory.createGradientGenerator() }
    private val typographyGenerator by unsafeLazy { generatorFactory.createTypographyGenerator() }
    private val dimensGenerator by unsafeLazy { generatorFactory.createDimensGenerator() }

    /**
     * Генерирует файлы с токенами
     */
    @TaskAction
    fun generate() {
        decodeTheme().tokens.onEach {
            when (it) {
                is ColorToken -> colorGenerator.addToken(it)
                is SweepGradientToken -> gradientGenerator.addToken(it)
                is LinearGradientToken -> gradientGenerator.addToken(it)
                is RadialGradientToken -> gradientGenerator.addToken(it)
                is ShadowToken -> {}
                is TypographyToken -> typographyGenerator.addToken(it)
            }
        }

        colorGenerator.generate()
        gradientGenerator.generate()
        typographyGenerator.generate()
        dimensGenerator.generate()
    }

    private fun decodeTheme(): Theme {
        val readFile = themeFile.get().asFile.readText()
        val theme = Serializer.instance.decodeFromString<Theme>(readFile)
        logger.debug("decoded theme $theme")
        return theme
    }
}
