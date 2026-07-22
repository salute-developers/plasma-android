package com.sdds.preview.contract

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.networknt.schema.JsonSchemaFactory
import com.networknt.schema.SpecVersion
import kotlinx.serialization.KSerializer
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.serializer
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SchemaContractTest {
    private val mapper = ObjectMapper()
    private val factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012)

    @Test
    fun `canonical fixtures conform to schema and survive Kotlin round trip`() {
        roundTrip<PreviewPayload>("preview-payload")
        roundTrip<PreviewResult>("preview-result")
    }

    @Test
    fun `negative fixtures report expected paths`() {
        assertInvalid("preview-payload", "preview-payload-missing-component", "$.component")
        assertInvalid("preview-result", "preview-result-invalid-type", "$.type")
    }

    @Test
    fun `schemas and fixtures are packaged as resources`() {
        listOf("preview-payload", "preview-result").forEach {
            assertTrue(resource("schemas/v1/$it.schema.json").isNotBlank())
            assertTrue(resource("fixtures/v1/positive/$it.json").isNotBlank())
        }
    }

    @Test
    fun `public runtime remains platform neutral`() {
        val runtimeNames = System.getProperty("java.class.path")
        assertTrue("androidx.compose" !in runtimeNames)
        assertTrue("com.android" !in runtimeNames)
        assertTrue("sandbox" !in runtimeNames)
    }

    private inline fun <reified T> roundTrip(name: String) {
        val fixture = resource("fixtures/v1/positive/$name.json")
        assertValid(name, mapper.readTree(fixture))
        val serializer: KSerializer<T> = serializer()
        val model = PreviewContractJson.decodeFromString(serializer, fixture)
        val encoded = PreviewContractJson.encodeToString(serializer, model)
        assertValid(name, mapper.readTree(encoded))
    }

    private fun assertInvalid(schemaName: String, fixtureName: String, expectedPath: String) {
        val messages = schema(schemaName).validate(
            mapper.readTree(resource("fixtures/v1/negative/$fixtureName.json")),
        )
        assertTrue(messages.isNotEmpty())
        assertTrue(messages.any { it.path == expectedPath || it.message.contains(expectedPath) })
    }

    private fun assertValid(schemaName: String, node: JsonNode) {
        assertEquals(emptySet(), schema(schemaName).validate(node))
    }

    private fun schema(name: String) = factory.getSchema(
        mapper.readTree(resource("schemas/v1/$name.schema.json")),
    )

    private fun resource(path: String): String = requireNotNull(javaClass.classLoader.getResource(path)) {
        "Resource $path is not packaged"
    }.readText()
}
