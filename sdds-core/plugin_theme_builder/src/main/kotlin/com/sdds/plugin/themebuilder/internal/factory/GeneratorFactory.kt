package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.generator.ColorGenerator
import com.sdds.plugin.themebuilder.internal.generator.DimenGenerator
import com.sdds.plugin.themebuilder.internal.generator.GradientGenerator
import com.sdds.plugin.themebuilder.internal.generator.TypographyGenerator
import com.squareup.kotlinpoet.FileSpec
import java.io.File

/**
 * Фабрика генераторов
 * @param outputDir директория для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param dimensAggregator агрегатор размеров
 * @author Малышев Александр on 12.03.2024
 */
internal class GeneratorFactory(
    private val outputDir: File,
    private val outputResDir: File,
    private val target: ThemeBuilderTarget,
    private val dimensAggregator: DimensAggregator,
) {

    /**
     * Создает генератор цветов [ColorGenerator]
     */
    fun createColorGenerator(): ColorGenerator {
        return ColorGenerator(
            outputDir,
            outputResDir,
            target,
            XmlDocumentBuilderFactory,
            createKtFileBuilder("com.sdds.playground.themebuilder.theme", "ColorTokens"),
        )
    }

    /**
     * Создает генератор градиентов [GradientGenerator]
     */
    fun createGradientGenerator(): GradientGenerator {
        return GradientGenerator(
            outputDir,
            outputResDir,
            target,
            XmlDocumentBuilderFactory,
            createKtFileBuilder("com.sdds.playground.themebuilder.theme", "GradientTokens"),
        )
    }

    /**
     * Создает генератор типографии [TypographyGenerator]
     */
    fun createTypographyGenerator(): TypographyGenerator {
        return TypographyGenerator(
            outputDir,
            outputResDir,
            target,
            dimensAggregator,
            XmlDocumentBuilderFactory,
            createKtFileBuilder("com.sdds.playground.themebuilder.theme", "TypographyTokens"),
        )
    }

    /**
     * Создает генератор размеров [DimenGenerator]
     */
    fun createDimensGenerator(): DimenGenerator {
        return DimenGenerator(
            outputResDir,
            dimensAggregator,
            XmlDocumentBuilderFactory,
        )
    }

    private companion object {

        const val DEFAULT_FILE_INDENT = "    "

        fun createKtFileBuilder(packageName: String, fileName: String): FileSpec.Builder =
            FileSpec.builder(packageName, fileName).apply {
                indent(DEFAULT_FILE_INDENT)
            }
    }
}
