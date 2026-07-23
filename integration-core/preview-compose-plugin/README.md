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
await window.submitPreviewPayload(payload);
```

`payload` может быть JavaScript-объектом или сериализованной JSON-строкой:

```javascript
await window.submitPreviewPayload(JSON.stringify(payload));
```

Функция становится доступна после загрузки `index.html` и самостоятельно ожидает готовности
Wasm runtime.

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

Host должен дождаться события `load` у iframe перед первой отправкой. Следующий полный payload
заменяет предыдущие theme, component properties и example state без перезапуска Wasm application.

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

## Ограничения

- Реализован только `BasicButton`.
- Каждый update передаёт полный payload.
- WOFF/WOFF2 и variable-font axes не поддерживаются.
- Проверка доверенного origin, подпись artifact и publication pipeline пока не реализованы.
- Host отвечает за sandbox/CSP iframe и проверку совместимости manifest.
