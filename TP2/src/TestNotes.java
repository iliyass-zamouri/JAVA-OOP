public class TestNotes {
    public static void main(String[] args) {
    	
        Etudiant e1 = new Etudiant("Jalili","Jalil") ;
        Etudiant e2 = new Etudiant("Saidi","Saidia") ;

        Unite[] u = new Unite[3] ;
        u[0] = new Unite("CAI",45) ;
        u[1] = new Unite("DAI",50) ;
        u[2] = new Unite("MATH",15) ;

        for (int i = 0 ; i < u.length ; i++) {
            System.out.println(u[i].toString());
        }

        double[][] note = {{16,10,14},{11,5,9}} ;
        
        double moy = (note[0][0] * 45 + note[0][1] * 50 + note[0][2] * 15) /110 ;
        System.out.println("La moyenne de l��tudiant num�ro : " + e1.getNum() + ", " + e1.getNom() + ", " + e1.getPrenom() + " est : " + moy);
        
        moy = (note[1][0] * 45 + note[1][1] * 50 + note[1][2] * 15) /110 ;
        System.out.println("La moyenne de l��tudiant num�ro : " + e2.getNum() + ", " + e2.getNom() + ", " + e2.getPrenom() + " est : " + moy);
        
        moy = (((note[0][0] * 45 + note[0][1] * 50 + note[0][2] * 15) /110) + ((note[1][0] * 45 + note[1][1] * 50 + note[1][2] * 15) /110)) / 2 ;
        System.out.println("La moyenne de la classe est : " + moy);
    }
}

