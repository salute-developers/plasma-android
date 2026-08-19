package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import org.gradle.api.GradleException
import org.gradle.api.internal.project.ProjectInternal
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
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
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).apply {
            theme {
                compose()
                autoGenerate.set(false)
            }
        }

        (project as ProjectInternal).evaluate()

        assertNotNull(project.tasks.findByName("generateTheme"))
        assertNull(project.tasks.findByName("fetchPalette"))
        assertNull(project.tasks.findByName("fetchTheme"))
        assertNull(project.tasks.findByName("unpackThemeFiles"))
    }

    @Test
    fun `plugin не регистрирует генерацию компонентов если component source не задан`() {
        val project = createProject("components-without-source")
        val components = ThemeBuilderExtension().apply {
            compose()
            autoGenerate(false)
        }

        ThemeBuilderPlugin().configure(
            project = project,
            themeExtension = { null },
            componentsExtension = { components },
        )
        project.evaluate()

        assertNotNull(project.tasks.findByName("cleanTheme"))
        assertNotNull(project.tasks.findByName("compareGeneratedTheme"))
        assertNotNull(project.tasks.findByName("readUikitComposeApiMeta"))
        assertNotNull(project.tasks.findByName("readUikitApiMeta"))
        assertNull(project.tasks.findByName("fetchComponents"))
        assertNull(project.tasks.findByName("unpackComponentFiles"))
        assertNull(project.tasks.findByName("generateComponents"))
    }

    @Test
    fun `plugin регистрирует fetch unzip и generation tasks для remote component source`() {
        val project = createProject("remote-components")
        project.configurations.create("compileClasspath")
        val components = ThemeBuilderExtension().apply {
            compose {
                componentsMetaStyleClass(true)
            }
            componentSource("https://example.com/components.zip")
            ktPackage("com.test.tokens")
            resourcesPrefix("test")
            autoGenerate(false)
        }

        ThemeBuilderPlugin().configure(
            project = project,
            themeExtension = { null },
            componentsExtension = { components },
        )
        project.evaluate()

        val fetchComponents = project.tasks.getByName("fetchComponents") as FetchFileTask
        val generateComponents = project.tasks.getByName("generateComponents") as GenerateComponentsTask
        assertEquals("https://example.com/components.zip", fetchComponents.url.get())
        assertNotNull(project.tasks.findByName("unpackComponentFiles"))
        assertNotNull(project.tasks.findByName("readUikitComposeApiMeta"))
        assertNotNull(project.tasks.findByName("readUikitApiMeta"))
        assertEquals("com.test.tokens", generateComponents.packageName.get())
        assertEquals(ThemeBuilderTarget.COMPOSE, generateComponents.target.get())
        assertTrue(generateComponents.componentsMetaStyleClass.get())
        assertEquals("Default", generateComponents.themeName.get())
    }

    @Test
    fun `plugin регистрирует palette theme unzip и generation tasks для remote theme source`() {
        val project = createProject("remote-theme")
        val theme = ThemeBuilderExtension().apply {
            compose()
            themeSource("https://example.com/theme.zip")
            paletteUrl("https://example.com/palette.json")
            ktPackage("com.test.tokens")
            autoGenerate(false)
        }

        ThemeBuilderPlugin().configure(
            project = project,
            themeExtension = { theme },
            componentsExtension = { null },
        )
        project.evaluate()

        val fetchPalette = project.tasks.getByName("fetchPalette") as FetchFileTask
        val fetchTheme = project.tasks.getByName("fetchTheme") as FetchFileTask
        val generateTheme = project.tasks.getByName("generateTheme") as GenerateThemeTask
        assertEquals("https://example.com/palette.json", fetchPalette.url.get())
        assertEquals("https://example.com/theme.zip", fetchTheme.url.get())
        assertNotNull(project.tasks.findByName("unpackThemeFiles"))
        assertEquals("com.test.tokens", generateTheme.packageName.get())
        assertEquals(ThemeBuilderTarget.COMPOSE, generateTheme.target.get())
        assertEquals("Default", generateTheme.themeName.get())
    }

    @Test
    fun `plugin добавляет generateTheme в preBuild если autoGenerate включен`() {
        val project = createProject("theme-auto-generate")
        val preBuild = project.tasks.register("preBuild")
        val theme = ThemeBuilderExtension().apply {
            compose()
            themeSource("https://example.com/theme.zip")
        }

        ThemeBuilderPlugin().configure(
            project = project,
            themeExtension = { theme },
            componentsExtension = { null },
        )
        project.evaluate()

        assertTrue(
            preBuild.get().taskDependencies.getDependencies(preBuild.get())
                .any { it.name == "generateTheme" },
        )
    }

    @Test
    fun `plugin падает если url remote component source пустой`() {
        val project = createProject("empty-component-source")
        val components = ThemeBuilderExtension().apply {
            compose()
            componentSource("")
            autoGenerate(false)
        }

        ThemeBuilderPlugin().configure(
            project = project,
            themeExtension = { null },
            componentsExtension = { components },
        )

        val exception = assertThrows(GradleException::class.java) {
            project.evaluate()
        }
        assertEquals("Source url should not be empty: url=", exception.cause?.message)
    }

    @Test
    fun `plugin собирает url темы из name и version source`() {
        val project = createProject("theme-name-version")
        val theme = ThemeBuilderExtension().apply {
            compose()
            themeSource(name = "plasma", version = "1.2.3", alias = "PlasmaTheme")
            autoGenerate(false)
        }

        ThemeBuilderPlugin().configure(
            project = project,
            themeExtension = { theme },
            componentsExtension = { null },
        )
        project.evaluate()

        val fetchTheme = project.tasks.getByName("fetchTheme") as FetchFileTask
        val generateTheme = project.tasks.getByName("generateTheme") as GenerateThemeTask
        assertEquals(
            "https://github.com/salute-developers/theme-converter/raw/main/themes/plasma/1.2.3.zip",
            fetchTheme.url.get(),
        )
        assertEquals("PlasmaTheme", generateTheme.themeName.get())
    }

    @Test
    fun `plugin собирает url компонентов из name и version source`() {
        val project = createProject("components-name-version")
        project.configurations.create("compileClasspath")
        val components = ThemeBuilderExtension().apply {
            compose()
            componentSource(name = "button", version = "2.0.0", alias = "ButtonTheme")
            autoGenerate(false)
        }

        ThemeBuilderPlugin().configure(
            project = project,
            themeExtension = { null },
            componentsExtension = { components },
        )
        project.evaluate()

        val fetchComponents = project.tasks.getByName("fetchComponents") as FetchFileTask
        val generateComponents = project.tasks.getByName("generateComponents") as GenerateComponentsTask
        assertEquals(
            "https://github.com/salute-developers/theme-converter/raw/main/components/button/2.0.0.zip",
            fetchComponents.url.get(),
        )
        assertEquals("ButtonTheme", generateComponents.themeName.get())
    }

    @Test
    fun `plugin регистрирует отдельные fetch tasks для multitenant theme sources`() {
        val project = createProject("theme-multitenant")
        val theme = ThemeBuilderExtension().apply {
            compose()
            themeSources(baseAlias = "BaseTheme") {
                defaultSource(name = "base", version = "1.0.0")
                source(name = "business", version = "1.0.0", tenant = "Business")
            }
            autoGenerate(false)
        }

        ThemeBuilderPlugin().configure(
            project = project,
            themeExtension = { theme },
            componentsExtension = { null },
        )
        project.evaluate()

        val fetchDefault = project.tasks.getByName("fetchTheme") as FetchFileTask
        val fetchBusiness = project.tasks.getByName("fetchThemeBusiness") as FetchFileTask
        val generateTheme = project.tasks.getByName("generateTheme") as GenerateThemeTask
        assertEquals(
            "https://github.com/salute-developers/theme-converter/raw/main/themes/base/1.0.0.zip",
            fetchDefault.url.get(),
        )
        assertEquals(
            "https://github.com/salute-developers/theme-converter/raw/main/themes/business/1.0.0.zip",
            fetchBusiness.url.get(),
        )
        assertNotNull(project.tasks.findByName("unpackThemeFilesBusiness"))
        assertEquals(listOf("", "Business"), generateTheme.themeTenants.get())
        assertEquals("BaseTheme", generateTheme.themeName.get())
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

    private fun createProject(name: String): ProjectInternal {
        return ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.newFolder(name))
            .build() as ProjectInternal
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
