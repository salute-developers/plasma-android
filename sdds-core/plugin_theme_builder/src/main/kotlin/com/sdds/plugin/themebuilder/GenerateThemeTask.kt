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
import com.sdds.plugin.themebuilder.internal.token.FontTokenValue
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.ShadowTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.token.ShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.Theme
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
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

/**
 * Gradle-задача для генерации темы
 * @author Малышев Александр on 05.03.2024
 */
abstract class GenerateThemeTask : DefaultTask() {

    /**
     * Путь до json-файла с темой
     */
    @get:InputFile
    abstract val baseFile: RegularFileProperty

    /**
     * Путь до json-файла с цветами
     */
    @get:InputFile
    abstract val colorFile: RegularFileProperty

    /**
     * Путь до json-файла с типографикой
     */
    @get:InputFile
    abstract val typographyFile: RegularFileProperty

    /**
     * Путь до json-файла со шрифтами
     */
    @get:InputFile
    abstract val fontFile: RegularFileProperty

    /**
     * Путь до json-файла с тенями
     */
    @get:InputFile
    abstract val shadowFile: RegularFileProperty

    /**
     * Путь до json-файла с градиентами
     */
    @get:InputFile
    abstract val gradientFile: RegularFileProperty

    /**
     * Путь до json-файла с формами
     */
    @get:InputFile
    abstract val shapeFile: RegularFileProperty

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
     * Название родительской темы, от которой будет унаследована генерируемая тема
     */
    @get:Input
    abstract val parentThemeName: Property<String>

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
            outputDir = outputDir.get().asFile,
            outputResDir = outputResDir.get().asFile,
            target = target.get(),
            dimensAggregator = dimensAggregator,
            xmlResourcesDocumentBuilderFactory = XmlResourcesDocumentBuilderFactory(resourcesPrefix.get()),
            xmlFontFamilyDocumentBuilderFactory = XmlFontFamilyDocumentBuilderFactory(),
            fontDownloaderFactory = FontDownloaderFactory(),
            ktFileBuilderFactory = KtFileBuilderFactory(packageName.get()),
            resourceReferenceProvider = ResourceReferenceProvider(resourcesPrefix.get()),
            namespace = namespace.get(),
            resPrefix = resourcesPrefix.get(),
            parentThemeName = parentThemeName.get(),
        )
    }

    private val themeGenerator by unsafeLazy { generatorFactory.createThemeGenerator() }
    private val colorGenerator by unsafeLazy {
        generatorFactory.createColorGenerator(colors, themeGenerator)
    }
    private val gradientGenerator by unsafeLazy { generatorFactory.createGradientGenerator(gradients) }
    private val fontGenerator by unsafeLazy { generatorFactory.createFontGenerator(fonts) }
    private val typographyGenerator by unsafeLazy {
        generatorFactory.createTypographyGenerator(typography)
    }
    private val dimensGenerator by unsafeLazy { generatorFactory.createDimensGenerator() }
    private val shapesGenerator by unsafeLazy { generatorFactory.createShapesGenerator(shapes) }
    private val shadowGenerator by unsafeLazy { generatorFactory.createShadowGenerator(shadows) }

    /**
     * Генерирует файлы с токенами
     */
    @TaskAction
    fun generate() {
        collectTokens()
        generateAll()
    }

    private fun collectTokens() {
        decodeBase().tokens.onEach {
            when (it) {
                is ColorToken -> colorGenerator.addToken(it)
                is GradientToken -> gradientGenerator.addToken(it)
                is ShadowToken -> shadowGenerator.addToken(it)
                is ShapeToken -> shapesGenerator.addToken(it)
                is TypographyToken -> typographyGenerator.addToken(it)
                is FontToken -> fontGenerator.addToken(it)
            }
        }
    }

    private fun generateAll() {
        colorGenerator.generate()
        gradientGenerator.generate()
        typographyGenerator.generate()
        shapesGenerator.generate()
        shadowGenerator.generate()
        dimensGenerator.generate()
        fontGenerator.generate()

        themeGenerator.generate()
    }

    private fun decodeBase(): Theme =
        baseFile.get().asFile.decode<Theme>(Serializer.meta).also { logger.debug("decoded base $it") }

    private val colors: Map<String, String> by unsafeLazy {
        colorFile.get().asFile.decode<Map<String, String>>()
            .also { logger.debug("decoded colors $it") }
    }

    private val shapes: Map<String, ShapeTokenValue> by unsafeLazy {
        shapeFile.get().asFile.decode<Map<String, ShapeTokenValue>>()
            .also { logger.debug("decoded shapes $it") }
    }

    private val gradients: Map<String, List<GradientTokenValue>> by unsafeLazy {
        gradientFile.get().asFile.decode<Map<String, List<GradientTokenValue>>>()
            .also { logger.debug("decoded gradients $it") }
    }

    private val shadows: Map<String, ShadowTokenValue> by unsafeLazy {
        shadowFile.get().asFile.decode<Map<String, ShadowTokenValue>>()
            .also { logger.debug("decoded shadows $it") }
    }

    private val typography: Map<String, TypographyTokenValue> by unsafeLazy {
        typographyFile.get().asFile.decode<Map<String, TypographyTokenValue>>()
            .also { logger.debug("decoded typography $it") }
    }

    private val fonts: Map<String, FontTokenValue> by unsafeLazy {
        fontFile.get().asFile.decode<Map<String, FontTokenValue>>()
            .also { logger.debug("decoded fonts $it") }
    }
}
