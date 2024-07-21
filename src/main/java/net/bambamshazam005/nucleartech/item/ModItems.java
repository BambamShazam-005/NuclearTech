package net.bambamshazam005.nucleartech.item;

import net.bambamshazam005.nucleartech.NuclearTech;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NuclearTech.MOD_ID);

    public static final RegistryObject<Item> STEELINGOT = ITEMS.register("steelingot",
            () -> new Item(new Item.Properties()));

            public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
            }

}
