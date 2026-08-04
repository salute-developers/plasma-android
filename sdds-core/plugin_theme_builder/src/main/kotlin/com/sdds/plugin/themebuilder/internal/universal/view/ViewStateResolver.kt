package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.universal.view.AndroidState.Companion.asAndroidStates

/**
 * Разрешает имена состояний из токен-конфига в атрибуты элемента state-list.
 *
 * Порядок разрешения — от частного к общему:
 * 1. явная привязка из меты компонента: она перекрывает всё остальное, потому что
 *    описывает именно этот компонент — сюда попадают ремап имени на другой
 *    framework-атрибут и составное состояние (несколько атрибутов на одно имя,
 *    напр. `focused` = `state_focused=true` + `state_activated=false`);
 * 2. shared-состояние по общему словарю модуля (`sd_state_*` из меты);
 * 3. framework-состояние по имени (`focused`, `pressed`, …) — его добавляет базовый
 *    генератор через [asAndroidStates], поэтому резолвер его пропускает;
 * 4. иначе — ошибка генерации.
 *
 * Шаг 4 принципиален: без него нераспознанное имя состояния молча теряется —
 * накопитель state-list дедуплицирует элементы по набору атрибутов, и запись без
 * атрибутов состояния затирается базовой.
 *
 * @param componentName имя компонента (для сообщения об ошибке)
 * @param sharedStates общий словарь состояний модуля: имя → drawable-атрибут
 * @param stateSets наборы привязок компонента
 */
internal class ViewStateResolver(
    private val componentName: String,
    private val sharedStates: Map<String, String>,
    stateSets: List<StateSet>,
) {

    private val bindings: Map<String, List<StateInfo>> = stateSets
        .flatMap { it.states }
        .groupBy { it.configName }

    /**
     * Возвращает дополнительные атрибуты состояния для набора имён [stateNames].
     *
     * Framework-состояния в результат не попадают — их добавляет базовый генератор.
     */
    fun resolve(stateNames: List<String>): Set<StateListAttribute> =
        stateNames.flatMap { resolveSingle(it) }.toSet()

    private fun resolveSingle(stateName: String): List<StateListAttribute> {
        bindings[stateName]?.let { bound -> return bound.map { it.toStateListAttribute() } }
        sharedStates[stateName]?.let { return listOf(StateListAttribute("$APP_PREFIX$it", TRUE)) }
        if (listOf(stateName).asAndroidStates().isNotEmpty()) return emptyList()
        error(
            "Компонент \"$componentName\": состояние \"$stateName\" из конфига не разрешается. " +
                "Это не framework-состояние (${AndroidState.values().joinToString { it.key }}), " +
                "его нет в общем словаре состояний модуля и нет явной привязки в разметке " +
                "(sdds:api_state)",
        )
    }

    private fun StateInfo.toStateListAttribute(): StateListAttribute {
        val name = if (flavor == FLAVOR_ANDROID) drawableAttr else "$APP_PREFIX$drawableAttr"
        return StateListAttribute(name, (!negated).toString())
    }

    private companion object {
        const val APP_PREFIX = "app:"
        const val TRUE = "true"
        const val FLAVOR_ANDROID = "android"
    }
}
