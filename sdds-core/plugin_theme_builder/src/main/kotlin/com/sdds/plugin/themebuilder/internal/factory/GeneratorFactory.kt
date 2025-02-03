package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig
import com.sdds.plugin.themebuilder.ThemeBuilderMode
import com.sdds.plugin.themebuilder.ViewThemeParent
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.OutputLocation
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.fonts.FontsAggregator
import com.sdds.plugin.themebuilder.internal.generator.ColorTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.DimenTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.FontTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.GradientTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.ShadowTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.ShapeTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.SpacingTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.TypographyTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.ThemeGenerator
import com.sdds.plugin.themebuilder.internal.token.FontTokenValue
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShadowTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.SpacingTokenValue
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.api.file.DirectoryProperty
import java.io.File

/**
 * Фабрика генераторов
 * @param outputDirPath путь для сохранения kt-файлов
 * @param outputResDirPath путь для сохранения xml-файлов
 * @param projectDir директория проекта
 * @param target целевой фреймворк
 * @param generatorMode режим работы генератора (тема или только токены)
 * @param dimensAggregator агрегатор размеров
 * @param fontsAggregator агрегатор шрифтов
 * @param xmlResourcesDocumentBuilderFactory фабрика делегата построения xml файлов ресурсов
 * @param xmlFontFamilyDocumentBuilderFactory фабрика делегата построения xml файлов font-family
 * @param fontDownloaderFactory фабрика загрузчика шрифтов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param resourceReferenceProvider провайдер ссылок на ресурсы
 * @param namespace пакет проекта
 * @param resPrefixConfig конфиг префикса для ресурсов
 * @param viewThemeParents список родительских xml-тем
 * @param themeName название генерируемой темы
 *
 * @author Малышев Александр on 12.03.2024
 */
@Suppress("LongParameterList")
internal class GeneratorFactory(
    private val outputDirPath: String,
    private val outputResDirPath: String,
    private val projectDir: DirectoryProperty,
    private val target: ThemeBuilderTarget,
    private val generatorMode: ThemeBuilderMode,
    private val dimensAggregator: DimensAggregator,
    private val fontsAggregator: FontsAggregator,
    private val xmlResourcesDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val xmlFontFamilyDocumentBuilderFactory: XmlFontFamilyDocumentBuilderFactory,
    private val fontDownloaderFactory: FontDownloaderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val ktFileFromResourcesBuilderFactory: KtFileFromResourcesBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val namespace: String,
    private val resPrefixConfig: ResourcePrefixConfig,
    private val viewThemeParents: List<ViewThemeParent>,
    private val viewShapeAppearanceConfig: List<ShapeAppearanceConfig>,
    private val themeName: String,
    private val dimensionsConfig: DimensionsConfig,
    private val packageResolver: PackageResolver,
) {

    private val outputDir: File by unsafeLazy {
        projectDir.get().dir(outputDirPath).asFile
    }

    private val outputResDir: File by unsafeLazy {
        projectDir.get().dir(outputResDirPath).asFile
    }

    private val composeColorAttributeGeneratorFactory by unsafeLazy {
        ComposeColorAttributeGeneratorFactory(
            ktFileBuilderFactory = ktFileBuilderFactory,
            outputLocation = OutputLocation.Directory(outputDir),
            themeName = themeName,
            packageResolver = packageResolver,
        )
    }

    private val composeGradientAttributeGeneratorFactory by unsafeLazy {
        ComposeGradientAttributeGeneratorFactory(
            ktFileBuilderFactory = ktFileBuilderFactory,
            ktFileFromResourcesBuilderFactory = ktFileFromResourcesBuilderFactory,
            outputLocation = OutputLocation.Directory(outputDir),
            themeName = themeName,
            packageResolver = packageResolver,
        )
    }

    private val viewXmlGradientAttributeGeneratorFactory by unsafeLazy {
        ViewXmlGradientAttributeGeneratorFactory(
            xmlDocumentBuilderFactory = xmlResourcesDocumentBuilderFactory,
            outputResDir = outputResDir,
            attrPrefix = resPrefixConfig.resourcePrefix,
        )
    }

    private val viewColorAttributeGeneratorFactory by unsafeLazy {
        ViewColorAttributeGeneratorFactory(
            xmlDocumentBuilderFactory = xmlResourcesDocumentBuilderFactory,
            outputResDir = outputResDir,
            attrPrefix = resPrefixConfig.resourcePrefix,
        )
    }

    private val viewShapeAttributeGeneratorFactory by unsafeLazy {
        ViewShapeAttributeGeneratorFactory(
            xmlDocumentBuilderFactory = xmlResourcesDocumentBuilderFactory,
            outputResDir = outputResDir,
            attrPrefix = resPrefixConfig.resourcePrefix,
        )
    }
    private val viewSpacingAttributeGeneratorFactory by unsafeLazy {
        ViewSpacingAttributeGeneratorFactory(
            xmlDocumentBuilderFactory = xmlResourcesDocumentBuilderFactory,
            outputResDir = outputResDir,
            attrPrefix = resPrefixConfig.resourcePrefix,
        )
    }

    private val viewShadowAttributeGeneratorFactory by unsafeLazy {
        ViewShadowAttributeGeneratorFactory(
            xmlDocumentBuilderFactory = xmlResourcesDocumentBuilderFactory,
            outputResDir = outputResDir,
            attrPrefix = resPrefixConfig.resourcePrefix,
        )
    }

    private val viewTypographyAttributeGeneratorFactory by unsafeLazy {
        ViewTypographyAttributeGeneratorFactory(
            xmlDocumentBuilderFactory = xmlResourcesDocumentBuilderFactory,
            outputResDir = outputResDir,
            attrPrefix = resPrefixConfig.resourcePrefix,
        )
    }

    private val composeShapeAttributeGeneratorFactory by unsafeLazy {
        ComposeShapeAttributeGeneratorFactory(
            ktFileBuilderFactory = ktFileBuilderFactory,
            outputLocation = OutputLocation.Directory(outputDir),
            themeName = themeName,
            dimensionsConfig = dimensionsConfig,
            packageResolver = packageResolver,
        )
    }

    private val composeShadowAttributeGeneratorFactory by unsafeLazy {
        ComposeShadowAttributeGeneratorFactory(
            ktFileBuilderFactory = ktFileBuilderFactory,
            outputLocation = OutputLocation.Directory(outputDir),
            themeName = themeName,
            dimensionsConfig = dimensionsConfig,
            packageResolver = packageResolver,
        )
    }

    private val viewGradientGeneratorFactory by unsafeLazy {
        ViewGradientGeneratorFactory(
            outputResDir = outputResDir,
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            resourcePrefix = resPrefixConfig.resourcePrefix,
        )
    }

    private val composeSpacingAttributeGeneratorFactory by unsafeLazy {
        ComposeSpacingAttributeGeneratorFactory(
            ktFileBuilderFactory = ktFileBuilderFactory,
            outputLocation = OutputLocation.Directory(outputDir),
            themeName = themeName,
            dimensionsConfig = dimensionsConfig,
            packageResolver = packageResolver,
        )
    }

    private val shadowStyleGeneratorFactory by unsafeLazy {
        ShadowStyleGeneratorFactory(
            outputResDir = outputResDir,
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
        )
    }

    private val viewThemeGeneratorFactory: ViewThemeGeneratorFactory by unsafeLazy {
        ViewThemeGeneratorFactory(
            xmlResourcesDocumentBuilderFactory,
            outputResDir,
            viewThemeParents,
            themeName,
            resPrefixConfig,
            viewGradientGeneratorFactory,
            shadowStyleGeneratorFactory,
        )
    }

    private val composeTypographyAttributeGeneratorFactory by unsafeLazy {
        ComposeTypographyAttributeGeneratorFactory(
            ktFileBuilderFactory = ktFileBuilderFactory,
            ktFileFromResourcesBuilderFactory = ktFileFromResourcesBuilderFactory,
            outputLocation = OutputLocation.Directory(outputDir),
            themeName = themeName,
            dimensionsConfig = dimensionsConfig,
            packageResolver = packageResolver,
        )
    }

    private val composeThemeGeneratorFactory: ComposeThemeGeneratorFactory by unsafeLazy {
        ComposeThemeGeneratorFactory(
            ktFileBuilderFactory = ktFileBuilderFactory,
            outputLocation = OutputLocation.Directory(outputDir),
            themeName = themeName,
        )
    }

    /**
     * Создает генератор темы [ThemeGenerator]
     */
    fun createThemeGenerator(): ThemeGenerator = ThemeGenerator(
        viewThemeGeneratorFactory = viewThemeGeneratorFactory,
        composeThemeGeneratorFactory = composeThemeGeneratorFactory,
        viewColorAttributeGeneratorFactory = viewColorAttributeGeneratorFactory,
        composeColorAttributeGeneratorFactory = composeColorAttributeGeneratorFactory,
        viewShapeAttributeGeneratorFactory = viewShapeAttributeGeneratorFactory,
        viewShadowAttributeGeneratorFactory = viewShadowAttributeGeneratorFactory,
        composeShapeAttributeGeneratorFactory = composeShapeAttributeGeneratorFactory,
        composeShadowAttributeGeneratorFactory = composeShadowAttributeGeneratorFactory,
        composeGradientAttributeGeneratorFactory = composeGradientAttributeGeneratorFactory,
        viewXmlGradientAttributeGeneratorFactory = viewXmlGradientAttributeGeneratorFactory,
        viewTypographyAttributeGeneratorFactory = viewTypographyAttributeGeneratorFactory,
        composeTypographyAttributeGeneratorFactory = composeTypographyAttributeGeneratorFactory,
        viewSpacingAttributeGeneratorFactory = viewSpacingAttributeGeneratorFactory,
        composeSpacingAttributeGeneratorFactory = composeSpacingAttributeGeneratorFactory,
        target = target,
        generatorMode = generatorMode,
        shouldGenerateViewShapeStyle = viewShapeAppearanceConfig.isNotEmpty(),
    )

    /**
     * Создает генератор токенов цвета [ColorTokenGenerator]
     *
     * @param colors словарь значений токенов цвета
     * @return [ColorTokenGenerator] генератор токенов цвета
     */
    fun createColorGenerator(
        colors: Map<String, String>,
        palette: Map<String, Map<String, String>>,
    ): ColorTokenGenerator {
        return ColorTokenGenerator(
            outputLocation = OutputLocation.Directory(outputDir),
            outputResDir = outputResDir,
            target = target,
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory = ktFileBuilderFactory,
            colorTokenValues = colors,
            resourceReferenceProvider = resourceReferenceProvider,
            palette = palette,
        )
    }

    /**
     * Создает генератор градиентов [GradientTokenGenerator]
     */
    fun createGradientGenerator(
        gradients: Map<String, List<GradientTokenValue>>,
        palette: Map<String, Map<String, String>>,
    ): GradientTokenGenerator {
        return GradientTokenGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory,
            gradients,
            palette,
            resourceReferenceProvider,
        )
    }

    /**
     * Создает генератор шрифтов [FontTokenGenerator]
     */
    fun createFontGenerator(fonts: Map<String, FontTokenValue>): FontTokenGenerator {
        return FontTokenGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlFontFamilyDocumentBuilderFactory,
            fontDownloaderFactory,
            ktFileBuilderFactory,
            namespace,
            resPrefixConfig.resourcePrefix,
            fonts,
            fontsAggregator,
        )
    }

    /**
     * Создает генератор типографии [TypographyTokenGenerator]
     */
    fun createTypographyGenerator(
        typography: Map<String, TypographyTokenValue>,
    ): TypographyTokenGenerator {
        return TypographyTokenGenerator(
            outputLocation = OutputLocation.Directory(outputDir),
            outputResDir = outputResDir,
            target = target,
            dimensAggregator = dimensAggregator,
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory = ktFileBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
            typographyTokenValues = typography,
            fontsAggregator = fontsAggregator,
            dimensionsConfig = dimensionsConfig,
            namespace = namespace,
        )
    }

    /**
     * Создает генератор размеров [DimenTokenGenerator]
     */
    fun createDimensGenerator(): DimenTokenGenerator {
        return DimenTokenGenerator(
            outputResDir = outputResDir,
            dimensConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
        )
    }

    /**
     * Создает генератор форм [ShapeTokenGenerator]
     */
    fun createShapesGenerator(shapes: Map<String, ShapeTokenValue>): ShapeTokenGenerator {
        return ShapeTokenGenerator(
            outputLocation = OutputLocation.Directory(outputDir),
            outputResDir = outputResDir,
            target = target,
            viewShapeAppearanceConfig = viewShapeAppearanceConfig,
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory = ktFileBuilderFactory,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
            shapeTokenValues = shapes,
            dimensionsConfig = dimensionsConfig,
            namespace = namespace,
        )
    }

    /**
     * Создает генератор теней [ShadowTokenGenerator]
     */
    fun createShadowGenerator(
        shadows: Map<String, List<ShadowTokenValue>>,
        palette: Map<String, Map<String, String>>,
    ): ShadowTokenGenerator {
        return ShadowTokenGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir = outputResDir,
            target = target,
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory = ktFileBuilderFactory,
            shadowTokenValues = shadows,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensionsConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            namespace = namespace,
            palette = palette,
        )
    }

    /**
     * Создает генератор форм [SpacingTokenGenerator]
     */
    fun createSpacingGenerator(spacings: Map<String, SpacingTokenValue>): SpacingTokenGenerator {
        return SpacingTokenGenerator(
            outputLocation = OutputLocation.Directory(outputDir),
            outputResDir = outputResDir,
            target = target,
            ktFileBuilderFactory = ktFileBuilderFactory,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
            dimensionsConfig = dimensionsConfig,
            namespace = namespace,
            spacingTokenValues = spacings,
        )
    }
}
