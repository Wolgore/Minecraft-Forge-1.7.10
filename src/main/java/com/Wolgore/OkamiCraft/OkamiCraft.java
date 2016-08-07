package com.Wolgore.OkamiCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "oc", name = "Okami Craft", version = "1.0")
public class OkamiCraft {

	public static Item itemStrayBead;
	public static Block blockPraisorium;
	

    public static final String MODID = "oc";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	//Item/Block init and registering
    	//Config handling
    	itemStrayBead = new ItemStrayBead();
    	itemStrayBead.setUnlocalizedName("ItemStrayBead"); //item.itemStrayBead.name
    	itemStrayBead.setTextureName("oc:Stray_Bead");
    	blockPraisorium = new BlockPraisorium(Material.rock).setBlockName("BlockPraisorium");
    	
    	
    	
    	
    	
    	
    	GameRegistry.registerItem(itemStrayBead, itemStrayBead.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(blockPraisorium, blockPraisorium.getUnlocalizedName().substring(5));
    	System.out.println(blockPraisorium.getUnlocalizedName().substring(5));
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	//Proxy, TileEntity, entity, GUI and Packet Registering
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
    
}
