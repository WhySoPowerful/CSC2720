public class Bonus3 {
    public static void main(String[] args) {
        int[][] grade = { { 12, 14 }, { 16, 18 }, { 80, 60 }, { 68, 58 }, { 48, 98 }, { 76, 56 } };
        printArray(grade, "Question 1 Original Grade: ");

        Queue<int[]> q = new Queue<>();
        q = reconstructQueue(grade);
        printQueue(q, "Question 1 Sorted Results: ");

        int[][] addArr = { { 58, 78 } };
        q.add(addArr[0]);
        printQueue(q, "Question 2 After Add: ");

    }

    public static void printQueue(Queue<int[]> q, String msg) {
        System.out.println(msg);
        int counter = 0;
        while (q.size() > counter) {
            int[] temp = q.get(counter);
            System.out.print("(" + temp[0] + "," + temp[1] + ") ");
            counter++;
        }
        System.out.println();
    }

    public static void printArray(int[][] arr, String message) {
        System.out.println(message);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Queue<int[]> reconstructQueue(int[][] grade) {
        int[][] s = sortArray(grade);
        Queue<int[]> q = new Queue<>();
        for (int i = s.length - 1; i >= 0; i--) {
            q.add(s[i]);
        }

        return q;
    }

    public static int[][] sortArray(int[][] grade) {
        int[][] s = new int[grade.length][2];
        for (int i = 0; i < grade.length; i++) {
            s[i] = grade[i];
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i][0] + s[i][1] < s[j][0] + s[j][1]) {
                    int[] temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                } else if (s[i][0] + s[i][1] == s[j][0] + s[j][1]) {
                    if (s[i][0] > s[j][0]) {
                        int[] temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }
        }
        return s;
    }
}