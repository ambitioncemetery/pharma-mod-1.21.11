package net.sorwelt.pharma.component;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {
    public record PharmaFood(FoodComponent food, ConsumableComponent consumable) {}

    private record EffectChance(StatusEffectInstance effect, float chance) {}

    private static FoodComponent baseFood() {
        return new FoodComponent.Builder()
                .nutrition(0)
                .saturationModifier(0.0f)
                .alwaysEdible()
                .build();
    }

    private static ConsumableComponent consumable(EffectChance... effects) {
        ConsumableComponent.Builder builder = ConsumableComponents.food();
        for (EffectChance effect : effects) {
            builder.consumeEffect(new ApplyEffectsConsumeEffect(effect.effect(), effect.chance()));
        }
        return builder.build();
    }

    private static EffectChance effect(StatusEffectInstance effect, float chance) {
        return new EffectChance(effect, chance);
    }

    // anxiolytics
    public static final PharmaFood ALPRAZOLAM = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 0), 1f)
        )
    );
    public static final PharmaFood PHENAZEPAM = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 1), 1f),
                effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1200, 1), 1f),
                effect(new StatusEffectInstance(StatusEffects.WEAKNESS, 600, 0), 1f)
        )
    );
    public static final PharmaFood CLONAZEPAM = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3600, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 900, 0), 1f)
        )
    );
    public static final PharmaFood DIAZEPAM = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 0), 1f)
        )
    );
    public static final PharmaFood TOFISOPAM = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.HASTE, 2400, 0), 1f)
        )
    );

    // antipsychotics
    public static final PharmaFood HALOPERIDOL = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 1), 1f),
                effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1800, 1), 1f),
                effect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1200, 1), 1f)
        )
    );
    public static final PharmaFood QUETIAPINE = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 900, 0), 1f)
        )
    );
    public static final PharmaFood RISPERIDONE = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.WEAKNESS, 900, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 0), 1f)
        )
    );
    public static final PharmaFood CHLORPROMAZINE = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 2), 1f),
                effect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1800, 2), 1f)
        )
    );

    // analgesics
    public static final PharmaFood TRAMADOL = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 1), 1f)
        )
    );
    public static final PharmaFood PROMEDOL = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.STRENGTH, 900, 1), 1f),
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.HUNGER, 900, 1), 1f),
                effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 0), 1f)
        )
    );
    public static final PharmaFood PALEXIA = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 1f)
        )
    );
    public static final PharmaFood TROPICAMIDE = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.NAUSEA, 400, 0), 1f)
        )
    );

    // antidepressants
    public static final PharmaFood AMITRIPTYLINE = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.REGENERATION, 900, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 0), 1f)
        )
    );
    public static final PharmaFood MIRTAZAPINE = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.HUNGER, 2400, 0), 1f)
        )
    );
    public static final PharmaFood ZOLOFT = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.SPEED, 3000, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.LUCK, 3000, 0), 1f)
        )
    );
    public static final PharmaFood FLUOXETINE = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.HASTE, 1800, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.HUNGER, 400, 0), 1f)
        )
    );

    // antihistamines
    public static final PharmaFood DRAMINA = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1f)
        )
    );
    public static final PharmaFood DIMEDROL = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.DARKNESS, 200, 0), 1f)
        )
    );
    public static final PharmaFood ATARAX = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20, 0), 1f)
        )
    );

    // antiepileptics
    public static final PharmaFood GABAPENTIN = new PharmaFood(
            baseFood(),
            consumable(
                effect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1f),
                effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 900, 0), 1f)
        )
    );
}
