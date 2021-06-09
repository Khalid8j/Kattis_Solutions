import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChemistsVows {

    public static void main(String[] args) throws FileNotFoundException {

        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("2.in"));


        String[] periodicTable = {
                "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg",
                "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr",
                "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br",
                "Kr", "Rb", "Sr", "Y", "Zr","Nb", "Mo", "Tc", "Ru",
                 "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs",
                "Ba", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb",
                "Bi", "Po", "At", "Rn", "Fr", "Ra", "Rf", "Db", "Sg", "Bh", "Hs", "Mt",
                "Ds", "Rg", "Cn", "Fl", "Lv", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu",
                "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Ac", "Th", "Pa", "U",
                "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr"
        };

        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
           String word = sc.next();
           String temp = word;
            int index = 0;
            int size = 0;

            while (index < periodicTable.length && size != word.length()) {
                String element = periodicTable[index].toLowerCase();
                if (temp.contains(element)) {
                    temp = temp.replace(element,"");
                    size += element.length();
                }
                index++;
            }
            if (size == word.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
