package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.FontDownloaderFactory
import com.sdds.plugin.themebuilder.internal.factory.GeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlFontFamilyDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.FontToken
import com.sdds.plugin.themebuilder.internal.token.LinearGradientToken
import com.sdds.plugin.themebuilder.internal.token.RadialGradientToken
import com.sdds.plugin.themebuilder.internal.token.RoundedShapeToken
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.SweepGradientToken
import com.sdds.plugin.themebuilder.internal.token.Theme
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import kotlinx.serialization.json.decodeFromStream
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
     * Пакет модуля
     */
    @get:Input
    abstract val namespace: Property<String>

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
            XmlResourcesDocumentBuilderFactory(resourcesPrefix.get()),
            XmlFontFamilyDocumentBuilderFactory(),
            FontDownloaderFactory(),
            KtFileBuilderFactory(packageName.get()),
            ResourceReferenceProvider(resourcesPrefix.get()),
            namespace.get(),
            resourcesPrefix.get(),
        )
    }

    private val colorGenerator by unsafeLazy { generatorFactory.createColorGenerator() }
    private val gradientGenerator by unsafeLazy { generatorFactory.createGradientGenerator() }
    private val fontGenerator by unsafeLazy { generatorFactory.createFontGenerator() }
    private val typographyGenerator by unsafeLazy { generatorFactory.createTypographyGenerator() }
    private val dimensGenerator by unsafeLazy { generatorFactory.createDimensGenerator() }
    private val shapesGenerator by unsafeLazy { generatorFactory.createShapesGenerator() }
    private val shadowGenerator by unsafeLazy { generatorFactory.createShadowGenerator() }

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
                is ShadowToken -> shadowGenerator.addToken(it)
                is RoundedShapeToken -> shapesGenerator.addToken(it)
                is TypographyToken -> typographyGenerator.addToken(it)
                is FontToken -> fontGenerator.addToken(it)
            }
        }

        colorGenerator.generate()
        gradientGenerator.generate()
        typographyGenerator.generate()
        shapesGenerator.generate()
        shadowGenerator.generate()
        dimensGenerator.generate()
        fontGenerator.generate()
    }

    private fun decodeTheme(): Theme =
        themeFile.get().asFile.inputStream().use { stream ->
            Serializer.instance.decodeFromStream<Theme>(stream)
        }.also { logger.debug("decoded theme $it") }
}
