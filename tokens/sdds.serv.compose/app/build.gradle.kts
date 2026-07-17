import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.compose.desktop.application.tasks.AbstractNativeMacApplicationPackageAppDirTask
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.targets.js.ir.KotlinJsIrTarget
import org.gradle.api.tasks.Exec
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
    targets.named<KotlinNativeTarget>("macosArm64") {
        binaries.executable {
            baseName = "SddsServSandbox"
            entryPoint = "com.sdds.serv.sandbox.main"
        }
    }
    targets.withType<KotlinJsIrTarget>().configureEach {
        binaries.executable()
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
                implementation(libs.base.jetbrains.androidX.navigation.compose)
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

        jvmMain {
            dependencies {
                implementation(compose.desktop.currentOs)
            }
        }

        jsMain {
            dependencies {
                implementation(compose.components.resources)
            }
        }

        wasmJsMain {
            dependencies {
                implementation(compose.components.resources)
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

compose.desktop {
    application {
        mainClass = "com.sdds.serv.sandbox.DesktopLauncherKt"
        nativeDistributions {
            packageName = "SddsServSandbox"
            packageVersion = "1.0.0"
            targetFormats(TargetFormat.Dmg)
        }
    }
    nativeApplication {
        targets(kotlin.targets.getByName("macosArm64"))
        distributions {
            packageName = "SddsServSandbox"
            packageVersion = "1.0.0"
            targetFormats(TargetFormat.Dmg)
        }
    }
}

// compose.desktop.nativeApplication packages the Kotlin/Native executable but does not yet
// include Compose Multiplatform resources. The native resource reader expects them under
// Contents/Resources/compose-resources, so add the aggregated resources to every app bundle.
val nativeMacosResources = layout.buildDirectory.dir(
    "kotlin-multiplatform-resources/aggregated-resources/macosArm64",
)
val nativeMacosDebugApp = layout.buildDirectory.dir(
    "compose/binaries/main/native-macosArm64-debug-app-image/SddsServSandbox.app",
)
tasks.withType<AbstractNativeMacApplicationPackageAppDirTask>().configureEach {
    dependsOn("macosArm64AggregateResources")
    inputs.dir(nativeMacosResources)
    doLast {
        copy {
            from(nativeMacosResources)
            into(destinationDir.get().dir("${packageName.get()}.app/Contents/Resources/compose-resources").asFile)
        }
    }
}

// A standalone Kotlin/Native executable is not an application bundle, so the Compose
// macOS resource reader cannot resolve resources from dependent modules. Run the
// generated debug .app instead; it contains the aggregated Compose resources above.
tasks.named<Exec>("runDebugExecutableMacosArm64") {
    dependsOn("createDistributableNativeDebugMacosArm64")
    doFirst {
        executable = "open"
        setArgs(listOf("-W", nativeMacosDebugApp.get().asFile.absolutePath))
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
