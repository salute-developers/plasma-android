package com.sdds.plugin.themebuilder.documentation

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class XmlSnippetExtractorDelegateTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `extractFromFile возвращает пустой список если в файле нет sample markers`() {
        val projectDir = temporaryFolder.newFolder("project")
        val snippetsDir = temporaryFolder.newFolder("snippets")
        val source = projectDir.resolve("layout.xml").apply {
            writeText("<LinearLayout />")
        }
        val underTest = XmlSnippetExtractorDelegate(
            snippetsDir = snippetsDir,
            projectDir = projectDir,
            namespace = "com.test.docs",
        )

        val result = underTest.extractFromFile(source)

        assertEquals(emptyList<SampleMeta>(), result)
        assertTrue(snippetsDir.listFiles().orEmpty().isEmpty())
    }

    @Test
    fun `extractFromFile записывает xml snippet и metadata из размеченного блока`() {
        val projectDir = temporaryFolder.newFolder("project")
        val snippetsDir = temporaryFolder.newFolder("snippets")
        val source = projectDir.resolve("res/layout/sample.xml").apply {
            parentFile.mkdirs()
            writeText(
                """
                    <LinearLayout>
                        <!-- sample-start: id=Button.Sample -->
                        <!-- placeholder: app:sd_text="Original" -> app:sd_text="Placeholder" -->
                            <com.test.Button
                                android:layout_width="wrap_content"
                                app:sd_text="Original" />
                        <!-- sample-end: id=Button.Sample -->
                    </LinearLayout>
                """.trimIndent(),
            )
        }
        val underTest = XmlSnippetExtractorDelegate(
            snippetsDir = snippetsDir,
            projectDir = projectDir,
            namespace = "com.test.docs",
        )

        val result = underTest.extractFromFile(source)

        val meta = result.single()
        val snippet = snippetsDir.resolve("com/test/docs/Button.Sample.xml")
        assertEquals("Button.Sample", meta.id)
        assertEquals("xml", meta.kind)
        assertEquals("xml.Button.Sample", meta.fqName)
        assertEquals("res/layout/sample.xml", meta.file)
        assertEquals(
            "com${java.io.File.separator}test${java.io.File.separator}docs${java.io.File.separator}Button.Sample.xml",
            meta.snippetPath,
        )
        assertTrue(meta.snippetStartOffset > 0)
        assertTrue(meta.snippetEndOffset > meta.snippetStartOffset)
        assertEquals(
            """
                <com.test.Button
                    android:layout_width="wrap_content"
                    app:sd_text="Placeholder" />
            """.trimIndent() + "\n",
            snippet.readText(),
        )
    }
}
