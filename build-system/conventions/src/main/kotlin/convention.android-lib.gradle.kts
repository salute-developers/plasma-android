import com.android.build.gradle.internal.api.BaseVariantOutputImpl
import utils.findPropertyOrDefault
import utils.versionInfo
import utils.withVersionCatalogs

plugins {
    id("com.android.library")
    kotlin("android")
    id("org.gradle.android.cache-fix")
    id("convention.detekt")
    id("convention.spotless")
    `maven-publish`
    signing
}

val versionInfo = versionInfo()

android {

    withVersionCatalogs {
        compileSdk = versions.global.compileSdk.get().toInt()

        defaultConfig {
            libraryVariants.all {
                outputs.all {
                    val output = this as BaseVariantOutputImpl
                    output.outputFileName = output.outputFileName
                        .replace(".aar", "-${versionInfo.fullArtifactName}.aar")
                }
            }
            minSdk = versions.global.minSdk.get().toInt()
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
        kotlinOptions.jvmTarget = versions.global.jvmTarget.get()
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }

    lint {
        xmlReport = false
        textReport = false
        sarifReport = false
        htmlReport = true
    }
}

dependencies {
    withVersionCatalogs {
        implementation(base.kotlin.stdlib)
        testImplementation(base.test.unit.jUnit)
        testImplementation(base.test.unit.mockk)
        testImplementation(base.test.unit.robolectric)
    }
}

afterEvaluate {
    publishing {
        publications {
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
