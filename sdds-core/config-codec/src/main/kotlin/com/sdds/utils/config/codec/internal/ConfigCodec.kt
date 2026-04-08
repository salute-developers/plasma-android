package com.sdds.utils.config.codec.internal

internal object ConfigCodec {

    fun encode(config: CommonConfig): NativeConfig {
        val nativeConfig = NativeConfig(props = config.invariants)

        val viewVariationId = config.colorSchemeVariationId
        val viewVariation = config.variations.findLast { it.id == viewVariationId }
        val rootsViews = viewVariation?.values
            ?.filter { it.targets == null }
            ?.associate { it.name to NativeViewVariation(it.props) }
            .orEmpty()

        val targetRegistry = config.variations.flatMap { prop ->
            prop.values.map { value ->
                TargetInfo(prop.id, value.name)
            }
        }.groupBy { it.id }

        val targetViewRegistry = viewVariation?.values
            ?.filter { it.targets != null }
            ?.flatMap { viewValue ->
                viewValue.targets!!.map { target -> viewValue.copy(targets = setOf(target)) }
            }
            ?.groupBy { it.targets!!.first() }
            ?.mapValues { entry ->
                entry.value.associate { viewValue -> viewValue.name to NativeViewVariation(viewValue.props) }
            }
            ?.mapKeys { entry ->
                entry.key.properties.joinToString(".") { it.value }
            }
            .orEmpty()
            .also { println("target views $it") }

        val variations = config.variations
            .filter { it.id != viewVariationId }
            .flatMap { property ->
                property.values
                    .flatMap { value ->
                        value.toNativeVariation(
                            property.id,
                            config.rootVariationId,
                            targetRegistry,
                            targetViewRegistry
                        )
                    }
            }.filter { it.props != null }


        return nativeConfig.copy(view = rootsViews, variations = variations)
    }

    fun decode(config: NativeConfig): CommonConfig {
        val variationRegistry = config.variations.associateBy { it.id }

        val viewPropertyValues = config.view.map { (name, view) ->
            VariationValue(
                name = name,
                props = view.props,
                targets = null
            )
        }

        val targetViews = config.variations
            .flatMap { variation ->
                variation.view.map { (name, view) ->
                    var targetId = ""
                    val targets = variation.id.split(".")
                        .map { id ->
                            TargetInfo(
                                id = variationRegistry["$targetId$id"]?.kind.orEmpty(),
                                value = id
                            ).also {
                                targetId = "$targetId$id."
                            }
                        }
                        .toSet()
                        .let { VariationValueTarget(it) }
                    VariationValue(
                        name = name,
                        props = view.props,
                        targets = setOf(targets)
                    )
                }
            }

        val viewValues = (viewPropertyValues + targetViews).toSet()
        val viewProperty = Variation(
            id = NATIVE_VIEW_VARIATION_NAME,
            name = NATIVE_VIEW_VARIATION_NAME,
            values = viewValues
        )
            .takeIf { viewValues.isNotEmpty() }
            .let { listOfNotNull(it) }
            .mergeConfigProperty()

        val variationPropertyValues = config.variations.map { variation ->
            var targetId = ""
            val targets = variation.id.split(".")
                .dropLast(1)
                .takeIf { it.isNotEmpty() }
                ?.map { id ->
                    TargetInfo(
                        id = variationRegistry["$targetId$id"]?.kind.orEmpty(),
                        value = id
                    ).also { targetId = "$targetId$id." }
                }
                ?.toSet()
                ?.let { setOf(VariationValueTarget(it)) }

            val value = VariationValue(
                name = variation.id.removePrefix("${variation.parent}."),
                props = variation.props,
                targets = targets
            )
            Variation(
                id = variation.kind,
                name = variation.kind,
                values = setOf(value)
            )
        }.mergeConfigProperty()

        return CommonConfig(
            invariants = config.props,
            variations = viewProperty + variationPropertyValues,
            rootVariationId = NATIVE_SIZE_VARIATION_NAME,
            colorSchemeVariationId = NATIVE_VIEW_VARIATION_NAME,
        )
    }
    private const val NATIVE_VIEW_VARIATION_NAME = "view"
    private const val NATIVE_SIZE_VARIATION_NAME = "size"
}

private fun VariationValue.toNativeVariation(
    propertyId: String,
    rootPropertyId: String,
    targetRegistry: Map<String, List<TargetInfo>>,
    targetViewRegistry: Map<String, Map<String, NativeViewVariation>> = emptyMap(),
): List<NativeVariation> {

    if (targets != null) {
        return targets.map { target ->
            val parent = target.properties.joinToString(".") { it.value }
            val id = "$parent.$name"
            NativeVariation(
                id = id,
                kind = propertyId,
                parent = parent,
                props = props,
                view = targetViewRegistry[id].orEmpty()
            )
        }
    }
    return targetRegistry[rootPropertyId]
        ?.takeIf { rootPropertyId != propertyId }
        ?.map { info ->
            val parent = info.value
            val id = "$parent.$name"
            NativeVariation(
                id = id,
                kind = propertyId,
                parent = parent,
                props = props,
                view = targetViewRegistry[id].orEmpty()
            )
        }
        ?: listOf(
            NativeVariation(
                id = name,
                kind = propertyId,
                props = props,
                view = targetViewRegistry[name].orEmpty()
            )
        )
}

private fun List<Variation>.mergeConfigProperty(): List<Variation> {
    return groupBy { it.id }.map { (id, group) ->
        val name = group.first().name

        val mergedValues = group.flatMap { it.values }
            .groupBy { it.name to it.props }
            .map { (key, valuesGroup) ->
                val mergedTargets = valuesGroup
                    .mapNotNull { it.targets }
                    .flatten()
                    .toSet()
                    .takeIf { it.isNotEmpty() }

                VariationValue(
                    name = key.first,
                    props = key.second,
                    targets = mergedTargets
                )
            }.toSet()

        Variation(
            id = id,
            name = name,
            values = mergedValues
        )
    }
}