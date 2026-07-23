# Compose Preview Plugin

Self-contained Wasm-плагин для отображения SDDS Compose-компонентов из полного
`PreviewPayload`. Текущая версия поддерживает `BasicButton`.

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
- `preview-plugin.json` — manifest;
- `preview-compose-plugin.js` — загрузчик приложения;
- Kotlin/Wasm и Skiko Wasm binaries.

## Размещение

Распакуйте архив в отдельный каталог web-сервера и публикуйте его содержимое из одного URL:

```text
https://preview.example.com/compose/
├── index.html
├── preview-plugin.json
├── preview-compose-plugin.js
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
`payloadBridge` объявляет direct API и три transport message types:
`sdds.preview.payload`, `sdds.preview.ready` и `sdds.preview.result`.

## Проверка production artifact

Focused JVM tests, artifact и browser lifecycle запускаются из корня репозитория:

```bash
./gradlew -p integration-core \
  :preview-compose-plugin:jvmTest \
  :preview-compose-plugin:previewPluginArtifact \
  :preview-compose-plugin:previewPluginBrowserTest
```

Browser test использует headless Chrome и настоящий OTF asset. Путь к Chrome можно переопределить
через `-PpreviewChromePath=/path/to/chrome`.

## Ограничения

- Реализован только `BasicButton`.
- Каждый update передаёт полный payload.
- WOFF/WOFF2 и variable-font axes не поддерживаются.
- Проверка доверенного origin, подпись artifact и publication pipeline пока не реализованы.
- Ready message временно отправляется parent с `targetOrigin="*"`, поскольку production origin
  allowlist относится к отдельному trust-policy change. Payload results всегда направляются
  только исходному sender/origin.
- Host отвечает за sandbox/CSP iframe, проверку `event.source`, `event.origin` и совместимости
  manifest.
