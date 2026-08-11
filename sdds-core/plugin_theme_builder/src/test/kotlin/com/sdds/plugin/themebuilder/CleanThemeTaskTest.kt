package com.sdds.plugin.themebuilder

import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class CleanThemeTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `clean удаляет директорию kotlin пакета и директорию ресурсов`() {
        val projectDir = temporaryFolder.newFolder("project")
        val kotlinPackageDir = projectDir.resolve("build/generated/theme-builder/com/test/theme").apply {
            mkdirs()
            resolve("Colors.kt").writeText("package com.test.theme")
        }
        val resourceDir = projectDir.resolve("build/generated/theme-builder-res").apply {
            resolve("values").mkdirs()
            resolve("values/colors.xml").writeText("<resources />")
        }
        val task = cleanTask(projectDir)
        task.outputDirPath.set("build/generated/theme-builder")
        task.outputResDirPath.set("build/generated/theme-builder-res")
        task.packageName.set("com.test.theme")

        task.clean()

        assertFalse(kotlinPackageDir.exists())
        assertFalse(resourceDir.exists())
        assertTrue(projectDir.exists())
    }

    private fun cleanTask(projectDir: File): CleanThemeTask {
        val project = ProjectBuilder.builder()
            .withProjectDir(projectDir)
            .build()
        return project.tasks.register("cleanTheme", CleanThemeTask::class.java).get()
    }
}
