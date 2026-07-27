## Context

`PreviewExample.applyToState` уже получает known properties из
`PropertiesProducer.getProperties(defaultState)`, преобразует primitive JSON values по типу
`Property` и вызывает `StateTransformer`. Для `BasicButtonStory` generated producer возвращает:

```text
label: String
value: String
icon: Start | End | No
spacing: single choice
hasFixedWidth: Boolean
enabled: Boolean
loading: Boolean
```

Следовательно, новый mapping UiState не нужен. Отсутствует только сериализуемое описание этого
набора для внешнего host.

Текущий `PreviewViewport` вызывает `state.preview.Content()` без полноразмерного layout, а empty
state рисует `BasicText`. HTML shell задаёт размеры, но явно не фиксирует прозрачность всех
browser/Compose canvas layers.

## Goals / Non-Goals

**Goals:**

- Предоставить host точную schema example properties, реально принимаемых Compose story.
- Переиспользовать generated `PropertiesProducer` как runtime source of truth.
- Не показывать story controls для framework variation fields.
- Сохранить type-safe применение values через существующий `StateTransformer`.
- Применять payload background ко всему Compose viewport, сохраняя прозрачный empty state, и
  центрировать story content.
- Проверить свойства и presentation на production Wasm artifact.

**Non-Goals:**

- Передача variation/style schema DS Builder через story descriptor.
- Изменение `PreviewPayload.component.variations`.
- Новый параллельный набор story-аннотаций.
- Ручной descriptor только для `BasicButton`.
- Persisted UiState в plugin между разными preview sessions.
- Выбор или вычисление background вне значения `surface.background`, переданного в payload.
- Layout controls, zoom, device frames или responsive presets.

## Decisions

### 1. Description contract отделён от render payload

Component description меняется при выпуске plugin, а не при каждом изменении темы или style.
Поэтому он не включается в `PreviewPayload`. `preview-contract` добавляет самостоятельные модели:

```text
PreviewComponentDescription
  protocolVersion
  componentId
  storyId
  properties[]

PreviewExamplePropertyDescription
  name
  type: string | boolean | int | float | singleChoice
  defaultValue
  variants[]
```

`defaultValue` имеет тип, соответствующий discriminator. `variants` обязателен только для
single-choice и содержит непустой список строк.

Для describe operation используется отдельный коррелированный result:

```text
PreviewComponentDescriptionResult
  Success(requestId, description)
  Failure(requestId, code, message)
```

Модели не зависят от Compose, sandbox или component library. Для них публикуется Draft 2020-12
JSON Schema и canonical positive/negative fixtures.

### 2. Compose descriptor строится из PropertiesProducer

`ComposePreviewComponent` предоставляет `description`, построенный один раз из:

```kotlin
story.propertiesProducer.getProperties(story.defaultState)
```

Mapping:

| Sandbox property | Description type |
| --- | --- |
| `StringProperty` | `string` |
| `BooleanProperty` | `boolean` |
| `IntProperty` | `int` |
| `FloatProperty` | `float` |
| `SingleChoiceProperty` | `singleChoice` |

`Property.name` является wire key, который принимает текущий generated `StateTransformer`.
Текущий KSP также использует `StoryProperty.displayName` как этот key, поэтому change не
пытается задним числом разделить stable key и localized label. Отдельный `displayName` можно
добавить additive change после исправления KSP metadata.

Properties с `enabled=false` исключаются. Имена `variant` и `appearance` исключаются как
framework-level fields интерфейса `UiState`; их selection принадлежит
`PreviewComponent.variations`, а не `PreviewExample.props`.

Descriptor сортируется в порядке producer, чтобы client controls соответствовали story/demo
порядку. Duplicate property names являются initialization error plugin component.

### 3. Runtime описывает только зарегистрированный component

`ComposePreviewRuntime.describe(componentId, requestId)` ищет тот же
`ComposePreviewComponent`, который используется render path. Unknown ID возвращает failure
`unknown_component`; runtime не анализирует классы и не загружает другую story динамически.

Description не зависит от текущего payload и может быть запрошено сразу после ready. Повторные
запросы возвращают эквивалентный descriptor без мутации render state.

### 4. Browser bridge получает отдельную describe operation

HTML shell предоставляет:

```js
await describePreviewComponent(componentId)
```

Для iframe:

```json
{
  "type": "sdds.preview.describe",
  "requestId": "describe-1",
  "componentId": "BasicButton"
}
```

Ответ:

```json
{
  "type": "sdds.preview.description",
  "result": {
    "type": "success",
    "requestId": "describe-1",
    "description": {}
  }
}
```

Unknown component и contract/runtime errors возвращаются тем же envelope с failure result.
Ответ направляется исходному `event.source` с исходным `event.origin`, как render result.
Describe requests имеют отдельную pending map и не участвуют в latest-request-wins render
семантике.

Manifest `payloadBridge` additive расширяется:

```json
{
  "describe": "describePreviewComponent",
  "describeMessageType": "sdds.preview.describe",
  "descriptionMessageType": "sdds.preview.description"
}
```

### 5. Payload задаёт preview background

HTML shell явно задаёт transparent background для:

- `html`;
- `body`;
- `#root`;
- canvas, создаваемого Compose/Skiko.

До первого успешного payload Compose root не добавляет background. После подготовки payload
полноразмерный root `Box` применяет `PreviewSurface.background`, разрешённый из theme token.
Такой Compose-слой является source of truth для видимого preview background, поскольку Skiko
canvas не гарантирует сквозную прозрачность до host.

Изменение background требует нового render payload и обновляет весь viewport одновременно с
content.

### 6. Assembly plugin центрирует story content

Центрирование реализуется в `preview-compose-plugin`, а не внутри каждой story и не в
`preview-sdk-compose`:

```kotlin
Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center,
) {
    preview.Content()
}
```

SDK остаётся пригодным для другого host layout. Story продолжает владеть собственным размером,
например `hasFixedWidth`; outer viewport только выбирает position.

До первого payload plugin рендерит пустой прозрачный viewport. Loading/error UI остаётся
ответственностью browser host.

### 7. Validation проверяет фактический browser result

Common/JVM tests проверяют descriptor mapping, filtering, duplicate names и describe errors.
Production browser test:

- отправляет payload с отличимым background token и подтверждает его применение к viewport;
- проверяет bounding box непустых pixels относительно центра viewport с допустимым tolerance;
- запрашивает descriptor `BasicButton`;
- сравнивает exact property names/types/defaults/variants;
- отправляет payload с изменением каждого descriptor property и получает success;
- подтверждает отсутствие `variant` и `appearance`.

## Risks / Trade-offs

- [Canvas остаётся opaque из-за Skiko backend] -> Рисовать разрешённый
  `PreviewSurface.background` полноразмерным Compose `Box` после успешного payload.
- [Property.name сейчас одновременно wire key и display name] -> Сохранить существующую
  transformer semantics; отдельные key/label проектировать вместе с KSP change.
- [Custom producer возвращает нестабильный набор по state] -> Descriptor строится из
  `defaultState`; динамические schemas требуют отдельной protocol capability.
- [Description contract увеличивает Preview Protocol surface] -> Изолировать operation от
  render payload и покрыть schema/Kotlin round trip.
- [Большой plugin содержит много descriptors] -> Запрашивать один component on demand, не
  отправлять все schemas в ready.

## Migration Plan

1. Добавить description models, JSON Schema и fixtures в `preview-contract`.
2. Добавить property mapping и describe API в `preview-sdk-compose`.
3. Добавить direct/message bridge и manifest fields в plugin.
4. Сделать empty viewport прозрачным, применять payload background после render и центрировать
   content.
5. Расширить production browser tests и README.

Rollback describe bridge не требует отката PreviewPayload. Description contract additions
остаются неиспользуемыми, а viewport можно вернуть независимо.
