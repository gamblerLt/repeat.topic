package lt.code.academy.exercises;

public class TenElevenTask {
    public static void main(String[] args) {

        String text = "Laba diena";
        String text2 = "1";
        StringBuilder stringBuilder = new StringBuilder(text);
        System.out.println(stringBuilder.indexOf("ab"));
        stringBuilder.append(text);
        int raidziuSk = 0;
        for (int i =0; i < stringBuilder.length(); i++) {
            if(Character.isLetter(stringBuilder.charAt(i))) {
                System.out.println(raidziuSk);
            }
        }
        if (text2 instanceof String) {
            System.out.println(" Tai yra tekstas. ");
        }else{
            System.out.println("Tai nera tekstas");
        }


    }
}


/*public class StringBuilderLetterCountExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World!");
        int letterCount = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isLetter(sb.charAt(i))) {
                letterCount++;
            }
        }
        System.out.println("Number of letters in StringBuilder: " + letterCount);
    }
}*/


/*
10. Parašyti metodą kuris suskaičiuoja kiek per parametrus paduotame žodyje yra raidžių “a”.
Prieš atliekant veiksmus patikrinti ar paduotas žodis yra tinkamas, jei ne, grąžinti 0.


11. Parašyti metodą kuris patikrina ar per parametrus paduotame žodyje yra raidžių derinių “ab”.
Prieš atliekant veiksmus patikrinti ar paduotas žodis yra tinkamas, jei ne, grąžinti 0. Užuomina:radus “a”
raidę, tikrinti ar tai nėra paskutinė žodžio raidė, ir jeigu ne, tuomet tikrinti ar sekanti
raidė (i + 1) yra “b”.*/
