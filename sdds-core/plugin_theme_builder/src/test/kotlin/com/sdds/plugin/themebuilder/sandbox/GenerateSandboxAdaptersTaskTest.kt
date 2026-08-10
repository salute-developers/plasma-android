package com.sdds.plugin.themebuilder.sandbox

import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class GenerateSandboxAdaptersTaskTest {


    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `generate при пустом config ничего не создает`() {
        val projectDir = temporaryFolder.root
        val configFile = temporaryFolder.newFile("config-info-compose.json")
        val outputDir = temporaryFolder.newFolder("generated")

        val task = createTask(projectDir, "generateComposeSandbox")

        configureTask(
            task = task,
            configFile = configFile,
            outputDir = outputDir,
            target = SandboxTarget.COMPOSE,
            scheme = SandboxScheme.V2,
        )

        task.generate()

        assertFalse(outputDir.resolve("com/test/sandbox").exists())
    }

    @Test
    fun `generate при отсутствующем config ничего не создает`() {
        val projectDir = temporaryFolder.root
        val configFile = temporaryFolder.root.resolve("missing-config-info-compose.json")
        val outputDir = temporaryFolder.newFolder("generated")

        val task = createTask(projectDir, "generateComposeSandbox")
        configureTask(
            task = task,
            configFile = configFile,
            outputDir = outputDir,
            target = SandboxTarget.COMPOSE,
            scheme = SandboxScheme.V2,
        )

        task.generate()
        assertFalse(outputDir.resolve("com/test/sandbox").exists())
    }

    @Test
    fun `generate при пустом target compose и пустом списке components создает compose provider`() {
        val projectDir = temporaryFolder.root
        val configFile = temporaryFolder.newFile("config-info-compose.json")
        val outputDir = temporaryFolder.newFolder("generated")

        writeConfigFile(configFile)

        val task = createTask(projectDir, "generateComposeSandbox")

        configureTask(
            task = task,
            configFile = configFile,
            outputDir = outputDir,
            target = SandboxTarget.COMPOSE,
            scheme = SandboxScheme.V2,
        )

        task.generate()

        assertTrue(outputDir.resolve("com/test/sandbox/TestThemeComposeComponents.kt").exists())
    }

    @Test
    fun `generate при пустом target xml и пустом списке components создает view provider`() {
        val projectDir = temporaryFolder.root
        val configFile = temporaryFolder.newFile("config-info-view-system.json")
        val outputDir = temporaryFolder.newFolder("generated")

        writeConfigFile(configFile)

        val task = createTask(projectDir, "generateComposeSandbox")

        configureTask(
            task = task,
            configFile = configFile,
            outputDir = outputDir,
            target = SandboxTarget.XML,
            scheme = SandboxScheme.V1,
        )

        task.generate()

        assertTrue(outputDir.resolve("com/test/sandbox/TestThemeViewComponents.kt").exists())
    }

    @Test
    fun `generate без packageName использует default package`() {
        val projectDir = temporaryFolder.root
        val configFile = temporaryFolder.newFile("config-info-compose.json")
        val outputDir = temporaryFolder.newFolder("generated")

        writeConfigFile(configFile)

        val task = createTask(projectDir, "generateComposeSandbox")
        configureTask(
            task = task,
            configFile = configFile,
            outputDir = outputDir,
            target = SandboxTarget.COMPOSE,
            scheme = SandboxScheme.V2,
            packageName = null,
        )

        task.generate()

        assertTrue(outputDir.resolve("com/sdds/generated/TestThemeComposeComponents.kt").exists())
    }

    @Test
    fun `generate без target падает`() {
        val projectDir = temporaryFolder.root
        val configFile = temporaryFolder.newFile("config-info-compose.json")
        val outputDir = temporaryFolder.newFolder("generated")

        writeConfigFile(configFile)

        val task = createTask(projectDir, "generateComposeSandbox")

        configureTask(
            task = task,
            configFile = configFile,
            outputDir = outputDir,
            target = null,
            scheme = SandboxScheme.V2,
        )

        assertThrows(Exception::class.java) {
            task.generate()
        }
    }

    private fun writeConfigFile(
        file: File,
        componentsJson: String = "[]",
    ) {
        file.writeText(
            """
                {
                "name": "TestTheme",
                "packageName": "com.test.theme",
                "components": $componentsJson
                }
            """.trimIndent(),
        )
    }

    private fun createTask(
        projectDir: File,
        taskName: String
    ): GenerateSandboxAdaptersTask {
        return ProjectBuilder.builder()
            .withProjectDir(projectDir)
            .build()
            .tasks
            .create(taskName, GenerateSandboxAdaptersTask::class.java)
    }

    private fun configureTask(
        task: GenerateSandboxAdaptersTask,
        configFile: File,
        outputDir: File,
        target: SandboxTarget? = SandboxTarget.COMPOSE,
        scheme: SandboxScheme,
        packageName: String? = "com.test.sandbox",
        themeAlias: String? = "TestTheme",
        multiplatform: Boolean = false
    ) {
        task.configInputFile.fileValue(configFile)
        task.outputDirectory.set(outputDir)

        packageName?.let {
            task.packageName.set(it)
        }
        task.themeAlias.set(themeAlias)
        task.target.set(target)
        task.scheme.set(scheme)
        task.multiplatform.set(multiplatform)
    }
}