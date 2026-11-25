## Why

Compose preview plugin рисует иконку по имени из конфигурации (`disclosure.down.fill.16`), находя член `SddsIcons` в реестре,
который генерируется из вручную ведомого списка `preview-icons.txt`. У этой схемы три недостатка:

- В wasm нет рефлексии, поэтому каждая иконка реестра вшивается в плагин как исполняемый код. 351 иконка добавляют около
  1,05 МБ (≈158 КБ в zip); весь набор `SddsIcons` (4326 иконок) довёл бы плагин до 23 МБ, поэтому список ограничен
  стартовым набором.
- Список не синхронизирован с каталогом иконок Design System Builder (DSB, change `add-icon-catalog`): иконка, которую
  дизайнер выбрал в билдере, но которой нет в списке, рисуется иконкой по умолчанию, а добавить её можно только правкой
  репозитория и пересборкой плагина.
- Android-набор `sdds-icons-compose` отстаёт от web-набора `@salutejs/sdds-icons`, из которого собран каталог DSB:
  у части иконок разный рисунок, а начертания `OutlineBold` в Android-наборе нет совсем. Превью показывало не то,
  что видит дизайнер в билдере.

Каталог DSB уже хранит SVG каждой иконки в S3, а Skia SVG (`SVGDOM`) входит в `skiko.wasm`, который плагин везёт в любом случае.

## What Changes

- Плагин рисует иконки из SVG-ресурсов payload: `assets[]` с `type: SVG` и идентификатором `icon:<имя>`, где `<имя>` —
  значение свойства иконки в формате данных. Свойство остаётся `literal`-строкой.
- Новый `SkiaSvgIconFactory` (`wasmJsMain`) разбирает SVG через `org.jetbrains.skia.svg.SVGDOM` и рисует через `Painter`
  с кешем битмапа по размеру; тинт и альфа применяются как у обычной иконки.
- `ComposePreviewRuntime` загружает такие ресурсы тем же `PreviewAssetResolver`, что и шрифты, до подготовки темы.
  Иконка, которую не удалось скачать или разобрать, пропускается и даёт предупреждение `unknown_icon`.
- **BREAKING (внутренний)**: из плагина убраны зависимость `sdds-core:icons-compose`, Gradle-задача `generatePreviewIcons`,
  файл `preview-icons.txt` и разбор имени в член `SddsIcons` (`iconMemberName`, `iconMemberNames`). Клиент DSB обязан
  присылать SVG-ресурсы иконок (он делает это с change `add-icon-catalog`); без них иконка рисуется по умолчанию.
- Браузерный тест плагина проверяет иконки из SVG: разные кадры, отсутствие предупреждений, `unknown_icon` для битого и
  отсутствующего файла.

Не входит: хранение и выдача SVG (это каталог DSB), правила разрешения значения без начертания (`plus.16` → `plus.outline.16`,
делает клиент DSB), рисование иконок вне Compose preview (Android-библиотека `sdds-icons-compose` не меняется).

## Capabilities

### New Capabilities

Нет.

### Modified Capabilities

- `compose-preview-icons`: источник иконок — SVG-ресурсы payload, а не реестр `SddsIcons`; плагин не содержит набора иконок.

## Impact

- `integration-core/preview-compose-plugin`: `build.gradle.kts` (удалена генерация реестра и зависимость от `icons-compose`),
  новый `SkiaSvgIconFactory.kt`, `Main.kt`, браузерный тест и его фикстуры. Размер wasm: 8,24 МБ → 7,20 МБ.
- `integration-core/preview-sdk-compose`: `PreviewIconRegistry` хранит только иконки из payload, `ComposePreviewRuntime`
  принимает `SvgIconFactory`, константа `ICON_ASSET_PREFIX`.
- Публичные API библиотек, токены и документация не затрагиваются.
- Зависимость: клиент DSB присылает ресурсы `icon:<имя>` с адресами SVG каталога; хранилище отдаёт `icons/` с CORS для источника плагина.
- Валидация: `:preview-sdk-compose:jvmTest`, `previewPluginBrowserTest`, проверка на локальном стенде DSB.
