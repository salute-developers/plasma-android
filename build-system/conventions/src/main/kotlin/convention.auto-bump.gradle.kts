import utils.AutoBumpTask

description = "Convention-плагин, который добавляет таску для автоинкремента версии"

val bumpFileName = "version-bump.txt"

val clean = tasks.register("cleanVersionBump") {
    doLast {
        project.layout.buildDirectory.file(bumpFileName).get().asFile.delete()
    }
}

/**
 * Gradle-task для синхронизации версий gradle.properties и каталога версий.
 * Запускается автоматически после запуска [AutoBumpTask].
 * Вручную запускать не рекомендуется и не имеет смысла.
 */
val syncCatalog = tasks.register("syncVersionCatalog") {
    finalizedBy(clean)
    doLast {
        val coreVersionFile = project.layout.buildDirectory.file(bumpFileName).get().asFile
        val bumpRequiredException = GradleException("${project.name} project's version must be bumped first")
        if (!coreVersionFile.exists()) {
            throw bumpRequiredException
        }
        val coreVersion = coreVersionFile.readText()
        if (!coreVersion.matches("\\d+\\.\\d+\\.\\d+".toRegex())) {
            throw bumpRequiredException
        }

        val artifactId = project.properties["nexus.artifactId"]?.toString() ?: return@doLast
        val toml = rootProject.file("../gradle/libs.versions.toml")
        toml.writeText(
            toml.readText()
                .replace(
                    "$artifactId = \"\\d+\\.\\d+\\.\\d+\"".toRegex(),
                    "$artifactId = \"$coreVersion\""
                )
        )
    }
}

tasks.register<AutoBumpTask>("bump") {
    scope.set(properties["scope"].toString())
    versionBumpFileName.set(bumpFileName)
    finalizedBy(syncCatalog)
}