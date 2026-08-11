package com.sdds.plugin.themebuilder

import org.gradle.api.GradleException
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class CompareGeneratedThemeTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `compare не падает если ресурсы совместимы`() {
        val projectDir = temporaryFolder.newFolder("project-compatible")
        val baseline = temporaryFolder.newFolder("baseline-compatible")
        val actual = projectDir.resolve(OUTPUT_RES_DIR)
        createStyleFile(
            baseline,
            """
                <item name="sd_textColor">?attr/colorPrimary</item>
                <item name="sd_background">?attr/colorBackground</item>
            """.trimIndent(),
        )
        createStyleFile(
            actual,
            """
                <item name="sd_background">?attr/colorBackground</item>
                <item name="sd_textColor">?attr/colorPrimary</item>
            """.trimIndent(),
        )
        val task = compareTask(projectDir)
        task.setBaseline(baseline.path)
        task.setLimit("1")
        task.outputResDirPath.set(OUTPUT_RES_DIR)

        task.compare()

        assertEquals(baseline.path, task.baselineDir.get())
        assertEquals(1, task.reportLimit.get())
    }

    @Test
    fun `compare падает если директория baseline не существует`() {
        val projectDir = temporaryFolder.newFolder("project-missing-baseline")
        val missingBaseline = temporaryFolder.root.resolve("missing-baseline")
        val task = compareTask(projectDir)
        task.setBaseline(missingBaseline.path)
        task.outputResDirPath.set(OUTPUT_RES_DIR)
        task.reportLimit.set(50)

        val exception = assertThrows(GradleException::class.java) {
            task.compare()
        }

        assertTrue(exception.message.orEmpty().contains(missingBaseline.absolutePath))
    }

    @Test
    fun `compare падает если директория actual ресурсов не существует`() {
        val projectDir = temporaryFolder.newFolder("project-missing-actual")
        val baseline = temporaryFolder.newFolder("baseline-missing-actual")
        val missingActual = projectDir.resolve(OUTPUT_RES_DIR)
        val task = compareTask(projectDir)
        task.setBaseline(baseline.path)
        task.outputResDirPath.set(OUTPUT_RES_DIR)
        task.reportLimit.set(50)

        val exception = assertThrows(GradleException::class.java) {
            task.compare()
        }

        assertTrue(exception.message.orEmpty().contains(missingActual.absolutePath))
    }

    @Test
    fun `compare падает если есть семантическое отличие`() {
        val projectDir = temporaryFolder.newFolder("project-semantic-diff")
        val baseline = temporaryFolder.newFolder("baseline-semantic-diff")
        val actual = projectDir.resolve(OUTPUT_RES_DIR)
        createStyleFile(baseline, "<item name=\"sd_background\">?attr/colorPrimary</item>")
        createStyleFile(actual, "<item name=\"sd_background\">?attr/colorSecondary</item>")
        val task = compareTask(projectDir)
        task.setBaseline(baseline.path)
        task.outputResDirPath.set(OUTPUT_RES_DIR)
        task.reportLimit.set(50)

        val exception = assertThrows(GradleException::class.java) {
            task.compare()
        }

        assertTrue(exception.message.orEmpty().contains("1"))
    }

    private fun compareTask(projectDir: File): CompareGeneratedThemeTask {
        val project = ProjectBuilder.builder()
            .withProjectDir(projectDir)
            .build()
        return project.tasks.register("compareGeneratedTheme", CompareGeneratedThemeTask::class.java) {
            this.projectDir.set(project.layout.projectDirectory)
        }.get()
    }

    private fun createStyleFile(root: File, items: String) {
        root.resolve("values/styles.xml").apply {
            parentFile.mkdirs()
            writeText(
                """
                    <?xml version="1.0" encoding="utf-8"?>
                    <resources>
                        <style name="TestTheme" parent="BaseTheme">
                            $items
                        </style>
                    </resources>
                """.trimIndent(),
            )
        }
    }

    private companion object {
        const val OUTPUT_RES_DIR = "build/generated/theme-builder-res"
    }
}
