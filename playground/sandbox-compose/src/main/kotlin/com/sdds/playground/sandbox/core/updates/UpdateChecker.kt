package com.sdds.playground.sandbox.core.updates

import android.util.Log
import com.sdds.playground.sandbox.BuildConfig
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

/**
 * Класс, отвечающий за проверку обновлений приложения через GitHub Releases API.
 *
 * @param dispatcher Диспетчер корутин для выполнения сетевых операций.
 */
@OptIn(ExperimentalSerializationApi::class)
internal class UpdateChecker(private val dispatcher: CoroutineDispatcher) {

    /**
     * Получает информацию о доступном обновлении из последнего релиза GitHub.
     *
     * Загружает данные о релизе, проверяет наличие нового apk-файла, сравнивает его с текущей версией.
     * Если доступна новая версия — возвращает [UpdateInfo.PendingUpdate], иначе — [UpdateInfo.None].
     *
     * @return [UpdateInfo] с информацией об обновлении или None, если обновление не требуется или произошла ошибка.
     */
    suspend fun getUpdateInfo(): UpdateInfo = withContext(dispatcher) {
        try {
            val connection = URL(API_URL).openConnection() as HttpURLConnection
            connection.setRequestProperty("Accept", "application/vnd.github+json")
            connection.connect()
            if (connection.responseCode != HttpURLConnection.HTTP_OK) return@withContext UpdateInfo.None
            val release = json.decodeFromStream<GitHubRelease>(connection.inputStream)
            val appAsset = release.assets.firstOrNull { it.name.contains(BuildConfig.DIST_NAME) }
            val version = release.getVersion()

            Log.d(
                "UpdateChecker",
                "getUpdateInfo: latest release: $version, current = ${BuildConfig.VERSION_CODE}, appAsset = $appAsset",
            )

            if (version.code <= BuildConfig.VERSION_CODE || appAsset == null) {
                return@withContext UpdateInfo.None
            }

            UpdateInfo.PendingUpdate(
                version = version.name,
                url = appAsset.browserDownloadUrl,
                name = appAsset.name,
            )
        } catch (e: IOException) {
            e.printStackTrace()
            UpdateInfo.None
        }
    }

    /**
     * Получает номер версии (versionCode) из файла versions.json, прикреплённого к релизу.
     *
     * Используется для сравнения с текущей установленной версией.
     * Если файл отсутствует или происходит ошибка — возвращает текущий versionCode приложения.
     *
     * @return Числовой код версии из файла или [BuildConfig.VERSION_CODE] по умолчанию.
     */
    private suspend fun GitHubRelease.getVersion(): AppVersion = withContext(dispatcher) {
        val fallbackVersion = AppVersion("", BuildConfig.VERSION_CODE)
        val versionsAsset = assets.firstOrNull { it.name == "versions.json" } ?: return@withContext fallbackVersion
        val connection = URL(versionsAsset.browserDownloadUrl).openConnection() as HttpURLConnection
        connection.setRequestProperty("Accept", "application/vnd.github+json")
        connection.connect()

        if (connection.responseCode != HttpURLConnection.HTTP_OK) return@withContext fallbackVersion
        val versions = json.decodeFromStream<Map<String, AppVersion>>(connection.inputStream)
        versions[BuildConfig.DIST_NAME] ?: fallbackVersion
    }

    private companion object {
        val json = Json { ignoreUnknownKeys = true }
        const val API_URL = "https://api.github.com/repos/salute-developers/plasma-android/releases/latest"
    }
}

@Serializable
internal data class GitHubRelease(
    @SerialName("tag_name") val tagName: String,
    val assets: List<GitHubAsset>,
)

@Serializable
internal data class GitHubAsset(
    val name: String,
    @SerialName("browser_download_url") val browserDownloadUrl: String,
)

@Serializable
internal data class AppVersion(
    val name: String,
    val code: Int,
)

internal sealed class UpdateInfo {

    data class PendingUpdate(
        val version: String,
        val url: String,
        val name: String,
    ) : UpdateInfo()

    object None : UpdateInfo()
}
