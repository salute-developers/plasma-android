import org.gradle.api.attributes.Usage
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType

plugins {
    id("convention.kotlin-lib")
    alias(libs.plugins.kotlin.serialization)
}

group = "integration-core"

dependencies {
    implementation(libs.base.kotlin.poet)
    implementation(libs.base.kotlin.serialization.json)
    testImplementation(kotlin("test"))
    // Theme Builder нужен только дифференциальному тесту: выбор перегрузок должен совпадать с его правилами.
    testImplementation("io.github.salute-developers:plugin_theme_builder")
}

// Ручной запуск для проверки:
// ./gradlew :integration-core:preview-generator:runGenerator -Pmeta=<файл> -Pout=<каталог> [-Pcomponents=A,B]
tasks.register<JavaExec>("runGenerator") {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.sdds.preview.generator.MainKt")
    val meta = providers.gradleProperty("meta")
    val out = providers.gradleProperty("out")
    val components = providers.gradleProperty("components")
    doFirst {
        setArgs(listOfNotNull(meta.get(), out.get(), components.orNull))
    }
}

// Theme Builder (зависимость дифференциального теста) собран под JVM 17.
// Theme Builder (зависимость только дифференциального теста) собран под JVM 17, а конвенции репозитория задают 11:
// поднимаем цель только для тестовых задач.
tasks.named<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>("compileTestKotlin") {
    compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
}
tasks.named<JavaCompile>("compileTestJava") {
    sourceCompatibility = "17"
    targetCompatibility = "17"
}
configurations.matching { it.name.startsWith("test") }.configureEach {
    attributes.attribute(org.gradle.api.attributes.java.TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 17)
}

// Api-мета для тестов берётся из того же JVM-артефакта uikit-compose, что и при сборке плагина.
val apiMeta: Configuration by configurations.creating {
    isCanBeConsumed = false
    isCanBeResolved = true
    attributes {
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
        attribute(KotlinPlatformType.attribute, KotlinPlatformType.jvm)
        attribute(org.gradle.api.attributes.java.TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 17)
    }
}
dependencies {
    apiMeta(libs.sdds.uikit.compose)
}

// Дифференциальному тесту нужен доступ к internal-классам Theme Builder.
tasks.named<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>("compileTestKotlin") {
    friendPaths.from(
        configurations.named("testCompileClasspath").map { classpath ->
            classpath.filter { "/plugin_theme_builder/build/" in it.path }
        },
    )
}

tasks.test {
    inputs.files(apiMeta)
    doFirst {
        val metaJar = apiMeta.files.single {
            it.name.startsWith("uikit-compose-") || it.name.startsWith("uikit-compose.")
        }
        systemProperty("preview.api.meta.jar", metaJar.absolutePath)
    }
}
