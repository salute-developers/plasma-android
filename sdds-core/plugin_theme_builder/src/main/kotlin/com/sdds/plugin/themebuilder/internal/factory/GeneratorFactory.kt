package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.OutputLocation
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.generator.ColorGenerator
import com.sdds.plugin.themebuilder.internal.generator.DimenGenerator
import com.sdds.plugin.themebuilder.internal.generator.GradientGenerator
import com.sdds.plugin.themebuilder.internal.generator.ShadowGenerator
import com.sdds.plugin.themebuilder.internal.generator.ShapeGenerator
import com.sdds.plugin.themebuilder.internal.generator.TypographyGenerator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Фабрика генераторов
 * @param outputDir директория для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param dimensAggregator агрегатор размеров
 * @param xmlDocumentBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param resourceReferenceProvider провайдер ссылок на ресурсы
 * @author Малышев Александр on 12.03.2024
 */
internal class GeneratorFactory(
    private val outputDir: File,
    private val outputResDir: File,
    private val target: ThemeBuilderTarget,
    private val dimensAggregator: DimensAggregator,
    private val xmlDocumentBuilderFactory: XmlDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) {

    /**
     * Создает генератор цветов [ColorGenerator]
     */
    fun createColorGenerator(): ColorGenerator {
        return ColorGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlDocumentBuilderFactory,
            ktFileBuilderFactory,
        )
    }

    /**
     * Создает генератор градиентов [GradientGenerator]
     */
    fun createGradientGenerator(): GradientGenerator {
        return GradientGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlDocumentBuilderFactory,
            ktFileBuilderFactory,
        )
    }

    /**
     * Создает генератор типографии [TypographyGenerator]
     */
    fun createTypographyGenerator(): TypographyGenerator {
        return TypographyGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            dimensAggregator,
            xmlDocumentBuilderFactory,
            ktFileBuilderFactory,
            resourceReferenceProvider,
        )
    }

    /**
     * Создает генератор размеров [DimenGenerator]
     */
    fun createDimensGenerator(): DimenGenerator {
        return DimenGenerator(
            outputResDir,
            dimensAggregator,
            xmlDocumentBuilderFactory,
        )
    }

    /**
     * Создает генератор форм [ShapeGenerator]
     */
    fun createShapesGenerator(): ShapeGenerator {
        return ShapeGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlDocumentBuilderFactory,
            ktFileBuilderFactory,
            dimensAggregator,
            resourceReferenceProvider,
        )
    }

    /**
     * Создает генератор теней [ShadowGenerator]
     */
    fun createShadowGenerator(): ShadowGenerator {
        return ShadowGenerator(
            OutputLocation.Directory(outputDir),
            outputResDir,
            target,
            xmlDocumentBuilderFactory,
            ktFileBuilderFactory,
        )
    }
}
