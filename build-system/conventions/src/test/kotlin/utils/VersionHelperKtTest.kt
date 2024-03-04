package utils

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkConstructor
import io.mockk.mockkStatic
import io.mockk.unmockkConstructor
import io.mockk.unmockkStatic
import org.gradle.api.Project
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals
import java.text.SimpleDateFormat

/**
 * Unit тесты VersionHelper.kt
 * @author Малышев Александр on 01.03.2024
 */
class VersionHelperKtTest {

    @Before
    fun setUp() {
        mockkStatic("utils.GitUtilsKt")
        mockkStatic("utils.BuildUtilsKt")
        mockkConstructor(SimpleDateFormat::class)
    }

    @After
    fun tearDown() {
        clearAllMocks()
        unmockkStatic("utils.GitUtilsKt")
        unmockkStatic("utils.BuildUtilsKt")
        unmockkConstructor(SimpleDateFormat::class)
    }

    @Test
    fun `versionInfo для библиотеки на ветке main`() {
        val datetime = "22022024_0000"
        val project = createProject(
            branchName = "main",
            datetime = datetime,
            isAndroidLib = true
        )

        val expected = VersionInfo(
            code = 1000,
            name = "0.1.0",
            nameSuffix = "",
            idSuffix = "",
            artifactSuffix = ""
        )

        assertEquals(expected, project.versionInfo())
    }

    @Test
    fun `versionInfo для библиотеки на ветке dev`() {
        val datetime = "22022024_0000"
        val project = createProject(
            branchName = "dev",
            datetime = datetime,
            isAndroidLib = true
        )

        val expected = VersionInfo(
            code = 1000,
            name = "0.1.0",
            nameSuffix = "-SNAPSHOT",
            idSuffix = "",
            artifactSuffix = "-SNAPSHOT_DEV_$datetime"
        )

        assertEquals(expected, project.versionInfo())
    }

    @Test
    fun `versionInfo для библиотеки на ветке release`() {
        val datetime = "22022024_0000"
        val project = createProject(
            branchName = "release/0.1.1",
            datetime = datetime,
            isAndroidLib = true,
            patch = 1
        )

        val expected = VersionInfo(
            code = 1100,
            name = "0.1.1",
            nameSuffix = "-SNAPSHOT",
            idSuffix = "",
            artifactSuffix = "-SNAPSHOT_RC_$datetime"
        )
        assertEquals(expected, project.versionInfo())
    }

    @Test
    fun `versionInfo для библиотеки на ветке feature`() {
        val datetime = "22022024_0000"
        val project = createProject(
            branchName = "feature/myfeature",
            datetime = datetime,
            isAndroidLib = true,
            patch = 1
        )

        val expected = VersionInfo(
            code = 1100,
            name = "0.1.1",
            nameSuffix = "-SNAPSHOT",
            idSuffix = "",
            artifactSuffix = "-SNAPSHOT_(feature_myfeature)_$datetime"
        )
        assertEquals(expected, project.versionInfo())
    }

    @Test
    fun `versionInfo для библиотеки на ветке hotfix`() {
        val datetime = "22022024_0000"
        val project = createProject(
            branchName = "hotfix/0.1.2",
            datetime = datetime,
            isAndroidLib = true,
            patch = 2
        )

        val expected = VersionInfo(
            code = 1200,
            name = "0.1.2",
            nameSuffix = "-SNAPSHOT",
            idSuffix = "",
            artifactSuffix = "-SNAPSHOT_HF_$datetime"
        )
        assertEquals(expected, project.versionInfo())
    }

    @Test
    fun `versionInfo для приложения на ветке main`() {
        val datetime = "22022024_0000"
        val project = createProject(
            branchName = "main",
            datetime = datetime,
            isAndroidApp = true
        )

        val expected = VersionInfo(
            code = 1000,
            name = "0.1.0",
            nameSuffix = "",
            idSuffix = "",
            artifactSuffix = ""
        )
        assertEquals(expected, project.versionInfo())
    }

    @Test
    fun `versionInfo для приложения на ветке dev`() {
        val datetime = "22022024_0000"
        val project = createProject(
            branchName = "dev",
            datetime = datetime,
            isAndroidApp = true
        )

        val expected = VersionInfo(
            code = 1000,
            name = "0.1.0",
            nameSuffix = "-DEV_$datetime",
            idSuffix = "DEV",
            artifactSuffix = "-DEV_$datetime"
        )
        assertEquals(expected, project.versionInfo())
    }

    @Test
    fun `versionInfo для приложения на ветке release`() {
        val datetime = "22022024_0000"
        val project = createProject(
            branchName = "release/0.1.0",
            datetime = datetime,
            isAndroidApp = true
        )

        val expected = VersionInfo(
            code = 1000,
            name = "0.1.0",
            nameSuffix = "-RC_$datetime",
            idSuffix = "RC",
            artifactSuffix = "-RC_$datetime"
        )
        assertEquals(expected, project.versionInfo())
    }

    @Test
    fun `versionInfo для приложения на ветке feature`() {
        val datetime = "22022024_0000"
        val project = createProject(
            branchName = "feature/myfeature",
            datetime = datetime,
            isAndroidApp = true
        )

        val expected = VersionInfo(
            code = 1000,
            name = "0.1.0",
            nameSuffix = "-(feature_myfeature)_$datetime",
            idSuffix = "feature",
            artifactSuffix = "-(feature_myfeature)_$datetime"
        )
        assertEquals(expected, project.versionInfo())
    }

    @Test
    fun `versionInfo для приложения на ветке hotfix`() {
        val datetime = "22022024_0000"
        val project = createProject(
            branchName = "hotfix/0.1.1",
            datetime = datetime,
            patch = 1,
            isAndroidApp = true
        )

        val expected = VersionInfo(
            code = 1100,
            name = "0.1.1",
            nameSuffix = "-HF_$datetime",
            idSuffix = "HF",
            artifactSuffix = "-HF_$datetime"
        )
        assertEquals(expected, project.versionInfo())
    }

    private fun createProject(
        branchName: String,
        datetime: String,
        major: Int = 0,
        minor: Int = 1,
        patch: Int = 0,
        isAndroidApp: Boolean = false,
        isAndroidLib: Boolean = false
    ): Project {
        val project = mockk<Project>(relaxed = true) {
            every { properties } returns mapOf(
                "versionMajor" to major,
                "versionMinor" to minor,
                "versionPatch" to patch,
            )
        }
        every { project.getBranchName() } returns branchName
        every { project.isAndroidLib() } returns isAndroidLib
        every { project.isAndroidApp() } returns isAndroidApp
        every { anyConstructed<SimpleDateFormat>().format(any()) } returns datetime
        return project
    }
}
