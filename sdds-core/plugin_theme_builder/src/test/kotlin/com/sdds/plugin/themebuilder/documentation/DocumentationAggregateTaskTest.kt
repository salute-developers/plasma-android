package com.sdds.plugin.themebuilder.documentation

import org.gradle.api.GradleException
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

class DocumentationAggregateTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `aggregation follows ADR layout and local snippets override core artifacts`() {
        val project = ProjectBuilder.builder().withProjectDir(temporaryFolder.root).build()
        val task = project.tasks.create("aggregate", DocumentationAggregateTask::class.java)
        val first = createJar("a.jar", "META-INF/sdds-docs/assets/examples/kotlin/sample.kt", "first")
        val second = createJar("b.jar", "META-INF/sdds-docs/assets/examples/kotlin/sample.kt", "second")
        val kotlin = temporaryFolder.newFolder("kotlin").apply {
            resolve("sample.kt").writeText("local")
        }
        val xml = temporaryFolder.newFolder("xml").apply {
            resolve("sample.xml").writeText("<local/>")
        }
        val samples = temporaryFolder.newFile("samples.json").apply { writeText("[]") }
        val components = temporaryFolder.newFile("components.json").apply { writeText("{}") }
        val theme = temporaryFolder.newFile("theme.json").apply { writeText("{}") }
        val output = temporaryFolder.root.resolve("output")
        task.coreArtifacts.from(second, first)
        task.kotlinSnippets.set(kotlin)
        task.xmlSnippets.set(xml)
        task.samplesMetadata.set(samples)
        task.componentsInfoFile.set(components)
        task.themeInfoFile.set(theme)
        task.outputDirectory.set(output)

        task.aggregate()

        assertEquals("local", output.resolve("assets/examples/kotlin/sample.kt").readText())
        assertEquals("<local/>", output.resolve("assets/examples/xml/sample.xml").readText())
        assertEquals("[]", output.resolve("meta/samples.json").readText())
        assertEquals("{}", output.resolve("meta/components-info.json").readText())
        assertEquals("{}", output.resolve("meta/theme-info.json").readText())
    }

    @Test
    fun `aggregation accepts empty core artifacts`() {
        val task = configuredTask()

        task.aggregate()

        assertTrue(task.outputDirectory.get().asFile.resolve("assets/examples/kotlin").isDirectory)
        assertTrue(task.outputDirectory.get().asFile.resolve("assets/examples/xml").isDirectory)
        assertTrue(task.outputDirectory.get().asFile.resolve("meta/components-info.json").isFile)
    }

    @Test
    fun `legacy core artifact entries are normalized to ADR kotlin examples directory`() {
        val task = configuredTask()
        task.coreArtifacts.from(
            createJar(
                "legacy.jar",
                "META-INF/sdds-docs/com/sdds/Sample.kt",
                "legacy",
            ),
        )

        task.aggregate()

        assertEquals(
            "legacy",
            task.outputDirectory.get().asFile
                .resolve("assets/examples/kotlin/com/sdds/Sample.kt")
                .readText(),
        )
    }

    @Test
    fun `legacy core meta is merged into samples metadata and not copied as a snippet`() {
        val task = configuredTask()
        task.coreArtifacts.from(
            createJar(
                "core-meta.jar",
                "META-INF/sdds-docs/meta.json",
                """[{"id":"CoreSample","kind":"composable","snippetPath":"com/sdds/CoreSample.kt"}]""",
            ),
        )

        task.aggregate()

        val output = task.outputDirectory.get().asFile
        val metadata = output.resolve("meta/samples.json").readText()
        assertTrue(metadata.contains("\"id\": \"CoreSample\""))
        assertTrue(metadata.contains("\"snippetPath\": \"assets/examples/kotlin/com/sdds/CoreSample.kt\""))
        assertTrue(!output.resolve("assets/examples/kotlin/meta.json").exists())
    }

    @Test
    fun `xml snippet path is relative to documentation root`() {
        val task = configuredTask()
        task.samplesMetadata.set(
            temporaryFolder.newFile("xml-meta.json").apply {
                writeText("""[{"id":"XmlSample","kind":"xml","snippetPath":"XmlSample.xml"}]""")
            },
        )

        task.aggregate()

        val metadata = task.outputDirectory.get().asFile.resolve("meta/samples.json").readText()
        assertTrue(metadata.contains("\"snippetPath\": \"assets/examples/xml/XmlSample.xml\""))
    }

    @Test
    fun `local sample metadata overrides core sample with the same id`() {
        val task = configuredTask()
        task.coreArtifacts.from(
            createJar(
                "core-meta.jar",
                "META-INF/sdds-docs/meta.json",
                """[{"id":"Sample","kind":"core"}]""",
            ),
        )
        task.samplesMetadata.set(
            temporaryFolder.newFile("local-meta.json").apply {
                writeText("""[{"id":"Sample","kind":"local"}]""")
            },
        )

        task.aggregate()

        val metadata = task.outputDirectory.get().asFile.resolve("meta/samples.json").readText()
        assertTrue(metadata.contains("\"kind\": \"local\""))
        assertTrue(!metadata.contains("\"kind\": \"core\""))
    }

    @Test
    fun `core structure enriches only public markdown with local samples`() {
        val task = configuredTask()
        val structure = """
            {
              "schemaVersion": "1.0",
              "navigation": [
                {
                  "title": "Components",
                  "items": [{"title": "Button", "path": "components/Button.md"}]
                }
              ]
            }
        """.trimIndent()
        val markdown = """
            ```kotlin
            // @sample: sample.kt
            ```
            ```xml
            <!-- @sample: sample.xml -->
            ```
        """.trimIndent()
        task.coreArtifacts.from(
            createJar(
                "templates.jar",
                "META-INF/sdds-docs/structure.json" to structure,
                "META-INF/sdds-docs/docs/components/Button.md" to markdown,
                "META-INF/sdds-docs/docs/components/Draft.md" to "draft",
                "META-INF/sdds-docs/assets/examples/kotlin/sample.kt" to "core",
            ),
        )
        task.kotlinSnippets.get().asFile.resolve("sample.kt").writeText("local")
        task.xmlSnippets.get().asFile.resolve("sample.xml").writeText("<local/>")

        task.aggregate()

        val output = task.outputDirectory.get().asFile
        val content = output.resolve("content/components/Button.md").readText()
        assertTrue(content.contains("local"))
        assertTrue(content.contains("<local/>"))
        assertTrue(!content.contains("@sample"))
        assertTrue(!output.resolve("content/components/Draft.md").exists())
        assertTrue(output.resolve("structure-core.json").isFile)
    }

    @Test
    fun `core markdown includes style api and preserves screenshot directive`() {
        val task = configuredTask()
        task.screenshotsDirectory.set(
            temporaryFolder.newFolder("screenshots").apply {
                resolve("sample.Button.Simple.png").writeBytes(byteArrayOf(1, 2, 3))
            },
        )
        task.coreArtifacts.from(
            createJar(
                "rich-template.jar",
                "META-INF/sdds-docs/structure.json" to
                    """{"navigation":[{"title":"Button","path":"components/ButtonUsage.md"}]}""",
                "META-INF/sdds-docs/docs/components/ButtonUsage.md" to
                    """
                        <!-- @screenshot: sample.Button.Simple -->
                        <!-- @style-api -->
                    """.trimIndent(),
            ),
        )
        task.componentsInfoFile.set(
            temporaryFolder.newFile("style-components.json").apply {
                writeText(
                    """
                        {
                          "components": [{
                            "coreName": "Button",
                            "styleName": "Button",
                            "styleApi": {
                              "receiverClassName": "ButtonStyles.Companion",
                              "params": []
                            },
                            "variations": []
                          }]
                        }
                    """.trimIndent(),
                )
            },
        )
        task.aggregate()

        val output = task.outputDirectory.get().asFile
        val content = output.resolve("content/components/ButtonUsage.md").readText()
        assertTrue(content.contains("<!-- @screenshot: sample.Button.Simple -->"))
        assertTrue(output.resolve("assets/screenshots/sample.Button.Simple.png").isFile)
        assertTrue(content.contains("Пример выбора готового стиля"))
        assertTrue(!content.contains("@style-api"))
    }

    @Test
    fun `missing public markdown reports its path`() {
        val task = configuredTask()
        task.coreArtifacts.from(
            createJar(
                "missing-template.jar",
                "META-INF/sdds-docs/structure.json" to
                    """{"navigation":[{"title":"Missing","path":"missing.md"}]}""",
            ),
        )

        val error = runCatching(task::aggregate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains("missing.md"))
    }

    @Test
    fun `missing sample reports template and reference`() {
        val task = configuredTask()
        task.coreArtifacts.from(
            createJar(
                "missing-sample.jar",
                "META-INF/sdds-docs/structure.json" to
                    """{"navigation":[{"title":"Page","path":"page.md"}]}""",
                "META-INF/sdds-docs/docs/page.md" to "// @sample: Missing.kt",
            ),
        )

        val error = runCatching(task::aggregate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains("docs/page.md"))
        assertTrue(error?.message.orEmpty().contains("Missing.kt"))
    }

    @Test
    fun `conflicting core templates fail aggregation`() {
        val task = configuredTask()
        task.coreArtifacts.from(
            createJar("first-template.jar", "META-INF/sdds-docs/docs/page.md", "first"),
            createJar("second-template.jar", "META-INF/sdds-docs/docs/page.md", "second"),
        )

        val error = runCatching(task::aggregate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains("Conflicting Core documentation template"))
    }

    @Test
    fun `unsafe core entry fails aggregation`() {
        val task = configuredTask()
        task.coreArtifacts.from(
            createJar("unsafe.jar", "META-INF/sdds-docs/../../outside.md", "unsafe"),
        )

        val error = runCatching(task::aggregate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains("invalid relative path"))
    }

    @Test
    fun `missing info error contains exact resolved path`() {
        val missing = temporaryFolder.root.resolve("missing-components.json")
        val task = configuredTask().apply {
            componentsInfoFile.set(missing)
        }

        val error = runCatching(task::aggregate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains(missing.absolutePath))
    }

    private fun configuredTask(): DocumentationAggregateTask {
        val project = ProjectBuilder.builder().withProjectDir(temporaryFolder.newFolder()).build()
        return project.tasks.create("aggregate", DocumentationAggregateTask::class.java).apply {
            kotlinSnippets.set(temporaryFolder.newFolder())
            xmlSnippets.set(temporaryFolder.newFolder())
            samplesMetadata.set(temporaryFolder.newFile().apply { writeText("[]") })
            componentsInfoFile.set(temporaryFolder.newFile().apply { writeText("{}") })
            themeInfoFile.set(temporaryFolder.newFile().apply { writeText("{}") })
            outputDirectory.set(temporaryFolder.newFolder())
        }
    }

    private fun createJar(name: String, path: String, content: String): File =
        createJar(name, path to content)

    private fun createJar(name: String, vararg entries: Pair<String, String>): File =
        temporaryFolder.newFile(name).also { file ->
            ZipOutputStream(file.outputStream()).use { output ->
                entries.forEach { (path, content) ->
                    output.putNextEntry(ZipEntry(path))
                    output.write(content.toByteArray())
                    output.closeEntry()
                }
            }
        }
}
