package world.ucode;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static java.lang.System.exit;

public class MouseInput implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();


        if(mx >= GameWindow.WIDTH + 280 && mx <= GameWindow.WIDTH + 380) {
            if(my >= 60 && my <= 85) {
                GameScreen.gameState = GameScreen.START_GAME_STATE;
            }
        }
        if(mx >= GameWindow.WIDTH + 280 && mx <= GameWindow.WIDTH + 380) {
            if(my >= 110 && my <= 170) {
                System.exit(1);
            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
