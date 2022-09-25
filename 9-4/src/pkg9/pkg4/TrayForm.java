/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg4;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.net.URL;
import javax.swing.JFrame;
/**
 *
 * @author fedora
 */
public class TrayForm extends JFrame {
    private SystemTray systemTray = SystemTray.getSystemTray();
    private TrayIcon trayIcon;
    
    public TrayForm() {
        super();
        URL resource = getClass().getResource("icon.png");
        Image image = Toolkit.getDefaultToolkit().getImage(resource);
        trayIcon = new TrayIcon(image, "Программирование на Java (Swing)");
        trayIcon.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               setVisible(true); setState(JFrame.NORMAL); removeTrayIcon();
           } 
        });
        
        addWindowStateListener(new WindowStateListener() {
            public void windowStateChanged(WindowEvent e) {
                if (e.getNewState() == JFrame.ICONIFIED) {
                    setVisible(false); addTrayIcon();
                }
            }
        });
        
        PopupMenu popupMenu = new PopupMenu();
        MenuItem item1 = new MenuItem("Развернуть программу");
        MenuItem item2 = new MenuItem("Выход");
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(true); setState(JFrame.NORMAL); removeTrayIcon();
            }
        });
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); System.exit(0);
            }
        });
        popupMenu.add(item1); popupMenu.add(item2);
        trayIcon.setPopupMenu(popupMenu);        
    }
    
    private void removeTrayIcon() { systemTray.remove(trayIcon); }
    private void addTrayIcon() {
        try {
            systemTray.add(trayIcon);
            trayIcon.displayMessage("Программирование на Java (Swing)", "Приложение свёрнуто. Двойной клик для восстановления окна", TrayIcon.MessageType.INFO);
        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }
}
