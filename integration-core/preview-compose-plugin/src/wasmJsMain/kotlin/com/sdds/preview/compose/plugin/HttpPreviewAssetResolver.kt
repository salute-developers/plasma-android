package com.sdds.preview.compose.plugin

import com.sdds.preview.compose.PreviewAssetResolver
import com.sdds.preview.contract.PreviewAsset
import kotlinx.coroutines.await
import org.khronos.webgl.Int8Array
import kotlin.js.Promise

/** Browser resolver, загружающий TTF/OTF assets по URL из payload. */
public object HttpPreviewAssetResolver : PreviewAssetResolver {
    override suspend fun resolve(asset: PreviewAsset): ByteArray {
        val bytes: Int8Array = fetchBytes(asset.url).await()
        require(bytes.length > 0) { "Ресурс ${asset.id} не содержит данных" }
        return ByteArray(bytes.length) { index -> byteAt(bytes, index) }
    }
}

@JsFun(
    """(url) => fetch(url).then(response => {
        if (!response.ok) throw new Error(`HTTP ${'$'}{response.status} for ${'$'}{url}`);
        return response.arrayBuffer();
    }).then(buffer => new Int8Array(buffer))""",
)
private external fun fetchBytes(url: String): Promise<Int8Array>

@JsFun("(array, index) => array[index]")
private external fun byteAt(array: Int8Array, index: Int): Byte
