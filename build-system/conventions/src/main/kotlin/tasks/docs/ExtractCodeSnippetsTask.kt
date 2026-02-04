package tasks.docs

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment
import org.jetbrains.kotlin.com.google.gson.GsonBuilder
import org.jetbrains.kotlin.com.intellij.openapi.util.Disposer
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.psi.KtPsiFactory

abstract class ExtractCodeSnippetsTask : DefaultTask() {

    @get:OutputDirectory
    abstract val outputKotlinDir: DirectoryProperty

    @get:OutputDirectory
    abstract val outputXmlDir: DirectoryProperty

    @get:OutputFile
    abstract val outputMeta: RegularFileProperty


    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val kotlinSources: ConfigurableFileCollection

    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val xmlSources: ConfigurableFileCollection

    @get:Input
    abstract val xmlNamespace: org.gradle.api.provider.Property<String>

    init {
        kotlinSources.from(kotlinSourceTrees())
        xmlSources.from(xmlSourceTrees())
        xmlNamespace.convention("")
    }

    @TaskAction
    fun run() {
        val outKotlinDir = outputKotlinDir.get().asFile
        outKotlinDir.mkdirs()

        val outXmlDir = outputXmlDir.get().asFile
        outXmlDir.mkdirs()

        val kotlinFiles = kotlinSources.files.toList()
        val xmlFiles = xmlSources.files.toList()
        val meta = mutableListOf<SampleMeta>()

        val disposable = Disposer.newDisposable("sdds-docs-psi")
        try {
            val env = KotlinCoreEnvironment.createForProduction(
                disposable,
                CompilerConfiguration(),
                EnvironmentConfigFiles.JVM_CONFIG_FILES
            )

            val psiFactory = KtPsiFactory(env.project, markGenerated = false)

            val kotlinDelegate = KotlinSnippetExtractorDelegate(
                psiFactory = psiFactory,
                snippetsDir = outKotlinDir,
                project = project
            )

            kotlinFiles.forEach { file ->
                meta += kotlinDelegate.extractFromFile(file)
            }

            val xmlDelegate = XmlSnippetExtractorDelegate(
                snippetsDir = outXmlDir,
                project = project,
                namespace = xmlNamespace.get()
            )

            xmlFiles.forEach { file ->
                meta += xmlDelegate.extractFromFile(file)
            }

            val metaFile = outputMeta.asFile.get()
            val gson = GsonBuilder().setPrettyPrinting().create()
            metaFile.writeText(gson.toJson(meta))
            logger.lifecycle("Written docs meta: ${project.relativePath(metaFile)} (samples=${meta.size})")
        } finally {
            Disposer.dispose(disposable)
        }
    }


    private fun kotlinSourceTrees(): FileCollection {
        val roots = listOf(
            project.file("src/main/kotlin"),
            project.file("src/main/java"),
            project.file("src")
        ).filter { it.exists() }

        return project.files(roots.map { root ->
            project.fileTree(root) {
                include("**/*.kt")
            }
        })
    }

    private fun xmlSourceTrees(): FileCollection {
        val roots = listOf(
            project.file("src/main/res"),
            project.file("src/main/resources"),
            project.file("src")
        ).filter { it.exists() }

        return project.files(roots.map { root ->
            project.fileTree(root) {
                include("**/*.xml")
            }
        })
    }
}