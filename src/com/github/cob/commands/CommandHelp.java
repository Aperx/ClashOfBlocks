package com.github.cob.commands;

import com.github.cob.enums.EnumInventories;
import com.not2excel.api.command.CommandHandler;
import com.not2excel.api.command.CommandListener;
import com.not2excel.api.command.objects.CommandInfo;
import org.bukkit.entity.Player;

public class CommandHelp implements CommandListener
{

    @CommandHandler(command = "cob.help", permission = "cob.help")
    public void helpCommand(CommandInfo args)
    {
        Player p = args.getPlayer();
        if (p == null)
        { return; }
       
        p.openInventory(EnumInventories.MAIN_HELP.getInventory().getInventory());
    }
}
