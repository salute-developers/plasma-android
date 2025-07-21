package tasks.s3

import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction

/**
 * Базовая задача Gradle для выполнения команд `s3cmd` с параметрами подключения к S3.
 * Используется для загрузки, удаления или синхронизации данных с бакетом S3.
 */
abstract class S3BaseTask : DefaultTask() {

    /**
     * Идентификатор ключа доступа к S3.
     * Может быть задан через Gradle property `s3-accessKeyId` или переменную окружения `S3_ACCESS_KEY_ID`.
     */
    @get:Input
    abstract val accessKeyId: Property<String>

    @get:Input
    abstract val secretAccessKey: Property<String>

    /**
     * Адрес конечной точки S3 (endpoint).
     * Может быть задан через Gradle property `s3-endpoint` или переменную окружения `S3_ENDPOINT`.
     */
    @get:Input
    abstract val endpoint: Property<String>

    /**
     * Регион бакета S3.
     * Может быть задан через Gradle property `s3-region` или переменную окружения `S3_REGION`.
     */
    @get:Input
    abstract val region: Property<String>

    /**
     * Имя S3-бакета.
     * Может быть задано через Gradle property `s3-bucket` или переменную окружения `S3_BUCKET`.
     */
    @get:Input
    abstract val bucket: Property<String>

    /**
     * Метод, вызываемый Gradle при выполнении задачи.
     * Собирает параметры конфигурации и выполняет команду `s3cmd` через `project.exec`.
     */
    @TaskAction
    fun action() {
        val args = arrayOf(
            "s3cmd",
            *getConfig(),
            *getCommands(),
        )
        project.exec {
            commandLine(*args)
        }
    }

    @Internal
    protected abstract fun getCommands(): Array<String>

    @Internal
    protected fun getBucketUrl(): String {
        return bucket.orNull ?: throw IllegalArgumentException(
            "Either gradle property s3-bucket or system env variable S3_BUCKET must be specified"
        )
    }

    private fun getConfig(): Array<String> {
        val accessKey = accessKeyId.orNull ?: throw IllegalArgumentException(
            "Either gradle property s3-accessKeyId or system env variable S3_ACCESS_KEY_ID must be specified"
        )
        val secretKey = secretAccessKey.orNull ?: throw IllegalArgumentException(
            "Either gradle property s3-secretAccessKey or system env variable S3_SECRET_ACCESS_KEY must be specified"
        )
        val endpoint = endpoint.orNull ?: throw IllegalArgumentException(
            "Either gradle property s3-endpoint or system env variable S3_ENDPOINT must be specified"
        )
        val region = region.orNull ?: throw IllegalArgumentException(
            "Either gradle property s3-region or system env variable S3_REGION must be specified"
        )
        return arrayOf(
            "--access_key=$accessKey",
            "--secret_key=$secretKey",
            "--host=$endpoint",
            "--host-bucket=$endpoint",
            "--bucket-location=$region",
            "--signature-v2",
            "--delete-removed",
            "--no-mime-magic",
        )
    }
}

fun Project.getS3AccessKeyId(): String? {
    return properties["s3-accessKeyId"]?.toString()
        ?: System.getenv("S3_ACCESS_KEY_ID")
}

fun Project.getS3SecretAccessKey(): String? {
    return properties["s3-secretAccessKey"]?.toString()
        ?: System.getenv("S3_SECRET_ACCESS_KEY")
}

fun Project.getS3Endpoint(): String? {
    return properties["s3-endpoint"]?.toString()
        ?: System.getenv("S3_ENDPOINT")
}

fun Project.getS3Region(): String? {
    return properties["s3-region"]?.toString()
        ?: System.getenv("S3_REGION")
}

fun Project.getS3Bucket(): String? {
    return properties["s3-bucket"]?.toString()
        ?: System.getenv("S3_BUCKET")
}

