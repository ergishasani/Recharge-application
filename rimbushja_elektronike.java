package Projektet;

import javax.swing.JOptionPane;

class kledjan {
    public static void main(String[] args) {
        String leket_ne_llogari, oferta1;
        double ofertat1;
        int leket;

        String nr_personal = JOptionPane.showInputDialog(null, "Vendosni numrin : ", "Numri",
                JOptionPane.INFORMATION_MESSAGE);
        leket_ne_llogari = JOptionPane.showInputDialog(null, " Ju keni 8000 lek " + "\n Fusni leke :", "leket",
                JOptionPane.INFORMATION_MESSAGE);
        leket = (int) Double.parseDouble(leket_ne_llogari);
        double leket_ne_llogari1 = 8000;
        double leket_total = leket_ne_llogari1 + leket;

        JOptionPane.showMessageDialog(null, "Krediti juaj eshte " + leket_total);
        int oferta_1 = 10000;
        int oferta_2 = 15000;
        int oferta_3 = 30000;

        String a = "Oferta 1 kushton 10.000,";
        String b = "Oferta 2 kushton 15.000,";
        String c = "Oferta 3 kushton 30.000,";
        JOptionPane.showMessageDialog(null,
                "Ofertat :" + "\n Oferta 1, ka 2000 minuta, 10 GB internet, 500 SMS, "
                        + "\n Oferta 2, ka 5000 minuta, 20 GB internet, 1500 SMS,"
                        + "\n Oferta 3, ka 10.000 minuta, internet pa limit, 5000 SMS.",
                "Ofertat", JOptionPane.INFORMATION_MESSAGE);
        oferta1 = JOptionPane.showInputDialog(null, a + "\n" + b + "\n" + c);
        ofertat1 = (int) Double.parseDouble(oferta1);
        boolean z = leket_total < 10000;
        boolean x = leket_total < 15000;
        boolean y = leket_total < 30000;
        double mbetur1 = leket_total - oferta_1;
        double mbetur2 = leket_total - oferta_2;
        double mbetur3 = leket_total - oferta_3;
        if (z && x && y)
            JOptionPane.showMessageDialog(null, "Nuk keni kredit te mjaftueshem");

        else if (ofertat1 == 1)
            JOptionPane.showMessageDialog(null, "Oferta u krye me suskes" + "\nJu kane mbetur " + mbetur1);
        else if (ofertat1 == 2)
            JOptionPane.showMessageDialog(null, "Oferta u krye me suskes" + "\nJu kane mbetur " + mbetur2);
        else if (ofertat1 == 3)
            JOptionPane.showMessageDialog(null, "Oferta u krye me suskes" + "\nJu kane mbetur " + mbetur3);

    }
}