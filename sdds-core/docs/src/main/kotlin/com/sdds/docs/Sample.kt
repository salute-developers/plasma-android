package com.sdds.docs

/**
 * Обертка для кода - примера в документацию
 */
interface Sample<T : Any> {

    /**
     * Нужно ли генерировать скриншот для примера
     */
    val needScreenshot: Boolean

    /**
     * Cсылка на функцию примера
     */
    val reference: T
}
