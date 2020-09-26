package world.ucode;

import java.awt.*;

public class Menu {
    public Rectangle playButton = new Rectangle(GameWindow.WIDTH + 280, 60, 100, 25);
    public Rectangle quitButton = new Rectangle(GameWindow.WIDTH + 280, 110, 100, 25);

    public void render(Graphics g) {
        if (GameScreen.gameState == GameScreen.GAME_MENU) {
            Graphics2D g2d = (Graphics2D) g;
            Font font0 = new Font("arial", Font.BOLD, 40);
            g.setFont(font0);
            g.setColor(Color.BLACK);
            g.drawString("Dino", GameWindow.WIDTH/2 + 280, 40);

            Font font1 = new Font("arial", Font.BOLD, 20);
            g.setFont(font1);
            g.drawString("Play", playButton.x + 19, playButton.y + 18);
            g2d.draw(playButton);
            g.drawString("Quit", quitButton.x + 19, quitButton.y + 18);
            g2d.draw(quitButton);
        }
        else {
            return;
        }
    }
}
