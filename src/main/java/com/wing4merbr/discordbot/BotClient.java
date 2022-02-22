package com.wing4merbr.discordbot;

import net.dv8tion.jda.api.JDABuilder;
import java.io.IOException;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class BotClient {
    public static void main(String[] args) throws IOException, LoginException {
        JDABuilder client = JDABuilder.createDefault(token);

        client.setActivity(Activity.playing("Made in Java using JDA"));
        client.setStatus(OnlineStatus.DO_NOT_DISTURB);
        client.build();
    }
}
