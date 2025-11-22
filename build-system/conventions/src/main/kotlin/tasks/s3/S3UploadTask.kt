package tasks.s3

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import java.io.File

/**
 * Gradle-задача для загрузки содержимого директории или одного файла в указанный путь S3-бакета.
 * Использует команду `s3cmd sync`, чтобы синхронизировать локальные файлы с удалённым бакетом.
 */
abstract class S3UploadTask : S3BaseTask() {

    /**
     * Источник для загрузки: либо директория (загружается только содержимое), либо один файл.
     */
    @get:Optional
    @get:InputDirectory
    abstract val sourceDir: DirectoryProperty

    @get:Optional
    @get:InputFile
    abstract val sourceFile: RegularFileProperty

    /**
     * Целевой путь внутри S3-бакета, куда будет загружено содержимое директории.
     * Пример: `"uploads/release/"`.
     */
    @get:Input
    abstract val destinationPath: Property<String>

    /**
     * Возвращает массив аргументов команды `s3cmd` для синхронизации содержимого директории или одного файла с указанным путём в S3.
     */
    override fun getCommands(): Array<String> {
        val srcPath = when {
            sourceDir.isPresent -> sourceDir.get().asFile.pathWithTrailingSlash()
            sourceFile.isPresent -> sourceFile.get().asFile.normalizedPath()
            else -> error("Either sourceDir or sourceFile must be provided")
        }
        return arrayOf(
            "sync",
            srcPath,
            "s3://${getBucketUrl()}${destinationPath.get()}",
        )
    }

    private companion object {
        fun File.pathWithTrailingSlash(): String {
            val path = this.absolutePath.replace('\\', '/')
            return if (path.endsWith("/")) path else "$path/"
        }
        fun File.normalizedPath(): String = this.absolutePath.replace('\\', '/')
    }

}