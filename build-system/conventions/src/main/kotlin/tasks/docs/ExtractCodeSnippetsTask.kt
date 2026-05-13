package tasks.docs

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Classpath
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.workers.WorkerExecutor
import javax.inject.Inject

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

    @get:Inject
    abstract val executor: WorkerExecutor

    @get:Classpath
    abstract val kotlinCompiler: ConfigurableFileCollection

    @get:Input
    abstract val xmlNamespace: Property<String>

    init {
        kotlinSources.from(kotlinSourceTrees())
        xmlSources.from(xmlSourceTrees())
        xmlNamespace.convention("")
    }

    @TaskAction
    fun compile() {
        val workQueue = executor.classLoaderIsolation {
            classpath.from(kotlinCompiler)
        }
        workQueue.submit(ActionUsingKotlinCompiler::class.java) {
            kotlinSources.from(this@ExtractCodeSnippetsTask.kotlinSources)
            xmlSources.from(this@ExtractCodeSnippetsTask.xmlSources)
            outputKotlinDir.set(this@ExtractCodeSnippetsTask.outputKotlinDir)
            outputXmlDir.set(this@ExtractCodeSnippetsTask.outputXmlDir)
            outputMeta.set(this@ExtractCodeSnippetsTask.outputMeta)
            namespace.set(this@ExtractCodeSnippetsTask.xmlNamespace)
            projectDir.set(project.layout.projectDirectory)
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
