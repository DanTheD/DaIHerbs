package com.danthed.DaIHerbs;


import com.danthed.DaIHerbs.proxy.CommonProxy;
import com.danthed.DaIHerbs.tab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DaIHerbs.MODID, version = DaIHerbs.VERSION, name = DaIHerbs.NAME)
public class DaIHerbs {

    public static final String MODID = "daiherbs";
    public static final String VERSION = "0.0.1";
    public static final String NAME = "DaIHerbs";

    @SidedProxy(clientSide = "com.danthed.DaIHerbs.proxy.ClientProxy", serverSide = "com.danthed.DaIHerbs.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static DaIHerbs instance;

    public static CreativeTab tabDai;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabDai = new CreativeTab(CreativeTabs.getNextID(), "tab_dai");
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);

    }

}