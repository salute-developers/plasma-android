package com.sdds.plugin.themebuilder

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.generator.ColorGenerator
import com.sdds.plugin.themebuilder.internal.generator.DimenGenerator
import com.sdds.plugin.themebuilder.internal.generator.GradientGenerator
import com.sdds.plugin.themebuilder.internal.generator.TypographyGenerator
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.LinearGradientToken
import com.sdds.plugin.themebuilder.internal.token.RadialGradientToken
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.SweepGradientToken
import com.sdds.plugin.themebuilder.internal.token.Theme
import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

/**
 *
 * @author Малышев Александр on 05.03.2024
 */
abstract class GenerateThemeTask : DefaultTask() {

    @get:InputFile
    abstract val themeFile: RegularFileProperty

    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty



    private val mainSourceSet = when {
        project.plugins.hasPlugin(AppPlugin::class.java) ->
            project.extensions.getByType(AppExtension::class.java).sourceSets.maybeCreate("main")
        project.plugins.hasPlugin(LibraryPlugin::class.java) ->
            project.extensions.getByType(LibraryExtension::class.java).sourceSets.maybeCreate("main")
        else -> throw IllegalStateException("The project must have either AppPlugin or LibraryPlugin applied.")
    }


    @TaskAction
    fun generate() {
        // val outputDir = project.layout.buildDirectory.dir("theme-builder").get().asFile
        val outputDir = outputDir.get().asFile
        val dimensAggregator = DimensAggregator()
        val colorGenerator = ColorGenerator(outputDir, XmlDocumentBuilderFactory)
        val gradientGenerator = GradientGenerator(outputDir, XmlDocumentBuilderFactory)
        val typographyGenerator = TypographyGenerator(outputDir, dimensAggregator, XmlDocumentBuilderFactory)
        val dimensGenerator = DimenGenerator(
            outputDir,
            dimensAggregator,
            XmlDocumentBuilderFactory
        )

        decodeTheme().tokens.onEach {
            when (it) {
                is ColorToken -> colorGenerator.addToken(it)
                is SweepGradientToken -> gradientGenerator.addToken(it)
                is LinearGradientToken -> gradientGenerator.addToken(it)
                is RadialGradientToken -> gradientGenerator.addToken(it)
                is ShadowToken -> {}
                is TypographyToken -> typographyGenerator.addToken(it)
            }
        }

        colorGenerator.generate()
        gradientGenerator.generate()
        typographyGenerator.generate()
        dimensGenerator.generate()
    }

    private fun decodeTheme(): Theme {
        val readFile = themeFile.get().asFile.readText()
        val theme = Serializer.instance.decodeFromString<Theme>(readFile)
        println("Decoded object $theme")
        return theme
    }
}
