package co.edu.sena.actividad.consolas;

import javax.swing.JOptionPane;

public class APP {

    public static void main(String[] args) {
        Snes s1 = new Snes(2, "3.5mm", "HDMI");
        JOptionPane.showMessageDialog(null, s1.getControles() + s1.getConectorSonido() + s1.getConectorVideo());
        Play1 p1 = new Play1(2, "TRS", "TRS");
        JOptionPane.showMessageDialog(null, p1.getControles() + p1.getConectorSonido() + p1.getConectorVideo());
        WiiU w1 = new WiiU(4, "HDMI", "HMDI");
        JOptionPane.showMessageDialog(null, w1.getControles() + w1.getConectorSonido() + w1.getConectorVideo());
        Wii w2 = new Wii(4, "TRS", "TRS");
        JOptionPane.showInternalMessageDialog(null, w2.getControles() + w2.getConectorSonido() + w2.getConectorVideo());
        Switch sw = new Switch(4, "HDMI", "HDMI");
        JOptionPane.showInternalMessageDialog(null, sw.getControles() + sw.getConectorSonido() + sw.getConectorVideo());
        PsVita ps = new PsVita(1, "3.5mm", "VGA");
        JOptionPane.showInternalMessageDialog(null, ps.getControles() + ps.getConectorSonido() + ps.getConectorVideo());
        Play2 p2 = new Play2(2, "TRS", "TRS");
        JOptionPane.showInternalMessageDialog(null, p2.getControles() + p2.getConectorSonido() + p2.getConectorVideo());
        Play3 p3 = new Play3(2, "HDMI", "HDMI");
        JOptionPane.showInternalMessageDialog(null, p3.getControles() + p3.getConectorSonido() + p3.getConectorVideo());
        Play4 p4 = new Play4(4, "HDMI", "HDMI");
        JOptionPane.showInternalMessageDialog(null, p4.getControles() + p4.getConectorSonido() + p4.getConectorVideo());
        Play4Pro p4p = new Play4Pro(4, "HDMI", "HDMI");
        JOptionPane.showInternalMessageDialog(null, p4p.getControles() + p4p.getConectorSonido() + p4p.getConectorVideo());
        Play4Slim p4s = new Play4Slim(4, "HDMI", "HDMI");
        JOptionPane.showInternalMessageDialog(null, p4s.getControles() + p4s.getConectorSonido() + p4s.getConectorVideo());
        Play4fat p4f = new Play4fat(4, "HDMI", "HDMI");
        JOptionPane.showInternalMessageDialog(null, p4f.getControles() + p4f.getConectorSonido() + p4f.getConectorVideo());

    }

}
