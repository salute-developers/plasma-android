import utils.BumpScope
import utils.bumpVersion

description = "Convention-плагин, который добавляет таску для автоинкремента версии"

tasks.register("bump") {
    val scope = when(properties["scope"]) {
        "major" -> BumpScope.MAJOR
        "patch" -> BumpScope.PATCH
        else -> BumpScope.MINOR
    }
    project.bumpVersion(scope)
}