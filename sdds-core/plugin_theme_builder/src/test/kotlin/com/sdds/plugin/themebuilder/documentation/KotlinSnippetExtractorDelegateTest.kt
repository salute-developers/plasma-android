package com.sdds.plugin.themebuilder.documentation

import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment
import org.jetbrains.kotlin.com.intellij.openapi.Disposable
import org.jetbrains.kotlin.com.intellij.openapi.util.Disposer
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.psi.KtPsiFactory
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class KotlinSnippetExtractorDelegateTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    private lateinit var disposable: Disposable
    private lateinit var psiFactory: KtPsiFactory

    @Before
    fun setUp() {
        disposable = Disposer.newDisposable("kotlin-snippet-extractor-test")
        val env = KotlinCoreEnvironment.createForProduction(
            disposable,
            CompilerConfiguration(),
            EnvironmentConfigFiles.JVM_CONFIG_FILES,
        )
        psiFactory = KtPsiFactory(env.project, markGenerated = false)
    }

    @After
    fun tearDown() {
        Disposer.dispose(disposable)
    }

    @Test
    fun `extractFromFile возвращает пустой список если нет DocSample annotation`() {
        val projectDir = temporaryFolder.newFolder("project")
        val snippetsDir = temporaryFolder.newFolder("snippets")
        val source = sourceFile(
            projectDir = projectDir,
            relativePath = "src/main/kotlin/com/test/Samples.kt",
            content = """
                package com.test

                fun SampleWithoutAnnotation() {
                    codeSnippet {
                        println("ignored")
                    }
                }
            """.trimIndent(),
        )

        val result = delegate(projectDir, snippetsDir).extractFromFile(source)

        assertTrue(result.isEmpty())
        assertTrue(snippetsDir.walkTopDown().none { it.isFile })
    }

    @Test
    fun `extractFromFile записывает mixed snippet с placeholder и metadata`() {
        val projectDir = temporaryFolder.newFolder("project")
        val snippetsDir = temporaryFolder.newFolder("snippets")
        val source = sourceFile(
            projectDir = projectDir,
            relativePath = "src/main/kotlin/com/test/docs/Samples.kt",
            content = """
                package com.test.docs

                annotation class DocSample(val id: String = "")

                @DocSample(id = "Button.Mixed Sample")
                fun ButtonSample() {
                    codeSnippet {
                        val text = "Original"
                        placeholder("Original", "ButtonPlaceholder()")
                    }
                    composableCodeSnippet {
                        Button(text = text)
                    }
                }
            """.trimIndent(),
        )

        val result = delegate(projectDir, snippetsDir).extractFromFile(source)

        val meta = result.single()
        assertEquals("Button.Mixed Sample", meta.id)
        assertEquals("mixed", meta.kind)
        assertEquals("com.test.docs.ButtonSample", meta.fqName)
        assertEquals("src/main/kotlin/com/test/docs/Samples.kt", meta.file)
        assertEquals(
            listOf("com", "test", "docs", "Button.Mixed_Sample.kt").joinToString(File.separator),
            meta.snippetPath,
        )
        assertTrue(meta.snippetStartOffset > 0)
        assertTrue(meta.snippetEndOffset > meta.snippetStartOffset)
        assertEquals(
            """
                val text = "Original"
                ButtonPlaceholder()

                Button(text = text)
            """.trimIndent() + "\n",
            snippetsDir.resolve(meta.snippetPath).readText().normalizedLineSeparators(),
        )
    }

    @Test
    fun `extractFromFile использует positional DocSample id для regular snippet без package`() {
        val projectDir = temporaryFolder.newFolder("project")
        val snippetsDir = temporaryFolder.newFolder("snippets")
        val source = sourceFile(
            projectDir = projectDir,
            relativePath = "Samples.kt",
            content = """
                annotation class DocSample(val id: String = "")

                @DocSample("Standalone.Sample")
                fun Standalone() {
                    codeSnippet {
                        println("hello")
                    }
                }
            """.trimIndent(),
        )

        val result = delegate(projectDir, snippetsDir).extractFromFile(source)

        val meta = result.single()
        assertEquals("Standalone.Sample", meta.id)
        assertEquals("regular", meta.kind)
        assertEquals("Standalone", meta.fqName)
        assertEquals("Standalone.Sample.kt", meta.snippetPath)
        assertEquals(
            "println(\"hello\")\n",
            snippetsDir.resolve(meta.snippetPath).readText().normalizedLineSeparators(),
        )
    }

    @Test
    fun `extractFromFile использует имя функции как id если DocSample без аргументов`() {
        val projectDir = temporaryFolder.newFolder("project")
        val snippetsDir = temporaryFolder.newFolder("snippets")
        val source = sourceFile(
            projectDir = projectDir,
            relativePath = "src/main/kotlin/com/test/ComposableSamples.kt",
            content = """
                package com.test

                annotation class DocSample(val id: String = "")

                @DocSample
                fun FunctionNameSample() {
                    composableCodeSnippet {
                        Text("Hello")
                    }
                }
            """.trimIndent(),
        )

        val result = delegate(projectDir, snippetsDir).extractFromFile(source)

        val meta = result.single()
        assertEquals("FunctionNameSample", meta.id)
        assertEquals("composable", meta.kind)
        assertEquals("com.test.FunctionNameSample", meta.fqName)
        assertEquals(
            listOf("com", "test", "FunctionNameSample.kt").joinToString(File.separator),
            meta.snippetPath,
        )
        assertEquals(
            "Text(\"Hello\")\n",
            snippetsDir.resolve(meta.snippetPath).readText().normalizedLineSeparators(),
        )
    }

    @Test
    fun `extractFromFile возвращает пустой список если DocSample без snippet`() {
        val projectDir = temporaryFolder.newFolder("project")
        val snippetsDir = temporaryFolder.newFolder("snippets")
        val source = sourceFile(
            projectDir = projectDir,
            relativePath = "src/main/kotlin/com/test/NoSnippetSamples.kt",
            content = """
                package com.test

                annotation class DocSample(val id: String = "")

                @DocSample("NoSnippet.Sample")
                fun NoSnippetSample() {
                    println("ignored")
                }
            """.trimIndent(),
        )

        val result = delegate(projectDir, snippetsDir).extractFromFile(source)

        assertTrue(result.isEmpty())
        assertTrue(snippetsDir.walkTopDown().none { it.isFile })
    }

    @Test
    fun `extractFromFile игнорирует codeSnippet без lambda`() {
        val projectDir = temporaryFolder.newFolder("project")
        val snippetsDir = temporaryFolder.newFolder("snippets")
        val source = sourceFile(
            projectDir = projectDir,
            relativePath = "src/main/kotlin/com/test/NoLambdaSamples.kt",
            content = """
                package com.test

                annotation class DocSample(val id: String = "")

                @DocSample("NoLambda.Sample")
                fun NoLambdaSample() {
                    codeSnippet()
                }
            """.trimIndent(),
        )

        val result = delegate(projectDir, snippetsDir).extractFromFile(source)

        assertTrue(result.isEmpty())
        assertTrue(snippetsDir.walkTopDown().none { it.isFile })
    }

    @Test
    fun `extractFromFile берет имя функции если DocSample id не строковый`() {
        val projectDir = temporaryFolder.newFolder("project")
        val snippetsDir = temporaryFolder.newFolder("snippets")
        val source = sourceFile(
            projectDir = projectDir,
            relativePath = "src/main/kotlin/com/test/FallbackSamples.kt",
            content = """
                package com.test

                annotation class DocSample(val id: String = "")

                const val SAMPLE_ID = "External.Id"

                @DocSample(SAMPLE_ID)
                fun FallbackNameSample() {
                    codeSnippet {
                        println("fallback")
                    }
                }
            """.trimIndent(),
        )

        val result = delegate(projectDir, snippetsDir).extractFromFile(source)

        val meta = result.single()
        assertEquals("FallbackNameSample", meta.id)
        assertEquals("regular", meta.kind)
        assertEquals("com.test.FallbackNameSample", meta.fqName)
        assertEquals(
            listOf("com", "test", "FallbackNameSample.kt").joinToString(File.separator),
            meta.snippetPath,
        )
        assertEquals(
            "println(\"fallback\")\n",
            snippetsDir.resolve(meta.snippetPath).readText().normalizedLineSeparators(),
        )
    }

    @Test
    fun `extractFromFile находит вложенный codeSnippet`() {
        val projectDir = temporaryFolder.newFolder("project")
        val snippetsDir = temporaryFolder.newFolder("snippets")
        val source = sourceFile(
            projectDir = projectDir,
            relativePath = "src/main/kotlin/com/test/NestedSamples.kt",
            content = """
                package com.test

                annotation class DocSample(val id: String = "")

                @DocSample("Nested.Sample")
                fun NestedSample() {
                    if (true) {
                        run {
                            codeSnippet {
                                val nested = true
                            }
                        }
                    }
                }
            """.trimIndent(),
        )

        val result = delegate(projectDir, snippetsDir).extractFromFile(source)

        val meta = result.single()
        assertEquals("Nested.Sample", meta.id)
        assertEquals("regular", meta.kind)
        assertEquals(
            "val nested = true\n",
            snippetsDir.resolve(meta.snippetPath).readText().normalizedLineSeparators(),
        )
    }

    private fun delegate(
        projectDir: File,
        snippetsDir: File,
    ): KotlinSnippetExtractorDelegate {
        return KotlinSnippetExtractorDelegate(
            psiFactory = psiFactory,
            snippetsDir = snippetsDir,
            projectDir = projectDir,
        )
    }

    private fun sourceFile(
        projectDir: File,
        relativePath: String,
        content: String,
    ): File {
        return projectDir.resolve(relativePath).apply {
            parentFile?.mkdirs()
            writeText(content)
        }
    }

    private fun String.normalizedLineSeparators(): String = replace("\r\n", "\n")
}
