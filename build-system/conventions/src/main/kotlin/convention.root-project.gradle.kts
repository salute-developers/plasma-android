
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

tasks.register("apiDumpAll") {
    val tasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "apiDump" }
    }
    val includedTasks = gradle.includedBuilds.map {
        it.task(":apiDumpAll")
    }
    dependsOn(tasks, includedTasks)
}

tasks.register("apiCheckAll") {
    val tasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "apiCheck" }
    }
    val includedTasks = gradle.includedBuilds.map {
        it.task(":apiCheckAll")
    }
    dependsOn(tasks, includedTasks)
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

tasks.register("assembleReleaseAll") {
    val releaseTasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "assembleRelease" }
    }
    val includedReleaseTasks = gradle.includedBuilds.map {
        it.task(":assembleReleaseAll")
    }
    dependsOn(releaseTasks, includedReleaseTasks)
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

tasks.register("testAll") {
    val testTasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "test" }
    }
    val includedTestTasks = gradle.includedBuilds.map {
        it.task(":testAll")
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

tasks.register("mavenPublishAll") {
    val publishTasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "mavenPublish" }
    }
    dependsOn(publishTasks)
}

tasks.register("bumpAll") {
    val publishTasks = subprojects.flatMap {
        it.tasks.matching { task -> task.name == "bump" }
    }
    dependsOn(publishTasks)
}

