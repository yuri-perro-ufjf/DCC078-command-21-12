import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game;
    Inventory inventory;

    @BeforeEach
    void setUp(){
        game = new Game();
        inventory = new Inventory(100);
    }

    @Test
    void shouldBeOpenInventory(){
        Task openInventory = new OpenInventoryTask(inventory);
        game.execTask(openInventory);

        assertEquals("Opened", inventory.getStatus());
    }

    @Test
    void shouldBeCloseInventory(){
        Task closeInventoryTask = new CloseInventoryTask(inventory);
        game.execTask(closeInventoryTask);

        assertEquals("Closed", inventory.getStatus());
    }

    @Test
    void shouldBeCancelCloseInventory(){
        Task openInventory = new OpenInventoryTask(inventory);
        Task closeInventory = new CloseInventoryTask(inventory);

        game.execTask(openInventory);
        game.execTask(closeInventory);

        game.cancelLastTask();

        assertEquals("Opened", inventory.getStatus());
    }
}