# Compose Preview Plugin

Self-contained Wasm-плагин для отображения SDDS Compose-компонентов из полного
`PreviewPayload`. Плагин поддерживает все компоненты `uikit-compose` (79 компонентов api-меты); список лежит
в `components` manifest.

## Сборка

Из корня репозитория:

```bash
./gradlew -p integration-core :preview-compose-plugin:previewPluginArtifact
```

Готовый архив:

```text
integration-core/preview-compose-plugin/build/distributions/preview-compose-plugin.zip
```

Архив содержит:

- `index.html` — browser entrypoint;
- `preview-plugin.json` — manifest (собирается при сборке, см. «Как добавить компонент»);
- `api-meta.json` — api-мета `uikit-compose`, по которой сгенерированы фабрики плагина; её импортирует бэкенд DSB;
- `preview-compose-plugin.js` — загрузчик приложения;
- Kotlin/Wasm и Skiko Wasm binaries;
- `composeResources/` — Compose-ресурсы историй (иллюстрации и т.п.); без них истории, использующие ресурсы,
  падают при отрисовке.

## Публикация

Плагин публикует не этот репозиторий, а бэкенд design-system-builder (DSB): CI отправляет ему архив командой CLI,
а бэкенд за одну операцию кладёт файлы в хранилище, импортирует мету из `api-meta.json` архива и записывает билд как
активный. В `plasma-android` нет ключей хранилища и знания о нём.

```text
push в develop                        -> dev-бэкенд
релиз (publish-release, тег)          -> prom-бэкенд
workflow_dispatch (окружение и ref)   -> выбранное окружение
```

Workflow `publish-preview-plugin.yml` выполняет: проверку контракта (на релизном теге ошибка расхождения
останавливает публикацию), `jvmTest`, `previewPluginArtifact`, `previewPluginBrowserTest` (включая проверку состава и
идентификации артефакта), пробную отправку и отправку с `--apply`. Публикации в одно окружение идут последовательно.

Нужные секреты репозитория (отдельно для dev и prom): `DSB_API_URL_<ENV>`, `DSB_CLIENT_ID_<ENV>`,
`DSB_CLIENT_SECRET_<ENV>` (служебная учётка DSB с ролью публикации; выдаёт команда DSB). Если репозиторий DSB закрыт,
нужен ещё `DSB_CLI_READ_TOKEN` с правом чтения релизов. Публикация выключена, пока не заданы переменные
репозитория: на dev по push в `develop` — `DSB_PUBLISH_DEV_ENABLED=true`, на prom — `DSB_PUBLISH_PROM_ENABLED=true`
(когда бэкенд готов принимать плагин). Ручной запуск `workflow_dispatch` на dev переменной не ограничен. Версия CLI закреплена в workflow
(`DSB_CLI_VERSION`, релиз `cli-vX.Y.Z` репозитория DSB).

Повторный запуск для того же коммита безопасен: бэкенд отвечает «без изменений». Откат на прежний билд —
повторная публикация его коммита (`workflow_dispatch` с нужным `ref`): бэкенд снова делает его активным.

### Идентификация билда

Manifest содержит поля, которые бэкенд сверяет с архивом:

| Поле | Значение |
|---|---|
| `commit` | полный sha коммита сборки |
| `version` | первые 12 символов `commit`, идентификатор билда |
| `uikitComposeVersion` | версия из `sdds-core/uikit-compose/gradle.properties` |
| `apiMetaSha256` | sha256 файла `api-meta.json` из архива |

Версия `uikit-compose` — метка: плагин собирается из локальных исходников коммита, на `develop` они могут
опережать последний релиз. Точная привязка к мете — `apiMetaSha256`. Коммит определяется `git rev-parse HEAD`,
значение можно задать явно: `-PpreviewCommit=<sha>`.

### Локальная проверка публикации

Из корня репозитория:

```bash
./gradlew -p integration-core :preview-compose-plugin:previewPluginArtifact
```

Поднимите локальный контур DSB (`./setup-local.sh` в репозитории design-system-builder), затем отправьте архив.
Пробная отправка ничего не записывает; запись выполняется с `--apply`. Служебная учётка локального контура
задана в realm (`dsbuilder-preview-publisher`):

```bash
export DSBUILDER_CLIENT_ID=dsbuilder-preview-publisher
export DSBUILDER_CLIENT_SECRET=dev-preview-publisher-secret
dsbuilder preview-plugin publish --platform compose \
  --from integration-core/preview-compose-plugin/build/distributions/preview-compose-plugin.zip \
  --api-url http://localhost:8080 --apply
```

Файлы плагина попадают в MinIO контура (бакет `compose-preview`), а клиент DSB берёт адрес активного билда у
бэкенда. Для проверки плагина без бэкенда используйте раздачу архива и `VITE_COMPOSE_PREVIEW_PLUGIN_URL` клиента
(см. README клиента DSB).

## Размещение вручную

Для локальной отладки без бэкенда архив можно раздать любым статическим сервером. Распакуйте его в отдельный
каталог и публикуйте содержимое из одного URL:

```text
https://preview.example.com/compose/
├── index.html
├── preview-plugin.json
├── api-meta.json
├── preview-compose-plugin.js
├── composeResources/
└── *.wasm
```

Плагин необходимо открывать по HTTP/HTTPS. Запуск `index.html` через `file://` не поддерживается,
поскольку браузеру требуется загружать Wasm-файлы и font assets.

Для локальной проверки можно распаковать архив и запустить любой статический HTTP-сервер:

```bash
unzip integration-core/preview-compose-plugin/build/distributions/preview-compose-plugin.zip \
  -d /tmp/preview-compose-plugin
python3 -m http.server 8080 --directory /tmp/preview-compose-plugin
```

После этого плагин доступен по адресу `http://localhost:8080/`.

## Как добавить компонент

Компонент попадает в preview без кода в плагине: достаточно истории и записи в api-мете.

1. Компонент должен быть в `uikit-compose-api-meta.json` (его строит `uikit-compose`). Для каждой записи меты при сборке
   плагина генерируется фабрика стиля (задача `generateComposePreview` плагина Design System Builder, блок `dsBuilder.preview`):
   метод билдера выбирается по тем же правилам, что и в Theme Builder (общий файл `OverloadRules.kt`), вызовы порождаются
   как обычный код. Набор компонентов можно ограничить свойством `-PpreviewComponents=A,B`.
2. В `uikit-compose-fixtures` для компонента должна быть история `@Story(componentId = "<componentName из меты>")`.
   `componentId` совпадает с именем компонента в мете и может отличаться от `ComponentKey.value`
   (`CheckBox` и `Checkbox`). История без `componentId` остаётся в демо, но в preview не участвует.
3. `previewComponentsFrom` собирает компоненты плагина из записей `StoryRegistry.previewEntries()` и сгенерированных
   фабрик; `components` в `preview-plugin.json` генерируется из списка фабрик (шаблон в `src/manifest`).

Проверки: `StyleFactoryCoverageTest` сверяет мету, фабрики и истории (исключения перечислены в тесте с причиной),
браузерный тест рисует каждый компонент (галерея) и сверяет manifest с описаниями компонентов.

## Передача payload

Плагин принимает полный `PreviewPayload`, а не patch. Поддерживаются два способа подключения.

### Прямой вызов

Если host и плагин работают в одном window:

```javascript
const result = await window.submitPreviewPayload(payload);
if (result.type === "failure") {
  console.error(result.code, result.message);
}
```

`payload` может быть JavaScript-объектом или сериализованной JSON-строкой:

```javascript
await window.submitPreviewPayload(JSON.stringify(payload));
```

Функция становится доступна после загрузки `index.html`, самостоятельно ожидает Wasm runtime и
завершает Promise только после подготовки payload и применения актуального Compose state.
Результат — существующий `PreviewResult.Success` или `PreviewResult.Failure` с тем же
`requestId`.

Описание controls зарегистрированной story доступно независимо от render state:

```javascript
const result = await window.describePreviewComponent("BasicButton");
if (result.type === "success") {
  console.log(result.description.properties);
}
```

### iframe и postMessage

Host может загрузить плагин в iframe:

```html
<iframe
  id="compose-preview"
  src="https://preview.example.com/compose/index.html"
></iframe>
```

Полный payload передаётся сообщением типа `sdds.preview.payload`:

```javascript
const iframe = document.getElementById("compose-preview");

iframe.contentWindow.postMessage(
  {
    type: "sdds.preview.payload",
    payload,
  },
  "https://preview.example.com",
);
```

Событие iframe `load` не означает готовность Wasm. Host должен дождаться lifecycle message:

```javascript
window.addEventListener("message", (event) => {
  if (
    event.source === iframe.contentWindow &&
    event.data?.type === "sdds.preview.ready" &&
    event.data.protocolVersion === 1
  ) {
    // Plugin готов принять первый полный payload.
  }
});
```

После обработки plugin отправляет результат в исходный `event.source`, используя исходный
`event.origin` как `targetOrigin`:

```javascript
window.addEventListener("message", (event) => {
  if (event.source !== iframe.contentWindow) return;
  if (event.data?.type !== "sdds.preview.result") return;
  const result = event.data.result;
  console.log(result.requestId, result.type);
});
```

Для получения description через iframe host отправляет отдельный коррелированный request:

```javascript
iframe.contentWindow.postMessage(
  {
    type: "sdds.preview.describe",
    requestId: "describe-1",
    componentId: "BasicButton",
  },
  "https://preview.example.com",
);

window.addEventListener("message", (event) => {
  if (event.source !== iframe.contentWindow) return;
  if (event.data?.type !== "sdds.preview.description") return;
  console.log(event.data.result.requestId, event.data.result);
});
```

Describe requests имеют собственный lifecycle и не отменяют render requests.

Каждый host request должен иметь уникальный непустой `requestId`. Следующий полный payload
заменяет предыдущие theme, component properties и example state без перезапуска Wasm application.
Если более старый запрос заканчивает подготовку после нового, он получает failure с code
`superseded` и не заменяет актуальный render.

## Font assets

Font-family tokens могут ссылаться на TTF/OTF assets из payload:

```json
{
  "assets": [
    {
      "id": "font.body.regular",
      "type": "TTF",
      "url": "https://assets.example.com/fonts/body-regular.ttf",
      "digest": "sha256:..."
    }
  ]
}
```

URL загружается браузером через `fetch`. Сервер assets должен:

- разрешать CORS для origin плагина;
- возвращать успешный HTTP status;
- отдавать непустое содержимое TTF/OTF.

Если обязательный font недоступен и `allowFallback=false`, подготовка payload завершается ошибкой.
При `allowFallback=true` используется `FontFamily.Default`.

## Manifest

`preview-plugin.json` описывает entrypoint, protocol version, bridge и поддержанные компоненты.
Перед подключением host может прочитать manifest:

```javascript
const manifest = await fetch(
  "https://preview.example.com/compose/preview-plugin.json",
).then((response) => response.json());
```

Текущий идентификатор plugin: `sdds.compose.preview`, версия Preview Protocol: `1`.
Список `components` формируется при сборке из сгенерированных фабрик, вручную его править не нужно.
`payloadBridge` объявляет direct render/describe API и transport message types:
`sdds.preview.payload`, `sdds.preview.ready`, `sdds.preview.result`,
`sdds.preview.describe` и `sdds.preview.description`.

## Проверка production artifact

Focused JVM tests, artifact и browser lifecycle запускаются из корня репозитория:

```bash
./gradlew -p integration-core \
  :preview-compose-plugin:jvmTest \
  :preview-compose-plugin:previewPluginArtifact \
  :preview-compose-plugin:previewPluginBrowserTest
```

Browser test использует headless Chrome (с программным WebGL) и настоящий OTF asset. Путь к Chrome можно
переопределить через `-PpreviewChromePath=/path/to/chrome`.

Кроме функциональных проверок тест запускает галерею: каждый компонент из manifest отрисовывается с пробными
значениями свойств из api-меты, проверяются успех, отсутствие предупреждений и непустой кадр, ошибки страницы
и застывший рендер. Скриншоты и страница `index.html` для просмотра лежат в
`integration-core/preview-compose-plugin/build/browser-test/gallery/`. Тест падает со списком всех проблемных компонентов.

## Ограничения

- Иконки (`ImageSource`) и тени (`ShadowAppearance`) в preview пока не поддерживаются: такие свойства
  пропускаются с предупреждением `unsupported_property`.
- Исключение при композиции компонента (например, нехватка ресурса) останавливает рендер до перезагрузки
  страницы: результат `success` отправляется после применения состояния, до отрисовки.
- Каждый update передаёт полный payload.
- WOFF/WOFF2 и variable-font axes не поддерживаются.
- Проверка доверенного origin, подпись artifact и publication pipeline пока не реализованы.
- Ready message временно отправляется parent с `targetOrigin="*"`, поскольку production origin
  allowlist относится к отдельному trust-policy change. Payload results всегда направляются
  только исходному sender/origin.
- Host отвечает за sandbox/CSP iframe, проверку `event.source`, `event.origin` и совместимости
  manifest.
