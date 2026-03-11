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

/**
 * Провайдер процессора символов для KSP (Kotlin Symbol Processing), создающий [SandboxProcessor].
 *
 * Реализует интерфейс [SymbolProcessorProvider] для интеграции с KSP и обеспечения
 * возможности обработки аннотаций в проекте Sandbox. Отвечает за создание экземпляра
 * процессора с необходимым окружением.
 *
 * @see SymbolProcessorProvider
 * @see SandboxProcessor
 */
class SandboxProcessorProvider : SymbolProcessorProvider {
    /**
     * Создает экземпляр [SandboxProcessor] с предоставленным окружением.
     *
     * @param environment окружение процессора символов, содержащее необходимые
     *                   компоненты для генерации кода и логирования
     * @return новый экземпляр [SandboxProcessor]
     */
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor =
        SandboxProcessor(environment.codeGenerator, environment.logger, environment.options)
}

/**
 * Процессор символов для генерации кода историй компонентов в Sandbox.
 *
 * Обрабатывает аннотации, связанные с историями компонентов и их состояниями,
 * генерируя необходимый вспомогательный код для интеграции со сторибуком.
 * Процессор делегирует обработку специализированным подпроцессорам:
 * - [SandboxStoryStateProcessor] для обработки состояний ([StoryUiState])
 * - [SandboxStoryProcessor] для обработки самих историй ([Story])
 *
 * @param codeGenerator генератор кода для создания новых файлов
 * @param logger логгер для вывода информации о процессе обработки
 * @param options карта опций, переданных в KSP (ожидается опция "packageName")
 *
 * @see SymbolProcessor
 * @see SandboxStoryStateProcessor
 * @see SandboxStoryProcessor
 * @see StoryUiState
 * @see Story
 */
class SandboxProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger,
    options: Map<String, String>,
) : SymbolProcessor {

    /**
     * Имя пакета, в котором будут генерироваться классы.
     * По умолчанию "com.sdds.sandbox", может быть переопределено через опцию "packageName".
     */
    private val packageName: String = options["packageName"] ?: "com.sdds.sandbox"

    /**
     * Процессор для обработки классов, помеченных аннотацией [StoryUiState].
     * Генерирует провайдеры свойств и трансформеры для состояний.
     */
    private val stateProcessor = SandboxStoryStateProcessor(
        codeGenerator = codeGenerator,
        packageName = packageName,
    )

    /**
     * Процессор для обработки объектов/классов, помеченных аннотацией [Story].
     * Генерирует фабрики и регистрационный код для историй.
     */
    private val storyProcessor = SandboxStoryProcessor(
        codeGenerator = codeGenerator,
        packageName = packageName,
        logger = logger,
    )

    /**
     * Основной метод обработки символов, вызываемый KSP.
     *
     * Последовательно обрабатывает:
     * 1. Состояния историй ([StoryUiState]) через [stateProcessor]
     * 2. Сами истории ([Story]) через [storyProcessor]
     *
     * @param resolver резолвер для доступа к обрабатываемым символам
     * @return список неподдерживаемых аннотированных символов (пустой, если все обработаны)
     */
    override fun process(resolver: Resolver): List<KSAnnotated> {
        return stateProcessor.process(resolver) + storyProcessor.process(resolver)
    }
}
