package utils

import org.gradle.api.Project
import org.gradle.api.logging.LogLevel
import java.io.ByteArrayOutputStream
import java.nio.charset.Charset

/**
 * Возвращает название текущей ветки
 * @author malilex on 01.03.2024
 */
fun Project.getBranchName(): String = runCatching {
    if (properties.containsKey("branchName")) {
        val bName = properties["branchName"].toString().trim()
        logger.log(LogLevel.INFO, "branch name from props $bName")
        return@runCatching bName
    }
    val output = ByteArrayOutputStream()
    exec {
        commandLine("git rev-parse --abbrev-ref HEAD".split(" "))
        standardOutput = output
    }
    output.toByteArray().toString(Charset.defaultCharset())
        .trim()
        .also { logger.log(LogLevel.INFO, "detected branch name $it") }
        .takeIf { it != "HEAD" }
}.getOrNull().orEmpty()

/**
 * Возвращает true, если текущее название ветки - master или main,
 * иначе - false
 */
fun String.isMainBranch(): Boolean =
    this == "master" || this == "main"

/**
 * Возвращает true, если текущее название ветки - dev или develop,
 * иначе - false
 */
fun String.isDevBranch(): Boolean =
    this == "dev" || this == "develop"

/**
 * Возвращает true, если текущее название ветки начинается с "release/",
 * иначе - false
 */
fun String.isReleaseBranch(): Boolean =
    this.startsWith("release/")

/**
 * Возвращает true, если текущее название ветки содержит "feature/",
 * иначе - false
 */
fun String.isFeatureBranch(): Boolean =
    this.contains("feature/")

/**
 * Возвращает true, если текущее название ветки начинается с "hotfix/",
 * иначе - false
 */
fun String.isHotfixBranch(): Boolean =
    this.contains("hotfix/")

