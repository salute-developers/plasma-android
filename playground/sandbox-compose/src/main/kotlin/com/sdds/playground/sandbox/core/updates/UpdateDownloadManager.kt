package com.sdds.playground.sandbox.core.updates

import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.os.Environment
import android.util.Log
import androidx.core.content.ContextCompat
import com.sdds.playground.sandbox.R
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import java.io.File

/**
 * Менеджер загрузки обновлений с использованием системного [DownloadManager].
 *
 * Отвечает за постановку APK-файла в очередь загрузки и отслеживание завершения загрузки.
 *
 * @param context Контекст приложения.
 */
internal class UpdateDownloadManager(private val context: Context) {
    private val _pendingDownloads = mutableMapOf<Long, String>()

    private val downloadsDir by lazy {
        context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS)?.path
            ?: throw IllegalAccessException("Can't access ${Environment.DIRECTORY_DOWNLOADS}")
    }

    /**
     * Flow, эмитирующий [File], когда загрузка APK завершается успешно.
     *
     * Использует [BroadcastReceiver] для отслеживания завершения загрузки.
     */
    val downloadCompleted: Flow<File> = callbackFlow {
        val onComplete = object : BroadcastReceiver() {
            override fun onReceive(
                context: Context,
                intent: Intent,
            ) {
                val downloadId = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1)
                val destinationUri = _pendingDownloads[downloadId] ?: return
                trySend(File(destinationUri))
            }
        }
        ContextCompat.registerReceiver(
            context,
            onComplete,
            IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE),
            ContextCompat.RECEIVER_EXPORTED,
        )

        awaitClose { context.unregisterReceiver(onComplete) }
    }

    /**
     * Ставит APK-файл в очередь загрузки через системный [DownloadManager].
     *
     * @param url URL файла обновления.
     * @param name Имя файла для сохранения.
     */
    fun enqueueDownload(url: String, name: String) {
        val destination = "$downloadsDir/$name"
        val uri = Uri.parse("$FILE_BASE_PATH$destination")
        val file = File(destination)
        if (file.exists()) file.delete()
        Log.d("Updater", "enqueueDownload: to ${file.absolutePath}")
        val downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        val downloadUri = Uri.parse(url)
        val request = DownloadManager.Request(downloadUri)
        request.setMimeType(MIME_TYPE)
        request.setTitle(context.getString(R.string.app_name))
        request.setDescription(context.getString(R.string.update_downloading))
        request.setDestinationUri(uri)
        val id = downloadManager.enqueue(request)
        _pendingDownloads[id] = destination
    }

    private companion object {
        const val FILE_BASE_PATH = "file://"
        const val MIME_TYPE = "application/vnd.android.package-archive"
    }
}
