package com.sdds.compose.docs

import androidx.compose.runtime.Composable
import com.sdds.docs.Sample
import com.sdds.docs.SampleId
import com.sdds.docs.SampleRegistry

/**
 * Обертка для Composable кода - примера в документацию
 * @property needScreenshot нужно ли генерировать скриншот для примера
 * @property reference ссылка на функцию примера
 */
class ComposableSample(
    override val needScreenshot: Boolean,
    override val reference: @Composable () -> Unit,
) : Sample<@Composable () -> Unit>

/**
 * Функция для прохода по всему списку примеров Composable кода
 */
inline fun SampleRegistry.forEachComposableSample(crossinline block: (SampleId, ComposableSample) -> Unit) {
    this.forEach { (id, sample) ->
        if (sample is ComposableSample) {
            block(id, sample)
        }
    }
}
