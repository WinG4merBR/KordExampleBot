package com.wing4merbr.kordbot

import dev.kord.core.*
import dev.kord.core.entity.*
import dev.kord.core.event.gateway.ReadyEvent
import dev.kord.core.event.message.*
import dev.kord.gateway.Intent
import dev.kord.gateway.Intents

class BotClient {
    suspend fun main() {
        val client = Kord("<your-bot-token>") {
            Intents(Intent.Guilds, Intent.GuildMessages)
        }

        client.on<ReadyEvent> {
            println("Ready!")
        }

        client.on<MessageCreateEvent> {
           message.channel.createMessage("oie")
        }
        
        client.login();
    }
}