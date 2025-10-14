package tasks.integration

import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction
import org.jetbrains.kotlin.com.google.gson.GsonBuilder
import java.io.File

enum class ComponentsTarget {
    COMPOSE,
    XML,
}

abstract class GenerateComponentsDictionary : DefaultTask() {

    @get:InputFile
    abstract val configInputFile: RegularFileProperty

    @get:Input
    abstract val packageName: Property<String>

    @get:Input
    abstract val target: Property<ComponentsTarget>

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
        // Determine output dir from main source set root and packageName
        val mainRoot = resolveMainSourceRoot()
        val pkgPath = pkg.replace('.', File.separatorChar)
        val packageDir = File(mainRoot, pkgPath)
        if (!packageDir.exists()) packageDir.mkdirs()

        val generator = when(target) {
            ComponentsTarget.COMPOSE -> ComposeComponentsGenerator(config, pkg, packageDir)
            ComponentsTarget.XML -> XmlComponentsGenerator(config, pkg, packageDir)
        }

        generator.generate()
    }

    private fun resolveMainSourceRoot(): File {
        // Prefer Kotlin sources, then Java. Fallback to build/generated if none exist.
        val projectDir = project.layout.projectDirectory.asFile
        val kotlinDir = File(projectDir, "src/main/kotlin")
        val javaDir = File(projectDir, "src/main/java")
        return when {
            kotlinDir.exists() -> kotlinDir
            javaDir.exists() -> javaDir
            else -> project.layout.buildDirectory.dir("generated/sdds").get().asFile
        }
    }
}
