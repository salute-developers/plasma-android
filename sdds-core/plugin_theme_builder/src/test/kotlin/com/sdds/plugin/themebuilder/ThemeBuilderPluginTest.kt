package com.sdds.plugin.themebuilder

import org.gradle.api.internal.project.ProjectInternal
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class ThemeBuilderPluginTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `plugin does not register theme zip tasks for local sdds source`() {
        val projectDir = temporaryFolder.root
        createSddsConfig(projectDir)
        val project = ProjectBuilder.builder()
            .withProjectDir(projectDir)
            .build()
        project.configurations.create("compileClasspath")
        project.plugins.apply(ThemeBuilderPlugin::class.java)
        project.extensions.getByType(ThemeBuilderExtension::class.java).apply {
            compose()
            autoGenerate(false)
        }

        (project as ProjectInternal).evaluate()

        assertNotNull(project.tasks.findByName("generateTheme"))
        assertNull(project.tasks.findByName("fetchPalette"))
        assertNull(project.tasks.findByName("fetchTheme"))
        assertNull(project.tasks.findByName("unpackThemeFiles"))
    }

    private fun createSddsConfig(projectDir: File) {
        projectDir.resolve(".sdds/config.json").apply {
            parentFile.mkdirs()
            writeText(
                """
                    {
                      "tenants": [
                        {
                          "name": "base"
                        }
                      ]
                    }
                """.trimIndent(),
            )
        }
        createTenantFiles(projectDir.resolve(".sdds/base"))
        projectDir.resolve(".sdds/tenants/palette.json").apply {
            parentFile.mkdirs()
            writeText("{}")
        }
    }

    private fun createTenantFiles(directory: File) {
        directory.resolve("android").mkdirs()
        directory.resolve("meta.json").writeText("{}")
        tokenFileNames.forEach {
            directory.resolve("android/$it").writeText("{}")
        }
    }

    private companion object {
        val tokenFileNames = listOf(
            "android_color.json",
            "android_gradient.json",
            "android_typography.json",
            "android_fontFamily.json",
            "android_shape.json",
            "android_shadow.json",
            "android_spacing.json",
        )
    }
}
