package com.sdds.preview.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.style.Style
import com.sdds.preview.contract.PreviewComponentDescription
import com.sdds.preview.contract.PreviewComponentDescriptionResult
import com.sdds.preview.contract.PreviewContractJson
import com.sdds.preview.contract.PreviewExamplePropertyDescription
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.validate
import com.sdds.preview.contract.validateVersion
import com.sdds.sandbox.Property
import com.sdds.sandbox.UiState
import kotlinx.serialization.decodeFromString

/** Подготовленный preview, скрывающий конкретные типы story state и style. */
public interface PreparedComposePreview {
    /** Идентификатор исходного render request. */
    public val requestId: String

    /** Фон viewport из `PreviewPayload.surface`, если он задан корректным цветом. */
    public val surfaceBackground: Color?
        get() = null

    /** Отображает подготовленные style и state через существующую story. */
    @Composable
    public fun Content()
}

/** Type-erased binding существующей story и соответствующей style factory. */
public interface ComposePreviewComponent {
    /** Идентификатор компонента из Preview Protocol. */
    public val componentId: String

    /** Описание example properties зарегистрированной story. */
    public val description: PreviewComponentDescription

    /** Подготавливает component-specific state после подготовки общей темы. */
    public fun prepare(payload: PreviewPayload, theme: PreparedComposeTheme): PreparedComposePreview
}

/**
 * Создаёт preview binding без отдельного renderer-класса для компонента.
 * Типы state и style остаются связанными внутри SDK generic implementation.
 */
public fun <State : UiState, S : Style> previewComponent(
    story: ComposeBaseStory<State, S>,
    styleFactory: ComposePreviewStyleFactory<S>,
): ComposePreviewComponent = TypedComposePreviewComponent(story, styleFactory)

/** Общий runtime: JSON decode, theme preparation и выбор binding по component ID. */
public class ComposePreviewRuntime(
    private val assetResolver: PreviewAssetResolver,
    private val fontFamilyFactory: LoadedFontFamilyFactory,
    components: List<ComposePreviewComponent>,
) {
    private val componentsById = components.associateBy { it.componentId }

    /** Полностью подготавливает очередной payload для Compose rendering. */
    public suspend fun prepare(json: String): PreparedComposePreview {
        val payload = PreviewContractJson.decodeFromString<PreviewPayload>(json)
        payload.validateVersion()?.let { failure -> error(failure.message) }
        val component = requireNotNull(componentsById[payload.component.id]) {
            "Preview component ${payload.component.id} не зарегистрирован"
        }
        val theme = payload.prepareComposeTheme(assetResolver, fontFamilyFactory)
        return component.prepare(payload, theme)
    }

    /** Возвращает описание зарегистрированного component без изменения render state. */
    public fun describe(componentId: String, requestId: String): PreviewComponentDescriptionResult {
        if (requestId.isBlank()) {
            return PreviewComponentDescriptionResult.Failure(
                requestId = requestId,
                code = "invalid_request",
                message = "requestId не должен быть пустым",
            )
        }
        val component = componentsById[componentId] ?: return PreviewComponentDescriptionResult.Failure(
            requestId = requestId,
            code = "unknown_component",
            message = "Preview component $componentId не зарегистрирован",
        )
        return runCatching { component.description }
            .fold(
                onSuccess = { PreviewComponentDescriptionResult.Success(requestId, it) },
                onFailure = {
                    PreviewComponentDescriptionResult.Failure(
                        requestId = requestId,
                        code = "invalid_description",
                        message = it.message ?: "Component description не прошло validation",
                    )
                },
            )
    }
}

private class TypedComposePreviewComponent<State : UiState, S : Style>(
    private val story: ComposeBaseStory<State, S>,
    private val styleFactory: ComposePreviewStyleFactory<S>,
) : ComposePreviewComponent {
    override val componentId: String = story.component.value
    override val description: PreviewComponentDescription by lazy {
        PreviewComponentDescription(
            componentId = componentId,
            storyId = componentId,
            properties = story.propertiesProducer.getProperties(story.defaultState)
                .filter { it.enabled && it.name != "variant" && it.name != "appearance" }
                .map(Property<*>::toPreviewDescription),
        ).also { description ->
            val errors = description.validate()
            require(errors.isEmpty()) { errors.joinToString() }
        }
    }

    override fun prepare(payload: PreviewPayload, theme: PreparedComposeTheme): PreparedComposePreview {
        val state = payload.example.applyToState(
            defaultState = story.defaultState,
            propertiesProducer = story.propertiesProducer,
            stateTransformer = story.stateTransformer,
        )
        return TypedPreparedComposePreview(payload, theme, story, styleFactory, state)
    }
}

internal fun Property<*>.toPreviewDescription(): PreviewExamplePropertyDescription = when (this) {
    is Property.StringProperty -> PreviewExamplePropertyDescription.StringProperty(name, value)
    is Property.BooleanProperty -> PreviewExamplePropertyDescription.BooleanProperty(name, value)
    is Property.IntProperty -> PreviewExamplePropertyDescription.IntProperty(name, value)
    is Property.FloatProperty -> PreviewExamplePropertyDescription.FloatProperty(name, value)
    is Property.SingleChoiceProperty ->
        PreviewExamplePropertyDescription.SingleChoiceProperty(name, value, variants)
}

private class TypedPreparedComposePreview<State : UiState, S : Style>(
    private val payload: PreviewPayload,
    private val theme: PreparedComposeTheme,
    private val story: ComposeBaseStory<State, S>,
    private val styleFactory: ComposePreviewStyleFactory<S>,
    private val state: State,
) : PreparedComposePreview {
    override val requestId: String = payload.requestId
    override val surfaceBackground: Color? = payload.surface?.background?.toComposeColorOrNull()

    @Composable
    override fun Content() {
        val style = styleFactory.create(payload.component, theme)
        Box {
            with(story) { Content(style, state) }
        }
    }
}
