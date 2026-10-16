package com.sdds.preview.compose

import androidx.compose.ui.text.font.FontFamily
import com.sdds.preview.contract.PreviewAsset

/** Загружает bytes runtime-ресурса preview. */
public fun interface PreviewAssetResolver {
    /** Возвращает содержимое [asset] либо бросает ошибку загрузки. */
    public suspend fun resolve(asset: PreviewAsset): ByteArray
}

/**
 * Кеширующий resolver: digest имеет приоритет над URL. Ключом служит URL, а не идентификатор ресурса: разные семейства
 * шрифтов ссылаются на одни и те же файлы под разными идентификаторами, и скачивать их повторно незачем.
 */
public class CachingPreviewAssetResolver(
    private val delegate: PreviewAssetResolver,
) : PreviewAssetResolver {
    private val cache = mutableMapOf<String, ByteArray>()

    override suspend fun resolve(asset: PreviewAsset): ByteArray {
        val key = asset.digest ?: asset.url
        return cache[key] ?: delegate.resolve(asset).also {
            require(it.isNotEmpty()) { "Ресурс ${asset.id} не содержит данных" }
            cache[key] = it
        }
    }
}

/** In-memory resolver для tests и локальных fixtures. */
public class InMemoryPreviewAssetResolver(
    private val assets: Map<String, ByteArray>,
) : PreviewAssetResolver {
    override suspend fun resolve(asset: PreviewAsset): ByteArray =
        requireNotNull(assets[asset.id]) { "Ресурс ${asset.id} не найден" }
}

/** Создаёт Compose [FontFamily] из предварительно загруженных faces. */
public fun interface LoadedFontFamilyFactory {
    /** Создаёт семейство из полностью загруженных faces. */
    public fun create(faces: List<LoadedFontFace>): FontFamily
}

/**
 * Переиспользует подготовленные [FontFamily] между payload: разбор шрифта платформой дорогой, а редактор присылает
 * один и тот же набор начертаний при каждом переключении компонента. Ключ — идентичность, вес, курсив и содержимое.
 */
public class CachingLoadedFontFamilyFactory(
    private val delegate: LoadedFontFamilyFactory,
) : LoadedFontFamilyFactory {
    private val cache = mutableMapOf<List<FaceKey>, FontFamily>()

    override fun create(faces: List<LoadedFontFace>): FontFamily =
        cache.getOrPut(faces.map { FaceKey(it.identity, it.weight, it.italic, it.bytes.contentHashCode()) }) {
            delegate.create(faces)
        }

    private data class FaceKey(val identity: String, val weight: Int, val italic: Boolean, val contentHash: Int)
}

/** Загруженные bytes и runtime-neutral параметры одного font face. */
public data class LoadedFontFace(
    /** Идентификатор для кеша platform font. */ val identity: String,
    /** Содержимое TTF/OTF. */ val bytes: ByteArray,
    /** Числовой вес шрифта. */ val weight: Int,
    /** Признак курсивного начертания. */ val italic: Boolean,
)
