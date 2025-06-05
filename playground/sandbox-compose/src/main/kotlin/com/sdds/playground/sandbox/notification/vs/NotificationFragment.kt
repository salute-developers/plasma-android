package com.sdds.playground.sandbox.notification.vs

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.notification.NotificationUiState
import com.sdds.testing.vs.notification.notification
import com.sdds.testing.vs.notification.notificationTrigger

internal class NotificationFragment : ComponentFragment<NotificationUiState, View, NotificationViewModel>() {
    private var notificationContext: Context? = null

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ToastViewModelFactory(
            defaultState = getState { NotificationUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        notificationContext = contextWrapper
        return notificationTrigger(contextWrapper)
    }

    override fun onComponentUpdate(component: View?, state: NotificationUiState) {
        val context = notificationContext ?: return
        component?.setOnClickListener { notification(context, state).show() }
    }
}
