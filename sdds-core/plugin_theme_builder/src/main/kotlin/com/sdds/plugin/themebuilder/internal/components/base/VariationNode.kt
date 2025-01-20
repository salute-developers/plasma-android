package com.sdds.plugin.themebuilder.internal.components.base

/**
 * Узел дерева вариаций.
 * @property id идентификатор вариации
 * @property value значения узла вариации (сама вариация)
 * @author Малышев Александр on 16.12.2024
 */
internal class VariationNode<PO : PropertyOwner>(
    val id: String,
    val value: BaseVariation<PO>,
) {

    private val _children: MutableSet<VariationNode<PO>> = mutableSetOf()

    /**
     * Родительский узел текущего узла вариации
     */
    var parent: VariationNode<PO>? = null
        private set

    /**
     *  Название вариации без учета названия родительской вариации
     */
    val name: String
        get() = parent?.id?.let { id.removePrefix("$it.") } ?: id

    /**
     * Возвращает все [ViewVariation] от родительской до текущей [VariationNode].
     * Например, в иерархии вариаций Node1 -> Node2 при вызове Node2.[mergedViews] вернется
     * [Map] со всеми [ViewVariation] из Node1 и Node2, при этом при возникновении конфликта
     * значения из Node2 заменят значения из Node1.
     */
    fun mergedViews(force: Boolean = false): Map<String, ViewVariation<PO>> {
        if (!force && value.view.isEmpty()) return emptyMap()
        val mergedViews = mutableMapOf<String, ViewVariation<PO>>()
            .apply { putAll(value.view) }
        var parentRef = parent

        while (parentRef != null) {
            val parentViews = parentRef.value.view
            parentViews.forEach {
                mergedViews[it.key] = mergedViews[it.key]?.merge(it.value) ?: it.value
            }
            parentRef = parentRef.parent
        }
        return mergedViews
    }

    /**
     * Возвращает все [PO] от родительской до текущей [VariationNode].
     * Например, в иерархии вариаций Node1 -> Node2 при вызове Node2.[mergedProps] вернется
     * [PO] со всеми значениями из Node1 и Node2, при этом при возникновении конфликта
     * значения из Node2 заменят значения из Node1
     */
    val mergedProps: PO
        get() {
            var parentRef = parent
            var resultProps: PO = this.value.props
            while (parentRef != null) {
                val parentProps = parentRef.value.props
                @Suppress("UNCHECKED_CAST")
                resultProps = resultProps.merge(parentProps) as PO
                parentRef = parentRef.parent
            }
            return resultProps
        }

    /**
     * Дочерние узлы текущего узла вариации
     */
    val children: Set<VariationNode<PO>>
        get() = _children.toSet()

    /**
     * Добавляет дочерний узел вариации к текущему узлу
     */
    fun addChild(child: VariationNode<PO>) {
        child.parent = this
        _children.add(child)
    }
}

/**
 * Преобразует конфиг в дерево вариаций.
 */
internal fun <PO : PropertyOwner> Config<PO>.asVariationTree(rootId: String): VariationNode<PO> {
    val variationsNodeMap = variations.associate { it.id to VariationNode(it.id, it) }
    val root = VariationNode(rootId, this)
    variations.forEach { variation ->
        val child = variationsNodeMap[variation.id]
        child?.let {
            if (variation.parent == null) {
                root.addChild(child)
            } else {
                variationsNodeMap[variation.parent]?.addChild(child)
            }
        }
    }
    return root
}
