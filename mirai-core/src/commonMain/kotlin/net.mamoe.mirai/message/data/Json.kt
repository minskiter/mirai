/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.message.data

import net.mamoe.mirai.utils.MiraiExperimentalAPI
import net.mamoe.mirai.utils.SinceMirai

/**
 * Json 消息.
 *
 * @see LightApp 一些消息实际上是 [LightApp]
 */
@SinceMirai("0.27.0")
@OptIn(MiraiExperimentalAPI::class)
class JsonMessage(override val content: String) : RichMessage {
    companion object Key : Message.Key<JsonMessage>

    // serviceId = 1
    override fun toString(): String = content
}