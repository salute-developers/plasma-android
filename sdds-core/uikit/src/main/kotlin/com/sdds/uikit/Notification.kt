package com.sdds.uikit

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.View
import androidx.annotation.StyleRes
import com.sdds.uikit.Notification.Companion.makeNotification
import com.sdds.uikit.internal.overlays.NotificationView
import com.sdds.uikit.internal.overlays.getOverlayManager
import com.sdds.uikit.overlays.OverlayAnimationSpec
import com.sdds.uikit.overlays.OverlayEntry
import com.sdds.uikit.overlays.OverlayManager
import com.sdds.uikit.overlays.OverlayPosition
import com.sdds.uikit.overlays.getAnimationSpec
import java.lang.ref.WeakReference

/**
 * Класс для отображения уведомлений с помощью системы оверлеев SDDS UI Kit.
 * Используйте [makeNotification] для создания и показа.
 */
class Notification private constructor(
    private val context: Context,
    overlayManager: OverlayManager,
    private val viewFactory: (Context, OverlayEntry) -> View,
    override val durationMillis: Long?,
    private val hasClose: Boolean,
    override val animationSpec: OverlayAnimationSpec?,
    override val isFocusable: Boolean,
) : OverlayEntry {

    /** Уникальный идентификатор данного уведомления. */
    override val id: Long = System.currentTimeMillis()

    override fun createView(): View {
        return NotificationView(context).apply {
            setHasClose(hasClose)
            if (hasClose) {
                setCloseIconClickListener { hide() }
            }
            setContentView(viewFactory(this.context, this@Notification))
        }
    }

    private var overlayManagerRef: WeakReference<OverlayManager> = WeakReference(overlayManager)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Toast) return false

        if (id != other.id) return false
        if (durationMillis != other.durationMillis) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + (durationMillis?.hashCode() ?: 0)
        return result
    }

    override fun show() {
        overlayManagerRef.get()?.show(this)
    }

    override fun hide() {
        overlayManagerRef.get()?.remove(id)
    }

    @Suppress("UseCompatLoadingForDrawables")
    companion object {

        /** Положение уведомления по умолчанию — снизу вконце. */
        internal val DefaultNotificationPosition = OverlayPosition.BottomEnd

        private const val NOTIFICATION_MANAGER_TAG = "com.sdds.uikit.NotificationManager"

        /**
         * Создаёт настраиваемый экземпляр [Notification] с заданными параметрами.
         *
         * @param context Контекст.
         * @param position Положение на экране, где появится уведомление.
         * @param duration Продолжительность отображения уведомления в миллисекундах.
         * @param factory Фабрика для создания содержимого уведомления.
         * @return Настроенный экземпляр [Notification], готовый к показу.
         */
        fun makeNotification(
            context: Context,
            position: OverlayPosition = DefaultNotificationPosition,
            duration: Long? = OverlayManager.OVERLAY_DURATION_SLOW_MILLIS,
            hasClose: Boolean = true,
            isFocusable: Boolean = false,
            @StyleRes notificationStyleOverlay: Int = 0,
            animationSpec: OverlayAnimationSpec? = position.getAnimationSpec(),
            factory: (Context, OverlayEntry) -> View,
        ): Notification {
            val overlayManager = context.getOverlayManager(position, NOTIFICATION_MANAGER_TAG)
            val themedContext: Context = if (notificationStyleOverlay != 0) {
                ContextThemeWrapper(context, notificationStyleOverlay)
            } else {
                context
            }
            return Notification(
                context = themedContext,
                overlayManager = overlayManager,
                viewFactory = factory,
                durationMillis = duration,
                hasClose = hasClose,
                animationSpec = animationSpec,
                isFocusable = isFocusable,
            )
        }
    }
}
