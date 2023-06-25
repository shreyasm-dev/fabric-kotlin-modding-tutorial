package dev.shreyasm.stuff

import dev.shreyasm.stuff.items.IceCube
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory


object Stuff : ModInitializer {
  private val logger = LoggerFactory.getLogger("stuff")

  val ICE_CUBE = Registry.register(
    Registries.ITEM,
    Identifier("stuff", "ice_cube"),
    IceCube(FabricItemSettings().maxCount(16).fireproof()),
  )

  override fun onInitialize() {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.
    logger.info("Hello Fabric world!")
  }
}