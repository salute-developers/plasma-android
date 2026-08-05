@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicFunction",
    "UndocumentedPublicProperty",
)

package com.sdds.plugin.themebuilder.sandbox

import com.google.gson.GsonBuilder
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.File

enum class SandboxTarget {
    COMPOSE,
    XML,
}

enum class SandboxScheme {
    V1,
    V2,
}

abstract class GenerateSandboxAdaptersTask : DefaultTask() {

    @get:InputFile
    abstract val configInputFile: RegularFileProperty

    @get:Input
    abstract val packageName: Property<String>

    @get:Input
    abstract val themeAlias: Property<String>

    @get:Input
    abstract val target: Property<SandboxTarget>

    @get:Input
    abstract val scheme: Property<SandboxScheme>

    @get:Input
    abstract val multiplatform: Property<Boolean>

    @get:OutputDirectory
    abstract val outputDirectory: DirectoryProperty

    init {
        group = "sandbox"
    }

    @TaskAction
    fun generate() {
        val gson = GsonBuilder().setPrettyPrinting().create()

        val configFile = configInputFile.get().asFile
            .takeIf { it.exists() }
            ?.readText().orEmpty()
        if (configFile.isBlank()) {
            logger.warn("config file is empty or do not exists")
            return
        }

        val config = gson.fromJson(configFile, Config::class.java)

        val pkg = packageName.orNull ?: "com.sdds.generated"
        val target = target.get() ?: throw GradleException("Property target must be specified")
        val themeAlias = themeAlias.get() ?: throw GradleException("Property themeAlias must be specified")
        val scheme = scheme.getOrElse(SandboxScheme.V2)
        val multiplatform = multiplatform.getOrElse(false)
        val mainRoot = outputDirectory.get().asFile
        val pkgPath = pkg.replace('.', File.separatorChar)
        val packageDir = File(mainRoot, pkgPath)
        if (!packageDir.exists()) packageDir.mkdirs()

        val generator = when (target) {
            SandboxTarget.COMPOSE -> {
                ComposeComponentsGenerator(
                    config = config,
                    packageName = pkg,
                    packageDir = packageDir,
                    scheme = scheme,
                    themeAlias = themeAlias,
                    multiplatform = multiplatform,
                )
            }
            SandboxTarget.XML -> XmlComponentsGenerator(config, pkg, packageDir, scheme)
        }

        generator.generate()
    }
}
