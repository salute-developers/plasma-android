package utils

import org.gradle.api.Project
import java.text.SimpleDateFormat
import java.util.Date

/**
 * Информация о версии артефакта
 * @property code код версии
 * @property name название версии
 * @property nameSuffix суффикс названия версии
 * @property idSuffix суффикс идентификатора артефакта
 * @property artifactSuffix суффикс названия артефакта
 * @author Малышев Александр on 28.02.2024
 */
data class VersionInfo(
    val code: Int,
    val name: String,
    val nameSuffix: String,
    val idSuffix: String,
    val artifactSuffix: String
) {

    /**
     * Полное название версии
     */
    val fullName: String get() = "$name$nameSuffix"

    /**
     * Полное название артефакта
     */
    val fullArtifactName: String get() = "$name$artifactSuffix"
}

/**
 * Возвращает информацию о версии
 * @return [VersionInfo]
 */
fun Project.versionInfo(): VersionInfo {
    val major = properties.getOrDefault("versionMajor", 0).toString().toInt()
    val minor = properties.getOrDefault("versionMinor", 0).toString().toInt()
    val patch = properties.getOrDefault("versionPatch", 0).toString().toInt()
    val isSnapshot = properties.getOrDefault("nexus.snapshot", false).toString().toBoolean()
    val versionCode = major * 10_000 + minor * 1_000 + patch * 100
    val versionBaseName = "$major.$minor.$patch"

    val branchName = getBranchName()
    return VersionInfo(
        code = versionCode,
        name = versionBaseName,
        nameSuffix = versionNameSuffix(branchName, isSnapshot),
        idSuffix = appIdSuffix(branchName),
        artifactSuffix = artifactSuffix(branchName, isSnapshot)
    )
}

private fun Project.versionNameSuffix(branchName: String, isSnapshot: Boolean): String {
    if (branchName.isMainBranch()) return ""
    return when {
        isAndroidLib() -> "-SNAPSHOT".takeIf { isSnapshot }.orEmpty()
        else -> "-${getBranchSuffix(branchName)}_${getDatetimeSuffix()}"
    }
}

private fun Project.artifactSuffix(branchName: String, isSnapshot: Boolean): String {
    if (branchName.isMainBranch()) return ""
    val snapshotSuffix = "SNAPSHOT_".takeIf { isSnapshot }.orEmpty()
    return when {
        isAndroidLib() -> "-$snapshotSuffix${getBranchSuffix(branchName)}_${getDatetimeSuffix()}"
        else -> "-${getBranchSuffix(branchName)}_${getDatetimeSuffix()}"
    }
}

private fun getDatetimeSuffix(): String =
    SimpleDateFormat("ddMMyyyy_HHmm")
        .format(Date())

private fun getBranchSuffix(branchName: String): String {
    return when {
        branchName.isReleaseBranch() -> "RC"
        branchName.isFeatureBranch() -> "(${branchName.replace("/", "_")})"
        branchName.isHotfixBranch() -> "HF"
        branchName.isMainBranch() -> ""
        else -> "DEV"
    }
}

private fun Project.appIdSuffix(branchName: String): String {
    if (isAndroidLib()) return ""
    return getBranchSuffix(branchName).let {
        if (it.contains("feature")) {
            "feature"
        } else it
    }
}
