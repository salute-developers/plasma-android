package com.sdds.docs

/**
 * Обертка для kotlin кода - примера в документацию
 * @property needScreenshot нужно ли генерировать скриншот для примера
 * @property reference ссылка на функцию примера
 */
class KotlinSample(
    override val needScreenshot: Boolean,
    override val reference: () -> Unit,
) : Sample<() -> Unit>
