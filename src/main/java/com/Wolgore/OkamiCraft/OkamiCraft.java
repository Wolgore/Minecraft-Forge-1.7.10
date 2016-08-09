package com.Wolgore.OkamiCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.Bebo.RomanceDawn.RomanceDawn;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "oc", name = "Okami Craft", version = "1.0")
public class OkamiCraft {

	public static Item itemStrayBead;
	public static Item itemPraisoriumIngot;
	public static Block blockPraisorium;
	public static Item itemThunderEdge;
	public static Item itemWindInABottle;
	public static Item itemDevoutBead;
	public static Item itemPlainMirror;
	public static Item itemRotationDevice;
	public static Item itemMetallicYingYang;
	public static Item itemShardsOfJustice;
	public static Item itemLifeEssence;
	public static Item itemLostSpirit;
	public static Item itemFlameSpikes;
	public static Item itemHolyBlade;
	public static Item itemPerfectMirror;
	public static Item itemStrayIngot;
	public static Item itemLeaf;
	public static Item itemEverlastingStorm;
	public static Item itemObsidianShield;
	public static Item itemCrescentMoon;
	public static Item itemSnowflake;

    public static final String MODID = "oc";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	//Item/Block init and registering
    	//Config handling
    	
    	itemSnowflake = new ItemSnowflake();
    	itemSnowflake.setUnlocalizedName("ItemSnowflake");
    	itemSnowflake.setTextureName("oc:Tundra_Beads_Material");
    	itemCrescentMoon = new ItemCrescentMoon();
    	itemCrescentMoon.setUnlocalizedName("ItemCrescentMoon");
    	itemCrescentMoon.setTextureName("oc:Tsumugari_Material");
    	itemObsidianShield = new ItemObsidianShield();
    	itemObsidianShield.setUnlocalizedName("ItemObsidianShield");
    	itemObsidianShield.setTextureName("oc:Trinity_Mirror_Material");
    	itemEverlastingStorm = new ItemEverlastingStorm();
    	itemEverlastingStorm.setUnlocalizedName("ItemEverlastingStorm");
    	itemEverlastingStorm.setTextureName("oc:Thunder_Edge_Material");
    	itemLeaf = new ItemLeaf();
    	itemLeaf.setUnlocalizedName("ItemLeaf");
    	itemLeaf.setTextureName("oc:Susano_Sword_Material");
    	itemStrayIngot = new ItemStrayIngot();
    	itemStrayIngot.setUnlocalizedName("ItemStrayIngot");
    	itemStrayIngot.setTextureName("oc:Stray_Ingot");
    	itemPerfectMirror = new ItemPerfectMirror();
    	itemPerfectMirror.setUnlocalizedName("ItemPerfectMirror");
    	itemPerfectMirror.setTextureName("oc:Solar_Flare_Material");
    	itemHolyBlade = new ItemHolyBlade();
    	itemHolyBlade.setUnlocalizedName("ItemHolyBlade");
    	itemHolyBlade.setTextureName("oc:Snarling_Beast_Material");
    	itemFlameSpikes = new ItemFlameSpikes();
    	itemFlameSpikes.setUnlocalizedName("ItemFlameSpikes");
    	itemFlameSpikes.setTextureName("oc:Seven_Strike_Material");
    	itemLostSpirit = new ItemLostSpirit();
    	itemLostSpirit.setUnlocalizedName("ItemLostSpirit");
    	itemLostSpirit.setTextureName("oc:Resurrection_Beads_Material");
    	itemLifeEssence = new ItemLifeEssence();
    	itemLifeEssence.setUnlocalizedName("ItemLifeEssence");
    	itemLifeEssence.setTextureName("oc:Life_Beads_Materials");
    	itemShardsOfJustice = new ItemShardsOfJustice();
    	itemShardsOfJustice.setUnlocalizedName("ItemShardsOfJustice");
    	itemShardsOfJustice.setTextureName("oc:Infinity_Judge_Material");
    	itemMetallicYingYang = new ItemMetallicYingYang();
    	itemMetallicYingYang.setUnlocalizedName("ItemMetallicYingYang");
    	itemMetallicYingYang.setTextureName("oc:Exorcism_Beads_Material");
    	itemRotationDevice = new ItemRotationDevice();
    	itemRotationDevice.setUnlocalizedName("ItemRotationDevice");
    	itemRotationDevice.setTextureName("oc:Eighth_Wonder_Material");
    	itemPlainMirror = new ItemPlainMirror();
    	itemPlainMirror.setUnlocalizedName("ItemPlainMirror");
    	itemPlainMirror.setTextureName("oc:Divine_Retribution_Material");
    	itemDevoutBead = new ItemDevoutBead();
    	itemDevoutBead.setUnlocalizedName("ItemDevoutBead");
    	itemDevoutBead.setTextureName("oc:Devout_Beads_Materials");
    	itemWindInABottle = new ItemWindInABottle();
    	itemWindInABottle.setUnlocalizedName("ItemWindInABottle");
    	itemWindInABottle.setTextureName("oc:Blade_of_Kusanagi_Material");
    	itemStrayBead = new ItemStrayBead();
    	itemStrayBead.setUnlocalizedName("ItemStrayBead"); //item.itemStrayBead.name
    	itemStrayBead.setTextureName("oc:Stray_Bead");
    	itemPraisoriumIngot = new ItemPraisoriumIngot();
    	itemPraisoriumIngot.setUnlocalizedName("ItemPraisoriumIngot");
    	itemPraisoriumIngot.setTextureName("oc:Praisorium_Ingot");
    	itemThunderEdge = new ItemThunderEdge();
    	itemThunderEdge.setUnlocalizedName("ItemThunderEdge");
    	itemThunderEdge.setTextureName("oc:Thunder_Edge");
    	blockPraisorium = new BlockPraisorium(Material.rock).setBlockName("BlockPraisorium").setBlockTextureName("oc:Praisorium_Block");
    	
    	itemSnowflake.setCreativeTab(oc_creative_tab);
    	itemCrescentMoon.setCreativeTab(oc_creative_tab);
    	itemObsidianShield.setCreativeTab(oc_creative_tab);
    	itemEverlastingStorm.setCreativeTab(oc_creative_tab);
    	itemLeaf.setCreativeTab(oc_creative_tab);
    	itemStrayIngot.setCreativeTab(oc_creative_tab);
    	itemPerfectMirror.setCreativeTab(oc_creative_tab);
    	itemHolyBlade.setCreativeTab(oc_creative_tab);
    	itemFlameSpikes.setCreativeTab(oc_creative_tab);
    	itemLostSpirit.setCreativeTab(oc_creative_tab);
    	itemLifeEssence.setCreativeTab(oc_creative_tab);
    	itemShardsOfJustice.setCreativeTab(oc_creative_tab);
    	itemMetallicYingYang.setCreativeTab(oc_creative_tab);
    	itemRotationDevice.setCreativeTab(oc_creative_tab);
    	itemPlainMirror.setCreativeTab(oc_creative_tab);
    	itemDevoutBead.setCreativeTab(oc_creative_tab);
    	itemWindInABottle.setCreativeTab(oc_creative_tab);
    	itemStrayBead.setCreativeTab(oc_creative_tab);
    	itemPraisoriumIngot.setCreativeTab(oc_creative_tab);
    	itemThunderEdge.setCreativeTab(oc_creative_tab);
    	blockPraisorium.setCreativeTab(oc_creative_tab);
    	
    	
    	
    	
    	
    	GameRegistry.registerItem(itemStrayBead, itemStrayBead.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(blockPraisorium, blockPraisorium.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemPraisoriumIngot, itemPraisoriumIngot.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemThunderEdge, itemThunderEdge.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemWindInABottle, itemWindInABottle.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemDevoutBead, itemDevoutBead.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemPlainMirror, itemPlainMirror.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemRotationDevice, itemRotationDevice.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemMetallicYingYang, itemMetallicYingYang.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemShardsOfJustice, itemShardsOfJustice.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemLifeEssence, itemLifeEssence.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemLostSpirit, itemLostSpirit.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemFlameSpikes, itemFlameSpikes.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemHolyBlade, itemHolyBlade.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemPerfectMirror, itemPerfectMirror.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemStrayIngot, itemStrayIngot.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemLeaf, itemLeaf.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemEverlastingStorm, itemEverlastingStorm.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemObsidianShield, itemObsidianShield.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemCrescentMoon, itemCrescentMoon.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemSnowflake, itemSnowflake.getUnlocalizedName().substring(5));
    	GameRegistry.registerWorldGenerator(new PraisoriumGeneration(), 0);
    	System.out.println(blockPraisorium.getUnlocalizedName().substring(5));
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	//Proxy, TileEntity, entity, GUI and Packet Registering
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
    
    public static CreativeTabs oc_creative_tab = new CreativeTabs("tab.oc") {
   	   @Override
   	   @SideOnly(Side.CLIENT)
   	   public Item getTabIconItem() {
   	      return itemStrayBead;
   	   }
     };
}
