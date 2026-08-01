package net.sorwelt.pharma.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.sorwelt.pharma.PharmaMod;
import net.sorwelt.pharma.component.ModFoodComponents;
import net.sorwelt.pharma.component.ModFoodComponents.PharmaFood;

public class ModItems {
    // anxiolytics
    public static final Item ALPRAZOLAM = registerItem("alprazolam", ModFoodComponents.ALPRAZOLAM);
    public static final Item PHENAZEPAM = registerItem("phenazepam", ModFoodComponents.PHENAZEPAM);
    public static final Item CLONAZEPAM = registerItem("clonazepam", ModFoodComponents.CLONAZEPAM);
    public static final Item DIAZEPAM = registerItem("diazepam", ModFoodComponents.DIAZEPAM);
    public static final Item TOFISOPAM = registerItem("tofisopam", ModFoodComponents.TOFISOPAM);

    // antipsychotics
    public static final Item HALOPERIDOL = registerItem("haloperidol", ModFoodComponents.HALOPERIDOL);
    public static final Item QUETIAPINE = registerItem("quetiapine", ModFoodComponents.QUETIAPINE);
    public static final Item RISPERIDONE = registerItem("risperidone", ModFoodComponents.RISPERIDONE);
    public static final Item CHLORPROMAZINE = registerItem("chlorpromazine", ModFoodComponents.CHLORPROMAZINE);

    // analgesics
    public static final Item TRAMADOL = registerItem("tramadol", ModFoodComponents.TRAMADOL);
    public static final Item PROMEDOL = registerItem("promedol", ModFoodComponents.PROMEDOL);
    public static final Item PALEXIA = registerItem("palexia", ModFoodComponents.PALEXIA);
    public static final Item TROPICAMIDE = registerItem("tropicamide", ModFoodComponents.TROPICAMIDE);

    // antidepressants
    public static final Item AMITRIPTYLINE = registerItem("amitriptyline", ModFoodComponents.AMITRIPTYLINE);
    public static final Item MIRTAZAPINE = registerItem("mirtazapine", ModFoodComponents.MIRTAZAPINE);
    public static final Item ZOLOFT = registerItem("zoloft", ModFoodComponents.ZOLOFT);
    public static final Item FLUOXETINE = registerItem("fluoxetine", ModFoodComponents.FLUOXETINE);

    // antihistamines
    public static final Item DRAMINA = registerItem("dramina", ModFoodComponents.DRAMINA);
    public static final Item DIMEDROL = registerItem("dimedrol", ModFoodComponents.DIMEDROL);
    public static final Item ATARAX = registerItem("atarax", ModFoodComponents.ATARAX);

    // antiepileptics
    public static final Item GABAPENTIN = registerItem("gabapentin", ModFoodComponents.GABAPENTIN);

    // recipe
    public static final Item RECIPE = Registry.register(Registries.ITEM, Identifier.of(PharmaMod.MOD_ID, "recipe"), new RecipeItem(new Item.Settings()
        .registryKey(RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(PharmaMod.MOD_ID, "recipe")))));

    private static Item registerItem(String name, PharmaFood pharmaFood) {
        Identifier id = Identifier.of(PharmaMod.MOD_ID, name);
        Item.Settings settings = new Item.Settings()
                .food(pharmaFood.food(), pharmaFood.consumable())
                .registryKey(RegistryKey.of(Registries.ITEM.getKey(), id));
        return Registry.register(Registries.ITEM, id, new Item(settings));
    }

    public static void registerModItems() {
        PharmaMod.LOGGER.info("zakypaem tabletki v " + PharmaMod.MOD_ID);
    }
}