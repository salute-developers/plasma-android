package tasks.docs

import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.workers.WorkAction
import org.gradle.workers.WorkParameters
import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment
import org.jetbrains.kotlin.com.google.gson.GsonBuilder
import org.jetbrains.kotlin.com.intellij.openapi.util.Disposer
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.config.KotlinCompilerVersion
import org.jetbrains.kotlin.psi.KtPsiFactory
import org.slf4j.LoggerFactory
import java.io.File

abstract class ActionUsingKotlinCompiler : WorkAction<ActionUsingKotlinCompiler.Params> {

    interface Params : WorkParameters {
        val kotlinSources: ConfigurableFileCollection
        val xmlSources: ConfigurableFileCollection
        val outputKotlinDir: DirectoryProperty
        val outputXmlDir: DirectoryProperty
        val outputMeta: RegularFileProperty
        val namespace: Property<String>
        val projectDir: DirectoryProperty
    }

    private val logger = LoggerFactory.getLogger(ActionUsingKotlinCompiler::class.java)

    override fun execute() {
        logger.info("Kotlin compiler version: ${KotlinCompilerVersion.getVersion()}")

        val outKotlinDir = parameters.outputKotlinDir.get().asFile
        outKotlinDir.mkdirs()

        val outXmlDir = parameters.outputXmlDir.get().asFile
        outXmlDir.mkdirs()

        val kotlinFiles = parameters.kotlinSources.files.toList()
        val xmlFiles = parameters.xmlSources.files.toList()
        val meta = mutableListOf<SampleMeta>()

        val disposable = Disposer.newDisposable("sdds-docs-psi")
        try {
            val env = KotlinCoreEnvironment.createForProduction(
                disposable,
                CompilerConfiguration(),
                EnvironmentConfigFiles.JVM_CONFIG_FILES
            )
            val projectDir = parameters.projectDir.get().asFile

            val psiFactory = KtPsiFactory(env.project, markGenerated = false)

            val kotlinDelegate = KotlinSnippetExtractorDelegate(
                psiFactory = psiFactory,
                snippetsDir = outKotlinDir,
                projectDir = projectDir,
            )

            kotlinFiles.forEach { file ->
                meta += kotlinDelegate.extractFromFile(file)
            }

            val xmlDelegate = XmlSnippetExtractorDelegate(
                snippetsDir = outXmlDir,
                projectDir = projectDir,
                namespace = parameters.namespace.get()
            )

            xmlFiles.forEach { file ->
                meta += xmlDelegate.extractFromFile(file)
            }

            val metaFile = parameters.outputMeta.asFile.get()
            val gson = GsonBuilder().setPrettyPrinting().create()
            metaFile.writeText(gson.toJson(meta))
            logger.info("Written docs meta: ${relativePath(projectDir, metaFile)} (samples=${meta.size})")
        } finally {
            Disposer.dispose(disposable)
        }

    }
}

internal fun relativePath(dir: File, target: File): String {
    return dir.toURI().relativize(target.toURI()).path
}
