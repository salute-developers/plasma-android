package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.attributes.data.AttributeData
import com.sdds.plugin.themebuilder.internal.attributes.factory.KtAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.attributes.factory.XmlAttributeGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.Theme
import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.token.isLight
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
 * Gradle-задача для генерации атрибутов
 */
abstract class GenerateAttributesTask : DefaultTask() {

    /**
     * Мета-файл темы с токенами
     */
    @get:InputFile
    abstract val themeFile: RegularFileProperty

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
     * Путь к директория для сохранения xml-файлов с атрибутами
     */
    @get:Input
    abstract val outputResDirPath: Property<String>

    /**
     * Путь к директории для сохранения kt-файлов с атрибутами
     */
    @get:Input
    abstract val outputDirPath: Property<String>

    /**
     * Префикс для названий атрибутов
     */
    @get:Input
    abstract val attrPrefix: Property<String>

    private val xmlDocumentBuilderFactory by unsafeLazy {
        XmlResourcesDocumentBuilderFactory(attrPrefix.get())
    }

    private val xmlAttributeGeneratorFactory by unsafeLazy {
        XmlAttributeGeneratorFactory(xmlDocumentBuilderFactory)
    }

    private val ktAttributeGeneratorFactory by unsafeLazy {
        KtAttributeGeneratorFactory()
    }

    private val xmlAttributeGenerator by unsafeLazy {
        xmlAttributeGeneratorFactory.create(projectDir.get().dir(outputResDirPath).get().asFile)
    }

    private val ktAttributeGenerator by unsafeLazy {
        ktAttributeGeneratorFactory.create()
    }

    /**
     * Генерирует файлы с атрибутами
     */
    @TaskAction
    fun generate() {
        val tokens = decodeTheme().tokens
        val attributeData = tokens.extractAttributeData()
        when (target.get()) {
            ThemeBuilderTarget.VIEW_SYSTEM -> xmlAttributeGenerator.generate(
                attributeData = attributeData,
                attrPrefix = attrPrefix.get(),
            )

            ThemeBuilderTarget.COMPOSE -> ktAttributeGenerator.generate(
                attributeData = attributeData,
            )

            ThemeBuilderTarget.ALL -> {
                xmlAttributeGenerator.generate(
                    attributeData = attributeData,
                    attrPrefix = attrPrefix.get(),
                )
                ktAttributeGenerator.generate(
                    attributeData = attributeData,
                )
            }
        }
    }

    private fun decodeTheme(): Theme =
        themeFile.get().asFile.decode<Theme>(decoder = Serializer.meta)

    private fun List<Token>.extractAttributeData(): AttributeData {
        val colors = mutableListOf<String>()

        this.forEach {
            when (it) {
                is ColorToken -> if (it.isLight) colors.add(it.displayName)
            }
        }

        return AttributeData(colors)
    }
}
