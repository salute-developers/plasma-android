import tasks.ProjectSummaryTask

tasks.register<ProjectSummaryTask>("generateSummary") {
    outputSummaryFile.set(rootProject.file("summary.json"))
}