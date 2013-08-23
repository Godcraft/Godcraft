package chapeau.godcraft;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;

public class CreativeTabGodcraft extends CreativeTabs {

	public CreativeTabGodcraft(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		// TODO Set apropriate block ID
		return Block.dirt.blockID;
	}
}
