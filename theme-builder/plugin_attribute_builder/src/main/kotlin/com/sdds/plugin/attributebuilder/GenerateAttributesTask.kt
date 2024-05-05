package com.sdds.plugin.attributebuilder

import com.sdds.plugin.attributebuilder.internal.factory.GeneratorFactory
import com.sdds.plugin.core.serializer.Serializer
import com.sdds.plugin.core.serializer.decode
import com.sdds.plugin.core.token.Theme
import com.sdds.plugin.core.utils.unsafeLazy
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

/**
 * Gradle-задача для генерации атрибутов
 */
abstract class GenerateAttributesTask : DefaultTask() {

    /**
     * Мета-файл темы с токенами
     */
    @get:InputFile
    abstract val themeFile: RegularFileProperty

    /**
     * Целевой фреймворк для генерации атрибутов
     */
    @get:Input
    abstract val target: Property<AttributeBuilderTarget>

    /**
     * Директория для сохранения xml-файлов с атрибутами
     */
    @get:OutputDirectory
    abstract val outputResDir: DirectoryProperty

    /**
     * Директория для сохранения kt-файлов токенов
     */
    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty

    private val generatorFactory by unsafeLazy {
        GeneratorFactory(
            target = target.get(),
            outputDir = outputDir.get().asFile,
            outputResDir = outputResDir.get().asFile,
        )
    }

    private val attributeGenerator by unsafeLazy { generatorFactory.createAttributeGenerator() }

    /**
     * Генерирует файлы с атрибутами
     */
    @TaskAction
    fun generate() {
        val tokens = decodeTheme().tokens
        attributeGenerator.generateFrom(tokens)
    }

    private fun decodeTheme(): Theme =
        themeFile.get().asFile.decode<Theme>(decoder = Serializer.meta)
}
