package utils

import org.gradle.api.Project

/**
 * Область автоинкремента версии
 * @author Малышев Александр on 22.03.2024
 */
enum class BumpScope {
    MAJOR, MINOR, PATCH
}

/**
 * Инкрементирует версию в указанном [scope].
 * Если [scope] == [BumpScope.MINOR], то versionMinor инкрементируется,
 * а versionPatch становится равным 0.
 * Если [scope] == [BumpScope.MAJOR], то versionMajor инкрементируется,
 *  * а versionMinor и versionPatch становятся равными 0.
 */
fun Project.bumpVersion(scope: BumpScope = BumpScope.MINOR) {
    val major = properties.getOrDefault("versionMajor", 0).toString().toInt()
    val minor = properties.getOrDefault("versionMinor", 0).toString().toInt()
    val patch = properties.getOrDefault("versionPatch", 0).toString().toInt()
    val updatedProps = file("gradle.properties")
    val content = updatedProps.readText()
    val newContent = when(scope) {
        BumpScope.MAJOR -> {
            content
                .replace("versionMajor=\\d+".toRegex(), "versionMajor=${major + 1}")
                .replace("versionMinor=\\d+".toRegex(), "versionMinor=0")
                .replace("versionPatch=\\d+".toRegex(), "versionPatch=0")
        }
        BumpScope.MINOR -> {
            content
                .replace("versionMinor=\\d+".toRegex(), "versionMinor=${minor + 1}")
                .replace("versionPatch=\\d+".toRegex(), "versionPatch=0")
        }
        BumpScope.PATCH -> content.replace("versionPatch=\\d+".toRegex(), "versionPatch=${patch + 1}")
    }
    updatedProps.writeText(newContent)
}


