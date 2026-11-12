## 1. Загрузка SVG-ресурсов (`preview-sdk-compose`)

- [x] 1.1 `PreviewIconRegistry` хранит иконки из payload (`withSources`), без разбора имени в член `SddsIcons`
- [x] 1.2 `ICON_ASSET_PREFIX` и `SvgIconFactory` в `PreviewAssets.kt`
- [x] 1.3 `ComposePreviewRuntime` загружает ресурсы `icon:<имя>` до подготовки темы; ошибка одной иконки пропускает её
- [x] 1.4 Юнит-тесты: реестр (`PreviewIconRegistryTest`) и загрузка ресурсов (`SvgIconAssetsTest`: известная, битая, недоступная, чужой тип)

## 2. Плагин (`preview-compose-plugin`)

- [x] 2.1 `SkiaSvgIconFactory`: `SVGDOM` + `Painter` с кешем битмапа, тинт и альфа
- [x] 2.2 Подключить фабрику в `Main.kt`
- [x] 2.3 Удалить `generatePreviewIcons`, `preview-icons.txt` и зависимость `sdds-core:icons-compose`

## 3. Проверка

- [x] 3.1 Браузерный тест: иконки из SVG рисуются разными кадрами без предупреждений; битый SVG и недоступный файл дают `unknown_icon`
- [x] 3.2 Полный `previewPluginBrowserTest` (79 компонентов) без замечаний
- [x] 3.3 Размер wasm: 8 244 096 → 7 195 184 байт
- [x] 3.4 Проверка на локальном стенде DSB: иконки каталога, включая `OutlineBold`, рисуются в превью
- [ ] 3.5 [внешняя проверка] CORS и публичное чтение `icons/` бакета каталога на dev и prod
