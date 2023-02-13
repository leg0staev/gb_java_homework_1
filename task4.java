package hw;

public class task4 {

        public static void main(String args[]) {
                String strPolynom = "6? + ?1 = 60";

                String[] members = strPolynom.split(" ");

                int[] firstMem = GetMemberList(members[0]);
                int[] secondMem = GetMemberList(members[2]);

                String solution = FindTerms(firstMem, secondMem, members[4]);

                System.out.println(solution);

        }

        public static int nextNum(String strangeNum) {
                int i = 0;
                int start = i++;
                String qChar = "?";
                String optionNum = "";
                for (int j = 0; j < strangeNum.length(); j++) {
                        if (strangeNum.charAt(j) == qChar.charAt(0)) {
                                optionNum += Integer.toString(start);
                        } else {
                                optionNum += strangeNum.charAt(j);
                        }
                }
                return Integer.parseInt(optionNum);
        }

        public static int[] GetMemberList(String polynom) {
                int[] array = new int[10];

                for (int i = 0; i < array.length; i++) {
                        array[i] = nextNum(polynom);
                }
                return array;
        }

        public static String FindTerms(int[] membersOne, int[] membersTwo, String result) {
                for (int x = 0; x < membersOne.length; x++) {
                        for (int y = 0; y < membersTwo.length; y++) {
                                if (membersOne[x] + membersTwo[y] == Integer.parseInt(result)) {
                                        return (membersOne[x] + " + " + membersTwo[y] + " = " + result);
                                }
                        }
                }
                return "no solution";
        }
}