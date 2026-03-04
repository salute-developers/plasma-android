---
title: AvatarGroup
---

Контент AvatarGroup формируется с помощью [Avatar](AvatarUsage.md#avatar).

```xml
<!-- @sample: com/sdds/uikit/fixtures/AvatarGroup_Simple.xml -->
```

## Стиль AvatarGroup

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки (пример выше).  
Для настройки стиля Avatar в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_avatarStyleOverlay|стиль Avatar, которые будут в группе|reference|
|sd_itemOffset|смещение Avatar относительно друг друга|dimension|
|sd_itemSpacing|расстояние между Avatar, влияет на толщину выреза аватара|dimension|
