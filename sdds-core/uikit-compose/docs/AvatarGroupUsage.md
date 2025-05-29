# Package com.sdds.compose.uikit

## AvatarGroup

Контент AvatarGroup формируется с помощью функций avatar(), avatars() и counter() из скоупа AvatarGroupScope.
Counter - счетчик Avatar's, которые не отображаются на экране.

```kotlin
AvatarGroup(
    style = AvatarGroup.S.style(),
    threshold = 1,
) 
    avatar {
       Avatar(
           style = Avatar.S.style(),
           status = AvatarStatus.Active,
           placeholder = AvatarPlaceholder.Name("Michael Scott"),
       )
}
counter {
    AvatarCounter(3)
}     
```

## Стиль AvatarGroup

Стиль AvatarGroup можно настроить с помощью AvatarGroupStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
AvatarGroupStyle.builder()
.dimensions {
    itemSpacing(2.0.dp)
    itemOffset(16.0.dp)
}
.avatarStyle(Avatar.S.style())
.style()
```
