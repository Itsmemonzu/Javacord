package com.discord.bots;

import com.discord.bots.commands.Massping;
import com.discord.bots.commands.Ping;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static String Prefix = "!";

    public static void main(String[] args){

        DiscordApi Bot = new DiscordApiBuilder().setToken(System.getenv().get("TOKEN")).login().join();

        Bot.addListener(new Ping());

        System.out.println("Bot is online!");

    }

}
