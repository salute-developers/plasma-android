package com.sdds.playground.sandbox.core.updates

import android.content.Context
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

/**
 * Интерфейс для управления обновлением приложения.
 *
 * Позволяет получать информацию о доступных обновлениях и запускать процесс обновления.
 */
internal interface UpdateManager {

    /**
     * Проверяет наличие доступного обновления.
     *
     * @return [UpdateInfo] с информацией об обновлении или None, если обновлений нет.
     */
    suspend fun getUpdateInfo(): UpdateInfo

    /**
     * Загружает и устанавливает обновление приложения.
     *
     * @param info Информация о доступном обновлении.
     */
    suspend fun updateApp(info: UpdateInfo.PendingUpdate)

    companion object {

        /**
         * Возвращает экземпляр [UpdateManager].
         *
         * @param context Контекст приложения.
         * @return Реализация [UpdateManager].
         */
        fun getInstance(context: Context): UpdateManager {
            return UpdateManagerImpl(context.applicationContext, Dispatchers.IO)
        }
    }
}

/**
 * Реализация [UpdateManager], использующая [UpdateChecker], [UpdateDownloadManager] и [UpdateInstaller].
 *
 * @param context Контекст приложения.
 * @param dispatcher Диспетчер корутин для фоновых задач.
 */
private class UpdateManagerImpl(
    context: Context,
    private val dispatcher: CoroutineDispatcher,
    private val updateChecker: UpdateChecker = UpdateChecker(dispatcher),
    private val updateInstaller: UpdateInstaller = ApkUpdateInstaller(context, dispatcher),
    private val updateDownloadManager: UpdateDownloadManager = UpdateDownloadManager(context),
) : UpdateManager {

    override suspend fun getUpdateInfo(): UpdateInfo = withContext(dispatcher) {
        updateChecker.getUpdateInfo()
    }

    override suspend fun updateApp(info: UpdateInfo.PendingUpdate) = withContext(dispatcher) {
        val onComplete = async {
            updateDownloadManager.downloadCompleted
                .collect { updateInstaller.install(it) }
        }
        updateDownloadManager.enqueueDownload(info.url, info.name)
        onComplete.await()
    }
}
