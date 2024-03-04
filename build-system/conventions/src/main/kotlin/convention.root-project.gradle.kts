
plugins {
    id("base")
    id("io.github.gradle-nexus.publish-plugin")
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

nexusPublishing {
    repositories {
        sonatype {
            username.set(System.getenv("OSS_USERNAME"))
            password.set(System.getenv("OSS_PASSWORD"))
            stagingProfileId.set(System.getenv("OSS_STAGING_PROFILE_ID"))

            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
        }
    }
}

tasks.register("detektAll") {
    val detektTasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "detekt" }
    }
    val includedTasks = gradle.includedBuilds.map {
        it.task(":detektAll")
    }
    dependsOn(detektTasks, includedTasks)
}

tasks.register("spotlessCheckAll") {
    val spotlessCheckTasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "spotlessCheck" }
    }
    val includedTasks = gradle.includedBuilds.map {
        it.task(":spotlessCheckAll")
    }
    dependsOn(spotlessCheckTasks, includedTasks)
}

tasks.register("spotlessApplyAll") {
    val spotlessApplyTasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "spotlessApply" }
    }
    val includedTasks = gradle.includedBuilds.map {
        it.task(":spotlessApplyAll")
    }
    dependsOn(spotlessApplyTasks, includedTasks)
}

tasks.register("assembleDebugAll") {
    val testTasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "assembleDebug" }
    }
    val includedTestTasks = gradle.includedBuilds.map {
        it.task(":assembleDebugAll")
    }
    dependsOn(testTasks, includedTestTasks)
}

tasks.register("testDebugAll") {
    val testTasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "testDebugUnitTest" }
    }
    val includedTestTasks = gradle.includedBuilds.map {
        it.task(":testDebugAll")
    }
    dependsOn(testTasks, includedTestTasks)
}

tasks.register("lintDebugAll") {
    val testTasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "lintDebug" }
    }
    val includedTestTasks = gradle
        .includedBuilds
        .map { it.task(":lintDebugAll") }
    dependsOn(testTasks, includedTestTasks)
}
