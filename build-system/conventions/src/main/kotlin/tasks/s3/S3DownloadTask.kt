package tasks.s3

import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input

/**
 * Gradle-задача для загрузки содержимого директории или одного файла из указанного пути на S3-бакете в локальную директорию.
 */
abstract class S3DownloadTask : S3BaseTask() {

    /**
     * Путь до файла или директории в S3-бакете
     */
    @get:Input
    abstract val remoteFilePath: Property<String>

    /**
     * Директория, куда загрузится файл или содержимое директории [remoteFilePath]
     */
    @get:Input
    abstract val localDir: Property<String>

    override val ignoreError: Boolean = true

    override fun getCommands(): Array<String> {
        val remotePath = remoteFilePath.get()
        val remoteCommand = if (remotePath.endsWith("/")) {
            "sync"
        } else {
            "get"
        }
        return arrayOf(
            remoteCommand,
            "s3://${getBucketUrl()}$remotePath",
            localDir.get()
        )
    }

}