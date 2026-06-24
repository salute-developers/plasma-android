package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.State
import com.sdds.plugin.themebuilder.internal.components.base.Stateful
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator.InteractiveState
import com.sdds.plugin.themebuilder.internal.utils.capitalized

internal abstract class PropertyMapper<
    ValueType,
    Meta : PropertyMeta,
    StateType : State<ValueType>,
    StatefulType : Stateful<ValueType, StateType>,
    >(
    protected val stateEnum: StateEnum?,
) {

    private val customStateValues: Map<String, String> = stateEnum
        ?.values
        ?.associate { value ->
            value.configName.lowercase() to "${stateEnum.simpleName}.${value.name}"
        }
        ?: emptyMap()

    open fun map(meta: Meta, tokenValue: StatefulType, variationId: String): String {
        val stateFragment = tokenValue.asStatefulFragment(
            meta = meta,
            variationId = variationId,
        )
        val tokenRef = getTokenRef(
            value = tokenValue.value,
            token = tokenValue,
            meta = meta,
            resSuffix = variationId,
        )
        return "${meta.methodName}($tokenRef$stateFragment)"
    }

    abstract fun getTokenRef(
        value: ValueType,
        token: StatefulType,
        meta: Meta,
        resSuffix: String = "",
    ): String

    protected fun StatefulType.asStatefulFragment(meta: Meta, variationId: String = ""): String =
        if (states.isNullOrEmpty()) {
            ""
        } else {
            ".asStatefulValue(${getAsInteractiveParameters(meta, variationId)})"
        }

    protected open fun getStateTokenRef(
        value: ValueType,
        state: StateType,
        token: StatefulType,
        meta: Meta,
        resSuffix: String,
    ): String {
        return getTokenRef(
            value = value,
            token = token,
            meta = meta,
            resSuffix = resSuffix,
        )
    }

    protected fun String.toCamelCase(): String {
        val segments = split(".", "-", "_")
        val result = StringBuilder()
        for (i in segments.indices) {
            val seg = segments[i]
            val prev = segments.getOrNull(i - 1)
            if (seg.all { it.isDigit() } && prev != null && prev.all { it.isDigit() }) {
                result.append("x")
                result.append(seg)
            } else {
                result.append(seg.capitalized())
            }
        }
        return result.toString()
    }

    private fun StatefulType.getAsInteractiveParameters(
        meta: Meta,
        variationId: String,
    ): String {
        return states
            ?.mapIndexed { index, state ->
                state.getStateParameter(
                    meta = meta,
                    suffix = buildResSuffix(
                        variationId = variationId,
                        states = state.state,
                        stateIndex = index,
                    ),
                    token = this,
                )
            }
            ?.joinToString(separator = ", ")
            .orEmpty()
    }

    protected open fun buildResSuffix(
        variationId: String,
        states: List<String>,
        stateIndex: Int,
    ): String {
        return buildList {
            if (variationId.isNotBlank()) add(variationId)
            addAll(states)
        }.joinToString(separator = "_")
    }

    private fun StateType.getStateParameter(
        meta: Meta,
        suffix: String,
        token: StatefulType,
    ): String {
        val tokenRef = getStateTokenRef(
            meta = meta,
            value = value,
            state = this,
            token = token,
            resSuffix = suffix,
        )

        return "setOf(${state.toStateEnums()}) to $tokenRef"
    }

    protected fun List<String>.toStateEnums(): String {
        return mapNotNull { state ->
            customStateValues[state.lowercase()] ?: interactiveStateValues[state]
        }.joinToString()
    }

    private companion object {
        val interactiveStateValues = InteractiveState.values()
            .associate { state -> state.key to "InteractiveState.${state.name}" }
    }
}
