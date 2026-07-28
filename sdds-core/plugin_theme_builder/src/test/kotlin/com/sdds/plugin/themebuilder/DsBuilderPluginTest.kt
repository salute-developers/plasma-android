package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.documentation.DocumentationAggregateTask
import com.sdds.plugin.themebuilder.sandbox.GenerateSandboxAdaptersTask
import com.sdds.plugin.themebuilder.sandbox.SandboxScheme
import org.gradle.api.attributes.Attribute
import org.gradle.api.internal.project.ProjectInternal
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.testkit.runner.GradleRunner
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class DsBuilderPluginTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `plugin registers only dsBuilder extension`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()

        project.plugins.apply(DsBuilderPlugin::class.java)

        assertNotNull(project.extensions.findByName("dsBuilder"))
        assertNull(project.extensions.findByName("themeBuilder"))
    }

    @Test
    fun `published plugin id registers dsBuilder without legacy extension`() {
        temporaryFolder.root.resolve("settings.gradle.kts").writeText("")
        temporaryFolder.root.resolve("build.gradle.kts").writeText(
            """
                plugins {
                    id("io.github.salute-developers.design-system-builder")
                }

                tasks.register("verifyDsl") {
                    doLast {
                        check(project.extensions.findByName("dsBuilder") != null)
                        check(project.extensions.findByName("themeBuilder") == null)
                    }
                }
            """.trimIndent(),
        )

        GradleRunner.create()
            .withProjectDir(temporaryFolder.root)
            .withPluginClasspath()
            .withArguments("verifyDsl")
            .build()
    }

    @Test
    fun `capabilities are independently activated by their blocks`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.documentation { compose() }

        assertTrue(extension.documentation.enabled.get())
        assertNotNull(extension.documentation.compose)
        assertFalse(extension.theme.enabled.get())
        assertFalse(extension.components.enabled.get())
        assertFalse(extension.sandbox.enabled.get())
    }

    @Test
    fun `root generation settings are conventions for theme and components`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.compose()
        extension.packageName.set("com.example.shared")
        extension.resourcePrefix.set("shared")
        extension.outputLocation.set(OutputLocation.SRC)
        extension.dimensions {
            fromResources(true)
            multiplier(2f)
        }

        listOf(extension.theme, extension.components).forEach { capability ->
            assertEquals(setOf(DsBuilderPlatform.COMPOSE), capability.targets.get())
            assertEquals("com.example.shared", capability.packageName.get())
            assertEquals("shared", capability.resourcesPrefix.get())
            assertEquals(OutputLocation.SRC, capability.outputLocation.get())
            assertTrue(capability.dimensions.get().fromResources)
            assertEquals(2f, capability.dimensions.get().multiplier)
        }
    }

    @Test
    fun `capability generation setting overrides root convention`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.packageName.set("com.example.shared")
        extension.components.packageName.set("com.example.components")

        assertEquals("com.example.shared", extension.theme.packageName.get())
        assertEquals("com.example.components", extension.components.packageName.get())
    }

    @Test
    fun `sandbox scheme defaults to V2`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.sandbox { compose {} }

        assertEquals(SandboxScheme.V2, extension.sandbox.compose?.scheme?.get())
    }

    @Test
    fun `sdds directory convention resolves current project`() {
        temporaryFolder.root.resolve(".sdds").mkdir()
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)

        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        assertTrue(
            extension.sddsDirectory.get().asFile.canonicalFile ==
                temporaryFolder.root.resolve(".sdds").canonicalFile,
        )
    }

    @Test
    fun `sdds directory convention resolves Gradle parent project`() {
        val parentDirectory = temporaryFolder.newFolder("parent")
        val childDirectory = parentDirectory.resolve("child").apply { mkdir() }
        val parentSdds = parentDirectory.resolve(".sdds").apply { mkdir() }
        val parent = ProjectBuilder.builder()
            .withProjectDir(parentDirectory)
            .build()
        val child = ProjectBuilder.builder()
            .withName("child")
            .withProjectDir(childDirectory)
            .withParent(parent)
            .build()
        child.plugins.apply(DsBuilderPlugin::class.java)

        val extension = child.extensions.getByType(DsBuilderExtension::class.java)

        assertEquals(parentSdds.canonicalFile, extension.sddsDirectory.get().asFile.canonicalFile)
    }

    @Test
    fun `platform info conventions are derived from shared sdds directory`() {
        val sdds = temporaryFolder.root.resolve("metadata").apply { mkdir() }
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)
        extension.sddsDirectory.set(sdds)

        extension.documentation {
            compose()
            view()
        }
        extension.sandbox {
            compose {}
            view {}
        }

        assertEquals(sdds.resolve("config.json"), extension.configFile.get().asFile)
        assertEquals(
            sdds.resolve("config-info-compose.json"),
            extension.documentation.compose?.componentsInfoFile?.get()?.asFile,
        )
        assertEquals(
            sdds.resolve("theme-info-compose.json"),
            extension.documentation.compose?.themeInfoFile?.get()?.asFile,
        )
        assertEquals(
            sdds.resolve("config-info-view-system.json"),
            extension.documentation.view?.componentsInfoFile?.get()?.asFile,
        )
        assertEquals(
            sdds.resolve("theme-info-view-system.json"),
            extension.documentation.view?.themeInfoFile?.get()?.asFile,
        )
        assertEquals(
            sdds.resolve("config-info-compose.json"),
            extension.sandbox.compose?.componentsInfoFile?.get()?.asFile,
        )
        assertEquals(
            sdds.resolve("config-info-view-system.json"),
            extension.sandbox.view?.componentsInfoFile?.get()?.asFile,
        )
    }

    @Test
    fun `explicit platform info overrides standard convention`() {
        val sdds = temporaryFolder.root.resolve(".sdds").apply { mkdir() }
        val override = temporaryFolder.root.resolve("custom-components.json")
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)
        extension.sddsDirectory.set(sdds)

        extension.documentation {
            compose {
                componentsInfoFile.set(override)
            }
        }

        assertEquals(
            override,
            extension.documentation.compose?.componentsInfoFile?.get()?.asFile,
        )
    }

    @Test
    fun `theme capability preserves default and additional tenant variations`() {
        val projectDir = temporaryFolder.root
        projectDir.resolve(".sdds/config.json").apply {
            parentFile.mkdirs()
            writeText(
                """
                    {
                      "tenants": [
                        { "name": "base", "alias": "Theme" },
                        { "name": "business", "alias": "Business" }
                      ]
                    }
                """.trimIndent(),
            )
        }
        createTenantFiles(projectDir.resolve(".sdds/base"))
        createTenantFiles(projectDir.resolve(".sdds/business"))
        projectDir.resolve(".sdds/tenants/palette.json").apply {
            parentFile.mkdirs()
            writeText("{}")
        }
        val project = ProjectBuilder.builder()
            .withProjectDir(projectDir)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).theme {
            compose()
            autoGenerate.set(false)
        }

        (project as ProjectInternal).evaluate()

        val task = project.tasks.getByName("generateTheme") as GenerateThemeTask
        assertEquals(listOf("", "Business"), task.themeTenants.get())
        assertEquals("Theme", task.themeName.get())
        assertNull(project.tasks.findByName("generateComponents"))
    }

    @Test
    fun `documentation capability registers local aggregation without portal tasks`() {
        val projectDir = temporaryFolder.root
        projectDir.resolve(".sdds").mkdir()
        val project = ProjectBuilder.builder().withProjectDir(projectDir).build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).documentation {
            compose()
        }

        (project as ProjectInternal).evaluate()

        assertNotNull(project.configurations.findByName("sddsCoreDocumentation"))
        assertEquals(
            "templates",
            project.configurations.getByName("sddsCoreDocumentation").attributes.getAttribute(
                Attribute.of("com.sdds.docs.variant", String::class.java),
            ),
        )
        assertNotNull(project.tasks.findByName("documentationExtract"))
        val aggregate = project.tasks.getByName("documentationAggregate") as DocumentationAggregateTask
        assertEquals(
            projectDir.resolve("override-docs").canonicalFile,
            aggregate.userDocumentationRoot.get().asFile.canonicalFile,
        )
        assertNull(project.tasks.findByName("docusaurusGenerate"))
        assertNull(project.tasks.findByName("npmInstall"))
        assertNull(project.tasks.findByName("publishDocumentation"))
    }

    @Test
    fun `compose sandbox derives package theme alias and generated output`() {
        val projectDir = temporaryFolder.root
        createSandboxMetadata(projectDir, "config-info-compose.json")
        val project = ProjectBuilder.builder().withProjectDir(projectDir).build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)
        extension.sandbox {
            compose {}
        }

        (project as ProjectInternal).evaluate()

        val task = project.tasks.getByName("generateComposeSandbox") as GenerateSandboxAdaptersTask
        assertEquals("com.example.theme.sandbox", task.packageName.get())
        assertEquals("BaseTheme", task.themeAlias.get())
        assertEquals(
            project.layout.buildDirectory.dir("generated/sdds/sandbox").get().asFile,
            task.outputDirectory.get().asFile,
        )
        assertTrue(
            ComposeSandboxPlatform::class.java.methods.none {
                it.name.contains("tenant", ignoreCase = true)
            },
        )
    }

    @Test
    fun `view sandbox registers independently from compose sandbox`() {
        val projectDir = temporaryFolder.root
        createSandboxMetadata(projectDir, "config-info-view-system.json")
        val project = ProjectBuilder.builder().withProjectDir(projectDir).build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).sandbox {
            view {
                generatedPackageName.set("com.example.explicit")
                themeAlias.set("ExplicitTheme")
            }
        }

        (project as ProjectInternal).evaluate()

        val task = project.tasks.getByName("generateViewSandbox") as GenerateSandboxAdaptersTask
        assertEquals("com.example.explicit", task.packageName.get())
        assertEquals("ExplicitTheme", task.themeAlias.get())
        assertNull(project.tasks.findByName("generateComposeSandbox"))
    }

    @Test
    fun `multiplatform sandbox generates into wired common source set`() {
        val projectDir = temporaryFolder.newFolder("kmp-sandbox")
        createSandboxMetadata(projectDir, "config-info-compose.json")
        projectDir.resolve("settings.gradle.kts").writeText("")
        projectDir.resolve("build.gradle.kts").writeText(
            """
                import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

                plugins {
                    id("org.jetbrains.kotlin.multiplatform")
                    id("io.github.salute-developers.design-system-builder")
                }

                kotlin {
                    jvm()
                }

                dsBuilder {
                    sandbox {
                        compose {
                            multiplatform.set(true)
                        }
                    }
                }

                tasks.register("verifySandboxWiring") {
                    dependsOn("generateComposeSandbox")
                    doLast {
                        val expected = layout.buildDirectory.dir("generated/sdds/sandbox").get().asFile
                        check(expected.walkTopDown().any { it.extension == "kt" })
                        val commonMain = project.extensions
                            .getByType(KotlinMultiplatformExtension::class.java)
                            .sourceSets
                            .getByName("commonMain")
                        check(commonMain.kotlin.srcDirs.any { it.canonicalFile == expected.canonicalFile })
                    }
                }
            """.trimIndent(),
        )

        GradleRunner.create()
            .withProjectDir(projectDir)
            .withPluginClasspath()
            .withArguments("verifySandboxWiring")
            .build()
    }

    private fun createTenantFiles(directory: java.io.File) {
        directory.resolve("android").mkdirs()
        directory.resolve("meta.json").writeText("{}")
        listOf(
            "android_color.json",
            "android_gradient.json",
            "android_typography.json",
            "android_fontFamily.json",
            "android_shape.json",
            "android_shadow.json",
            "android_spacing.json",
        ).forEach {
            directory.resolve("android/$it").writeText("{}")
        }
    }

    private fun createSandboxMetadata(projectDir: java.io.File, infoName: String) {
        projectDir.resolve(".sdds/$infoName").apply {
            parentFile.mkdirs()
            writeText(
                """
                    {
                      "name": "Example",
                      "packageName": "com.example.theme",
                      "components": []
                    }
                """.trimIndent(),
            )
        }
        projectDir.resolve(".sdds/config.json").writeText(
            """
                {
                  "tenants": [
                    { "name": "base", "alias": "BaseTheme" },
                    { "name": "business", "alias": "BusinessTheme" }
                  ]
                }
            """.trimIndent(),
        )
    }
}
