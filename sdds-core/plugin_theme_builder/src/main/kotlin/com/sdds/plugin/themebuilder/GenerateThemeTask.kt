package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.FontDownloaderFactory
import com.sdds.plugin.themebuilder.internal.factory.GeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlFontFamilyDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.fonts.FontsAggregator
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
import org.gradle.api.provider.ListProperty
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
     * Название темы
     */
    @get:Input
    abstract val themeName: Property<String>

    /**
     * Путь до json-файла с палитрой
     */
    @get:InputFile
    abstract val paletteFile: RegularFileProperty

    /**
     * Путь до json-файла с темой
     */
    @get:InputFile
    abstract val metaFile: RegularFileProperty

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
    abstract val resourcesPrefixConfig: Property<ResourcePrefixConfig>

    /**
     * Список родительских тем, от которых будут унаследованы генерируемые темы для view
     */
    @get:Input
    abstract val viewThemeParents: ListProperty<ViewThemeParent>

    /**
     * Список конфигов для генерации shape-токенов
     */
    @get:Input
    abstract val viewShapeAppearanceConfig: ListProperty<ShapeAppearanceConfig>

    /**
     * Режим генерации: токены или тема
     */
    @get:Input
    abstract val generatorMode: Property<ThemeBuilderMode>

    /**
     * Целевой фреймворк
     */
    @get:Input
    abstract val target: Property<ThemeBuilderTarget>

    /**
     * Директория проекта
     */
    @get:OutputDirectory
    abstract val projectDir: DirectoryProperty

    /**
     * Путь для сохранения kt-файлов токенов
     */
    @get:OutputDirectory
    abstract val outputDirPath: Property<String>

    /**
     * Путь для сохранения xml-файлов токенов
     */
    @get:OutputDirectory
    abstract val outputResDirPath: Property<String>

    /**
     * Конфигурация размеров
     */
    @get:Input
    abstract val dimensionsConfig: Property<DimensionsConfig>

    private val dimensAggregator by unsafeLazy { DimensAggregator() }
    private val fontsAggregator by unsafeLazy { FontsAggregator() }
    private val packageResolver by unsafeLazy { PackageResolver(packageName.get()) }
    private val generatorFactory by unsafeLazy {
        GeneratorFactory(
            outputDirPath = outputDirPath.get(),
            outputResDirPath = outputResDirPath.get(),
            projectDir = projectDir,
            target = target.get(),
            generatorMode = generatorMode.get(),
            dimensAggregator = dimensAggregator,
            fontsAggregator = fontsAggregator,
            xmlResourcesDocumentBuilderFactory = XmlResourcesDocumentBuilderFactory(
                resourcesPrefixConfig.get().resourcePrefix,
                themeName.get(),
            ),
            xmlFontFamilyDocumentBuilderFactory = XmlFontFamilyDocumentBuilderFactory(),
            fontDownloaderFactory = FontDownloaderFactory(),
            ktFileBuilderFactory = KtFileBuilderFactory(packageResolver),
            ktFileFromResourcesBuilderFactory = KtFileFromResourcesBuilderFactory(packageName.get()),
            resourceReferenceProvider = ResourceReferenceProvider(
                resourcesPrefixConfig.get().resourcePrefix,
                themeName.get(),
            ),
            namespace = namespace.get(),
            resPrefixConfig = resourcesPrefixConfig.get(),
            viewThemeParents = viewThemeParents.get(),
            viewShapeAppearanceConfig = viewShapeAppearanceConfig.get(),
            themeName = themeName.get(),
            dimensionsConfig = dimensionsConfig.get(),
            packageResolver = packageResolver,
        )
    }

    private val themeGenerator by unsafeLazy { generatorFactory.createThemeGenerator() }
    private val colorGenerator by unsafeLazy {
        generatorFactory.createColorGenerator(colors, palette)
    }
    private val gradientGenerator by unsafeLazy {
        generatorFactory.createGradientGenerator(
            gradients,
            palette,
        )
    }
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
        colorGenerator.generate().also(themeGenerator::setColorTokenData)
        gradientGenerator.generate().also(themeGenerator::setGradientTokenData)
        typographyGenerator.generate().also(themeGenerator::setTypographyTokenData)
        shapesGenerator.generate().also(themeGenerator::setShapeTokenData)
        shadowGenerator.generate().also(themeGenerator::setShadowTokenData)
        dimensGenerator.generate()
        fontGenerator.generate()

        themeGenerator.generate()
    }

    private fun decodeBase(): Theme =
        metaFile.get().asFile.decode<Theme>(Serializer.meta)
            .also { logger.debug("decoded base $it") }

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

    private val shadows: Map<String, List<ShadowTokenValue>> by unsafeLazy {
        shadowFile.get().asFile.decode<Map<String, List<ShadowTokenValue>>>()
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

    private val palette by unsafeLazy {
        paletteFile.get().asFile.decode<Map<String, Map<String, String>>>()
            .also { logger.debug("decoded palette $it") }
    }
}
