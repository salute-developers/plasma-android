import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import utils.versionInfo

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.cmp-app")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdds.serv.sandbox"

    defaultConfig {
        resourceConfigurations += setOf("en", "ru")
    }

    lint {
        disable += "NotificationPermission"
    }

    buildFeatures {
        viewBinding = true
        buildConfig = true
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
    tasks.withType<Test> {
        maxHeapSize = "4096m"
    }

    buildTypes {
        release {
            isShrinkResources = true
            isMinifyEnabled = true
        }
    }
}

kotlin {
    targets.withType<KotlinNativeTarget>().configureEach {
        binaries.framework {
            baseName = "SddsServSandbox"
            isStatic = true
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":sdds.serv.compose:integration"))
                implementation(project(":sdds.serv.compose"))
                implementation("integration-core:sandbox-core")
                implementation("integration-core:sandbox-compose")
                implementation("integration-core:uikit-compose-fixtures")
                implementation(compose.runtime)
                implementation(compose.foundation)
            }
        }

        androidMain {
            dependencies {
                implementation(libs.base.androidX.appcompat)
                implementation(libs.base.android.material)
                implementation(libs.base.androidX.activity)
                implementation(libs.base.androidX.activity.compose)
                implementation(libs.base.androidX.constraintLayout)
            }
        }

        androidUnitTest {
            dependencies {
                implementation(libs.base.test.unit.jUnit)
                implementation(libs.base.test.unit.mockk)
                implementation(libs.base.test.unit.robolectric)
            }
        }
    }

    compilerOptions {
        freeCompilerArgs.addAll(
            listOf(
                "-P",
                "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=${project.buildDir.absolutePath}/compose_metrics",
                "-P",
                "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=${project.buildDir.absolutePath}/compose_metrics"
            )
        )
    }
}

val APP_DISTRIBUTION_NAME = "sandbox-compose-app-release"

tasks.register("generateVersionDescription") {
    group = "build"
    description = "Generates versions.json with versionCodes for both release variants"

    val outputFile = file("$buildDir/outputs/versions.json")
    doLast {
        val version = versionInfo()
        val json = buildJsonObject {
            val versionObj = buildJsonObject {
                put("code", version.code)
                put("name", version.name)
            }
            put(APP_DISTRIBUTION_NAME, versionObj)
        }
        outputFile.writeText(json.toString())
    }
}
