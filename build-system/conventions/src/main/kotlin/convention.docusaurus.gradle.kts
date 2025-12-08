import org.jetbrains.kotlin.com.google.gson.GsonBuilder
import org.jetbrains.kotlin.com.google.gson.JsonObject
import tasks.BuildTokenChangelogTask
import tasks.s3.S3DownloadTask
import tasks.s3.S3UploadTask
import tasks.s3.getS3AccessKeyId
import tasks.s3.getS3Bucket
import tasks.s3.getS3Endpoint
import tasks.s3.getS3Region
import tasks.s3.getS3SecretAccessKey
import utils.AutoBumpTask
import utils.changelogUrl
import utils.docsBaseProdUrl
import utils.docsBaseUrl
import utils.docsDeployUrl
import utils.docsUrl
import utils.filterComponents
import utils.getDocsDestinationDir
import utils.getDocsTemplateDir
import utils.isComposeLib
import utils.mergePlusPrefixedDocs
import utils.transformTemplate
import utils.versionInfo

val versionInfo = versionInfo()
val overrideDocsDir = File("${project.projectDir}/override-docs")
val docusaurusDestinationDir = getDocsDestinationDir()
val docusaurusBuildDir = docusaurusDestinationDir.resolve("build")
val changelogJsonDir = buildDir
val changelogJsonPath = changelogJsonDir.resolve("changelog.json")

val generateInstanceTask by tasks.register("docusaurusGenerate") {
    group = "documentation"
    description = "Создает экземпляр Docusaurus"

    doLast {
        val templateRootDir = getDocsTemplateDir()
        val destinationDir = docusaurusDestinationDir
        destinationDir.mkdirs()

        copy {
            duplicatesStrategy = DuplicatesStrategy.INCLUDE
            from(File("${templateRootDir.path}/common-template"))
            into(destinationDir)
        }

        copy {
            duplicatesStrategy = DuplicatesStrategy.INCLUDE
            val targetTemplateDir = if (isComposeLib()) {
                File("${templateRootDir.path}/compose-template")
            } else {
                File("${templateRootDir.path}/xml-template")
            }
            from(targetTemplateDir)
            into(destinationDir)
        }

        transformTemplate(destinationDir)

        copy {
            duplicatesStrategy = DuplicatesStrategy.INCLUDE
            from(overrideDocsDir)
            into(destinationDir)
        }

        val docsDir = destinationDir.resolve("docs")
        mergePlusPrefixedDocs(docsDir)
        filterComponents(docsDir)
    }
}

val changelogSync = tasks.register<S3DownloadTask>("changelogSync") {
    group = "documentation"
    description = "Загружает changelog в локальную директорию"

    accessKeyId.set(getS3AccessKeyId())
    secretAccessKey.set(getS3SecretAccessKey())
    endpoint.set(getS3Endpoint())
    region.set(getS3Region())
    bucket.set(getS3Bucket())
    remoteFilePath.set(changelogUrl())
    localDir.set(changelogJsonDir.absolutePath)
}

val generateChangelog by tasks.register<BuildTokenChangelogTask>("generateChangelog") {
    group = "documentation"
    description = "Добавляет changelog в документацию"
    mustRunAfter(generateInstanceTask, changelogSync)
    releaseChangelogPath.set(rootProject.projectDir.resolve("release-changelog.md").absolutePath)
    libraryChangelogJsonPath.set(changelogJsonPath.absolutePath)
    outputChangelogMdFile.set(
        docusaurusDestinationDir
            .resolve("docs")
            .also { it.mkdirs() }
            .resolve("CHANGELOG.md")
    )
}

val docBuildTask by tasks.register("docusaurusBuild") {
    group = "documentation"
    description = "Собирает артефакты Docusaurus для дальнейшей публикации"
    dependsOn(generateInstanceTask, generateChangelog)
    doLast {
        exec {
            workingDir = docusaurusDestinationDir
            commandLine("yarn")
        }

        exec {
            workingDir = docusaurusDestinationDir
            commandLine("yarn", "build")
        }
    }
}

tasks.register("docusaurusRun") {
    group = "documentation"
    description = "Запускает просмотр Docusaurus локально в браузере"
    dependsOn(generateInstanceTask, generateChangelog)
    doLast {
        exec {
            workingDir = docusaurusDestinationDir
            commandLine("yarn")
        }
        exec {
            workingDir = docusaurusDestinationDir
            commandLine("yarn", "start")
        }
    }
}

val updateArchivedVersions by tasks.register("docusaurusBump") {
    group = "documentation"
    description = "Добавляет текущую версию и URL в versionsArchived.json"

    doLast {
        val jsonFile = overrideDocsDir
            .also { it.mkdirs() }
            .resolve("versionsArchived.json")
        val gson = GsonBuilder().setPrettyPrinting().create()
        val currentVersion = versionInfo.name
        val url = "$docsUrl$docsBaseProdUrl"

        val json = if (jsonFile.exists()) {
            gson.fromJson(jsonFile.readText(), JsonObject::class.java)
        } else {
            JsonObject()
        }

        json.addProperty(currentVersion, url)
        jsonFile.writeText(gson.toJson(json))
        println("Версия $currentVersion добавлена в versionsArchived.json")
    }
}

tasks.withType<AutoBumpTask> {
    dependsOn(updateArchivedVersions)
}

tasks.register<S3UploadTask>("changelogDeploy") {
    group = "documentation"
    description = "Загружает changelog на удаленном сервере"
    dependsOn(generateChangelog, changelogSync)

    accessKeyId.set(getS3AccessKeyId())
    secretAccessKey.set(getS3SecretAccessKey())
    endpoint.set(getS3Endpoint())
    region.set(getS3Region())
    bucket.set(getS3Bucket())
    sourceFile.set(changelogJsonPath)
    destinationPath.set(changelogUrl())
}

tasks.register<S3UploadTask>("docusaurusDeploy") {
    group = "documentation"
    description = "Разворачивает документацию Docusaurus на удаленном сервере"
    dependsOn(docBuildTask)

    accessKeyId.set(getS3AccessKeyId())
    secretAccessKey.set(getS3SecretAccessKey())
    endpoint.set(getS3Endpoint())
    region.set(getS3Region())
    bucket.set(getS3Bucket())
    sourceDir.set(docusaurusBuildDir)
    destinationPath.set(docsDeployUrl)

    doLast {
        val jsonFile = docusaurusDestinationDir
            .also { it.mkdirs() }
            .resolve("deploy.json")
        val gson = GsonBuilder().setPrettyPrinting().create()
        val json = JsonObject()
        json.addProperty("deployUrl", "$docsUrl$docsBaseUrl")
        jsonFile.writeText(gson.toJson(json))
    }
}