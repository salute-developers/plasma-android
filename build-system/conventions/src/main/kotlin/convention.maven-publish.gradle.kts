import com.vanniktech.maven.publish.SonatypeHost
import gradle.kotlin.dsl.accessors._8edd1b0c1852f0ac869e9c414c462ba9.mavenPublishing
import gradle.kotlin.dsl.accessors._8edd1b0c1852f0ac869e9c414c462ba9.publishing
import utils.findPropertyOrDefault
import utils.versionInfo
import org.gradle.api.publish.maven.tasks.PublishToMavenRepository
import tasks.MavenPublishTask

plugins {
    id("com.vanniktech.maven.publish")
}

val nexusArtifactId = findPropertyOrDefault("nexus.artifactId", "").toString()
val versionInfo = versionInfo()

val mavenCentralUsername = envOrProp("mavenCentralUsername")
    .orElse(envOrProp("OSS_USERNAME"))
val mavenCentralPassword = envOrProp("mavenCentralPassword")
    .orElse(envOrProp("PP_AUTH_TOKEN"))

val signingKeyId = envOrProp("signingInMemoryKeyId")
    .orElse(envOrProp("OSS_SIGNING_KEY_ID"))
val signingKey = envOrProp("signingInMemoryKey")
    .orElse(envOrProp("OSS_SIGNING_KEY"))
val signingPassword = envOrProp("signingInMemoryKeyPassword")
    .orElse(envOrProp("OSS_SIGNING_PASSWORD"))

mavenCentralUsername.orNull?.let {
    project.extensions.extraProperties["mavenCentralUsername"] = it
}
mavenCentralPassword.orNull?.let {
    project.extensions.extraProperties["mavenCentralPassword"] = it
}
signingKeyId.orNull?.let {
    project.extensions.extraProperties["signingInMemoryKeyId"] = it
}
signingKey.orNull?.let {
    project.extensions.extraProperties["signingInMemoryKey"] = it
}
signingPassword.orNull?.let {
    project.extensions.extraProperties["signingInMemoryKeyPassword"] = it
}


mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()

    coordinates(
        groupId = "io.github.salute-developers",
        artifactId = nexusArtifactId,
        version = versionInfo.fullName
    )
    pom {
        val siteUrl = findPropertyOrDefault("nexus.websiteUrl", "").toString()
        val gitUrl = findPropertyOrDefault("nexus.gitUrl", "").toString()
        val licenseUrl = findPropertyOrDefault(
            "nexus.licenseUrl",
            "https://opensource.org/licenses/mit-license.php",
        ).toString()
        val licenseName = findPropertyOrDefault("nexus.licenseName", "MIT License").toString()
        name.set(nexusArtifactId)
        description.set(findPropertyOrDefault("nexus.description", "").toString())
        url.set(siteUrl)
        scm {
            connection.set(gitUrl)
            developerConnection.set(gitUrl)
            url.set(siteUrl)
        }
        licenses {
            license {
                name.set(licenseName)
                url.set(licenseUrl)
            }
        }

        developers {
            developer {
                id.set("Salute Android Team")
                name.set("Salute Android Team")
                email.set("salutedevs@gmail.com")
            }
        }
    }
}

val distributionName = "$nexusArtifactId-v${versionInfo.fullName}"
val distributionRepoDir = layout.buildDirectory.dir("distribution-repo")
publishing {
    repositories {
        maven {
            name = "distribution"
            url = uri(distributionRepoDir.get().toString())
        }
    }
}



// Publishes all publications to a local directory repository and zips it.
// This avoids touching the Central Portal staging repository URL during configuration.
tasks.register<Zip>("generateDistributionZip") {
    group = "publishing"
    // Publish all publications to the local 'distribution' repository first
    dependsOn(tasks.withType(PublishToMavenRepository::class.java)
        .matching { it.repository.name == "distribution" })

    from(distributionRepoDir)
    into("")
    exclude("**/maven-metadata*.*") // Sonatype does not want these files in ZIP file
    archiveFileName.set("$distributionName.zip")
}

tasks.register<MavenPublishTask>("mavenPublish") {
    group = "publishing"
    token.set(properties["publicationToken"]?.toString() ?: System.getenv("PP_AUTH_TOKEN"))
    publicationType.set(properties["publicationType"]?.toString() ?: "AUTOMATIC")
    publicationName.set(distributionName)
    artifact.set(File("${project.buildDir}/distributions/$distributionName.zip"))
    dependsOn(tasks.first { it.name == "generateDistributionZip" })
}

fun envOrProp(name: String) =
    providers.gradleProperty(name)
        .orElse(providers.environmentVariable(name))