package tasks

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class VerifyRoborazziIosThresholdTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `verification ignores a small pixel difference as noise`() {
        val resultsDirectory = temporaryFolder.newFolder("results")
        val golden = writeImage("testNoise_ios.png", width = 100, height = 100)
        val actual = writeImage("testNoise_actual.png", width = 100, height = 100, changedPixels = 1)
        writeChangedResult(resultsDirectory, "noise.json", golden, actual)

        val summary = verifyRoborazziIosResults(resultsDirectory, IOS_SCREENSHOT_DIFF_THRESHOLD)

        assertEquals(1, summary.checked)
        assertEquals(1, summary.ignoredAsNoise)
        assertEquals(0, summary.failed)
        assertEquals(ScreenshotStatus.NOISE, summary.entries.single().status)
        assertEquals(0.0001, summary.entries.single().diffPercentage!!, DOUBLE_DELTA)
    }

    @Test
    fun `verification fails a large pixel difference`() {
        val resultsDirectory = temporaryFolder.newFolder("results")
        val golden = writeImage("testChanged_ios.png", width = 100, height = 100)
        val actual = writeImage("testChanged_actual.png", width = 100, height = 100, changedPixels = 100)
        writeChangedResult(resultsDirectory, "changed.json", golden, actual)

        val summary = verifyRoborazziIosResults(resultsDirectory, IOS_SCREENSHOT_DIFF_THRESHOLD)

        assertEquals(1, summary.failed)
        assertEquals(ScreenshotStatus.FAILED, summary.entries.single().status)
        assertEquals(0.01, summary.entries.single().diffPercentage!!, DOUBLE_DELTA)
    }

    @Test
    fun `verification fails screenshots with different dimensions`() {
        val resultsDirectory = temporaryFolder.newFolder("results")
        val golden = writeImage("testDimensions_ios.png", width = 10, height = 10)
        val actual = writeImage("testDimensions_actual.png", width = 11, height = 10)
        writeChangedResult(resultsDirectory, "dimensions.json", golden, actual)

        val summary = verifyRoborazziIosResults(resultsDirectory, IOS_SCREENSHOT_DIFF_THRESHOLD)

        assertEquals(1, summary.failed)
        assertEquals(1.0, summary.entries.single().diffPercentage!!, DOUBLE_DELTA)
    }

    @Test
    fun `verification fails changed result without image paths`() {
        val resultsDirectory = temporaryFolder.newFolder("results")
        writeResult(
            resultsDirectory,
            "testMissingPaths_ios.json",
            """
            {
              "type": "changed"
            }
            """.trimIndent(),
        )

        val summary = verifyRoborazziIosResults(resultsDirectory, IOS_SCREENSHOT_DIFF_THRESHOLD)

        assertEquals(1, summary.failed)
        assertEquals("changed result has no golden_file_path", summary.entries.single().reason)
    }

    @Test
    fun `verification fails added screenshot`() {
        val resultsDirectory = temporaryFolder.newFolder("results")
        val actual = writeImage("testAdded_ios.png", width = 10, height = 10)
        writeResult(
            resultsDirectory,
            "added.json",
            """
            {
              "actual_file_path": "${actual.jsonPath()}",
              "type": "added"
            }
            """.trimIndent(),
        )

        val summary = verifyRoborazziIosResults(resultsDirectory, IOS_SCREENSHOT_DIFF_THRESHOLD)

        assertEquals(1, summary.failed)
        assertEquals("golden screenshot is missing (type = added)", summary.entries.single().reason)
    }

    @Test
    fun `verification fails unknown result type`() {
        val resultsDirectory = temporaryFolder.newFolder("results")
        writeResult(
            resultsDirectory,
            "unknown.json",
            """
            {
              "golden_file_path": "/screenshots/testUnknown_ios.png",
              "type": "unknown"
            }
            """.trimIndent(),
        )

        val summary = verifyRoborazziIosResults(resultsDirectory, IOS_SCREENSHOT_DIFF_THRESHOLD)

        assertEquals(1, summary.failed)
        assertEquals("unsupported result type: unknown", summary.entries.single().reason)
    }

    @Test
    fun `verification fails changed result when image file is missing`() {
        val resultsDirectory = temporaryFolder.newFolder("results")
        val golden = writeImage("testMissingFile_ios.png", width = 10, height = 10)
        val missingActual = File(temporaryFolder.root, "missing-actual.png")
        writeChangedResult(resultsDirectory, "missing-file.json", golden, missingActual)

        val summary = verifyRoborazziIosResults(resultsDirectory, IOS_SCREENSHOT_DIFF_THRESHOLD)

        assertEquals(1, summary.failed)
        assertTrue(summary.entries.single().reason.orEmpty().contains("actual image was not found"))
    }

    @Test
    fun `verification treats difference equal to threshold as noise`() {
        val resultsDirectory = temporaryFolder.newFolder("results")
        val golden = writeImage("testThreshold_ios.png", width = 20, height = 10)
        val actual = writeImage("testThreshold_actual.png", width = 20, height = 10, changedPixels = 1)
        writeChangedResult(resultsDirectory, "threshold.json", golden, actual)

        val summary = verifyRoborazziIosResults(resultsDirectory, IOS_SCREENSHOT_DIFF_THRESHOLD)

        assertEquals(1, summary.ignoredAsNoise)
        assertEquals(0, summary.failed)
        assertEquals(IOS_SCREENSHOT_DIFF_THRESHOLD, summary.entries.single().diffPercentage!!, DOUBLE_DELTA)
    }

    @Test
    fun `pixel comparison ignores channel difference equal to tolerance`() {
        val golden = writeImage("golden.png", width = 1, height = 1, color = DEFAULT_COLOR)
        val actual = writeImage("actual.png", width = 1, height = 1, color = TOLERATED_COLOR)

        assertEquals(0.0, calculateDiffPercentage(golden, actual), DOUBLE_DELTA)
    }

    @Test
    fun `verification rejects empty results directory`() {
        val resultsDirectory = temporaryFolder.newFolder("results")

        assertThrows(org.gradle.api.GradleException::class.java) {
            verifyRoborazziIosResults(resultsDirectory, IOS_SCREENSHOT_DIFF_THRESHOLD)
        }
    }

    @Test
    fun `verification rejects summary without ios results`() {
        val resultsDirectory = temporaryFolder.newFolder("results")
        writeResult(
            resultsDirectory,
            "jvm.json",
            """
            {
              "golden_file_path": "/screenshots/testUnchanged_jvm.png",
              "type": "unchanged"
            }
            """.trimIndent(),
        )

        val error = assertThrows(org.gradle.api.GradleException::class.java) {
            verifyRoborazziIosResults(resultsDirectory, IOS_SCREENSHOT_DIFF_THRESHOLD)
        }
        assertTrue(error.message.orEmpty().contains("do not contain iOS screenshots"))
    }

    private fun writeChangedResult(
        directory: File,
        resultName: String,
        golden: File,
        actual: File,
    ) {
        writeResult(
            directory,
            resultName,
            """
            {
              "golden_file_path": "${golden.jsonPath()}",
              "actual_file_path": "${actual.jsonPath()}",
              "type": "changed"
            }
            """.trimIndent(),
        )
    }

    private fun writeImage(
        name: String,
        width: Int,
        height: Int,
        changedPixels: Int = 0,
        color: Int = DEFAULT_COLOR,
    ): File {
        val pixels = IntArray(width * height) { color }
        repeat(changedPixels) { index -> pixels[index] = CHANGED_COLOR }
        val image = BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB).apply {
            setRGB(0, 0, width, height, pixels, 0, width)
        }
        return temporaryFolder.newFile(name).also { file ->
            check(ImageIO.write(image, "png", file))
        }
    }

    private fun writeResult(directory: File, name: String, content: String): File =
        File(directory, name).apply { writeText(content) }

    private fun File.jsonPath(): String = absolutePath.replace('\\', '/')

    private companion object {
        const val DOUBLE_DELTA = 0.000000001
        val DEFAULT_COLOR: Int = 0xFF101010.toInt()
        val TOLERATED_COLOR: Int = 0xFF121212.toInt()
        val CHANGED_COLOR: Int = 0xFFFFFFFF.toInt()
    }
}
