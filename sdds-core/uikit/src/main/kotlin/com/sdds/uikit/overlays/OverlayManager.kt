package com.sdds.uikit.overlays

import android.view.View
import androidx.lifecycle.LifecycleObserver

/**
 * Интерфейс для управления оверлеями в приложении.
 * Позволяет показывать, удалять и очищать элементы оверлея.
 */
interface OverlayManager : LifecycleObserver {

    /**
     * Привязывает OverlayManager к корневому View.
     *
     * @param rootView Корневой View, в котором будут отображаться оверлеи.
     */
    fun bind(rootView: View)

    /**
     * Отвязывает OverlayManager и очищает ресурсы.
     */
    fun unbind()

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
