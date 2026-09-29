package tasks

import java.io.File
import java.math.BigDecimal
import javax.imageio.ImageIO
import kotlin.math.abs
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault
import org.jetbrains.kotlin.com.google.gson.JsonElement
import org.jetbrains.kotlin.com.google.gson.JsonObject
import org.jetbrains.kotlin.com.google.gson.JsonParser

/** Verifies iOS Roborazzi results using a temporary pixel-difference threshold. */
@DisableCachingByDefault(because = "The task verifies results produced by the preceding screenshot run")
abstract class VerifyRoborazziIosThresholdTask : DefaultTask() {

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val resultsDirectory: DirectoryProperty

    @get:Input
    abstract val threshold: Property<Double>

    @TaskAction
    fun verify() {
        val resultsDir = resultsDirectory.get().asFile
        if (!resultsDir.isDirectory) {
            throw GradleException(
                "Roborazzi results were not found: ${resultsDir.absolutePath}. " +
                    "Make sure compareRoborazziIosSimulatorArm64 ran and produced results.",
            )
        }

        val configuredThreshold = threshold.get()
        if (!configuredThreshold.isFinite() || configuredThreshold !in 0.0..1.0) {
            throw GradleException("iOS screenshot threshold must be a finite number between 0 and 1")
        }

        val summary = verifyRoborazziIosResults(resultsDir, configuredThreshold)
        summary.entries.forEach { entry ->
            when (entry.status) {
                ScreenshotStatus.UNCHANGED -> Unit
                ScreenshotStatus.NOISE -> logger.lifecycle(
                    "PASS: ${entry.name}\n" +
                        "diff = ${entry.diffPercentage?.toPlainString()}\n" +
                        "threshold = ${configuredThreshold.toPlainString()}",
                )

                ScreenshotStatus.FAILED -> {
                    val diffDetails = entry.diffPercentage?.let {
                        "diff = ${it.toPlainString()}\n" +
                            "threshold = ${configuredThreshold.toPlainString()}"
                    }.orEmpty()
                    val reasonDetails = entry.reason?.let { "\nreason = $it" }.orEmpty()
                    logger.error("FAIL: ${entry.name}\n$diffDetails$reasonDetails")
                }
            }
        }

        logger.lifecycle(
            "Checked: ${summary.checked}\n" +
                "Ignored as noise: ${summary.ignoredAsNoise}\n" +
                "Failed: ${summary.failed}",
        )

        if (summary.failed > 0) {
            throw GradleException(
                "${summary.failed} iOS screenshot result(s) exceeded the threshold or were invalid",
            )
        }
    }
}

internal fun verifyRoborazziIosResults(
    resultsDirectory: File,
    threshold: Double,
): ScreenshotVerificationSummary {
    val resultFiles = resultsDirectory
        .takeIf(File::isDirectory)
        ?.walkTopDown()
        ?.filter { file -> file.isFile && file.extension.equals("json", ignoreCase = true) }
        ?.sortedBy(File::getName)
        ?.toList()
        .orEmpty()
    if (resultFiles.isEmpty()) {
        throw GradleException("Roborazzi result JSON files were not found: ${resultsDirectory.absolutePath}")
    }

    val entries = resultFiles.mapNotNull { resultFile ->
        val result = runCatching { JsonParser.parseString(resultFile.readText()).asJsonObject }
            .getOrElse { cause ->
                return@mapNotNull ScreenshotVerificationEntry(
                    name = resultFile.nameWithoutExtension,
                    status = ScreenshotStatus.FAILED,
                    reason = "failed to parse JSON: ${cause.message}",
                )
            }
        val screenshotName = result.screenshotName(resultFile.nameWithoutExtension)
        if (!screenshotName.endsWith(IOS_SCREENSHOT_SUFFIX)) return@mapNotNull null
        verifyResult(result, screenshotName, threshold)
    }
    if (entries.isEmpty()) {
        throw GradleException("Roborazzi results do not contain iOS screenshots: ${resultsDirectory.absolutePath}")
    }
    return ScreenshotVerificationSummary(entries)
}

private fun verifyResult(
    result: JsonObject,
    name: String,
    threshold: Double,
): ScreenshotVerificationEntry {
    return when (val type = result.stringOrNull("type")?.lowercase()) {
        "unchanged" -> ScreenshotVerificationEntry(name, ScreenshotStatus.UNCHANGED)
        "changed" -> verifyChangedResult(result, name, threshold)

        "added" -> ScreenshotVerificationEntry(
            name = name,
            status = ScreenshotStatus.FAILED,
            reason = "golden screenshot is missing (type = added)",
        )

        else -> ScreenshotVerificationEntry(
            name = name,
            status = ScreenshotStatus.FAILED,
            reason = "unsupported result type: ${type ?: "missing"}",
        )
    }
}

private fun verifyChangedResult(
    result: JsonObject,
    name: String,
    threshold: Double,
): ScreenshotVerificationEntry {
    val goldenPath = result.stringOrNull("golden_file_path")
        ?: return ScreenshotVerificationEntry(
            name = name,
            status = ScreenshotStatus.FAILED,
            reason = "changed result has no golden_file_path",
        )
    val actualPath = result.stringOrNull("actual_file_path")
        ?: return ScreenshotVerificationEntry(
            name = name,
            status = ScreenshotStatus.FAILED,
            reason = "changed result has no actual_file_path",
        )

    return runCatching {
        calculateDiffPercentage(File(goldenPath), File(actualPath))
    }.fold(
        onSuccess = { diffPercentage ->
            ScreenshotVerificationEntry(
                name = name,
                status = if (diffPercentage <= threshold) {
                    ScreenshotStatus.NOISE
                } else {
                    ScreenshotStatus.FAILED
                },
                diffPercentage = diffPercentage,
            )
        },
        onFailure = { cause ->
            ScreenshotVerificationEntry(
                name = name,
                status = ScreenshotStatus.FAILED,
                reason = cause.message ?: "failed to compare images",
            )
        },
    )
}

internal fun calculateDiffPercentage(goldenFile: File, actualFile: File): Double {
    require(goldenFile.isFile) { "golden image was not found: ${goldenFile.absolutePath}" }
    require(actualFile.isFile) { "actual image was not found: ${actualFile.absolutePath}" }

    val goldenImage = ImageIO.read(goldenFile)
        ?: throw IllegalArgumentException("failed to read golden image: ${goldenFile.absolutePath}")
    val actualImage = ImageIO.read(actualFile)
        ?: throw IllegalArgumentException("failed to read actual image: ${actualFile.absolutePath}")

    if (goldenImage.width != actualImage.width || goldenImage.height != actualImage.height) {
        return 1.0
    }

    val totalPixels = goldenImage.width.toLong() * goldenImage.height
    require(totalPixels > 0) { "screenshots must contain at least one pixel" }

    var changedPixels = 0L
    for (y in 0 until goldenImage.height) {
        for (x in 0 until goldenImage.width) {
            if (isPixelDifferent(goldenImage.getRGB(x, y), actualImage.getRGB(x, y))) {
                changedPixels++
            }
        }
    }
    return changedPixels.toDouble() / totalPixels
}

private fun isPixelDifferent(golden: Int, actual: Int): Boolean =
    isChannelDifferent(golden, actual, ALPHA_SHIFT) ||
        isChannelDifferent(golden, actual, RED_SHIFT) ||
        isChannelDifferent(golden, actual, GREEN_SHIFT) ||
        isChannelDifferent(golden, actual, BLUE_SHIFT)

private fun isChannelDifferent(golden: Int, actual: Int, shift: Int): Boolean {
    val goldenChannel = golden ushr shift and CHANNEL_MASK
    val actualChannel = actual ushr shift and CHANNEL_MASK
    return abs(goldenChannel - actualChannel) > CHANNEL_TOLERANCE
}

private fun JsonObject.screenshotName(fallback: String): String =
    (stringOrNull("golden_file_path") ?: stringOrNull("actual_file_path"))
        ?.replace('\\', '/')
        ?.substringAfterLast('/')
        ?.substringBeforeLast('.')
        ?: fallback

private fun JsonObject.stringOrNull(name: String): String? =
    get(name)?.takeUnless(JsonElement::isJsonNull)?.runCatching(JsonElement::getAsString)?.getOrNull()

private fun Double.toPlainString(): String = BigDecimal.valueOf(this).stripTrailingZeros().toPlainString()

internal data class ScreenshotVerificationSummary(
    val entries: List<ScreenshotVerificationEntry>,
) {
    val checked: Int = entries.size
    val ignoredAsNoise: Int = entries.count { it.status == ScreenshotStatus.NOISE }
    val failed: Int = entries.count { it.status == ScreenshotStatus.FAILED }
}

internal data class ScreenshotVerificationEntry(
    val name: String,
    val status: ScreenshotStatus,
    val diffPercentage: Double? = null,
    val reason: String? = null,
)

internal enum class ScreenshotStatus {
    UNCHANGED,
    NOISE,
    FAILED,
}

private const val IOS_SCREENSHOT_SUFFIX = "_ios"
private const val CHANNEL_TOLERANCE = 2
private const val CHANNEL_MASK = 0xFF
private const val ALPHA_SHIFT = 24
private const val RED_SHIFT = 16
private const val GREEN_SHIFT = 8
private const val BLUE_SHIFT = 0

internal const val IOS_SCREENSHOT_DIFF_THRESHOLD = 0.005
