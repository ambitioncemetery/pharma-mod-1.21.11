package net.sorwelt.pharma.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sorwelt.pharma.PharmaMod;

public class ModItemGroups {
    public static final ItemGroup ANXIOLYTICS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(PharmaMod.MOD_ID, "anxiolytics"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.pharma.anxiolytics"))
                    .icon(() -> new ItemStack(ModItems.ALPRAZOLAM))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ALPRAZOLAM);
                        entries.add(ModItems.PHENAZEPAM);
                        entries.add(ModItems.CLONAZEPAM);
                        entries.add(ModItems.DIAZEPAM);
                        entries.add(ModItems.TOFISOPAM);
                    })
                    .build()
    );

    public static final ItemGroup ANTIPSYCHOTICS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(PharmaMod.MOD_ID, "antipsychotics"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.pharma.antipsychotics"))
                    .icon(() -> new ItemStack(ModItems.HALOPERIDOL))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HALOPERIDOL);
                        entries.add(ModItems.QUETIAPINE);
                        entries.add(ModItems.RISPERIDONE);
                        entries.add(ModItems.CLORPROMAZINE);
                    })
                    .build()
    );

    public static final ItemGroup ANALGESICS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(PharmaMod.MOD_ID, "analgesics"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.pharma.analgetics"))
                    .icon(() -> new ItemStack(ModItems.TRAMADOL))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TRAMADOL);
                        entries.add(ModItems.PROMEDOL);
                        entries.add(ModItems.PALEXIA);
                        entries.add(ModItems.TROPICAMIDE);
                    })
                    .build()
    );

public static final ItemGroup ANTIDEPRESSANTS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(PharmaMod.MOD_ID, "antidepressants"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.pharma.antidepressants"))
                    .icon(() -> new ItemStack(ModItems.AMITRIPTYLINE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AMITRIPTYLINE);
                        entries.add(ModItems.MIRTAZAPINE);
                        entries.add(ModItems.ZOLOFT);
                        entries.add(ModItems.FLUOXETINE);
                    })
                    .build()
    );

    public static final ItemGroup ANTIHISTAMINES_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(PharmaMod.MOD_ID, "antihistamines"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.pharma.antihistamines"))
                    .icon(() -> new ItemStack(ModItems.DRAMINA))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DRAMINA);
                        entries.add(ModItems.DIMEDROL);
                        entries.add(ModItems.ATARAX);
                    })
                    .build()
    );

    public static final ItemGroup ANTIEPILEPTICS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(PharmaMod.MOD_ID, "antiepileptics"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.pharma.antiepileptics"))
                    .icon(() -> new ItemStack(ModItems.GABAPENTIN))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GABAPENTIN);
                    })
                    .build()
    );

    public static void registerItemGroups() {
        PharmaMod.LOGGER.info("zakepaem recepti v " + PharmaMod.MOD_ID);
    }
}