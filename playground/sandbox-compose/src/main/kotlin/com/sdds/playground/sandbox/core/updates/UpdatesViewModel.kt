package com.sdds.playground.sandbox.core.updates

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.BuildConfig
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * ViewModel, отвечающий за проверку и установку обновлений приложения.
 *
 * Использует [UpdateManager] для получения информации об обновлениях и запуска установки.
 * Хранит состояние обновления в [updateState].
 */
internal class UpdatesViewModel(
    private val updateManager: UpdateManager,
) : ViewModel() {

    private val _updateState = MutableStateFlow<UpdateState>(UpdateState.None)

    val updateState: StateFlow<UpdateState>
        get() = _updateState.asStateFlow()

    /**
     * Проверяет наличие доступных обновлений и обновляет состояние [updateState].
     */
    fun checkUpdates() {
        viewModelScope.launch {
            val info = updateManager.getUpdateInfo()
            if (info == UpdateInfo.None) {
                _updateState.value = UpdateState.None
                return@launch
            }
            goToState<UpdateState> {
                when {
                    this == UpdateState.None && info is UpdateInfo.PendingUpdate ->
                        UpdateState.PendingUpdate(info, shouldShowNotification = true)

                    this is UpdateState.PendingUpdate -> copy(shouldShowNotification = false)
                    else -> UpdateState.None
                }
            }
        }
    }

    /**
     * Запускает установку обновления, если оно доступно.
     *
     * @param update Информация об обновлении, должна быть [UpdateInfo.PendingUpdate].
     */
    fun installUpdate(update: UpdateInfo) {
        if (update !is UpdateInfo.PendingUpdate) return
        viewModelScope.launch {
            val pendingUpdateState: UpdateState.PendingUpdate = goToState<UpdateState.PendingUpdate> {
                copy(isLoading = true, shouldShowNotification = false)
            }
            runCatching { updateManager.updateApp(update) }
                .onFailure { goToState<UpdateState> { UpdateState.UpdateFailed(it.message) } }
            goToState<UpdateState> { pendingUpdateState.copy(isLoading = false) }
        }
    }

    private inline fun <reified T : UpdateState> goToState(
        modifier: T.() -> T = { this },
    ): T {
        val newState = (_updateState.value as? T)?.run(modifier)
            ?: throw IllegalStateException("UpdateState cannot be null")
        _updateState.value = newState
        return newState
    }
}

/**
 * Состояние обновления, хранящее информацию о текущей версии и наличии обновлений.
 */
internal sealed class UpdateState {

    /**
     * Текущая версия приложения
     */
    val versionInfo: String = BuildConfig.VERSION_NAME

    /**
     * Состояние "Нет доступных обновлений"
     */
    object None : UpdateState()

    /**
     * Состояние "Доступно обновление".
     *
     * @property info Информация о доступном обновлении.
     * @property versionInfo Текущая версия приложения.
     * @property shouldShowNotification Показывает, нужно ли отобразить уведомление о доступном обновлении.
     */
    data class PendingUpdate(
        val info: UpdateInfo.PendingUpdate,
        val shouldShowNotification: Boolean = false,
        val isLoading: Boolean = false,
    ) : UpdateState()

    /**
     * Состояние "Ошибка обновления"
     */
    data class UpdateFailed(
        val message: String? = null,
    ) : UpdateState()
}

/**
 * Фабрика для создания экземпляра [UpdatesViewModel] с передачей [UpdateManager].
 */
internal class UpdatesViewModelFactory(
    private val updatesManager: UpdateManager,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return UpdatesViewModel(updatesManager) as T
    }
}
