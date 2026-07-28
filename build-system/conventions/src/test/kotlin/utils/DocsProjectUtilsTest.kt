package utils

import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class DocsProjectUtilsTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `merge plus prefixed docs appends override to core page`() {
        val project = ProjectBuilder.builder().withProjectDir(temporaryFolder.root).build()
        val docs = temporaryFolder.newFolder("docs")
        docs.resolve("components").mkdirs()
        val core = docs.resolve("components/Page.md").apply { writeText("core") }
        val append = docs.resolve("components/+Page.md").apply { writeText("user") }

        project.mergePlusPrefixedDocs(docs)

        assertEquals(
            "core\n\n<!-- merged from +Page.md -->\n\nuser",
            core.readText(),
        )
        assertFalse(append.exists())
    }
}
