package com.sdds.plugin.themebuilder.internal.serializer

import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.FontToken
import com.sdds.plugin.themebuilder.internal.token.LinearGradientToken
import com.sdds.plugin.themebuilder.internal.token.RadialGradientToken
import com.sdds.plugin.themebuilder.internal.token.RoundedShapeToken
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.SweepGradientToken
import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

/**
 * Объект сериализации
 * @author Малышев Александр on 07.03.2024
 */
object Serializer {

    /**
     * Экземпляр сериализации json
     */
    val instance: Json = Json {
        ignoreUnknownKeys = true
        serializersModule = SerializersModule {
            polymorphic(Token::class) {
                subclass(ColorToken::class)
                subclass(LinearGradientToken::class)
                subclass(RadialGradientToken::class)
                subclass(SweepGradientToken::class)
                subclass(ShadowToken::class)
                subclass(RoundedShapeToken::class)
                subclass(TypographyToken::class)
                subclass(FontToken::class)
            }
        }
    }
}
