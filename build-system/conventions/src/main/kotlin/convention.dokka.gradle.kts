import org.jetbrains.dokka.DokkaConfiguration
import org.jetbrains.dokka.base.DokkaBase
import org.jetbrains.dokka.base.DokkaBaseConfiguration
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.com.google.gson.GsonBuilder
import org.jetbrains.kotlin.com.google.gson.JsonObject
import tasks.s3.S3UploadTask
import tasks.s3.getS3AccessKeyId
import tasks.s3.getS3Bucket
import tasks.s3.getS3Endpoint
import tasks.s3.getS3Region
import tasks.s3.getS3SecretAccessKey
import utils.docsBaseProdUrl
import utils.docsDeployUrl
import utils.docsUrl
import utils.withVersionCatalogs

withVersionCatalogs {
    apply(plugin = plugins.dokka.get().pluginId)
}

val outputDokkaDir = buildDir.resolve("dokka")

tasks.withType<DokkaTask>().configureEach {
    pluginConfiguration<DokkaBase, DokkaBaseConfiguration> {
        val images =
            file("$projectDir/docs_assets/")
                .takeIf { it.exists() && it.isDirectory }
                ?.walk()
                ?.filter { it.isFile }
                ?.toList()
        if (images != null) {
            customAssets = images
        }
    }
    dokkaSourceSets {
        configureEach {
            documentedVisibilities.set(setOf(DokkaConfiguration.Visibility.PUBLIC))
            suppressInheritedMembers.set(true)
        }
    }
    outputDirectory.set(outputDokkaDir)
}

tasks.register<S3UploadTask>("dokkaDeploy") {
    group = "documentation"
    description = "Разворачивает документацию dokka на удаленном сервере"
    dependsOn(tasks.named("dokkaHtml"))

    accessKeyId.set(getS3AccessKeyId())
    secretAccessKey.set(getS3SecretAccessKey())
    endpoint.set(getS3Endpoint())
    region.set(getS3Region())
    bucket.set(getS3Bucket())
    sourceFiles.set(outputDokkaDir)
    destinationPath.set(docsDeployUrl)

    doLast {
        val jsonFile = buildDir
            .resolve("dokkaInfo")
            .also { it.mkdirs() }
            .resolve("deploy.json")
        val gson = GsonBuilder().setPrettyPrinting().create()
        val json = JsonObject()
        json.addProperty("deployUrl", "$docsUrl$docsBaseProdUrl")
        jsonFile.writeText(gson.toJson(json))
    }
}
