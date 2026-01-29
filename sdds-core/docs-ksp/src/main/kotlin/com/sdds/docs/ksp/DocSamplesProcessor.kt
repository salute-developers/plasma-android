package com.sdds.docs.ksp

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.validate
import java.io.OutputStreamWriter

/**
 * Provider для KSP-процессора, который собирает функции, помеченные [com.sdds.docs.DocSample],
 * и генерирует реестр примеров для документации.
 */
class DocSamplesProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor =
        DocSamplesProcessor(environment.codeGenerator, environment.logger)
}

/**
 * KSP-процессор для @DocSample.
 *
 * Находит функции с аннотацией [com.sdds.docs.DocSample] и генерирует Kotlin-файл
 * с registry: KotlinSamples, ViewSamples и ComposableSamples.
 *
 * Ключом выступает `id` из аннотации (если задан) либо имя функции/qualified name.
 */
class DocSamplesProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger,
) : SymbolProcessor {

    private val docSampleAnn = "com.sdds.docs.DocSample"
    private val contextType = "android.content.Context"
    private val viewType = "android.view.View"
    private val composableAnn = "androidx.compose.runtime.Composable"

    private val kotlinEntries: LinkedHashMap<String, Entry> = linkedMapOf()
    private val viewEntries: LinkedHashMap<String, Entry> = linkedMapOf()
    private val composableEntries: LinkedHashMap<String, Entry> = linkedMapOf()
    private var registryGenerated: Boolean = false

    /**
     * Сканирует символы текущего раунда и накапливает записи для будущей генерации registry.
     */
    override fun process(resolver: Resolver): List<KSAnnotated> {
        val annotated = resolver.getSymbolsWithAnnotation(docSampleAnn).toList()

        val invalid = annotated.filterNot { it.validate() }
        val functions = annotated
            .filterIsInstance<KSFunctionDeclaration>()
            .filter { it.validate() }
            .filter { fn ->
                val isCallable = isCallableWithoutReceiver(fn)
                if (!isCallable) {
                    logger.warn(
                        "@DocSample must be top-level or object member to be referenced without receiver; " +
                            "skip ${fn.qualifiedName?.asString()}",
                        fn,
                    )
                }
                isCallable
            }
            .toList()

        for (fn in functions) {
            val args = readDocSampleArguments(fn)
            val id = args?.id.orEmpty()
            val needScreenshot = args?.needScreenshot ?: true
            val key = id.takeIf { it.isNotBlank() }
                ?: fn.qualifiedName?.asString()
                ?: fn.simpleName.asString()

            val referenceType = getReferenceType(fn)

            val ref = toCallableReferenceText(fn, referenceType)
            if (ref == null) {
                logger.warn("Cannot build function reference for ${fn.qualifiedName?.asString()}", fn)
                continue
            }

            val entry = Entry(key = key, reference = CallableReference(needScreenshot, ref))
            val target = referenceType.getReferenceTarget()
            val existing = target.putIfAbsent(key, entry)
            if (existing != null) {
                logger.error(
                    "Duplicate @DocSample key '$key'. Conflicts: ${existing.reference} and ${entry.reference}",
                    fn,
                )
            }
        }

        return invalid
    }

    /**
     * Финализирует обработку и генерирует registry-файл один раз за компиляцию.
     */
    override fun finish() {
        if (registryGenerated) return
        registryGenerated = true

        generateRegistryFile(
            regular = kotlinEntries.values.toList(),
            view = viewEntries.values.toList(),
            composable = composableEntries.values.toList(),
        )
    }

    private fun getReferenceType(fn: KSFunctionDeclaration): ReferenceType {
        return when {
            isComposable(fn) -> ReferenceType.Composable
            isView(fn) -> ReferenceType.View
            else -> ReferenceType.Kotlin
        }
    }

    private fun ReferenceType.getReferenceTarget(): LinkedHashMap<String, Entry> {
        return when (this) {
            ReferenceType.Composable -> composableEntries
            ReferenceType.View -> viewEntries
            ReferenceType.Kotlin -> kotlinEntries
        }
    }

    private fun readDocSampleArguments(fn: KSFunctionDeclaration): DocSampleArguments? {
        val ann = fn.annotations.firstOrNull {
            it.annotationType.resolve().declaration.qualifiedName?.asString() == docSampleAnn
        } ?: return null

        return DocSampleArguments(
            id = ann.arguments.firstOrNull { it.name?.asString() == "id" }?.value?.toString(),
            needScreenshot = ann.arguments.firstOrNull { it.name?.asString() == "needScreenshot" }
                ?.value?.toString()?.toBoolean() ?: true,
        )
    }

    private fun isComposable(fn: KSFunctionDeclaration): Boolean =
        fn.annotations.any {
            it.annotationType.resolve().declaration.qualifiedName?.asString() == composableAnn
        }

    private fun isView(fn: KSFunctionDeclaration): Boolean {
        val parameter = fn.parameters.singleOrNull()?.type?.resolve() ?: return false
        val returnType = fn.returnType?.resolve() ?: return false
        return parameter.declaration.qualifiedName?.asString() == contextType &&
            returnType.declaration.qualifiedName?.asString() == viewType
    }

    private fun isCallableWithoutReceiver(fn: KSFunctionDeclaration): Boolean {
        val parent = fn.parentDeclaration
        return parent == null // top-level
    }

    private fun toCallableReferenceText(fn: KSFunctionDeclaration, referenceType: ReferenceType): String? {
        val parent = fn.parentDeclaration
        val qn = fn.qualifiedName?.asString() ?: return null
        if (parent != null) {
            logger.error("Only top-level functions can be called")
            return null
        }
        return when (referenceType) {
            ReferenceType.View -> "{ $qn(it) }"
            else -> "{ $qn() }"
        }
    }

    private fun generateRegistryFile(
        regular: List<Entry>,
        view: List<Entry>,
        composable: List<Entry>,
    ) {
        val pkg = "com.sdds.docs"
        val fileName = "DocSampleRegistry"

        if (regular.isEmpty() && composable.isEmpty() && view.isEmpty()) return

        val file = codeGenerator.createNewFile(
            dependencies = Dependencies(aggregating = true),
            packageName = pkg,
            fileName = fileName,
        )

        OutputStreamWriter(file, Charsets.UTF_8).use { out ->
            out.appendLine("package $pkg")
            out.appendLine()

            out.appendLine("import com.sdds.docs.SampleRegistry")
            out.appendLine("import com.sdds.docs.SampleId")

            if (composable.isNotEmpty()) {
                out.appendLine("import androidx.compose.runtime.Composable")
                out.appendLine("import com.sdds.compose.docs.ComposableSample")
                out.appendLine()
            }

            if (view.isNotEmpty()) {
                out.appendLine("import android.content.Context")
                out.appendLine("import android.view.View")
                out.appendLine("import com.sdds.docs.views.ViewSample")
                out.appendLine()
            }

            if (regular.isNotEmpty()) {
                out.appendLine("public val KotlinSamples: SampleRegistry = mapOf(")
                regular.forEachIndexed { i, e ->
                    val comma = if (i == regular.lastIndex) "" else ","
                    val needScreenshot = e.reference.needScreenshot
                    val ref = e.reference.reference
                    out.appendLine(""""${e.key}" to  KotlinSample($needScreenshot, $ref)$comma""".trimIndent())
                }
                out.appendLine(")")
                out.appendLine()
            }

            if (view.isNotEmpty()) {
                out.appendLine("public val ViewSamples: SampleRegistry = mapOf(")
                view.forEachIndexed { i, e ->
                    val comma = if (i == view.lastIndex) "" else ","
                    val needScreenshot = e.reference.needScreenshot
                    val ref = e.reference.reference
                    out.appendLine(""""${e.key}" to ViewSample($needScreenshot, $ref)$comma""".trimIndent())
                }
                out.appendLine(")")
                out.appendLine()
            }

            if (composable.isNotEmpty()) {
                out.appendLine("public val ComposableSamples: SampleRegistry = mapOf(")
                composable.forEachIndexed { i, e ->
                    val comma = if (i == composable.lastIndex) "" else ","
                    val needScreenshot = e.reference.needScreenshot
                    val ref = e.reference.reference
                    out.appendLine(""""${e.key}" to ComposableSample($needScreenshot, $ref)$comma""".trimMargin())
                }
                out.appendLine(")")
            }
        }
    }

    private data class DocSampleArguments(
        val id: String?,
        val needScreenshot: Boolean,
    )

    private data class Entry(
        val key: String,
        val reference: CallableReference,
    )

    private data class CallableReference(
        val needScreenshot: Boolean,
        val reference: String,
    )

    private enum class ReferenceType {
        Kotlin, View, Composable
    }
}
