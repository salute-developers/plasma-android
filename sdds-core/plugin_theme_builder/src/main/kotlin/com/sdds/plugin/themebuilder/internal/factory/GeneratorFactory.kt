package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.OutputLocation
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.generator.ColorTokenGenerator
import com.sdds.plugin.themebuilder.internal.generator.DimenGenerator
import com.sdds.plugin.themebuilder.internal.generator.FontGenerator
import com.sdds.plugin.themebuilder.internal.generator.GradientGenerator
import com.sdds.plugin.themebuilder.internal.generator.ShadowGenerator
import com.sdds.plugin.themebuilder.internal.generator.ShapeGenerator
import com.sdds.plugin.themebuilder.internal.generator.TypographyGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.ThemeGenerator
import com.sdds.plugin.themebuilder.internal.token.FontTokenValue
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShadowTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.gradle.api.file.DirectoryProperty
import java.io.File

/**
 * Фабрика генераторов
 * @param outputDirPath путь для сохранения kt-файлов
 * @param outputResDirPath путь для сохранения xml-файлов
 * @param projectDir директория проекта
 * @param target целевой фреймворк
 * @param dimensAggregator агрегатор размеров
 * @param xmlResourcesDocumentBuilderFactory фабрика делегата построения xml файлов ресурсов
 * @param xmlFontFamilyDocumentBuilderFactory фабрика делегата построения xml файлов font-family
 * @param fontDownloaderFactory фабрика загрузчика шрифтов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param resourceReferenceProvider провайдер ссылок на ресурсы
 * @param namespace пакет проекта
 * @param resPrefix префикс для ресурсов
 * @param parentThemeName названий родительской xml-темы
 * @param themeName название генерируемой темы
 *
 * @author Малышев Александр on 12.03.2024
 */
internal class GeneratorFactory(
    private val outputDirPath: String,
    private val outputResDirPath: String,
    private val projectDir: DirectoryProperty,
    private val target: ThemeBuilderTarget,
    private val dimensAggregator: DimensAggregator,
    private val xmlResourcesDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val xmlFontFamilyDocumentBuilderFactory: XmlFontFamilyDocumentBuilderFactory,
    private val fontDownloaderFactory: FontDownloaderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val namespace: String,
    private val resPrefix: String,
    private val parentThemeName: String,
    private val themeName: String,
) {

    private val outputDir: File by lazy {
        projectDir.get().dir(outputDirPath).asFile
    }

    private val outputResDir: File by lazy {
        projectDir.get().dir(outputResDirPath).asFile
    }

    private val composeColorAttributeGeneratorFactory by lazy {
        ComposeColorAttributeGeneratorFactory(
            ktFileBuilderFactory = ktFileBuilderFactory,
            outputLocation = OutputLocation.Directory(outputDir),
            themeName = themeName,
        )
    }

    private val viewColorAttributeGeneratorFactory by lazy {
        ViewColorAttributeGeneratorFactory(
            xmlDocumentBuilderFactory = xmlResourcesDocumentBuilderFactory,
            outputResDir = outputResDir,
            attrPrefix = resPrefix,
        )
    }

    private val viewThemeGeneratorFactory: ViewThemeGeneratorFactory by lazy {
        ViewThemeGeneratorFactory(
            xmlResourcesDocumentBuilderFactory,
            outputResDir,
            parentThemeName,
        )
    }

    private val composeThemeGeneratorFactory: ComposeThemeGeneratorFactory by lazy {
        ComposeThemeGeneratorFactory()
    }

    /**
     * Создает генератор темы [ThemeGenerator]
     */
    fun createThemeGenerator(): ThemeGenerator = ThemeGenerator(
        viewThemeGeneratorFactory = viewThemeGeneratorFactory,
        composeThemeGeneratorFactory = composeThemeGeneratorFactory,
        viewColorAttributeGeneratorFactory = viewColorAttributeGeneratorFactory,
        composeColorAttributeGeneratorFactory = composeColorAttributeGeneratorFactory,
        target = target,
    )

    /**
     * Создает генератор токенов цвета [ColorTokenGenerator]
     *
     * @param colors словарь значений токенов цвета
     * @return [ColorTokenGenerator] генератор токенов цвета
     */
    fun createColorGenerator(
        colors: Map<String, String>,
    ): ColorTokenGenerator {
        return ColorTokenGenerator(
            outputLocation = OutputLocation.Directory(outputDir),
            outputResDir = outputResDir,
            target = target,
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory = ktFileBuilderFactory,
            colorTokenValues = colors,
            resourceReferenceProvider = resourceReferenceProvider,
        )
    }

    /**
     * Создает генератор градиентов [GradientGenerator]
     */
    fun createGradientGenerator(gradients: Map<String, List<GradientTokenValue>>): GradientGenerator {
        return GradientGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory,
            gradients,
        )
    }

    /**
     * Создает генератор шрифтов [FontGenerator]
     */
    fun createFontGenerator(fonts: Map<String, FontTokenValue>): FontGenerator {
        return FontGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlFontFamilyDocumentBuilderFactory,
            fontDownloaderFactory,
            ktFileBuilderFactory,
            namespace,
            resPrefix,
            fonts,
        )
    }

    /**
     * Создает генератор типографии [TypographyGenerator]
     */
    fun createTypographyGenerator(typography: Map<String, TypographyTokenValue>): TypographyGenerator {
        return TypographyGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            dimensAggregator,
            xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory,
            resourceReferenceProvider,
            typography,
        )
    }

    /**
     * Создает генератор размеров [DimenGenerator]
     */
    fun createDimensGenerator(): DimenGenerator {
        return DimenGenerator(
            outputResDir,
            dimensAggregator,
            xmlResourcesDocumentBuilderFactory,
        )
    }

    /**
     * Создает генератор форм [ShapeGenerator]
     */
    fun createShapesGenerator(shapes: Map<String, ShapeTokenValue>): ShapeGenerator {
        return ShapeGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory,
            dimensAggregator,
            resourceReferenceProvider,
            shapes,
        )
    }

    /**
     * Создает генератор теней [ShadowGenerator]
     */
    fun createShadowGenerator(shadows: Map<String, ShadowTokenValue>): ShadowGenerator {
        return ShadowGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory,
            shadows,
        )
    }
}
