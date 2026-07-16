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

enum class Scheme {
    V1,
    V2,
}

abstract class GenerateComponentsDictionary : DefaultTask() {

    @get:InputFile
    abstract val configInputFile: RegularFileProperty

    @get:Input
    abstract val packageName: Property<String>

    @get:Input
    abstract val themeAlias: Property<String>

    @get:Input
    abstract val target: Property<ComponentsTarget>

    @get:Input
    abstract val scheme: Property<Scheme>

    @get:Input
    abstract val multiplatform: Property<Boolean>

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
        val scheme = scheme.get() ?: Scheme.V1
        val multiplatform = multiplatform.getOrElse(false)
        // Determine output dir from main source set root and packageName
        val mainRoot = resolveMainSourceRoot(multiplatform)
        val pkgPath = pkg.replace('.', File.separatorChar)
        cleanupStaleSourceRoots(pkgPath, mainRoot)
        val packageDir = File(mainRoot, pkgPath)
        if (!packageDir.exists()) packageDir.mkdirs()

        val generator = when(target) {
            ComponentsTarget.COMPOSE -> {
                ComposeComponentsGenerator(
                    config = config,
                    packageName = pkg,
                    packageDir = packageDir,
                    scheme = scheme,
                    themeAlias = themeAlias,
                    multiplatform = multiplatform,
                )
            }
            ComponentsTarget.XML -> XmlComponentsGenerator(config, pkg, packageDir, scheme)
        }

        generator.generate()
    }

    private fun resolveMainSourceRoot(multiplatform: Boolean): File {
        // Prefer Kotlin sources, then Java. Fallback to build/generated if none exist.
        val projectDir = project.layout.projectDirectory.asFile
        val commonKotlinDir = File(projectDir, "src/commonMain/kotlin")
        val kotlinDir = File(projectDir, "src/main/kotlin")
        val javaDir = File(projectDir, "src/main/java")
        return when {
            multiplatform -> commonKotlinDir
            kotlinDir.exists() -> kotlinDir
            javaDir.exists() -> javaDir
            else -> project.layout.buildDirectory.dir("generated/sdds").get().asFile
        }
    }

    private fun cleanupStaleSourceRoots(
        packagePath: String,
        activeRoot: File,
    ) {
        val projectDir = project.layout.projectDirectory.asFile
        listOf(
            File(projectDir, "src/commonMain/kotlin"),
            File(projectDir, "src/main/kotlin"),
            File(projectDir, "src/main/java"),
        )
            .filterNot { it == activeRoot }
            .map { File(it, packagePath) }
            .filter { it.exists() }
            .forEach { packageDir ->
                val sourceRoot = generateSequence(packageDir) { it.parentFile }
                    .first { it.name == "kotlin" || it.name == "java" }
                packageDir.deleteRecursively()
                deleteEmptyParents(packageDir.parentFile, sourceRoot)
            }
    }

    private fun deleteEmptyParents(
        directory: File?,
        stopAt: File,
    ) {
        var current = directory
        while (current != null && current != stopAt) {
            if (current.listFiles()?.isEmpty() == true) {
                current.delete()
                current = current.parentFile
            } else {
                return
            }
        }
        if (stopAt.listFiles()?.isEmpty() == true) {
            stopAt.delete()
        }
    }
}
