package utils

import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

fun KotlinMultiplatformExtension.addDefaultTargets() {
    jvm()
    androidTarget {
        publishLibraryVariants("release")
    }

//  iosX64()
//  iosArm64()
//  iosSimulatorArm64()
//
//  macosX64()
//  macosArm64()
//
//  @OptIn(ExperimentalWasmDsl::class)
//  wasmJs {
//    browser()
//  }
//
//  js(IR) {
//    browser()
//  }
}

internal fun Project.kotlin(action: KotlinMultiplatformExtension.() -> Unit) {
    extensions.configure<KotlinMultiplatformExtension>(action)
}

internal val Project.kotlin: KotlinMultiplatformExtension
    get() = extensions.getByType<KotlinMultiplatformExtension>()