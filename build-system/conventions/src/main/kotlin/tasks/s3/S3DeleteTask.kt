package tasks.s3

import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input

/**
 * Gradle-задача для рекурсивного удаления содержимого из указанного пути в бакете S3.
 * Выполняется через команду `s3cmd del`.
 */
abstract class S3DeleteTask : S3BaseTask() {

    /**
     * Относительный путь внутри S3-бакета, который необходимо удалить.
     * Пример: `"path/to/delete/"`.
     */
    @get:Input
    abstract val deletePath: Property<String>

    /**
     * Возвращает массив аргументов команды `s3cmd` для выполнения удаления.
     */
    override fun getCommands(): Array<String> {
        return arrayOf(
            "del",
            "-r",
            "s3://${getBucketUrl()}${deletePath.get()}"
        )
    }
}