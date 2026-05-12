package tasks.docs

import org.gradle.api.Project
import java.io.File

internal class KotlinSnippetExtractorDelegate(
    private val snippetsDir: File,
    private val project: Project,
) {
    // @DocSample("id")  or  @DocSample(id = "id")
    private val docSampleRe = Regex(
        """@DocSample\s*\(\s*(?:id\s*=\s*)?\"([^\"]+)\"\s*\)"""
    )
    private val snippetCallRe = Regex(
        """(composableCodeSnippet|codeSnippet)\s*\{"""
    )
    private val packageRe = Regex("""^\s*package\s+([\w.]+)""", RegexOption.MULTILINE)
    private val funRe     = Regex("""fun\s+(\w+)\s*\(""")

    // ── public ────────────────────────────────────────────────────────────────

    fun extractFromFile(file: File): List<SampleMeta> {
        val text = file.readText()
        val pkg  = packageRe.find(text)?.groupValues?.get(1) ?: ""
        return extractSamples(text, pkg, file)
    }

    // ── extraction ────────────────────────────────────────────────────────────

    private fun extractSamples(text: String, pkg: String, file: File): List<SampleMeta> {
        val result = mutableListOf<SampleMeta>()
        var pos = 0

        while (pos < text.length) {
            val annMatch = docSampleRe.find(text, pos) ?: break
            val id = annMatch.groupValues[1]

            val funMatch = funRe.find(text, annMatch.range.last + 1) ?: break
            val funName  = funMatch.groupValues[1]
            val fqName   = if (pkg.isBlank()) funName else "$pkg.$funName"

            val bodyOpen = text.indexOf('{', funMatch.range.last)
            if (bodyOpen == -1) { pos = annMatch.range.last + 1; continue }

            val bodyClose = matchingBrace(text, bodyOpen)
            if (bodyClose == -1) { pos = annMatch.range.last + 1; continue }

            val funBody       = text.substring(bodyOpen + 1, bodyClose)
            val funBodyOffset = bodyOpen + 1

            val calls = findSnippetCalls(funBody, funBodyOffset)
            if (calls.isEmpty()) { pos = bodyClose + 1; continue }

            var hasComposable = false
            var hasRegular    = false
            var minStart      = Int.MAX_VALUE
            var maxEnd        = Int.MIN_VALUE
            val blocks        = mutableListOf<String>()

            for (call in calls) {
                when (call.type) {
                    "composableCodeSnippet" -> hasComposable = true
                    else                    -> hasRegular    = true
                }
                val callIndent  = indentBefore(text, call.callAbsStart)
                val normalized  = normalizeIndent(call.lambdaBody, callIndent)
                val replaced    = replacePlaceholders(normalized)
                if (replaced.isNotBlank()) {
                    blocks += replaced
                    minStart = minOf(minStart, call.lambdaAbsRange.first)
                    maxEnd   = maxOf(maxEnd,   call.lambdaAbsRange.last)
                }
            }

            val snippet = blocks.filter { it.isNotBlank() }.joinToString("\n\n").trimEnd()
            if (snippet.isBlank()) { pos = bodyClose + 1; continue }

            val kind = when {
                hasComposable && hasRegular -> "mixed"
                hasComposable               -> "composable"
                else                        -> "regular"
            }

            val relPath     = snippetRelPath(pkg, id)
            val snippetFile = File(snippetsDir, relPath).also { it.parentFile.mkdirs() }
            snippetFile.writeText(snippet + "\n")

            result += SampleMeta(
                id                  = id,
                kind                = kind,
                fqName              = fqName,
                file                = project.relativePath(file),
                snippetPath         = snippetFile.relativeTo(snippetsDir).path,
                snippetStartOffset  = if (minStart == Int.MAX_VALUE) 0 else minStart,
                snippetEndOffset    = if (maxEnd   == Int.MIN_VALUE) 0 else maxEnd,
            )

            pos = bodyClose + 1
        }

        return result
    }

    // ── snippet call finding ──────────────────────────────────────────────────

    private data class SnippetCall(
        val type:            String,
        val lambdaBody:      String,
        val lambdaAbsRange:  IntRange,
        val callAbsStart:    Int,
    )

    private fun findSnippetCalls(body: String, bodyAbsOffset: Int): List<SnippetCall> {
        val result = mutableListOf<SnippetCall>()
        var pos = 0
        while (pos < body.length) {
            val m = snippetCallRe.find(body, pos) ?: break
            val braceOpen  = m.range.last          // the '{' captured by the regex
            val braceClose = matchingBrace(body, braceOpen)
            if (braceClose == -1) { pos = m.range.last + 1; continue }

            result += SnippetCall(
                type           = m.groupValues[1],
                lambdaBody     = body.substring(braceOpen + 1, braceClose),
                lambdaAbsRange = (bodyAbsOffset + braceOpen + 1)..(bodyAbsOffset + braceClose),
                callAbsStart   = bodyAbsOffset + m.range.first,
            )
            pos = braceClose + 1
        }
        return result
    }

    // ── brace matching ────────────────────────────────────────────────────────

    private fun matchingBrace(text: String, openPos: Int): Int {
        var depth  = 0
        var inStr  = false
        var escape = false
        var i      = openPos
        while (i < text.length) {
            when {
                escape         -> escape = false
                text[i] == '\\' && inStr -> escape = true
                text[i] == '"'  -> inStr = !inStr
                !inStr && text[i] == '{' -> depth++
                !inStr && text[i] == '}' -> { if (--depth == 0) return i }
            }
            i++
        }
        return -1
    }

    // ── indent helpers ────────────────────────────────────────────────────────

    private fun indentBefore(text: String, offset: Int): String {
        val lineStart = text.lastIndexOf('\n', offset - 1).let { if (it == -1) 0 else it + 1 }
        return text.substring(lineStart, offset).takeWhile { it == ' ' || it == '\t' }
    }

    private fun normalizeIndent(raw: String, callIndent: String): String {
        val lines = raw.lines().dropWhile { it.isBlank() }.dropLastWhile { it.isBlank() }
        if (lines.isEmpty()) return ""

        // determine the indent level of the first content line inside the lambda
        val firstContentIndent = lines.firstOrNull { it.isNotBlank() }
            ?.takeWhile { it == ' ' || it == '\t' } ?: ""

        val stripPrefix = if (callIndent.isNotEmpty() && firstContentIndent.startsWith(callIndent))
            firstContentIndent          // callIndent + relative-lambda-indent
        else
            firstContentIndent

        return lines.joinToString("\n") { line ->
            val trimmed = line.trimEnd()
            when {
                stripPrefix.isNotEmpty() && trimmed.startsWith(stripPrefix) ->
                    trimmed.removePrefix(stripPrefix)
                callIndent.isNotEmpty() && trimmed.startsWith(callIndent) ->
                    trimmed.removePrefix(callIndent)
                else -> trimmed
            }
        }
    }

    // ── placeholder replacement ───────────────────────────────────────────────

    private val placeholderRe =
        Regex("""placeholder\s*\(\s*[^,]+,\s*"([^"\\]*(?:\\.[^"\\]*)*)"\s*\)""")

    private fun replacePlaceholders(snippet: String): String =
        snippet.replace(placeholderRe) { it.groupValues[1].trim() }

    // ── path helpers ──────────────────────────────────────────────────────────

    private fun snippetRelPath(pkg: String, id: String): String {
        fun sanitize(s: String) = s.trim().replace(Regex("[^A-Za-z0-9_.-]"), "_")
        val safeId  = sanitize(id)
        val pkgPath = pkg.takeIf { it.isNotBlank() }
            ?.split('.')?.joinToString(File.separator) { sanitize(it) } ?: ""
        return if (pkgPath.isBlank()) "$safeId.kt" else "$pkgPath${File.separator}$safeId.kt"
    }
}