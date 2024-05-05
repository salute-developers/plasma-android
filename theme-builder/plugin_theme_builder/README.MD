### Плагин ThemeBuilder

Плагин генерирует тему и токены на основе метаданных.

## Установка
<details>
<summary>Добавить зависимость в gradle</summary>

```groovy
[plugins]
themebuilder = { id = "TBD", version.ref = "TBD" }
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

Далее в `build.gradle` необходимо сконфигурировать плагин через экстеншн `ThemeBuilderExtension`. В нем указать:

- `themeSource`, источник для скачивания архива с темой. Возможны два варианта: по названию и номеру версии (предпочтительный способ) и по url. Указывается с помощью функций `withNameAndVersion()` и `withUrl()`.
- `target` -  `COMPOSE`|`VIEW_SYSTEM`|`ALL`
- `packageName` - пакет для темы Compose, если указан таргет `ALL` или `COMPOSE`
- `resourcesPrefix` - префикс для названий ресурсов, если таргет `ALL` или `VIEW_SYSTEM`. Можно не указывать, если он уже указан в android конфигурации (см. пример)

<details>
<summary>Пример</summary>

```kotlin
plugins {
	...
	id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.example.app.themebuilder"
    resourcePrefix = "thmbldr"
}

configure<ThemeBuilderExtension> {
    themeSource.set(withNameAndVersion(name = "stylesSalute", version = "0.1.0"))
    target.set(ThemeBuilderTarget.ALL)
    packageName.set("com.example.app.themebuilder.tokens")
}
```
</details>

## Использование
Запускаем `./gradlew :your_module:assemble`. 

Плагин скачает архив с темой из источника, указанного в  `themeSource` и сгенерирует темы под таргеты, указанные в `target`. По пути `your_module/build/generated/` должны появиться папки:
 - `your_module/build/generated/theme-builder` - тема для Compose
 - `your_module/build/generated/theme-builder-res` - тема для ViewSystem