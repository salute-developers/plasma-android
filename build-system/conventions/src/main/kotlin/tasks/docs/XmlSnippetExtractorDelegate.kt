package tasks.docs

import org.gradle.api.Project
import java.io.File

internal class XmlSnippetExtractorDelegate(
    private val snippetsDir: File,
    private val project: Project,
    private val namespace: String,
) {

    fun extractFromFile(file: File): List<SampleMeta> {
        val text = file.readText()
        if (!text.contains("sample-start")) return emptyList()

        val result = mutableListOf<SampleMeta>()

        val lines = text.split('\n')
        var cursorOffset = 0

        var inside = false
        var currentId: String? = null
        var sampleStartOffset: Int = -1
        var sampleEndOffset: Int = -1

        val buffer = mutableListOf<String>()
        val placeholderRules = mutableListOf<Pair<String, String>>()

        fun flushSample() {
            val id = currentId ?: return

            val raw = buffer.joinToString("\n")
            val replaced = applyPlaceholders(raw, placeholderRules)
            val normalized = normalizeIndent(replaced).trimEnd()
            if (normalized.isBlank()) return

            val relPath = buildSnippetRelPathForXml(id)
            val outFile = File(snippetsDir, relPath)
            outFile.parentFile.mkdirs()
            outFile.writeText(normalized + "\n")

            result += SampleMeta(
                id = id,
                kind = "xml",
                fqName = "xml.$id",
                file = project.relativePath(file),
                snippetPath = outFile.relativeTo(snippetsDir).path,
                snippetStartOffset = if (sampleStartOffset >= 0) sampleStartOffset else 0,
                snippetEndOffset = if (sampleEndOffset >= 0) sampleEndOffset else 0,
            )
        }

        for (line in lines) {
            val lineWithNewlineLen = line.length + 1 // + \n

            if (!inside) {
                val id = parseSampleStartId(line)
                if (id != null) {
                    inside = true
                    currentId = id
                    buffer.clear()
                    placeholderRules.clear()
                    sampleStartOffset = cursorOffset + lineWithNewlineLen
                    sampleEndOffset = -1
                }
            } else {
                // Inside a sample block
                val endId = parseSampleEndId(line)
                if (endId != null) {
                    // end offset is the start of the end marker line
                    sampleEndOffset = cursorOffset
                    flushSample()

                    inside = false
                    currentId = null
                    buffer.clear()
                    placeholderRules.clear()
                    sampleStartOffset = -1
                    sampleEndOffset = -1
                } else {
                    parsePlaceholderRule(line)?.let { rule ->
                        placeholderRules += rule
                    } ?: run {
                        if (parseSampleStartId(line) == null && parseSampleEndId(line) == null) {
                            buffer += line
                        }
                    }
                }
            }

            cursorOffset += lineWithNewlineLen
        }

        return result
    }

    private fun parseSampleStartId(line: String): String? {
        // Examples:
        // <!-- sample-start: id=BasicButton_Simple -->
        // <!-- sample-start: id = BasicButton_Simple -->
        val re = Regex("<!--\\s*sample-start\\s*:\\s*id\\s*=\\s*([^\\s-]+)\\s*-->")
        return re.find(line)?.groupValues?.get(1)
    }

    private fun parseSampleEndId(line: String): String? {
        val re = Regex("<!--\\s*sample-end\\s*:\\s*id\\s*=\\s*([^\\s-]+)\\s*-->")
        return re.find(line)?.groupValues?.get(1)
    }

    private fun parsePlaceholderRule(line: String): Pair<String, String>? {
        // Example:
        // <!-- placeholder: app:sd_icon="@drawable/ic_arrow_down_16" -> app:sd_icon="Your icon" -->
        val re = Regex("<!--\\s*placeholder\\s*:\\s*(.+?)\\s*->\\s*(.+?)\\s*-->")
        val m = re.find(line) ?: return null
        val from = m.groupValues[1].trim()
        val to = m.groupValues[2].trim()
        if (from.isBlank() || to.isBlank()) return null
        return from to to
    }

    private fun applyPlaceholders(text: String, rules: List<Pair<String, String>>): String {
        var out = text
        rules.forEach { (from, to) ->
            out = out.replace(from, to)
        }
        return out
    }

    private fun normalizeIndent(text: String): String {
        val lines = text.lines()
        val nonBlank = lines.filter { it.isNotBlank() }
        if (nonBlank.isEmpty()) return ""

        val minIndent = nonBlank
            .map { it.takeWhile { ch -> ch == ' ' || ch == '\t' }.length }
            .minOrNull() ?: 0

        return lines.joinToString("\n") { line ->
            if (line.isBlank()) "" else line.drop(minIndent)
        }
    }

    private fun buildSnippetRelPathForXml(id: String): String {
        val safeId = id.replace(Regex("[^a-zA-Z0-9._-]"), "_")
        return "${namespace.replace(".", "/")}/$safeId.xml"
    }
}