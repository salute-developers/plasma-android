package tasks.docs

import org.gradle.api.GradleException
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class ValidateCoreDocumentationTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `structure lists every markdown template`() {
        val task = configuredTask(
            """{"navigation":[{"title":"Page","path":"components/Page.md"}]}""",
        )
        task.docsDirectory.get().asFile.resolve("components/Page.md").apply {
            parentFile.mkdirs()
            writeText("# Page")
        }

        task.validate()
    }

    @Test
    fun `unlisted markdown fails validation`() {
        val task = configuredTask("""{"navigation":[]}""")
        task.docsDirectory.get().asFile.resolve("Draft.md").writeText("# Draft")

        val error = runCatching(task::validate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains("Draft.md"))
    }

    private fun configuredTask(structure: String): ValidateCoreDocumentationTask {
        val project = ProjectBuilder.builder().withProjectDir(temporaryFolder.newFolder()).build()
        return project.tasks.create("validateDocs", ValidateCoreDocumentationTask::class.java).apply {
            structureFile.set(temporaryFolder.newFile().apply { writeText(structure) })
            docsDirectory.set(temporaryFolder.newFolder())
        }
    }
}
