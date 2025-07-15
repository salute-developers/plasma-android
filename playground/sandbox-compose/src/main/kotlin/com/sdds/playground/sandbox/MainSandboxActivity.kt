package com.sdds.playground.sandbox

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.activities.compose.SandboxActivityCompose
import com.sdds.playground.sandbox.core.updates.UpdateManager
import com.sdds.playground.sandbox.core.updates.UpdateState
import com.sdds.playground.sandbox.core.updates.UpdatesViewModel
import com.sdds.playground.sandbox.core.updates.UpdatesViewModelFactory
import com.sdds.playground.sandbox.core.vs.SandboxActivity
import com.sdds.playground.sandbox.databinding.ActivityMainSandboxBinding
import com.sdds.uikit.Toast
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Стартовая Активити демо-приложения
 */
class MainSandboxActivity : AppCompatActivity() {

    private val updatesViewModel: UpdatesViewModel by viewModels<UpdatesViewModel> {
        UpdatesViewModelFactory(UpdateManager.getInstance(this))
    }

    private var _binding: ActivityMainSandboxBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        _binding = ActivityMainSandboxBinding.inflate(LayoutInflater.from(this))
            .apply {
                setContentView(root)
                bView.setOnClickListener {
                    startActivity(Intent(this@MainSandboxActivity, SandboxActivity::class.java))
                }
                bCompose.setOnClickListener {
                    startActivity(Intent(this@MainSandboxActivity, SandboxActivityCompose::class.java))
                }
            }

        updatesViewModel.updateState
            .flowWithLifecycle(lifecycle, Lifecycle.State.RESUMED)
            .onEach { updateState -> updateVersionInfo(updateState) }
            .launchIn(lifecycleScope)

        updatesViewModel.checkUpdates()
    }

    private fun updateVersionInfo(updateState: UpdateState) {
        _binding?.apply {
            appVersion.text = getString(R.string.sandbox_current_verstion_title, updateState.versionInfo)
            updateSection.root.isVisible = updateState is UpdateState.PendingUpdate
            when (updateState) {
                UpdateState.None -> Unit
                is UpdateState.PendingUpdate -> updateSection.apply {
                    sectionLabel.text = getString(R.string.sandbox_new_verstion_title, updateState.info.version)
                    updateButton.isLoading = updateState.isLoading
                    updateButton.setOnClickListener {
                        if (!updateButton.isLoading) {
                            updatesViewModel.installUpdate(updateState.info)
                        }
                    }
                }

                is UpdateState.UpdateFailed -> {
                    showUpdateFailedNotification(updateState)
                }
            }
        }
    }

    private fun showUpdateFailedNotification(fail: UpdateState.UpdateFailed) {
        Toast.simpleToast(
            this,
            message = fail.message ?: getString(R.string.update_downloading),
        ).show()
    }
}
