package com.sdds.plugin.themebuilder

import org.gradle.api.GradleException
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class SddsDirectoryResolverTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `current project wins over parent project`() {
        val parent = temporaryFolder.newFolder("parent")
        val child = parent.resolve("child").apply { mkdir() }
        val parentSdds = parent.resolve(".sdds").apply { mkdir() }
        val childSdds = child.resolve(".sdds").apply { mkdir() }

        val resolved = SddsDirectoryResolver(child, parent).resolve()

        assertEquals(childSdds.canonicalFile, resolved.canonicalFile)
        assertTrue(resolved.canonicalFile != parentSdds.canonicalFile)
    }

    @Test
    fun `parent project is used when current project has no sdds`() {
        val parent = temporaryFolder.newFolder("parent")
        val child = parent.resolve("child").apply { mkdir() }
        val parentSdds = parent.resolve(".sdds").apply { mkdir() }

        val resolved = SddsDirectoryResolver(child, parent).resolve()

        assertEquals(parentSdds.canonicalFile, resolved.canonicalFile)
    }

    @Test
    fun `platform paths follow standard conventions`() {
        val project = temporaryFolder.newFolder("project")
        val sdds = project.resolve(".sdds").apply { mkdir() }
        val components = sdds.resolve("config-info-compose.json").apply { writeText("{}") }
        val theme = sdds.resolve("theme-info-compose.json").apply { writeText("{}") }
        val resolver = SddsDirectoryResolver(project)

        assertEquals(components, resolver.componentsInfoFile(DsBuilderPlatform.COMPOSE))
        assertEquals(theme, resolver.themeInfoFile(DsBuilderPlatform.COMPOSE))
    }

    @Test
    fun `missing directory error lists checked paths`() {
        val parent = temporaryFolder.newFolder("parent")
        val child = parent.resolve("child").apply { mkdir() }

        val error = runCatching {
            SddsDirectoryResolver(child, parent).resolve()
        }.exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains(child.resolve(".sdds").absolutePath))
        assertTrue(error?.message.orEmpty().contains(parent.resolve(".sdds").absolutePath))
    }
}
