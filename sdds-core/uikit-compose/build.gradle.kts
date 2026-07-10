import utils.addDefaultTargets

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.cmp-lib")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.dokka")
    alias(libs.plugins.binary.compatibility.validator)
    alias(libs.plugins.ksp)
}

group = "sdds-core"

android {
    namespace = "com.sdds.compose.uikit"
    sourceSets {
        getByName("main") {
            resources.srcDir(layout.buildDirectory.dir("generated/ksp/metadata/commonMain/resources"))
        }
    }
}

kotlin {
    addDefaultTargets()
    sourceSets {
        commonMain {
            resources.srcDir(layout.buildDirectory.dir("generated/ksp/metadata/commonMain/resources"))
            dependencies {
                implementation(project(":api-info-compose"))
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.animation)
                implementation(libs.sdds.haze)
                implementation(libs.base.jetbrains.androidX.lifecycle.compose.viewmodel)
            }
        }

        androidMain {
            dependencies {
                implementation(libs.base.androidX.compose.uiTooling.preview)
            }
        }

        androidUnitTest {
            dependencies {
                implementation(libs.base.test.unit.jUnit)
            }
        }

        val skikoMain by creating {
            dependsOn(commonMain.get())
        }

        val iosMain by creating {
            dependsOn(skikoMain)
        }

        val iosX64Main by getting {
            dependsOn(iosMain)
        }

        val iosArm64Main by getting {
            dependsOn(iosMain)
        }

        val iosSimulatorArm64Main by getting {
            dependsOn(iosMain)
        }

        val macosMain by creating {
            dependsOn(skikoMain)
        }

        val macosX64Main by getting {
            dependsOn(macosMain)
        }

        val macosArm64Main by getting {
            dependsOn(macosMain)
        }

        jvmMain {
            dependsOn(skikoMain)
        }

        named("wasmJsMain") {
            dependsOn(skikoMain)
        }

        jsMain {
            dependsOn(skikoMain)
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

dependencies {
    add("kspCommonMainMetadata", project(":api-info-ksp"))
    debugImplementation(libs.base.androidX.compose.uiTooling)

    // UI Tests
    androidTestImplementation(libs.base.test.ui.compose.jUnit4)
    debugImplementation(libs.base.test.ui.compose.uiTestManifest)
}

tasks.matching { it.name.endsWith("ProcessResources") }.configureEach {
    dependsOn(tasks.matching { task -> task.name == "kspCommonMainKotlinMetadata" })
}

tasks.matching { it.name == "processDebugJavaRes" }.configureEach {
    dependsOn(tasks.matching { task ->
        task.name == "kspCommonMainKotlinMetadata" ||
            task.name == "kspDebugKotlinAndroid" ||
            task.name == "kspDebugKotlin"
    })
}

tasks.matching { it.name == "processReleaseJavaRes" }.configureEach {
    dependsOn(tasks.matching { task ->
        task.name == "kspCommonMainKotlinMetadata" ||
            task.name == "kspReleaseKotlinAndroid" ||
            task.name == "kspReleaseKotlin"
    })
}
