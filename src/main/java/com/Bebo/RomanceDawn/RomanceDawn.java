package com.Bebo.RomanceDawn;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs; 
import cpw.mods.fml.relauncher.Side; 
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "romancedawn", name = "Romance Dawn", version = "0.1")
public class RomanceDawn {

    public static final String MODID = "romancedawn";
    public static final String VERSION = "0.1";
	public static Item itemgumgumpistol;
	public static Item itemgumgumgatling;
	public static Item itemgumgumbazooka;
	public static Item itemstrawhat;
     
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	//Item/Block init and registering
    	//Config handling
    	
    	itemgumgumpistol = new ItemGumGumPistol();
    	itemgumgumbazooka = new ItemGumGumBazooka();
    	itemgumgumgatling = new ItemGumGumGatling();
    	itemstrawhat = new ItemStrawHat();
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabCustom", "en_US", "My Custom Tab");
    	
    	
    	
    	GameRegistry.registerItem(itemgumgumpistol, "GumGumPistol");
    	GameRegistry.registerItem(itemgumgumgatling, "GumGumGatling");
    	GameRegistry.registerItem(itemgumgumbazooka, "GumGumBazooka");
    	GameRegistry.registerItem(itemstrawhat,"StrawHat");
    	
    	ItemStack dirtStack = new ItemStack(Block.getBlockFromName("dirt"));
    	GameRegistry.addRecipe(new ItemStack(itemgumgumpistol),
    			   "A",
    			   'A',dirtStack);
    	GameRegistry.addRecipe(new ItemStack(itemgumgumgatling),
 			   "AA",
 			   'A',dirtStack);
    	GameRegistry.addRecipe(new ItemStack(itemgumgumbazooka),
 			   "AAA",
 			   'A',dirtStack);
    	GameRegistry.addRecipe(new ItemStack(itemstrawhat),
  			   "AA",
  			   "AA",
  			   'A',dirtStack);
    	//GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
    	//System.out.println(blockPraisorium.getUnlocalizedName().substring(5));
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	//Proxy, TileEntity, entity, GUI and Packet Registering
    	
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
	
    public static CreativeTabs rd_creative_tab = new CreativeTabs("tab.romancedawn") {
 	   @Override
 	   @SideOnly(Side.CLIENT)
 	   public Item getTabIconItem() {
 	      return itemstrawhat;
 	   }
 	   
 };
	
	
}
