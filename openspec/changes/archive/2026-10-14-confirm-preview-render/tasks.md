## 1. Plugin

- [x] 1.1 `PendingRenderResults` и тесты (`commonTest`).
- [x] 1.2 Подтверждение отрисовки в `PreviewViewport`; успех уходит после `confirm`.
- [x] 1.3 Обработка `error` и `unhandledrejection` в `index.html`: `render_crashed`, затем `plugin_crashed`.
- [x] 1.4 Browser-тест галереи кликает по каждому из 79 компонентов и проверяет, что плагин остался живым
  (нет ошибок страницы, повторный render успешен). Фильтр `GALLERY_ONLY` для отладки одного компонента.
- [x] 1.5 `PreviewStateOwner`: локальный владелец состояния story в `TypedPreparedComposePreview.Content`.
- [x] 1.6 Browser-тест на сбой layout: payload с размером, который не представить в `Constraints`, даёт
  `render_crashed`, следующий payload — `plugin_crashed`. Тест нашёл дефект: отказы, найденные в `index.html` до
  передачи в Kotlin (в том числе `invalid_payload`), возвращались значением promise, но хосту сообщением не уходили.
