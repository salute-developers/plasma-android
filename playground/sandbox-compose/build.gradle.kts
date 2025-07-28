import com.android.build.gradle.tasks.MapSourceSetPathsTask
import com.android.build.gradle.tasks.MergeResources
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import ru.sberdevices.starplugin.stardimens.GenerateStarDimensTask
import ru.sberdevices.starplugin.stardimens.StarDimensGeneratorPluginExtension
import utils.versionInfo

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-app")
    id("convention.auto-bump")
    id("convention.compose")
    id("kotlin-parcelize")
    alias(libs.plugins.roborazzi)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    id("star-dimens-generator")
}

val APP_DISTRIBUTION_NAME = "sandbox-compose-app-release"
val STAR_APP_DISTRIBUTION_NAME = "sandbox-compose-starApp-release"

android {
    namespace = "com.sdds.playground.sandbox"

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
    kotlinOptions {
        //comment following lines (freeCompilerArgs) to disable compose-metrics
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=" + project.buildDir.absolutePath + "/compose_metrics"
        )
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=" + project.buildDir.absolutePath + "/compose_metrics"
        )
    }

    flavorDimensions += "target"
    productFlavors {
        create("app") {
            applicationId = "com.sdds.playground.sandbox.compose"
            buildConfigField("String", "DIST_NAME", "\"$APP_DISTRIBUTION_NAME\"")
        }
        create("starApp") {
            applicationId = System.getenv("STAR_APP_ID") ?: "com.sdds.playground.sandbox.stards"
            buildConfigField("String", "DIST_NAME", "\"$STAR_APP_DISTRIBUTION_NAME\"")
        }
    }

    signingConfigs {
        create("appRelease") {
            if (System.getenv("KEY_STORE_FILE") != null) {
                storeFile = file(System.getenv("KEY_STORE_FILE"))
                storePassword = System.getenv("RELEASE_STORE_PASSWORD")
                keyAlias = System.getenv("RELEASE_KEY_ALIAS")
                keyPassword = System.getenv("RELEASE_KEY_PASSWORD")
            }
        }

        create("starAppRelease") {
            if (System.getenv("KEY_STORE_FILE") != null) {
                storeFile = file(System.getenv("KEY_STORE_FILE"))
                storePassword = System.getenv("RELEASE_STORE_PASSWORD")
                keyAlias = System.getenv("STAR_RELEASE_KEY_ALIAS")
                keyPassword = System.getenv("STAR_RELEASE_KEY_PASSWORD")
            }
        }
    }

    buildTypes {
        release {
            if (System.getenv("KEY_STORE_FILE") != null) {
                productFlavors.getByName("app").signingConfig = signingConfigs.getByName("appRelease")
            }
            if (System.getenv("KEY_STORE_FILE") != null) {
                productFlavors.getByName("starApp").signingConfig = signingConfigs.getByName("starAppRelease")
            }
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

configure<StarDimensGeneratorPluginExtension> {
    flavorsSupport(true)
    excludeFlavor("app")
}

tasks.withType<MergeResources>().configureEach {
    dependsOn(tasks.withType<GenerateStarDimensTask>())
}

tasks.withType<MapSourceSetPathsTask>().configureEach {
    dependsOn(tasks.withType<GenerateStarDimensTask>())
}

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
            put(STAR_APP_DISTRIBUTION_NAME, versionObj)
        }
        outputFile.writeText(json.toString())
    }
}

dependencies {
    implementation(libs.sdds.icons)
    implementation("tokens:sdds.serv.view")
    implementation("tokens:sdds.serv.compose")
    implementation(project(":sandbox-sdds-serv-integration"))

    implementation("tokens:plasma.sd.service.view")
    implementation("tokens:plasma.sd.service.compose")
    implementation(project(":sandbox-plasma-sd-service-integration"))

    implementation("tokens:stylessalute.view")
    implementation("tokens:stylessalute.compose")
    implementation(project(":sandbox-stylessalute-integration"))

    implementation("tokens:plasma.giga.compose")
    implementation(project(":sandbox-plasma-giga-integration"))

    implementation("tokens:plasma.giga.app.compose")
    implementation(project(":sandbox-plasma-giga-app-integration"))

    "starAppImplementation"("tokens:plasma-stards-view")
    "starAppImplementation"("tokens:plasma-stards-compose")
    "starAppImplementation"(project(":sandbox-plasma-stards-integration"))

    implementation(project(":sandbox-core-integration"))
    implementation("sdds-core:testing") {
        exclude("org.robolectric", "robolectric")
    }
    implementation(libs.sdds.uikit.compose)
    implementation(libs.sdds.uikit)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.compose.material)
    implementation(libs.base.androidX.compose.animation)
    implementation(libs.base.androidX.activity.compose)
    implementation(libs.base.androidX.lifecycle.compose.viewmodel)
    implementation(libs.base.koil.compose)

    implementation(libs.base.android.material)
    implementation(libs.base.androidX.constraintLayout)
    implementation(libs.base.androidX.lifecycle.viewmodel)
    implementation(libs.base.androidX.navigation.fragment)
    implementation(libs.base.androidX.navigation.ui)
    implementation(libs.base.androidX.navigation.compose)
    implementation(libs.base.androidX.activity.ktx)
    implementation(libs.base.glide)
    implementation(libs.base.kotlin.serialization.json)

    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)

    // UI Tests
    androidTestImplementation(libs.base.test.ui.compose.jUnit4)
    debugImplementation(libs.base.test.ui.compose.uiTestManifest)

    // Unit tests
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.base.test.ui.compose.jUnit4)

    //Screenshot tests
    testImplementation(libs.test.roborazzi)
    testImplementation(libs.test.roborazzi.compose)
    testImplementation(libs.test.roborazzi.rule)
    testImplementation(libs.base.test.unit.robolectric)
}
