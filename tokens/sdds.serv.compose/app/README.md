# SddsServ Compose Sandbox

Мультиплатформенная песочница компонентов SddsServ. Все лаунчеры используют общий
`SddsServSandboxApp`: на TV остаётся focus-driven navigation, а desktop-платформы
показывают постоянное меню на широком окне и управляемый drawer на узком.

## Перед запуском

Все Gradle-команды ниже нужно выполнять из корня репозитория. Для Android нужен
запущенный эмулятор или подключённое устройство. Для iOS и нативного macOS нужен
macOS с Xcode.

## Android

Самый удобный вариант — открыть репозиторий в Android Studio, выбрать конфигурацию
модуля `tokens:sdds.serv.compose:app` и нажать Run.

Либо установить debug-сборку на уже доступное устройство:

```bash
./gradlew :tokens:sdds.serv.compose:app:installDebug
```

После установки приложение называется **Sdds Serv**.

## iOS

Откройте в Xcode проект хоста:

```text
tokens/sdds.serv.compose/app/iosApp/SddsServSandboxHost.xcodeproj
```

Выберите схему `SddsServSandboxHost`, симулятор или устройство и нажмите Run.
Скрипт сборки Xcode самостоятельно собирает и подключает Kotlin framework.

## JVM Desktop

Это desktop-приложение Compose, запущенное в JVM. На macOS оно не является
нативным `.app`:

```bash
./gradlew :tokens:sdds.serv.compose:app:run
```

## Нативный macOS

Нативный launcher Kotlin/Native доступен для Apple Silicon (`macosArm64`):

```bash
# Собрать и запустить нативное debug .app
./gradlew :tokens:sdds.serv.compose:app:runDebugExecutableMacosArm64

# Собрать установочный образ .dmg
./gradlew :tokens:sdds.serv.compose:app:packageDmgNativeDebugMacosArm64
```

Задача запуска сама соберёт executable при необходимости. Для Intel Mac нативный
launcher пока не собирается.

## Web: Wasm

Основной web-launcher. Запускает локальный dev-сервер; адрес, как правило,
`http://localhost:8080/`, будет напечатан в консоли:

```bash
./gradlew :tokens:sdds.serv.compose:app:wasmJsBrowserDevelopmentRun
```

### Проверка mobile layout

Отдельной web-сборки для мобильных устройств нет: тот же Wasm-бандл адаптирует
интерфейс к ширине viewport. Откройте адрес dev-сервера в браузере, включите
Device Toolbar в DevTools (`⌘⇧M`), выберите устройство и перезагрузите страницу.

Production bundle:

```bash
./gradlew :tokens:sdds.serv.compose:app:wasmJsBrowserDistribution
```

Результат находится в `build/dist/wasmJs/productionExecutable`.

## Web: JavaScript

Compatibility launcher для браузеров без поддержки Kotlin/Wasm. Его нужно запускать
отдельно от Wasm, так как оба dev-сервера используют один порт:

```bash
./gradlew :tokens:sdds.serv.compose:app:jsBrowserDevelopmentRun
```

Production bundle:

```bash
./gradlew :tokens:sdds.serv.compose:app:jsBrowserDistribution
```

Результат находится в `build/dist/js/productionExecutable`.

## Ограничения

Нативный macOS launcher пока не выпускает universal binary, не включает signing /
notarization и не предназначен для App Store. Wasm и JavaScript — два независимых
web-bundle-а; автоматического переключения между ними во время работы нет.
