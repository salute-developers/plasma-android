package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.OutputLocation
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.generator.ColorGenerator
import com.sdds.plugin.themebuilder.internal.generator.DimenGenerator
import com.sdds.plugin.themebuilder.internal.generator.FontGenerator
import com.sdds.plugin.themebuilder.internal.generator.GradientGenerator
import com.sdds.plugin.themebuilder.internal.generator.ShadowGenerator
import com.sdds.plugin.themebuilder.internal.generator.ShapeGenerator
import com.sdds.plugin.themebuilder.internal.generator.TypographyGenerator
import com.sdds.plugin.themebuilder.internal.token.FontTokenValue
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShadowTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Фабрика генераторов
 * @param outputDir директория для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param dimensAggregator агрегатор размеров
 * @param xmlResourcesDocumentBuilderFactory фабрика делегата построения xml файлов ресурсов
 * @param xmlFontFamilyDocumentBuilderFactory фабрика делегата построения xml файлов font-family
 * @param fontDownloaderFactory фабрика загрузчика шрифтов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param resourceReferenceProvider провайдер ссылок на ресурсы
 * @param namespace пакет проекта
 * @param resPrefix префикс для ресурсов
 * @author Малышев Александр on 12.03.2024
 */
internal class GeneratorFactory(
    private val outputDir: File,
    private val outputResDir: File,
    private val target: ThemeBuilderTarget,
    private val dimensAggregator: DimensAggregator,
    private val xmlResourcesDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val xmlFontFamilyDocumentBuilderFactory: XmlFontFamilyDocumentBuilderFactory,
    private val fontDownloaderFactory: FontDownloaderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val namespace: String,
    private val resPrefix: String,
) {

    /**
     * Создает генератор цветов [ColorGenerator]
     */
    fun createColorGenerator(colors: Map<String, String>): ColorGenerator {
        return ColorGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlResourcesDocumentBuilderFactory,
            ktFileBuilderFactory,
            colors,
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
