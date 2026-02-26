package com.sdds.sandbox.ksp

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated
import com.sdds.sandbox.ksp.internal.SandboxStoryProcessor
import com.sdds.sandbox.ksp.internal.SandboxStoryStateProcessor

class SandboxProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor =
        SandboxProcessor(environment.codeGenerator, environment.logger, environment.options)
}

class SandboxProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger,
    options: Map<String, String>,
) : SymbolProcessor {

    private val packageName: String = options["packageName"] ?: "com.sdds.sandbox"

    private val stateProcessor = SandboxStoryStateProcessor(
        codeGenerator = codeGenerator,
        packageName = packageName,
    )

    private val storyProcessor = SandboxStoryProcessor(
        codeGenerator = codeGenerator,
        packageName = packageName,
        logger = logger,
    )

    override fun process(resolver: Resolver): List<KSAnnotated> {
        return stateProcessor.process(resolver) + storyProcessor.process(resolver)

    }

}