package tasks.docs

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.zip.ZipFile

abstract class UnzipCodeSnippetsTask : DefaultTask() {

    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val docsArtifacts: ConfigurableFileCollection

    @get:OutputDirectory
    abstract val snippetsOutDir: DirectoryProperty

    @TaskAction
    fun run() {
        val snippetsOut = snippetsOutDir.asFile.get()

        snippetsOut.mkdirs()

        docsArtifacts.files.forEach { artifact ->
            extractFromArtifact(artifact, snippetsOut)
        }

        logger.lifecycle(
            "Extracted docs snippets from ${docsArtifacts.files.size} artifact(s) into ${project.relativePath(snippetsOut)}"
        )
    }

    private fun extractFromArtifact(
        artifact: File,
        snippetsOut: File
    ) {
        ZipFile(artifact).use { zip ->
            zip.entries().asSequence().forEach { entry ->
                when {
                    entry.name.startsWith("META-INF/sdds-docs/") -> {
                        val relative = entry.name.removePrefix("META-INF/sdds-docs/")
                        val target = File(snippetsOut, relative)

                        if (entry.isDirectory) {
                            target.mkdirs()
                        } else {
                            target.parentFile.mkdirs()
                            target.outputStream().use { out ->
                                zip.getInputStream(entry).copyTo(out)
                            }
                        }
                    }
                }
            }
        }
    }
}