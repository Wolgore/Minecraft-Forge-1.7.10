package com.Bebo.RomanceDawn;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGumGumBazooka extends Item{

	public ItemGumGumBazooka(){
		super();
		setMaxStackSize(1);
		setTextureName("romancedawn:bazooka");
		setUnlocalizedName("ItemGumGumBazooka");
		setCreativeTab(RomanceDawn.rd_creative_tab);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item,World w,EntityPlayer player){

		
		
		
		return item;
	}
}
