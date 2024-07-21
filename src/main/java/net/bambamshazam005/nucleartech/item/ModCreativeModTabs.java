package net.bambamshazam005.nucleartech.item;

import net.bambamshazam005.nucleartech.NuclearTech;
import net.bambamshazam005.nucleartech.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NuclearTech.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NUCLEARTECH = CREATIVE_MODE_TABS.register("nucleartech",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEELINGOT.get()))
                    .title(Component.translatable("creativetab.nucleartech"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STEELINGOT.get());

                        pOutput.accept(ModBlocks.STEELRAILING.get());


                    })

                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
