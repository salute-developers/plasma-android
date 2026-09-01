import tasks.PerformanceBenchmarkReportTask

val benchmarkResults = layout.buildDirectory.dir(
    "outputs/connected_android_test_additional_output/benchmark/connected",
)
val references = rootProject.layout.projectDirectory.dir("performance-references")
val gitRoot = rootProject.layout.projectDirectory.dir("..")
val failOnRegressionProperty = providers.gradleProperty("failOnPerformanceRegression")
    .map(String::toBoolean)
    .orElse(false)

val generatePerformanceReport = tasks.register<PerformanceBenchmarkReportTask>("generatePerformanceReport") {
    group = "verification"
    description = "Generates an autonomous HTML report from existing AndroidX benchmark JSON."
    benchmarkResultsDirectory.set(benchmarkResults)
    referenceDirectory.set(references)
    gitRootDirectory.set(gitRoot)
    outputDirectory.set(layout.buildDirectory.dir("reports/performance"))
    recordReference.set(false)
    failOnRegression.set(failOnRegressionProperty)
    outputs.upToDateWhen { false }
}

tasks.register("runPerformanceBenchmarks") {
    group = "verification"
    description = "Runs the complete benchmark suite and generates a report compared with the device reference."
    dependsOn("connectedBenchmarkAndroidTest", generatePerformanceReport)
}

generatePerformanceReport.configure {
    mustRunAfter("connectedBenchmarkAndroidTest")
}

tasks.register<PerformanceBenchmarkReportTask>("recordPerformanceReference") {
    group = "verification"
    description = "Runs the complete benchmark suite and explicitly records it as the device reference."
    dependsOn("connectedBenchmarkAndroidTest")
    mustRunAfter("connectedBenchmarkAndroidTest")
    benchmarkResultsDirectory.set(benchmarkResults)
    referenceDirectory.set(references)
    gitRootDirectory.set(gitRoot)
    outputDirectory.set(references)
    recordReference.set(true)
    failOnRegression.set(false)
    outputs.upToDateWhen { false }
}
