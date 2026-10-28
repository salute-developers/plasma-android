## Context

ADR-0006 определяет Compose Preview Plugin как self-contained `wasmJs` web artifact, который получает platform-neutral `PreviewPayload` и рендерит настоящие Compose-компоненты через существующие stories. В `integration-core` уже существуют KMP-модули `preview-contract`, `sandbox-core`, `sandbox-compose`, `sandbox-ksp` и `uikit-compose-fixtures`, однако текущий preview contract не описывает font assets, `ComposeBaseStory` связан с demo UI lifecycle, а `ComposeStyleProvider` выбирает только заранее сгенерированные styles.

DS Builder передает effective component properties, поэтому preview runtime не должен повторно вычислять variation graph. Он должен преобразовать effective values в Compose-типы и вызвать UIKit style builder. Для PoC выбран `BasicButton`, поскольку его API покрывает root properties, colors, dimensions, typography, shapes и interactive values. Универсальная генерация factories из `uikit-api-meta.json` откладывается до подтверждения этого пути.

Репозиторий использует Compose Multiplatform 1.8.2. Его Skiko API предоставляет публичный `androidx.compose.ui.text.platform.Font(identity, data: ByteArray, weight, style)`, доступный Wasm target, поэтому реальные fonts можно загрузить до композиции и собрать в `FontFamily` без browser CSS font registration.

## Goals / Non-Goals

**Goals:**

- Создать `integration-core:preview-sdk-compose` и подтвердить end-to-end Compose/Wasm rendering из полного `PreviewPayload`.
- Переиспользовать существующие sandbox story, registry, property producer и state transformer.
- Динамически построить `ButtonStyle` из effective properties без `ComposeStyleProvider` и без reflection.
- Загрузить реальные TTF/OTF font faces во время выполнения до первого успешного render.
- Сохранить platform-neutral JSON contract и изолировать Skiko-specific font construction в platform source set.
- Обеспечить повторную обработку полного payload и recomposition без перезапуска Wasm application.
- Собирать self-contained browser plugin artifact с HTML shell, manifest и всеми JS/Wasm resources.

**Non-Goals:**

- Универсальный generator style factories из `uikit-api-meta.json`.
- Tooling Gradle plugin, временный assembly generator и пользовательский DSL.
- Публикация и Preview Artifact Service.
- Production trust policy и plugin resolver.
- `PreviewPatch`, события пользователя и полная taxonomy error codes.
- Поддержка всех Core-компонентов, WOFF/WOFF2 и variable-font axes.

## Decisions

### 1. Compose renderer contract переносится в `sandbox-core`

`ComposeBaseStory` с `Content(style, state)` перемещается в `sandbox-core`. Demo-specific `Story()` wrapper, scaffold, navigation, property editors и state/lifecycle UI остаются в `sandbox-compose` и вызывают renderer как extension/wrapper.

Это позволяет preview SDK зависеть от story model без demo UI и не вводить новый `sandbox-compose-core`. Цена решения — Compose-facing dependencies в `sandbox-core`, включая транзитивное влияние на View sandbox consumers; существующие target builds должны подтвердить допустимость этой цены.

Альтернатива: новый легкий Compose-модуль. Она отклонена как преждевременное дробление текущей sandbox структуры.

### 2. Существующая регистрация stories переиспользуется

`ComponentKey.value` является MVP identifier для `PreviewComponent.id`. Текущий `StoryRegistry` сохраняется, а generated `registerStories()` становится public, чтобы отдельный Wasm assembly мог инициализировать registry.

`@Story` и `@StoryProperty` не получают новые параметры. `PreviewExample.id` имеет значение `default` и runtime его пока не интерпретирует. Example props сопоставляются с текущими `Property.name` и применяются к `defaultState` через `PropertiesProducer`/`StateTransformer`.

Альтернатива: новый contributor/registry API со стабильными внешними IDs. Она отложена до появления нескольких assembly contributors и пользовательских plugins.

### 3. Payload содержит effective properties, а не выбор готового style

`PreviewComponent.variations` сохраняется для контекста, но MVP style factory получает уже вычисленные component properties. `ComposeStyleProvider` не используется: он адресует статические generated styles и не может отразить изменения properties без пересборки plugin.

Property value различает:

```text
literal(value)
tokenRef(tokenId)
base + interaction state values
```

Platform SDK разрешает token reference через `PreparedComposeTheme`; неизвестные token и property keys игнорируются. Отсутствующий поддерживаемый property оставляет default UIKit builder value.

### 4. BasicButton style factory реализуется вручную

`BasicButtonPreviewStyleFactory` размещается в assembly-модуле `preview-compose-plugin`, вызывает `basicButtonBuilder()` и применяет поддерживаемые root, `colors {}` и `dimensions {}` properties через typed parsing helpers SDK. Factory поддерживает literal/token values и UIKit interactive/stateful containers, не добавляя UIKit-specific компонент в общий SDK.

`uikit-api-meta.json` используется для проверки соответствия property IDs, method names, groups и overload types, но не читается в runtime. Ручная factory становится golden reference для будущего генератора.

Альтернативы:

- Reflection отклонена: Kotlin/Wasm не предоставляет необходимый динамический вызов перегруженных builder APIs.
- Поиск готового generated style отклонен: он не отражает draft property changes из DS Builder.

### 5. Theme preparation отделена от композиции

`ComposePreviewThemeAdapter.prepare(payload)` выполняет suspend preparation и возвращает `PreparedComposeTheme`. Подготовка проходит в порядке assets → font families → typography → остальные tokens. После этого composable factory и renderer работают только с подготовленными значениями.

Typed helpers выполняют:

- `#RRGGBBAA` → Compose ARGB `Color`;
- ordinary dimension → `Dp`;
- typography font size, line height и letter spacing → `TextUnit.Sp`;
- normalized shape/shadow → UIKit/Compose runtime values;
- font-family token reference → подготовленный `FontFamily`.

Неизвестные токены не являются ошибкой. Ошибка возникает, только если без значения невозможно подготовить явно используемый обязательный font/style.

### 6. Fonts загружаются как bytes и создаются в `wasmJsMain`

Contract получает runtime-neutral `PreviewAsset` и `TokenValue.FontFamily`. `PreviewAssetResolver` загружает bytes и кеширует их по digest, а при его отсутствии — по stable asset ID/URL.

Skiko-specific construction изолируется за common contract:

```kotlin
internal expect fun createLoadedFont(
    identity: String,
    bytes: ByteArray,
    weight: FontWeight,
    style: FontStyle,
): Font
```

`wasmJsMain` actual использует `androidx.compose.ui.text.platform.Font`. Один `FontFamily` содержит все объявленные faces. Render начинается только после загрузки required faces. MVP поддерживает TTF/OTF, normal/italic и integer weights; explicit fallback применяется только при наличии в contract.

### 7. PoC сначала остается типизированным для BasicButton

Первый end-to-end path не вводит универсальный type-erased style registry:

```text
JSON payload
  -> PreviewContractJson
  -> ComposePreviewThemeAdapter
  -> BasicButton defaultState + props
  -> BasicButtonPreviewStyleFactory
  -> BasicButtonStory.Content
  -> Compose viewport
```

После подтверждения пути можно отдельно спроектировать generated factory/registry. Это предотвращает фиксацию общей abstraction до проверки contract sufficiency и Wasm font behavior.

Общий `ComposePreviewRuntime` использует `previewComponent(story, styleFactory)` для type-erased
связки типизированных story state/style внутри SDK. Для каждого компонента не создаются отдельные
runtime, renderer или prepared-классы; в assembly остаётся только style factory и одна регистрация,
которая впоследствии может генерироваться.

### 8. Validation ориентирована на vertical slice

Проверки включают:

- `preview-contract`: JSON Schema, positive/negative fixtures и serialization round trip;
- `sandbox-core`, `sandbox-compose`, `sandbox-ksp`, `uikit-compose-fixtures`: common/Android/Wasm compilation и существующие tests;
- `preview-sdk-compose`: conversion/parser/cache unit tests;
- Wasm browser test или executable: реальный OTF/TTF, разные weights, Button render и повторный full payload;
- focused detekt/Spotless checks затронутых модулей.

### 9. Plugin assembly поставляется как self-contained browser artifact

`preview-compose-plugin` содержит HTML shell, статический manifest и production webpack output.
Минимальный host bridge принимает полный payload прямым вызовом и через `postMessage`, а HTTP
asset resolver загружает объявленные payload assets. Gradle-задача упаковки создаёт zip со всеми
JS/Wasm/resources без внешних runtime-файлов. Публикация, подпись и trust policy остаются вне scope.

Публичные contract, story и SDK APIs получают русский KDoc; generated source редактируется только через processor.

## Risks / Trade-offs

- [Compose dependencies в `sandbox-core` увеличат classpath View consumers] → Проверить Android View builds; при реальной несовместимости вернуться к отдельному тонкому Compose contract module в следующем design revision.
- [Skiko byte-backed Font API является platform-specific] → Скрыть API в `wasmJsMain` и закрепить compile/render test на используемой Compose 1.8.2.
- [Некорректный font file может завершиться ошибкой внутри Skia при первом использовании] → Валидировать непустые bytes, не сообщать success до пробного render и покрыть invalid asset browser test.
- [Payload property shape может оказаться недостаточным для всех stateful UIKit overloads] → Ограничить PoC Button subset, сохранить неизвестные properties как ignored и расширять contract только по подтвержденным случаям.
- [Ручная Button factory дублирует знания из API metadata] → Использовать metadata как source для review/golden assertions; factory считается PoC reference, а не масштабируемым решением для всех компонентов.
- [ComponentKey values не namespaced] → Принять для Core PoC; namespace и compatibility migration решать вместе с plugin manifest/resolver.
- [Full font files увеличивают latency и память] → Кешировать bytes, `Font` и `FontFamily` по digest и загружать только faces, на которые ссылается текущий payload.

## Migration Plan

1. Расширить `preview-contract` additive models/schemas и fixtures; обновить текущих локальных consumers.
2. Переместить Compose renderer contract в `sandbox-core`, адаптировать `sandbox-compose` wrapper и сохранить работоспособность fixtures/demo.
3. Сделать generated registration public через `sandbox-ksp` и перегенерировать consumer output стандартной Gradle-задачей.
4. Добавить `preview-sdk-compose`, asset/theme preparation и Wasm font actual.
5. Реализовать ручную BasicButton factory и типизированный render path.
6. Добавить browser PoC/tests и проверить повторный payload.

Rollback выполняется удалением нового SDK/PoC и возвратом `ComposeBaseStory` в `sandbox-compose`; contract additions до публикации можно откатить вместе с fixtures. Если v1 contract уже опубликован, новые поля должны оставаться optional/additive либо потребуют новой protocol version.

## Open Questions

- Должен ли `digest` быть обязательным для remote font assets после PoC?
- Какой explicit fallback contract нужен при недоступном face: список family names, fallback asset faces или оба варианта?
- Достаточно ли текущего renderer-ready effective property representation для UIKit interaction states, либо потребуется отдельная typed модель до реализации Button factory?
- Следует ли после PoC сохранить Compose dependencies в `sandbox-core`, если измерения покажут заметное влияние на View consumers?
