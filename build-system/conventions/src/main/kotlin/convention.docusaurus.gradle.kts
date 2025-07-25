import org.jetbrains.kotlin.com.google.gson.GsonBuilder
import org.jetbrains.kotlin.com.google.gson.JsonObject
import tasks.s3.S3UploadTask
import tasks.s3.getS3AccessKeyId
import tasks.s3.getS3Bucket
import tasks.s3.getS3Endpoint
import tasks.s3.getS3Region
import tasks.s3.getS3SecretAccessKey
import utils.AutoBumpTask
import utils.docsBaseUrl
import utils.docsUrl
import utils.getDocsDestinationDir
import utils.getDocsTemplateDir
import utils.isComposeLib
import utils.transformTemplate
import utils.versionInfo

val versionInfo = versionInfo()
val overrideDocsDir = File("${project.projectDir}/override-docs")
val docusaurusDestinationDir = getDocsDestinationDir()
val docusaurusBuildDir = docusaurusDestinationDir.resolve("build")

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
    }
}

val docBuildTask by tasks.register("docusaurusBuild") {
    group = "documentation"
    description = "Собирает артефакты Docusaurus для дальнейшей публикации"
    dependsOn(generateInstanceTask)
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
    dependsOn(generateInstanceTask)
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
        val url = "$docsUrl$docsBaseUrl"

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

tasks.register<S3UploadTask>("docusaurusDeploy") {
    group = "documentation"
    description = "Разворачивает документацию Docusaurus на удаленном сервере"
    dependsOn(docBuildTask)

    accessKeyId.set(getS3AccessKeyId())
    secretAccessKey.set(getS3SecretAccessKey())
    endpoint.set(getS3Endpoint())
    region.set(getS3Region())
    bucket.set(getS3Bucket())
    sourceFiles.set(docusaurusBuildDir)
    destinationPath.set(docsBaseUrl)

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
