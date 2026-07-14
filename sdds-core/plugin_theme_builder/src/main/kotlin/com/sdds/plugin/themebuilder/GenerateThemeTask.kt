package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.FontDownloaderFactory
import com.sdds.plugin.themebuilder.internal.factory.GeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlFontFamilyDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.fonts.FontsAggregator
import com.sdds.plugin.themebuilder.internal.generator.ColorTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.DimenTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.FontTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.GradientTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.ShadowTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.ShapeTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.SpacingTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.ThemeInfoGenerator
import com.sdds.plugin.themebuilder.internal.generator.TypographyTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.ThemeGenerator
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.FontToken
import com.sdds.plugin.themebuilder.internal.token.FontTokenValue
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.ShadowTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.token.ShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.SpacingToken
import com.sdds.plugin.themebuilder.internal.token.SpacingTokenValue
import com.sdds.plugin.themebuilder.internal.token.Theme
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.provideDelegate
import java.io.File

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
     * Список тенантов
     */
    @get:Input
    abstract val themeTenants: ListProperty<String>

    /**
     * Список мета-файлов темы
     */
    @get:InputFile
    abstract val metaFile: RegularFileProperty

    /**
     * Список файлов с токенами цветов
     */
    @get:InputFiles
    abstract val colorFiles: ConfigurableFileCollection

    /**
     * Список файлов с токенами типографики
     */
    @get:InputFiles
    abstract val typographyFiles: ConfigurableFileCollection

    /**
     * Список файлов с токенами шрифтов
     */
    @get:InputFiles
    abstract val fontFiles: ConfigurableFileCollection

    /**
     * Список файлов с токенами теней
     */
    @get:InputFiles
    abstract val shadowFiles: ConfigurableFileCollection

    /**
     * Список файлов с токенами отступов
     */
    @get:InputFiles
    abstract val spacingFiles: ConfigurableFileCollection

    /**
     * Список файлов с токенами градиентов
     */
    @get:InputFiles
    abstract val gradientFiles: ConfigurableFileCollection

    /**
     * Список файлов с токенами форм
     */
    @get:InputFiles
    abstract val shapeFiles: ConfigurableFileCollection

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

    /**
     * Дефолтная типографика в теме
     */
    @get:Input
    abstract val defaultThemeTypography: Property<DefaultThemeTypography>

    /**
     * Конфигурация размеров
     */
    @get:Input
    abstract val ignoreDisabledTokens: Property<Boolean>

    /**
     * Использовать дефолтные compose-шрифты вместо значений из android_fontFamily.json.
     */
    @get:Input
    abstract val useDefaultFonts: Property<Boolean>

    /**
     * Признак мультиплатформенного (Compose Multiplatform) режима генерации токенов.
     */
    @get:Input
    abstract val multiplatform: Property<Boolean>

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
            defaultThemeTypography = defaultThemeTypography.get(),
            useDefaultFonts = useDefaultFonts.get(),
            multiplatform = multiplatform.getOrElse(false),
        )
    }

    private val themeGenerator by unsafeLazy { generatorFactory.createThemeGenerator() }
    private val dimensGenerator by unsafeLazy { generatorFactory.createDimensGenerator() }
    private val outputFileForCompose: File by unsafeLazy {
        createJsonFileFor(target.get())
    }
    private val themeInfoGenerator by unsafeLazy { generatorFactory.createThemeInfoGenerator(outputFileForCompose) }

    /**
     * Генерирует файлы с токенами
     */
    @TaskAction
    @Suppress("CyclomaticComplexMethod")
    fun generate() {
        checkCollectionSize()
        val tenants = themeTenants.get()
        val tenantDataMap = tenants.mapIndexed { index, tenant ->
            TenantData(
                colorFile = colorFiles.files.elementAt(index),
                gradientFile = gradientFiles.files.elementAt(index),
                fontFile = fontFiles.files.elementAt(index),
                typographyFile = typographyFiles.files.elementAt(index),
                shapeFile = shapeFiles.files.elementAt(index),
                shadowFile = shadowFiles.files.elementAt(index),
                spacingFile = spacingFiles.files.elementAt(index),
                tenant = tenant,
            )
        }.associateBy { Tenant(it.tenant) }

        val theme = decodeMeta()
        val metaFileTokens = theme.tokens

        val defaultTenant = tenantDataMap[Tenant.Default]
            ?: throw ThemeBuilderException("Theme must have default tenant")

        val defaultTenantColors = colors(defaultTenant.colorFile)
        val defaultTenantGradients = gradients(defaultTenant.gradientFile)
        val defaultTenantFonts = fonts(defaultTenant.fontFile)
        val defaultTenantTypography = typography(defaultTenant.typographyFile)
        val defaultTenantShapes = shapes(defaultTenant.shapeFile)
        val defaultTenantShadows = shadows(defaultTenant.shadowFile)
        val defaultTenantSpacings = spacing(defaultTenant.spacingFile)

        val allColors = mutableMapOf<Tenant, Map<String, String>>()
            .apply { this[Tenant.Default] = defaultTenantColors }
        val allGradients = mutableMapOf<Tenant, Map<String, List<GradientTokenValue>>>()
            .apply { this[Tenant.Default] = defaultTenantGradients }
        val allFonts = mutableMapOf<Tenant, Map<String, FontTokenValue>>()
            .apply { this[Tenant.Default] = defaultTenantFonts }
        val allTypography = mutableMapOf<Tenant, Map<String, TypographyTokenValue>>()
            .apply { this[Tenant.Default] = defaultTenantTypography }
        val allShapes = mutableMapOf<Tenant, Map<String, ShapeTokenValue>>()
            .apply { this[Tenant.Default] = defaultTenantShapes }
        val allShadows = mutableMapOf<Tenant, Map<String, List<ShadowTokenValue>>>()
            .apply { this[Tenant.Default] = defaultTenantShadows }
        val allSpacings = mutableMapOf<Tenant, Map<String, SpacingTokenValue>>()
            .apply { this[Tenant.Default] = defaultTenantSpacings }

        tenantDataMap
            .filter { it.key != Tenant.Default }
            .forEach { tenantEntry ->
                val tenant = tenantEntry.key

                val tenantColors = colors(tenantEntry.value.colorFile)
                val tenantDiffColors = tenantToDefaultDiff(defaultTenantColors, tenantColors)
                allColors[tenant] = tenantDiffColors

                val tenantGradients = gradients(tenantEntry.value.gradientFile)
                val tenantDiffGradients = tenantToDefaultDiff(defaultTenantGradients, tenantGradients)
                allGradients[tenant] = tenantDiffGradients

                val tenantFonts = fonts(tenantEntry.value.fontFile)
                val tenantDiffFonts = tenantToDefaultDiff(defaultTenantFonts, tenantFonts)
                allFonts[tenant] = tenantDiffFonts

                val tenantTypography = typography(tenantEntry.value.typographyFile)
                val tenantDiffTypography = tenantToDefaultDiff(defaultTenantTypography, tenantTypography)
                allTypography[tenant] = tenantDiffTypography

                val tenantShapes = shapes(tenantEntry.value.shapeFile)
                val tenantDiffShapes = tenantToDefaultDiff(defaultTenantShapes, tenantShapes)
                allShapes[tenant] = tenantDiffShapes

                val tenantShadows = shadows(tenantEntry.value.shadowFile)
                val tenantDiffShadows = tenantToDefaultDiff(defaultTenantShadows, tenantShadows)
                allShadows[tenant] = tenantDiffShadows

                val tenantSpacings = spacing(tenantEntry.value.spacingFile)
                val tenantDiffSpacings = tenantToDefaultDiff(defaultTenantSpacings, tenantSpacings)
                allSpacings[tenant] = tenantDiffSpacings
            }

        val colorGenerator = generatorFactory.createColorGenerator(allColors, palette)
        val gradientGenerator = generatorFactory.createGradientGenerator(allGradients, palette)
        val fontGenerator = generatorFactory.createFontGenerator(allFonts)
        val typographyGenerator = generatorFactory.createTypographyGenerator(allTypography)
        val shapesGenerator = generatorFactory.createShapesGenerator(allShapes)
        val shadowGenerator = generatorFactory.createShadowGenerator(allShadows, palette)
        val spacingGenerator = generatorFactory.createSpacingGenerator(allSpacings)

        metaFileTokens.onEach { token ->
            when (token) {
                is ColorToken -> colorGenerator.addToken(token)
                is GradientToken -> gradientGenerator.addToken(token)
                is ShadowToken -> shadowGenerator.addToken(token)
                is ShapeToken -> shapesGenerator.addToken(token)
                is TypographyToken -> typographyGenerator.addToken(token)
                is FontToken -> fontGenerator.addToken(token)
                is SpacingToken -> spacingGenerator.addToken(token)
            }
        }
        themeInfoGenerator.setInfo(themeName.get().snakeToCamelCase(), theme.version, target.get().value)
        generateTokens(
            colorGenerator = colorGenerator,
            gradientGenerator = gradientGenerator,
            shadowGenerator = shadowGenerator,
            shapesGenerator = shapesGenerator,
            spacingGenerator = spacingGenerator,
            typographyGenerator = typographyGenerator,
            fontGenerator = fontGenerator,
            dimensGenerator = dimensGenerator,
            themeGenerator = themeGenerator,
            themeInfoGenerator = themeInfoGenerator,
        )
    }

    private fun generateTokens(
        colorGenerator: ColorTokenGenerator,
        gradientGenerator: GradientTokenGenerator,
        shadowGenerator: ShadowTokenGenerator,
        shapesGenerator: ShapeTokenGenerator,
        spacingGenerator: SpacingTokenGenerator,
        typographyGenerator: TypographyTokenGenerator,
        fontGenerator: FontTokenGenerator,
        dimensGenerator: DimenTokenGenerator,
        themeGenerator: ThemeGenerator,
        themeInfoGenerator: ThemeInfoGenerator,
    ) {
        val colorResult = colorGenerator.generate()
        themeGenerator.setColorTokenData(colorResult)
        themeInfoGenerator.addResult(colorResult)

        val gradientResult = gradientGenerator.generate()
        themeGenerator.setGradientTokenData(gradientResult)
        themeInfoGenerator.addResult(gradientResult)

        val shadowResult = shadowGenerator.generate()
        themeGenerator.setShadowTokenData(shadowResult)
        themeInfoGenerator.addResult(shadowResult)

        val shapeResult = shapesGenerator.generate()
        themeGenerator.setShapeTokenData(shapeResult)
        themeInfoGenerator.addResult(shapeResult)

        val spaceResult = spacingGenerator.generate()
        themeGenerator.setSpacingTokenData(spaceResult)
        themeInfoGenerator.addResult(spaceResult)

        val typographyResult = typographyGenerator.generate()
        themeGenerator.setTypographyTokenData(typographyResult)
        themeInfoGenerator.addResult(typographyResult)

        val fontResult = fontGenerator.generate()
        themeInfoGenerator.addResult(fontResult)

        dimensGenerator.generate()
        themeGenerator.generate()
        themeInfoGenerator.generate()
    }

    private fun <T> tenantToDefaultDiff(
        defaultTokens: Map<String, T>,
        tenantTokens: Map<String, T>,
    ): Map<String, T> {
        return tenantTokens.filter {
            defaultTokens[it.key] != it.value
        }
    }

    @Suppress("ThrowsCount")
    private fun checkCollectionSize() {
        val tenantSize = themeTenants.get().size
        if (colorFiles.files.size != tenantSize) {
            throw ThemeBuilderException(
                "colorFiles count and themeTenants count must be the same",
            )
        }
        if (gradientFiles.files.size != tenantSize) {
            throw ThemeBuilderException(
                "gradientFiles count and themeTenants count must be the same",
            )
        }
        if (fontFiles.files.size != tenantSize) {
            throw ThemeBuilderException(
                "fontFiles count and themeTenants count must be the same",
            )
        }
        if (typographyFiles.files.size != tenantSize) {
            throw ThemeBuilderException(
                "typographyFiles count and themeTenants count must be the same",
            )
        }
        if (shapeFiles.files.size != tenantSize) {
            throw ThemeBuilderException(
                "shapeFiles count and themeTenants count must be the same",
            )
        }
        if (shadowFiles.files.size != tenantSize) {
            throw ThemeBuilderException(
                "shadowFiles count and themeTenants count must be the same",
            )
        }
        if (spacingFiles.files.size != tenantSize) {
            throw ThemeBuilderException(
                "spacingFiles count and themeTenants count must be the same",
            )
        }
    }

    private data class TenantData(
        val tenant: String,
        val colorFile: File,
        val gradientFile: File,
        val fontFile: File,
        val typographyFile: File,
        val shapeFile: File,
        val shadowFile: File,
        val spacingFile: File,
    )

    private fun decodeMeta(): Theme =
        requireThemeFile(metaFile.get().asFile)
            .decode<Theme>(Serializer.meta)
            .let { theme ->
                if (ignoreDisabledTokens.get()) {
                    theme.copy(tokens = theme.tokens.filter { it.enabled })
                } else {
                    theme
                }
            }
            .also { logger.debug("decoded base $it") }

    private fun colors(file: File): Map<String, String> {
        return requireThemeFile(file).decode<Map<String, String>>()
            .also { logger.debug("decoded colors $it") }
    }

    private fun shapes(file: File): Map<String, ShapeTokenValue> {
        return requireThemeFile(file).decode<Map<String, ShapeTokenValue>>()
            .also { logger.debug("decoded shapes $it") }
    }

    private fun gradients(file: File): Map<String, List<GradientTokenValue>> {
        return requireThemeFile(file).decode<Map<String, List<GradientTokenValue>>>()
            .also { logger.debug("decoded gradients $it") }
    }

    private fun shadows(file: File): Map<String, List<ShadowTokenValue>> {
        return requireThemeFile(file).decode<Map<String, List<ShadowTokenValue>>>()
            .also { logger.debug("decoded shadows $it") }
    }

    private fun spacing(file: File): Map<String, SpacingTokenValue> {
        return requireThemeFile(file).decode<Map<String, SpacingTokenValue>>()
            .also { logger.debug("decoded spacing $it") }
    }

    private fun typography(file: File): Map<String, TypographyTokenValue> {
        return requireThemeFile(file).decode<Map<String, TypographyTokenValue>>()
            .also { logger.debug("decoded typography $it") }
    }

    private fun fonts(file: File): Map<String, FontTokenValue> {
        return requireThemeFile(file).decode<Map<String, FontTokenValue>>()
            .also { logger.debug("decoded fonts $it") }
    }

    private fun requireThemeFile(file: File): File {
        if (!file.isFile) {
            throw ThemeBuilderException("Required theme file is missing: ${file.path}")
        }
        return file
    }

    private val palette by unsafeLazy {
        val file = paletteFile.get().asFile
        if (!file.isFile) {
            throw ThemeBuilderException("Required palette file is missing: ${file.path}")
        }
        file.decode<Map<String, Map<String, String>>>()
            .also { logger.debug("decoded palette $it") }
    }

    private fun createJsonFileFor(target: ThemeBuilderTarget): File {
        val platformPostfix = target.name.lowercase().replace('_', '-')
        return projectDir
            .get()
            .dir(".sdds")
            .file("$FILE_NAME-$platformPostfix.json")
            .asFile
            .apply { parentFile.mkdirs() }
    }

    private companion object {
        const val FILE_NAME = "theme-info"
    }
}
