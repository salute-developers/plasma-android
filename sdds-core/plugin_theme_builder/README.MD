## Плагин ThemeBuilder

Плагин генерирует тему и токены на основе метаданных. Источником данных служит zip архив, который содержит:
- meta.json файл с мета информацией о токенах.
- папку android, содержащую файлы, начинающиеся с префикса "android_". Файлы содержат значения токенов для соответствующих ключей из meta.json.

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
    compose()
    ktPackage("com.example.app.themebuilder.tokens")
}
```
</details>
<br>
Минимальная настройка должна содержать источник темы themeSource и один из целевых фреймворков view | compose.

## Конфигурация

#### `themeSource`
Источник для скачивания архива с темой. Возможны два варианта: по названию и номеру версии (предпочтительный способ) и по url. Если указать только название, будет скачана latest версия архива с мета данными темы.

<details>
<summary>Примеры настройки themeSource</summary>

```kotlin
themeSource(name = "stylesSalute") // version = "latest"
```
```kotlin
themeSource(name = "stylesSalute", version = "0.1.0")
```
```kotlin
themeSource(url = "https://example.com/themes/theme.zip")
```
</details>

#### `view` (optional)
Опциональная настройка генерации тем для view фреймворка. Можно указать список наследуемых тем. 
Если не указать, то сгенерированная тема для view не будет иметь parent'a и будет представлена в двух директориях res/values и res/values-night.

<details>
<summary>Примеры настройки view</summary>

```kotlin
view { 
    themeParents {
        materialComponentsTheme() // Наследуемся от Theme.MaterialComponents и генерируем единственную тему c темными токенами
        materialComponentsTheme("DayNight") // Наследуемся от Theme.MaterialComponents.DayNight
        appCompatTheme("Light.NoActionBar") // Наследуемся от Theme.AppCompat.Light.NoActionBar и генерируем единственную тему cо светлыми токенами
        customTheme("Theme.App", ViewThemeType.DARK_LIGHT) // Наследумся от Theme.App и генерируем тему для двух режимов
        customTheme("Theme.Custom", ViewThemeType.DARK) // Наследумся от Theme.Custom и генерируем единственную тему c темными токенами
    }
}
```
```kotlin
view() // Тема не будет иметь parent'a
```
</details>

#### `compose` (optional)
Опциональная настройка генерации темы для Compose.

<details>
<summary>Пример настройки compose</summary>

```kotlin
compose()
```
</details>

#### `ktPackage` (optional)
Для генерации темы любого фреймворка необходимо указать ktPackage - пакет для генерируемых kotlin-файлов. Итоговый пакет будет состоять из указанного ktPackage + ".compose" или ".vs".

<details>
<summary>Пример настройки пакета</summary>

```kotlin
ktPackage("com.example.app.themebuilder.tokens")
```
</details>

#### `resourcesPrefix` (optional)
Префикс для названий ресурсов. Можно не указывать, если он уже указан в android конфигурации (см. пример выше).

<details>
<summary>Пример настройки resourcesPrefix</summary>

```kotlin
resourcesPrefix(prefix = "ds")
```
</details>

#### `mode` (optional) 
Режим работы плагина - генерируются только токены либо тема с токенами. По умолчанию генерируются только токены.

<details>
<summary>Пример настройки mode</summary>

```kotlin
mode(mode = ThemeBuilderMode.TOKENS_ONLY) // сгенерируются только токены
```
```kotlin
mode(mode = ThemeBuilderMode.THEME) // сгенерируются токены и темы
```
</details>

#### `paletteUrl` (optional) 
Ссылка для скачивания палитры цветов.

<details>
<summary>Пример настройки paletteUrl</summary>

```kotlin
paletteUrl(url = "https://example.com/themes/color-palette.json")
```
</details>

## Использование
Необходимо запустить сборку модуля, куда был подключен плагин:

 `./gradlew :your_module:assemble`

Плагин скачает архив с темой из источника, указанного в `themeSource` и сгенерирует токены/темы под указанные фреймворки. По пути `your_module/build/generated/` должны появиться папки:
- `your_module/build/generated/theme-builder` - Kotlin-файлы темы. Может содержать токены и тему для compose, а также токены градиентов для view.
- `your_module/build/generated/theme-builder-res` - ресурсы темы. Содержит токены и темы для view, а также ресурсы шрифтов для compose.

