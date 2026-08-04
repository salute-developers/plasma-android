package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.universal.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.universal.Dimension
import com.sdds.plugin.themebuilder.internal.universal.PropertyType
import com.sdds.plugin.themebuilder.internal.universal.Value
import com.sdds.plugin.themebuilder.internal.universal.VariationNode
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalComponentConfig
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.ViewPropertyMapper
import com.sdds.plugin.themebuilder.internal.universal.view.mappers.ViewPropertyMapperRegistry
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Универсальный генератор View-стилей: единственный генератор, управляемый метой.
 *
 * Как и Compose-генератор, напрямую реализует [ComponentStyleGenerator] и использует
 * композицию: [ViewVariationTreeProcessor] обходит дерево, [ViewPropertyResolver]
 * разрешает наследование, [ViewPropertyMapper] проецирует свойства, а
 * [ViewStyleResourceWriter] записывает стили, `ColorState`, dimen и state-list.
 *
 * @param meta склеенное описание компонента (свойства, привязки состояний, идентичность)
 * @param sharedStates общий словарь состояний модуля (`sd_state_*`)
 * @param styleNames вид компонента в конфиге → имя генерируемого стиля; нужен, чтобы
 *  ссылка на стиль другого компонента указывала на существующий стиль
 */
internal class UniversalViewVariationGenerator(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String,
    private val styleComponentName: String,
    colorStateComponentName: String = coreComponentName,
    componentParent: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String,
    private val meta: MergedComponentMeta,
    sharedStates: Map<String, String>,
    styleNames: Map<String, String> = emptyMap(),
) : ComponentStyleGenerator<UniversalComponentConfig> {

    private val resources = ViewStyleResourceWriter(
        xmlBuilderFactory = xmlBuilderFactory,
        resourceReferenceProvider = resourceReferenceProvider,
        dimensAggregator = dimensAggregator,
        outputResDir = outputResDir,
        resourcePrefix = resourcePrefix,
        coreComponentName = coreComponentName,
        styleComponentName = styleComponentName,
        colorStateComponentName = colorStateComponentName,
        componentParent = componentParent,
        viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
        colorStateListGeneratorFactory = colorStateListGeneratorFactory,
        defStyleAttr = defStyleAttr,
    )
    private val treeProcessor = ViewVariationTreeProcessor(resources)
    private val propertyResolver = ViewPropertyResolver()
    private val stateResolver = ViewStateResolver(meta.componentName, sharedStates, meta.stateSets)
    private val propertyMappers = ViewPropertyMapperRegistry(
        params = meta.params + meta.subStyles.flatMap { it.params },
        resources = resources,
        resolver = propertyResolver,
        stateResolver = stateResolver,
        componentName = meta.componentName,
        styleNames = styleNames,
    )

    override fun generate(config: UniversalComponentConfig): ComponentStyleGenerator.Result.Xml {
        treeProcessor.process(
            config,
            ViewVariationTreeProcessor.Emitters(
                style = ::createStyle,
                colorStateStyle = ::createColorStateStyle,
                overlay = ::createOverlayStyle,
            ),
        )
        return resources.finish()
    }

    /**
     * Стиль вариации: эмитятся все свойства компонента.
     */
    private fun createStyle(
        variation: String,
        styleElement: Element,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ) = with(styleElement) {
        meta.params
            .filter { it.placement == PLACEMENT_STYLE }
            .forEach { emit(it, variation, variationNode) }
        meta.subStyles.forEach { subStyle(it, variation, resources.document, variationNode) }
        themeReference(variationNode)
    }

    // region вложенные семьи стилей

    /**
     * Вложенная семья стилей: стиль вариации в собственной семье плюс ссылки на него.
     *
     * `kind == style` — генерируется полноценный стиль (`Components.CardSolidContent.L`),
     * ссылка на него публикуется в overlay владельца, а если стиль непуст — ещё и его
     * собственный overlay плюс `android:theme` в стиле вариации.
     * `kind == overlay` — генерируется только overlay-стиль (`ComponentOverlays.TextFieldXsChips`),
     * ссылка на него идёт прямо в стиль вариации.
     */
    private fun Element.subStyle(
        sub: SubStyleMeta,
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ) {
        val overlayName = sub.overlayName(variationNode)
        // Значения, унаследованные от родительской вариации, уже эмитированы там же,
        // поэтому вложенная семья наполняется только собственными props вариации.
        val filled = sub.params.any { variationNode.value.props.hasValue(it) }
        if (sub.info.kind == SUB_STYLE_KIND_STYLE) {
            val isBase = variationNode.camelCaseName().isEmpty()
            // Стиль семьи создаётся всегда: он — точка наследования для дочерних вариаций.
            resources.appendStyle(
                root = rootDocument,
                name = subStyleName(sub, variationNode),
                parent = sub.info.parent.takeIf { isBase && it.isNotBlank() },
            ) {
                emitSubParams(sub, variation, variationNode)
            }
            if (!filled) return
            resources.appendOverlayStyle(rootDocument, overlayName) {
                resources.appendComponentStyle(
                    this,
                    sub.info.styleRef,
                    "$styleComponentName${subStyleName(sub, variationNode)}",
                )
            }
            themeReference(sub.params, overlayName)
        } else if (filled) {
            resources.appendOverlayStyle(rootDocument, overlayName) {
                emitSubParams(sub, variation, variationNode)
            }
            resources.appendComponentOverlay(this, sub.info.styleRef, "$styleComponentName$overlayName")
        }
    }

    /**
     * Имя overlay-стиля вложенной семьи.
     *
     * У семьи вида `style` суффикс — часть имени компонента, поэтому идёт перед
     * вариацией (`CardSolidContent` + `L`). У семьи вида `overlay` он уточняет саму
     * вариацию и идёт после неё (`TextField` + `Xs` + `Chips`).
     */
    private fun SubStyleMeta.overlayName(variationNode: VariationNode<UniversalPropertyOwner>): String {
        val variationName = variationNode.camelCaseName("")
        return if (info.kind == SUB_STYLE_KIND_STYLE) "${info.name}$variationName" else "$variationName${info.name}"
    }

    /** Имя стиля вложенной семьи: `Content` для базовой вариации, `Content.L` — для дочерней. */
    private fun subStyleName(sub: SubStyleMeta, variationNode: VariationNode<UniversalPropertyOwner>): String {
        val variationName = variationNode.camelCaseName()
        return if (variationName.isEmpty()) sub.info.name else "${sub.info.name}.$variationName"
    }

    /** Эмитит свойства вложенной семьи в её стиль. */
    private fun Element.emitSubParams(
        sub: SubStyleMeta,
        variation: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ) {
        sub.params
            .filter { it.placement == PLACEMENT_STYLE }
            .forEach { emit(it, variation, variationNode) }
    }

    /**
     * Ссылка на собственный ThemeOverlay вариации (`android:theme`): публикуется, только
     * если в overlay есть что-то помимо стандартной ссылки на стиль вариации.
     */
    private fun Element.themeReference(variationNode: VariationNode<UniversalPropertyOwner>) {
        val overlayFilled = meta.params
            .filter { it.placement == PLACEMENT_OVERLAY }
            .any { variationNode.value.props.hasValue(it) }
        if (!overlayFilled) return
        themeReference(meta.params, variationNode.camelCaseName(""))
    }

    /** Ссылка на указанный overlay-стиль в атрибуте, размеченном `api_placement="theme"`. */
    private fun Element.themeReference(params: List<PropertyMeta>, overlayName: String) {
        params.filter { it.placement == PLACEMENT_THEME }
            .forEach { resources.appendComponentOverlay(this, it.attrName, "$styleComponentName$overlayName") }
    }

    // endregion

    /**
     * Стиль цветового состояния: эмитятся только те свойства, которые заданы в props
     * **самого состояния**, и только прямым значением.
     *
     * Цветовые свойства пропускаются: цвет состояния выражается элементом state-list,
     * на который ссылается атрибут в стиле вариации, — дублировать его здесь нельзя.
     * Правило воспроизводит поведение обеих групп удаляемых генераторов: у тех, чьи
     * цветовые состояния не несут собственных свойств, стиль остаётся с одним атрибутом
     * `ColorState`; у остальных — получает ровно свои свойства (напр. `Segment` —
     * `sd_segmentItemStyleOverlay` и отступы).
     */
    private fun createColorStateStyle(
        variation: String,
        styleElement: Element,
        props: UniversalPropertyOwner,
    ) = with(styleElement) {
        meta.params
            .filter { it.placement == PLACEMENT_STYLE && it.type != PropertyType.COLOR }
            .forEach { propertyMappers[it].mapDirect(this, variation, props) }
    }

    private fun createOverlayStyle(
        variation: String,
        styleElement: Element,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ) = with(styleElement) {
        meta.params
            .filter { it.placement == PLACEMENT_OVERLAY }
            .forEach { emit(it, variation, variationNode) }
        // Overlay вариации ссылается на вложенную семью: применённый как тема, он должен
        // задавать стиль вложенного вида так же, как это делает сама вариация.
        meta.subStyles
            .filter { it.info.kind == SUB_STYLE_KIND_STYLE }
            .forEach {
                resources.appendComponentStyle(
                    this,
                    it.info.styleRef,
                    "$styleComponentName${subStyleName(it, variationNode)}",
                )
            }
    }

    private fun Element.emit(
        param: PropertyMeta,
        variation: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ) {
        if (param.placement == PLACEMENT_THEME) return
        if (!param.conditionHolds(variationNode)) return
        if (param.valueExpr.isNotEmpty()) {
            expressionValue(param, variationNode)?.let { resources.appendValue(this, param.attrName, it) }
            return
        }
        propertyMappers[param].map(this, param.resVariation(variation), variationNode)
    }

    /**
     * Имя вариации для генерируемых ресурсов с учётом `api_res_prefix`: свойства
     * вложенной семьи кладут ресурсы в собственное пространство имён
     * (`serv_card_solid_l_content_min_width`).
     */
    private fun PropertyMeta.resVariation(variation: String): String = when {
        resPrefix.isEmpty() -> variation
        variation.isEmpty() -> resPrefix
        else -> "${variation}_$resPrefix"
    }

    /**
     * Условие `api_when`: свойство печатается, только если ключ конфига равен значению.
     *
     * Условие проверяется в той же области, что и значение свойства. Свойство со
     * значением из конфига эмитится там, где это значение задано, поэтому ключ условия
     * ищется по всему дереву вариаций. Литерал из `api_value` собственного значения не
     * имеет, и без ограничения областью он размножился бы по всем вариациям, — для него
     * ключ условия ищется только в props самой вариации.
     */
    private fun PropertyMeta.conditionHolds(variationNode: VariationNode<UniversalPropertyOwner>): Boolean {
        if (condition.isEmpty()) return true
        val (key, expected) = condition.split("=", limit = 2)
        val actual = if (valueExpr.isNotEmpty() && !RATIO_FORM.matches(valueExpr)) {
            (variationNode.value.props.getValue(PropertyType.VALUE, key) as? Value)?.value
        } else {
            propertyResolver.getProperty(variationNode) { owner ->
                owner.getValue(PropertyType.VALUE, key) as? Value
            }?.value?.value
        }
        return actual == expected
    }

    /**
     * Значение из `api_value`: литерал либо `ratio(<ключ>,<ключ>)` — частное двух
     * числовых значений конфига (`sd_aspectRatio` картинки).
     */
    private fun expressionValue(
        param: PropertyMeta,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ): String? {
        val ratio = RATIO_FORM.matchEntire(param.valueExpr) ?: return param.valueExpr
        val (first, second) = ratio.groupValues[1].split(",").map { it.trim() }
        return ratioValue(first, second, variationNode)
    }

    private fun ratioValue(
        first: String,
        second: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ): String? {
        val numerator = dimensionValue(first, variationNode) ?: return null
        val denominator = dimensionValue(second, variationNode)?.takeIf { it != 0f } ?: return null
        return (numerator / denominator).toString()
    }

    private fun dimensionValue(
        key: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ): Float? = propertyResolver.getProperty(variationNode) { owner ->
        owner.getValue(PropertyType.DIMENSION, key) as? Dimension
    }?.value?.value

    /** Есть ли у свойства значение в этих props — без эмиссии. */
    private fun UniversalPropertyOwner.hasValue(param: PropertyMeta): Boolean =
        getValue(param.type, param.id) != null

    private companion object {
        val RATIO_FORM = Regex("""ratio\(([^)]+)\)""")
    }
}
