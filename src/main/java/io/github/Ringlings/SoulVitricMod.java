package io.github.Ringlings;

import io.github.Ringlings.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.block.Blocks.GLASS;
import static net.minecraft.block.Blocks.TINTED_GLASS;

public class SoulVitricMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Soul Vitric");

	public static final SoulVitric SOUL_VITRIC = new SoulVitric(QuiltBlockSettings.copy(GLASS).strength(0.7F, 6.0F));
	public static final CharredSoulVitric CHARRED_SOUL_VITRIC = new CharredSoulVitric(QuiltBlockSettings.copy(TINTED_GLASS).strength(0.8F, 6.0F));

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from \\{\\}!\", mod.metadata().name());");

		Registry.register(Registry.BLOCK, new Identifier("soul_vitric", "soul_vitric"), SOUL_VITRIC);
		Registry.register(Registry.ITEM, new Identifier("soul_vitric", "soul_vitric"), new BlockItem(SOUL_VITRIC, new QuiltItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier("soul_vitric", "charred_soul_vitric"), CHARRED_SOUL_VITRIC);
		Registry.register(Registry.ITEM, new Identifier("soul_vitric", "charred_soul_vitric"), new BlockItem(CHARRED_SOUL_VITRIC, new QuiltItemSettings().group(ItemGroup.DECORATIONS)));
	}
}
