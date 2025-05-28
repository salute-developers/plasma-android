package com.sdds.uikit.overlays

/**
 * Интерфейс для управления оверлеями в приложении.
 * Позволяет показывать, удалять и очищать элементы оверлея.
 */
interface OverlayManager {

    /**
     * Показывает элемент оверлея.
     *
     * @param overlayEntry Элемент, который необходимо отобразить.
     */
    fun show(overlayEntry: OverlayEntry)

    /**
     * Удаляет элемент оверлея по его идентификатору.
     *
     * @param id Идентификатор элемента, который необходимо удалить.
     */
    fun remove(id: Long)

    /**
     * Удаляет все элементы оверлея.
     */
    fun clear()

    companion object {
        /**
         * Стандартная (медленная) длительность отображения оверлея в миллисекундах.
         */
        const val OVERLAY_DURATION_SLOW_MILLIS = 3000L

        /**
         * Быстрая длительность отображения оверлея в миллисекундах.
         */
        const val OVERLAY_DURATION_FAST_MILLIS = 1000L
    }
}
