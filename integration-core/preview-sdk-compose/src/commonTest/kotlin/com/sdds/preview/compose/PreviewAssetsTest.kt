package com.sdds.preview.compose

import com.sdds.preview.contract.PreviewAsset
import com.sdds.preview.contract.PreviewAssetType
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class PreviewAssetsTest {
    @Test
    fun `digest cache avoids duplicate load`() = runTest {
        var calls = 0
        val resolver = CachingPreviewAssetResolver { byteArrayOf((++calls).toByte()) }
        val first = asset("one", "digest")
        val second = asset("two", "digest")
        assertContentEquals(resolver.resolve(first), resolver.resolve(second))
        assertEquals(1, calls)
    }

    @Test
    fun `empty font is rejected`() = runTest {
        val resolver = CachingPreviewAssetResolver { byteArrayOf() }
        assertFailsWith<IllegalArgumentException> { resolver.resolve(asset("empty", null)) }
    }

    private fun asset(id: String, digest: String?) = PreviewAsset(id, PreviewAssetType.TTF, "$id.ttf", digest)
}
