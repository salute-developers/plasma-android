package com.sdds.uikit.internal.overlays

import android.content.Context
import android.view.View
import androidx.core.view.doOnAttach
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.uikit.internal.base.findActivity
import com.sdds.uikit.internal.base.findDecorView
import com.sdds.uikit.overlays.OverlayManager
import com.sdds.uikit.overlays.OverlayPosition

internal class OverlayManagerOwner : ViewModel() {
    private var overlayManagers: MutableMap<OverlayPosition, OverlayManager> = mutableMapOf()

    fun get(position: OverlayPosition): OverlayManager {
        return overlayManagers.getOrPut(position) { OverlayEntryList(position) }
    }

    fun put(position: OverlayPosition, manager: OverlayManager) {
        overlayManagers[position] = manager
    }

    fun bindAll(rootView: View) {
        overlayManagers.forEach { it.value.bind(rootView) }
    }

    fun unbindAll() {
        overlayManagers.forEach { it.value.unbind() }
    }

    override fun onCleared() {
        super.onCleared()
        overlayManagers.values
            .forEach { manager ->
                manager.unbind()
                manager.clear()
            }
        overlayManagers.clear()
    }
}

internal fun Context.getOverlayManager(position: OverlayPosition, tag: String): OverlayManager {
    val activity = findActivity<FragmentActivity>() ?: throw IllegalAccessException("Need Activity")
    val rootView = activity.window?.decorView ?: throw IllegalAccessException("Need decorview")
    val controller = activity.supportFragmentManager
        .findFragmentByTag(tag) as? OverlayManagerController
        ?: OverlayManagerController().also {
            activity.supportFragmentManager.beginTransaction()
                .add(it, tag)
                .commit()
        }
    return controller.getOverlayManager(rootView, position)
}

internal class OverlayManagerController : Fragment() {

    private val overlayManagerOwner: OverlayManagerOwner by lazy {
        ViewModelProvider(this)[OverlayManagerOwner::class.java]
    }
    private var rootView: View? = null
    private var pendingOverlayManagers: MutableMap<OverlayPosition, OverlayManager> = mutableMapOf()

    fun getOverlayManager(rootView: View, position: OverlayPosition): OverlayManager {
        val overlayManager = if (isAdded) {
            overlayManagerOwner.get(position)
        } else {
            pendingOverlayManagers.getOrPut(position) { OverlayEntryList(position) }
        }
        return overlayManager.also { manager ->
            manager.bind(rootView)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        bind()
    }

    override fun onDetach() {
        super.onDetach()
        unbind()
    }

    private fun bind() {
        rootView = requireContext().findDecorView()
        rootView?.doOnAttach { root ->
            pendingOverlayManagers.forEach {
                overlayManagerOwner.put(it.key, it.value)
            }
            pendingOverlayManagers.clear()
            overlayManagerOwner.bindAll(root)
        }
    }

    private fun unbind() {
        rootView = null
        overlayManagerOwner.unbindAll()
    }
}
