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

android {
    defaultConfig {
        libraryVariants.all {
            outputs.all {
                val output = this as BaseVariantOutputImpl
                output.outputFileName = output.outputFileName
                    .replace(".aar", "-${versionInfo().fullArtifactName}.aar")
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

afterEvaluate {
    publishing {
        publications {
            val versionInfo = versionInfo()
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = "io.github.salute-developers"
                artifactId = findPropertyOrDefault("nexus.artifactId", "").toString()
                version = versionInfo.fullName
                val siteUrl = findPropertyOrDefault("nexus.websiteUrl", "").toString()
                val gitUrl = findPropertyOrDefault("nexus.gitUrl", "").toString()

                signing {
                    useInMemoryPgpKeys(
                        System.getenv("OSS_SIGNING_KEY_ID"),
                        System.getenv("OSS_SIGNING_KEY"),
                        System.getenv("OSS_SIGNING_PASSWORD"),
                    )
                    sign(publishing.publications["release"])
                }

                pom {
                    name.set(artifactId)
                    description.set(findPropertyOrDefault("nexus.description", "").toString())
                    url.set(siteUrl)
                    scm {
                        connection.set(gitUrl)
                        developerConnection.set(gitUrl)
                        url.set(siteUrl)
                    }
                }
            }
        }
    }
}