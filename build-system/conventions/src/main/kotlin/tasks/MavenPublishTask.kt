package tasks

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction
import utils.MimeMultipartData
import java.net.URL
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.charset.StandardCharsets
import java.nio.file.Files

/**
 * Загружает артефакт в Maven Central
 * @author Малышев Александр on 24.06.2024
 */
abstract class MavenPublishTask : DefaultTask() {

    @get:Input
    abstract val token: Property<String>

    @get:Input
    abstract val publicationName: Property<String>

    @get:Input
    abstract val publicationType: Property<String>

    @get:InputFile
    abstract val artifact: RegularFileProperty

    @TaskAction
    fun publish() {
        val publishURL = URL(
            "$PUBLISH_URL/upload?publishingType=${publicationType.get()}&name=${publicationName.get()}"
        )
        val artifactPath = artifact.get().asFile.toPath()

        val data = MimeMultipartData.newBuilder()
            .withCharset(StandardCharsets.UTF_8)
            .addFile("bundle", artifactPath, Files.probeContentType(artifactPath))
            .build()
        val request = HttpRequest.newBuilder(publishURL.toURI())
            .header("Content-type", data.getContentType())
            .header("Authorization", "Bearer ${token.get()}")
            .POST(data.getBodyPublisher())
            .build()

        val client = HttpClient.newBuilder().build()
        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        println("response $response")
    }

    private companion object {
        const val PUBLISH_URL = "https://central.sonatype.com/api/v1/publisher"
    }
}