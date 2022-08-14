package io.github.Ringlings;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

import static io.github.Ringlings.SoulVitricMod.CHARRED_SOUL_VITRIC;
import static io.github.Ringlings.SoulVitricMod.SOUL_VITRIC;

@Environment(EnvType.CLIENT)
public class SoulVitricClient implements ClientModInitializer {
	@Override
	public void onInitializeClient(ModContainer mod) {
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), SOUL_VITRIC, CHARRED_SOUL_VITRIC);
	}
}
