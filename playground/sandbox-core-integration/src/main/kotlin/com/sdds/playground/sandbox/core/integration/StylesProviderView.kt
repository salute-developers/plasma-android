package com.sdds.playground.sandbox.core.integration

/**
 * Провайдер стилей для компонентов.
 * Интерфейс расширяется при разработке новых компонентов
 */
@Suppress("UndocumentedPublicProperty")
interface StylesProviderView {
    val textField: ViewStyleProvider<String>
    val textArea: ViewStyleProvider<String>

    val basicButton: ViewStyleProvider<String>
    val iconButton: ViewStyleProvider<String>
    val linkButton: ViewStyleProvider<String>

    val chip: ViewStyleProvider<String>
    val chipGroup: ViewStyleProvider<String>

    val checkBox: ViewStyleProvider<String>
    val checkBoxGroup: ViewStyleProvider<String>

    val radioBox: ViewStyleProvider<String>
    val radioBoxGroup: ViewStyleProvider<String>

    val avatar: ViewStyleProvider<String>
    val avatarGroup: ViewStyleProvider<String>

    val switch: ViewStyleProvider<String>

    val progress: ViewStyleProvider<String>

    val badge: ViewStyleProvider<String>

    val iconBadge: ViewStyleProvider<String>

    val cell: ViewStyleProvider<String>

    val counter: ViewStyleProvider<String>

    val segmentItem: ViewStyleProvider<String>
    val segment: ViewStyleProvider<String>

    val indicator: ViewStyleProvider<String>
}
