## 1. `integration-core:preview-contract` — component description

- [x] 1.1 Добавить runtime-neutral модели `PreviewComponentDescription`,
  `PreviewExamplePropertyDescription` и коррелированный
  `PreviewComponentDescriptionResult` с русским KDoc.
- [x] 1.2 Поддержать property types string, boolean, int, float и single-choice с typed default
  values и variants.
- [x] 1.3 Добавить Draft 2020-12 JSON Schema, canonical positive/negative fixtures и стабильный
  `$id` для component description result.
- [x] 1.4 Добавить schema/Kotlin serialization round-trip и semantic validation tests.

## 2. `integration-core:preview-sdk-compose` — story descriptor

- [x] 2.1 Расширить `ComposePreviewComponent` description API без изменения render preparation.
- [x] 2.2 Реализовать mapping `Property.String/Boolean/Int/Float/SingleChoiceProperty` в
  runtime-neutral descriptors из `propertiesProducer.getProperties(defaultState)`.
- [x] 2.3 Исключать properties с `enabled=false`, `UiState.variant` и `UiState.appearance`.
- [x] 2.4 Валидировать уникальность names, непустые single-choice variants и совместимость
  default value.
- [x] 2.5 Добавить `ComposePreviewRuntime.describe(componentId, requestId)` и failure
  `unknown_component`.
- [x] 2.6 Добавить tests exact `BasicButtonStory` descriptor и отсутствие изменений render
  state при describe.

## 3. `integration-core:preview-compose-plugin` — describe bridge

- [x] 3.1 Экспортировать Promise-compatible direct API `describePreviewComponent(componentId)`.
- [x] 3.2 Добавить коррелированные `sdds.preview.describe` и `sdds.preview.description` messages
  с проверкой source/origin и отдельным pending lifecycle.
- [x] 3.3 Расширить `preview-plugin.json` direct API и message types describe operation без
  изменения Preview Protocol version.
- [x] 3.4 Обновить README примерами direct/iframe description requests и result handling.
- [x] 3.5 Добавить unit/browser tests success, unknown component, duplicate request и cleanup.

## 4. `integration-core:preview-compose-plugin` — viewport

- [x] 4.1 Удалить служебный `BasicText` empty state и рендерить пустой прозрачный viewport до
  первого успешного payload.
- [x] 4.2 Обернуть prepared content в полноразмерный `Box` с `Alignment.Center`.
- [x] 4.3 Зафиксировать transparent background `html`, `body`, `#root` для empty state и
  применять `surface.background` к полноразмерному Compose root после успешного payload.
- [x] 4.4 Добавить production browser test применения payload background и центрирования content
  по canvas pixels/bounds.

## 5. End-to-end validation

- [x] 5.1 Проверить, что descriptor `BasicButtonStory` содержит только `label`, `value`, `icon`,
  `spacing`, `hasFixedWidth`, `enabled`, `loading` с корректными types/defaults/variants.
- [x] 5.2 Для каждого свойства descriptor отправить совместимый `example.props` payload и
  получить success после применения `StateTransformer`.
- [x] 5.3 Собрать self-contained artifact через
  `./gradlew -p integration-core :preview-compose-plugin:previewPluginArtifact` и проверить
  manifest/resources.
- [x] 5.4 Выполнить focused tests `preview-contract`, `preview-sdk-compose`,
  `preview-compose-plugin`, browser test, Detekt и Spotless.
- [x] 5.5 Подтвердить, что variation schema, style factory, payload assembly, client UI и
  publication pipeline не изменены этим change.
