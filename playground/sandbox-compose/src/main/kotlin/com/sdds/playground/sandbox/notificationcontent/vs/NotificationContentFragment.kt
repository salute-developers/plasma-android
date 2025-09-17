package com.sdds.playground.sandbox.notificationcontent.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.notificationcontent.NotificationContentUiState
import com.sdds.testing.vs.notificationcontent.applyState
import com.sdds.testing.vs.notificationcontent.notificationContent
import com.sdds.uikit.NotificationContent

internal class NotificationContentFragment :
    ComponentFragment<NotificationContentUiState, NotificationContent, NotificationContentParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        NotificationContentParametersViewModelFactory(
            defaultState = getState { NotificationContentUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): NotificationContent {
        return notificationContent(contextWrapper)
    }

    override fun onComponentUpdate(
        component: NotificationContent?,
        state: NotificationContentUiState,
    ) {
        component?.applyState(state)
    }
}
