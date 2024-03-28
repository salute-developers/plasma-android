import com.android.build.gradle.internal.api.BaseVariantOutputImpl
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get
import utils.findPropertyOrDefault
import utils.versionInfo

plugins {
    id("com.android.library")
    `maven-publish`
    signing
}

val nexusArtifactId = findPropertyOrDefault("nexus.artifactId", "").toString()
val versionInfo = versionInfo()

android {
    defaultConfig {
        libraryVariants.all {
            outputs.all {
                val output = this as BaseVariantOutputImpl
                output.outputFileName = output.outputFileName
                    .replace(".aar", "-${versionInfo.fullArtifactName}.aar")
            }
        }
    }
    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

publishing {
    publications {
        register<MavenPublication>("release") {
            afterEvaluate { from(components["release"]) }
            groupId = "io.github.salute-developers"
            artifactId = nexusArtifactId
            version = versionInfo.fullName
            val siteUrl = findPropertyOrDefault("nexus.websiteUrl", "").toString()
            val gitUrl = findPropertyOrDefault("nexus.gitUrl", "").toString()

            pom {
                name.set(artifactId)
                description.set(findPropertyOrDefault("nexus.description", "").toString())
                url.set(siteUrl)
                scm {
                    connection.set(gitUrl)
                    developerConnection.set(gitUrl)
                    url.set(siteUrl)
                }
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/mit-license.php")
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
    }
    repositories {
        maven {
            name = "local"
            url = uri("${project.buildDir}/repo")
        }
    }
}

signing {
    useInMemoryPgpKeys(
        System.getenv("OSS_SIGNING_KEY_ID"),
        System.getenv("OSS_SIGNING_KEY"),
        System.getenv("OSS_SIGNING_PASSWORD"),
    )
    sign(publishing.publications["release"])

}

// Maven Central has deprecated their old OSSRH publishing method in favor of their new "Central
// "Portal". Unfortunately, the only two official ways to publish to this new central portal are
// with Maven or by manually uploading a ZIP file. According to Sonatype, Gradle support is on
// their roadmap but as of today (2024-03-26) the only option are unofficial community Gradle
// plugins with single-digital GitHub stars. So for now, we create a zip file and use the manual
// upload process.
// See https://github.com/gradle/gradle/issues/28120
tasks.register<Zip>("generateDistributionZip") {
    val publishTask = tasks.named(
        "publishReleasePublicationToLocalRepository",
        PublishToMavenRepository::class.java)
    from(publishTask.map { it.repository.url })
    into("")
    exclude("**/maven-metadata*.*") // Sonatype does not want these files in ZIP file
    archiveFileName.set("$nexusArtifactId.zip")
}