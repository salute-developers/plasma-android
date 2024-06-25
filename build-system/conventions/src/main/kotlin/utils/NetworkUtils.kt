package utils

import java.io.ByteArrayOutputStream
import java.io.IOException
import java.math.BigInteger
import java.net.http.HttpRequest.BodyPublisher
import java.net.http.HttpRequest.BodyPublishers
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.util.Random

/**
 * @author Малышев Александр on 24.06.2024
 */
class MimeMultipartData private constructor() {
    class Builder internal constructor() {
        private var boundary: String
        private var charset: Charset = StandardCharsets.UTF_8
        private val files: MutableList<MimedFile> = ArrayList()
        private val texts: MutableMap<String, String> = LinkedHashMap()

        init {
            boundary = BigInteger(128, Random()).toString()
        }

        fun withCharset(charset: Charset): Builder {
            this.charset = charset
            return this
        }

        fun withBoundary(boundary: String): Builder {
            this.boundary = boundary
            return this
        }

        fun addFile(name: String, path: Path, mimeType: String): Builder {
            files.add(MimedFile(name, path, mimeType))
            return this
        }

        fun addText(name: String, text: String): Builder {
            texts[name] = text
            return this
        }

        @Throws(IOException::class)
        fun build(): MimeMultipartData {
            val mimeMultipartData = MimeMultipartData()
            mimeMultipartData.boundary = boundary
            val newline = "\r\n".toByteArray(charset)
            val byteArrayOutputStream = ByteArrayOutputStream()
            for (f in files) {
                byteArrayOutputStream.apply {
                    write("--$boundary".toByteArray(charset))
                    write(newline)
                    write(
                        ("Content-Disposition: form-data; name=\"${f.name}\"; filename=\"${f.path.fileName}\"")
                            .toByteArray(charset)
                    )
                    write(newline)
                    write(("Content-Type: ${f.mimeType}").toByteArray(charset))
                    write(newline)
                    write(newline)
                    write(Files.readAllBytes(f.path))
                    write(newline)
                }

            }
            for ((key, value) in texts) {
                byteArrayOutputStream.apply {
                    write("--$boundary".toByteArray(charset))
                    write(newline)
                    write("Content-Disposition: form-data; name=\"$key\"".toByteArray(charset))
                    write(newline)
                    write(newline)
                    write(value.toByteArray(charset))
                    write(newline)
                }

            }
            byteArrayOutputStream.write("--$boundary--".toByteArray(charset))
            mimeMultipartData.bodyPublisher = BodyPublishers.ofByteArray(byteArrayOutputStream.toByteArray())
            return mimeMultipartData
        }

        data class MimedFile(
            val name: String,
            val path: Path,
            val mimeType: String
        )
    }

    private var boundary: String? = null
    private var bodyPublisher: BodyPublisher? = null

    fun getBodyPublisher(): BodyPublisher? {
        return bodyPublisher
    }

    fun getContentType(): String {
        return "multipart/form-data; boundary=$boundary"
    }

    companion object {
        fun newBuilder(): Builder {
            return Builder()
        }
    }
}