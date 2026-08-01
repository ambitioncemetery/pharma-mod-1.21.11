package net.sorwelt.pharma.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.sorwelt.pharma.PharmaMod;

import java.util.List;
import java.util.Random;

public class RecipeItem extends Item {

    private static final Random RANDOM = new Random();

    public RecipeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && user instanceof ServerPlayerEntity player) {

            List<Item> items = Registries.ITEM.stream()
                    .filter(item -> {
                        Identifier id = Registries.ITEM.getId(item);
                        return id.getNamespace().equals(PharmaMod.MOD_ID)
                                && item != this;
                    })
                    .toList();

            if (!items.isEmpty()) {
                Item item = items.get(RANDOM.nextInt(items.size()));
                player.giveItemStack(new ItemStack(item));
            }
        }

        return ActionResult.SUCCESS;
    }
}