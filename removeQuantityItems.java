/**
 * Remove quantity of items (can be split in multi-stack)
 * @param player player The player who we want remove items
 * @param player item The item who we want remove
 * @param player quantity Quantity of items to remove
 */
private static void removeQuantityItems(PlayerEntity player, Item item, int quantity) {
	for(int slot = 0; slot <= player.inventory.getSizeInventory(); slot++) { // For each slots in player inventory
		ItemStack getIS = player.inventory.getStackInSlot(slot); // We get the ItemStack in current Slot
		if (getIS.getItem() == item) { // If the ItemStack is the sought item
			if (getIS.getCount() >= quantity) { // If quantity of items is higher than the removed quantity
				player.inventory.getStackInSlot(slot).setCount(getIS.getCount() - quantity); // We remove it
				break; // Break the for, we have finish
			} else { // If quantity of items is lower than the removed quantity
				quantity -= getIS.getCount(); // We decrease the quantity that we are going to remove 
				player.inventory.getStackInSlot(slot).setCount(0); // Remove the current stack
			}
		}
	}
}

// WARNING, i don't use "getIS.setCount(0)" because only the last ItemStack is removed
