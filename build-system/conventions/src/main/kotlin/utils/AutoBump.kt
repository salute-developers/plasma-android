package utils

import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

/**
 * Область автоинкремента версии
 * @author Малышев Александр on 22.03.2024
 */
private enum class BumpScope {
    MAJOR, MINOR, PATCH
}

/**
 * Информация об инкременте версии
 */
private data class VersionBump(
    val major: Int,
    val minor: Int,
    val patch: Int,
) {

    val name: String = "$major.$minor.$patch"
}

/**
 * Инкрементирует версию в указанном [scope].
 * Если [scope] == [BumpScope.MINOR], то versionMinor инкрементируется,
 * а versionPatch становится равным 0.
 * Если [scope] == [BumpScope.MAJOR], то versionMajor инкрементируется,
 *  * а versionMinor и versionPatch становятся равными 0.
 */
abstract class AutoBumpTask : DefaultTask() {

    @get:Input
    abstract val scope: Property<String?>

    @get:Input
    abstract val versionBumpFileName: Property<String>

    @TaskAction
    fun execute() {
        val scope = when (this.scope.get()) {
            "major" -> BumpScope.MAJOR
            "patch" -> BumpScope.PATCH
            else -> BumpScope.MINOR
        }
        val versionBump = project.getVersionBump(scope)
        project.updateVersionProperties(versionBump)
        project.cacheBumpInfo(versionBump)
    }

    private fun Project.getVersionBump(scope: BumpScope = BumpScope.MINOR): VersionBump {
        val major = properties.getOrDefault("versionMajor", 0).toString().toInt()
        val minor = properties.getOrDefault("versionMinor", 0).toString().toInt()
        val patch = properties.getOrDefault("versionPatch", 0).toString().toInt()
        return when (scope) {
            BumpScope.MAJOR -> VersionBump(major + 1, 0, 0)
            BumpScope.MINOR -> VersionBump(major, minor + 1, 0)
            BumpScope.PATCH -> VersionBump(major, minor, patch + 1)
        }
    }

    private fun Project.updateVersionProperties(versionBump: VersionBump) {
        val updatedProps = file("gradle.properties")
        val content = updatedProps.readText()
            .replace("versionMajor=\\d+".toRegex(), "versionMajor=${versionBump.major}")
            .replace("versionMinor=\\d+".toRegex(), "versionMinor=${versionBump.minor}")
            .replace("versionPatch=\\d+".toRegex(), "versionPatch=${versionBump.patch}")
        updatedProps.writeText(content)
    }

    private fun Project.cacheBumpInfo(versionBump: VersionBump) {
        buildDirectory.file(versionBumpFileName.get()).get().asFile.writeText(versionBump.name)
    }

    /**
     * Создаст build директорию, если она не существует
     */
    private val Project.buildDirectory: DirectoryProperty
        get() {
            val buildDir = project.layout.buildDirectory.asFile.get()
            if (!buildDir.exists()) project.mkdir("build")
            return layout.buildDirectory
        }
}

