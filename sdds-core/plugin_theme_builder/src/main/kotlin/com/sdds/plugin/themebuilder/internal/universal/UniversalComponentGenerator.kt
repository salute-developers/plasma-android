package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeComponentMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalComponentConfig
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.universal.compose.mappers.PropertyMapperRegistry
import com.sdds.plugin.themebuilder.internal.universal.view.COLOR_STATE_SCOPE_VARIETY
import com.sdds.plugin.themebuilder.internal.universal.view.UniversalViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.universal.view.ViewMetaIndex
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import org.gradle.api.logging.Logging
import java.io.File

/**
 * Создаёт генератор стилей компонентов темы.
 */
internal fun universalComponentGenerator(
    allMeta: List<ComposeComponentMeta>,
    viewIndex: ViewMetaIndex,
    allComponents: List<Component>,
): UniversalComponentGenerator = UniversalComponentGenerator(allMeta, viewIndex, allComponents)

/**
 * Генерация стилей компонентов темы по мете uikit.
 *
 * Обе цели описываются метой и не требуют покомпонентного кода: Compose — метой
 * `api-info-ksp` ([ComposeComponentMeta]), View — разметкой `declare-styleable`
 * ([ViewMetaIndex]). Поэтому реестра компонентов нет: компонент конфига сводится с
 * метой по имени, а отсутствие меты для цели означает, что цель не генерируется.
 *
 * @param allMeta compose-мета всех компонентов uikit
 * @param viewIndex индекс View-меты
 * @param allComponents все компоненты темы (нужны для разрешения пакетов и ссылок
 *  между компонентами)
 */
internal class UniversalComponentGenerator(
    private val allMeta: List<ComposeComponentMeta>,
    private val viewIndex: ViewMetaIndex,
    private val allComponents: List<Component>,
) {

    private val composeMetaByName: Map<String, ComposeComponentMeta> =
        allMeta.associateBy { it.componentName }

    private val configs = mutableMapOf<String, UniversalComponentConfig>()

    /**
     * Вид компонента в конфиге → имя генерируемого стиля. По нему ссылки между
     * компонентами (`sd_*StyleOverlay`) указывают на существующий стиль.
     */
    private val styleNames: Map<String, String> by lazy {
        allComponents.associate { component ->
            val identity = viewIndex.forComponent(metaName(component))?.identity
            component.styleName to (
                identity?.styleName?.takeIf { it.isNotBlank() } ?: component.styleName.techToCamelCase()
                )
        }
    }

    private val packageLookup: Map<String, String> by lazy {
        buildMap {
            // Записи по имени компонента из KSP: packageName авторитетен, если не пуст.
            allMeta.forEach { meta ->
                put(meta.componentName.lowercase(), meta.packageName.ifBlank { meta.componentName.lowercase() })
            }
            val kspPackageByComponentName = allMeta.associate { it.componentName.lowercase() to it.packageName }
            allComponents.forEach { component ->
                val kspPackage = kspPackageByComponentName[component.componentName.lowercase()]
                val resolvedPackage = if (!kspPackage.isNullOrBlank()) kspPackage else component.packageName
                put(component.styleName.replace("-", "").lowercase(), resolvedPackage)
            }
        }
    }

    /**
     * Генерирует Compose-стили компонента либо возвращает `null`, если компонент
     * исключён для Compose или не имеет compose-меты.
     */
    fun generateCompose(
        configFile: File,
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentInfo? {
        if (component.isExcludedForCompose) return null
        val generator = composeGenerator(deps, component) ?: return null
        val result = generator.generate(config(configFile)) as ComponentStyleGenerator.Result.Compose
        return ComponentInfo(
            key = component.componentName,
            appearance = component.styleName,
            coreName = component.componentName.techToCamelCase(),
            styleName = result.styleName,
            props = result.props,
            styleClassName = result.styleClassName,
            styleBuilderClassName = result.styleBuilderClassName,
            componentPackage = result.componentPackage,
            variations = result.variations.map {
                VariationInfo(
                    name = it.key,
                    composeReference = it.value,
                    props = result.variationProps[it.key].orEmpty(),
                )
            },
        )
    }

    /**
     * Генерирует View-стили компонента либо возвращает `null`, если компонент
     * исключён для View или не имеет View-меты.
     */
    fun generateView(
        configFile: File,
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentInfo? {
        if (component.isExcludedForViewSystem) return null
        val generator = viewGenerator(deps, component) ?: return null
        val result = generator.generate(config(configFile)) as ComponentStyleGenerator.Result.Xml
        return ComponentInfo(
            key = component.componentName,
            appearance = component.styleName,
            coreName = result.coreName,
            styleName = result.styleName,
            variations = result.variations.map {
                VariationInfo(
                    name = it.key,
                    viewReference = it.value,
                    viewOverlayReference = result.overlays[it.key],
                )
            },
        )
    }

    /**
     * Конфиг вида компонента разбирается один раз: файл читают обе цели генерации.
     */
    private fun config(file: File): UniversalComponentConfig =
        configs.getOrPut(file.absolutePath) { file.decode(Serializer.componentConfig) }

    private fun composeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<UniversalComponentConfig>? {
        val meta = composeMetaByName[metaName(component)] ?: return warnNoMeta(component)
        val componentName = component.styleName.techToSnakeCase()
        val registry = PropertyMapperRegistry(
            componentMeta = meta,
            themeClassName = deps.themeClassName,
            componentName = componentName,
            componentXmlPrefix = componentName,
            dimensAggregator = deps.dimensAggregator,
            dimensionsConfig = deps.dimensionsConfig,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            themeStylesPackage = deps.packageResolver.getPackage(TargetPackage.STYLES),
            packageLookup = packageLookup,
            multiplatform = deps.multiplatform,
        )
        return UniversalComposeVariationGenerator(
            componentMeta = meta,
            mapperRegistry = registry,
            themeClassName = deps.themeClassName,
            themePackage = deps.packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = deps.dimensionsConfig,
            namespace = deps.namespace,
            ktFileBuilderFactory = deps.ktFileBuilderFactory,
            componentPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.${
                meta.packageName.ifBlank { component.packageName }
            }",
            outputLocation = KtFileBuilder.OutputLocation.Directory(deps.outputDir),
            componentName = componentName,
            styleBuilderName = meta.qualifiedName.substringAfterLast("."),
            styleBuilderFactoryFunName = meta.builderFunName.ifBlank { "builder" },
            componentStylePackage = meta.qualifiedName.substringBeforeLast("."),
            multiplatform = deps.multiplatform,
        )
    }

    private fun viewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<UniversalComponentConfig>? {
        val meta = viewIndex.forComponent(metaName(component)) ?: return warnNoMeta(component)
        // Обычно имя стиля задаёт вид компонента; разметка переопределяет его там, где
        // стиль исторически называется иначе (напр. Overlay → Components.OverlayView).
        val styleName = meta.identity.styleName.ifBlank { component.styleName.techToCamelCase() }
        // Палитра ColorState принадлежит либо классу uikit (одна сущность на все виды
        // компонента), либо виду — тогда сущность своя у каждого вида.
        val colorStateName = if (meta.identity.colorStateScope == COLOR_STATE_SCOPE_VARIETY) {
            component.styleName.techToCamelCase()
        } else {
            meta.identity.coreName
        }
        return UniversalViewVariationGenerator(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
            coreComponentName = meta.identity.coreName,
            styleComponentName = styleName,
            colorStateComponentName = colorStateName,
            componentParent = meta.identity.parent,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
            defStyleAttr = meta.identity.defStyleAttr,
            meta = meta,
            sharedStates = viewIndex.sharedStates,
            styleNames = styleNames,
        )
    }

    private fun <T> warnNoMeta(component: Component): T? {
        logger.info("[${component.componentName}] нет меты, вид ${component.styleName} пропускается")
        return null
    }

    /**
     * Имя компонента в мете. Ключ компонента в конфиге и имя в мете различаются лишь
     * регистром и дефисами, кроме единственного исторического расхождения
     * `bottom-sheet` → `ModalBottomSheet`.
     */
    private fun metaName(component: Component): String =
        META_NAME_ALIASES[component.componentName] ?: component.componentName.techToCamelCase()

    private companion object {
        val logger = Logging.getLogger(UniversalComponentGenerator::class.java)

        val META_NAME_ALIASES = mapOf("bottom-sheet" to "ModalBottomSheet")
    }
}
