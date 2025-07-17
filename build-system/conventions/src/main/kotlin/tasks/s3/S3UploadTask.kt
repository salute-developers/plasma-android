package tasks.s3

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import java.io.File

/**
 * Gradle-задача для загрузки содержимого директории в указанный путь S3-бакета.
 * Использует команду `s3cmd sync`, чтобы синхронизировать локальные файлы с удалённым бакетом.
 */
abstract class S3UploadTask : S3BaseTask() {

    /**
     * Локальная директория, содержимое которой будет загружено в S3.
     * Только содержимое директории, без самой директории.
     */
    @get:InputDirectory
    abstract val sourceFiles: DirectoryProperty

    /**
     * Целевой путь внутри S3-бакета, куда будет загружено содержимое директории.
     * Пример: `"uploads/release/"`.
     */
    @get:Input
    abstract val destinationPath: Property<String>

    /**
     * Возвращает массив аргументов команды `s3cmd` для синхронизации содержимого директории с указанным путём в S3.
     */
    override fun getCommands(): Array<String> {
        return arrayOf(
            "sync",
            // Копируем содержимое директории, а не саму директорию
            sourceFiles.get().asFile.pathWithTrailingSlash(),
            "s3://${getBucketUrl()}${destinationPath.get()}",
        )
    }

    private companion object {
        fun File.pathWithTrailingSlash(): String {
            val path = this.absolutePath.replace('\\', '/')
            return if (path.endsWith("/")) path else "$path/"
        }
    }

}