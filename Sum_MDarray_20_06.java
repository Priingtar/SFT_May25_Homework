package Home_work_may25;

public class Sum_MDarray_20_06 {
    public static void main(String args[]) {

        int[][] matrix = {
                {1, 1, 1},
                {1, 3, 3},
                {1, 9, 1}
        };

        //printing the array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        //sum

        int[][] res = new int[matrix.length][1];

        for(int a=0; a<matrix.length; a++){
            int sum = 0;
            for(int b=0; b<matrix[a].length; b++){
                sum += matrix[a][b];
            }
            res[a][0] = sum;
        }
        //result print
        for(int c = 0;c<res.length;c++){
            System.out.println(res[c][0]);
        }








    }

}


