package com.discord.bots.commands;

import com.discord.bots.Main;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Massping implements MessageCreateListener {

    int num = 0;

    @Override
    public void onMessageCreate(MessageCreateEvent message) {

        if(message.getMessageContent().equalsIgnoreCase(Main.Prefix + "massping")){

            message.getChannel().sendMessage("Mass pinging is starting...");

            while(num < 100){
                message.getChannel().sendMessage("@everyone");
                num++;
            }


        }


    }
}
