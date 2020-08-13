/**
 * Get quantity of items in inventory (includes all stacks)
 * @param player The player who we want quantity of one item in inventory
 * @param item The item who we want the quantity
 * @return The quantity total of items
 */
private static int getQuantityItem(PlayerEntity player, Item item) {
	int quantityItems = 0; // Keep the number of the total quantity of items
	for(int slot = 0; slot <= player.inventory.getSizeInventory(); slot++) { // For each slots in inventory
		ItemStack getIS = player.inventory.getStackInSlot(slot); // Get the ItemStack of the current slot
		if (getIS.getItem() == item) quantityItems += getIS.getCount(); // If the ItemStack is the sought item
	}
	return quantityItems
}
