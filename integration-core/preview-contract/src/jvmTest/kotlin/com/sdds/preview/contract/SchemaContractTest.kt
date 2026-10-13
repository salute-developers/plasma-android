package com.sdds.preview.contract

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.networknt.schema.JsonSchemaFactory
import com.networknt.schema.SpecVersion
import kotlinx.serialization.KSerializer
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.serializer
import java.io.File
import java.security.MessageDigest
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
        roundTrip<PreviewResult>("preview-result", "preview-result-with-warnings")
        roundTrip<PreviewComponentDescriptionResult>("preview-component-description-result")
    }

    @Test
    fun `negative fixtures report expected paths`() {
        assertInvalid("preview-payload", "preview-payload-missing-component", "$.component")
        assertInvalid("preview-result", "preview-result-invalid-type", "$.type")
        assertInvalid("preview-payload", "preview-payload-invalid-font-asset", "$.assets[0].type")
        assertInvalid("preview-payload", "preview-payload-invalid-property", "$.component.properties.color.base")
        assertInvalid(
            "preview-component-description-result",
            "preview-component-description-result-invalid-default",
            "$.description.properties[0].defaultValue",
        )
    }

    @Test
    fun `shared valid fixtures pass the schema and survive Kotlin round trip`() {
        val names = sharedFixtures("valid")
        assertTrue(names.isNotEmpty())
        names.forEach { name ->
            val fixture = resource("fixtures/v1/shared/valid/$name")
            assertValid("preview-payload", mapper.readTree(fixture))
            val model = PreviewContractJson.decodeFromString<PreviewPayload>(fixture)
            assertValid("preview-payload", mapper.readTree(PreviewContractJson.encodeToString(model)))
        }
    }

    @Test
    fun `shared invalid fixtures are rejected by the schema`() {
        val names = sharedFixtures("invalid")
        assertTrue(names.isNotEmpty())
        names.forEach { name ->
            val messages = schema("preview-payload").validate(
                mapper.readTree(resource("fixtures/v1/shared/invalid/$name")),
            )
            assertTrue(messages.isNotEmpty(), "Fixture $name must be rejected")
        }
    }

    @Test
    fun `canonical schema and shared fixtures match the recorded digest`() {
        val recorded = resource("schemas/v1/DIGEST").lines().filter { it.isNotBlank() }
            .associate { line -> line.substringAfter("  ") to line.substringBefore("  ") }
        val expectedFiles = listOf("schemas/v1/preview-payload.schema.json") +
            sharedFixtures("valid").map { "fixtures/v1/shared/valid/$it" } +
            sharedFixtures("invalid").map { "fixtures/v1/shared/invalid/$it" }
        assertEquals(expectedFiles.sorted(), recorded.keys.sorted(), "DIGEST lists a different set of files")
        expectedFiles.forEach { path ->
            val actual = MessageDigest.getInstance("SHA-256").digest(resource(path).toByteArray())
                .joinToString("") { "%02x".format(it) }
            assertEquals(
                recorded.getValue(path),
                actual,
                "$path differs from the recorded digest; copy the canonical files from " +
                    "design-system-builder/backend-kt/preview/contract and regenerate DIGEST",
            )
        }
    }

    @Test
    fun `schemas and fixtures are packaged as resources`() {
        listOf("preview-payload", "preview-result", "preview-component-description-result").forEach {
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

    private fun sharedFixtures(kind: String): List<String> {
        val directory = File(requireNotNull(javaClass.classLoader.getResource("fixtures/v1/shared/$kind")).toURI())
        return directory.list().orEmpty().filter { it.endsWith(".json") }.sorted()
    }

    private inline fun <reified T> roundTrip(name: String, fixtureName: String = name) {
        val fixture = resource("fixtures/v1/positive/$fixtureName.json")
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
