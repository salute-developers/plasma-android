package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
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

        extension.targets { compose() }
        extension.documentation { compose() }

        assertTrue(extension.documentation.enabled.get())
        assertNotNull(extension.documentation.compose)
        assertFalse(extension.theme.enabled.get())
        assertFalse(extension.components.enabled.get())
        assertFalse(extension.sandbox.enabled.get())
    }

    @Test
    fun `targets block enables Compose for theme and components`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.targets { compose() }

        assertEquals(setOf(DsBuilderPlatform.COMPOSE), extension.targets.get())
        listOf(extension.theme, extension.components).forEach { capability ->
            assertEquals(setOf(DsBuilderPlatform.COMPOSE), capability.targets.get())
        }
    }

    @Test
    fun `targets block enables View with theme configuration`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.targets {
            view {
                themeParents {
                    materialComponentsTheme("NoActionBar")
                    materialComponentsTheme("Dialog")
                }
                setupShapeAppearance(sddsShape())
            }
        }

        assertEquals(setOf(DsBuilderPlatform.VIEW), extension.targets.get())
        assertEquals(2, extension.viewThemeParents.get().size)
        assertEquals(2, extension.viewShapeAppearance.get().size)
        listOf(extension.theme, extension.components).forEach { capability ->
            assertEquals(setOf(DsBuilderPlatform.VIEW), capability.targets.get())
            assertEquals(extension.viewThemeParents.get(), capability.viewThemeParents.get())
            assertEquals(extension.viewShapeAppearance.get(), capability.viewShapeAppearance.get())
        }
    }

    @Test
    fun `targets block enables both Compose and View when configured together`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.targets {
            compose()
            view { themeParents { materialComponentsTheme() } }
        }

        assertEquals(
            setOf(DsBuilderPlatform.COMPOSE, DsBuilderPlatform.VIEW),
            extension.targets.get(),
        )
        listOf(extension.theme, extension.components).forEach { capability ->
            assertEquals(
                setOf(DsBuilderPlatform.COMPOSE, DsBuilderPlatform.VIEW),
                capability.targets.get(),
            )
        }
    }

    @Test
    fun `targets block propagates multiplatform flag`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.targets { compose(multiplatform = true) }

        assertTrue(extension.multiplatform.get())
        assertTrue(extension.theme.multiplatform.get())
        assertTrue(extension.components.multiplatform.get())
    }

    @Test
    fun `multiple targets blocks accumulate their configuration`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.targets { compose() }
        extension.targets { view { themeParents { materialComponentsTheme() } } }

        assertEquals(
            setOf(DsBuilderPlatform.COMPOSE, DsBuilderPlatform.VIEW),
            extension.targets.get(),
        )
    }

    @Test
    fun `root generation settings are conventions for theme and components`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.targets { compose() }
        extension.packageName.set("com.example.shared")
        extension.resourcePrefix.set("shared")
        extension.outputLocation.set(OutputLocation.SRC)
        extension.autoGenerate.set(false)
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
        assertEquals(OutputLocation.SRC, extension.sandbox.outputLocation.get())
        listOf(
            extension.theme,
            extension.components,
            extension.documentation,
            extension.sandbox,
        ).forEach { capability ->
            assertFalse(capability.autoGenerate.get())
        }
    }

    @Test
    fun `capabilities use root autoGenerate convention`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        assertTrue(extension.theme.autoGenerate.get())

        extension.autoGenerate.set(false)

        listOf(
            extension.theme,
            extension.components,
            extension.documentation,
            extension.sandbox,
        ).forEach { capability ->
            assertFalse(capability.autoGenerate.get())
        }
    }

    @Test
    fun `legacy top-level compose shortcut still works for backward compatibility`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        @Suppress("DEPRECATION")
        extension.compose()

        assertEquals(setOf(DsBuilderPlatform.COMPOSE), extension.targets.get())
        assertEquals(setOf(DsBuilderPlatform.COMPOSE), extension.theme.targets.get())
        assertEquals(setOf(DsBuilderPlatform.COMPOSE), extension.components.targets.get())
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
    fun `documentation compose and view blocks are config-only and do not select platforms`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.documentation {
            compose()
            view()
        }

        assertNotNull(extension.documentation.compose)
        assertNotNull(extension.documentation.view)
        // Documentation does not contribute to the top-level targets set
        assertEquals(emptySet<DsBuilderPlatform>(), extension.targets.get())
    }

    @Test
    fun `documentation compose block accepts platform configuration override`() {
        val override = temporaryFolder.root.resolve("custom-components.json")
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.targets { compose() }
        extension.documentation {
            compose {
                componentsInfoFile.set(override)
            }
        }

        assertEquals(override, extension.documentation.compose?.componentsInfoFile?.get()?.asFile)
        assertNull(extension.documentation.view)
    }

    @Test
    fun `sandbox compose and view blocks are config-only and do not select platforms`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.root)
            .build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)

        extension.sandbox {
            compose {
                generatedPackageName.set("com.example.compose.sandbox")
                themeAlias.set("ComposeTheme")
            }
            view {
                generatedPackageName.set("com.example.view.sandbox")
                themeAlias.set("ViewTheme")
            }
        }

        assertEquals("com.example.compose.sandbox", extension.sandbox.compose?.generatedPackageName?.get())
        assertEquals("ComposeTheme", extension.sandbox.compose?.themeAlias?.get())
        assertEquals("com.example.view.sandbox", extension.sandbox.view?.generatedPackageName?.get())
        assertEquals("ViewTheme", extension.sandbox.view?.themeAlias?.get())
        // Sandbox does not contribute to the top-level targets set
        assertEquals(emptySet<DsBuilderPlatform>(), extension.targets.get())
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

        extension.targets {
            compose()
            view()
        }
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

        extension.targets { compose() }
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
        val preBuild = project.tasks.register("preBuild")
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).apply {
            targets { compose() }
            documentation { compose() }
        }

        (project as ProjectInternal).evaluate()

        assertNotNull(project.configurations.findByName("sddsCoreDocumentation"))
        assertEquals(
            "templates",
            project.configurations.getByName("sddsCoreDocumentation").attributes.getAttribute(
                Attribute.of("com.sdds.docs.variant", String::class.java),
            ),
        )
        assertTrue(
            preBuild.get().taskDependencies.getDependencies(preBuild.get())
                .any { it.name == "documentationAggregate" },
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
        val preBuild = project.tasks.register("preBuild")
        project.plugins.apply(DsBuilderPlugin::class.java)
        val extension = project.extensions.getByType(DsBuilderExtension::class.java)
        extension.targets { compose() }
        extension.sandbox { compose {} }

        (project as ProjectInternal).evaluate()

        val task = project.tasks.getByName("generateComposeSandbox") as GenerateSandboxAdaptersTask
        assertEquals("com.example.theme.sandbox", task.packageName.get())
        assertEquals("BaseTheme", task.themeAlias.get())
        assertEquals(
            project.layout.buildDirectory.dir("generated/sdds/sandbox").get().asFile,
            task.outputDirectory.get().asFile,
        )
        assertTrue(
            preBuild.get().taskDependencies.getDependencies(preBuild.get())
                .any { it.name == "generateComposeSandbox" },
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
        project.extensions.getByType(DsBuilderExtension::class.java).apply {
            targets { view() }
            sandbox {
                view {
                    generatedPackageName.set("com.example.explicit")
                    themeAlias.set("ExplicitTheme")
                }
            }
        }

        (project as ProjectInternal).evaluate()

        val task = project.tasks.getByName("generateViewSandbox") as GenerateSandboxAdaptersTask
        assertEquals("com.example.explicit", task.packageName.get())
        assertEquals("ExplicitTheme", task.themeAlias.get())
        assertNull(project.tasks.findByName("generateComposeSandbox"))
    }

    @Test
    fun `sandbox output location can override root convention`() {
        val projectDir = temporaryFolder.newFolder("sandbox-src")
        createSandboxMetadata(projectDir, "config-info-compose.json")
        val project = ProjectBuilder.builder().withProjectDir(projectDir).build()
        val preBuild = project.tasks.register("preBuild")
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).apply {
            outputLocation.set(OutputLocation.BUILD)
            targets { compose() }
            sandbox {
                outputLocation.set(OutputLocation.SRC)
                autoGenerate.set(false)
                compose {}
            }
        }

        (project as ProjectInternal).evaluate()

        val task = project.tasks.getByName("generateComposeSandbox") as GenerateSandboxAdaptersTask
        assertEquals(
            projectDir.resolve("src/main/kotlin").canonicalFile,
            task.outputDirectory.get().asFile.canonicalFile,
        )
        assertTrue(
            preBuild.get().taskDependencies.getDependencies(preBuild.get())
                .none { it.name == "generateComposeSandbox" },
        )
    }

    @Test
    fun `components auto generation is attached to preBuild`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.newFolder("components-auto"))
            .build()
        val preBuild = project.tasks.register("preBuild")
        project.configurations.create("compileClasspath")
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).components {
            compose()
            source("https://example.com/components.zip")
        }

        (project as ProjectInternal).evaluate()

        assertTrue(
            preBuild.get().taskDependencies.getDependencies(preBuild.get())
                .any { it.name == "generateComponents" },
        )
    }

    @Test
    fun `root auto generation disables components preBuild dependency`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.newFolder("components-manual"))
            .build()
        val preBuild = project.tasks.register("preBuild")
        project.configurations.create("compileClasspath")
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).apply {
            autoGenerate.set(false)
            components {
                compose()
                source("https://example.com/components.zip")
            }
        }

        (project as ProjectInternal).evaluate()

        assertTrue(
            preBuild.get().taskDependencies.getDependencies(preBuild.get())
                .none { it.name == "generateComponents" },
        )
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
                    outputLocation.set(com.sdds.plugin.themebuilder.OutputLocation.SRC)
                    targets {
                        compose()
                    }
                    sandbox {
                        compose {
                            multiplatform.set(true)
                        }
                    }
                }

                tasks.register("verifySandboxWiring") {
                    dependsOn("generateComposeSandbox")
                    doLast {
                        val expected = layout.projectDirectory.dir("src/commonMain/kotlin").asFile
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

    @Test
    fun `documentation view target использует стандартные view info файлы`() {
        val projectDir = temporaryFolder.newFolder("documentation-view")
        projectDir.resolve(".sdds").mkdir()
        val project = ProjectBuilder.builder().withProjectDir(projectDir).build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).apply {
            targets { view() }
            documentation {}
        }

        (project as ProjectInternal).evaluate()

        val aggregate = project.tasks.getByName("documentationAggregate") as DocumentationAggregateTask
        assertEquals(
            projectDir.resolve(".sdds/config-info-view-system.json").canonicalFile,
            aggregate.componentsInfoFile.get().asFile.canonicalFile,
        )
        assertEquals(
            projectDir.resolve(".sdds/theme-info-view-system.json").canonicalFile,
            aggregate.themeInfoFile.get().asFile.canonicalFile,
        )
    }

    @Test
    fun `documentation без targets не регистрирует aggregate task`() {
        val projectDir = temporaryFolder.newFolder("documentation-without-target")
        projectDir.resolve(".sdds").mkdir()
        val project = ProjectBuilder.builder().withProjectDir(projectDir).build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).documentation {}

        (project as ProjectInternal).evaluate()

        assertNull(project.tasks.findByName("documentationAggregate"))
        assertNull(project.tasks.findByName("documentationExtract"))
    }

    @Test
    fun `documentation compose target использует стандартные compose info файлы`() {
        val projectDir = temporaryFolder.newFolder("documentation-compose")
        projectDir.resolve(".sdds").mkdir()
        val project = ProjectBuilder.builder().withProjectDir(projectDir).build()
        project.plugins.apply(DsBuilderPlugin::class.java)
        project.extensions.getByType(DsBuilderExtension::class.java).apply {
            targets { compose() }
            documentation {}
        }

        (project as ProjectInternal).evaluate()

        val aggregate = project.tasks.getByName("documentationAggregate") as DocumentationAggregateTask
        assertEquals(
            projectDir.resolve(".sdds/config-info-compose.json").canonicalFile,
            aggregate.componentsInfoFile.get().asFile.canonicalFile,
        )
        assertEquals(
            projectDir.resolve(".sdds/theme-info-compose.json").canonicalFile,
            aggregate.themeInfoFile.get().asFile.canonicalFile,
        )
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
