### Плагин ThemeBuilder

Плагин генерирует тему и токены на основе метаданных.

## Установка
<details>
<summary>Добавить зависимость в gradle</summary>

```groovy
[plugins]
themebuilder = { id = "io.github.salute-developers.theme-builder-plugin" }
```
</details>

<details>

<summary>Подключить плагин в build.gradle модуля</summary>

```kotlin
plugins {
	id(libs.plugins.themebuilder.get().pluginId)
}
```
</details>
<br>

Далее в `build.gradle` необходимо сконфигурировать плагин:

<details>
<summary>Пример конфигурации для view и compose</summary>

```kotlin
plugins {
	...
	id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.example.app.themebuilder"
    resourcePrefix = "thmbldr"
}

themeBuilder {
    themeSource(name = "stylesSalute", version = "0.1.0")
    view(parentThemeName = "Sdds.Theme")
    compose(ktPackage = "com.example.app.themebuilder.tokens")
}
```
</details>
<br>
Минимальная настройка должна содержать источник темы themeSource и один из целевых фреймворков view | compose.

### Более подробно о настройках:

- `themeSource(name, version)` - источник для скачивания архива с темой. Возможны два варианта: по названию и номеру версии (предпочтительный способ) и по url.
- `view(parentThemeName)` настройка генерации темы для view фреймворка. Можно указать parentThemeName - название родительской темы, от которой будет унаследована генерируемая тема.
- `compose(ktPackage)` - настройка генерации темы для Compose. Нужно указать ktPackage - пакет для генерируемых kotlin-файлов
- `resourcesPrefix(prefix)` - префикс для названий ресурсов. Можно не указывать, если он уже указан в android конфигурации (см. пример выше)

## Использование
Запускаем `./gradlew :your_module:assemble`.

Плагин скачает архив с темой из источника, указанного в `themeSource` и сгенерирует темы под указанные фреймворки. По пути `your_module/build/generated/` должны появиться папки:
- `your_module/build/generated/theme-builder` - тема для Compose
- `your_module/build/generated/theme-builder-res` - тема для ViewSystem