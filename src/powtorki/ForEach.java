package powtorki;

class ForEach {
    public static void main(String[] args) {
        //wyświetl tylko oceny od 4 w górę
        double[] grades = {2.5, 4, 3, 5, 4.5, 5};

        for (int i = 0; i < grades.length; i++) {
            double grade = grades[i];
            if (grade >= 4) {
                System.out.println(grade);
            }
        }
        System.out.println("---------");
        for( double grade : grades){
            if (grade >= 4) {
                System.out.println(grade);
            }
        }

    }
}
