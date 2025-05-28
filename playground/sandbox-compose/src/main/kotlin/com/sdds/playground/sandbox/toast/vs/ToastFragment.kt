package com.sdds.playground.sandbox.toast.vs

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.toast.ToastUiState
import com.sdds.testing.vs.toast.toast
import com.sdds.testing.vs.toast.toastTrigger

internal class ToastFragment : ComponentFragment<ToastUiState, View, ToastViewModel>() {
    private var toastContext: Context? = null

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ToastViewModelFactory(
            defaultState = getState { ToastUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        toastContext = contextWrapper
        return toastTrigger(contextWrapper)
    }

    override fun onComponentUpdate(component: View?, state: ToastUiState) {
        val context = toastContext ?: return
        component?.setOnClickListener { toast(context, state).show() }
    }
}
