package com.sdds.preview.compose.plugin

import com.sdds.preview.contract.PreviewResult

/**
 * Откладывает успешный результат до тех пор, пока новое содержимое не нарисовано.
 *
 * Состояние рендера применяется сразу, а композиция и layout выполняются в следующих кадрах. Исключение
 * в них останавливает Compose, но хост уже получил бы `success`. Поэтому результат уходит хосту только после
 * [confirm], а если кадр не состоялся, хост не получит результата и сам завершит запрос по таймауту.
 */
internal class PendingRenderResults(
    private val deliver: (PreviewResult) -> Unit,
) {
    private var pending: PreviewResult.Success? = null

    /** Запоминает успешный результат до подтверждения отрисовки; предыдущий неподтверждённый вытесняется. */
    fun await(result: PreviewResult.Success) {
        pending?.let { previous ->
            deliver(
                PreviewResult.Failure(
                    requestId = previous.requestId,
                    code = "superseded",
                    message = "Preview request superseded by a newer payload",
                ),
            )
        }
        pending = result
    }

    /** Отдаёт отложенный результат запроса [requestId], если он всё ещё ожидается. */
    fun confirm(requestId: String) {
        val result = pending?.takeIf { it.requestId == requestId } ?: return
        pending = null
        deliver(result)
    }
}
