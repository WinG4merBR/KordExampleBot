package com.wing4merbr.discordbot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.JDAInfo;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class BotClient extends ListenerAdapter
{
    public static void main(String[] args) throws LoginException
    {
        JDABuilder.createLight("bottoken", GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new BotClient())
                .setActivity(Activity.playing("uwu"))
                .build();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message msg = event.getMessage();
        if (msg.getContentRaw().equals("<@!889918153931517983>")) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("da oi");
        }
    }

    @Override
    public void onReady(ReadyEvent event) {
        System.out.println("oie");
    }
}
