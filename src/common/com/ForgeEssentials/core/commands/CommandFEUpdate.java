package com.ForgeEssentials.core.commands;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ICommandSender;

import com.ForgeEssentials.core.Version;

public class CommandFEUpdate extends ForgeEssentialsCommandBase{

	@Override
	public String getCommandName() {
		return "feupdate";
	}

	@Override
	public void processCommandPlayer(EntityPlayer player, String[] args) {
	}

	@Override
	public void processCommandConsole(ICommandSender sender, String[] args) {
		sender.sendChatToPlayer("Checking for updates...");
		Version.checkVersion();
		
	}

	@Override
	public String getSyntaxConsole() {
		return "/feupdate";
	}

	@Override
	public String getSyntaxPlayer(EntityPlayer player) {

		return null;
	}

	@Override
	public String getInfoConsole() {
		return "Check for an update to ForgeEssentials";
	}

	@Override
	public String getInfoPlayer(EntityPlayer player) {
	
		return null;
	}

	@Override
	public boolean canConsoleUseCommand() {
		return true;
	}

	@Override
	public boolean canPlayerUseCommand(EntityPlayer player) {
		return false;
	}

}
