package com.sdds.playground.sandbox.core.updates

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageInstaller
import androidx.core.content.ContextCompat
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileInputStream
import java.lang.IllegalStateException
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

/**
 * Интерфейс для установки обновлений приложения.
 */
interface UpdateInstaller {

    /**
     * Устанавливает обновление из указанного APK-файла.
     *
     * @param distribution Файл с APK для установки.
     */
    suspend fun install(distribution: File)
}

/**
 * Устанавливает APK-обновление с помощью [PackageInstaller].
 *
 * После установки инициирует перезапуск приложения.
 *
 * @param context Контекст приложения.
 */
class ApkUpdateInstaller(
    private val context: Context,
    private val dispatcher: CoroutineDispatcher,
) : UpdateInstaller {

    override suspend fun install(distribution: File) = withContext(dispatcher) {
        if (!distribution.exists()) {
            throw IllegalArgumentException("${distribution.absolutePath} doesn't exists")
        }

        val packageInstaller = context.packageManager.packageInstaller
        val params = PackageInstaller.SessionParams(PackageInstaller.SessionParams.MODE_FULL_INSTALL)

        val sessionId = packageInstaller.createSession(params)
        val session = packageInstaller.openSession(sessionId)

        val inputStream = FileInputStream(distribution)
        val out = session.openWrite("package", 0, -1)
        inputStream.copyTo(out)
        session.fsync(out)
        out.close()
        inputStream.close()
        session.install(sessionId)
        session.close()
    }

    private suspend fun PackageInstaller.Session.install(sessionId: Int) =
        suspendCancellableCoroutine { continuation ->
            val installResultReceiver = object : BroadcastReceiver() {
                override fun onReceive(context: Context, intent: Intent) {
                    val status = intent.getIntExtra(PackageInstaller.EXTRA_STATUS, -1)
                    val message = intent.getStringExtra(PackageInstaller.EXTRA_STATUS_MESSAGE)

                    when (status) {
                        PackageInstaller.STATUS_SUCCESS -> {
                            continuation.resume(Unit)
                        }
                        else -> {
                            continuation.resumeWithException(IllegalStateException(message))
                        }
                    }
                }
            }
            ContextCompat.registerReceiver(
                context,
                installResultReceiver,
                IntentFilter(PACKAGE_INSTALL_ACTION),
                ContextCompat.RECEIVER_NOT_EXPORTED,
            )
            val broadcastIntent = Intent(context, InstallPendingActionReceiver::class.java)
            val pendingIntent = PendingIntent.getBroadcast(
                context,
                sessionId,
                broadcastIntent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE,
            )
            commit(pendingIntent.intentSender)
        }
}

private const val PACKAGE_INSTALL_ACTION = "com.sdds.INSTALL_PACKAGE_RESULT"

internal class InstallPendingActionReceiver : BroadcastReceiver() {
    @Suppress("UnsafeIntentLaunch")
    override fun onReceive(context: Context, intent: Intent) {
        val status = intent.getIntExtra(PackageInstaller.EXTRA_STATUS, -1)
        val message = intent.getStringExtra(PackageInstaller.EXTRA_STATUS_MESSAGE)
        if (status == PackageInstaller.STATUS_PENDING_USER_ACTION) {
            intent.getParcelableExtra<Intent>(Intent.EXTRA_INTENT)?.let {
                it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(it)
            }
        } else {
            val redirectIntent = Intent(PACKAGE_INSTALL_ACTION).apply {
                setPackage(context.packageName)
                putExtra(PackageInstaller.EXTRA_STATUS, status)
                putExtra(PackageInstaller.EXTRA_STATUS_MESSAGE, message)
            }
            context.sendBroadcast(redirectIntent)
        }
    }
}
