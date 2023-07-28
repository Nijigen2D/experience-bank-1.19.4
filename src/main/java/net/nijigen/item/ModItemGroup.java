package net.nijigen.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nijigen.ExperienceBank;
import net.nijigen.block.ModBlocks;

public class ModItemGroup {
public static final ItemGroup XPBANK = Registry.register(Registries.ITEM_GROUP,
        new Identifier(ExperienceBank.MOD_ID, "xpbank"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.xpbank"))
                .icon(() -> new ItemStack(ModBlocks.XPBANK_BLOCK)).entries((displayContext, entries) -> {
                    entries.add(ModBlocks.XPBANK_BLOCK);
                }).build());
    public static void registerItemGroups() {
        ExperienceBank.LOGGER.info("Registering Item Groups for " + ExperienceBank.MOD_ID);
    }
}
