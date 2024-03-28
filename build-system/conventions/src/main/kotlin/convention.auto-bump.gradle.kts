import utils.AutoBumpTask

description = "Convention-плагин, который добавляет таску для автоинкремента версии"

tasks.register<AutoBumpTask>("bump") {
    scope.set(properties["scope"].toString())
}