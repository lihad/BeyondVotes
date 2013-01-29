package Lihad.BeyondVotes;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.ChatColor;

public class SpamDecorator {
	public static Map<String,ChatColor> color_map = new HashMap<String,ChatColor>();
	static{
		color_map.put("&a", ChatColor.GREEN);
		color_map.put("&b", ChatColor.AQUA);
		color_map.put("&c", ChatColor.RED);
		color_map.put("&d", ChatColor.LIGHT_PURPLE);
		color_map.put("&e", ChatColor.YELLOW);
		color_map.put("&f", ChatColor.WHITE);
		color_map.put("&0", ChatColor.BLACK);
		color_map.put("&1", ChatColor.DARK_BLUE);
		color_map.put("&2", ChatColor.DARK_GREEN);
		color_map.put("&3", ChatColor.DARK_AQUA);
		color_map.put("&4", ChatColor.DARK_RED);
		color_map.put("&5", ChatColor.DARK_PURPLE);
		color_map.put("&6", ChatColor.GOLD);
		color_map.put("&7", ChatColor.GRAY);
		color_map.put("&8", ChatColor.DARK_GRAY);
		color_map.put("&9", ChatColor.BLUE);
		color_map.put("&m", ChatColor.MAGIC);

		color_map.put("&o", ChatColor.BOLD);
		color_map.put("&u", ChatColor.UNDERLINE);
		color_map.put("&i", ChatColor.ITALIC);
		color_map.put("&s", ChatColor.STRIKETHROUGH);

	}
	
	public static String[] decor(String string){
		String build = string;
		for(int i = 0; i<color_map.size(); i++){
			String[] broke = build.split(color_map.keySet().toArray()[i].toString());
			String rebuilt = broke[0];
			for(int k = 1; k<broke.length;k++){
				rebuilt = rebuilt+color_map.get(color_map.keySet().toArray()[i])+broke[k];
			}
			build=rebuilt;
		}
		return build.split("/");
	}
}
