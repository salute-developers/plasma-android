package tasks.docs

import org.gradle.api.Project
import org.jetbrains.kotlin.psi.KtAnnotationEntry
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtPsiFactory
import org.jetbrains.kotlin.psi.KtStringTemplateExpression
import org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType
import java.io.File

internal class KotlinSnippetExtractorDelegate(
    private val psiFactory: KtPsiFactory,
    private val snippetsDir: File,
    private val project: Project,
) {
    fun extractFromFile(file: File): List<SampleMeta> {
        val text = file.readText()
        val ktFile = psiFactory.createFile(file.name, text)

        val pkg = ktFile.packageFqName.asString()
        val result = mutableListOf<SampleMeta>()

        ktFile.declarations
            .asSequence()
            .filterIsInstance<KtNamedFunction>()
            .forEach { fn ->
                extractFromFunction(
                    pkg = pkg,
                    fn = fn,
                    file = file,
                    fileText = text,
                )?.let(result::add)
            }

        return result
    }

    private fun extractFromFunction(
        pkg: String,
        fn: KtNamedFunction,
        file: File,
        fileText: String,
    ): SampleMeta? {
        val docAnn = findDocSampleAnnotation(fn) ?: return null
        val id = readDocSampleId(docAnn) ?: fn.name ?: return null
        val funName = fn.name ?: return null
        val fqName = buildFqName(pkg, funName)

        val calls = collectSnippetCalls(fn)
        if (calls.isEmpty()) return null

        val blocks = mutableListOf<String>()
        var hasRegular = false
        var hasComposable = false
        var minStart = Int.MAX_VALUE
        var maxEnd = Int.MIN_VALUE

        calls.forEach { call ->
            when (call.calleeExpression?.text) {
                "composableCodeSnippet" -> hasComposable = true
                else -> hasRegular = true
            }

            extractNormalizedBlock(call, fileText)?.let { (block, range) ->
                blocks += block
                minStart = kotlin.math.min(minStart, range.startOffset)
                maxEnd = kotlin.math.max(maxEnd, range.endOffset)
            }
        }

        val normalizedSnippet = blocks
            .filter { it.isNotBlank() }
            .joinToString("\n\n")
            .trimEnd()

        if (normalizedSnippet.isBlank()) return null

        val kind = when {
            hasComposable && hasRegular -> "mixed"
            hasComposable -> "composable"
            else -> "regular"
        }

        val snippetStartOffset = if (minStart == Int.MAX_VALUE) 0 else minStart
        val snippetEndOffset = if (maxEnd == Int.MIN_VALUE) 0 else maxEnd

        val snippetRelPath = buildSnippetRelPath(pkg = pkg, id = id)
        val snippetFile = File(snippetsDir, snippetRelPath)
        snippetFile.parentFile.mkdirs()
        snippetFile.writeText(normalizedSnippet + "\n")

        return SampleMeta(
            id = id,
            kind = kind,
            fqName = fqName,
            file = project.relativePath(file),
            snippetPath = snippetFile.relativeTo(snippetsDir).path,
            snippetStartOffset = snippetStartOffset,
            snippetEndOffset = snippetEndOffset,
        )
    }

    private fun findDocSampleAnnotation(fn: KtNamedFunction): KtAnnotationEntry? {
        return fn.annotationEntries.firstOrNull { it.shortName?.asString() == "DocSample" }
    }

    private fun collectSnippetCalls(fn: KtNamedFunction): List<KtCallExpression> {
        return fn.bodyBlockExpression
            ?.statements
            ?.asSequence()
            ?.flatMap { it.collectDescendantsOfType<KtCallExpression>().asSequence() }
            ?.filter {
                val callee = it.calleeExpression?.text
                callee == "codeSnippet" || callee == "composableCodeSnippet"
            }
            ?.toList()
            .orEmpty()
    }

    private fun extractNormalizedBlock(
        call: KtCallExpression,
        fileText: String,
    ): Pair<String, org.jetbrains.kotlin.com.intellij.openapi.util.TextRange>? {
        val lambda = call.lambdaArguments.firstOrNull()?.getLambdaExpression() ?: return null
        val body = lambda.bodyExpression ?: return null
        val range = body.textRange

        val rawSnippet = fileText.substring(range.startOffset, range.endOffset)
        val callIndentPrefix = computeCallIndentPrefix(call, fileText)
        val lambdaIndentRelative = computeLambdaIndentRelative(callIndentPrefix, range, fileText)

        val normalized = normalizeIndent(rawSnippet, callIndentPrefix, lambdaIndentRelative)
        val replaced = replacePlaceholderCalls(normalized)

        return replaced to range
    }

    private fun computeCallIndentPrefix(call: KtCallExpression, fileText: String): String {
        val callStart = call.textRange.startOffset
        val lineStart = fileText.lastIndexOf('\n', startIndex = callStart).let { if (it == -1) 0 else it + 1 }
        val beforeCall = fileText.substring(lineStart, callStart)
        return beforeCall.takeWhile { it == ' ' || it == '\t' }
    }

    private fun computeLambdaIndentRelative(
        callIndentPrefix: String,
        bodyRange: org.jetbrains.kotlin.com.intellij.openapi.util.TextRange,
        fileText: String,
    ): String {
        val bodyStart = bodyRange.startOffset
        val lineStart = fileText.lastIndexOf('\n', startIndex = bodyStart).let { if (it == -1) 0 else it + 1 }
        val beforeBody = fileText.substring(lineStart, bodyStart)
        val lambdaBodyIndentPrefix = beforeBody.takeWhile { it == ' ' || it == '\t' }

        return if (callIndentPrefix.isNotEmpty() && lambdaBodyIndentPrefix.startsWith(callIndentPrefix)) {
            lambdaBodyIndentPrefix.removePrefix(callIndentPrefix)
        } else {
            lambdaBodyIndentPrefix
        }
    }

    private fun normalizeIndent(
        rawSnippet: String,
        callIndentPrefix: String,
        lambdaIndentRelative: String,
    ): String {
        return rawSnippet
            .lines()
            .dropWhile { it.isBlank() }
            .dropLastWhile { it.isBlank() }
            .map { line ->
                var s = line.trimEnd()

                // 1) Shift by the indentation of the call-site.
                if (callIndentPrefix.isNotEmpty() && s.startsWith(callIndentPrefix)) {
                    s = s.removePrefix(callIndentPrefix)
                }

                // 2) Shift by the indentation level inside the lambda (relative to the call-site indent).
                if (lambdaIndentRelative.isNotEmpty() && s.startsWith(lambdaIndentRelative)) {
                    s = s.removePrefix(lambdaIndentRelative)
                }

                s
            }
            .joinToString("\n")
    }

    private fun replacePlaceholderCalls(snippet: String): String {
        val re = "placeholder\\s*\\(\\s*[^,]+,\\s*\"([^\"\\\\]*(?:\\\\.[^\"\\\\]*)*)\"\\s*\\)".toRegex()
        return snippet.replace(re) { m -> m.groupValues[1].trim() }
    }

    private fun readDocSampleId(ann: KtAnnotationEntry): String? {
        // @DocSample(id = "x") or @DocSample("x")
        val args = ann.valueArguments
        if (args.isEmpty()) return null

        // Named id=
        val named = args.firstOrNull { it.getArgumentName()?.asName?.asString() == "id" }
        val arg = named ?: args.first()

        val expr = arg.getArgumentExpression() as? KtStringTemplateExpression ?: return null
        // Support only literal strings in MVP
        return expr.entries.joinToString("") { it.text }.trim('"')
    }

    private fun buildFqName(pkg: String, funName: String): String =
        if (pkg.isBlank()) funName else "$pkg.$funName"

    private fun buildSnippetRelPath(pkg: String, id: String): String {
        fun sanitizeSegment(s: String): String = s
            .trim()
            .replace(Regex("[^A-Za-z0-9_.-]"), "_")

        val safeId = sanitizeSegment(id)
        val pkgPath = pkg.takeIf { it.isNotBlank() }
            ?.split('.')
            ?.joinToString(File.separator) { sanitizeSegment(it) }
            ?: ""

        return if (pkgPath.isBlank()) {
            "$safeId.kt"
        } else {
            pkgPath + File.separator + "$safeId.kt"
        }
    }
}