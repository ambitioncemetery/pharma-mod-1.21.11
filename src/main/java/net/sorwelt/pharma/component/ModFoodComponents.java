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
                    effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1000, 1), 0.5f),
                    effect(new StatusEffectInstance(StatusEffects.LEVITATION, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood PHENAZEPAM = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1000, 1), 0.5f),
                    effect(new StatusEffectInstance(StatusEffects.LEVITATION, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood CLONAZEPAM = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1000, 1), 0.5f),
                    effect(new StatusEffectInstance(StatusEffects.LEVITATION, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood DIAZEPAM = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1000, 1), 0.5f),
                    effect(new StatusEffectInstance(StatusEffects.LEVITATION, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood TOFISOPAM = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.SATURATION, 1000, 1), 0.5f)
            )
    );

    // antipsychotics
    public static final PharmaFood HALOPERIDOL = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood QUETIAPINE = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood RISPERIDONE = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood CLORPROMAZINE = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1000, 1), 0.5f)
            )
    );

    // analgesics
    public static final PharmaFood TRAMADOL = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1000, 1), 0.5f),
                    effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood PROMEDOL = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1000, 1), 0.5f),
                    effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood PALEXIA = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1000, 1), 0.5f),
                    effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood TROPICAMIDE = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1000, 1), 0.5f),
                    effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1000, 1), 0.5f)
            )
    );

    // antidepressants
    public static final PharmaFood AMITRIPTYLINE = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1000, 1), 0.5f),
                    effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood MIRTAZAPINE = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood ZOLOFT = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood FLUOXETINE = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000, 1), 0.5f)
            )
    );

    // antihistamines
    public static final PharmaFood DRAMINA = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.NAUSEA, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood DIMEDROL = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.NAUSEA, 1000, 1), 0.5f)
            )
    );
    public static final PharmaFood ATARAX = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.NAUSEA, 1000, 1), 0.5f)
            )
    );

    // antiepileptics
    public static final PharmaFood GABAPENTIN = new PharmaFood(
            baseFood(),
            consumable(
                    effect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1000, 1), 0.5f)
            )
    );
}
