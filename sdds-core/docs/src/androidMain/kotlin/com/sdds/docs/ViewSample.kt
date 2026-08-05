package com.sdds.docs

import android.content.Context
import android.view.View

/**
 * Обертка для View кода - примера в документацию
 * @property needScreenshot нужно ли генерировать скриншот для примера
 * @property reference ссылка на функцию примера
 */
class ViewSample(
    override val needScreenshot: Boolean,
    override val reference: (Context) -> View,
) : Sample<(Context) -> View>

/**
 * Функция для прохода по всему списку примеров View кода
 */
inline fun SampleRegistry.forEachViewSample(crossinline block: (SampleId, ViewSample) -> Unit) {
    this.forEach { (id, sample) ->
        if (sample is ViewSample) {
            block(id, sample)
        }
    }
}
