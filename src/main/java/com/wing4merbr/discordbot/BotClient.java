package com.wing4merbr.discordbot;

import net.dv8tion.jda.api.JDABuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.EventListener;
import java.util.List;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class BotClient {
    public static void main(String[] args) throws IOException, LoginException {
        JDABuilder client = JDABuilder.createDefault("ODg5OTE4MTUzOTMxNTE3OTgz.YUoO3Q.gGImDxnxJVb0gFyCVQgOzhnTlsQ");

        client.setActivity(Activity.playing("Made in Java using JDA"));
        client.setStatus(OnlineStatus.DO_NOT_DISTURB);
        client.build();
    }
}
